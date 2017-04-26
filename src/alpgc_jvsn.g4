grammar alpgc_jvsn;

goal:		main_class (class_declaration)* EOF;
main_class:		'class'identifier'{''public''static''void''main''(''String''['']' identifier ')' '{' statement '}' '}';
formal: type identifier;
method_declaration: 'public'formal'('(formal(','formal)*)?')''{'(var_declaration)*(statement)*'return'expression';''}';
var_declaration:	formal';';
class_declaration:	'class'identifier('extends'identifier)?'{'(var_declaration)*(method_declaration)*'}';
type:	 		'int''['']'
			|	'boolean'
			|	'int'
			|	identifier;
identifier: IDENTIFIER;




statement:		'{'(statement)*'}'
			|	'if''('expression')'statement'else'statement
			|	'while''('expression')'statement
			|	'System.out.println''('expression')'';'
			|	identifier '=' expression ';'
			|	identifier'['expression']''='expression';';		
expression: 	expression('&&'|'+'|'-'|'*'|'<')expression
			|	expression '[' expression ']'
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






IDENTIFIER:('_'|[A-za-z])(([A-Za-z]|[0-9]|'_')+)*;
INTEGERLITERAL:([1-9][0-9]*)|'0';
SPACES:('\n'|' '|'\r'|'\t')->skip;
COMMENT_LINE: '//'(~[\n\r])* ->skip;