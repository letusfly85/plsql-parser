package br.com.porcelli.parser;


import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


/**
 * Oracle(c) SQL*Plus 11g Parser
 *
 * Copyright (c) 2009-2011 Alexandre Porcelli <alexandre.porcelli@gmail.com>
 *                         Tomi Pakarinen <tomi.pakarinen@iki.fi>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PLSQLParser_SQLPLUSParser extends Parser {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int APPROXIMATE_NUM_LIT=5;
    public static final int ASSIGN_OP=6;
    public static final int ASTERISK=7;
    public static final int AT_SIGN=8;
    public static final int BINDVAR=9;
    public static final int BIT_STRING_LIT=10;
    public static final int CARRET_OPERATOR_PART=11;
    public static final int CHAR_STRING=12;
    public static final int CHAR_STRING_PERL=13;
    public static final int COLON=14;
    public static final int COMMA=15;
    public static final int COMMENT=16;
    public static final int CONCATENATION_OP=17;
    public static final int DELIMITED_ID=18;
    public static final int DOUBLE_ASTERISK=19;
    public static final int DOUBLE_PERIOD=20;
    public static final int EQUALS_OP=21;
    public static final int EXACT_NUM_LIT=22;
    public static final int EXCLAMATION_OPERATOR_PART=23;
    public static final int FOR_NOTATION=24;
    public static final int GREATER_THAN_OP=25;
    public static final int GREATER_THAN_OR_EQUALS_OP=26;
    public static final int HEX_STRING_LIT=27;
    public static final int INTRODUCER=28;
    public static final int LEFT_BRACKET=29;
    public static final int LEFT_PAREN=30;
    public static final int LESS_THAN_OP=31;
    public static final int LESS_THAN_OR_EQUALS_OP=32;
    public static final int MINUS_SIGN=33;
    public static final int NATIONAL_CHAR_STRING_LIT=34;
    public static final int NEWLINE=35;
    public static final int NOT_EQUAL_OP=36;
    public static final int PERCENT=37;
    public static final int PERIOD=38;
    public static final int PLSQL_NON_RESERVED_CONNECT_BY_ROOT=39;
    public static final int PLSQL_NON_RESERVED_ELSIF=40;
    public static final int PLSQL_NON_RESERVED_MODEL=41;
    public static final int PLSQL_NON_RESERVED_PIVOT=42;
    public static final int PLSQL_NON_RESERVED_UNPIVOT=43;
    public static final int PLSQL_NON_RESERVED_USING=44;
    public static final int PLSQL_RESERVED_CLUSTERS=45;
    public static final int PLSQL_RESERVED_COLAUTH=46;
    public static final int PLSQL_RESERVED_COMPRESS=47;
    public static final int PLSQL_RESERVED_CRASH=48;
    public static final int PLSQL_RESERVED_EXCLUSIVE=49;
    public static final int PLSQL_RESERVED_IDENTIFIED=50;
    public static final int PLSQL_RESERVED_IF=51;
    public static final int PLSQL_RESERVED_INDEX=52;
    public static final int PLSQL_RESERVED_INDEXES=53;
    public static final int PLSQL_RESERVED_LOCK=54;
    public static final int PLSQL_RESERVED_MINUS=55;
    public static final int PLSQL_RESERVED_MODE=56;
    public static final int PLSQL_RESERVED_NOCOMPRESS=57;
    public static final int PLSQL_RESERVED_NOWAIT=58;
    public static final int PLSQL_RESERVED_RESOURCE=59;
    public static final int PLSQL_RESERVED_SHARE=60;
    public static final int PLSQL_RESERVED_START=61;
    public static final int PLSQL_RESERVED_TABAUTH=62;
    public static final int PLSQL_RESERVED_VIEWS=63;
    public static final int PLUS_SIGN=64;
    public static final int PROMPT=65;
    public static final int QS_ANGLE=66;
    public static final int QS_BRACE=67;
    public static final int QS_BRACK=68;
    public static final int QS_OTHER=69;
    public static final int QS_OTHER_CH=70;
    public static final int QS_PAREN=71;
    public static final int QUESTION_MARK=72;
    public static final int QUOTE=73;
    public static final int REGULAR_ID=74;
    public static final int RIGHT_BRACKET=75;
    public static final int RIGHT_PAREN=76;
    public static final int SEMICOLON=77;
    public static final int SEPARATOR=78;
    public static final int SIMPLE_LETTER=79;
    public static final int SOLIDUS=80;
    public static final int SPACE=81;
    public static final int SQL92_RESERVED_ALL=82;
    public static final int SQL92_RESERVED_ALTER=83;
    public static final int SQL92_RESERVED_AND=84;
    public static final int SQL92_RESERVED_ANY=85;
    public static final int SQL92_RESERVED_AS=86;
    public static final int SQL92_RESERVED_ASC=87;
    public static final int SQL92_RESERVED_BEGIN=88;
    public static final int SQL92_RESERVED_BETWEEN=89;
    public static final int SQL92_RESERVED_BY=90;
    public static final int SQL92_RESERVED_CASE=91;
    public static final int SQL92_RESERVED_CHECK=92;
    public static final int SQL92_RESERVED_CONNECT=93;
    public static final int SQL92_RESERVED_CREATE=94;
    public static final int SQL92_RESERVED_CURRENT=95;
    public static final int SQL92_RESERVED_CURSOR=96;
    public static final int SQL92_RESERVED_DATE=97;
    public static final int SQL92_RESERVED_DECLARE=98;
    public static final int SQL92_RESERVED_DEFAULT=99;
    public static final int SQL92_RESERVED_DELETE=100;
    public static final int SQL92_RESERVED_DESC=101;
    public static final int SQL92_RESERVED_DISTINCT=102;
    public static final int SQL92_RESERVED_DROP=103;
    public static final int SQL92_RESERVED_ELSE=104;
    public static final int SQL92_RESERVED_END=105;
    public static final int SQL92_RESERVED_EXCEPTION=106;
    public static final int SQL92_RESERVED_EXISTS=107;
    public static final int SQL92_RESERVED_FALSE=108;
    public static final int SQL92_RESERVED_FETCH=109;
    public static final int SQL92_RESERVED_FOR=110;
    public static final int SQL92_RESERVED_FROM=111;
    public static final int SQL92_RESERVED_GOTO=112;
    public static final int SQL92_RESERVED_GRANT=113;
    public static final int SQL92_RESERVED_GROUP=114;
    public static final int SQL92_RESERVED_HAVING=115;
    public static final int SQL92_RESERVED_IN=116;
    public static final int SQL92_RESERVED_INSERT=117;
    public static final int SQL92_RESERVED_INTERSECT=118;
    public static final int SQL92_RESERVED_INTO=119;
    public static final int SQL92_RESERVED_IS=120;
    public static final int SQL92_RESERVED_LIKE=121;
    public static final int SQL92_RESERVED_NOT=122;
    public static final int SQL92_RESERVED_NULL=123;
    public static final int SQL92_RESERVED_OF=124;
    public static final int SQL92_RESERVED_ON=125;
    public static final int SQL92_RESERVED_OPTION=126;
    public static final int SQL92_RESERVED_OR=127;
    public static final int SQL92_RESERVED_ORDER=128;
    public static final int SQL92_RESERVED_OVERLAPS=129;
    public static final int SQL92_RESERVED_PRIOR=130;
    public static final int SQL92_RESERVED_PROCEDURE=131;
    public static final int SQL92_RESERVED_PUBLIC=132;
    public static final int SQL92_RESERVED_REVOKE=133;
    public static final int SQL92_RESERVED_SELECT=134;
    public static final int SQL92_RESERVED_SIZE=135;
    public static final int SQL92_RESERVED_TABLE=136;
    public static final int SQL92_RESERVED_THE=137;
    public static final int SQL92_RESERVED_THEN=138;
    public static final int SQL92_RESERVED_TO=139;
    public static final int SQL92_RESERVED_TRUE=140;
    public static final int SQL92_RESERVED_UNION=141;
    public static final int SQL92_RESERVED_UNIQUE=142;
    public static final int SQL92_RESERVED_UPDATE=143;
    public static final int SQL92_RESERVED_VALUES=144;
    public static final int SQL92_RESERVED_VIEW=145;
    public static final int SQL92_RESERVED_WHEN=146;
    public static final int SQL92_RESERVED_WHERE=147;
    public static final int SQL92_RESERVED_WITH=148;
    public static final int TILDE_OPERATOR_PART=149;
    public static final int UNDERSCORE=150;
    public static final int UNSIGNED_INTEGER=151;
    public static final int VERTICAL_BAR=152;
    public static final int ZV=153;
    public static final int ADD_VK=154;
    public static final int AFTER_EACH_ROW=155;
    public static final int AFTER_STATEMENT=156;
    public static final int AFTER_VK=157;
    public static final int AGENT_VK=158;
    public static final int AGGREGATE_VK=159;
    public static final int ALIAS=160;
    public static final int ALTER_ATTRIBUTE=161;
    public static final int ALTER_COLLECTION=162;
    public static final int ALTER_FUNCTION=163;
    public static final int ALTER_METHOD=164;
    public static final int ALTER_METHOD_ELEMENT=165;
    public static final int ALTER_PACKAGE=166;
    public static final int ALTER_PROCEDURE=167;
    public static final int ALTER_SEQUENCE=168;
    public static final int ALTER_TRIGGER=169;
    public static final int ALTER_TYPE=170;
    public static final int ANALYZE_VK=171;
    public static final int ANY_ELEMENT=172;
    public static final int ANY_MODE=173;
    public static final int ARGUMENT=175;
    public static final int ARGUMENTS=176;
    public static final int ASSIGN=177;
    public static final int ASSOCIATE_VK=178;
    public static final int ATTRIBUTE=180;
    public static final int ATTRIBUTES=181;
    public static final int ATTRIBUTE_NAME=182;
    public static final int AT_VK=184;
    public static final int AUDIT_VK=185;
    public static final int AUTHID_VK=186;
    public static final int AUTOMATIC_VK=187;
    public static final int AUTONOMOUS_TRANSACTION_VK=188;
    public static final int AUTO_VK=189;
    public static final int BATCH_VK=190;
    public static final int BEFORE_EACH_ROW=191;
    public static final int BEFORE_STATEMENT=192;
    public static final int BEFORE_VK=193;
    public static final int BFILE_VK=194;
    public static final int BINARY_DOUBLE_VK=195;
    public static final int BINARY_FLOAT_VK=196;
    public static final int BINARY_INTEGER_VK=197;
    public static final int BIT_VK=199;
    public static final int BLOB_VK=200;
    public static final int BLOCK=201;
    public static final int BLOCK_VK=202;
    public static final int BODY=203;
    public static final int BODY_MODE=204;
    public static final int BODY_VK=205;
    public static final int BOOLEAN_VK=206;
    public static final int BOTH_VK=207;
    public static final int BREADTH_VK=208;
    public static final int BULK_VK=209;
    public static final int BYTE_VK=210;
    public static final int CACHE_VK=211;
    public static final int CALL_MODE=212;
    public static final int CALL_VK=213;
    public static final int CANONICAL_VK=214;
    public static final int CASCADE_VK=216;
    public static final int CASCATED_ELEMENT=217;
    public static final int CAST_VK=218;
    public static final int CHARACTER_VK=219;
    public static final int CHAR_CS_VK=220;
    public static final int CHAR_SET_NAME=221;
    public static final int CHAR_VK=224;
    public static final int CHR_VK=225;
    public static final int CLOB_VK=226;
    public static final int CLOSE_VK=227;
    public static final int CLUSTER_VK=228;
    public static final int COLLECTION_MODE=229;
    public static final int COLLECTION_NAME=230;
    public static final int COLLECT_VK=231;
    public static final int COLUMNS=233;
    public static final int COLUMN_NAME=234;
    public static final int COMMENT_VK=236;
    public static final int COMMITTED_VK=237;
    public static final int COMMIT_VK=238;
    public static final int COMPATIBILITY_VK=239;
    public static final int COMPILATION_UNIT=240;
    public static final int COMPILER_PARAMETER=241;
    public static final int COMPILE_VK=242;
    public static final int COMPOUND_DML=243;
    public static final int COMPOUND_VK=244;
    public static final int CONDITIONAL_INSERT=246;
    public static final int CONSTANT_VK=247;
    public static final int CONSTRAINT_NAME=248;
    public static final int CONSTRUCTOR_SPEC=249;
    public static final int CONSTRUCTOR_VK=250;
    public static final int CONTENT_VK=251;
    public static final int CONTEXT_VK=252;
    public static final int CONTINUE_VK=253;
    public static final int CONVERT_VK=254;
    public static final int CORRUPT_XID_ALL_VK=255;
    public static final int CORRUPT_XID_VK=256;
    public static final int COST_CLASS_NAME=257;
    public static final int COST_VK=258;
    public static final int COUNT_VK=259;
    public static final int CREATE_FUNCTION=260;
    public static final int CREATE_PACKAGE_BODY=261;
    public static final int CREATE_PACKAGE_SPEC=262;
    public static final int CREATE_PROCEDURE=263;
    public static final int CREATE_SEQUENCE=264;
    public static final int CREATE_TRIGGER=265;
    public static final int CREATE_TYPE_BODY=266;
    public static final int CREATE_TYPE_SPEC=267;
    public static final int CROSS_VK=268;
    public static final int CUBE_VK=269;
    public static final int CURRENT_USER_VK=270;
    public static final int CURRENT_VK=271;
    public static final int CURSOR_BASED_FOR=272;
    public static final int CURSOR_DECLARE=273;
    public static final int CURSOR_NAME=274;
    public static final int CUSTOMDATUM_VK=275;
    public static final int CUSTOM_TYPE=276;
    public static final int CYCLE_VK=277;
    public static final int C_VK=278;
    public static final int DATABASE_VK=279;
    public static final int DATETIME_OP=280;
    public static final int DAY_VK=281;
    public static final int DBTIMEZONE_VK=282;
    public static final int DB_ROLE_CHANGE_VK=283;
    public static final int DDL_VK=284;
    public static final int DEBUG_VK=285;
    public static final int DECIMAL_VK=286;
    public static final int DECOMPOSE_VK=287;
    public static final int DECREMENT_VK=288;
    public static final int DEC_VK=289;
    public static final int DEFAULTS_VK=290;
    public static final int DEFAULT_VALUE=291;
    public static final int DEFERRED_VK=292;
    public static final int DEFINER_VK=293;
    public static final int DENSE_RANK_VK=295;
    public static final int DEPENDENT_HANDLING=296;
    public static final int DEPTH_VK=297;
    public static final int DETERMINISTIC_VK=298;
    public static final int DIMENSION_VK=299;
    public static final int DIRECT_MODE=300;
    public static final int DISABLE_VK=301;
    public static final int DISASSOCIATE_VK=302;
    public static final int DML_EVENT=303;
    public static final int DML_EVENT_ELEMENT=304;
    public static final int DOCUMENT_VK=305;
    public static final int DOT_ASTERISK=306;
    public static final int DOUBLE_VK=307;
    public static final int DROP_FUNCTION=308;
    public static final int DROP_PACKAGE=309;
    public static final int DROP_PROCEDURE=310;
    public static final int DROP_SEQUENCE=311;
    public static final int DROP_TRIGGER=312;
    public static final int DROP_TYPE=313;
    public static final int DSINTERVAL_UNCONSTRAINED_VK=314;
    public static final int DYNAMIC_RETURN=315;
    public static final int ELEMENT=316;
    public static final int ELEMENTS_MODE=317;
    public static final int ELEMENT_SPEC=318;
    public static final int ENABLE_VK=319;
    public static final int ENCODING_VK=320;
    public static final int ENTITYESCAPING_VK=321;
    public static final int EVALNAME_VK=323;
    public static final int EXCEPTIONS_VK=325;
    public static final int EXCEPTION_DECLARE=326;
    public static final int EXCEPTION_INIT_VK=327;
    public static final int EXCEPTION_NAME=328;
    public static final int EXCLUDE_VK=330;
    public static final int EXECUTE_VK=331;
    public static final int EXIT_VK=332;
    public static final int EXPLAIN_STATEMENT=333;
    public static final int EXPR=334;
    public static final int EXPR_LIST=335;
    public static final int EXTERNAL_MODE=336;
    public static final int EXTERNAL_VK=337;
    public static final int EXTRACT_VK=338;
    public static final int FACTORING=339;
    public static final int FIELDS=340;
    public static final int FIELD_SPEC=341;
    public static final int FINAL_VK=342;
    public static final int FIRST_VALUE_VK=343;
    public static final int FIRST_VK=344;
    public static final int FLOAT_VK=345;
    public static final int FOLLOWING_VK=346;
    public static final int FOLLOWS_VK=347;
    public static final int FORALL_VK=348;
    public static final int FORCE_VK=349;
    public static final int FOR_EACH_ROW=350;
    public static final int FOR_LOOP=351;
    public static final int FOR_MULTI_COLUMN=352;
    public static final int FOR_SINGLE_COLUMN=353;
    public static final int FULL_VK=354;
    public static final int FUNCTION_ENABLING_OVER=355;
    public static final int FUNCTION_ENABLING_USING=356;
    public static final int FUNCTION_ENABLING_WITHIN_OR_OVER=357;
    public static final int FUNCTION_NAME=358;
    public static final int FUNCTION_SPEC=359;
    public static final int GROUPING_VK=362;
    public static final int GROUPIN_SET=363;
    public static final int GROUP_BY_ELEMENT=364;
    public static final int HASH_VK=365;
    public static final int HIDE_VK=366;
    public static final int HIERARCHICAL=367;
    public static final int HOSTED_VARIABLE=368;
    public static final int HOSTED_VARIABLE_NAME=369;
    public static final int HOSTED_VARIABLE_ROUTINE_CALL=370;
    public static final int HOUR_VK=371;
    public static final int ID=372;
    public static final int IGNORE_VK=373;
    public static final int IMMEDIATE_VK=374;
    public static final int IMPLEMENTATION_TYPE_NAME=375;
    public static final int INCLUDE_VK=376;
    public static final int INCLUDING_VK=377;
    public static final int INCREMENT_VK=378;
    public static final int INDENT_VK=379;
    public static final int INDEXED_BY=380;
    public static final int INDEXED_FOR=381;
    public static final int INDEX_NAME=382;
    public static final int INDICES_BOUND=383;
    public static final int INLINE_VK=384;
    public static final int INNER_VK=385;
    public static final int INOUT_VK=386;
    public static final int INSTANTIABLE_VK=387;
    public static final int INSTEAD_VK=388;
    public static final int INTEGER_VK=389;
    public static final int INTERVAL_DATATYPE=390;
    public static final int INT_VK=392;
    public static final int INVALIDATE_VK=393;
    public static final int ISOLATION_VK=394;
    public static final int IS_A_SET=395;
    public static final int IS_EMPTY=396;
    public static final int IS_INFINITE=397;
    public static final int IS_NAN=398;
    public static final int IS_NOT_A_SET=399;
    public static final int IS_NOT_EMPTY=400;
    public static final int IS_NOT_INFINITE=401;
    public static final int IS_NOT_NAN=402;
    public static final int IS_NOT_NULL=403;
    public static final int IS_NOT_OF_TYPE=404;
    public static final int IS_NOT_PRESENT=405;
    public static final int IS_NULL=406;
    public static final int IS_OF_TYPE=407;
    public static final int IS_PRESENT=408;
    public static final int ITERATE_VK=409;
    public static final int JAVA_VK=410;
    public static final int JOIN_DEF=411;
    public static final int KEEP_VK=412;
    public static final int LABEL_DECLARE=413;
    public static final int LABEL_NAME=414;
    public static final int LANGUAGE_VK=415;
    public static final int LAST_VALUE_VK=416;
    public static final int LAST_VK=417;
    public static final int LEADING_VK=418;
    public static final int LEFT_VK=421;
    public static final int LIBRARY_VK=424;
    public static final int LIKE2_VK=425;
    public static final int LIKE4_VK=426;
    public static final int LIKEC_VK=427;
    public static final int LIMIT_VK=428;
    public static final int LINK_NAME=429;
    public static final int LOCAL_VK=430;
    public static final int LOCK_TABLE_ELEMENT=431;
    public static final int LOGIC_EXPR=432;
    public static final int LOGOFF_VK=433;
    public static final int LOGON_VK=434;
    public static final int LOG_VK=435;
    public static final int LONG_VK=436;
    public static final int LOOP_VK=437;
    public static final int MAIN_MODEL=438;
    public static final int MAIN_MODEL_NAME=439;
    public static final int MAP_VK=440;
    public static final int MAXVALUE_VK=441;
    public static final int MEASURES_VK=442;
    public static final int MEMBER_VK=443;
    public static final int MERGE_INSERT=444;
    public static final int MERGE_UPDATE=445;
    public static final int MERGE_VK=446;
    public static final int MINUTE_VK=448;
    public static final int MINVALUE_VK=449;
    public static final int MLSLABEL_VK=450;
    public static final int MODEL_COLUMN=451;
    public static final int MODEL_COLUMNS=452;
    public static final int MODEL_EXPRESSION=453;
    public static final int MODEL_RULE=454;
    public static final int MODEL_RULES=455;
    public static final int MODIFIER=456;
    public static final int MODIFY_VK=457;
    public static final int MONTH_VK=458;
    public static final int MULTI_TABLE_MODE=459;
    public static final int NAME_VK=460;
    public static final int NATIVE_DATATYPE=462;
    public static final int NATURALN_VK=463;
    public static final int NATURAL_VK=464;
    public static final int NAV_VK=465;
    public static final int NCHAR_CS_VK=466;
    public static final int NCHAR_VK=467;
    public static final int NCLOB_VK=468;
    public static final int NESTED_TABLE_TYPE_DEF=469;
    public static final int NESTED_VK=470;
    public static final int NEW_VK=471;
    public static final int NOAUDIT_VK=472;
    public static final int NOCACHE_VK=473;
    public static final int NOCOPY_VK=474;
    public static final int NOCYCLE_VK=475;
    public static final int NOENTITYESCAPING_VK=476;
    public static final int NOMAXVALUE_VK=477;
    public static final int NOMINVALUE_VK=478;
    public static final int NON_DML=479;
    public static final int NOORDER_VK=480;
    public static final int NOSCHEMACHECK_VK=481;
    public static final int NOT_BETWEEN=482;
    public static final int NOT_IN=484;
    public static final int NOT_LIKE=485;
    public static final int NO_VK=486;
    public static final int NULLS_VK=487;
    public static final int NUMBER_VK=488;
    public static final int NUMERIC_VK=489;
    public static final int NVARCHAR2_VK=490;
    public static final int OBJECT_AS=491;
    public static final int OBJECT_MEMBERS=492;
    public static final int OBJECT_TYPE_DEF=493;
    public static final int OBJECT_VK=494;
    public static final int OFF_VK=495;
    public static final int OLD_VK=496;
    public static final int ONLY_VK=497;
    public static final int OPEN_VK=498;
    public static final int ORADATA_VK=499;
    public static final int ORDER_BY_ELEMENT=500;
    public static final int ORDER_BY_ELEMENTS=501;
    public static final int ORDINALITY_VK=502;
    public static final int OUT_VK=503;
    public static final int OVERRIDING_VK=504;
    public static final int OVER_VK=505;
    public static final int PACKAGE_NAME=506;
    public static final int PACKAGE_VK=507;
    public static final int PARALLEL_ENABLE_VK=508;
    public static final int PARAMETER=509;
    public static final int PARAMETERS=510;
    public static final int PARAMETERS_VK=511;
    public static final int PARAMETER_NAME=512;
    public static final int PARENT_VK=513;
    public static final int PARTITION_VK=514;
    public static final int PASSING_VK=515;
    public static final int PERCENT_FOUND_VK=517;
    public static final int PERCENT_ISOPEN_VK=518;
    public static final int PERCENT_NOTFOUND_VK=519;
    public static final int PERCENT_ROWCOUNT_VK=520;
    public static final int PERCENT_ROWTYPE_VK=521;
    public static final int PERCENT_TYPE_VK=522;
    public static final int PIPELINED_VK=524;
    public static final int PIVOT_ALIAS=525;
    public static final int PIVOT_ELEMENT=526;
    public static final int PIVOT_IN_ELEMENT=527;
    public static final int PIVOT_VK=528;
    public static final int PLS_INTEGER_VK=543;
    public static final int POSITIVEN_VK=545;
    public static final int POSITIVE_VK=546;
    public static final int PRAGMA_DECLARE=547;
    public static final int PRAGMA_VK=548;
    public static final int PRECEDING_VK=549;
    public static final int PRECISION=550;
    public static final int PRECISION_VK=551;
    public static final int PREDICTION_FUNCTION=552;
    public static final int PROCEDURE_NAME=553;
    public static final int PROCEDURE_SPEC=554;
    public static final int QUERY_NAME=556;
    public static final int RAISE_VK=557;
    public static final int RANGE_VK=558;
    public static final int RAW_VK=559;
    public static final int READ_VK=560;
    public static final int REAL_VK=561;
    public static final int RECORD_NAME=562;
    public static final int RECORD_TYPE_DECLARE=563;
    public static final int RECORD_VAR_DECLARE=564;
    public static final int REFERENCE_MODEL_NAME=565;
    public static final int REFERENCE_VK=566;
    public static final int REFERENCING_VK=567;
    public static final int REF_VK=568;
    public static final int REJECT_VK=570;
    public static final int RELIES_ON_VK=571;
    public static final int RENAME_VK=572;
    public static final int REPLACE_VK=573;
    public static final int RESPECT_VK=574;
    public static final int RESTRICT_REFERENCES_VK=575;
    public static final int RESULT_CACHE_VK=576;
    public static final int RETURN_VK=577;
    public static final int REUSE_VK=578;
    public static final int REVERSE_VK=579;
    public static final int RIGHT_VK=582;
    public static final int ROLLBACK_SEGMENT_NAME=583;
    public static final int ROLLBACK_VK=584;
    public static final int ROLLUP_VK=585;
    public static final int ROUTINE_CALL=586;
    public static final int ROUTINE_NAME=587;
    public static final int ROWID_VK=588;
    public static final int ROWS_VK=589;
    public static final int ROW_VK=590;
    public static final int RULES_VK=591;
    public static final int SAMPLE_VK=592;
    public static final int SAVEPOINT_NAME=593;
    public static final int SAVEPOINT_VK=594;
    public static final int SCHEMACHECK_VK=595;
    public static final int SCHEMA_NAME=596;
    public static final int SCHEMA_VK=597;
    public static final int SCN_VK=598;
    public static final int SEARCHED_CASE=599;
    public static final int SEARCH_VK=600;
    public static final int SECOND_VK=601;
    public static final int SEED_VK=602;
    public static final int SELECTED_TABLEVIEW=603;
    public static final int SELECT_BASED_FOR=604;
    public static final int SELECT_ITEM=605;
    public static final int SELECT_LIST=606;
    public static final int SELECT_MODE=607;
    public static final int SELECT_STATEMENT=608;
    public static final int SELF_VK=609;
    public static final int SEQUENCE_NAME=611;
    public static final int SEQUENCE_VK=612;
    public static final int SEQUENTIAL_VK=613;
    public static final int SERIALIZABLE_VK=614;
    public static final int SERIALLY_REUSABLE_VK=615;
    public static final int SERVERERROR_VK=616;
    public static final int SESSIONTIMEZONE_VK=617;
    public static final int SET_CONSTRAINT=618;
    public static final int SET_SERVEROUTPUT=619;
    public static final int SET_TRANSACTION=620;
    public static final int SET_VK=621;
    public static final int SHOW_VK=622;
    public static final int SHUTDOWN_VK=623;
    public static final int SIBLINGS_VK=624;
    public static final int SIGNTYPE_VK=625;
    public static final int SIMPLE_BOUND=626;
    public static final int SIMPLE_CASE=627;
    public static final int SIMPLE_DML=628;
    public static final int SIMPLE_INTEGER_VK=629;
    public static final int SINGLE_TABLE_MODE=630;
    public static final int SINGLE_VK=631;
    public static final int SKIP_VK=632;
    public static final int SMALLINT_VK=633;
    public static final int SOME_VK=635;
    public static final int SPECIFICATION_VK=636;
    public static final int SQLDATA_VK=701;
    public static final int SQL_SCRIPT=702;
    public static final int STANDALONE_VK=703;
    public static final int STANDARD_FUNCTION=704;
    public static final int STARTUP_VK=705;
    public static final int STATEMENTS=706;
    public static final int STATIC_RETURNING=707;
    public static final int STATIC_VK=708;
    public static final int STATISTICS_VK=709;
    public static final int STREAMING_CLAUSE=710;
    public static final int STRING_VK=711;
    public static final int SUBMULTISET_VK=712;
    public static final int SUBPARTITION_VK=713;
    public static final int SUBQUERY=714;
    public static final int SUBTYPE_DECLARE=715;
    public static final int SUSPEND_VK=716;
    public static final int TABLEVIEW_NAME=717;
    public static final int TABLE_ELEMENT=718;
    public static final int TABLE_EXPRESSION=719;
    public static final int TABLE_REF=720;
    public static final int TABLE_REF_ELEMENT=721;
    public static final int TABLE_TYPE_DECLARE=722;
    public static final int TABLE_VAR_DECLARE=723;
    public static final int TABLE_VAR_NAME=724;
    public static final int THREE_DOTS=725;
    public static final int TIMESTAMP_LTZ_UNCONSTRAINED_VK=726;
    public static final int TIMESTAMP_TZ_UNCONSTRAINED_VK=727;
    public static final int TIMESTAMP_UNCONSTRAINED_VK=728;
    public static final int TIMESTAMP_VK=729;
    public static final int TIMEZONE_ABBR_VK=730;
    public static final int TIMEZONE_HOUR_VK=731;
    public static final int TIMEZONE_MINUTE_VK=732;
    public static final int TIMEZONE_REGION_VK=733;
    public static final int TIME_VK=734;
    public static final int TRAILING_VK=735;
    public static final int TRANSLATE_VK=736;
    public static final int TREAT_VK=737;
    public static final int TRIGGER_NAME=738;
    public static final int TRIM_VK=739;
    public static final int TRUNCATE_VK=740;
    public static final int TYPE_BODY_ELEMENTS=741;
    public static final int TYPE_NAME=742;
    public static final int TYPE_VK=743;
    public static final int UNARY_OPERATOR=744;
    public static final int UNBOUNDED_VK=745;
    public static final int UNDER_VK=746;
    public static final int UNLIMITED_VK=747;
    public static final int UNPIVOT_IN_ELEMENT=748;
    public static final int UNPIVOT_VK=749;
    public static final int UNTIL_VK=751;
    public static final int UPDATED_VK=752;
    public static final int UPSERT_VK=753;
    public static final int UROWID_VK=754;
    public static final int USING_MODE=755;
    public static final int VALIDATE_VK=756;
    public static final int VALUES_BOUND=757;
    public static final int VALUE_VK=758;
    public static final int VARCHAR2_VK=759;
    public static final int VARCHAR_VK=760;
    public static final int VARIABLE_DECLARE=761;
    public static final int VARIABLE_NAME=762;
    public static final int VARR_ARRAY_DEF=763;
    public static final int VECTOR_EXPR=764;
    public static final int VERSIONS_VK=765;
    public static final int VERSION_VK=766;
    public static final int WAIT_VK=768;
    public static final int WELLFORMED_VK=769;
    public static final int WHILE_LOOP=770;
    public static final int WITHIN_VK=771;
    public static final int WORK_VK=772;
    public static final int WRITE_VK=773;
    public static final int XMLAGG_VK=774;
    public static final int XMLATTRIBUTES_VK=775;
    public static final int XMLCAST_VK=776;
    public static final int XMLCOLATTVAL_VK=777;
    public static final int XMLELEMENT_VK=778;
    public static final int XMLEXISTS_VK=779;
    public static final int XMLFOREST_VK=780;
    public static final int XMLNAMESPACES_VK=781;
    public static final int XMLPARSE_VK=782;
    public static final int XMLPI_VK=783;
    public static final int XMLQUERY_VK=784;
    public static final int XMLROOT_VK=785;
    public static final int XMLSERIALIZE_VK=786;
    public static final int XMLTABLE_VK=787;
    public static final int XML_ALIAS=788;
    public static final int XML_COLUMN=789;
    public static final int XML_COLUMN_NAME=790;
    public static final int XML_ELEMENT=791;
    public static final int XML_VK=792;
    public static final int YEAR_VK=793;
    public static final int YES_VK=794;
    public static final int YMINTERVAL_UNCONSTRAINED_VK=795;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public PLSQLParser gPLSQLParser;
    public PLSQLParser gParent;


    public PLSQLParser_SQLPLUSParser(TokenStream input, PLSQLParser gPLSQLParser) {
        this(input, new RecognizerSharedState(), gPLSQLParser);
    }
    public PLSQLParser_SQLPLUSParser(TokenStream input, RecognizerSharedState state, PLSQLParser gPLSQLParser) {
        super(input, state);
        this.gPLSQLParser = gPLSQLParser;
        gParent = gPLSQLParser;
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PLSQLParser.tokenNames; }
    public String getGrammarFileName() { return "SQLPLUSParser.g"; }


    public static class sql_plus_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_plus_command"
    // SQLPLUSParser.g:25:1: sql_plus_command : ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command ) ( SEMICOLON )? ;
    public final sql_plus_command_return sql_plus_command() throws RecognitionException {
        sql_plus_command_return retval = new sql_plus_command_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SOLIDUS1=null;
        Token SEMICOLON6=null;
        whenever_command_return whenever_command2 =null;

        exit_command_return exit_command3 =null;

        prompt_command_return prompt_command4 =null;

        set_command_return set_command5 =null;


        Object SOLIDUS1_tree=null;
        Object SEMICOLON6_tree=null;

        try {
            // SQLPLUSParser.g:26:5: ( ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command ) ( SEMICOLON )? )
            // SQLPLUSParser.g:26:10: ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command ) ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();


            // SQLPLUSParser.g:26:10: ( SOLIDUS !| whenever_command | exit_command | prompt_command | set_command )
            int alt1=5;
            switch ( input.LA(1) ) {
            case SOLIDUS:
                {
                alt1=1;
                }
                break;
            case REGULAR_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==PROMPT||LA1_2==SEMICOLON||LA1_2==SOLIDUS||LA1_2==SQL92_RESERVED_ALTER||LA1_2==SQL92_RESERVED_CREATE||LA1_2==SQL92_RESERVED_DROP||LA1_2==SQL92_RESERVED_PROCEDURE) ) {
                    alt1=3;
                }
                else if ( (LA1_2==REGULAR_ID) ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5==EOF||LA1_5==DELIMITED_ID||LA1_5==INTRODUCER||LA1_5==PROMPT||LA1_5==SEMICOLON||LA1_5==SOLIDUS||LA1_5==SQL92_RESERVED_ALTER||LA1_5==SQL92_RESERVED_CREATE||LA1_5==SQL92_RESERVED_DROP||LA1_5==SQL92_RESERVED_PROCEDURE) ) {
                        alt1=3;
                    }
                    else if ( (LA1_5==REGULAR_ID) ) {
                        int LA1_6 = input.LA(4);

                        if ( (LA1_6==REGULAR_ID) ) {
                            alt1=2;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("exit"))) ) {
                            alt1=3;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("set"))) ) {
                            alt1=5;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 6, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA1_5==CHAR_STRING||LA1_5==EXACT_NUM_LIT||LA1_5==SQL92_RESERVED_ON) && ((input.LT(1).getText().equalsIgnoreCase("set")))) {
                        alt1=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case PROMPT:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // SQLPLUSParser.g:26:11: SOLIDUS !
                    {
                    SOLIDUS1=(Token)match(input,SOLIDUS,FOLLOW_SOLIDUS_in_sql_plus_command37); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // SQLPLUSParser.g:26:20: whenever_command
                    {
                    pushFollow(FOLLOW_whenever_command_in_sql_plus_command40);
                    whenever_command2=whenever_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenever_command2.getTree());

                    }
                    break;
                case 3 :
                    // SQLPLUSParser.g:26:37: exit_command
                    {
                    pushFollow(FOLLOW_exit_command_in_sql_plus_command42);
                    exit_command3=exit_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exit_command3.getTree());

                    }
                    break;
                case 4 :
                    // SQLPLUSParser.g:26:50: prompt_command
                    {
                    pushFollow(FOLLOW_prompt_command_in_sql_plus_command44);
                    prompt_command4=prompt_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prompt_command4.getTree());

                    }
                    break;
                case 5 :
                    // SQLPLUSParser.g:26:65: set_command
                    {
                    pushFollow(FOLLOW_set_command_in_sql_plus_command46);
                    set_command5=set_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, set_command5.getTree());

                    }
                    break;

            }


            // SQLPLUSParser.g:26:78: ( SEMICOLON )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SEMICOLON) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // SQLPLUSParser.g:26:78: SEMICOLON
                    {
                    SEMICOLON6=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sql_plus_command49); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON6_tree = 
                    (Object)adaptor.create(SEMICOLON6)
                    ;
                    adaptor.addChild(root_0, SEMICOLON6_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_plus_command"


    public static class whenever_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whenever_command"
    // SQLPLUSParser.g:29:1: whenever_command : whenever_key ^ ( sqlerror_key | oserror_key ) ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) ) ;
    public final whenever_command_return whenever_command() throws RecognitionException {
        whenever_command_return retval = new whenever_command_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.whenever_key_return whenever_key7 =null;

        PLSQLParser_PLSQLKeys.sqlerror_key_return sqlerror_key8 =null;

        PLSQLParser_PLSQLKeys.oserror_key_return oserror_key9 =null;

        PLSQLParser_PLSQLKeys.exit_key_return exit_key10 =null;

        PLSQLParser_PLSQLKeys.success_key_return success_key11 =null;

        PLSQLParser_PLSQLKeys.failure_key_return failure_key12 =null;

        PLSQLParser_PLSQLKeys.warning_key_return warning_key13 =null;

        PLSQLParser_PLSQLKeys.commit_key_return commit_key14 =null;

        PLSQLParser_PLSQLKeys.rollback_key_return rollback_key15 =null;

        PLSQLParser_PLSQLKeys.continue_key_return continue_key16 =null;

        PLSQLParser_PLSQLKeys.commit_key_return commit_key17 =null;

        PLSQLParser_PLSQLKeys.rollback_key_return rollback_key18 =null;

        PLSQLParser_PLSQLKeys.none_key_return none_key19 =null;



        try {
            // SQLPLUSParser.g:30:5: ( whenever_key ^ ( sqlerror_key | oserror_key ) ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) ) )
            // SQLPLUSParser.g:30:10: whenever_key ^ ( sqlerror_key | oserror_key ) ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_whenever_key_in_whenever_command70);
            whenever_key7=gPLSQLParser.whenever_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(whenever_key7.getTree(), root_0);

            // SQLPLUSParser.g:30:24: ( sqlerror_key | oserror_key )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==REGULAR_ID) ) {
                int LA3_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("sqlerror"))) ) {
                    alt3=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("oserror"))) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // SQLPLUSParser.g:30:25: sqlerror_key
                    {
                    pushFollow(FOLLOW_sqlerror_key_in_whenever_command74);
                    sqlerror_key8=gPLSQLParser.sqlerror_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqlerror_key8.getTree());

                    }
                    break;
                case 2 :
                    // SQLPLUSParser.g:30:38: oserror_key
                    {
                    pushFollow(FOLLOW_oserror_key_in_whenever_command76);
                    oserror_key9=gPLSQLParser.oserror_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oserror_key9.getTree());

                    }
                    break;

            }


            // SQLPLUSParser.g:30:51: ( exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key ) | continue_key ( commit_key | rollback_key | none_key ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==REGULAR_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==REGULAR_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||LA7_2==PROMPT||LA7_2==SEMICOLON||LA7_2==SOLIDUS||LA7_2==SQL92_RESERVED_ALTER||LA7_2==SQL92_RESERVED_CREATE||LA7_2==SQL92_RESERVED_DROP||LA7_2==SQL92_RESERVED_PROCEDURE) && ((input.LT(1).getText().equalsIgnoreCase("continue")))) {
                        alt7=2;
                    }
                    else if ( (LA7_2==REGULAR_ID) ) {
                        int LA7_4 = input.LA(4);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("exit"))) ) {
                            alt7=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("continue"))) ) {
                            alt7=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // SQLPLUSParser.g:30:52: exit_key ( success_key | failure_key | warning_key ) ( commit_key | rollback_key )
                    {
                    pushFollow(FOLLOW_exit_key_in_whenever_command80);
                    exit_key10=gPLSQLParser.exit_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exit_key10.getTree());

                    // SQLPLUSParser.g:30:61: ( success_key | failure_key | warning_key )
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==REGULAR_ID) ) {
                        int LA4_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("success"))) ) {
                            alt4=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("failure"))) ) {
                            alt4=2;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("warning"))) ) {
                            alt4=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }
                    switch (alt4) {
                        case 1 :
                            // SQLPLUSParser.g:30:62: success_key
                            {
                            pushFollow(FOLLOW_success_key_in_whenever_command83);
                            success_key11=gPLSQLParser.success_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, success_key11.getTree());

                            }
                            break;
                        case 2 :
                            // SQLPLUSParser.g:30:74: failure_key
                            {
                            pushFollow(FOLLOW_failure_key_in_whenever_command85);
                            failure_key12=gPLSQLParser.failure_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, failure_key12.getTree());

                            }
                            break;
                        case 3 :
                            // SQLPLUSParser.g:30:86: warning_key
                            {
                            pushFollow(FOLLOW_warning_key_in_whenever_command87);
                            warning_key13=gPLSQLParser.warning_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, warning_key13.getTree());

                            }
                            break;

                    }


                    // SQLPLUSParser.g:30:99: ( commit_key | rollback_key )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("rollback"))||(input.LT(1).getText().equalsIgnoreCase("commit"))))) {
                        int LA5_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("commit"))) ) {
                            alt5=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("rollback"))) ) {
                            alt5=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // SQLPLUSParser.g:30:100: commit_key
                            {
                            pushFollow(FOLLOW_commit_key_in_whenever_command91);
                            commit_key14=gPLSQLParser.commit_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, commit_key14.getTree());

                            }
                            break;
                        case 2 :
                            // SQLPLUSParser.g:30:111: rollback_key
                            {
                            pushFollow(FOLLOW_rollback_key_in_whenever_command93);
                            rollback_key15=gPLSQLParser.rollback_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rollback_key15.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // SQLPLUSParser.g:30:127: continue_key ( commit_key | rollback_key | none_key )
                    {
                    pushFollow(FOLLOW_continue_key_in_whenever_command98);
                    continue_key16=gPLSQLParser.continue_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continue_key16.getTree());

                    // SQLPLUSParser.g:30:140: ( commit_key | rollback_key | none_key )
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("none"))||(input.LT(1).getText().equalsIgnoreCase("rollback"))||(input.LT(1).getText().equalsIgnoreCase("commit"))))) {
                        int LA6_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("commit"))) ) {
                            alt6=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("rollback"))) ) {
                            alt6=2;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("none"))) ) {
                            alt6=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }
                    switch (alt6) {
                        case 1 :
                            // SQLPLUSParser.g:30:141: commit_key
                            {
                            pushFollow(FOLLOW_commit_key_in_whenever_command101);
                            commit_key17=gPLSQLParser.commit_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, commit_key17.getTree());

                            }
                            break;
                        case 2 :
                            // SQLPLUSParser.g:30:152: rollback_key
                            {
                            pushFollow(FOLLOW_rollback_key_in_whenever_command103);
                            rollback_key18=gPLSQLParser.rollback_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, rollback_key18.getTree());

                            }
                            break;
                        case 3 :
                            // SQLPLUSParser.g:30:165: none_key
                            {
                            pushFollow(FOLLOW_none_key_in_whenever_command105);
                            none_key19=gPLSQLParser.none_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, none_key19.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whenever_command"


    public static class set_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "set_command"
    // SQLPLUSParser.g:33:1: set_command : set_key ^ REGULAR_ID ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID ) ;
    public final set_command_return set_command() throws RecognitionException {
        set_command_return retval = new set_command_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REGULAR_ID21=null;
        Token CHAR_STRING22=null;
        Token EXACT_NUM_LIT25=null;
        Token REGULAR_ID26=null;
        PLSQLParser_PLSQLKeys.set_key_return set_key20 =null;

        PLSQLParser_PLSQLKeys.on_key_return on_key23 =null;

        PLSQLParser_PLSQLKeys.off_key_return off_key24 =null;


        Object REGULAR_ID21_tree=null;
        Object CHAR_STRING22_tree=null;
        Object EXACT_NUM_LIT25_tree=null;
        Object REGULAR_ID26_tree=null;

        try {
            // SQLPLUSParser.g:34:5: ( set_key ^ REGULAR_ID ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID ) )
            // SQLPLUSParser.g:34:10: set_key ^ REGULAR_ID ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_set_key_in_set_command127);
            set_key20=gPLSQLParser.set_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(set_key20.getTree(), root_0);

            REGULAR_ID21=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_set_command130); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REGULAR_ID21_tree = 
            (Object)adaptor.create(REGULAR_ID21)
            ;
            adaptor.addChild(root_0, REGULAR_ID21_tree);
            }

            // SQLPLUSParser.g:34:30: ( CHAR_STRING | on_key | off_key | EXACT_NUM_LIT | REGULAR_ID )
            int alt8=5;
            switch ( input.LA(1) ) {
            case CHAR_STRING:
                {
                alt8=1;
                }
                break;
            case SQL92_RESERVED_ON:
                {
                alt8=2;
                }
                break;
            case REGULAR_ID:
                {
                int LA8_3 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("off"))) ) {
                    alt8=3;
                }
                else if ( (true) ) {
                    alt8=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;

                }
                }
                break;
            case EXACT_NUM_LIT:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // SQLPLUSParser.g:34:31: CHAR_STRING
                    {
                    CHAR_STRING22=(Token)match(input,CHAR_STRING,FOLLOW_CHAR_STRING_in_set_command133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR_STRING22_tree = 
                    (Object)adaptor.create(CHAR_STRING22)
                    ;
                    adaptor.addChild(root_0, CHAR_STRING22_tree);
                    }

                    }
                    break;
                case 2 :
                    // SQLPLUSParser.g:34:43: on_key
                    {
                    pushFollow(FOLLOW_on_key_in_set_command135);
                    on_key23=gPLSQLParser.on_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, on_key23.getTree());

                    }
                    break;
                case 3 :
                    // SQLPLUSParser.g:34:50: off_key
                    {
                    pushFollow(FOLLOW_off_key_in_set_command137);
                    off_key24=gPLSQLParser.off_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, off_key24.getTree());

                    }
                    break;
                case 4 :
                    // SQLPLUSParser.g:34:58: EXACT_NUM_LIT
                    {
                    EXACT_NUM_LIT25=(Token)match(input,EXACT_NUM_LIT,FOLLOW_EXACT_NUM_LIT_in_set_command139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXACT_NUM_LIT25_tree = 
                    (Object)adaptor.create(EXACT_NUM_LIT25)
                    ;
                    adaptor.addChild(root_0, EXACT_NUM_LIT25_tree);
                    }

                    }
                    break;
                case 5 :
                    // SQLPLUSParser.g:34:72: REGULAR_ID
                    {
                    REGULAR_ID26=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_set_command141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REGULAR_ID26_tree = 
                    (Object)adaptor.create(REGULAR_ID26)
                    ;
                    adaptor.addChild(root_0, REGULAR_ID26_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "set_command"


    public static class exit_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exit_command"
    // SQLPLUSParser.g:37:1: exit_command : exit_key ;
    public final exit_command_return exit_command() throws RecognitionException {
        exit_command_return retval = new exit_command_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.exit_key_return exit_key27 =null;



        try {
            // SQLPLUSParser.g:38:5: ( exit_key )
            // SQLPLUSParser.g:38:10: exit_key
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_exit_key_in_exit_command162);
            exit_key27=gPLSQLParser.exit_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exit_key27.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exit_command"


    public static class prompt_command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prompt_command"
    // SQLPLUSParser.g:41:1: prompt_command : PROMPT ;
    public final prompt_command_return prompt_command() throws RecognitionException {
        prompt_command_return retval = new prompt_command_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PROMPT28=null;

        Object PROMPT28_tree=null;

        try {
            // SQLPLUSParser.g:42:5: ( PROMPT )
            // SQLPLUSParser.g:42:10: PROMPT
            {
            root_0 = (Object)adaptor.nil();


            PROMPT28=(Token)match(input,PROMPT,FOLLOW_PROMPT_in_prompt_command183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PROMPT28_tree = 
            (Object)adaptor.create(PROMPT28)
            ;
            adaptor.addChild(root_0, PROMPT28_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prompt_command"

    // Delegated rules


 

    public static final BitSet FOLLOW_SOLIDUS_in_sql_plus_command37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_whenever_command_in_sql_plus_command40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_exit_command_in_sql_plus_command42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_prompt_command_in_sql_plus_command44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_command_in_sql_plus_command46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_SEMICOLON_in_sql_plus_command49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenever_key_in_whenever_command70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_sqlerror_key_in_whenever_command74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_oserror_key_in_whenever_command76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_exit_key_in_whenever_command80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_success_key_in_whenever_command83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_failure_key_in_whenever_command85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_warning_key_in_whenever_command87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_commit_key_in_whenever_command91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_key_in_whenever_command93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_key_in_whenever_command98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_commit_key_in_whenever_command101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollback_key_in_whenever_command103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_none_key_in_whenever_command105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_key_in_set_command127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_REGULAR_ID_in_set_command130 = new BitSet(new long[]{0x0000000000401000L,0x2000000000000400L});
    public static final BitSet FOLLOW_CHAR_STRING_in_set_command133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_on_key_in_set_command135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_off_key_in_set_command137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACT_NUM_LIT_in_set_command139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGULAR_ID_in_set_command141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exit_key_in_exit_command162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROMPT_in_prompt_command183 = new BitSet(new long[]{0x0000000000000002L});

}