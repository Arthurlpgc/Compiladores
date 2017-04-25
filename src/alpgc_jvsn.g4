grammar alpgc_jvsn;

identifier: IDENTIFIER;



type:	 		'int''['']'
			|	'boolean'
			|	'int'
			|	identifier;

expression: 	expression('&&'|'+'|'-'|'*'|'<')expression
			|	expression'['expression']'
			|	expression'.''length'
			|	expression'.'identifier'('(expression(','expression)*)?')'
			|	INTEGERLITERAL
			|	'true'
			|	'false'
			|	identifier
			|	'this'
			|	'new''int''['expression']'
			|	'new'identifier'('')'
			|	'!'expression
			|	'('expression')';

statement:		'{'(statement)*'}'
			|	'if''('expression')'statement'else'statement
			|	'while''('expression')'statement
			|	'System.out.println''('expression')'';'
			|	identifier'='expression';'
			|	identifier'['expression']''='expression';';		

method_declaration: 'public'type identifier'('(type identifier(','type identifier)*)?')''{'(var_declaration)*(statement)*'return'expression';''}';

var_declaration:	type identifier';';

class_declaration:	'class'identifier('extends'identifier)?'{'(var_declaration)*(method_declaration)*'}';


main_class:		'class'identifier'{''public''static''void''main''(''String''['']' identifier ')' '{' statement '}' '}';


goal:		main_class (class_declaration)* EOF;

IDENTIFIER:('_'|[A-za-z])(([A-Za-z]|[0-9]|'_')+)*;
INTEGERLITERAL:([1-9][0-9]*)|'0';
SPACES:('\n'|' '|'\r'|'\t')->skip;