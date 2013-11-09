package br.com.porcelli.parser;


import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


/**
 * Oracle(c) PL/SQL 11g Parser  
 *
 * Copyright (c) 2009-2011 Alexandre Porcelli <alexandre.porcelli@gmail.com>
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
public class PLSQLParser_PLSQLCommons extends Parser {
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


    public PLSQLParser_PLSQLCommons(TokenStream input, PLSQLParser gPLSQLParser) {
        this(input, new RecognizerSharedState(), gPLSQLParser);
    }
    public PLSQLParser_PLSQLCommons(TokenStream input, RecognizerSharedState state, PLSQLParser gPLSQLParser) {
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
    public String getGrammarFileName() { return "PLSQLCommons.g"; }


    public static class partition_extension_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partition_extension_clause"
    // PLSQLCommons.g:76:1: partition_extension_clause : ( subpartition_key ^| partition_key ^) ( for_key !)? expression_list ;
    public final partition_extension_clause_return partition_extension_clause() throws RecognitionException {
        partition_extension_clause_return retval = new partition_extension_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.subpartition_key_return subpartition_key1 =null;

        PLSQLParser_PLSQLKeys.partition_key_return partition_key2 =null;

        PLSQLParser_PLSQLKeys.for_key_return for_key3 =null;

        PLSQLParser_PLSQL_DMLParser.expression_list_return expression_list4 =null;



        try {
            // PLSQLCommons.g:77:5: ( ( subpartition_key ^| partition_key ^) ( for_key !)? expression_list )
            // PLSQLCommons.g:77:10: ( subpartition_key ^| partition_key ^) ( for_key !)? expression_list
            {
            root_0 = (Object)adaptor.nil();


            // PLSQLCommons.g:77:10: ( subpartition_key ^| partition_key ^)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("subpartition"))||(input.LT(1).getText().equalsIgnoreCase("partition"))))) {
                int LA1_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("subpartition"))) ) {
                    alt1=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("partition"))) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // PLSQLCommons.g:77:12: subpartition_key ^
                    {
                    pushFollow(FOLLOW_subpartition_key_in_partition_extension_clause367);
                    subpartition_key1=gPLSQLParser.subpartition_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(subpartition_key1.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:77:32: partition_key ^
                    {
                    pushFollow(FOLLOW_partition_key_in_partition_extension_clause372);
                    partition_key2=gPLSQLParser.partition_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(partition_key2.getTree(), root_0);

                    }
                    break;

            }


            // PLSQLCommons.g:78:16: ( for_key !)?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SQL92_RESERVED_FOR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PLSQLCommons.g:78:16: for_key !
                    {
                    pushFollow(FOLLOW_for_key_in_partition_extension_clause386);
                    for_key3=gPLSQLParser.for_key();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_list_in_partition_extension_clause390);
            expression_list4=gPLSQLParser.expression_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_list4.getTree());

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
    // $ANTLR end "partition_extension_clause"


    public static class column_alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_alias"
    // PLSQLCommons.g:81:1: column_alias options {backtrack=true; } : ( ( as_key )? ( id | alias_quoted_string ) -> ^( ALIAS ( id )? ( alias_quoted_string )? ) | as_key );
    public final column_alias_return column_alias() throws RecognitionException {
        column_alias_return retval = new column_alias_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.as_key_return as_key5 =null;

        id_return id6 =null;

        alias_quoted_string_return alias_quoted_string7 =null;

        PLSQLParser_PLSQLKeys.as_key_return as_key8 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_as_key=new RewriteRuleSubtreeStream(adaptor,"rule as_key");
        RewriteRuleSubtreeStream stream_alias_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule alias_quoted_string");
        try {
            // PLSQLCommons.g:86:5: ( ( as_key )? ( id | alias_quoted_string ) -> ^( ALIAS ( id )? ( alias_quoted_string )? ) | as_key )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SQL92_RESERVED_AS) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred1_PLSQLCommons()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA5_0 >= CHAR_STRING && LA5_0 <= CHAR_STRING_PERL)||LA5_0==DELIMITED_ID||LA5_0==INTRODUCER||LA5_0==NATIONAL_CHAR_STRING_LIT||LA5_0==REGULAR_ID) ) {
                alt5=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // PLSQLCommons.g:86:10: ( as_key )? ( id | alias_quoted_string )
                    {
                    // PLSQLCommons.g:86:10: ( as_key )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==SQL92_RESERVED_AS) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // PLSQLCommons.g:86:10: as_key
                            {
                            pushFollow(FOLLOW_as_key_in_column_alias419);
                            as_key5=gPLSQLParser.as_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_as_key.add(as_key5.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:86:18: ( id | alias_quoted_string )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DELIMITED_ID||LA4_0==INTRODUCER||LA4_0==REGULAR_ID) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_0 >= CHAR_STRING && LA4_0 <= CHAR_STRING_PERL)||LA4_0==NATIONAL_CHAR_STRING_LIT) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }
                    switch (alt4) {
                        case 1 :
                            // PLSQLCommons.g:86:19: id
                            {
                            pushFollow(FOLLOW_id_in_column_alias423);
                            id6=id();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_id.add(id6.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:86:22: alias_quoted_string
                            {
                            pushFollow(FOLLOW_alias_quoted_string_in_column_alias425);
                            alias_quoted_string7=alias_quoted_string();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias_quoted_string.add(alias_quoted_string7.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: alias_quoted_string, id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:5: -> ^( ALIAS ( id )? ( alias_quoted_string )? )
                    {
                        // PLSQLCommons.g:87:11: ^( ALIAS ( id )? ( alias_quoted_string )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ALIAS, "ALIAS")
                        , root_1);

                        // PLSQLCommons.g:87:19: ( id )?
                        if ( stream_id.hasNext() ) {
                            adaptor.addChild(root_1, stream_id.nextTree());

                        }
                        stream_id.reset();

                        // PLSQLCommons.g:87:23: ( alias_quoted_string )?
                        if ( stream_alias_quoted_string.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias_quoted_string.nextTree());

                        }
                        stream_alias_quoted_string.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:88:10: as_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_as_key_in_column_alias456);
                    as_key8=gPLSQLParser.as_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, as_key8.getTree());

                    }
                    break;

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
    // $ANTLR end "column_alias"


    public static class table_alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_alias"
    // PLSQLCommons.g:91:1: table_alias : ( id | alias_quoted_string ) -> ^( ALIAS ( id )? ( alias_quoted_string )? ) ;
    public final table_alias_return table_alias() throws RecognitionException {
        table_alias_return retval = new table_alias_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id9 =null;

        alias_quoted_string_return alias_quoted_string10 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_alias_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule alias_quoted_string");
        try {
            // PLSQLCommons.g:92:5: ( ( id | alias_quoted_string ) -> ^( ALIAS ( id )? ( alias_quoted_string )? ) )
            // PLSQLCommons.g:92:10: ( id | alias_quoted_string )
            {
            // PLSQLCommons.g:92:10: ( id | alias_quoted_string )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DELIMITED_ID||LA6_0==INTRODUCER||LA6_0==REGULAR_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= CHAR_STRING && LA6_0 <= CHAR_STRING_PERL)||LA6_0==NATIONAL_CHAR_STRING_LIT) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // PLSQLCommons.g:92:12: id
                    {
                    pushFollow(FOLLOW_id_in_table_alias478);
                    id9=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id9.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:92:17: alias_quoted_string
                    {
                    pushFollow(FOLLOW_alias_quoted_string_in_table_alias482);
                    alias_quoted_string10=alias_quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alias_quoted_string.add(alias_quoted_string10.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id, alias_quoted_string
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:5: -> ^( ALIAS ( id )? ( alias_quoted_string )? )
            {
                // PLSQLCommons.g:93:10: ^( ALIAS ( id )? ( alias_quoted_string )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ALIAS, "ALIAS")
                , root_1);

                // PLSQLCommons.g:93:18: ( id )?
                if ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                // PLSQLCommons.g:93:22: ( alias_quoted_string )?
                if ( stream_alias_quoted_string.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias_quoted_string.nextTree());

                }
                stream_alias_quoted_string.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "table_alias"


    public static class alias_quoted_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alias_quoted_string"
    // PLSQLCommons.g:96:1: alias_quoted_string : quoted_string -> ID[$quoted_string.start] ;
    public final alias_quoted_string_return alias_quoted_string() throws RecognitionException {
        alias_quoted_string_return retval = new alias_quoted_string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        quoted_string_return quoted_string11 =null;


        RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
        try {
            // PLSQLCommons.g:97:5: ( quoted_string -> ID[$quoted_string.start] )
            // PLSQLCommons.g:97:10: quoted_string
            {
            pushFollow(FOLLOW_quoted_string_in_alias_quoted_string522);
            quoted_string11=quoted_string();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string11.getTree());

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:9: -> ID[$quoted_string.start]
            {
                adaptor.addChild(root_0, 
                (Object)adaptor.create(ID, (quoted_string11!=null?((Token)quoted_string11.start):null))
                );

            }


            retval.tree = root_0;
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
    // $ANTLR end "alias_quoted_string"


    public static class where_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where_clause"
    // PLSQLCommons.g:101:1: where_clause : where_key ^ ( current_of_clause | condition_wrapper ) ;
    public final where_clause_return where_clause() throws RecognitionException {
        where_clause_return retval = new where_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.where_key_return where_key12 =null;

        current_of_clause_return current_of_clause13 =null;

        PLSQLParser_PLSQL_DMLParser.condition_wrapper_return condition_wrapper14 =null;



        try {
            // PLSQLCommons.g:102:5: ( where_key ^ ( current_of_clause | condition_wrapper ) )
            // PLSQLCommons.g:102:10: where_key ^ ( current_of_clause | condition_wrapper )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_where_key_in_where_clause555);
            where_key12=gPLSQLParser.where_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(where_key12.getTree(), root_0);

            // PLSQLCommons.g:102:21: ( current_of_clause | condition_wrapper )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==SQL92_RESERVED_CURRENT) ) {
                alt7=1;
            }
            else if ( (LA7_0==APPROXIMATE_NUM_LIT||LA7_0==BINDVAR||(LA7_0 >= CHAR_STRING && LA7_0 <= COLON)||LA7_0==DELIMITED_ID||LA7_0==EXACT_NUM_LIT||LA7_0==INTRODUCER||LA7_0==LEFT_PAREN||(LA7_0 >= MINUS_SIGN && LA7_0 <= NATIONAL_CHAR_STRING_LIT)||LA7_0==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA7_0==PLUS_SIGN||LA7_0==REGULAR_ID||LA7_0==SQL92_RESERVED_ALL||LA7_0==SQL92_RESERVED_ANY||LA7_0==SQL92_RESERVED_CASE||(LA7_0 >= SQL92_RESERVED_CURSOR && LA7_0 <= SQL92_RESERVED_DATE)||LA7_0==SQL92_RESERVED_DEFAULT||LA7_0==SQL92_RESERVED_DISTINCT||(LA7_0 >= SQL92_RESERVED_EXISTS && LA7_0 <= SQL92_RESERVED_FALSE)||(LA7_0 >= SQL92_RESERVED_NOT && LA7_0 <= SQL92_RESERVED_NULL)||LA7_0==SQL92_RESERVED_PRIOR||LA7_0==SQL92_RESERVED_TRUE||LA7_0==UNSIGNED_INTEGER) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // PLSQLCommons.g:102:22: current_of_clause
                    {
                    pushFollow(FOLLOW_current_of_clause_in_where_clause559);
                    current_of_clause13=current_of_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, current_of_clause13.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:102:40: condition_wrapper
                    {
                    pushFollow(FOLLOW_condition_wrapper_in_where_clause561);
                    condition_wrapper14=gPLSQLParser.condition_wrapper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_wrapper14.getTree());

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
    // $ANTLR end "where_clause"


    public static class current_of_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "current_of_clause"
    // PLSQLCommons.g:105:1: current_of_clause : current_key ^ of_key ! cursor_name ;
    public final current_of_clause_return current_of_clause() throws RecognitionException {
        current_of_clause_return retval = new current_of_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.current_key_return current_key15 =null;

        PLSQLParser_PLSQLKeys.of_key_return of_key16 =null;

        cursor_name_return cursor_name17 =null;



        try {
            // PLSQLCommons.g:106:5: ( current_key ^ of_key ! cursor_name )
            // PLSQLCommons.g:106:10: current_key ^ of_key ! cursor_name
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_current_key_in_current_of_clause582);
            current_key15=gPLSQLParser.current_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(current_key15.getTree(), root_0);

            pushFollow(FOLLOW_of_key_in_current_of_clause585);
            of_key16=gPLSQLParser.of_key();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_cursor_name_in_current_of_clause588);
            cursor_name17=cursor_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cursor_name17.getTree());

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
    // $ANTLR end "current_of_clause"


    public static class into_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "into_clause"
    // PLSQLCommons.g:109:1: into_clause : ( into_key ^ variable_name ( COMMA ! variable_name )* | bulk_key ^ collect_key ! into_key ! variable_name ( COMMA ! variable_name )* );
    public final into_clause_return into_clause() throws RecognitionException {
        into_clause_return retval = new into_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA20=null;
        Token COMMA26=null;
        PLSQLParser_PLSQLKeys.into_key_return into_key18 =null;

        variable_name_return variable_name19 =null;

        variable_name_return variable_name21 =null;

        PLSQLParser_PLSQLKeys.bulk_key_return bulk_key22 =null;

        PLSQLParser_PLSQLKeys.collect_key_return collect_key23 =null;

        PLSQLParser_PLSQLKeys.into_key_return into_key24 =null;

        variable_name_return variable_name25 =null;

        variable_name_return variable_name27 =null;


        Object COMMA20_tree=null;
        Object COMMA26_tree=null;

        try {
            // PLSQLCommons.g:110:5: ( into_key ^ variable_name ( COMMA ! variable_name )* | bulk_key ^ collect_key ! into_key ! variable_name ( COMMA ! variable_name )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SQL92_RESERVED_INTO) ) {
                alt10=1;
            }
            else if ( (LA10_0==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("bulk")))) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // PLSQLCommons.g:110:10: into_key ^ variable_name ( COMMA ! variable_name )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_into_key_in_into_clause608);
                    into_key18=gPLSQLParser.into_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(into_key18.getTree(), root_0);

                    pushFollow(FOLLOW_variable_name_in_into_clause611);
                    variable_name19=variable_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_name19.getTree());

                    // PLSQLCommons.g:110:34: ( COMMA ! variable_name )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // PLSQLCommons.g:110:35: COMMA ! variable_name
                    	    {
                    	    COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause614); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variable_name_in_into_clause617);
                    	    variable_name21=variable_name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_name21.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:111:10: bulk_key ^ collect_key ! into_key ! variable_name ( COMMA ! variable_name )*
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bulk_key_in_into_clause631);
                    bulk_key22=gPLSQLParser.bulk_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(bulk_key22.getTree(), root_0);

                    pushFollow(FOLLOW_collect_key_in_into_clause634);
                    collect_key23=gPLSQLParser.collect_key();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_into_key_in_into_clause637);
                    into_key24=gPLSQLParser.into_key();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_variable_name_in_into_clause640);
                    variable_name25=variable_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_name25.getTree());

                    // PLSQLCommons.g:111:57: ( COMMA ! variable_name )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // PLSQLCommons.g:111:58: COMMA ! variable_name
                    	    {
                    	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_into_clause643); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variable_name_in_into_clause646);
                    	    variable_name27=variable_name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable_name27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "into_clause"


    public static class xml_column_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xml_column_name"
    // PLSQLCommons.g:118:1: xml_column_name : ( id -> ^( XML_COLUMN_NAME id ) | quoted_string -> ^( XML_COLUMN_NAME ID[$quoted_string.start] ) );
    public final xml_column_name_return xml_column_name() throws RecognitionException {
        xml_column_name_return retval = new xml_column_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id28 =null;

        quoted_string_return quoted_string29 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
        try {
            // PLSQLCommons.g:119:5: ( id -> ^( XML_COLUMN_NAME id ) | quoted_string -> ^( XML_COLUMN_NAME ID[$quoted_string.start] ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DELIMITED_ID||LA11_0==INTRODUCER||LA11_0==REGULAR_ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0 >= CHAR_STRING && LA11_0 <= CHAR_STRING_PERL)||LA11_0==NATIONAL_CHAR_STRING_LIT) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // PLSQLCommons.g:119:10: id
                    {
                    pushFollow(FOLLOW_id_in_xml_column_name673);
                    id28=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id28.getTree());

                    // AST REWRITE
                    // elements: id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 119:13: -> ^( XML_COLUMN_NAME id )
                    {
                        // PLSQLCommons.g:119:16: ^( XML_COLUMN_NAME id )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(XML_COLUMN_NAME, "XML_COLUMN_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_id.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:120:10: quoted_string
                    {
                    pushFollow(FOLLOW_quoted_string_in_xml_column_name692);
                    quoted_string29=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string29.getTree());

                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 120:24: -> ^( XML_COLUMN_NAME ID[$quoted_string.start] )
                    {
                        // PLSQLCommons.g:120:27: ^( XML_COLUMN_NAME ID[$quoted_string.start] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(XML_COLUMN_NAME, "XML_COLUMN_NAME")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(ID, (quoted_string29!=null?((Token)quoted_string29.start):null))
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

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
    // $ANTLR end "xml_column_name"


    public static class cost_class_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cost_class_name"
    // PLSQLCommons.g:123:1: cost_class_name : id -> ^( COST_CLASS_NAME id ) ;
    public final cost_class_name_return cost_class_name() throws RecognitionException {
        cost_class_name_return retval = new cost_class_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id30 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:124:5: ( id -> ^( COST_CLASS_NAME id ) )
            // PLSQLCommons.g:124:10: id
            {
            pushFollow(FOLLOW_id_in_cost_class_name721);
            id30=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id30.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:9: -> ^( COST_CLASS_NAME id )
            {
                // PLSQLCommons.g:125:12: ^( COST_CLASS_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COST_CLASS_NAME, "COST_CLASS_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "cost_class_name"


    public static class attribute_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_name"
    // PLSQLCommons.g:128:1: attribute_name : id -> ^( ATTRIBUTE_NAME id ) ;
    public final attribute_name_return attribute_name() throws RecognitionException {
        attribute_name_return retval = new attribute_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id31 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:129:5: ( id -> ^( ATTRIBUTE_NAME id ) )
            // PLSQLCommons.g:129:10: id
            {
            pushFollow(FOLLOW_id_in_attribute_name757);
            id31=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id31.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:9: -> ^( ATTRIBUTE_NAME id )
            {
                // PLSQLCommons.g:130:12: ^( ATTRIBUTE_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ATTRIBUTE_NAME, "ATTRIBUTE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "attribute_name"


    public static class savepoint_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "savepoint_name"
    // PLSQLCommons.g:133:1: savepoint_name : id -> ^( SAVEPOINT_NAME id ) ;
    public final savepoint_name_return savepoint_name() throws RecognitionException {
        savepoint_name_return retval = new savepoint_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id32 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:134:5: ( id -> ^( SAVEPOINT_NAME id ) )
            // PLSQLCommons.g:134:10: id
            {
            pushFollow(FOLLOW_id_in_savepoint_name793);
            id32=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id32.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:9: -> ^( SAVEPOINT_NAME id )
            {
                // PLSQLCommons.g:135:12: ^( SAVEPOINT_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SAVEPOINT_NAME, "SAVEPOINT_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "savepoint_name"


    public static class rollback_segment_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rollback_segment_name"
    // PLSQLCommons.g:138:1: rollback_segment_name : id -> ^( ROLLBACK_SEGMENT_NAME id ) ;
    public final rollback_segment_name_return rollback_segment_name() throws RecognitionException {
        rollback_segment_name_return retval = new rollback_segment_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id33 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:139:5: ( id -> ^( ROLLBACK_SEGMENT_NAME id ) )
            // PLSQLCommons.g:139:10: id
            {
            pushFollow(FOLLOW_id_in_rollback_segment_name829);
            id33=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id33.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 140:9: -> ^( ROLLBACK_SEGMENT_NAME id )
            {
                // PLSQLCommons.g:140:12: ^( ROLLBACK_SEGMENT_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROLLBACK_SEGMENT_NAME, "ROLLBACK_SEGMENT_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "rollback_segment_name"


    public static class table_var_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_var_name"
    // PLSQLCommons.g:144:1: table_var_name : id -> ^( TABLE_VAR_NAME id ) ;
    public final table_var_name_return table_var_name() throws RecognitionException {
        table_var_name_return retval = new table_var_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id34 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:145:5: ( id -> ^( TABLE_VAR_NAME id ) )
            // PLSQLCommons.g:145:10: id
            {
            pushFollow(FOLLOW_id_in_table_var_name866);
            id34=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id34.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 146:9: -> ^( TABLE_VAR_NAME id )
            {
                // PLSQLCommons.g:146:12: ^( TABLE_VAR_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TABLE_VAR_NAME, "TABLE_VAR_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "table_var_name"


    public static class schema_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_name"
    // PLSQLCommons.g:149:1: schema_name : id -> ^( SCHEMA_NAME id ) ;
    public final schema_name_return schema_name() throws RecognitionException {
        schema_name_return retval = new schema_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id35 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:150:5: ( id -> ^( SCHEMA_NAME id ) )
            // PLSQLCommons.g:150:10: id
            {
            pushFollow(FOLLOW_id_in_schema_name902);
            id35=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id35.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:9: -> ^( SCHEMA_NAME id )
            {
                // PLSQLCommons.g:151:12: ^( SCHEMA_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SCHEMA_NAME, "SCHEMA_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "schema_name"


    public static class routine_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "routine_name"
    // PLSQLCommons.g:154:1: routine_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )? -> ^( ROUTINE_NAME id ( id_expression )* ( link_name )? ) ;
    public final routine_name_return routine_name() throws RecognitionException {
        routine_name_return retval = new routine_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD37=null;
        Token AT_SIGN39=null;
        id_return id36 =null;

        id_expression_return id_expression38 =null;

        link_name_return link_name40 =null;


        Object PERIOD37_tree=null;
        Object AT_SIGN39_tree=null;
        RewriteRuleTokenStream stream_AT_SIGN=new RewriteRuleTokenStream(adaptor,"token AT_SIGN");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_link_name=new RewriteRuleSubtreeStream(adaptor,"rule link_name");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:155:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )? -> ^( ROUTINE_NAME id ( id_expression )* ( link_name )? ) )
            // PLSQLCommons.g:155:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )?
            {
            pushFollow(FOLLOW_id_in_routine_name938);
            id36=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id36.getTree());

            // PLSQLCommons.g:155:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==PERIOD) && (synpred2_PLSQLCommons())) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // PLSQLCommons.g:155:14: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD37=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_routine_name948); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD37);


            	    pushFollow(FOLLOW_id_expression_in_routine_name950);
            	    id_expression38=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression38.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // PLSQLCommons.g:155:62: ( AT_SIGN link_name )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT_SIGN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PLSQLCommons.g:155:63: AT_SIGN link_name
                    {
                    AT_SIGN39=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_routine_name955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT_SIGN.add(AT_SIGN39);


                    pushFollow(FOLLOW_link_name_in_routine_name957);
                    link_name40=link_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_link_name.add(link_name40.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id_expression, id, link_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:9: -> ^( ROUTINE_NAME id ( id_expression )* ( link_name )? )
            {
                // PLSQLCommons.g:156:12: ^( ROUTINE_NAME id ( id_expression )* ( link_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROUTINE_NAME, "ROUTINE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:156:30: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                // PLSQLCommons.g:156:45: ( link_name )?
                if ( stream_link_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_link_name.nextTree());

                }
                stream_link_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "routine_name"


    public static class package_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "package_name"
    // PLSQLCommons.g:159:1: package_name : id -> ^( PACKAGE_NAME id ) ;
    public final package_name_return package_name() throws RecognitionException {
        package_name_return retval = new package_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id41 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:160:5: ( id -> ^( PACKAGE_NAME id ) )
            // PLSQLCommons.g:160:10: id
            {
            pushFollow(FOLLOW_id_in_package_name1001);
            id41=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id41.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 161:9: -> ^( PACKAGE_NAME id )
            {
                // PLSQLCommons.g:161:12: ^( PACKAGE_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PACKAGE_NAME, "PACKAGE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "package_name"


    public static class implementation_type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementation_type_name"
    // PLSQLCommons.g:164:1: implementation_type_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? ) ;
    public final implementation_type_name_return implementation_type_name() throws RecognitionException {
        implementation_type_name_return retval = new implementation_type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD43=null;
        id_return id42 =null;

        id_expression_return id_expression44 =null;


        Object PERIOD43_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:165:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? ) )
            // PLSQLCommons.g:165:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
            {
            pushFollow(FOLLOW_id_in_implementation_type_name1037);
            id42=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id42.getTree());

            // PLSQLCommons.g:165:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PERIOD) && (synpred3_PLSQLCommons())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PLSQLCommons.g:165:14: ( PERIOD id_expression )=> PERIOD id_expression
                    {
                    PERIOD43=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_implementation_type_name1047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD43);


                    pushFollow(FOLLOW_id_expression_in_implementation_type_name1049);
                    id_expression44=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression44.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 166:9: -> ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? )
            {
                // PLSQLCommons.g:166:12: ^( IMPLEMENTATION_TYPE_NAME id ( id_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPLEMENTATION_TYPE_NAME, "IMPLEMENTATION_TYPE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:166:42: ( id_expression )?
                if ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "implementation_type_name"


    public static class parameter_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_name"
    // PLSQLCommons.g:169:1: parameter_name : id -> ^( PARAMETER_NAME id ) ;
    public final parameter_name_return parameter_name() throws RecognitionException {
        parameter_name_return retval = new parameter_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id45 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:170:5: ( id -> ^( PARAMETER_NAME id ) )
            // PLSQLCommons.g:170:10: id
            {
            pushFollow(FOLLOW_id_in_parameter_name1090);
            id45=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id45.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:9: -> ^( PARAMETER_NAME id )
            {
                // PLSQLCommons.g:171:12: ^( PARAMETER_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER_NAME, "PARAMETER_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "parameter_name"


    public static class reference_model_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "reference_model_name"
    // PLSQLCommons.g:174:1: reference_model_name : id -> ^( REFERENCE_MODEL_NAME id ) ;
    public final reference_model_name_return reference_model_name() throws RecognitionException {
        reference_model_name_return retval = new reference_model_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id46 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:175:5: ( id -> ^( REFERENCE_MODEL_NAME id ) )
            // PLSQLCommons.g:175:10: id
            {
            pushFollow(FOLLOW_id_in_reference_model_name1126);
            id46=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id46.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:9: -> ^( REFERENCE_MODEL_NAME id )
            {
                // PLSQLCommons.g:176:12: ^( REFERENCE_MODEL_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(REFERENCE_MODEL_NAME, "REFERENCE_MODEL_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "reference_model_name"


    public static class main_model_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main_model_name"
    // PLSQLCommons.g:179:1: main_model_name : id -> ^( MAIN_MODEL_NAME id ) ;
    public final main_model_name_return main_model_name() throws RecognitionException {
        main_model_name_return retval = new main_model_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id47 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:180:5: ( id -> ^( MAIN_MODEL_NAME id ) )
            // PLSQLCommons.g:180:10: id
            {
            pushFollow(FOLLOW_id_in_main_model_name1162);
            id47=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id47.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:9: -> ^( MAIN_MODEL_NAME id )
            {
                // PLSQLCommons.g:181:12: ^( MAIN_MODEL_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(MAIN_MODEL_NAME, "MAIN_MODEL_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "main_model_name"


    public static class aggregate_function_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aggregate_function_name"
    // PLSQLCommons.g:184:1: aggregate_function_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( ROUTINE_NAME id ( id_expression )* ) ;
    public final aggregate_function_name_return aggregate_function_name() throws RecognitionException {
        aggregate_function_name_return retval = new aggregate_function_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD49=null;
        id_return id48 =null;

        id_expression_return id_expression50 =null;


        Object PERIOD49_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:185:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( ROUTINE_NAME id ( id_expression )* ) )
            // PLSQLCommons.g:185:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )*
            {
            pushFollow(FOLLOW_id_in_aggregate_function_name1198);
            id48=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id48.getTree());

            // PLSQLCommons.g:185:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==PERIOD) && (synpred4_PLSQLCommons())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // PLSQLCommons.g:185:14: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD49=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_aggregate_function_name1208); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD49);


            	    pushFollow(FOLLOW_id_expression_in_aggregate_function_name1210);
            	    id_expression50=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression50.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // AST REWRITE
            // elements: id_expression, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 186:9: -> ^( ROUTINE_NAME id ( id_expression )* )
            {
                // PLSQLCommons.g:186:12: ^( ROUTINE_NAME id ( id_expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROUTINE_NAME, "ROUTINE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:186:30: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "aggregate_function_name"


    public static class query_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "query_name"
    // PLSQLCommons.g:189:1: query_name : id -> ^( QUERY_NAME id ) ;
    public final query_name_return query_name() throws RecognitionException {
        query_name_return retval = new query_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id51 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:190:5: ( id -> ^( QUERY_NAME id ) )
            // PLSQLCommons.g:190:10: id
            {
            pushFollow(FOLLOW_id_in_query_name1251);
            id51=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id51.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:9: -> ^( QUERY_NAME id )
            {
                // PLSQLCommons.g:191:12: ^( QUERY_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(QUERY_NAME, "QUERY_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "query_name"


    public static class constraint_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint_name"
    // PLSQLCommons.g:194:1: constraint_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )? -> ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? ) ;
    public final constraint_name_return constraint_name() throws RecognitionException {
        constraint_name_return retval = new constraint_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD53=null;
        Token AT_SIGN55=null;
        id_return id52 =null;

        id_expression_return id_expression54 =null;

        link_name_return link_name56 =null;


        Object PERIOD53_tree=null;
        Object AT_SIGN55_tree=null;
        RewriteRuleTokenStream stream_AT_SIGN=new RewriteRuleTokenStream(adaptor,"token AT_SIGN");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_link_name=new RewriteRuleSubtreeStream(adaptor,"rule link_name");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:195:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )? -> ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? ) )
            // PLSQLCommons.g:195:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )* ( AT_SIGN link_name )?
            {
            pushFollow(FOLLOW_id_in_constraint_name1287);
            id52=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id52.getTree());

            // PLSQLCommons.g:195:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PERIOD) && (synpred5_PLSQLCommons())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // PLSQLCommons.g:195:14: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD53=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_constraint_name1297); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD53);


            	    pushFollow(FOLLOW_id_expression_in_constraint_name1299);
            	    id_expression54=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression54.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // PLSQLCommons.g:195:62: ( AT_SIGN link_name )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT_SIGN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PLSQLCommons.g:195:63: AT_SIGN link_name
                    {
                    AT_SIGN55=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_constraint_name1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT_SIGN.add(AT_SIGN55);


                    pushFollow(FOLLOW_link_name_in_constraint_name1306);
                    link_name56=link_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_link_name.add(link_name56.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: link_name, id_expression, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 196:9: -> ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? )
            {
                // PLSQLCommons.g:196:12: ^( CONSTRAINT_NAME id ( id_expression )* ( link_name )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONSTRAINT_NAME, "CONSTRAINT_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:196:33: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                // PLSQLCommons.g:196:48: ( link_name )?
                if ( stream_link_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_link_name.nextTree());

                }
                stream_link_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "constraint_name"


    public static class label_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label_name"
    // PLSQLCommons.g:199:1: label_name : id_expression -> ^( LABEL_NAME id_expression ) ;
    public final label_name_return label_name() throws RecognitionException {
        label_name_return retval = new label_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_expression_return id_expression57 =null;


        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:200:5: ( id_expression -> ^( LABEL_NAME id_expression ) )
            // PLSQLCommons.g:200:10: id_expression
            {
            pushFollow(FOLLOW_id_expression_in_label_name1350);
            id_expression57=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression57.getTree());

            // AST REWRITE
            // elements: id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:9: -> ^( LABEL_NAME id_expression )
            {
                // PLSQLCommons.g:201:12: ^( LABEL_NAME id_expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LABEL_NAME, "LABEL_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "label_name"


    public static class type_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // PLSQLCommons.g:204:1: type_name : id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( TYPE_NAME ( id_expression )+ ) ;
    public final type_name_return type_name() throws RecognitionException {
        type_name_return retval = new type_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD59=null;
        id_expression_return id_expression58 =null;

        id_expression_return id_expression60 =null;


        Object PERIOD59_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:205:5: ( id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( TYPE_NAME ( id_expression )+ ) )
            // PLSQLCommons.g:205:10: id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )*
            {
            pushFollow(FOLLOW_id_expression_in_type_name1386);
            id_expression58=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression58.getTree());

            // PLSQLCommons.g:205:24: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==PERIOD) && (synpred6_PLSQLCommons())) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // PLSQLCommons.g:205:25: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD59=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_type_name1396); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD59);


            	    pushFollow(FOLLOW_id_expression_in_type_name1398);
            	    id_expression60=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression60.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AST REWRITE
            // elements: id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 206:9: -> ^( TYPE_NAME ( id_expression )+ )
            {
                // PLSQLCommons.g:206:12: ^( TYPE_NAME ( id_expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TYPE_NAME, "TYPE_NAME")
                , root_1);

                if ( !(stream_id_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "type_name"


    public static class sequence_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sequence_name"
    // PLSQLCommons.g:209:1: sequence_name : id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( SEQUENCE_NAME ( id_expression )+ ) ;
    public final sequence_name_return sequence_name() throws RecognitionException {
        sequence_name_return retval = new sequence_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD62=null;
        id_expression_return id_expression61 =null;

        id_expression_return id_expression63 =null;


        Object PERIOD62_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:210:5: ( id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( SEQUENCE_NAME ( id_expression )+ ) )
            // PLSQLCommons.g:210:10: id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )*
            {
            pushFollow(FOLLOW_id_expression_in_sequence_name1437);
            id_expression61=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression61.getTree());

            // PLSQLCommons.g:210:24: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==PERIOD) && (synpred7_PLSQLCommons())) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // PLSQLCommons.g:210:25: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD62=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_sequence_name1447); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD62);


            	    pushFollow(FOLLOW_id_expression_in_sequence_name1449);
            	    id_expression63=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression63.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 211:9: -> ^( SEQUENCE_NAME ( id_expression )+ )
            {
                // PLSQLCommons.g:211:12: ^( SEQUENCE_NAME ( id_expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SEQUENCE_NAME, "SEQUENCE_NAME")
                , root_1);

                if ( !(stream_id_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "sequence_name"


    public static class exception_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exception_name"
    // PLSQLCommons.g:214:1: exception_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( EXCEPTION_NAME id ( id_expression )* ) ;
    public final exception_name_return exception_name() throws RecognitionException {
        exception_name_return retval = new exception_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD65=null;
        id_return id64 =null;

        id_expression_return id_expression66 =null;


        Object PERIOD65_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:215:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( EXCEPTION_NAME id ( id_expression )* ) )
            // PLSQLCommons.g:215:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )*
            {
            pushFollow(FOLLOW_id_in_exception_name1488);
            id64=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id64.getTree());

            // PLSQLCommons.g:215:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==PERIOD) && (synpred8_PLSQLCommons())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // PLSQLCommons.g:215:14: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD65=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_exception_name1498); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD65);


            	    pushFollow(FOLLOW_id_expression_in_exception_name1500);
            	    id_expression66=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression66.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // AST REWRITE
            // elements: id_expression, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:9: -> ^( EXCEPTION_NAME id ( id_expression )* )
            {
                // PLSQLCommons.g:216:11: ^( EXCEPTION_NAME id ( id_expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXCEPTION_NAME, "EXCEPTION_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:216:31: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "exception_name"


    public static class function_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name"
    // PLSQLCommons.g:219:1: function_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( FUNCTION_NAME id ( id_expression )* ) ;
    public final function_name_return function_name() throws RecognitionException {
        function_name_return retval = new function_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD68=null;
        id_return id67 =null;

        id_expression_return id_expression69 =null;


        Object PERIOD68_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:220:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( FUNCTION_NAME id ( id_expression )* ) )
            // PLSQLCommons.g:220:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
            {
            pushFollow(FOLLOW_id_in_function_name1541);
            id67=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id67.getTree());

            // PLSQLCommons.g:220:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PERIOD) && (synpred9_PLSQLCommons())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PLSQLCommons.g:220:14: ( PERIOD id_expression )=> PERIOD id_expression
                    {
                    PERIOD68=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function_name1551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD68);


                    pushFollow(FOLLOW_id_expression_in_function_name1553);
                    id_expression69=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression69.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id_expression, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 221:9: -> ^( FUNCTION_NAME id ( id_expression )* )
            {
                // PLSQLCommons.g:221:12: ^( FUNCTION_NAME id ( id_expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_NAME, "FUNCTION_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:221:31: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "function_name"


    public static class procedure_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "procedure_name"
    // PLSQLCommons.g:224:1: procedure_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( PROCEDURE_NAME id ( id_expression )* ) ;
    public final procedure_name_return procedure_name() throws RecognitionException {
        procedure_name_return retval = new procedure_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD71=null;
        id_return id70 =null;

        id_expression_return id_expression72 =null;


        Object PERIOD71_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:225:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( PROCEDURE_NAME id ( id_expression )* ) )
            // PLSQLCommons.g:225:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
            {
            pushFollow(FOLLOW_id_in_procedure_name1594);
            id70=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id70.getTree());

            // PLSQLCommons.g:225:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==PERIOD) && (synpred10_PLSQLCommons())) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PLSQLCommons.g:225:14: ( PERIOD id_expression )=> PERIOD id_expression
                    {
                    PERIOD71=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_procedure_name1604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD71);


                    pushFollow(FOLLOW_id_expression_in_procedure_name1606);
                    id_expression72=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression72.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id_expression, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 226:9: -> ^( PROCEDURE_NAME id ( id_expression )* )
            {
                // PLSQLCommons.g:226:12: ^( PROCEDURE_NAME id ( id_expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROCEDURE_NAME, "PROCEDURE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:226:32: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "procedure_name"


    public static class trigger_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "trigger_name"
    // PLSQLCommons.g:229:1: trigger_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( TRIGGER_NAME id ( id_expression )* ) ;
    public final trigger_name_return trigger_name() throws RecognitionException {
        trigger_name_return retval = new trigger_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD74=null;
        id_return id73 =null;

        id_expression_return id_expression75 =null;


        Object PERIOD74_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:230:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( TRIGGER_NAME id ( id_expression )* ) )
            // PLSQLCommons.g:230:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
            {
            pushFollow(FOLLOW_id_in_trigger_name1647);
            id73=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id73.getTree());

            // PLSQLCommons.g:230:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PERIOD) && (synpred11_PLSQLCommons())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PLSQLCommons.g:230:14: ( PERIOD id_expression )=> PERIOD id_expression
                    {
                    PERIOD74=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_trigger_name1657); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD74);


                    pushFollow(FOLLOW_id_expression_in_trigger_name1659);
                    id_expression75=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression75.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:9: -> ^( TRIGGER_NAME id ( id_expression )* )
            {
                // PLSQLCommons.g:231:11: ^( TRIGGER_NAME id ( id_expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TRIGGER_NAME, "TRIGGER_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:231:29: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "trigger_name"


    public static class variable_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable_name"
    // PLSQLCommons.g:234:1: variable_name : ( ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* ) | bind_variable -> ^( HOSTED_VARIABLE_NAME bind_variable ) );
    public final variable_name_return variable_name() throws RecognitionException {
        variable_name_return retval = new variable_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTRODUCER76=null;
        Token PERIOD79=null;
        char_set_name_return char_set_name77 =null;

        id_expression_return id_expression78 =null;

        id_expression_return id_expression80 =null;

        bind_variable_return bind_variable81 =null;


        Object INTRODUCER76_tree=null;
        Object PERIOD79_tree=null;
        RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");
        try {
            // PLSQLCommons.g:235:5: ( ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* ) | bind_variable -> ^( HOSTED_VARIABLE_NAME bind_variable ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==DELIMITED_ID||LA26_0==INTRODUCER||LA26_0==REGULAR_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==BINDVAR||LA26_0==COLON) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // PLSQLCommons.g:235:10: ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )?
                    {
                    // PLSQLCommons.g:235:10: ( INTRODUCER char_set_name )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==INTRODUCER) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // PLSQLCommons.g:235:11: INTRODUCER char_set_name
                            {
                            INTRODUCER76=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_variable_name1700); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER76);


                            pushFollow(FOLLOW_char_set_name_in_variable_name1702);
                            char_set_name77=char_set_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name77.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_id_expression_in_variable_name1718);
                    id_expression78=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression78.getTree());

                    // PLSQLCommons.g:236:27: ( ( PERIOD id_expression )=> PERIOD id_expression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==PERIOD) && (synpred12_PLSQLCommons())) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // PLSQLCommons.g:236:28: ( PERIOD id_expression )=> PERIOD id_expression
                            {
                            PERIOD79=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_variable_name1728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD79);


                            pushFollow(FOLLOW_id_expression_in_variable_name1730);
                            id_expression80=id_expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_id_expression.add(id_expression80.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: char_set_name, id_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:9: -> ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* )
                    {
                        // PLSQLCommons.g:237:12: ^( VARIABLE_NAME ( char_set_name )? ( id_expression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VARIABLE_NAME, "VARIABLE_NAME")
                        , root_1);

                        // PLSQLCommons.g:237:28: ( char_set_name )?
                        if ( stream_char_set_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_char_set_name.nextTree());

                        }
                        stream_char_set_name.reset();

                        // PLSQLCommons.g:237:43: ( id_expression )*
                        while ( stream_id_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_id_expression.nextTree());

                        }
                        stream_id_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:238:10: bind_variable
                    {
                    pushFollow(FOLLOW_bind_variable_in_variable_name1763);
                    bind_variable81=bind_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bind_variable.add(bind_variable81.getTree());

                    // AST REWRITE
                    // elements: bind_variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:9: -> ^( HOSTED_VARIABLE_NAME bind_variable )
                    {
                        // PLSQLCommons.g:239:12: ^( HOSTED_VARIABLE_NAME bind_variable )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(HOSTED_VARIABLE_NAME, "HOSTED_VARIABLE_NAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_bind_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

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
    // $ANTLR end "variable_name"


    public static class index_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "index_name"
    // PLSQLCommons.g:242:1: index_name : id -> ^( INDEX_NAME id ) ;
    public final index_name_return index_name() throws RecognitionException {
        index_name_return retval = new index_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id82 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:243:5: ( id -> ^( INDEX_NAME id ) )
            // PLSQLCommons.g:243:10: id
            {
            pushFollow(FOLLOW_id_in_index_name1799);
            id82=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id82.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 244:9: -> ^( INDEX_NAME id )
            {
                // PLSQLCommons.g:244:12: ^( INDEX_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INDEX_NAME, "INDEX_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "index_name"


    public static class cursor_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cursor_name"
    // PLSQLCommons.g:247:1: cursor_name : ( id | bind_variable ) -> ^( CURSOR_NAME ( id )? ( bind_variable )? ) ;
    public final cursor_name_return cursor_name() throws RecognitionException {
        cursor_name_return retval = new cursor_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id83 =null;

        bind_variable_return bind_variable84 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");
        try {
            // PLSQLCommons.g:248:5: ( ( id | bind_variable ) -> ^( CURSOR_NAME ( id )? ( bind_variable )? ) )
            // PLSQLCommons.g:248:10: ( id | bind_variable )
            {
            // PLSQLCommons.g:248:10: ( id | bind_variable )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DELIMITED_ID||LA27_0==INTRODUCER||LA27_0==REGULAR_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==BINDVAR||LA27_0==COLON) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // PLSQLCommons.g:248:11: id
                    {
                    pushFollow(FOLLOW_id_in_cursor_name1836);
                    id83=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id83.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:248:16: bind_variable
                    {
                    pushFollow(FOLLOW_bind_variable_in_cursor_name1840);
                    bind_variable84=bind_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bind_variable.add(bind_variable84.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: bind_variable, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 249:9: -> ^( CURSOR_NAME ( id )? ( bind_variable )? )
            {
                // PLSQLCommons.g:249:12: ^( CURSOR_NAME ( id )? ( bind_variable )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CURSOR_NAME, "CURSOR_NAME")
                , root_1);

                // PLSQLCommons.g:249:26: ( id )?
                if ( stream_id.hasNext() ) {
                    adaptor.addChild(root_1, stream_id.nextTree());

                }
                stream_id.reset();

                // PLSQLCommons.g:249:30: ( bind_variable )?
                if ( stream_bind_variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_bind_variable.nextTree());

                }
                stream_bind_variable.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "cursor_name"


    public static class record_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "record_name"
    // PLSQLCommons.g:252:1: record_name : ( id | bind_variable ) -> ^( RECORD_NAME id ) ;
    public final record_name_return record_name() throws RecognitionException {
        record_name_return retval = new record_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id85 =null;

        bind_variable_return bind_variable86 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_bind_variable=new RewriteRuleSubtreeStream(adaptor,"rule bind_variable");
        try {
            // PLSQLCommons.g:253:5: ( ( id | bind_variable ) -> ^( RECORD_NAME id ) )
            // PLSQLCommons.g:253:10: ( id | bind_variable )
            {
            // PLSQLCommons.g:253:10: ( id | bind_variable )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DELIMITED_ID||LA28_0==INTRODUCER||LA28_0==REGULAR_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==BINDVAR||LA28_0==COLON) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // PLSQLCommons.g:253:11: id
                    {
                    pushFollow(FOLLOW_id_in_record_name1882);
                    id85=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id85.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:253:16: bind_variable
                    {
                    pushFollow(FOLLOW_bind_variable_in_record_name1886);
                    bind_variable86=bind_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bind_variable.add(bind_variable86.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 254:9: -> ^( RECORD_NAME id )
            {
                // PLSQLCommons.g:254:11: ^( RECORD_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RECORD_NAME, "RECORD_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "record_name"


    public static class collection_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "collection_name"
    // PLSQLCommons.g:257:1: collection_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( COLLECTION_NAME id ( id_expression )? ) ;
    public final collection_name_return collection_name() throws RecognitionException {
        collection_name_return retval = new collection_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD88=null;
        id_return id87 =null;

        id_expression_return id_expression89 =null;


        Object PERIOD88_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:258:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? -> ^( COLLECTION_NAME id ( id_expression )? ) )
            // PLSQLCommons.g:258:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )?
            {
            pushFollow(FOLLOW_id_in_collection_name1922);
            id87=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id87.getTree());

            // PLSQLCommons.g:258:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==PERIOD) && (synpred13_PLSQLCommons())) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PLSQLCommons.g:258:14: ( PERIOD id_expression )=> PERIOD id_expression
                    {
                    PERIOD88=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_collection_name1932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD88);


                    pushFollow(FOLLOW_id_expression_in_collection_name1934);
                    id_expression89=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression89.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: id, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 259:9: -> ^( COLLECTION_NAME id ( id_expression )? )
            {
                // PLSQLCommons.g:259:11: ^( COLLECTION_NAME id ( id_expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLLECTION_NAME, "COLLECTION_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:259:32: ( id_expression )?
                if ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "collection_name"


    public static class link_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "link_name"
    // PLSQLCommons.g:262:1: link_name : id -> ^( LINK_NAME id ) ;
    public final link_name_return link_name() throws RecognitionException {
        link_name_return retval = new link_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        id_return id90 =null;


        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // PLSQLCommons.g:263:5: ( id -> ^( LINK_NAME id ) )
            // PLSQLCommons.g:263:10: id
            {
            pushFollow(FOLLOW_id_in_link_name1974);
            id90=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id90.getTree());

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:9: -> ^( LINK_NAME id )
            {
                // PLSQLCommons.g:264:12: ^( LINK_NAME id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LINK_NAME, "LINK_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "link_name"


    public static class column_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_name"
    // PLSQLCommons.g:267:1: column_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( COLUMN_NAME id ( id_expression )* ) ;
    public final column_name_return column_name() throws RecognitionException {
        column_name_return retval = new column_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD92=null;
        id_return id91 =null;

        id_expression_return id_expression93 =null;


        Object PERIOD92_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:268:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( COLUMN_NAME id ( id_expression )* ) )
            // PLSQLCommons.g:268:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )*
            {
            pushFollow(FOLLOW_id_in_column_name2010);
            id91=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id91.getTree());

            // PLSQLCommons.g:268:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==PERIOD) && (synpred14_PLSQLCommons())) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // PLSQLCommons.g:268:14: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD92=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_column_name2020); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD92);


            	    pushFollow(FOLLOW_id_expression_in_column_name2022);
            	    id_expression93=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression93.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // AST REWRITE
            // elements: id, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 269:9: -> ^( COLUMN_NAME id ( id_expression )* )
            {
                // PLSQLCommons.g:269:12: ^( COLUMN_NAME id ( id_expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_NAME, "COLUMN_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:269:29: ( id_expression )*
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "column_name"


    public static class tableview_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableview_name"
    // PLSQLCommons.g:272:1: tableview_name : id ( ( PERIOD id_expression )=> PERIOD id_expression )? ( AT_SIGN link_name |{...}? => partition_extension_clause )? -> ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? ) ;
    public final tableview_name_return tableview_name() throws RecognitionException {
        tableview_name_return retval = new tableview_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD95=null;
        Token AT_SIGN97=null;
        id_return id94 =null;

        id_expression_return id_expression96 =null;

        link_name_return link_name98 =null;

        partition_extension_clause_return partition_extension_clause99 =null;


        Object PERIOD95_tree=null;
        Object AT_SIGN97_tree=null;
        RewriteRuleTokenStream stream_AT_SIGN=new RewriteRuleTokenStream(adaptor,"token AT_SIGN");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_partition_extension_clause=new RewriteRuleSubtreeStream(adaptor,"rule partition_extension_clause");
        RewriteRuleSubtreeStream stream_link_name=new RewriteRuleSubtreeStream(adaptor,"rule link_name");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:273:5: ( id ( ( PERIOD id_expression )=> PERIOD id_expression )? ( AT_SIGN link_name |{...}? => partition_extension_clause )? -> ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? ) )
            // PLSQLCommons.g:273:10: id ( ( PERIOD id_expression )=> PERIOD id_expression )? ( AT_SIGN link_name |{...}? => partition_extension_clause )?
            {
            pushFollow(FOLLOW_id_in_tableview_name2063);
            id94=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id94.getTree());

            // PLSQLCommons.g:273:13: ( ( PERIOD id_expression )=> PERIOD id_expression )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PERIOD) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==REGULAR_ID) && (synpred15_PLSQLCommons())) {
                    alt31=1;
                }
                else if ( (LA31_1==DELIMITED_ID) && (synpred15_PLSQLCommons())) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // PLSQLCommons.g:273:14: ( PERIOD id_expression )=> PERIOD id_expression
                    {
                    PERIOD95=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_tableview_name2073); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD95);


                    pushFollow(FOLLOW_id_expression_in_tableview_name2075);
                    id_expression96=id_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id_expression.add(id_expression96.getTree());

                    }
                    break;

            }


            // PLSQLCommons.g:274:5: ( AT_SIGN link_name |{...}? => partition_extension_clause )?
            int alt32=3;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // PLSQLCommons.g:274:10: AT_SIGN link_name
                    {
                    AT_SIGN97=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_tableview_name2089); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT_SIGN.add(AT_SIGN97);


                    pushFollow(FOLLOW_link_name_in_tableview_name2091);
                    link_name98=link_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_link_name.add(link_name98.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:275:10: {...}? => partition_extension_clause
                    {
                    if ( !((!(input.LA(2) == SQL92_RESERVED_BY))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "tableview_name", "!(input.LA(2) == SQL92_RESERVED_BY)");
                    }

                    pushFollow(FOLLOW_partition_extension_clause_in_tableview_name2105);
                    partition_extension_clause99=partition_extension_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partition_extension_clause.add(partition_extension_clause99.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: link_name, id_expression, partition_extension_clause, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:9: -> ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? )
            {
                // PLSQLCommons.g:277:12: ^( TABLEVIEW_NAME id ( id_expression )? ( link_name )? ( partition_extension_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TABLEVIEW_NAME, "TABLEVIEW_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_id.nextTree());

                // PLSQLCommons.g:277:32: ( id_expression )?
                if ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                // PLSQLCommons.g:277:47: ( link_name )?
                if ( stream_link_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_link_name.nextTree());

                }
                stream_link_name.reset();

                // PLSQLCommons.g:277:58: ( partition_extension_clause )?
                if ( stream_partition_extension_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_partition_extension_clause.nextTree());

                }
                stream_partition_extension_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "tableview_name"


    public static class char_set_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "char_set_name"
    // PLSQLCommons.g:280:1: char_set_name : id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( CHAR_SET_NAME ( id_expression )+ ) ;
    public final char_set_name_return char_set_name() throws RecognitionException {
        char_set_name_return retval = new char_set_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD101=null;
        id_expression_return id_expression100 =null;

        id_expression_return id_expression102 =null;


        Object PERIOD101_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        try {
            // PLSQLCommons.g:281:5: ( id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* -> ^( CHAR_SET_NAME ( id_expression )+ ) )
            // PLSQLCommons.g:281:10: id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )*
            {
            pushFollow(FOLLOW_id_expression_in_char_set_name2157);
            id_expression100=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression100.getTree());

            // PLSQLCommons.g:281:24: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==PERIOD) && (synpred16_PLSQLCommons())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // PLSQLCommons.g:281:25: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD101=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_char_set_name2167); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD101);


            	    pushFollow(FOLLOW_id_expression_in_char_set_name2169);
            	    id_expression102=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // AST REWRITE
            // elements: id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:9: -> ^( CHAR_SET_NAME ( id_expression )+ )
            {
                // PLSQLCommons.g:282:11: ^( CHAR_SET_NAME ( id_expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CHAR_SET_NAME, "CHAR_SET_NAME")
                , root_1);

                if ( !(stream_id_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "char_set_name"


    public static class keep_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "keep_clause"
    // PLSQLCommons.g:290:1: keep_clause : keep_key ^ LEFT_PAREN ! dense_rank_key ( first_key | last_key ) order_by_clause RIGHT_PAREN ! ( over_clause )? ;
    public final keep_clause_return keep_clause() throws RecognitionException {
        keep_clause_return retval = new keep_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN104=null;
        Token RIGHT_PAREN109=null;
        PLSQLParser_PLSQLKeys.keep_key_return keep_key103 =null;

        PLSQLParser_PLSQLKeys.dense_rank_key_return dense_rank_key105 =null;

        PLSQLParser_PLSQLKeys.first_key_return first_key106 =null;

        PLSQLParser_PLSQLKeys.last_key_return last_key107 =null;

        PLSQLParser_PLSQL_DMLParser.order_by_clause_return order_by_clause108 =null;

        PLSQLParser_PLSQL_DMLParser.over_clause_return over_clause110 =null;


        Object LEFT_PAREN104_tree=null;
        Object RIGHT_PAREN109_tree=null;

        try {
            // PLSQLCommons.g:291:5: ( keep_key ^ LEFT_PAREN ! dense_rank_key ( first_key | last_key ) order_by_clause RIGHT_PAREN ! ( over_clause )? )
            // PLSQLCommons.g:291:9: keep_key ^ LEFT_PAREN ! dense_rank_key ( first_key | last_key ) order_by_clause RIGHT_PAREN ! ( over_clause )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_keep_key_in_keep_clause2211);
            keep_key103=gPLSQLParser.keep_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(keep_key103.getTree(), root_0);

            LEFT_PAREN104=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_keep_clause2222); if (state.failed) return retval;

            pushFollow(FOLLOW_dense_rank_key_in_keep_clause2237);
            dense_rank_key105=gPLSQLParser.dense_rank_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dense_rank_key105.getTree());

            // PLSQLCommons.g:293:28: ( first_key | last_key )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("first"))||(input.LT(1).getText().equalsIgnoreCase("last"))))) {
                int LA34_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("first"))) ) {
                    alt34=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("last"))) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // PLSQLCommons.g:293:29: first_key
                    {
                    pushFollow(FOLLOW_first_key_in_keep_clause2240);
                    first_key106=gPLSQLParser.first_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, first_key106.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:293:39: last_key
                    {
                    pushFollow(FOLLOW_last_key_in_keep_clause2242);
                    last_key107=gPLSQLParser.last_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, last_key107.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_order_by_clause_in_keep_clause2258);
            order_by_clause108=gPLSQLParser.order_by_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, order_by_clause108.getTree());

            RIGHT_PAREN109=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_keep_clause2268); if (state.failed) return retval;

            // PLSQLCommons.g:295:22: ( over_clause )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // PLSQLCommons.g:295:22: over_clause
                    {
                    pushFollow(FOLLOW_over_clause_in_keep_clause2271);
                    over_clause110=gPLSQLParser.over_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, over_clause110.getTree());

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
    // $ANTLR end "keep_clause"


    public static class function_argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument"
    // PLSQLCommons.g:298:1: function_argument : LEFT_PAREN ( argument )? ( COMMA argument )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) ;
    public final function_argument_return function_argument() throws RecognitionException {
        function_argument_return retval = new function_argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN111=null;
        Token COMMA113=null;
        Token RIGHT_PAREN115=null;
        argument_return argument112 =null;

        argument_return argument114 =null;

        keep_clause_return keep_clause116 =null;


        Object LEFT_PAREN111_tree=null;
        Object COMMA113_tree=null;
        Object RIGHT_PAREN115_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_keep_clause=new RewriteRuleSubtreeStream(adaptor,"rule keep_clause");
        try {
            // PLSQLCommons.g:299:5: ( LEFT_PAREN ( argument )? ( COMMA argument )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) )
            // PLSQLCommons.g:299:10: LEFT_PAREN ( argument )? ( COMMA argument )* RIGHT_PAREN ( keep_clause )?
            {
            LEFT_PAREN111=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_argument2292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN111);


            // PLSQLCommons.g:300:13: ( argument )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==APPROXIMATE_NUM_LIT||LA36_0==BINDVAR||(LA36_0 >= CHAR_STRING && LA36_0 <= COLON)||LA36_0==DELIMITED_ID||LA36_0==EXACT_NUM_LIT||LA36_0==INTRODUCER||LA36_0==LEFT_PAREN||(LA36_0 >= MINUS_SIGN && LA36_0 <= NATIONAL_CHAR_STRING_LIT)||LA36_0==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA36_0==PLUS_SIGN||LA36_0==REGULAR_ID||LA36_0==SQL92_RESERVED_ALL||LA36_0==SQL92_RESERVED_ANY||LA36_0==SQL92_RESERVED_CASE||(LA36_0 >= SQL92_RESERVED_CURSOR && LA36_0 <= SQL92_RESERVED_DATE)||LA36_0==SQL92_RESERVED_DEFAULT||LA36_0==SQL92_RESERVED_DISTINCT||(LA36_0 >= SQL92_RESERVED_EXISTS && LA36_0 <= SQL92_RESERVED_FALSE)||(LA36_0 >= SQL92_RESERVED_NOT && LA36_0 <= SQL92_RESERVED_NULL)||LA36_0==SQL92_RESERVED_PRIOR||LA36_0==SQL92_RESERVED_TRUE||LA36_0==UNSIGNED_INTEGER) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PLSQLCommons.g:300:13: argument
                    {
                    pushFollow(FOLLOW_argument_in_function_argument2307);
                    argument112=argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument.add(argument112.getTree());

                    }
                    break;

            }


            // PLSQLCommons.g:300:23: ( COMMA argument )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // PLSQLCommons.g:300:24: COMMA argument
            	    {
            	    COMMA113=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument2311); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA113);


            	    pushFollow(FOLLOW_argument_in_function_argument2313);
            	    argument114=argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argument.add(argument114.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            RIGHT_PAREN115=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_argument2327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN115);


            // PLSQLCommons.g:302:9: ( keep_clause )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==REGULAR_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==LEFT_PAREN) ) {
                    int LA38_3 = input.LA(3);

                    if ( (LA38_3==REGULAR_ID) ) {
                        int LA38_4 = input.LA(4);

                        if ( (LA38_4==REGULAR_ID) ) {
                            int LA38_6 = input.LA(5);

                            if ( (LA38_6==SQL92_RESERVED_ORDER) && ((input.LT(1).getText().equalsIgnoreCase("keep")))) {
                                alt38=1;
                            }
                        }
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // PLSQLCommons.g:302:9: keep_clause
                    {
                    pushFollow(FOLLOW_keep_clause_in_function_argument2337);
                    keep_clause116=keep_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keep_clause.add(keep_clause116.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: argument, keep_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:9: -> ^( ARGUMENTS ( argument )* ( keep_clause )? )
            {
                // PLSQLCommons.g:303:12: ^( ARGUMENTS ( argument )* ( keep_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTS, "ARGUMENTS")
                , root_1);

                // PLSQLCommons.g:303:24: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                // PLSQLCommons.g:303:34: ( keep_clause )?
                if ( stream_keep_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_keep_clause.nextTree());

                }
                stream_keep_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "function_argument"


    public static class function_argument_analytic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument_analytic"
    // PLSQLCommons.g:306:1: function_argument_analytic : LEFT_PAREN ( argument ( respect_or_ignore_nulls )? )? ( COMMA argument ( respect_or_ignore_nulls )? )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) ;
    public final function_argument_analytic_return function_argument_analytic() throws RecognitionException {
        function_argument_analytic_return retval = new function_argument_analytic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN117=null;
        Token COMMA120=null;
        Token RIGHT_PAREN123=null;
        argument_return argument118 =null;

        respect_or_ignore_nulls_return respect_or_ignore_nulls119 =null;

        argument_return argument121 =null;

        respect_or_ignore_nulls_return respect_or_ignore_nulls122 =null;

        keep_clause_return keep_clause124 =null;


        Object LEFT_PAREN117_tree=null;
        Object COMMA120_tree=null;
        Object RIGHT_PAREN123_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_respect_or_ignore_nulls=new RewriteRuleSubtreeStream(adaptor,"rule respect_or_ignore_nulls");
        RewriteRuleSubtreeStream stream_keep_clause=new RewriteRuleSubtreeStream(adaptor,"rule keep_clause");
        try {
            // PLSQLCommons.g:307:5: ( LEFT_PAREN ( argument ( respect_or_ignore_nulls )? )? ( COMMA argument ( respect_or_ignore_nulls )? )* RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS ( argument )* ( keep_clause )? ) )
            // PLSQLCommons.g:307:10: LEFT_PAREN ( argument ( respect_or_ignore_nulls )? )? ( COMMA argument ( respect_or_ignore_nulls )? )* RIGHT_PAREN ( keep_clause )?
            {
            LEFT_PAREN117=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_argument_analytic2378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN117);


            // PLSQLCommons.g:308:13: ( argument ( respect_or_ignore_nulls )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==APPROXIMATE_NUM_LIT||LA40_0==BINDVAR||(LA40_0 >= CHAR_STRING && LA40_0 <= COLON)||LA40_0==DELIMITED_ID||LA40_0==EXACT_NUM_LIT||LA40_0==INTRODUCER||LA40_0==LEFT_PAREN||(LA40_0 >= MINUS_SIGN && LA40_0 <= NATIONAL_CHAR_STRING_LIT)||LA40_0==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA40_0==PLUS_SIGN||LA40_0==REGULAR_ID||LA40_0==SQL92_RESERVED_ALL||LA40_0==SQL92_RESERVED_ANY||LA40_0==SQL92_RESERVED_CASE||(LA40_0 >= SQL92_RESERVED_CURSOR && LA40_0 <= SQL92_RESERVED_DATE)||LA40_0==SQL92_RESERVED_DEFAULT||LA40_0==SQL92_RESERVED_DISTINCT||(LA40_0 >= SQL92_RESERVED_EXISTS && LA40_0 <= SQL92_RESERVED_FALSE)||(LA40_0 >= SQL92_RESERVED_NOT && LA40_0 <= SQL92_RESERVED_NULL)||LA40_0==SQL92_RESERVED_PRIOR||LA40_0==SQL92_RESERVED_TRUE||LA40_0==UNSIGNED_INTEGER) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PLSQLCommons.g:308:14: argument ( respect_or_ignore_nulls )?
                    {
                    pushFollow(FOLLOW_argument_in_function_argument_analytic2393);
                    argument118=argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument.add(argument118.getTree());

                    // PLSQLCommons.g:308:23: ( respect_or_ignore_nulls )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // PLSQLCommons.g:308:23: respect_or_ignore_nulls
                            {
                            pushFollow(FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2395);
                            respect_or_ignore_nulls119=respect_or_ignore_nulls();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_respect_or_ignore_nulls.add(respect_or_ignore_nulls119.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // PLSQLCommons.g:309:13: ( COMMA argument ( respect_or_ignore_nulls )? )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // PLSQLCommons.g:309:14: COMMA argument ( respect_or_ignore_nulls )?
            	    {
            	    COMMA120=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_analytic2413); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA120);


            	    pushFollow(FOLLOW_argument_in_function_argument_analytic2415);
            	    argument121=argument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argument.add(argument121.getTree());

            	    // PLSQLCommons.g:309:29: ( respect_or_ignore_nulls )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // PLSQLCommons.g:309:29: respect_or_ignore_nulls
            	            {
            	            pushFollow(FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2417);
            	            respect_or_ignore_nulls122=respect_or_ignore_nulls();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_respect_or_ignore_nulls.add(respect_or_ignore_nulls122.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            RIGHT_PAREN123=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_argument_analytic2432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN123);


            // PLSQLCommons.g:311:10: ( keep_clause )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("over"))||(input.LT(1).getText().equalsIgnoreCase("keep"))||(input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==LEFT_PAREN) && (((input.LT(1).getText().equalsIgnoreCase("over"))||(input.LT(1).getText().equalsIgnoreCase("keep"))))) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("over"))||(input.LT(1).getText().equalsIgnoreCase("keep"))))) {
                        int LA43_4 = input.LA(4);

                        if ( (LA43_4==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("keep")))) {
                            alt43=1;
                        }
                    }
                }
            }
            switch (alt43) {
                case 1 :
                    // PLSQLCommons.g:311:10: keep_clause
                    {
                    pushFollow(FOLLOW_keep_clause_in_function_argument_analytic2443);
                    keep_clause124=keep_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keep_clause.add(keep_clause124.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: keep_clause, argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 312:10: -> ^( ARGUMENTS ( argument )* ( keep_clause )? )
            {
                // PLSQLCommons.g:312:13: ^( ARGUMENTS ( argument )* ( keep_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTS, "ARGUMENTS")
                , root_1);

                // PLSQLCommons.g:312:25: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                // PLSQLCommons.g:312:35: ( keep_clause )?
                if ( stream_keep_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_keep_clause.nextTree());

                }
                stream_keep_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "function_argument_analytic"


    public static class function_argument_modeling_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument_modeling"
    // PLSQLCommons.g:315:1: function_argument_modeling : LEFT_PAREN column_name ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )? using_key ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* ) RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS column_name ( keep_clause )? ) ;
    public final function_argument_modeling_return function_argument_modeling() throws RecognitionException {
        function_argument_modeling_return retval = new function_argument_modeling_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN125=null;
        Token COMMA127=null;
        Token COMMA130=null;
        Token PERIOD135=null;
        Token ASTERISK136=null;
        Token ASTERISK137=null;
        Token COMMA140=null;
        Token RIGHT_PAREN143=null;
        column_name_return column_name126 =null;

        numeric_return numeric128 =null;

        PLSQLParser_PLSQLKeys.null_key_return null_key129 =null;

        numeric_return numeric131 =null;

        PLSQLParser_PLSQLKeys.null_key_return null_key132 =null;

        PLSQLParser_PLSQLKeys.using_key_return using_key133 =null;

        tableview_name_return tableview_name134 =null;

        PLSQLParser_PLSQL_DMLParser.expression_return expression138 =null;

        column_alias_return column_alias139 =null;

        PLSQLParser_PLSQL_DMLParser.expression_return expression141 =null;

        column_alias_return column_alias142 =null;

        keep_clause_return keep_clause144 =null;


        Object LEFT_PAREN125_tree=null;
        Object COMMA127_tree=null;
        Object COMMA130_tree=null;
        Object PERIOD135_tree=null;
        Object ASTERISK136_tree=null;
        Object ASTERISK137_tree=null;
        Object COMMA140_tree=null;
        Object RIGHT_PAREN143_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_using_key=new RewriteRuleSubtreeStream(adaptor,"rule using_key");
        RewriteRuleSubtreeStream stream_numeric=new RewriteRuleSubtreeStream(adaptor,"rule numeric");
        RewriteRuleSubtreeStream stream_null_key=new RewriteRuleSubtreeStream(adaptor,"rule null_key");
        RewriteRuleSubtreeStream stream_column_alias=new RewriteRuleSubtreeStream(adaptor,"rule column_alias");
        RewriteRuleSubtreeStream stream_keep_clause=new RewriteRuleSubtreeStream(adaptor,"rule keep_clause");
        RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name");
        RewriteRuleSubtreeStream stream_tableview_name=new RewriteRuleSubtreeStream(adaptor,"rule tableview_name");
        try {
            // PLSQLCommons.g:316:5: ( LEFT_PAREN column_name ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )? using_key ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* ) RIGHT_PAREN ( keep_clause )? -> ^( ARGUMENTS column_name ( keep_clause )? ) )
            // PLSQLCommons.g:316:10: LEFT_PAREN column_name ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )? using_key ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* ) RIGHT_PAREN ( keep_clause )?
            {
            LEFT_PAREN125=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_function_argument_modeling2485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN125);


            pushFollow(FOLLOW_column_name_in_function_argument_modeling2499);
            column_name126=column_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_column_name.add(column_name126.getTree());

            // PLSQLCommons.g:317:25: ( COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==COMMA) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // PLSQLCommons.g:317:26: COMMA ( numeric | null_key ) ( COMMA ( numeric | null_key ) )?
                    {
                    COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_modeling2502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA127);


                    // PLSQLCommons.g:317:32: ( numeric | null_key )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==APPROXIMATE_NUM_LIT||LA44_0==EXACT_NUM_LIT||LA44_0==UNSIGNED_INTEGER) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==SQL92_RESERVED_NULL) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;

                    }
                    switch (alt44) {
                        case 1 :
                            // PLSQLCommons.g:317:33: numeric
                            {
                            pushFollow(FOLLOW_numeric_in_function_argument_modeling2505);
                            numeric128=numeric();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_numeric.add(numeric128.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:317:41: null_key
                            {
                            pushFollow(FOLLOW_null_key_in_function_argument_modeling2507);
                            null_key129=gPLSQLParser.null_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_null_key.add(null_key129.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:317:51: ( COMMA ( numeric | null_key ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==COMMA) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // PLSQLCommons.g:317:52: COMMA ( numeric | null_key )
                            {
                            COMMA130=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_modeling2511); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA130);


                            // PLSQLCommons.g:317:58: ( numeric | null_key )
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==APPROXIMATE_NUM_LIT||LA45_0==EXACT_NUM_LIT||LA45_0==UNSIGNED_INTEGER) ) {
                                alt45=1;
                            }
                            else if ( (LA45_0==SQL92_RESERVED_NULL) ) {
                                alt45=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 45, 0, input);

                                throw nvae;

                            }
                            switch (alt45) {
                                case 1 :
                                    // PLSQLCommons.g:317:59: numeric
                                    {
                                    pushFollow(FOLLOW_numeric_in_function_argument_modeling2514);
                                    numeric131=numeric();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_numeric.add(numeric131.getTree());

                                    }
                                    break;
                                case 2 :
                                    // PLSQLCommons.g:317:67: null_key
                                    {
                                    pushFollow(FOLLOW_null_key_in_function_argument_modeling2516);
                                    null_key132=gPLSQLParser.null_key();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_null_key.add(null_key132.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_using_key_in_function_argument_modeling2537);
            using_key133=gPLSQLParser.using_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_using_key.add(using_key133.getTree());

            // PLSQLCommons.g:319:17: ( ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK | ASTERISK | expression ( column_alias )? ( COMMA expression ( column_alias )? )* )
            int alt51=3;
            switch ( input.LA(1) ) {
            case INTRODUCER:
                {
                int LA51_1 = input.LA(2);

                if ( (synpred17_PLSQLCommons()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
                }
                break;
            case REGULAR_ID:
                {
                int LA51_2 = input.LA(2);

                if ( (synpred17_PLSQLCommons()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;

                }
                }
                break;
            case DELIMITED_ID:
                {
                int LA51_3 = input.LA(2);

                if ( (synpred17_PLSQLCommons()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 3, input);

                    throw nvae;

                }
                }
                break;
            case ASTERISK:
                {
                alt51=2;
                }
                break;
            case APPROXIMATE_NUM_LIT:
            case BINDVAR:
            case CHAR_STRING:
            case CHAR_STRING_PERL:
            case COLON:
            case EXACT_NUM_LIT:
            case LEFT_PAREN:
            case MINUS_SIGN:
            case NATIONAL_CHAR_STRING_LIT:
            case PLSQL_NON_RESERVED_CONNECT_BY_ROOT:
            case PLUS_SIGN:
            case SQL92_RESERVED_ALL:
            case SQL92_RESERVED_ANY:
            case SQL92_RESERVED_CASE:
            case SQL92_RESERVED_CURSOR:
            case SQL92_RESERVED_DATE:
            case SQL92_RESERVED_DEFAULT:
            case SQL92_RESERVED_DISTINCT:
            case SQL92_RESERVED_EXISTS:
            case SQL92_RESERVED_FALSE:
            case SQL92_RESERVED_NOT:
            case SQL92_RESERVED_NULL:
            case SQL92_RESERVED_PRIOR:
            case SQL92_RESERVED_TRUE:
            case UNSIGNED_INTEGER:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // PLSQLCommons.g:319:19: ( tableview_name PERIOD ASTERISK )=> tableview_name PERIOD ASTERISK
                    {
                    pushFollow(FOLLOW_tableview_name_in_function_argument_modeling2566);
                    tableview_name134=tableview_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableview_name.add(tableview_name134.getTree());

                    PERIOD135=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_function_argument_modeling2568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD135);


                    ASTERISK136=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_function_argument_modeling2570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK136);


                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:320:19: ASTERISK
                    {
                    ASTERISK137=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_function_argument_modeling2590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK137);


                    }
                    break;
                case 3 :
                    // PLSQLCommons.g:321:19: expression ( column_alias )? ( COMMA expression ( column_alias )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function_argument_modeling2610);
                    expression138=gPLSQLParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression138.getTree());

                    // PLSQLCommons.g:321:30: ( column_alias )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0 >= CHAR_STRING && LA48_0 <= CHAR_STRING_PERL)||LA48_0==DELIMITED_ID||LA48_0==INTRODUCER||LA48_0==NATIONAL_CHAR_STRING_LIT||LA48_0==REGULAR_ID||LA48_0==SQL92_RESERVED_AS) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // PLSQLCommons.g:321:30: column_alias
                            {
                            pushFollow(FOLLOW_column_alias_in_function_argument_modeling2612);
                            column_alias139=column_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_column_alias.add(column_alias139.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:321:44: ( COMMA expression ( column_alias )? )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==COMMA) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // PLSQLCommons.g:321:45: COMMA expression ( column_alias )?
                    	    {
                    	    COMMA140=(Token)match(input,COMMA,FOLLOW_COMMA_in_function_argument_modeling2616); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA140);


                    	    pushFollow(FOLLOW_expression_in_function_argument_modeling2618);
                    	    expression141=gPLSQLParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression141.getTree());

                    	    // PLSQLCommons.g:321:62: ( column_alias )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( ((LA49_0 >= CHAR_STRING && LA49_0 <= CHAR_STRING_PERL)||LA49_0==DELIMITED_ID||LA49_0==INTRODUCER||LA49_0==NATIONAL_CHAR_STRING_LIT||LA49_0==REGULAR_ID||LA49_0==SQL92_RESERVED_AS) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // PLSQLCommons.g:321:62: column_alias
                    	            {
                    	            pushFollow(FOLLOW_column_alias_in_function_argument_modeling2620);
                    	            column_alias142=column_alias();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) stream_column_alias.add(column_alias142.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }


            RIGHT_PAREN143=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_function_argument_modeling2652); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN143);


            // PLSQLCommons.g:324:10: ( keep_clause )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==REGULAR_ID) && ((input.LT(1).getText().equalsIgnoreCase("keep")))) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PLSQLCommons.g:324:10: keep_clause
                    {
                    pushFollow(FOLLOW_keep_clause_in_function_argument_modeling2663);
                    keep_clause144=keep_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_keep_clause.add(keep_clause144.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: column_name, keep_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 325:10: -> ^( ARGUMENTS column_name ( keep_clause )? )
            {
                // PLSQLCommons.g:325:13: ^( ARGUMENTS column_name ( keep_clause )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTS, "ARGUMENTS")
                , root_1);

                adaptor.addChild(root_1, stream_column_name.nextTree());

                // PLSQLCommons.g:325:37: ( keep_clause )?
                if ( stream_keep_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_keep_clause.nextTree());

                }
                stream_keep_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "function_argument_modeling"


    public static class respect_or_ignore_nulls_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "respect_or_ignore_nulls"
    // PLSQLCommons.g:328:1: respect_or_ignore_nulls : ( respect_key | ignore_key ) nulls_key ;
    public final respect_or_ignore_nulls_return respect_or_ignore_nulls() throws RecognitionException {
        respect_or_ignore_nulls_return retval = new respect_or_ignore_nulls_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.respect_key_return respect_key145 =null;

        PLSQLParser_PLSQLKeys.ignore_key_return ignore_key146 =null;

        PLSQLParser_PLSQLKeys.nulls_key_return nulls_key147 =null;



        try {
            // PLSQLCommons.g:329:5: ( ( respect_key | ignore_key ) nulls_key )
            // PLSQLCommons.g:329:10: ( respect_key | ignore_key ) nulls_key
            {
            root_0 = (Object)adaptor.nil();


            // PLSQLCommons.g:329:10: ( respect_key | ignore_key )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("respect"))||(input.LT(1).getText().equalsIgnoreCase("ignore"))))) {
                int LA53_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("respect"))) ) {
                    alt53=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("ignore"))) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // PLSQLCommons.g:329:11: respect_key
                    {
                    pushFollow(FOLLOW_respect_key_in_respect_or_ignore_nulls2705);
                    respect_key145=gPLSQLParser.respect_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, respect_key145.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:329:25: ignore_key
                    {
                    pushFollow(FOLLOW_ignore_key_in_respect_or_ignore_nulls2709);
                    ignore_key146=gPLSQLParser.ignore_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ignore_key146.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_nulls_key_in_respect_or_ignore_nulls2712);
            nulls_key147=gPLSQLParser.nulls_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, nulls_key147.getTree());

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
    // $ANTLR end "respect_or_ignore_nulls"


    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // PLSQLCommons.g:332:1: argument : ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )? expression_wrapper -> {mode == 1}? ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) ) -> ^( ARGUMENT expression_wrapper ) ;
    public final argument_return argument() throws RecognitionException {
        argument_return retval = new argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUALS_OP149=null;
        Token GREATER_THAN_OP150=null;
        id_return id148 =null;

        PLSQLParser_PLSQL_DMLParser.expression_wrapper_return expression_wrapper151 =null;


        Object EQUALS_OP149_tree=null;
        Object GREATER_THAN_OP150_tree=null;
        RewriteRuleTokenStream stream_GREATER_THAN_OP=new RewriteRuleTokenStream(adaptor,"token GREATER_THAN_OP");
        RewriteRuleTokenStream stream_EQUALS_OP=new RewriteRuleTokenStream(adaptor,"token EQUALS_OP");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expression_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule expression_wrapper");
            int mode = 0;    
        try {
            // PLSQLCommons.g:334:5: ( ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )? expression_wrapper -> {mode == 1}? ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) ) -> ^( ARGUMENT expression_wrapper ) )
            // PLSQLCommons.g:334:10: ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )? expression_wrapper
            {
            // PLSQLCommons.g:334:10: ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // PLSQLCommons.g:334:11: ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP
                    {
                    pushFollow(FOLLOW_id_in_argument2750);
                    id148=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_id.add(id148.getTree());

                    EQUALS_OP149=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_argument2752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUALS_OP.add(EQUALS_OP149);


                    GREATER_THAN_OP150=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_argument2754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER_THAN_OP.add(GREATER_THAN_OP150);


                    if ( state.backtracking==0 ) {mode = 1;}

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_wrapper_in_argument2760);
            expression_wrapper151=gPLSQLParser.expression_wrapper();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression_wrapper.add(expression_wrapper151.getTree());

            // AST REWRITE
            // elements: expression_wrapper, expression_wrapper, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 335:9: -> {mode == 1}? ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) )
            if (mode == 1) {
                // PLSQLCommons.g:335:24: ^( ARGUMENT expression_wrapper ^( PARAMETER_NAME[$EQUALS_OP] id ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENT, "ARGUMENT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_wrapper.nextTree());

                // PLSQLCommons.g:335:54: ^( PARAMETER_NAME[$EQUALS_OP] id )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMETER_NAME, EQUALS_OP149)
                , root_2);

                adaptor.addChild(root_2, stream_id.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 336:9: -> ^( ARGUMENT expression_wrapper )
            {
                // PLSQLCommons.g:336:12: ^( ARGUMENT expression_wrapper )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENT, "ARGUMENT")
                , root_1);

                adaptor.addChild(root_1, stream_expression_wrapper.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "argument"


    public static class type_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_spec"
    // PLSQLCommons.g:339:1: type_spec : ( datatype | ( ref_key )? type_name ( percent_rowtype_key | percent_type_key )? -> ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? ) );
    public final type_spec_return type_spec() throws RecognitionException {
        type_spec_return retval = new type_spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        datatype_return datatype152 =null;

        PLSQLParser_PLSQLKeys.ref_key_return ref_key153 =null;

        type_name_return type_name154 =null;

        PLSQLParser_PLSQLKeys.percent_rowtype_key_return percent_rowtype_key155 =null;

        PLSQLParser_PLSQLKeys.percent_type_key_return percent_type_key156 =null;


        RewriteRuleSubtreeStream stream_percent_type_key=new RewriteRuleSubtreeStream(adaptor,"rule percent_type_key");
        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        RewriteRuleSubtreeStream stream_percent_rowtype_key=new RewriteRuleSubtreeStream(adaptor,"rule percent_rowtype_key");
        RewriteRuleSubtreeStream stream_ref_key=new RewriteRuleSubtreeStream(adaptor,"rule ref_key");
        try {
            // PLSQLCommons.g:340:5: ( datatype | ( ref_key )? type_name ( percent_rowtype_key | percent_type_key )? -> ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? ) )
            int alt57=2;
            switch ( input.LA(1) ) {
            case REGULAR_ID:
                {
                int LA57_1 = input.LA(2);

                if ( (((input.LT(1).getText().equalsIgnoreCase("mlslabel"))||(input.LT(1).getText().equalsIgnoreCase("positive"))||(input.LT(1).getText().equalsIgnoreCase("string"))||(input.LT(1).getText().equalsIgnoreCase("signtype"))||(input.LT(1).getText().equalsIgnoreCase("pls_integer"))||(input.LT(1).getText().equalsIgnoreCase("interval"))||(input.LT(1).getText().equalsIgnoreCase("int"))||(input.LT(1).getText().equalsIgnoreCase("real"))||(input.LT(1).getText().equalsIgnoreCase("simple_integer"))||(input.LT(1).getText().equalsIgnoreCase("natural"))||(input.LT(1).getText().equalsIgnoreCase("bfile"))||(input.LT(1).getText().equalsIgnoreCase("binary_integer"))||(input.LT(1).getText().equalsIgnoreCase("char"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_ltz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("binary_float"))||(input.LT(1).getText().equalsIgnoreCase("binary_double"))||(input.LT(1).getText().equalsIgnoreCase("positiven"))||(input.LT(1).getText().equalsIgnoreCase("timestamp"))||(input.LT(1).getText().equalsIgnoreCase("second"))||(input.LT(1).getText().equalsIgnoreCase("rowid"))||(input.LT(1).getText().equalsIgnoreCase("double"))||(input.LT(1).getText().equalsIgnoreCase("dec"))||(input.LT(1).getText().equalsIgnoreCase("month"))||(input.LT(1).getText().equalsIgnoreCase("float"))||(input.LT(1).getText().equalsIgnoreCase("urowid"))||(input.LT(1).getText().equalsIgnoreCase("nclob"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_tz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("timezone_minute"))||(input.LT(1).getText().equalsIgnoreCase("dsinterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("year"))||(input.LT(1).getText().equalsIgnoreCase("decimal"))||(input.LT(1).getText().equalsIgnoreCase("blob"))||(input.LT(1).getText().equalsIgnoreCase("nvarchar2"))||(input.LT(1).getText().equalsIgnoreCase("number"))||(input.LT(1).getText().equalsIgnoreCase("timezone_abbr"))||(input.LT(1).getText().equalsIgnoreCase("smallint"))||(input.LT(1).getText().equalsIgnoreCase("yminterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("minute"))||(input.LT(1).getText().equalsIgnoreCase("integer"))||(input.LT(1).getText().equalsIgnoreCase("varchar"))||(input.LT(1).getText().equalsIgnoreCase("numeric"))||(input.LT(1).getText().equalsIgnoreCase("varchar2"))||(input.LT(1).getText().equalsIgnoreCase("raw"))||(input.LT(1).getText().equalsIgnoreCase("naturaln"))||(input.LT(1).getText().equalsIgnoreCase("clob"))||(input.LT(1).getText().equalsIgnoreCase("hour"))||(input.LT(1).getText().equalsIgnoreCase("boolean"))||(input.LT(1).getText().equalsIgnoreCase("nchar"))||(input.LT(1).getText().equalsIgnoreCase("timezone_hour"))||(input.LT(1).getText().equalsIgnoreCase("long"))||(input.LT(1).getText().equalsIgnoreCase("character"))||(input.LT(1).getText().equalsIgnoreCase("day"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("timezone_region")))) ) {
                    alt57=1;
                }
                else if ( (true) ) {
                    alt57=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;

                }
                }
                break;
            case SQL92_RESERVED_DATE:
                {
                alt57=1;
                }
                break;
            case DELIMITED_ID:
                {
                alt57=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // PLSQLCommons.g:340:11: datatype
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_datatype_in_type_spec2821);
                    datatype152=datatype();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datatype152.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:341:10: ( ref_key )? type_name ( percent_rowtype_key | percent_type_key )?
                    {
                    // PLSQLCommons.g:341:10: ( ref_key )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==REGULAR_ID) ) {
                        int LA55_1 = input.LA(2);

                        if ( (LA55_1==REGULAR_ID) ) {
                            int LA55_3 = input.LA(3);

                            if ( ((input.LT(1).getText().equalsIgnoreCase("ref"))) ) {
                                alt55=1;
                            }
                        }
                        else if ( (LA55_1==DELIMITED_ID) && ((input.LT(1).getText().equalsIgnoreCase("ref")))) {
                            alt55=1;
                        }
                    }
                    switch (alt55) {
                        case 1 :
                            // PLSQLCommons.g:341:10: ref_key
                            {
                            pushFollow(FOLLOW_ref_key_in_type_spec2832);
                            ref_key153=gPLSQLParser.ref_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ref_key.add(ref_key153.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_name_in_type_spec2835);
                    type_name154=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(type_name154.getTree());

                    // PLSQLCommons.g:341:29: ( percent_rowtype_key | percent_type_key )?
                    int alt56=3;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==PERCENT) && (((input.LT(2).getText().equalsIgnoreCase("type"))||(input.LT(2).getText().equalsIgnoreCase("rowtype"))))) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==REGULAR_ID) && (((input.LT(2).getText().equalsIgnoreCase("type"))||(input.LT(2).getText().equalsIgnoreCase("rowtype"))))) {
                            int LA56_3 = input.LA(3);

                            if ( ((input.LT(2).getText().equalsIgnoreCase("rowtype"))) ) {
                                alt56=1;
                            }
                            else if ( ((input.LT(2).getText().equalsIgnoreCase("type"))) ) {
                                alt56=2;
                            }
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // PLSQLCommons.g:341:30: percent_rowtype_key
                            {
                            pushFollow(FOLLOW_percent_rowtype_key_in_type_spec2838);
                            percent_rowtype_key155=gPLSQLParser.percent_rowtype_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_percent_rowtype_key.add(percent_rowtype_key155.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:341:50: percent_type_key
                            {
                            pushFollow(FOLLOW_percent_type_key_in_type_spec2840);
                            percent_type_key156=gPLSQLParser.percent_type_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_percent_type_key.add(percent_type_key156.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: percent_type_key, type_name, percent_rowtype_key, ref_key
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:69: -> ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? )
                    {
                        // PLSQLCommons.g:341:72: ^( CUSTOM_TYPE type_name ( ref_key )? ( percent_rowtype_key )? ( percent_type_key )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(CUSTOM_TYPE, "CUSTOM_TYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_type_name.nextTree());

                        // PLSQLCommons.g:341:96: ( ref_key )?
                        if ( stream_ref_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_ref_key.nextTree());

                        }
                        stream_ref_key.reset();

                        // PLSQLCommons.g:341:105: ( percent_rowtype_key )?
                        if ( stream_percent_rowtype_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_percent_rowtype_key.nextTree());

                        }
                        stream_percent_rowtype_key.reset();

                        // PLSQLCommons.g:341:126: ( percent_type_key )?
                        if ( stream_percent_type_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_percent_type_key.nextTree());

                        }
                        stream_percent_type_key.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

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
    // $ANTLR end "type_spec"


    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datatype"
    // PLSQLCommons.g:344:1: datatype : ( native_datatype_element ( precision_part )? ( with_key ( local_key )? time_key zone_key )? -> ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? ) | interval_key ( year_key | day_key ) ( LEFT_PAREN expression_wrapper RIGHT_PAREN )? to_key ( month_key | second_key ) ( LEFT_PAREN expression_wrapper RIGHT_PAREN )? -> ^( INTERVAL_DATATYPE[$interval_key.start] ( year_key )? ( day_key )? ( month_key )? ( second_key )? ( expression_wrapper )* ) );
    public final datatype_return datatype() throws RecognitionException {
        datatype_return retval = new datatype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN166=null;
        Token RIGHT_PAREN168=null;
        Token LEFT_PAREN172=null;
        Token RIGHT_PAREN174=null;
        native_datatype_element_return native_datatype_element157 =null;

        precision_part_return precision_part158 =null;

        PLSQLParser_PLSQLKeys.with_key_return with_key159 =null;

        PLSQLParser_PLSQLKeys.local_key_return local_key160 =null;

        PLSQLParser_PLSQLKeys.time_key_return time_key161 =null;

        PLSQLParser_PLSQLKeys.zone_key_return zone_key162 =null;

        PLSQLParser_PLSQLKeys.interval_key_return interval_key163 =null;

        PLSQLParser_PLSQLKeys.year_key_return year_key164 =null;

        PLSQLParser_PLSQLKeys.day_key_return day_key165 =null;

        PLSQLParser_PLSQL_DMLParser.expression_wrapper_return expression_wrapper167 =null;

        PLSQLParser_PLSQLKeys.to_key_return to_key169 =null;

        PLSQLParser_PLSQLKeys.month_key_return month_key170 =null;

        PLSQLParser_PLSQLKeys.second_key_return second_key171 =null;

        PLSQLParser_PLSQL_DMLParser.expression_wrapper_return expression_wrapper173 =null;


        Object LEFT_PAREN166_tree=null;
        Object RIGHT_PAREN168_tree=null;
        Object LEFT_PAREN172_tree=null;
        Object RIGHT_PAREN174_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleSubtreeStream stream_with_key=new RewriteRuleSubtreeStream(adaptor,"rule with_key");
        RewriteRuleSubtreeStream stream_second_key=new RewriteRuleSubtreeStream(adaptor,"rule second_key");
        RewriteRuleSubtreeStream stream_day_key=new RewriteRuleSubtreeStream(adaptor,"rule day_key");
        RewriteRuleSubtreeStream stream_local_key=new RewriteRuleSubtreeStream(adaptor,"rule local_key");
        RewriteRuleSubtreeStream stream_expression_wrapper=new RewriteRuleSubtreeStream(adaptor,"rule expression_wrapper");
        RewriteRuleSubtreeStream stream_to_key=new RewriteRuleSubtreeStream(adaptor,"rule to_key");
        RewriteRuleSubtreeStream stream_precision_part=new RewriteRuleSubtreeStream(adaptor,"rule precision_part");
        RewriteRuleSubtreeStream stream_native_datatype_element=new RewriteRuleSubtreeStream(adaptor,"rule native_datatype_element");
        RewriteRuleSubtreeStream stream_month_key=new RewriteRuleSubtreeStream(adaptor,"rule month_key");
        RewriteRuleSubtreeStream stream_year_key=new RewriteRuleSubtreeStream(adaptor,"rule year_key");
        RewriteRuleSubtreeStream stream_interval_key=new RewriteRuleSubtreeStream(adaptor,"rule interval_key");
        RewriteRuleSubtreeStream stream_zone_key=new RewriteRuleSubtreeStream(adaptor,"rule zone_key");
        RewriteRuleSubtreeStream stream_time_key=new RewriteRuleSubtreeStream(adaptor,"rule time_key");
        try {
            // PLSQLCommons.g:345:5: ( native_datatype_element ( precision_part )? ( with_key ( local_key )? time_key zone_key )? -> ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? ) | interval_key ( year_key | day_key ) ( LEFT_PAREN expression_wrapper RIGHT_PAREN )? to_key ( month_key | second_key ) ( LEFT_PAREN expression_wrapper RIGHT_PAREN )? -> ^( INTERVAL_DATATYPE[$interval_key.start] ( year_key )? ( day_key )? ( month_key )? ( second_key )? ( expression_wrapper )* ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==REGULAR_ID) ) {
                int LA65_1 = input.LA(2);

                if ( (((input.LT(1).getText().equalsIgnoreCase("mlslabel"))||(input.LT(1).getText().equalsIgnoreCase("positive"))||(input.LT(1).getText().equalsIgnoreCase("string"))||(input.LT(1).getText().equalsIgnoreCase("signtype"))||(input.LT(1).getText().equalsIgnoreCase("pls_integer"))||(input.LT(1).getText().equalsIgnoreCase("int"))||(input.LT(1).getText().equalsIgnoreCase("real"))||(input.LT(1).getText().equalsIgnoreCase("simple_integer"))||(input.LT(1).getText().equalsIgnoreCase("natural"))||(input.LT(1).getText().equalsIgnoreCase("bfile"))||(input.LT(1).getText().equalsIgnoreCase("binary_integer"))||(input.LT(1).getText().equalsIgnoreCase("char"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_ltz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("binary_float"))||(input.LT(1).getText().equalsIgnoreCase("binary_double"))||(input.LT(1).getText().equalsIgnoreCase("positiven"))||(input.LT(1).getText().equalsIgnoreCase("second"))||(input.LT(1).getText().equalsIgnoreCase("timestamp"))||(input.LT(1).getText().equalsIgnoreCase("rowid"))||(input.LT(1).getText().equalsIgnoreCase("double"))||(input.LT(1).getText().equalsIgnoreCase("month"))||(input.LT(1).getText().equalsIgnoreCase("dec"))||(input.LT(1).getText().equalsIgnoreCase("urowid"))||(input.LT(1).getText().equalsIgnoreCase("float"))||(input.LT(1).getText().equalsIgnoreCase("nclob"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_tz_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("timezone_minute"))||(input.LT(1).getText().equalsIgnoreCase("dsinterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("year"))||(input.LT(1).getText().equalsIgnoreCase("decimal"))||(input.LT(1).getText().equalsIgnoreCase("blob"))||(input.LT(1).getText().equalsIgnoreCase("nvarchar2"))||(input.LT(1).getText().equalsIgnoreCase("number"))||(input.LT(1).getText().equalsIgnoreCase("timezone_abbr"))||(input.LT(1).getText().equalsIgnoreCase("smallint"))||(input.LT(1).getText().equalsIgnoreCase("yminterval_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("minute"))||(input.LT(1).getText().equalsIgnoreCase("integer"))||(input.LT(1).getText().equalsIgnoreCase("varchar"))||(input.LT(1).getText().equalsIgnoreCase("numeric"))||(input.LT(1).getText().equalsIgnoreCase("varchar2"))||(input.LT(1).getText().equalsIgnoreCase("raw"))||(input.LT(1).getText().equalsIgnoreCase("naturaln"))||(input.LT(1).getText().equalsIgnoreCase("clob"))||(input.LT(1).getText().equalsIgnoreCase("hour"))||(input.LT(1).getText().equalsIgnoreCase("boolean"))||(input.LT(1).getText().equalsIgnoreCase("nchar"))||(input.LT(1).getText().equalsIgnoreCase("timezone_hour"))||(input.LT(1).getText().equalsIgnoreCase("long"))||(input.LT(1).getText().equalsIgnoreCase("character"))||(input.LT(1).getText().equalsIgnoreCase("day"))||(input.LT(1).getText().equalsIgnoreCase("timestamp_unconstrained"))||(input.LT(1).getText().equalsIgnoreCase("timezone_region")))) ) {
                    alt65=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("interval"))) ) {
                    alt65=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA65_0==SQL92_RESERVED_DATE) ) {
                alt65=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // PLSQLCommons.g:345:10: native_datatype_element ( precision_part )? ( with_key ( local_key )? time_key zone_key )?
                    {
                    pushFollow(FOLLOW_native_datatype_element_in_datatype2879);
                    native_datatype_element157=native_datatype_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_native_datatype_element.add(native_datatype_element157.getTree());

                    // PLSQLCommons.g:346:9: ( precision_part )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==LEFT_PAREN) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // PLSQLCommons.g:346:9: precision_part
                            {
                            pushFollow(FOLLOW_precision_part_in_datatype2889);
                            precision_part158=precision_part();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_precision_part.add(precision_part158.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:347:9: ( with_key ( local_key )? time_key zone_key )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==SQL92_RESERVED_WITH) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // PLSQLCommons.g:347:10: with_key ( local_key )? time_key zone_key
                            {
                            pushFollow(FOLLOW_with_key_in_datatype2901);
                            with_key159=gPLSQLParser.with_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_with_key.add(with_key159.getTree());

                            // PLSQLCommons.g:347:19: ( local_key )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==REGULAR_ID) ) {
                                int LA59_1 = input.LA(2);

                                if ( (LA59_1==REGULAR_ID) ) {
                                    int LA59_2 = input.LA(3);

                                    if ( (LA59_2==REGULAR_ID) ) {
                                        int LA59_4 = input.LA(4);

                                        if ( ((input.LT(1).getText().equalsIgnoreCase("local"))) ) {
                                            alt59=1;
                                        }
                                    }
                                }
                            }
                            switch (alt59) {
                                case 1 :
                                    // PLSQLCommons.g:347:19: local_key
                                    {
                                    pushFollow(FOLLOW_local_key_in_datatype2903);
                                    local_key160=gPLSQLParser.local_key();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_local_key.add(local_key160.getTree());

                                    }
                                    break;

                            }


                            pushFollow(FOLLOW_time_key_in_datatype2906);
                            time_key161=gPLSQLParser.time_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_time_key.add(time_key161.getTree());

                            pushFollow(FOLLOW_zone_key_in_datatype2908);
                            zone_key162=gPLSQLParser.zone_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_zone_key.add(zone_key162.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: local_key, precision_part, time_key, native_datatype_element
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:9: -> ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? )
                    {
                        // PLSQLCommons.g:348:12: ^( NATIVE_DATATYPE native_datatype_element ( precision_part )? ( time_key )? ( local_key )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NATIVE_DATATYPE, "NATIVE_DATATYPE")
                        , root_1);

                        adaptor.addChild(root_1, stream_native_datatype_element.nextTree());

                        // PLSQLCommons.g:348:54: ( precision_part )?
                        if ( stream_precision_part.hasNext() ) {
                            adaptor.addChild(root_1, stream_precision_part.nextTree());

                        }
                        stream_precision_part.reset();

                        // PLSQLCommons.g:348:70: ( time_key )?
                        if ( stream_time_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_time_key.nextTree());

                        }
                        stream_time_key.reset();

                        // PLSQLCommons.g:348:80: ( local_key )?
                        if ( stream_local_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_local_key.nextTree());

                        }
                        stream_local_key.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:349:10: interval_key ( year_key | day_key ) ( LEFT_PAREN expression_wrapper RIGHT_PAREN )? to_key ( month_key | second_key ) ( LEFT_PAREN expression_wrapper RIGHT_PAREN )?
                    {
                    pushFollow(FOLLOW_interval_key_in_datatype2946);
                    interval_key163=gPLSQLParser.interval_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_interval_key.add(interval_key163.getTree());

                    // PLSQLCommons.g:349:23: ( year_key | day_key )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("day"))||(input.LT(1).getText().equalsIgnoreCase("year"))))) {
                        int LA61_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("year"))) ) {
                            alt61=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
                            alt61=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;

                    }
                    switch (alt61) {
                        case 1 :
                            // PLSQLCommons.g:349:24: year_key
                            {
                            pushFollow(FOLLOW_year_key_in_datatype2949);
                            year_key164=gPLSQLParser.year_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_year_key.add(year_key164.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:349:33: day_key
                            {
                            pushFollow(FOLLOW_day_key_in_datatype2951);
                            day_key165=gPLSQLParser.day_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_day_key.add(day_key165.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:350:17: ( LEFT_PAREN expression_wrapper RIGHT_PAREN )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==LEFT_PAREN) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // PLSQLCommons.g:350:18: LEFT_PAREN expression_wrapper RIGHT_PAREN
                            {
                            LEFT_PAREN166=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_datatype2971); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN166);


                            pushFollow(FOLLOW_expression_wrapper_in_datatype2973);
                            expression_wrapper167=gPLSQLParser.expression_wrapper();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression_wrapper.add(expression_wrapper167.getTree());

                            RIGHT_PAREN168=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_datatype2975); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN168);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_to_key_in_datatype2992);
                    to_key169=gPLSQLParser.to_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_to_key.add(to_key169.getTree());

                    // PLSQLCommons.g:351:20: ( month_key | second_key )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==REGULAR_ID) ) {
                        int LA63_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("month"))) ) {
                            alt63=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
                            alt63=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 63, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;

                    }
                    switch (alt63) {
                        case 1 :
                            // PLSQLCommons.g:351:21: month_key
                            {
                            pushFollow(FOLLOW_month_key_in_datatype2995);
                            month_key170=gPLSQLParser.month_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_month_key.add(month_key170.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:351:31: second_key
                            {
                            pushFollow(FOLLOW_second_key_in_datatype2997);
                            second_key171=gPLSQLParser.second_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_second_key.add(second_key171.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:352:17: ( LEFT_PAREN expression_wrapper RIGHT_PAREN )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==LEFT_PAREN) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // PLSQLCommons.g:352:18: LEFT_PAREN expression_wrapper RIGHT_PAREN
                            {
                            LEFT_PAREN172=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_datatype3018); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN172);


                            pushFollow(FOLLOW_expression_wrapper_in_datatype3020);
                            expression_wrapper173=gPLSQLParser.expression_wrapper();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression_wrapper.add(expression_wrapper173.getTree());

                            RIGHT_PAREN174=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_datatype3022); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN174);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expression_wrapper, day_key, month_key, second_key, year_key
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 353:9: -> ^( INTERVAL_DATATYPE[$interval_key.start] ( year_key )? ( day_key )? ( month_key )? ( second_key )? ( expression_wrapper )* )
                    {
                        // PLSQLCommons.g:353:12: ^( INTERVAL_DATATYPE[$interval_key.start] ( year_key )? ( day_key )? ( month_key )? ( second_key )? ( expression_wrapper )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(INTERVAL_DATATYPE, (interval_key163!=null?((Token)interval_key163.start):null))
                        , root_1);

                        // PLSQLCommons.g:353:53: ( year_key )?
                        if ( stream_year_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_year_key.nextTree());

                        }
                        stream_year_key.reset();

                        // PLSQLCommons.g:353:63: ( day_key )?
                        if ( stream_day_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_day_key.nextTree());

                        }
                        stream_day_key.reset();

                        // PLSQLCommons.g:353:72: ( month_key )?
                        if ( stream_month_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_month_key.nextTree());

                        }
                        stream_month_key.reset();

                        // PLSQLCommons.g:353:83: ( second_key )?
                        if ( stream_second_key.hasNext() ) {
                            adaptor.addChild(root_1, stream_second_key.nextTree());

                        }
                        stream_second_key.reset();

                        // PLSQLCommons.g:353:95: ( expression_wrapper )*
                        while ( stream_expression_wrapper.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression_wrapper.nextTree());

                        }
                        stream_expression_wrapper.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

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
    // $ANTLR end "datatype"


    public static class precision_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "precision_part"
    // PLSQLCommons.g:356:1: precision_part : LEFT_PAREN numeric ( COMMA numeric )? ( char_key | byte_key )? RIGHT_PAREN -> ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? ) ;
    public final precision_part_return precision_part() throws RecognitionException {
        precision_part_return retval = new precision_part_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN175=null;
        Token COMMA177=null;
        Token RIGHT_PAREN181=null;
        numeric_return numeric176 =null;

        numeric_return numeric178 =null;

        PLSQLParser_PLSQLKeys.char_key_return char_key179 =null;

        PLSQLParser_PLSQLKeys.byte_key_return byte_key180 =null;


        Object LEFT_PAREN175_tree=null;
        Object COMMA177_tree=null;
        Object RIGHT_PAREN181_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_numeric=new RewriteRuleSubtreeStream(adaptor,"rule numeric");
        RewriteRuleSubtreeStream stream_byte_key=new RewriteRuleSubtreeStream(adaptor,"rule byte_key");
        RewriteRuleSubtreeStream stream_char_key=new RewriteRuleSubtreeStream(adaptor,"rule char_key");
        try {
            // PLSQLCommons.g:357:5: ( LEFT_PAREN numeric ( COMMA numeric )? ( char_key | byte_key )? RIGHT_PAREN -> ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? ) )
            // PLSQLCommons.g:357:10: LEFT_PAREN numeric ( COMMA numeric )? ( char_key | byte_key )? RIGHT_PAREN
            {
            LEFT_PAREN175=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_precision_part3074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN175);


            pushFollow(FOLLOW_numeric_in_precision_part3076);
            numeric176=numeric();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_numeric.add(numeric176.getTree());

            // PLSQLCommons.g:357:29: ( COMMA numeric )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==COMMA) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // PLSQLCommons.g:357:30: COMMA numeric
                    {
                    COMMA177=(Token)match(input,COMMA,FOLLOW_COMMA_in_precision_part3079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA177);


                    pushFollow(FOLLOW_numeric_in_precision_part3081);
                    numeric178=numeric();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_numeric.add(numeric178.getTree());

                    }
                    break;

            }


            // PLSQLCommons.g:357:46: ( char_key | byte_key )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==REGULAR_ID) && (((input.LT(1).getText().equalsIgnoreCase("char"))||(input.LT(1).getText().equalsIgnoreCase("byte"))))) {
                int LA67_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("char"))) ) {
                    alt67=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("byte"))) ) {
                    alt67=2;
                }
            }
            switch (alt67) {
                case 1 :
                    // PLSQLCommons.g:357:47: char_key
                    {
                    pushFollow(FOLLOW_char_key_in_precision_part3086);
                    char_key179=gPLSQLParser.char_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_char_key.add(char_key179.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:357:58: byte_key
                    {
                    pushFollow(FOLLOW_byte_key_in_precision_part3090);
                    byte_key180=gPLSQLParser.byte_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_byte_key.add(byte_key180.getTree());

                    }
                    break;

            }


            RIGHT_PAREN181=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_precision_part3094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN181);


            // AST REWRITE
            // elements: char_key, numeric, byte_key
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 358:9: -> ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? )
            {
                // PLSQLCommons.g:358:12: ^( PRECISION ( numeric )+ ( char_key )? ( byte_key )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PRECISION, "PRECISION")
                , root_1);

                if ( !(stream_numeric.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_numeric.hasNext() ) {
                    adaptor.addChild(root_1, stream_numeric.nextTree());

                }
                stream_numeric.reset();

                // PLSQLCommons.g:358:33: ( char_key )?
                if ( stream_char_key.hasNext() ) {
                    adaptor.addChild(root_1, stream_char_key.nextTree());

                }
                stream_char_key.reset();

                // PLSQLCommons.g:358:43: ( byte_key )?
                if ( stream_byte_key.hasNext() ) {
                    adaptor.addChild(root_1, stream_byte_key.nextTree());

                }
                stream_byte_key.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "precision_part"


    public static class native_datatype_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "native_datatype_element"
    // PLSQLCommons.g:361:1: native_datatype_element : ( binary_integer_key | pls_integer_key | natural_key | binary_float_key | binary_double_key | naturaln_key | positive_key | positiven_key | signtype_key | simple_integer_key | nvarchar2_key | dec_key | integer_key | int_key | numeric_key | smallint_key | number_key | decimal_key | double_key ( precision_key )? | float_key | real_key | nchar_key | long_key ( raw_key )? | char_key | character_key | varchar2_key | varchar_key | string_key | raw_key | boolean_key | date_key | rowid_key | urowid_key | year_key | month_key | day_key | hour_key | minute_key | second_key | timezone_hour_key | timezone_minute_key | timezone_region_key | timezone_abbr_key | timestamp_key | timestamp_unconstrained_key | timestamp_tz_unconstrained_key | timestamp_ltz_unconstrained_key | yminterval_unconstrained_key | dsinterval_unconstrained_key | bfile_key | blob_key | clob_key | nclob_key | mlslabel_key );
    public final native_datatype_element_return native_datatype_element() throws RecognitionException {
        native_datatype_element_return retval = new native_datatype_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PLSQLParser_PLSQLKeys.binary_integer_key_return binary_integer_key182 =null;

        PLSQLParser_PLSQLKeys.pls_integer_key_return pls_integer_key183 =null;

        PLSQLParser_PLSQLKeys.natural_key_return natural_key184 =null;

        PLSQLParser_PLSQLKeys.binary_float_key_return binary_float_key185 =null;

        PLSQLParser_PLSQLKeys.binary_double_key_return binary_double_key186 =null;

        PLSQLParser_PLSQLKeys.naturaln_key_return naturaln_key187 =null;

        PLSQLParser_PLSQLKeys.positive_key_return positive_key188 =null;

        PLSQLParser_PLSQLKeys.positiven_key_return positiven_key189 =null;

        PLSQLParser_PLSQLKeys.signtype_key_return signtype_key190 =null;

        PLSQLParser_PLSQLKeys.simple_integer_key_return simple_integer_key191 =null;

        PLSQLParser_PLSQLKeys.nvarchar2_key_return nvarchar2_key192 =null;

        PLSQLParser_PLSQLKeys.dec_key_return dec_key193 =null;

        PLSQLParser_PLSQLKeys.integer_key_return integer_key194 =null;

        PLSQLParser_PLSQLKeys.int_key_return int_key195 =null;

        PLSQLParser_PLSQLKeys.numeric_key_return numeric_key196 =null;

        PLSQLParser_PLSQLKeys.smallint_key_return smallint_key197 =null;

        PLSQLParser_PLSQLKeys.number_key_return number_key198 =null;

        PLSQLParser_PLSQLKeys.decimal_key_return decimal_key199 =null;

        PLSQLParser_PLSQLKeys.double_key_return double_key200 =null;

        PLSQLParser_PLSQLKeys.precision_key_return precision_key201 =null;

        PLSQLParser_PLSQLKeys.float_key_return float_key202 =null;

        PLSQLParser_PLSQLKeys.real_key_return real_key203 =null;

        PLSQLParser_PLSQLKeys.nchar_key_return nchar_key204 =null;

        PLSQLParser_PLSQLKeys.long_key_return long_key205 =null;

        PLSQLParser_PLSQLKeys.raw_key_return raw_key206 =null;

        PLSQLParser_PLSQLKeys.char_key_return char_key207 =null;

        PLSQLParser_PLSQLKeys.character_key_return character_key208 =null;

        PLSQLParser_PLSQLKeys.varchar2_key_return varchar2_key209 =null;

        PLSQLParser_PLSQLKeys.varchar_key_return varchar_key210 =null;

        PLSQLParser_PLSQLKeys.string_key_return string_key211 =null;

        PLSQLParser_PLSQLKeys.raw_key_return raw_key212 =null;

        PLSQLParser_PLSQLKeys.boolean_key_return boolean_key213 =null;

        PLSQLParser_PLSQLKeys.date_key_return date_key214 =null;

        PLSQLParser_PLSQLKeys.rowid_key_return rowid_key215 =null;

        PLSQLParser_PLSQLKeys.urowid_key_return urowid_key216 =null;

        PLSQLParser_PLSQLKeys.year_key_return year_key217 =null;

        PLSQLParser_PLSQLKeys.month_key_return month_key218 =null;

        PLSQLParser_PLSQLKeys.day_key_return day_key219 =null;

        PLSQLParser_PLSQLKeys.hour_key_return hour_key220 =null;

        PLSQLParser_PLSQLKeys.minute_key_return minute_key221 =null;

        PLSQLParser_PLSQLKeys.second_key_return second_key222 =null;

        PLSQLParser_PLSQLKeys.timezone_hour_key_return timezone_hour_key223 =null;

        PLSQLParser_PLSQLKeys.timezone_minute_key_return timezone_minute_key224 =null;

        PLSQLParser_PLSQLKeys.timezone_region_key_return timezone_region_key225 =null;

        PLSQLParser_PLSQLKeys.timezone_abbr_key_return timezone_abbr_key226 =null;

        PLSQLParser_PLSQLKeys.timestamp_key_return timestamp_key227 =null;

        PLSQLParser_PLSQLKeys.timestamp_unconstrained_key_return timestamp_unconstrained_key228 =null;

        PLSQLParser_PLSQLKeys.timestamp_tz_unconstrained_key_return timestamp_tz_unconstrained_key229 =null;

        PLSQLParser_PLSQLKeys.timestamp_ltz_unconstrained_key_return timestamp_ltz_unconstrained_key230 =null;

        PLSQLParser_PLSQLKeys.yminterval_unconstrained_key_return yminterval_unconstrained_key231 =null;

        PLSQLParser_PLSQLKeys.dsinterval_unconstrained_key_return dsinterval_unconstrained_key232 =null;

        PLSQLParser_PLSQLKeys.bfile_key_return bfile_key233 =null;

        PLSQLParser_PLSQLKeys.blob_key_return blob_key234 =null;

        PLSQLParser_PLSQLKeys.clob_key_return clob_key235 =null;

        PLSQLParser_PLSQLKeys.nclob_key_return nclob_key236 =null;

        PLSQLParser_PLSQLKeys.mlslabel_key_return mlslabel_key237 =null;



        try {
            // PLSQLCommons.g:362:5: ( binary_integer_key | pls_integer_key | natural_key | binary_float_key | binary_double_key | naturaln_key | positive_key | positiven_key | signtype_key | simple_integer_key | nvarchar2_key | dec_key | integer_key | int_key | numeric_key | smallint_key | number_key | decimal_key | double_key ( precision_key )? | float_key | real_key | nchar_key | long_key ( raw_key )? | char_key | character_key | varchar2_key | varchar_key | string_key | raw_key | boolean_key | date_key | rowid_key | urowid_key | year_key | month_key | day_key | hour_key | minute_key | second_key | timezone_hour_key | timezone_minute_key | timezone_region_key | timezone_abbr_key | timestamp_key | timestamp_unconstrained_key | timestamp_tz_unconstrained_key | timestamp_ltz_unconstrained_key | yminterval_unconstrained_key | dsinterval_unconstrained_key | bfile_key | blob_key | clob_key | nclob_key | mlslabel_key )
            int alt70=54;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==REGULAR_ID) ) {
                int LA70_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("binary_integer"))) ) {
                    alt70=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("pls_integer"))) ) {
                    alt70=2;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("natural"))) ) {
                    alt70=3;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("binary_float"))) ) {
                    alt70=4;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("binary_double"))) ) {
                    alt70=5;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("naturaln"))) ) {
                    alt70=6;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("positive"))) ) {
                    alt70=7;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("positiven"))) ) {
                    alt70=8;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("signtype"))) ) {
                    alt70=9;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("simple_integer"))) ) {
                    alt70=10;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("nvarchar2"))) ) {
                    alt70=11;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("dec"))) ) {
                    alt70=12;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("integer"))) ) {
                    alt70=13;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("int"))) ) {
                    alt70=14;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("numeric"))) ) {
                    alt70=15;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("smallint"))) ) {
                    alt70=16;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("number"))) ) {
                    alt70=17;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("decimal"))) ) {
                    alt70=18;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("double"))) ) {
                    alt70=19;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("float"))) ) {
                    alt70=20;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("real"))) ) {
                    alt70=21;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("nchar"))) ) {
                    alt70=22;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("long"))) ) {
                    alt70=23;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("char"))) ) {
                    alt70=24;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("character"))) ) {
                    alt70=25;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("varchar2"))) ) {
                    alt70=26;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("varchar"))) ) {
                    alt70=27;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("string"))) ) {
                    alt70=28;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("raw"))) ) {
                    alt70=29;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("boolean"))) ) {
                    alt70=30;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("rowid"))) ) {
                    alt70=32;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("urowid"))) ) {
                    alt70=33;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("year"))) ) {
                    alt70=34;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("month"))) ) {
                    alt70=35;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
                    alt70=36;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("hour"))) ) {
                    alt70=37;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("minute"))) ) {
                    alt70=38;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
                    alt70=39;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_hour"))) ) {
                    alt70=40;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_minute"))) ) {
                    alt70=41;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_region"))) ) {
                    alt70=42;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timezone_abbr"))) ) {
                    alt70=43;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp"))) ) {
                    alt70=44;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp_unconstrained"))) ) {
                    alt70=45;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp_tz_unconstrained"))) ) {
                    alt70=46;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp_ltz_unconstrained"))) ) {
                    alt70=47;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("yminterval_unconstrained"))) ) {
                    alt70=48;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("dsinterval_unconstrained"))) ) {
                    alt70=49;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("bfile"))) ) {
                    alt70=50;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("blob"))) ) {
                    alt70=51;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("clob"))) ) {
                    alt70=52;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("nclob"))) ) {
                    alt70=53;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("mlslabel"))) ) {
                    alt70=54;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA70_0==SQL92_RESERVED_DATE) ) {
                alt70=31;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // PLSQLCommons.g:362:10: binary_integer_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_binary_integer_key_in_native_datatype_element3137);
                    binary_integer_key182=gPLSQLParser.binary_integer_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_integer_key182.getTree());

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:363:10: pls_integer_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_pls_integer_key_in_native_datatype_element3148);
                    pls_integer_key183=gPLSQLParser.pls_integer_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pls_integer_key183.getTree());

                    }
                    break;
                case 3 :
                    // PLSQLCommons.g:364:10: natural_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_natural_key_in_native_datatype_element3159);
                    natural_key184=gPLSQLParser.natural_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, natural_key184.getTree());

                    }
                    break;
                case 4 :
                    // PLSQLCommons.g:365:10: binary_float_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_binary_float_key_in_native_datatype_element3170);
                    binary_float_key185=gPLSQLParser.binary_float_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_float_key185.getTree());

                    }
                    break;
                case 5 :
                    // PLSQLCommons.g:366:10: binary_double_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_binary_double_key_in_native_datatype_element3181);
                    binary_double_key186=gPLSQLParser.binary_double_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, binary_double_key186.getTree());

                    }
                    break;
                case 6 :
                    // PLSQLCommons.g:367:10: naturaln_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_naturaln_key_in_native_datatype_element3192);
                    naturaln_key187=gPLSQLParser.naturaln_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, naturaln_key187.getTree());

                    }
                    break;
                case 7 :
                    // PLSQLCommons.g:368:10: positive_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_positive_key_in_native_datatype_element3203);
                    positive_key188=gPLSQLParser.positive_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, positive_key188.getTree());

                    }
                    break;
                case 8 :
                    // PLSQLCommons.g:369:10: positiven_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_positiven_key_in_native_datatype_element3214);
                    positiven_key189=gPLSQLParser.positiven_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, positiven_key189.getTree());

                    }
                    break;
                case 9 :
                    // PLSQLCommons.g:370:10: signtype_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_signtype_key_in_native_datatype_element3225);
                    signtype_key190=gPLSQLParser.signtype_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, signtype_key190.getTree());

                    }
                    break;
                case 10 :
                    // PLSQLCommons.g:371:10: simple_integer_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_simple_integer_key_in_native_datatype_element3236);
                    simple_integer_key191=gPLSQLParser.simple_integer_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_integer_key191.getTree());

                    }
                    break;
                case 11 :
                    // PLSQLCommons.g:372:10: nvarchar2_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nvarchar2_key_in_native_datatype_element3247);
                    nvarchar2_key192=gPLSQLParser.nvarchar2_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nvarchar2_key192.getTree());

                    }
                    break;
                case 12 :
                    // PLSQLCommons.g:373:10: dec_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dec_key_in_native_datatype_element3258);
                    dec_key193=gPLSQLParser.dec_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dec_key193.getTree());

                    }
                    break;
                case 13 :
                    // PLSQLCommons.g:374:10: integer_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_integer_key_in_native_datatype_element3269);
                    integer_key194=gPLSQLParser.integer_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integer_key194.getTree());

                    }
                    break;
                case 14 :
                    // PLSQLCommons.g:375:10: int_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_int_key_in_native_datatype_element3280);
                    int_key195=gPLSQLParser.int_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, int_key195.getTree());

                    }
                    break;
                case 15 :
                    // PLSQLCommons.g:376:10: numeric_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_key_in_native_datatype_element3291);
                    numeric_key196=gPLSQLParser.numeric_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric_key196.getTree());

                    }
                    break;
                case 16 :
                    // PLSQLCommons.g:377:10: smallint_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_smallint_key_in_native_datatype_element3302);
                    smallint_key197=gPLSQLParser.smallint_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, smallint_key197.getTree());

                    }
                    break;
                case 17 :
                    // PLSQLCommons.g:378:10: number_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_number_key_in_native_datatype_element3313);
                    number_key198=gPLSQLParser.number_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number_key198.getTree());

                    }
                    break;
                case 18 :
                    // PLSQLCommons.g:379:10: decimal_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_decimal_key_in_native_datatype_element3324);
                    decimal_key199=gPLSQLParser.decimal_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, decimal_key199.getTree());

                    }
                    break;
                case 19 :
                    // PLSQLCommons.g:380:10: double_key ( precision_key )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_double_key_in_native_datatype_element3336);
                    double_key200=gPLSQLParser.double_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, double_key200.getTree());

                    // PLSQLCommons.g:380:21: ( precision_key )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==REGULAR_ID) ) {
                        int LA68_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("precision"))) ) {
                            alt68=1;
                        }
                    }
                    switch (alt68) {
                        case 1 :
                            // PLSQLCommons.g:380:21: precision_key
                            {
                            pushFollow(FOLLOW_precision_key_in_native_datatype_element3338);
                            precision_key201=gPLSQLParser.precision_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, precision_key201.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 20 :
                    // PLSQLCommons.g:381:10: float_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_float_key_in_native_datatype_element3350);
                    float_key202=gPLSQLParser.float_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, float_key202.getTree());

                    }
                    break;
                case 21 :
                    // PLSQLCommons.g:382:10: real_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_real_key_in_native_datatype_element3361);
                    real_key203=gPLSQLParser.real_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, real_key203.getTree());

                    }
                    break;
                case 22 :
                    // PLSQLCommons.g:383:10: nchar_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nchar_key_in_native_datatype_element3372);
                    nchar_key204=gPLSQLParser.nchar_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nchar_key204.getTree());

                    }
                    break;
                case 23 :
                    // PLSQLCommons.g:384:10: long_key ( raw_key )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_long_key_in_native_datatype_element3383);
                    long_key205=gPLSQLParser.long_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, long_key205.getTree());

                    // PLSQLCommons.g:384:19: ( raw_key )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==REGULAR_ID) ) {
                        int LA69_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("raw"))) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // PLSQLCommons.g:384:19: raw_key
                            {
                            pushFollow(FOLLOW_raw_key_in_native_datatype_element3385);
                            raw_key206=gPLSQLParser.raw_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, raw_key206.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 24 :
                    // PLSQLCommons.g:385:10: char_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_char_key_in_native_datatype_element3397);
                    char_key207=gPLSQLParser.char_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, char_key207.getTree());

                    }
                    break;
                case 25 :
                    // PLSQLCommons.g:386:10: character_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_character_key_in_native_datatype_element3410);
                    character_key208=gPLSQLParser.character_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, character_key208.getTree());

                    }
                    break;
                case 26 :
                    // PLSQLCommons.g:387:10: varchar2_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varchar2_key_in_native_datatype_element3422);
                    varchar2_key209=gPLSQLParser.varchar2_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar2_key209.getTree());

                    }
                    break;
                case 27 :
                    // PLSQLCommons.g:388:10: varchar_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varchar_key_in_native_datatype_element3433);
                    varchar_key210=gPLSQLParser.varchar_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varchar_key210.getTree());

                    }
                    break;
                case 28 :
                    // PLSQLCommons.g:389:10: string_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_key_in_native_datatype_element3444);
                    string_key211=gPLSQLParser.string_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string_key211.getTree());

                    }
                    break;
                case 29 :
                    // PLSQLCommons.g:390:10: raw_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_raw_key_in_native_datatype_element3455);
                    raw_key212=gPLSQLParser.raw_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, raw_key212.getTree());

                    }
                    break;
                case 30 :
                    // PLSQLCommons.g:391:10: boolean_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_boolean_key_in_native_datatype_element3466);
                    boolean_key213=gPLSQLParser.boolean_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_key213.getTree());

                    }
                    break;
                case 31 :
                    // PLSQLCommons.g:392:10: date_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_date_key_in_native_datatype_element3477);
                    date_key214=gPLSQLParser.date_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_key214.getTree());

                    }
                    break;
                case 32 :
                    // PLSQLCommons.g:393:10: rowid_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_rowid_key_in_native_datatype_element3488);
                    rowid_key215=gPLSQLParser.rowid_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rowid_key215.getTree());

                    }
                    break;
                case 33 :
                    // PLSQLCommons.g:394:10: urowid_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_urowid_key_in_native_datatype_element3499);
                    urowid_key216=gPLSQLParser.urowid_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, urowid_key216.getTree());

                    }
                    break;
                case 34 :
                    // PLSQLCommons.g:395:10: year_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_year_key_in_native_datatype_element3510);
                    year_key217=gPLSQLParser.year_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, year_key217.getTree());

                    }
                    break;
                case 35 :
                    // PLSQLCommons.g:396:10: month_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_month_key_in_native_datatype_element3521);
                    month_key218=gPLSQLParser.month_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, month_key218.getTree());

                    }
                    break;
                case 36 :
                    // PLSQLCommons.g:397:10: day_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_day_key_in_native_datatype_element3532);
                    day_key219=gPLSQLParser.day_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_key219.getTree());

                    }
                    break;
                case 37 :
                    // PLSQLCommons.g:398:10: hour_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_hour_key_in_native_datatype_element3543);
                    hour_key220=gPLSQLParser.hour_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hour_key220.getTree());

                    }
                    break;
                case 38 :
                    // PLSQLCommons.g:399:10: minute_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_minute_key_in_native_datatype_element3554);
                    minute_key221=gPLSQLParser.minute_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, minute_key221.getTree());

                    }
                    break;
                case 39 :
                    // PLSQLCommons.g:400:10: second_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_second_key_in_native_datatype_element3565);
                    second_key222=gPLSQLParser.second_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, second_key222.getTree());

                    }
                    break;
                case 40 :
                    // PLSQLCommons.g:401:10: timezone_hour_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timezone_hour_key_in_native_datatype_element3576);
                    timezone_hour_key223=gPLSQLParser.timezone_hour_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_hour_key223.getTree());

                    }
                    break;
                case 41 :
                    // PLSQLCommons.g:402:10: timezone_minute_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timezone_minute_key_in_native_datatype_element3587);
                    timezone_minute_key224=gPLSQLParser.timezone_minute_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_minute_key224.getTree());

                    }
                    break;
                case 42 :
                    // PLSQLCommons.g:403:10: timezone_region_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timezone_region_key_in_native_datatype_element3598);
                    timezone_region_key225=gPLSQLParser.timezone_region_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_region_key225.getTree());

                    }
                    break;
                case 43 :
                    // PLSQLCommons.g:404:10: timezone_abbr_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timezone_abbr_key_in_native_datatype_element3609);
                    timezone_abbr_key226=gPLSQLParser.timezone_abbr_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timezone_abbr_key226.getTree());

                    }
                    break;
                case 44 :
                    // PLSQLCommons.g:405:10: timestamp_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_key_in_native_datatype_element3620);
                    timestamp_key227=gPLSQLParser.timestamp_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_key227.getTree());

                    }
                    break;
                case 45 :
                    // PLSQLCommons.g:406:10: timestamp_unconstrained_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_unconstrained_key_in_native_datatype_element3631);
                    timestamp_unconstrained_key228=gPLSQLParser.timestamp_unconstrained_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_unconstrained_key228.getTree());

                    }
                    break;
                case 46 :
                    // PLSQLCommons.g:407:10: timestamp_tz_unconstrained_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_tz_unconstrained_key_in_native_datatype_element3642);
                    timestamp_tz_unconstrained_key229=gPLSQLParser.timestamp_tz_unconstrained_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_tz_unconstrained_key229.getTree());

                    }
                    break;
                case 47 :
                    // PLSQLCommons.g:408:10: timestamp_ltz_unconstrained_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_ltz_unconstrained_key_in_native_datatype_element3653);
                    timestamp_ltz_unconstrained_key230=gPLSQLParser.timestamp_ltz_unconstrained_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_ltz_unconstrained_key230.getTree());

                    }
                    break;
                case 48 :
                    // PLSQLCommons.g:409:10: yminterval_unconstrained_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_yminterval_unconstrained_key_in_native_datatype_element3664);
                    yminterval_unconstrained_key231=gPLSQLParser.yminterval_unconstrained_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, yminterval_unconstrained_key231.getTree());

                    }
                    break;
                case 49 :
                    // PLSQLCommons.g:410:10: dsinterval_unconstrained_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dsinterval_unconstrained_key_in_native_datatype_element3675);
                    dsinterval_unconstrained_key232=gPLSQLParser.dsinterval_unconstrained_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dsinterval_unconstrained_key232.getTree());

                    }
                    break;
                case 50 :
                    // PLSQLCommons.g:411:10: bfile_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bfile_key_in_native_datatype_element3686);
                    bfile_key233=gPLSQLParser.bfile_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bfile_key233.getTree());

                    }
                    break;
                case 51 :
                    // PLSQLCommons.g:412:10: blob_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_blob_key_in_native_datatype_element3697);
                    blob_key234=gPLSQLParser.blob_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blob_key234.getTree());

                    }
                    break;
                case 52 :
                    // PLSQLCommons.g:413:10: clob_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_clob_key_in_native_datatype_element3708);
                    clob_key235=gPLSQLParser.clob_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, clob_key235.getTree());

                    }
                    break;
                case 53 :
                    // PLSQLCommons.g:414:10: nclob_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_nclob_key_in_native_datatype_element3719);
                    nclob_key236=gPLSQLParser.nclob_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nclob_key236.getTree());

                    }
                    break;
                case 54 :
                    // PLSQLCommons.g:415:10: mlslabel_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_mlslabel_key_in_native_datatype_element3730);
                    mlslabel_key237=gPLSQLParser.mlslabel_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, mlslabel_key237.getTree());

                    }
                    break;

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
    // $ANTLR end "native_datatype_element"


    public static class bind_variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bind_variable"
    // PLSQLCommons.g:418:1: bind_variable : (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER ) ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )? ( ( PERIOD general_element_part )=> PERIOD general_element_part )* -> ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_part )* ) ;
    public final bind_variable_return bind_variable() throws RecognitionException {
        bind_variable_return retval = new bind_variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token b1=null;
        Token u1=null;
        Token b2=null;
        Token u2=null;
        Token COLON238=null;
        Token COLON240=null;
        Token PERIOD241=null;
        PLSQLParser_PLSQLKeys.indicator_key_return indicator_key239 =null;

        general_element_part_return general_element_part242 =null;


        Object b1_tree=null;
        Object u1_tree=null;
        Object b2_tree=null;
        Object u2_tree=null;
        Object COLON238_tree=null;
        Object COLON240_tree=null;
        Object PERIOD241_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_BINDVAR=new RewriteRuleTokenStream(adaptor,"token BINDVAR");
        RewriteRuleTokenStream stream_UNSIGNED_INTEGER=new RewriteRuleTokenStream(adaptor,"token UNSIGNED_INTEGER");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_indicator_key=new RewriteRuleSubtreeStream(adaptor,"rule indicator_key");
        RewriteRuleSubtreeStream stream_general_element_part=new RewriteRuleSubtreeStream(adaptor,"rule general_element_part");
        try {
            // PLSQLCommons.g:419:5: ( (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER ) ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )? ( ( PERIOD general_element_part )=> PERIOD general_element_part )* -> ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_part )* ) )
            // PLSQLCommons.g:419:10: (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER ) ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )? ( ( PERIOD general_element_part )=> PERIOD general_element_part )*
            {
            // PLSQLCommons.g:419:10: (b1= BINDVAR | COLON u1= UNSIGNED_INTEGER )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BINDVAR) ) {
                alt71=1;
            }
            else if ( (LA71_0==COLON) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // PLSQLCommons.g:419:12: b1= BINDVAR
                    {
                    b1=(Token)match(input,BINDVAR,FOLLOW_BINDVAR_in_bind_variable3754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BINDVAR.add(b1);


                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:419:25: COLON u1= UNSIGNED_INTEGER
                    {
                    COLON238=(Token)match(input,COLON,FOLLOW_COLON_in_bind_variable3758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON238);


                    u1=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_bind_variable3762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNSIGNED_INTEGER.add(u1);


                    }
                    break;

            }


            // PLSQLCommons.g:420:10: ( ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==REGULAR_ID) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==BINDVAR) ) {
                    int LA74_4 = input.LA(3);

                    if ( ((input.LT(1).getText().equalsIgnoreCase("indicator"))) ) {
                        alt74=1;
                    }
                }
                else if ( (LA74_1==COLON) ) {
                    int LA74_5 = input.LA(3);

                    if ( (LA74_5==UNSIGNED_INTEGER) ) {
                        int LA74_11 = input.LA(4);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("indicator"))) ) {
                            alt74=1;
                        }
                    }
                }
            }
            else if ( (LA74_0==BINDVAR||LA74_0==COLON) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // PLSQLCommons.g:420:12: ( indicator_key )? (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER )
                    {
                    // PLSQLCommons.g:420:12: ( indicator_key )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==REGULAR_ID) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // PLSQLCommons.g:420:12: indicator_key
                            {
                            pushFollow(FOLLOW_indicator_key_in_bind_variable3776);
                            indicator_key239=gPLSQLParser.indicator_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_indicator_key.add(indicator_key239.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:420:27: (b2= BINDVAR | COLON u2= UNSIGNED_INTEGER )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==BINDVAR) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==COLON) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;

                    }
                    switch (alt73) {
                        case 1 :
                            // PLSQLCommons.g:420:28: b2= BINDVAR
                            {
                            b2=(Token)match(input,BINDVAR,FOLLOW_BINDVAR_in_bind_variable3782); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_BINDVAR.add(b2);


                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:420:41: COLON u2= UNSIGNED_INTEGER
                            {
                            COLON240=(Token)match(input,COLON,FOLLOW_COLON_in_bind_variable3786); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(COLON240);


                            u2=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_bind_variable3790); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_UNSIGNED_INTEGER.add(u2);


                            }
                            break;

                    }


                    }
                    break;

            }


            // PLSQLCommons.g:421:10: ( ( PERIOD general_element_part )=> PERIOD general_element_part )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==PERIOD) && (synpred19_PLSQLCommons())) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // PLSQLCommons.g:421:11: ( PERIOD general_element_part )=> PERIOD general_element_part
            	    {
            	    PERIOD241=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_bind_variable3812); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD241);


            	    pushFollow(FOLLOW_general_element_part_in_bind_variable3814);
            	    general_element_part242=general_element_part();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_general_element_part.add(general_element_part242.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            // AST REWRITE
            // elements: u1, b2, indicator_key, general_element_part, u2, b1
            // token labels: u2, u1, b1, b2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_u2=new RewriteRuleTokenStream(adaptor,"token u2",u2);
            RewriteRuleTokenStream stream_u1=new RewriteRuleTokenStream(adaptor,"token u1",u1);
            RewriteRuleTokenStream stream_b1=new RewriteRuleTokenStream(adaptor,"token b1",b1);
            RewriteRuleTokenStream stream_b2=new RewriteRuleTokenStream(adaptor,"token b2",b2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 422:10: -> ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_part )* )
            {
                // PLSQLCommons.g:422:12: ^( HOSTED_VARIABLE_NAME ( $b1)? ( $u1)? ( indicator_key )? ( $b2)? ( $u2)? ( general_element_part )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(HOSTED_VARIABLE_NAME, "HOSTED_VARIABLE_NAME")
                , root_1);

                // PLSQLCommons.g:422:36: ( $b1)?
                if ( stream_b1.hasNext() ) {
                    adaptor.addChild(root_1, stream_b1.nextNode());

                }
                stream_b1.reset();

                // PLSQLCommons.g:422:41: ( $u1)?
                if ( stream_u1.hasNext() ) {
                    adaptor.addChild(root_1, stream_u1.nextNode());

                }
                stream_u1.reset();

                // PLSQLCommons.g:422:45: ( indicator_key )?
                if ( stream_indicator_key.hasNext() ) {
                    adaptor.addChild(root_1, stream_indicator_key.nextTree());

                }
                stream_indicator_key.reset();

                // PLSQLCommons.g:422:61: ( $b2)?
                if ( stream_b2.hasNext() ) {
                    adaptor.addChild(root_1, stream_b2.nextNode());

                }
                stream_b2.reset();

                // PLSQLCommons.g:422:66: ( $u2)?
                if ( stream_u2.hasNext() ) {
                    adaptor.addChild(root_1, stream_u2.nextNode());

                }
                stream_u2.reset();

                // PLSQLCommons.g:422:70: ( general_element_part )*
                while ( stream_general_element_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_general_element_part.nextTree());

                }
                stream_general_element_part.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "bind_variable"


    public static class general_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "general_element"
    // PLSQLCommons.g:425:1: general_element : general_element_part ( ( PERIOD general_element_part )=> PERIOD general_element_part )* -> {isCascated}? ^( CASCATED_ELEMENT ( general_element_part )+ ) -> general_element_part ;
    public final general_element_return general_element() throws RecognitionException {
        general_element_return retval = new general_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PERIOD244=null;
        general_element_part_return general_element_part243 =null;

        general_element_part_return general_element_part245 =null;


        Object PERIOD244_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_general_element_part=new RewriteRuleSubtreeStream(adaptor,"rule general_element_part");
         boolean isCascated = true; 
        try {
            // PLSQLCommons.g:427:5: ( general_element_part ( ( PERIOD general_element_part )=> PERIOD general_element_part )* -> {isCascated}? ^( CASCATED_ELEMENT ( general_element_part )+ ) -> general_element_part )
            // PLSQLCommons.g:427:10: general_element_part ( ( PERIOD general_element_part )=> PERIOD general_element_part )*
            {
            pushFollow(FOLLOW_general_element_part_in_general_element3880);
            general_element_part243=general_element_part();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_general_element_part.add(general_element_part243.getTree());

            // PLSQLCommons.g:427:31: ( ( PERIOD general_element_part )=> PERIOD general_element_part )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==PERIOD) && (synpred20_PLSQLCommons())) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // PLSQLCommons.g:427:32: ( PERIOD general_element_part )=> PERIOD general_element_part
            	    {
            	    PERIOD244=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_general_element3890); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD244);


            	    pushFollow(FOLLOW_general_element_part_in_general_element3892);
            	    general_element_part245=general_element_part();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_general_element_part.add(general_element_part245.getTree());

            	    if ( state.backtracking==0 ) {isCascated = true;}

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            // AST REWRITE
            // elements: general_element_part, general_element_part
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 428:9: -> {isCascated}? ^( CASCATED_ELEMENT ( general_element_part )+ )
            if (isCascated) {
                // PLSQLCommons.g:428:25: ^( CASCATED_ELEMENT ( general_element_part )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CASCATED_ELEMENT, "CASCATED_ELEMENT")
                , root_1);

                if ( !(stream_general_element_part.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_general_element_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_general_element_part.nextTree());

                }
                stream_general_element_part.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 429:9: -> general_element_part
            {
                adaptor.addChild(root_0, stream_general_element_part.nextTree());

            }


            retval.tree = root_0;
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
    // $ANTLR end "general_element"


    public static class general_element_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "general_element_part"
    // PLSQLCommons.g:432:1: general_element_part : ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* ( function_argument )? -> {isRoutineCall}? ^( ROUTINE_CALL ^( ROUTINE_NAME ( char_set_name )? ( id_expression )+ ) function_argument ) -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ ) ;
    public final general_element_part_return general_element_part() throws RecognitionException {
        general_element_part_return retval = new general_element_part_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTRODUCER246=null;
        Token PERIOD249=null;
        char_set_name_return char_set_name247 =null;

        id_expression_return id_expression248 =null;

        id_expression_return id_expression250 =null;

        function_argument_return function_argument251 =null;


        Object INTRODUCER246_tree=null;
        Object PERIOD249_tree=null;
        RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        RewriteRuleSubtreeStream stream_function_argument=new RewriteRuleSubtreeStream(adaptor,"rule function_argument");
        RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");
         boolean isRoutineCall = false; 
        try {
            // PLSQLCommons.g:434:5: ( ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* ( function_argument )? -> {isRoutineCall}? ^( ROUTINE_CALL ^( ROUTINE_NAME ( char_set_name )? ( id_expression )+ ) function_argument ) -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ ) )
            // PLSQLCommons.g:434:10: ( INTRODUCER char_set_name )? id_expression ( ( PERIOD id_expression )=> PERIOD id_expression )* ( function_argument )?
            {
            // PLSQLCommons.g:434:10: ( INTRODUCER char_set_name )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==INTRODUCER) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // PLSQLCommons.g:434:11: INTRODUCER char_set_name
                    {
                    INTRODUCER246=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_general_element_part3955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER246);


                    pushFollow(FOLLOW_char_set_name_in_general_element_part3957);
                    char_set_name247=char_set_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name247.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_id_expression_in_general_element_part3961);
            id_expression248=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression248.getTree());

            // PLSQLCommons.g:435:13: ( ( PERIOD id_expression )=> PERIOD id_expression )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==PERIOD) ) {
                    int LA78_2 = input.LA(2);

                    if ( (LA78_2==REGULAR_ID) ) {
                        int LA78_3 = input.LA(3);

                        if ( (synpred21_PLSQLCommons()) ) {
                            alt78=1;
                        }


                    }
                    else if ( (LA78_2==DELIMITED_ID) ) {
                        int LA78_4 = input.LA(3);

                        if ( (synpred21_PLSQLCommons()) ) {
                            alt78=1;
                        }


                    }


                }


                switch (alt78) {
            	case 1 :
            	    // PLSQLCommons.g:435:14: ( PERIOD id_expression )=> PERIOD id_expression
            	    {
            	    PERIOD249=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_general_element_part3983); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD249);


            	    pushFollow(FOLLOW_id_expression_in_general_element_part3985);
            	    id_expression250=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression250.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            // PLSQLCommons.g:435:62: ( function_argument )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // PLSQLCommons.g:435:63: function_argument
                    {
                    pushFollow(FOLLOW_function_argument_in_general_element_part3990);
                    function_argument251=function_argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_argument.add(function_argument251.getTree());

                    if ( state.backtracking==0 ) {isRoutineCall = true;}

                    }
                    break;

            }


            // AST REWRITE
            // elements: id_expression, char_set_name, char_set_name, function_argument, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 436:9: -> {isRoutineCall}? ^( ROUTINE_CALL ^( ROUTINE_NAME ( char_set_name )? ( id_expression )+ ) function_argument )
            if (isRoutineCall) {
                // PLSQLCommons.g:436:28: ^( ROUTINE_CALL ^( ROUTINE_NAME ( char_set_name )? ( id_expression )+ ) function_argument )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROUTINE_CALL, "ROUTINE_CALL")
                , root_1);

                // PLSQLCommons.g:436:43: ^( ROUTINE_NAME ( char_set_name )? ( id_expression )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ROUTINE_NAME, "ROUTINE_NAME")
                , root_2);

                // PLSQLCommons.g:436:58: ( char_set_name )?
                if ( stream_char_set_name.hasNext() ) {
                    adaptor.addChild(root_2, stream_char_set_name.nextTree());

                }
                stream_char_set_name.reset();

                if ( !(stream_id_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_function_argument.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 437:9: -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ )
            {
                // PLSQLCommons.g:437:12: ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ANY_ELEMENT, "ANY_ELEMENT")
                , root_1);

                // PLSQLCommons.g:437:26: ( char_set_name )?
                if ( stream_char_set_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_char_set_name.nextTree());

                }
                stream_char_set_name.reset();

                if ( !(stream_id_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "general_element_part"


    public static class table_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_element"
    // PLSQLCommons.g:440:1: table_element : ( INTRODUCER char_set_name )? id_expression ( PERIOD id_expression )* -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ ) ;
    public final table_element_return table_element() throws RecognitionException {
        table_element_return retval = new table_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTRODUCER252=null;
        Token PERIOD255=null;
        char_set_name_return char_set_name253 =null;

        id_expression_return id_expression254 =null;

        id_expression_return id_expression256 =null;


        Object INTRODUCER252_tree=null;
        Object PERIOD255_tree=null;
        RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");
        try {
            // PLSQLCommons.g:441:5: ( ( INTRODUCER char_set_name )? id_expression ( PERIOD id_expression )* -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ ) )
            // PLSQLCommons.g:441:10: ( INTRODUCER char_set_name )? id_expression ( PERIOD id_expression )*
            {
            // PLSQLCommons.g:441:10: ( INTRODUCER char_set_name )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==INTRODUCER) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // PLSQLCommons.g:441:11: INTRODUCER char_set_name
                    {
                    INTRODUCER252=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_table_element4062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER252);


                    pushFollow(FOLLOW_char_set_name_in_table_element4064);
                    char_set_name253=char_set_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name253.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_id_expression_in_table_element4068);
            id_expression254=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression254.getTree());

            // PLSQLCommons.g:441:52: ( PERIOD id_expression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==PERIOD) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // PLSQLCommons.g:441:53: PERIOD id_expression
            	    {
            	    PERIOD255=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_table_element4071); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD255);


            	    pushFollow(FOLLOW_id_expression_in_table_element4073);
            	    id_expression256=id_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id_expression.add(id_expression256.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            // AST REWRITE
            // elements: char_set_name, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 442:10: -> ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ )
            {
                // PLSQLCommons.g:442:13: ^( ANY_ELEMENT ( char_set_name )? ( id_expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ANY_ELEMENT, "ANY_ELEMENT")
                , root_1);

                // PLSQLCommons.g:442:27: ( char_set_name )?
                if ( stream_char_set_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_char_set_name.nextTree());

                }
                stream_char_set_name.reset();

                if ( !(stream_id_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_id_expression.nextTree());

                }
                stream_id_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
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
    // $ANTLR end "table_element"


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // PLSQLCommons.g:449:1: constant : ( timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )? | interval_key ( quoted_string | bind_variable | general_element_part ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )? | numeric | date_key quoted_string | quoted_string | null_key | true_key | false_key | dbtimezone_key | sessiontimezone_key | minvalue_key | maxvalue_key | default_key );
    public final constant_return constant() throws RecognitionException {
        constant_return retval = new constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN272=null;
        Token UNSIGNED_INTEGER273=null;
        Token COMMA275=null;
        Token UNSIGNED_INTEGER276=null;
        Token RIGHT_PAREN278=null;
        Token LEFT_PAREN284=null;
        Token UNSIGNED_INTEGER285=null;
        Token RIGHT_PAREN287=null;
        PLSQLParser_PLSQLKeys.timestamp_key_return timestamp_key257 =null;

        quoted_string_return quoted_string258 =null;

        bind_variable_return bind_variable259 =null;

        PLSQLParser_PLSQLKeys.at_key_return at_key260 =null;

        PLSQLParser_PLSQLKeys.time_key_return time_key261 =null;

        PLSQLParser_PLSQLKeys.zone_key_return zone_key262 =null;

        quoted_string_return quoted_string263 =null;

        PLSQLParser_PLSQLKeys.interval_key_return interval_key264 =null;

        quoted_string_return quoted_string265 =null;

        bind_variable_return bind_variable266 =null;

        general_element_part_return general_element_part267 =null;

        PLSQLParser_PLSQLKeys.day_key_return day_key268 =null;

        PLSQLParser_PLSQLKeys.hour_key_return hour_key269 =null;

        PLSQLParser_PLSQLKeys.minute_key_return minute_key270 =null;

        PLSQLParser_PLSQLKeys.second_key_return second_key271 =null;

        bind_variable_return bind_variable274 =null;

        bind_variable_return bind_variable277 =null;

        PLSQLParser_PLSQLKeys.to_key_return to_key279 =null;

        PLSQLParser_PLSQLKeys.day_key_return day_key280 =null;

        PLSQLParser_PLSQLKeys.hour_key_return hour_key281 =null;

        PLSQLParser_PLSQLKeys.minute_key_return minute_key282 =null;

        PLSQLParser_PLSQLKeys.second_key_return second_key283 =null;

        bind_variable_return bind_variable286 =null;

        numeric_return numeric288 =null;

        PLSQLParser_PLSQLKeys.date_key_return date_key289 =null;

        quoted_string_return quoted_string290 =null;

        quoted_string_return quoted_string291 =null;

        PLSQLParser_PLSQLKeys.null_key_return null_key292 =null;

        PLSQLParser_PLSQLKeys.true_key_return true_key293 =null;

        PLSQLParser_PLSQLKeys.false_key_return false_key294 =null;

        PLSQLParser_PLSQLKeys.dbtimezone_key_return dbtimezone_key295 =null;

        PLSQLParser_PLSQLKeys.sessiontimezone_key_return sessiontimezone_key296 =null;

        PLSQLParser_PLSQLKeys.minvalue_key_return minvalue_key297 =null;

        PLSQLParser_PLSQLKeys.maxvalue_key_return maxvalue_key298 =null;

        PLSQLParser_PLSQLKeys.default_key_return default_key299 =null;


        Object LEFT_PAREN272_tree=null;
        Object UNSIGNED_INTEGER273_tree=null;
        Object COMMA275_tree=null;
        Object UNSIGNED_INTEGER276_tree=null;
        Object RIGHT_PAREN278_tree=null;
        Object LEFT_PAREN284_tree=null;
        Object UNSIGNED_INTEGER285_tree=null;
        Object RIGHT_PAREN287_tree=null;

        try {
            // PLSQLCommons.g:450:5: ( timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )? | interval_key ( quoted_string | bind_variable | general_element_part ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )? | numeric | date_key quoted_string | quoted_string | null_key | true_key | false_key | dbtimezone_key | sessiontimezone_key | minvalue_key | maxvalue_key | default_key )
            int alt94=13;
            switch ( input.LA(1) ) {
            case REGULAR_ID:
                {
                int LA94_1 = input.LA(2);

                if ( ((input.LT(1).getText().equalsIgnoreCase("timestamp"))) ) {
                    alt94=1;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("interval"))) ) {
                    alt94=2;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("dbtimezone"))) ) {
                    alt94=9;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("sessiontimezone"))) ) {
                    alt94=10;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("minvalue"))) ) {
                    alt94=11;
                }
                else if ( ((input.LT(1).getText().equalsIgnoreCase("maxvalue"))) ) {
                    alt94=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;

                }
                }
                break;
            case APPROXIMATE_NUM_LIT:
            case EXACT_NUM_LIT:
            case UNSIGNED_INTEGER:
                {
                alt94=3;
                }
                break;
            case SQL92_RESERVED_DATE:
                {
                alt94=4;
                }
                break;
            case CHAR_STRING:
            case CHAR_STRING_PERL:
            case NATIONAL_CHAR_STRING_LIT:
                {
                alt94=5;
                }
                break;
            case SQL92_RESERVED_NULL:
                {
                alt94=6;
                }
                break;
            case SQL92_RESERVED_TRUE:
                {
                alt94=7;
                }
                break;
            case SQL92_RESERVED_FALSE:
                {
                alt94=8;
                }
                break;
            case SQL92_RESERVED_DEFAULT:
                {
                alt94=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }

            switch (alt94) {
                case 1 :
                    // PLSQLCommons.g:450:10: timestamp_key ( quoted_string | bind_variable ) ( at_key time_key zone_key quoted_string )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_timestamp_key_in_constant4120);
                    timestamp_key257=gPLSQLParser.timestamp_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestamp_key257.getTree());

                    // PLSQLCommons.g:450:24: ( quoted_string | bind_variable )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0 >= CHAR_STRING && LA82_0 <= CHAR_STRING_PERL)||LA82_0==NATIONAL_CHAR_STRING_LIT) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==BINDVAR||LA82_0==COLON) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;

                    }
                    switch (alt82) {
                        case 1 :
                            // PLSQLCommons.g:450:25: quoted_string
                            {
                            pushFollow(FOLLOW_quoted_string_in_constant4123);
                            quoted_string258=quoted_string();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string258.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:450:41: bind_variable
                            {
                            pushFollow(FOLLOW_bind_variable_in_constant4127);
                            bind_variable259=bind_variable();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable259.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:450:56: ( at_key time_key zone_key quoted_string )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==REGULAR_ID) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==REGULAR_ID) ) {
                            int LA83_3 = input.LA(3);

                            if ( (LA83_3==REGULAR_ID) ) {
                                int LA83_11 = input.LA(4);

                                if ( ((LA83_11 >= CHAR_STRING && LA83_11 <= CHAR_STRING_PERL)||LA83_11==NATIONAL_CHAR_STRING_LIT) ) {
                                    int LA83_12 = input.LA(5);

                                    if ( ((input.LT(1).getText().equalsIgnoreCase("at"))) ) {
                                        alt83=1;
                                    }
                                }
                            }
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // PLSQLCommons.g:450:57: at_key time_key zone_key quoted_string
                            {
                            pushFollow(FOLLOW_at_key_in_constant4131);
                            at_key260=gPLSQLParser.at_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, at_key260.getTree());

                            pushFollow(FOLLOW_time_key_in_constant4133);
                            time_key261=gPLSQLParser.time_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, time_key261.getTree());

                            pushFollow(FOLLOW_zone_key_in_constant4135);
                            zone_key262=gPLSQLParser.zone_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, zone_key262.getTree());

                            pushFollow(FOLLOW_quoted_string_in_constant4137);
                            quoted_string263=quoted_string();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string263.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:451:10: interval_key ( quoted_string | bind_variable | general_element_part ) ( day_key | hour_key | minute_key | second_key ) ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )? ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interval_key_in_constant4150);
                    interval_key264=gPLSQLParser.interval_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interval_key264.getTree());

                    // PLSQLCommons.g:451:23: ( quoted_string | bind_variable | general_element_part )
                    int alt84=3;
                    switch ( input.LA(1) ) {
                    case CHAR_STRING:
                    case CHAR_STRING_PERL:
                    case NATIONAL_CHAR_STRING_LIT:
                        {
                        alt84=1;
                        }
                        break;
                    case BINDVAR:
                    case COLON:
                        {
                        alt84=2;
                        }
                        break;
                    case DELIMITED_ID:
                    case INTRODUCER:
                    case REGULAR_ID:
                        {
                        alt84=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;

                    }

                    switch (alt84) {
                        case 1 :
                            // PLSQLCommons.g:451:24: quoted_string
                            {
                            pushFollow(FOLLOW_quoted_string_in_constant4153);
                            quoted_string265=quoted_string();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string265.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:451:40: bind_variable
                            {
                            pushFollow(FOLLOW_bind_variable_in_constant4157);
                            bind_variable266=bind_variable();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable266.getTree());

                            }
                            break;
                        case 3 :
                            // PLSQLCommons.g:451:56: general_element_part
                            {
                            pushFollow(FOLLOW_general_element_part_in_constant4161);
                            general_element_part267=general_element_part();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, general_element_part267.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:452:10: ( day_key | hour_key | minute_key | second_key )
                    int alt85=4;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==REGULAR_ID) ) {
                        int LA85_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
                            alt85=1;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("hour"))) ) {
                            alt85=2;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("minute"))) ) {
                            alt85=3;
                        }
                        else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
                            alt85=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 85, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;

                    }
                    switch (alt85) {
                        case 1 :
                            // PLSQLCommons.g:452:12: day_key
                            {
                            pushFollow(FOLLOW_day_key_in_constant4175);
                            day_key268=gPLSQLParser.day_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, day_key268.getTree());

                            }
                            break;
                        case 2 :
                            // PLSQLCommons.g:452:22: hour_key
                            {
                            pushFollow(FOLLOW_hour_key_in_constant4179);
                            hour_key269=gPLSQLParser.hour_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, hour_key269.getTree());

                            }
                            break;
                        case 3 :
                            // PLSQLCommons.g:452:33: minute_key
                            {
                            pushFollow(FOLLOW_minute_key_in_constant4183);
                            minute_key270=gPLSQLParser.minute_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, minute_key270.getTree());

                            }
                            break;
                        case 4 :
                            // PLSQLCommons.g:452:46: second_key
                            {
                            pushFollow(FOLLOW_second_key_in_constant4187);
                            second_key271=gPLSQLParser.second_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, second_key271.getTree());

                            }
                            break;

                    }


                    // PLSQLCommons.g:453:10: ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==LEFT_PAREN) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // PLSQLCommons.g:453:12: LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )? RIGHT_PAREN
                            {
                            LEFT_PAREN272=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_constant4201); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            LEFT_PAREN272_tree = 
                            (Object)adaptor.create(LEFT_PAREN272)
                            ;
                            adaptor.addChild(root_0, LEFT_PAREN272_tree);
                            }

                            // PLSQLCommons.g:453:23: ( UNSIGNED_INTEGER | bind_variable )
                            int alt86=2;
                            int LA86_0 = input.LA(1);

                            if ( (LA86_0==UNSIGNED_INTEGER) ) {
                                alt86=1;
                            }
                            else if ( (LA86_0==BINDVAR||LA86_0==COLON) ) {
                                alt86=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 86, 0, input);

                                throw nvae;

                            }
                            switch (alt86) {
                                case 1 :
                                    // PLSQLCommons.g:453:24: UNSIGNED_INTEGER
                                    {
                                    UNSIGNED_INTEGER273=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant4204); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    UNSIGNED_INTEGER273_tree = 
                                    (Object)adaptor.create(UNSIGNED_INTEGER273)
                                    ;
                                    adaptor.addChild(root_0, UNSIGNED_INTEGER273_tree);
                                    }

                                    }
                                    break;
                                case 2 :
                                    // PLSQLCommons.g:453:43: bind_variable
                                    {
                                    pushFollow(FOLLOW_bind_variable_in_constant4208);
                                    bind_variable274=bind_variable();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable274.getTree());

                                    }
                                    break;

                            }


                            // PLSQLCommons.g:453:58: ( COMMA ( UNSIGNED_INTEGER | bind_variable ) )?
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==COMMA) ) {
                                alt88=1;
                            }
                            switch (alt88) {
                                case 1 :
                                    // PLSQLCommons.g:453:59: COMMA ( UNSIGNED_INTEGER | bind_variable )
                                    {
                                    COMMA275=(Token)match(input,COMMA,FOLLOW_COMMA_in_constant4212); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    COMMA275_tree = 
                                    (Object)adaptor.create(COMMA275)
                                    ;
                                    adaptor.addChild(root_0, COMMA275_tree);
                                    }

                                    // PLSQLCommons.g:453:65: ( UNSIGNED_INTEGER | bind_variable )
                                    int alt87=2;
                                    int LA87_0 = input.LA(1);

                                    if ( (LA87_0==UNSIGNED_INTEGER) ) {
                                        alt87=1;
                                    }
                                    else if ( (LA87_0==BINDVAR||LA87_0==COLON) ) {
                                        alt87=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return retval;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 87, 0, input);

                                        throw nvae;

                                    }
                                    switch (alt87) {
                                        case 1 :
                                            // PLSQLCommons.g:453:66: UNSIGNED_INTEGER
                                            {
                                            UNSIGNED_INTEGER276=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant4215); if (state.failed) return retval;
                                            if ( state.backtracking==0 ) {
                                            UNSIGNED_INTEGER276_tree = 
                                            (Object)adaptor.create(UNSIGNED_INTEGER276)
                                            ;
                                            adaptor.addChild(root_0, UNSIGNED_INTEGER276_tree);
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // PLSQLCommons.g:453:85: bind_variable
                                            {
                                            pushFollow(FOLLOW_bind_variable_in_constant4219);
                                            bind_variable277=bind_variable();

                                            state._fsp--;
                                            if (state.failed) return retval;
                                            if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable277.getTree());

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            RIGHT_PAREN278=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_constant4225); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            RIGHT_PAREN278_tree = 
                            (Object)adaptor.create(RIGHT_PAREN278)
                            ;
                            adaptor.addChild(root_0, RIGHT_PAREN278_tree);
                            }

                            }
                            break;

                    }


                    // PLSQLCommons.g:454:10: ( to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==SQL92_RESERVED_TO) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // PLSQLCommons.g:454:12: to_key ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? )
                            {
                            pushFollow(FOLLOW_to_key_in_constant4240);
                            to_key279=gPLSQLParser.to_key();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, to_key279.getTree());

                            // PLSQLCommons.g:455:14: ( day_key | hour_key | minute_key | second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )? )
                            int alt92=4;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==REGULAR_ID) ) {
                                int LA92_1 = input.LA(2);

                                if ( ((input.LT(1).getText().equalsIgnoreCase("day"))) ) {
                                    alt92=1;
                                }
                                else if ( ((input.LT(1).getText().equalsIgnoreCase("hour"))) ) {
                                    alt92=2;
                                }
                                else if ( ((input.LT(1).getText().equalsIgnoreCase("minute"))) ) {
                                    alt92=3;
                                }
                                else if ( ((input.LT(1).getText().equalsIgnoreCase("second"))) ) {
                                    alt92=4;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return retval;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 92, 1, input);

                                    throw nvae;

                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 92, 0, input);

                                throw nvae;

                            }
                            switch (alt92) {
                                case 1 :
                                    // PLSQLCommons.g:455:16: day_key
                                    {
                                    pushFollow(FOLLOW_day_key_in_constant4257);
                                    day_key280=gPLSQLParser.day_key();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, day_key280.getTree());

                                    }
                                    break;
                                case 2 :
                                    // PLSQLCommons.g:455:26: hour_key
                                    {
                                    pushFollow(FOLLOW_hour_key_in_constant4261);
                                    hour_key281=gPLSQLParser.hour_key();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hour_key281.getTree());

                                    }
                                    break;
                                case 3 :
                                    // PLSQLCommons.g:455:37: minute_key
                                    {
                                    pushFollow(FOLLOW_minute_key_in_constant4265);
                                    minute_key282=gPLSQLParser.minute_key();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, minute_key282.getTree());

                                    }
                                    break;
                                case 4 :
                                    // PLSQLCommons.g:455:50: second_key ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )?
                                    {
                                    pushFollow(FOLLOW_second_key_in_constant4269);
                                    second_key283=gPLSQLParser.second_key();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, second_key283.getTree());

                                    // PLSQLCommons.g:455:61: ( LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN )?
                                    int alt91=2;
                                    int LA91_0 = input.LA(1);

                                    if ( (LA91_0==LEFT_PAREN) ) {
                                        alt91=1;
                                    }
                                    switch (alt91) {
                                        case 1 :
                                            // PLSQLCommons.g:455:62: LEFT_PAREN ( UNSIGNED_INTEGER | bind_variable ) RIGHT_PAREN
                                            {
                                            LEFT_PAREN284=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_constant4272); if (state.failed) return retval;
                                            if ( state.backtracking==0 ) {
                                            LEFT_PAREN284_tree = 
                                            (Object)adaptor.create(LEFT_PAREN284)
                                            ;
                                            adaptor.addChild(root_0, LEFT_PAREN284_tree);
                                            }

                                            // PLSQLCommons.g:455:73: ( UNSIGNED_INTEGER | bind_variable )
                                            int alt90=2;
                                            int LA90_0 = input.LA(1);

                                            if ( (LA90_0==UNSIGNED_INTEGER) ) {
                                                alt90=1;
                                            }
                                            else if ( (LA90_0==BINDVAR||LA90_0==COLON) ) {
                                                alt90=2;
                                            }
                                            else {
                                                if (state.backtracking>0) {state.failed=true; return retval;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 90, 0, input);

                                                throw nvae;

                                            }
                                            switch (alt90) {
                                                case 1 :
                                                    // PLSQLCommons.g:455:74: UNSIGNED_INTEGER
                                                    {
                                                    UNSIGNED_INTEGER285=(Token)match(input,UNSIGNED_INTEGER,FOLLOW_UNSIGNED_INTEGER_in_constant4275); if (state.failed) return retval;
                                                    if ( state.backtracking==0 ) {
                                                    UNSIGNED_INTEGER285_tree = 
                                                    (Object)adaptor.create(UNSIGNED_INTEGER285)
                                                    ;
                                                    adaptor.addChild(root_0, UNSIGNED_INTEGER285_tree);
                                                    }

                                                    }
                                                    break;
                                                case 2 :
                                                    // PLSQLCommons.g:455:93: bind_variable
                                                    {
                                                    pushFollow(FOLLOW_bind_variable_in_constant4279);
                                                    bind_variable286=bind_variable();

                                                    state._fsp--;
                                                    if (state.failed) return retval;
                                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bind_variable286.getTree());

                                                    }
                                                    break;

                                            }


                                            RIGHT_PAREN287=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_constant4282); if (state.failed) return retval;
                                            if ( state.backtracking==0 ) {
                                            RIGHT_PAREN287_tree = 
                                            (Object)adaptor.create(RIGHT_PAREN287)
                                            ;
                                            adaptor.addChild(root_0, RIGHT_PAREN287_tree);
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // PLSQLCommons.g:457:10: numeric
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_numeric_in_constant4309);
                    numeric288=numeric();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numeric288.getTree());

                    }
                    break;
                case 4 :
                    // PLSQLCommons.g:458:10: date_key quoted_string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_date_key_in_constant4320);
                    date_key289=gPLSQLParser.date_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, date_key289.getTree());

                    pushFollow(FOLLOW_quoted_string_in_constant4322);
                    quoted_string290=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string290.getTree());

                    }
                    break;
                case 5 :
                    // PLSQLCommons.g:459:10: quoted_string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_quoted_string_in_constant4333);
                    quoted_string291=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quoted_string291.getTree());

                    }
                    break;
                case 6 :
                    // PLSQLCommons.g:460:10: null_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_null_key_in_constant4344);
                    null_key292=gPLSQLParser.null_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, null_key292.getTree());

                    }
                    break;
                case 7 :
                    // PLSQLCommons.g:461:10: true_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_true_key_in_constant4355);
                    true_key293=gPLSQLParser.true_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, true_key293.getTree());

                    }
                    break;
                case 8 :
                    // PLSQLCommons.g:462:10: false_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_false_key_in_constant4366);
                    false_key294=gPLSQLParser.false_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, false_key294.getTree());

                    }
                    break;
                case 9 :
                    // PLSQLCommons.g:463:10: dbtimezone_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dbtimezone_key_in_constant4377);
                    dbtimezone_key295=gPLSQLParser.dbtimezone_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dbtimezone_key295.getTree());

                    }
                    break;
                case 10 :
                    // PLSQLCommons.g:464:10: sessiontimezone_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_sessiontimezone_key_in_constant4389);
                    sessiontimezone_key296=gPLSQLParser.sessiontimezone_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sessiontimezone_key296.getTree());

                    }
                    break;
                case 11 :
                    // PLSQLCommons.g:465:10: minvalue_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_minvalue_key_in_constant4400);
                    minvalue_key297=gPLSQLParser.minvalue_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, minvalue_key297.getTree());

                    }
                    break;
                case 12 :
                    // PLSQLCommons.g:466:10: maxvalue_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_maxvalue_key_in_constant4411);
                    maxvalue_key298=gPLSQLParser.maxvalue_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, maxvalue_key298.getTree());

                    }
                    break;
                case 13 :
                    // PLSQLCommons.g:467:10: default_key
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_default_key_in_constant4422);
                    default_key299=gPLSQLParser.default_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, default_key299.getTree());

                    }
                    break;

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
    // $ANTLR end "constant"


    public static class numeric_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numeric"
    // PLSQLCommons.g:470:1: numeric : ( UNSIGNED_INTEGER | EXACT_NUM_LIT | APPROXIMATE_NUM_LIT );
    public final numeric_return numeric() throws RecognitionException {
        numeric_return retval = new numeric_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set300=null;

        Object set300_tree=null;

        try {
            // PLSQLCommons.g:471:5: ( UNSIGNED_INTEGER | EXACT_NUM_LIT | APPROXIMATE_NUM_LIT )
            // PLSQLCommons.g:
            {
            root_0 = (Object)adaptor.nil();


            set300=(Token)input.LT(1);

            if ( input.LA(1)==APPROXIMATE_NUM_LIT||input.LA(1)==EXACT_NUM_LIT||input.LA(1)==UNSIGNED_INTEGER ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set300)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "numeric"


    public static class quoted_string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quoted_string"
    // PLSQLCommons.g:475:1: quoted_string : ( CHAR_STRING | CHAR_STRING_PERL | NATIONAL_CHAR_STRING_LIT );
    public final quoted_string_return quoted_string() throws RecognitionException {
        quoted_string_return retval = new quoted_string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set301=null;

        Object set301_tree=null;

        try {
            // PLSQLCommons.g:476:5: ( CHAR_STRING | CHAR_STRING_PERL | NATIONAL_CHAR_STRING_LIT )
            // PLSQLCommons.g:
            {
            root_0 = (Object)adaptor.nil();


            set301=(Token)input.LT(1);

            if ( (input.LA(1) >= CHAR_STRING && input.LA(1) <= CHAR_STRING_PERL)||input.LA(1)==NATIONAL_CHAR_STRING_LIT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set301)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "quoted_string"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // PLSQLCommons.g:481:1: id : ( INTRODUCER char_set_name )? id_expression -> ( char_set_name )? id_expression ;
    public final id_return id() throws RecognitionException {
        id_return retval = new id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INTRODUCER302=null;
        char_set_name_return char_set_name303 =null;

        id_expression_return id_expression304 =null;


        Object INTRODUCER302_tree=null;
        RewriteRuleTokenStream stream_INTRODUCER=new RewriteRuleTokenStream(adaptor,"token INTRODUCER");
        RewriteRuleSubtreeStream stream_id_expression=new RewriteRuleSubtreeStream(adaptor,"rule id_expression");
        RewriteRuleSubtreeStream stream_char_set_name=new RewriteRuleSubtreeStream(adaptor,"rule char_set_name");
        try {
            // PLSQLCommons.g:482:5: ( ( INTRODUCER char_set_name )? id_expression -> ( char_set_name )? id_expression )
            // PLSQLCommons.g:482:10: ( INTRODUCER char_set_name )? id_expression
            {
            // PLSQLCommons.g:482:10: ( INTRODUCER char_set_name )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==INTRODUCER) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // PLSQLCommons.g:482:11: INTRODUCER char_set_name
                    {
                    INTRODUCER302=(Token)match(input,INTRODUCER,FOLLOW_INTRODUCER_in_id4522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTRODUCER.add(INTRODUCER302);


                    pushFollow(FOLLOW_char_set_name_in_id4524);
                    char_set_name303=char_set_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_char_set_name.add(char_set_name303.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_id_expression_in_id4536);
            id_expression304=id_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id_expression.add(id_expression304.getTree());

            // AST REWRITE
            // elements: char_set_name, id_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 484:9: -> ( char_set_name )? id_expression
            {
                // PLSQLCommons.g:484:12: ( char_set_name )?
                if ( stream_char_set_name.hasNext() ) {
                    adaptor.addChild(root_0, stream_char_set_name.nextTree());

                }
                stream_char_set_name.reset();

                adaptor.addChild(root_0, stream_id_expression.nextTree());

            }


            retval.tree = root_0;
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
    // $ANTLR end "id"


    public static class id_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_expression"
    // PLSQLCommons.g:487:1: id_expression : ( REGULAR_ID -> ID[$REGULAR_ID] | DELIMITED_ID -> ID[$DELIMITED_ID] );
    public final id_expression_return id_expression() throws RecognitionException {
        id_expression_return retval = new id_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token REGULAR_ID305=null;
        Token DELIMITED_ID306=null;

        Object REGULAR_ID305_tree=null;
        Object DELIMITED_ID306_tree=null;
        RewriteRuleTokenStream stream_DELIMITED_ID=new RewriteRuleTokenStream(adaptor,"token DELIMITED_ID");
        RewriteRuleTokenStream stream_REGULAR_ID=new RewriteRuleTokenStream(adaptor,"token REGULAR_ID");

        try {
            // PLSQLCommons.g:488:5: ( REGULAR_ID -> ID[$REGULAR_ID] | DELIMITED_ID -> ID[$DELIMITED_ID] )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==REGULAR_ID) ) {
                alt96=1;
            }
            else if ( (LA96_0==DELIMITED_ID) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }
            switch (alt96) {
                case 1 :
                    // PLSQLCommons.g:488:10: REGULAR_ID
                    {
                    REGULAR_ID305=(Token)match(input,REGULAR_ID,FOLLOW_REGULAR_ID_in_id_expression4571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REGULAR_ID.add(REGULAR_ID305);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 488:21: -> ID[$REGULAR_ID]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(ID, REGULAR_ID305)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:489:10: DELIMITED_ID
                    {
                    DELIMITED_ID306=(Token)match(input,DELIMITED_ID,FOLLOW_DELIMITED_ID_in_id_expression4590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DELIMITED_ID.add(DELIMITED_ID306);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 489:23: -> ID[$DELIMITED_ID]
                    {
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(ID, DELIMITED_ID306)
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

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
    // $ANTLR end "id_expression"


    public static class not_equal_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "not_equal_op"
    // PLSQLCommons.g:492:1: not_equal_op : ( NOT_EQUAL_OP | LESS_THAN_OP GREATER_THAN_OP | EXCLAMATION_OPERATOR_PART EQUALS_OP | CARRET_OPERATOR_PART EQUALS_OP );
    public final not_equal_op_return not_equal_op() throws RecognitionException {
        not_equal_op_return retval = new not_equal_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT_EQUAL_OP307=null;
        Token LESS_THAN_OP308=null;
        Token GREATER_THAN_OP309=null;
        Token EXCLAMATION_OPERATOR_PART310=null;
        Token EQUALS_OP311=null;
        Token CARRET_OPERATOR_PART312=null;
        Token EQUALS_OP313=null;

        Object NOT_EQUAL_OP307_tree=null;
        Object LESS_THAN_OP308_tree=null;
        Object GREATER_THAN_OP309_tree=null;
        Object EXCLAMATION_OPERATOR_PART310_tree=null;
        Object EQUALS_OP311_tree=null;
        Object CARRET_OPERATOR_PART312_tree=null;
        Object EQUALS_OP313_tree=null;

        try {
            // PLSQLCommons.g:493:5: ( NOT_EQUAL_OP | LESS_THAN_OP GREATER_THAN_OP | EXCLAMATION_OPERATOR_PART EQUALS_OP | CARRET_OPERATOR_PART EQUALS_OP )
            int alt97=4;
            switch ( input.LA(1) ) {
            case NOT_EQUAL_OP:
                {
                alt97=1;
                }
                break;
            case LESS_THAN_OP:
                {
                alt97=2;
                }
                break;
            case EXCLAMATION_OPERATOR_PART:
                {
                alt97=3;
                }
                break;
            case CARRET_OPERATOR_PART:
                {
                alt97=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }

            switch (alt97) {
                case 1 :
                    // PLSQLCommons.g:493:10: NOT_EQUAL_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT_EQUAL_OP307=(Token)match(input,NOT_EQUAL_OP,FOLLOW_NOT_EQUAL_OP_in_not_equal_op4619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT_EQUAL_OP307_tree = 
                    (Object)adaptor.create(NOT_EQUAL_OP307)
                    ;
                    adaptor.addChild(root_0, NOT_EQUAL_OP307_tree);
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:494:10: LESS_THAN_OP GREATER_THAN_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    LESS_THAN_OP308=(Token)match(input,LESS_THAN_OP,FOLLOW_LESS_THAN_OP_in_not_equal_op4630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_THAN_OP308_tree = 
                    (Object)adaptor.create(LESS_THAN_OP308)
                    ;
                    adaptor.addChild(root_0, LESS_THAN_OP308_tree);
                    }

                    GREATER_THAN_OP309=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_not_equal_op4632); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER_THAN_OP309_tree = 
                    (Object)adaptor.create(GREATER_THAN_OP309)
                    ;
                    adaptor.addChild(root_0, GREATER_THAN_OP309_tree);
                    }

                    }
                    break;
                case 3 :
                    // PLSQLCommons.g:495:10: EXCLAMATION_OPERATOR_PART EQUALS_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    EXCLAMATION_OPERATOR_PART310=(Token)match(input,EXCLAMATION_OPERATOR_PART,FOLLOW_EXCLAMATION_OPERATOR_PART_in_not_equal_op4643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXCLAMATION_OPERATOR_PART310_tree = 
                    (Object)adaptor.create(EXCLAMATION_OPERATOR_PART310)
                    ;
                    adaptor.addChild(root_0, EXCLAMATION_OPERATOR_PART310_tree);
                    }

                    EQUALS_OP311=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_not_equal_op4645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS_OP311_tree = 
                    (Object)adaptor.create(EQUALS_OP311)
                    ;
                    adaptor.addChild(root_0, EQUALS_OP311_tree);
                    }

                    }
                    break;
                case 4 :
                    // PLSQLCommons.g:496:10: CARRET_OPERATOR_PART EQUALS_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    CARRET_OPERATOR_PART312=(Token)match(input,CARRET_OPERATOR_PART,FOLLOW_CARRET_OPERATOR_PART_in_not_equal_op4656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CARRET_OPERATOR_PART312_tree = 
                    (Object)adaptor.create(CARRET_OPERATOR_PART312)
                    ;
                    adaptor.addChild(root_0, CARRET_OPERATOR_PART312_tree);
                    }

                    EQUALS_OP313=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_not_equal_op4658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS_OP313_tree = 
                    (Object)adaptor.create(EQUALS_OP313)
                    ;
                    adaptor.addChild(root_0, EQUALS_OP313_tree);
                    }

                    }
                    break;

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
    // $ANTLR end "not_equal_op"


    public static class greater_than_or_equals_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "greater_than_or_equals_op"
    // PLSQLCommons.g:499:1: greater_than_or_equals_op : ( GREATER_THAN_OR_EQUALS_OP | GREATER_THAN_OP EQUALS_OP );
    public final greater_than_or_equals_op_return greater_than_or_equals_op() throws RecognitionException {
        greater_than_or_equals_op_return retval = new greater_than_or_equals_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GREATER_THAN_OR_EQUALS_OP314=null;
        Token GREATER_THAN_OP315=null;
        Token EQUALS_OP316=null;

        Object GREATER_THAN_OR_EQUALS_OP314_tree=null;
        Object GREATER_THAN_OP315_tree=null;
        Object EQUALS_OP316_tree=null;

        try {
            // PLSQLCommons.g:500:5: ( GREATER_THAN_OR_EQUALS_OP | GREATER_THAN_OP EQUALS_OP )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==GREATER_THAN_OR_EQUALS_OP) ) {
                alt98=1;
            }
            else if ( (LA98_0==GREATER_THAN_OP) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // PLSQLCommons.g:500:10: GREATER_THAN_OR_EQUALS_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    GREATER_THAN_OR_EQUALS_OP314=(Token)match(input,GREATER_THAN_OR_EQUALS_OP,FOLLOW_GREATER_THAN_OR_EQUALS_OP_in_greater_than_or_equals_op4678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER_THAN_OR_EQUALS_OP314_tree = 
                    (Object)adaptor.create(GREATER_THAN_OR_EQUALS_OP314)
                    ;
                    adaptor.addChild(root_0, GREATER_THAN_OR_EQUALS_OP314_tree);
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:501:10: GREATER_THAN_OP EQUALS_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    GREATER_THAN_OP315=(Token)match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_greater_than_or_equals_op4689); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER_THAN_OP315_tree = 
                    (Object)adaptor.create(GREATER_THAN_OP315)
                    ;
                    adaptor.addChild(root_0, GREATER_THAN_OP315_tree);
                    }

                    EQUALS_OP316=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_greater_than_or_equals_op4691); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS_OP316_tree = 
                    (Object)adaptor.create(EQUALS_OP316)
                    ;
                    adaptor.addChild(root_0, EQUALS_OP316_tree);
                    }

                    }
                    break;

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
    // $ANTLR end "greater_than_or_equals_op"


    public static class less_than_or_equals_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "less_than_or_equals_op"
    // PLSQLCommons.g:504:1: less_than_or_equals_op : ( LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP EQUALS_OP );
    public final less_than_or_equals_op_return less_than_or_equals_op() throws RecognitionException {
        less_than_or_equals_op_return retval = new less_than_or_equals_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LESS_THAN_OR_EQUALS_OP317=null;
        Token LESS_THAN_OP318=null;
        Token EQUALS_OP319=null;

        Object LESS_THAN_OR_EQUALS_OP317_tree=null;
        Object LESS_THAN_OP318_tree=null;
        Object EQUALS_OP319_tree=null;

        try {
            // PLSQLCommons.g:505:5: ( LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP EQUALS_OP )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==LESS_THAN_OR_EQUALS_OP) ) {
                alt99=1;
            }
            else if ( (LA99_0==LESS_THAN_OP) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }
            switch (alt99) {
                case 1 :
                    // PLSQLCommons.g:505:10: LESS_THAN_OR_EQUALS_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    LESS_THAN_OR_EQUALS_OP317=(Token)match(input,LESS_THAN_OR_EQUALS_OP,FOLLOW_LESS_THAN_OR_EQUALS_OP_in_less_than_or_equals_op4711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_THAN_OR_EQUALS_OP317_tree = 
                    (Object)adaptor.create(LESS_THAN_OR_EQUALS_OP317)
                    ;
                    adaptor.addChild(root_0, LESS_THAN_OR_EQUALS_OP317_tree);
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:506:10: LESS_THAN_OP EQUALS_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    LESS_THAN_OP318=(Token)match(input,LESS_THAN_OP,FOLLOW_LESS_THAN_OP_in_less_than_or_equals_op4722); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_THAN_OP318_tree = 
                    (Object)adaptor.create(LESS_THAN_OP318)
                    ;
                    adaptor.addChild(root_0, LESS_THAN_OP318_tree);
                    }

                    EQUALS_OP319=(Token)match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_less_than_or_equals_op4724); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUALS_OP319_tree = 
                    (Object)adaptor.create(EQUALS_OP319)
                    ;
                    adaptor.addChild(root_0, EQUALS_OP319_tree);
                    }

                    }
                    break;

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
    // $ANTLR end "less_than_or_equals_op"


    public static class concatenation_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concatenation_op"
    // PLSQLCommons.g:509:1: concatenation_op : ( CONCATENATION_OP | VERTICAL_BAR VERTICAL_BAR );
    public final concatenation_op_return concatenation_op() throws RecognitionException {
        concatenation_op_return retval = new concatenation_op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONCATENATION_OP320=null;
        Token VERTICAL_BAR321=null;
        Token VERTICAL_BAR322=null;

        Object CONCATENATION_OP320_tree=null;
        Object VERTICAL_BAR321_tree=null;
        Object VERTICAL_BAR322_tree=null;

        try {
            // PLSQLCommons.g:510:5: ( CONCATENATION_OP | VERTICAL_BAR VERTICAL_BAR )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==CONCATENATION_OP) ) {
                alt100=1;
            }
            else if ( (LA100_0==VERTICAL_BAR) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }
            switch (alt100) {
                case 1 :
                    // PLSQLCommons.g:510:10: CONCATENATION_OP
                    {
                    root_0 = (Object)adaptor.nil();


                    CONCATENATION_OP320=(Token)match(input,CONCATENATION_OP,FOLLOW_CONCATENATION_OP_in_concatenation_op4744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONCATENATION_OP320_tree = 
                    (Object)adaptor.create(CONCATENATION_OP320)
                    ;
                    adaptor.addChild(root_0, CONCATENATION_OP320_tree);
                    }

                    }
                    break;
                case 2 :
                    // PLSQLCommons.g:511:10: VERTICAL_BAR VERTICAL_BAR
                    {
                    root_0 = (Object)adaptor.nil();


                    VERTICAL_BAR321=(Token)match(input,VERTICAL_BAR,FOLLOW_VERTICAL_BAR_in_concatenation_op4755); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VERTICAL_BAR321_tree = 
                    (Object)adaptor.create(VERTICAL_BAR321)
                    ;
                    adaptor.addChild(root_0, VERTICAL_BAR321_tree);
                    }

                    VERTICAL_BAR322=(Token)match(input,VERTICAL_BAR,FOLLOW_VERTICAL_BAR_in_concatenation_op4757); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VERTICAL_BAR322_tree = 
                    (Object)adaptor.create(VERTICAL_BAR322)
                    ;
                    adaptor.addChild(root_0, VERTICAL_BAR322_tree);
                    }

                    }
                    break;

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
    // $ANTLR end "concatenation_op"


    public static class outer_join_sign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outer_join_sign"
    // PLSQLCommons.g:514:1: outer_join_sign : LEFT_PAREN PLUS_SIGN RIGHT_PAREN ;
    public final outer_join_sign_return outer_join_sign() throws RecognitionException {
        outer_join_sign_return retval = new outer_join_sign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LEFT_PAREN323=null;
        Token PLUS_SIGN324=null;
        Token RIGHT_PAREN325=null;

        Object LEFT_PAREN323_tree=null;
        Object PLUS_SIGN324_tree=null;
        Object RIGHT_PAREN325_tree=null;

        try {
            // PLSQLCommons.g:515:5: ( LEFT_PAREN PLUS_SIGN RIGHT_PAREN )
            // PLSQLCommons.g:515:10: LEFT_PAREN PLUS_SIGN RIGHT_PAREN
            {
            root_0 = (Object)adaptor.nil();


            LEFT_PAREN323=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_outer_join_sign4777); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFT_PAREN323_tree = 
            (Object)adaptor.create(LEFT_PAREN323)
            ;
            adaptor.addChild(root_0, LEFT_PAREN323_tree);
            }

            PLUS_SIGN324=(Token)match(input,PLUS_SIGN,FOLLOW_PLUS_SIGN_in_outer_join_sign4779); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PLUS_SIGN324_tree = 
            (Object)adaptor.create(PLUS_SIGN324)
            ;
            adaptor.addChild(root_0, PLUS_SIGN324_tree);
            }

            RIGHT_PAREN325=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_outer_join_sign4781); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHT_PAREN325_tree = 
            (Object)adaptor.create(RIGHT_PAREN325)
            ;
            adaptor.addChild(root_0, RIGHT_PAREN325_tree);
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
    // $ANTLR end "outer_join_sign"

    // $ANTLR start synpred1_PLSQLCommons
    public final void synpred1_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:86:10: ( ( as_key )? ( id | alias_quoted_string ) )
        // PLSQLCommons.g:86:10: ( as_key )? ( id | alias_quoted_string )
        {
        // PLSQLCommons.g:86:10: ( as_key )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( (LA101_0==SQL92_RESERVED_AS) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // PLSQLCommons.g:86:10: as_key
                {
                pushFollow(FOLLOW_as_key_in_synpred1_PLSQLCommons419);
                gPLSQLParser.as_key();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // PLSQLCommons.g:86:18: ( id | alias_quoted_string )
        int alt102=2;
        int LA102_0 = input.LA(1);

        if ( (LA102_0==DELIMITED_ID||LA102_0==INTRODUCER||LA102_0==REGULAR_ID) ) {
            alt102=1;
        }
        else if ( ((LA102_0 >= CHAR_STRING && LA102_0 <= CHAR_STRING_PERL)||LA102_0==NATIONAL_CHAR_STRING_LIT) ) {
            alt102=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 102, 0, input);

            throw nvae;

        }
        switch (alt102) {
            case 1 :
                // PLSQLCommons.g:86:19: id
                {
                pushFollow(FOLLOW_id_in_synpred1_PLSQLCommons423);
                id();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // PLSQLCommons.g:86:22: alias_quoted_string
                {
                pushFollow(FOLLOW_alias_quoted_string_in_synpred1_PLSQLCommons425);
                alias_quoted_string();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred1_PLSQLCommons

    // $ANTLR start synpred2_PLSQLCommons
    public final void synpred2_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:155:14: ( PERIOD id_expression )
        // PLSQLCommons.g:155:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred2_PLSQLCommons942); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred2_PLSQLCommons944);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_PLSQLCommons

    // $ANTLR start synpred3_PLSQLCommons
    public final void synpred3_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:165:14: ( PERIOD id_expression )
        // PLSQLCommons.g:165:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred3_PLSQLCommons1041); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred3_PLSQLCommons1043);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_PLSQLCommons

    // $ANTLR start synpred4_PLSQLCommons
    public final void synpred4_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:185:14: ( PERIOD id_expression )
        // PLSQLCommons.g:185:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred4_PLSQLCommons1202); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred4_PLSQLCommons1204);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_PLSQLCommons

    // $ANTLR start synpred5_PLSQLCommons
    public final void synpred5_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:195:14: ( PERIOD id_expression )
        // PLSQLCommons.g:195:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred5_PLSQLCommons1291); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred5_PLSQLCommons1293);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_PLSQLCommons

    // $ANTLR start synpred6_PLSQLCommons
    public final void synpred6_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:205:25: ( PERIOD id_expression )
        // PLSQLCommons.g:205:26: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred6_PLSQLCommons1390); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred6_PLSQLCommons1392);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_PLSQLCommons

    // $ANTLR start synpred7_PLSQLCommons
    public final void synpred7_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:210:25: ( PERIOD id_expression )
        // PLSQLCommons.g:210:26: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred7_PLSQLCommons1441); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred7_PLSQLCommons1443);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_PLSQLCommons

    // $ANTLR start synpred8_PLSQLCommons
    public final void synpred8_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:215:14: ( PERIOD id_expression )
        // PLSQLCommons.g:215:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred8_PLSQLCommons1492); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred8_PLSQLCommons1494);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_PLSQLCommons

    // $ANTLR start synpred9_PLSQLCommons
    public final void synpred9_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:220:14: ( PERIOD id_expression )
        // PLSQLCommons.g:220:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred9_PLSQLCommons1545); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred9_PLSQLCommons1547);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_PLSQLCommons

    // $ANTLR start synpred10_PLSQLCommons
    public final void synpred10_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:225:14: ( PERIOD id_expression )
        // PLSQLCommons.g:225:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred10_PLSQLCommons1598); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred10_PLSQLCommons1600);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_PLSQLCommons

    // $ANTLR start synpred11_PLSQLCommons
    public final void synpred11_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:230:14: ( PERIOD id_expression )
        // PLSQLCommons.g:230:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred11_PLSQLCommons1651); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred11_PLSQLCommons1653);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_PLSQLCommons

    // $ANTLR start synpred12_PLSQLCommons
    public final void synpred12_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:236:28: ( PERIOD id_expression )
        // PLSQLCommons.g:236:29: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred12_PLSQLCommons1722); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred12_PLSQLCommons1724);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_PLSQLCommons

    // $ANTLR start synpred13_PLSQLCommons
    public final void synpred13_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:258:14: ( PERIOD id_expression )
        // PLSQLCommons.g:258:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred13_PLSQLCommons1926); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred13_PLSQLCommons1928);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_PLSQLCommons

    // $ANTLR start synpred14_PLSQLCommons
    public final void synpred14_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:268:14: ( PERIOD id_expression )
        // PLSQLCommons.g:268:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred14_PLSQLCommons2014); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred14_PLSQLCommons2016);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_PLSQLCommons

    // $ANTLR start synpred15_PLSQLCommons
    public final void synpred15_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:273:14: ( PERIOD id_expression )
        // PLSQLCommons.g:273:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred15_PLSQLCommons2067); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred15_PLSQLCommons2069);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred15_PLSQLCommons

    // $ANTLR start synpred16_PLSQLCommons
    public final void synpred16_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:281:25: ( PERIOD id_expression )
        // PLSQLCommons.g:281:26: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred16_PLSQLCommons2161); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred16_PLSQLCommons2163);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_PLSQLCommons

    // $ANTLR start synpred17_PLSQLCommons
    public final void synpred17_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:319:19: ( tableview_name PERIOD ASTERISK )
        // PLSQLCommons.g:319:20: tableview_name PERIOD ASTERISK
        {
        pushFollow(FOLLOW_tableview_name_in_synpred17_PLSQLCommons2558);
        tableview_name();

        state._fsp--;
        if (state.failed) return ;

        match(input,PERIOD,FOLLOW_PERIOD_in_synpred17_PLSQLCommons2560); if (state.failed) return ;

        match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred17_PLSQLCommons2562); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_PLSQLCommons

    // $ANTLR start synpred18_PLSQLCommons
    public final void synpred18_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:334:11: ( id EQUALS_OP GREATER_THAN_OP )
        // PLSQLCommons.g:334:12: id EQUALS_OP GREATER_THAN_OP
        {
        pushFollow(FOLLOW_id_in_synpred18_PLSQLCommons2742);
        id();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUALS_OP,FOLLOW_EQUALS_OP_in_synpred18_PLSQLCommons2744); if (state.failed) return ;

        match(input,GREATER_THAN_OP,FOLLOW_GREATER_THAN_OP_in_synpred18_PLSQLCommons2746); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_PLSQLCommons

    // $ANTLR start synpred19_PLSQLCommons
    public final void synpred19_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:421:11: ( PERIOD general_element_part )
        // PLSQLCommons.g:421:12: PERIOD general_element_part
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred19_PLSQLCommons3806); if (state.failed) return ;

        pushFollow(FOLLOW_general_element_part_in_synpred19_PLSQLCommons3808);
        general_element_part();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_PLSQLCommons

    // $ANTLR start synpred20_PLSQLCommons
    public final void synpred20_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:427:32: ( PERIOD general_element_part )
        // PLSQLCommons.g:427:33: PERIOD general_element_part
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred20_PLSQLCommons3884); if (state.failed) return ;

        pushFollow(FOLLOW_general_element_part_in_synpred20_PLSQLCommons3886);
        general_element_part();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_PLSQLCommons

    // $ANTLR start synpred21_PLSQLCommons
    public final void synpred21_PLSQLCommons_fragment() throws RecognitionException {
        // PLSQLCommons.g:435:14: ( PERIOD id_expression )
        // PLSQLCommons.g:435:15: PERIOD id_expression
        {
        match(input,PERIOD,FOLLOW_PERIOD_in_synpred21_PLSQLCommons3977); if (state.failed) return ;

        pushFollow(FOLLOW_id_expression_in_synpred21_PLSQLCommons3979);
        id_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_PLSQLCommons

    // Delegated rules

    public final boolean synpred4_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_PLSQLCommons() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_PLSQLCommons_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA79 dfa79 = new DFA79(this);
    static final String DFA32_eotS =
        "\132\uffff";
    static final String DFA32_eofS =
        "\1\3\131\uffff";
    static final String DFA32_minS =
        "\1\5\1\uffff\1\0\127\uffff";
    static final String DFA32_maxS =
        "\1\u0098\1\uffff\1\0\127\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\125\uffff\1\2";
    static final String DFA32_specialS =
        "\2\uffff\1\0\127\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\3\1\uffff\1\3\1\1\1\3\1\uffff\5\3\1\uffff\2\3\1\uffff\4\3"+
            "\1\uffff\2\3\1\uffff\7\3\1\uffff\1\3\1\uffff\2\3\1\uffff\1\3"+
            "\2\uffff\1\3\11\uffff\2\3\5\uffff\1\3\2\uffff\1\3\11\uffff\1"+
            "\2\3\3\2\uffff\1\3\1\uffff\1\3\1\uffff\10\3\1\uffff\2\3\1\uffff"+
            "\7\3\1\uffff\2\3\1\uffff\5\3\2\uffff\14\3\1\uffff\2\3\1\uffff"+
            "\2\3\2\uffff\1\3\3\uffff\4\3\1\uffff\2\3\1\uffff\3\3\2\uffff"+
            "\2\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "274:5: ( AT_SIGN link_name |{...}? => partition_extension_clause )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((((!(input.LA(2) == SQL92_RESERVED_BY))&&(!(input.LA(2) == SQL92_RESERVED_BY)))&&((input.LT(1).getText().equalsIgnoreCase("subpartition"))||(input.LT(1).getText().equalsIgnoreCase("partition"))))) ) {s = 89;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA35_eotS =
        "\106\uffff";
    static final String DFA35_eofS =
        "\1\2\105\uffff";
    static final String DFA35_minS =
        "\1\6\1\0\104\uffff";
    static final String DFA35_maxS =
        "\1\u0098\1\0\104\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\102\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\104\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\2\3\uffff\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\7\2\1\uffff\1\2\1\uffff\1\2\2\uffff"+
            "\1\2\2\uffff\1\2\11\uffff\2\2\5\uffff\1\2\2\uffff\1\2\11\uffff"+
            "\1\1\3\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\1\uffff\2\2\2\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\3\2\2\uffff\2\2\3\uffff\3\2\2\uffff"+
            "\11\2\2\uffff\1\2\1\uffff\2\2\5\uffff\1\2\3\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "295:22: ( over_clause )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((input.LT(1).getText().equalsIgnoreCase("over"))) ) {s = 69;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA54_eotS =
        "\33\uffff";
    static final String DFA54_eofS =
        "\33\uffff";
    static final String DFA54_minS =
        "\1\5\1\22\1\5\1\7\1\uffff\2\22\1\5\14\uffff\1\5\1\22\2\7\1\uffff"+
        "\2\22";
    static final String DFA54_maxS =
        "\1\u0097\1\112\2\u0098\1\uffff\2\112\1\u0097\14\uffff\1\u0097\1"+
        "\112\2\u0098\1\uffff\2\112";
    static final String DFA54_acceptS =
        "\4\uffff\1\2\3\uffff\14\2\4\uffff\1\1\2\uffff";
    static final String DFA54_specialS =
        "\2\uffff\1\1\4\uffff\1\2\14\uffff\1\0\6\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\4\3\uffff\1\4\2\uffff\3\4\3\uffff\1\3\3\uffff\1\4\5\uffff"+
            "\1\1\1\uffff\1\4\2\uffff\2\4\4\uffff\1\4\30\uffff\1\4\11\uffff"+
            "\1\2\7\uffff\1\4\2\uffff\1\4\5\uffff\1\4\4\uffff\2\4\1\uffff"+
            "\1\4\2\uffff\1\4\4\uffff\2\4\15\uffff\2\4\6\uffff\1\4\11\uffff"+
            "\1\4\12\uffff\1\4",
            "\1\6\67\uffff\1\5",
            "\1\20\1\uffff\1\23\1\uffff\1\17\1\uffff\1\23\2\21\1\17\1\23"+
            "\1\uffff\1\23\1\13\2\uffff\1\7\1\20\1\23\1\uffff\2\23\1\uffff"+
            "\1\16\4\23\1\4\1\21\1\uffff\1\23\1\uffff\1\23\1\10\30\uffff"+
            "\1\4\11\uffff\1\11\1\uffff\1\23\3\uffff\1\23\1\uffff\1\12\1"+
            "\uffff\1\23\1\15\3\uffff\1\23\1\uffff\1\14\5\uffff\1\20\1\uffff"+
            "\1\22\2\uffff\1\12\4\uffff\1\15\1\22\7\uffff\1\23\3\uffff\3"+
            "\23\1\22\3\uffff\1\23\2\uffff\1\10\11\uffff\1\22\12\uffff\1"+
            "\20\1\23",
            "\1\23\3\uffff\1\23\3\uffff\1\23\1\uffff\1\23\3\uffff\1\24\1"+
            "\uffff\1\23\1\uffff\2\23\2\uffff\5\23\2\uffff\1\23\1\uffff\1"+
            "\23\31\uffff\1\23\11\uffff\1\23\1\uffff\1\23\3\uffff\1\23\3"+
            "\uffff\1\23\4\uffff\1\23\1\uffff\1\23\30\uffff\1\23\3\uffff"+
            "\3\23\4\uffff\1\23\30\uffff\1\23",
            "",
            "\1\27\23\uffff\1\25\43\uffff\1\26",
            "\1\27\23\uffff\1\25\43\uffff\1\26",
            "\1\23\3\uffff\1\23\2\uffff\3\23\3\uffff\1\23\3\uffff\1\23\2"+
            "\uffff\1\30\2\uffff\1\23\1\uffff\1\23\2\uffff\2\23\4\uffff\1"+
            "\23\30\uffff\1\23\11\uffff\1\23\7\uffff\1\23\2\uffff\1\23\5"+
            "\uffff\1\23\5\uffff\1\23\1\uffff\1\23\2\uffff\1\23\4\uffff\2"+
            "\23\16\uffff\1\23\6\uffff\1\23\11\uffff\1\23\12\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\23\3\uffff\1\23\2\uffff\3\23\3\uffff\1\23\3\uffff\1\23\2"+
            "\uffff\1\30\2\uffff\1\23\1\uffff\1\23\2\uffff\2\23\4\uffff\1"+
            "\23\30\uffff\1\23\11\uffff\1\23\7\uffff\1\23\2\uffff\1\23\5"+
            "\uffff\1\23\5\uffff\1\23\1\uffff\1\23\2\uffff\1\23\4\uffff\2"+
            "\23\16\uffff\1\23\6\uffff\1\23\11\uffff\1\23\12\uffff\1\23",
            "\1\32\67\uffff\1\31",
            "\1\23\3\uffff\1\23\3\uffff\1\23\1\uffff\1\23\3\uffff\1\24\1"+
            "\uffff\1\23\1\uffff\2\23\2\uffff\5\23\2\uffff\1\23\1\uffff\1"+
            "\23\31\uffff\1\23\11\uffff\1\23\1\uffff\1\23\3\uffff\1\23\3"+
            "\uffff\1\23\4\uffff\1\23\32\uffff\1\23\3\uffff\3\23\4\uffff"+
            "\1\23\30\uffff\1\23",
            "\1\23\3\uffff\1\23\3\uffff\1\23\1\uffff\1\23\3\uffff\1\24\1"+
            "\uffff\1\23\1\uffff\2\23\2\uffff\5\23\2\uffff\1\23\1\uffff\1"+
            "\23\31\uffff\1\23\11\uffff\1\23\1\uffff\1\23\3\uffff\1\23\3"+
            "\uffff\1\23\4\uffff\1\23\32\uffff\1\23\3\uffff\3\23\4\uffff"+
            "\1\23\30\uffff\1\23",
            "",
            "\1\27\23\uffff\1\25\43\uffff\1\26",
            "\1\27\23\uffff\1\25\43\uffff\1\26"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "334:10: ( ( id EQUALS_OP GREATER_THAN_OP )=> id EQUALS_OP GREATER_THAN_OP )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_20 = input.LA(1);

                         
                        int index54_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA54_20==GREATER_THAN_OP) && (synpred18_PLSQLCommons())) {s = 24;}

                        else if ( (LA54_20==APPROXIMATE_NUM_LIT||LA54_20==BINDVAR||(LA54_20 >= CHAR_STRING && LA54_20 <= COLON)||LA54_20==DELIMITED_ID||LA54_20==EXACT_NUM_LIT||LA54_20==INTRODUCER||LA54_20==LEFT_PAREN||(LA54_20 >= MINUS_SIGN && LA54_20 <= NATIONAL_CHAR_STRING_LIT)||LA54_20==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA54_20==PLUS_SIGN||LA54_20==REGULAR_ID||LA54_20==SQL92_RESERVED_ALL||LA54_20==SQL92_RESERVED_ANY||LA54_20==SQL92_RESERVED_CASE||LA54_20==SQL92_RESERVED_DATE||LA54_20==SQL92_RESERVED_DEFAULT||LA54_20==SQL92_RESERVED_DISTINCT||(LA54_20 >= SQL92_RESERVED_EXISTS && LA54_20 <= SQL92_RESERVED_FALSE)||LA54_20==SQL92_RESERVED_NULL||LA54_20==SQL92_RESERVED_PRIOR||LA54_20==SQL92_RESERVED_TRUE||LA54_20==UNSIGNED_INTEGER) ) {s = 19;}

                         
                        input.seek(index54_20);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA54_2==EQUALS_OP) ) {s = 7;}

                        else if ( (LA54_2==MINUS_SIGN||LA54_2==PLUS_SIGN) ) {s = 4;}

                        else if ( (LA54_2==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA54_2==SQL92_RESERVED_PRIOR) && ((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new"))))) {s = 8;}

                        else if ( (LA54_2==REGULAR_ID) ) {s = 9;}

                        else if ( (LA54_2==SQL92_RESERVED_ALL||LA54_2==SQL92_RESERVED_DISTINCT) && ((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new"))))) {s = 10;}

                        else if ( (LA54_2==DELIMITED_ID) && (((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new")))||(input.LT(1).getText().equalsIgnoreCase("interval"))))) {s = 11;}

                        else if ( (LA54_2==SQL92_RESERVED_CASE) ) {s = 12;}

                        else if ( (LA54_2==SQL92_RESERVED_ANY||LA54_2==SQL92_RESERVED_EXISTS) && ((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new"))))) {s = 13;}

                        else if ( (LA54_2==INTRODUCER) && (((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new")))||(input.LT(1).getText().equalsIgnoreCase("interval"))))) {s = 14;}

                        else if ( (LA54_2==BINDVAR||LA54_2==COLON) ) {s = 15;}

                        else if ( (LA54_2==APPROXIMATE_NUM_LIT||LA54_2==EXACT_NUM_LIT||LA54_2==SQL92_RESERVED_DATE||LA54_2==UNSIGNED_INTEGER) && ((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new"))))) {s = 16;}

                        else if ( ((LA54_2 >= CHAR_STRING && LA54_2 <= CHAR_STRING_PERL)||LA54_2==NATIONAL_CHAR_STRING_LIT) ) {s = 17;}

                        else if ( (LA54_2==SQL92_RESERVED_DEFAULT||LA54_2==SQL92_RESERVED_FALSE||LA54_2==SQL92_RESERVED_NULL||LA54_2==SQL92_RESERVED_TRUE) && ((((input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals("."))&&(input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")))&&(input.LT(1).getText().equalsIgnoreCase("new"))))) {s = 18;}

                        else if ( (LA54_2==ASTERISK||LA54_2==CARRET_OPERATOR_PART||LA54_2==COMMA||LA54_2==CONCATENATION_OP||LA54_2==EXCLAMATION_OPERATOR_PART||(LA54_2 >= GREATER_THAN_OP && LA54_2 <= GREATER_THAN_OR_EQUALS_OP)||(LA54_2 >= LEFT_BRACKET && LA54_2 <= LESS_THAN_OR_EQUALS_OP)||LA54_2==NOT_EQUAL_OP||LA54_2==PERIOD||LA54_2==RIGHT_PAREN||LA54_2==SOLIDUS||LA54_2==SQL92_RESERVED_AND||LA54_2==SQL92_RESERVED_BETWEEN||LA54_2==SQL92_RESERVED_IN||(LA54_2 >= SQL92_RESERVED_IS && LA54_2 <= SQL92_RESERVED_NOT)||LA54_2==SQL92_RESERVED_OR||LA54_2==VERTICAL_BAR) ) {s = 19;}

                         
                        input.seek(index54_2);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA54_7==GREATER_THAN_OP) && (synpred18_PLSQLCommons())) {s = 24;}

                        else if ( (LA54_7==APPROXIMATE_NUM_LIT||LA54_7==BINDVAR||(LA54_7 >= CHAR_STRING && LA54_7 <= COLON)||LA54_7==DELIMITED_ID||LA54_7==EXACT_NUM_LIT||LA54_7==INTRODUCER||LA54_7==LEFT_PAREN||(LA54_7 >= MINUS_SIGN && LA54_7 <= NATIONAL_CHAR_STRING_LIT)||LA54_7==PLSQL_NON_RESERVED_CONNECT_BY_ROOT||LA54_7==PLUS_SIGN||LA54_7==REGULAR_ID||LA54_7==SQL92_RESERVED_ALL||LA54_7==SQL92_RESERVED_ANY||LA54_7==SQL92_RESERVED_CASE||LA54_7==SQL92_RESERVED_DATE||LA54_7==SQL92_RESERVED_DEFAULT||LA54_7==SQL92_RESERVED_DISTINCT||(LA54_7 >= SQL92_RESERVED_EXISTS && LA54_7 <= SQL92_RESERVED_FALSE)||LA54_7==SQL92_RESERVED_NULL||LA54_7==SQL92_RESERVED_PRIOR||LA54_7==SQL92_RESERVED_TRUE||LA54_7==UNSIGNED_INTEGER) ) {s = 19;}

                         
                        input.seek(index54_7);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA79_eotS =
        "\105\uffff";
    static final String DFA79_eofS =
        "\1\2\104\uffff";
    static final String DFA79_minS =
        "\1\6\104\uffff";
    static final String DFA79_maxS =
        "\1\u0098\104\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\2\102\uffff";
    static final String DFA79_specialS =
        "\105\uffff}>";
    static final String[] DFA79_transitionS = {
            "\2\2\3\uffff\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\2\2\1\uffff\2\2\1\1\4\2\1\uffff\1\2\1\uffff\1\2"+
            "\2\uffff\1\2\2\uffff\1\2\11\uffff\2\2\5\uffff\1\2\2\uffff\1"+
            "\2\11\uffff\4\2\2\uffff\1\2\3\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\3\uffff\1\2\1\uffff\3\2\2\uffff\2\2\3\uffff"+
            "\3\2\2\uffff\11\2\2\uffff\1\2\1\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\3\2\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "435:62: ( function_argument )?";
        }
    }
 

    public static final BitSet FOLLOW_subpartition_key_in_partition_extension_clause367 = new BitSet(new long[]{0x0000000040000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_partition_key_in_partition_extension_clause372 = new BitSet(new long[]{0x0000000040000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_for_key_in_partition_extension_clause386 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_expression_list_in_partition_extension_clause390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_as_key_in_column_alias419 = new BitSet(new long[]{0x0000000410043000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_column_alias423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_quoted_string_in_column_alias425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_as_key_in_column_alias456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_table_alias478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_quoted_string_in_table_alias482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_alias_quoted_string522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_where_key_in_where_clause555 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B88240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_current_of_clause_in_where_clause559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_wrapper_in_where_clause561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_current_key_in_current_of_clause582 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_of_key_in_current_of_clause585 = new BitSet(new long[]{0x0000000010044200L,0x0000000000000400L});
    public static final BitSet FOLLOW_cursor_name_in_current_of_clause588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_into_key_in_into_clause608 = new BitSet(new long[]{0x0000000010044200L,0x0000000000000400L});
    public static final BitSet FOLLOW_variable_name_in_into_clause611 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_into_clause614 = new BitSet(new long[]{0x0000000010044200L,0x0000000000000400L});
    public static final BitSet FOLLOW_variable_name_in_into_clause617 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_bulk_key_in_into_clause631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_collect_key_in_into_clause634 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_into_key_in_into_clause637 = new BitSet(new long[]{0x0000000010044200L,0x0000000000000400L});
    public static final BitSet FOLLOW_variable_name_in_into_clause640 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_into_clause643 = new BitSet(new long[]{0x0000000010044200L,0x0000000000000400L});
    public static final BitSet FOLLOW_variable_name_in_into_clause646 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_id_in_xml_column_name673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_xml_column_name692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_cost_class_name721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_attribute_name757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_savepoint_name793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rollback_segment_name829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_table_var_name866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_schema_name902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_routine_name938 = new BitSet(new long[]{0x0000004000000102L});
    public static final BitSet FOLLOW_PERIOD_in_routine_name948 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_routine_name950 = new BitSet(new long[]{0x0000004000000102L});
    public static final BitSet FOLLOW_AT_SIGN_in_routine_name955 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_link_name_in_routine_name957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_package_name1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_implementation_type_name1037 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_implementation_type_name1047 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_implementation_type_name1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_parameter_name1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_reference_model_name1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_main_model_name1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_aggregate_function_name1198 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_aggregate_function_name1208 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_aggregate_function_name1210 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_id_in_query_name1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_constraint_name1287 = new BitSet(new long[]{0x0000004000000102L});
    public static final BitSet FOLLOW_PERIOD_in_constraint_name1297 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_constraint_name1299 = new BitSet(new long[]{0x0000004000000102L});
    public static final BitSet FOLLOW_AT_SIGN_in_constraint_name1304 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_link_name_in_constraint_name1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_expression_in_label_name1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_expression_in_type_name1386 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_type_name1396 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_type_name1398 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_id_expression_in_sequence_name1437 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_sequence_name1447 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_sequence_name1449 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_id_in_exception_name1488 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_exception_name1498 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_exception_name1500 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_id_in_function_name1541 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_function_name1551 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_function_name1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_procedure_name1594 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_procedure_name1604 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_procedure_name1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_trigger_name1647 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_trigger_name1657 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_trigger_name1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTRODUCER_in_variable_name1700 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_char_set_name_in_variable_name1702 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_variable_name1718 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_variable_name1728 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_variable_name1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_variable_in_variable_name1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_index_name1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_cursor_name1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_variable_in_cursor_name1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_record_name1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_variable_in_record_name1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_collection_name1922 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_collection_name1932 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_collection_name1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_link_name1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_column_name2010 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_column_name2020 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_column_name2022 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_id_in_tableview_name2063 = new BitSet(new long[]{0x0000004000000102L,0x0000000000000400L});
    public static final BitSet FOLLOW_PERIOD_in_tableview_name2073 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_tableview_name2075 = new BitSet(new long[]{0x0000000000000102L,0x0000000000000400L});
    public static final BitSet FOLLOW_AT_SIGN_in_tableview_name2089 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_link_name_in_tableview_name2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partition_extension_clause_in_tableview_name2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_expression_in_char_set_name2157 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_char_set_name2167 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_char_set_name2169 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_keep_key_in_keep_clause2211 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_keep_clause2222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_dense_rank_key_in_keep_clause2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_first_key_in_keep_clause2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_last_key_in_keep_clause2242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_order_by_clause_in_keep_clause2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_keep_clause2268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_over_clause_in_keep_clause2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_argument2292 = new BitSet(new long[]{0x000000865044F220L,0x0C00184B08241401L,0x0000000000801004L});
    public static final BitSet FOLLOW_argument_in_function_argument2307 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_function_argument2311 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_argument_in_function_argument2313 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_argument2327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_keep_clause_in_function_argument2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_argument_analytic2378 = new BitSet(new long[]{0x000000865044F220L,0x0C00184B08241401L,0x0000000000801004L});
    public static final BitSet FOLLOW_argument_in_function_argument_analytic2393 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2395 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_function_argument_analytic2413 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_argument_in_function_argument_analytic2415 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_respect_or_ignore_nulls_in_function_argument_analytic2417 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_argument_analytic2432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_keep_clause_in_function_argument_analytic2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_function_argument_modeling2485 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_column_name_in_function_argument_modeling2499 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_COMMA_in_function_argument_modeling2502 = new BitSet(new long[]{0x0000000000400020L,0x0800000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_numeric_in_function_argument_modeling2505 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_null_key_in_function_argument_modeling2507 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_COMMA_in_function_argument_modeling2511 = new BitSet(new long[]{0x0000000000400020L,0x0800000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_numeric_in_function_argument_modeling2514 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_null_key_in_function_argument_modeling2516 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_using_key_in_function_argument_modeling2537 = new BitSet(new long[]{0x00000086504472A0L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_tableview_name_in_function_argument_modeling2566 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_PERIOD_in_function_argument_modeling2568 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASTERISK_in_function_argument_modeling2570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASTERISK_in_function_argument_modeling2590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_function_argument_modeling2610 = new BitSet(new long[]{0x000000041004B000L,0x0000000000401400L});
    public static final BitSet FOLLOW_column_alias_in_function_argument_modeling2612 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_function_argument_modeling2616 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_expression_in_function_argument_modeling2618 = new BitSet(new long[]{0x000000041004B000L,0x0000000000401400L});
    public static final BitSet FOLLOW_column_alias_in_function_argument_modeling2620 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_function_argument_modeling2652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_keep_clause_in_function_argument_modeling2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_respect_key_in_respect_or_ignore_nulls2705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ignore_key_in_respect_or_ignore_nulls2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_nulls_key_in_respect_or_ignore_nulls2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_argument2750 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_argument2752 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GREATER_THAN_OP_in_argument2754 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_expression_wrapper_in_argument2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_type_spec2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ref_key_in_type_spec2832 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_type_name_in_type_spec2835 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_percent_rowtype_key_in_type_spec2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_percent_type_key_in_type_spec2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_datatype_element_in_datatype2879 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_precision_part_in_datatype2889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_with_key_in_datatype2901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_local_key_in_datatype2903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_time_key_in_datatype2906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_zone_key_in_datatype2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interval_key_in_datatype2946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_year_key_in_datatype2949 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_day_key_in_datatype2951 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_datatype2971 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_expression_wrapper_in_datatype2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_datatype2975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_to_key_in_datatype2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_month_key_in_datatype2995 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_second_key_in_datatype2997 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_datatype3018 = new BitSet(new long[]{0x0000008650447220L,0x0C00184B08240401L,0x0000000000801004L});
    public static final BitSet FOLLOW_expression_wrapper_in_datatype3020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_datatype3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_precision_part3074 = new BitSet(new long[]{0x0000000000400020L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_numeric_in_precision_part3076 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001400L});
    public static final BitSet FOLLOW_COMMA_in_precision_part3079 = new BitSet(new long[]{0x0000000000400020L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_numeric_in_precision_part3081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_char_key_in_precision_part3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_byte_key_in_precision_part3090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_precision_part3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_integer_key_in_native_datatype_element3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pls_integer_key_in_native_datatype_element3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_natural_key_in_native_datatype_element3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_float_key_in_native_datatype_element3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binary_double_key_in_native_datatype_element3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_naturaln_key_in_native_datatype_element3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_positive_key_in_native_datatype_element3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_positiven_key_in_native_datatype_element3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signtype_key_in_native_datatype_element3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_integer_key_in_native_datatype_element3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nvarchar2_key_in_native_datatype_element3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_key_in_native_datatype_element3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_key_in_native_datatype_element3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_key_in_native_datatype_element3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_key_in_native_datatype_element3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_smallint_key_in_native_datatype_element3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_key_in_native_datatype_element3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_key_in_native_datatype_element3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_key_in_native_datatype_element3336 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_precision_key_in_native_datatype_element3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_key_in_native_datatype_element3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_key_in_native_datatype_element3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nchar_key_in_native_datatype_element3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_long_key_in_native_datatype_element3383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_raw_key_in_native_datatype_element3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_char_key_in_native_datatype_element3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_key_in_native_datatype_element3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varchar2_key_in_native_datatype_element3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varchar_key_in_native_datatype_element3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_key_in_native_datatype_element3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_raw_key_in_native_datatype_element3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_key_in_native_datatype_element3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_key_in_native_datatype_element3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rowid_key_in_native_datatype_element3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_urowid_key_in_native_datatype_element3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_year_key_in_native_datatype_element3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_month_key_in_native_datatype_element3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_day_key_in_native_datatype_element3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_key_in_native_datatype_element3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_key_in_native_datatype_element3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_key_in_native_datatype_element3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timezone_hour_key_in_native_datatype_element3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timezone_minute_key_in_native_datatype_element3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timezone_region_key_in_native_datatype_element3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timezone_abbr_key_in_native_datatype_element3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_key_in_native_datatype_element3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_unconstrained_key_in_native_datatype_element3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_tz_unconstrained_key_in_native_datatype_element3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestamp_ltz_unconstrained_key_in_native_datatype_element3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yminterval_unconstrained_key_in_native_datatype_element3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dsinterval_unconstrained_key_in_native_datatype_element3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bfile_key_in_native_datatype_element3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blob_key_in_native_datatype_element3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clob_key_in_native_datatype_element3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nclob_key_in_native_datatype_element3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mlslabel_key_in_native_datatype_element3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDVAR_in_bind_variable3754 = new BitSet(new long[]{0x0000004000004202L,0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_bind_variable3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_bind_variable3762 = new BitSet(new long[]{0x0000004000004202L,0x0000000000000400L});
    public static final BitSet FOLLOW_indicator_key_in_bind_variable3776 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_BINDVAR_in_bind_variable3782 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_COLON_in_bind_variable3786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_bind_variable3790 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_bind_variable3812 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_general_element_part_in_bind_variable3814 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_general_element_part_in_general_element3880 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_general_element3890 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_general_element_part_in_general_element3892 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_INTRODUCER_in_general_element_part3955 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_char_set_name_in_general_element_part3957 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_general_element_part3961 = new BitSet(new long[]{0x0000004040000002L});
    public static final BitSet FOLLOW_PERIOD_in_general_element_part3983 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_general_element_part3985 = new BitSet(new long[]{0x0000004040000002L});
    public static final BitSet FOLLOW_function_argument_in_general_element_part3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTRODUCER_in_table_element4062 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_char_set_name_in_table_element4064 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_table_element4068 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_PERIOD_in_table_element4071 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_table_element4073 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_timestamp_key_in_constant4120 = new BitSet(new long[]{0x0000000400007200L});
    public static final BitSet FOLLOW_quoted_string_in_constant4123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_bind_variable_in_constant4127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_at_key_in_constant4131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_time_key_in_constant4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_zone_key_in_constant4135 = new BitSet(new long[]{0x0000000400003000L});
    public static final BitSet FOLLOW_quoted_string_in_constant4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interval_key_in_constant4150 = new BitSet(new long[]{0x0000000410047200L,0x0000000000000400L});
    public static final BitSet FOLLOW_quoted_string_in_constant4153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_bind_variable_in_constant4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_general_element_part_in_constant4161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_day_key_in_constant4175 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_hour_key_in_constant4179 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_minute_key_in_constant4183 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_second_key_in_constant4187 = new BitSet(new long[]{0x0000000040000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_constant4201 = new BitSet(new long[]{0x0000000000004200L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant4204 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_bind_variable_in_constant4208 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_constant4212 = new BitSet(new long[]{0x0000000000004200L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant4215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_bind_variable_in_constant4219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_constant4225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_to_key_in_constant4240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_day_key_in_constant4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hour_key_in_constant4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minute_key_in_constant4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_second_key_in_constant4269 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_constant4272 = new BitSet(new long[]{0x0000000000004200L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_UNSIGNED_INTEGER_in_constant4275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_bind_variable_in_constant4279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_constant4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_in_constant4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_key_in_constant4320 = new BitSet(new long[]{0x0000000400003000L});
    public static final BitSet FOLLOW_quoted_string_in_constant4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_constant4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_null_key_in_constant4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_true_key_in_constant4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_false_key_in_constant4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dbtimezone_key_in_constant4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sessiontimezone_key_in_constant4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minvalue_key_in_constant4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_maxvalue_key_in_constant4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_default_key_in_constant4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTRODUCER_in_id4522 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_char_set_name_in_id4524 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_id4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGULAR_ID_in_id_expression4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELIMITED_ID_in_id_expression4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_OP_in_not_equal_op4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OP_in_not_equal_op4630 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GREATER_THAN_OP_in_not_equal_op4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAMATION_OPERATOR_PART_in_not_equal_op4643 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_not_equal_op4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARRET_OPERATOR_PART_in_not_equal_op4656 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_not_equal_op4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OR_EQUALS_OP_in_greater_than_or_equals_op4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_THAN_OP_in_greater_than_or_equals_op4689 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_greater_than_or_equals_op4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OR_EQUALS_OP_in_less_than_or_equals_op4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_THAN_OP_in_less_than_or_equals_op4722 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_less_than_or_equals_op4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCATENATION_OP_in_concatenation_op4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VERTICAL_BAR_in_concatenation_op4755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_VERTICAL_BAR_in_concatenation_op4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_outer_join_sign4777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUS_SIGN_in_outer_join_sign4779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_outer_join_sign4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_as_key_in_synpred1_PLSQLCommons419 = new BitSet(new long[]{0x0000000410043000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_in_synpred1_PLSQLCommons423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alias_quoted_string_in_synpred1_PLSQLCommons425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred2_PLSQLCommons942 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred2_PLSQLCommons944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred3_PLSQLCommons1041 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred3_PLSQLCommons1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred4_PLSQLCommons1202 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred4_PLSQLCommons1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred5_PLSQLCommons1291 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred5_PLSQLCommons1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred6_PLSQLCommons1390 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred6_PLSQLCommons1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred7_PLSQLCommons1441 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred7_PLSQLCommons1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred8_PLSQLCommons1492 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred8_PLSQLCommons1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred9_PLSQLCommons1545 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred9_PLSQLCommons1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred10_PLSQLCommons1598 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred10_PLSQLCommons1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred11_PLSQLCommons1651 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred11_PLSQLCommons1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred12_PLSQLCommons1722 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred12_PLSQLCommons1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred13_PLSQLCommons1926 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred13_PLSQLCommons1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred14_PLSQLCommons2014 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred14_PLSQLCommons2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred15_PLSQLCommons2067 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred15_PLSQLCommons2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred16_PLSQLCommons2161 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred16_PLSQLCommons2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableview_name_in_synpred17_PLSQLCommons2558 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_PERIOD_in_synpred17_PLSQLCommons2560 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASTERISK_in_synpred17_PLSQLCommons2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_synpred18_PLSQLCommons2742 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_OP_in_synpred18_PLSQLCommons2744 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_GREATER_THAN_OP_in_synpred18_PLSQLCommons2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred19_PLSQLCommons3806 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_general_element_part_in_synpred19_PLSQLCommons3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred20_PLSQLCommons3884 = new BitSet(new long[]{0x0000000010040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_general_element_part_in_synpred20_PLSQLCommons3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_synpred21_PLSQLCommons3977 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000400L});
    public static final BitSet FOLLOW_id_expression_in_synpred21_PLSQLCommons3979 = new BitSet(new long[]{0x0000000000000002L});

}