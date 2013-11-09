package br.com.porcelli.parser;



import java.util.LinkedList;


import org.antlr.runtime.*;

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
public class PLSQLLexer extends Lexer {
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

        // buffer (queue) to hold the emit()'d tokens
        private LinkedList<Token> tokenBuffer = new LinkedList<Token>();

        public void emit(Token t) {
            tokenBuffer.add(t);
        }

        private void advanceInput(){
            state.tokenStartCharIndex = input.index();
            state.tokenStartCharPositionInLine = input.getCharPositionInLine();
            state.tokenStartLine = input.getLine();
        }


        /**
         * Return a token from this source; i.e., match a token on the char stream.
         */
        public Token nextToken() {
            while (true) {
                if (tokenBuffer.size() == 0) {
                    state.token = null;
                    state.channel = Token.DEFAULT_CHANNEL;
                    state.tokenStartCharIndex = input.index();
                    state.tokenStartCharPositionInLine = input.getCharPositionInLine();
                    state.tokenStartLine = input.getLine();
                    state.text = null;
                    if (input.LA(1) == CharStream.EOF) {
                        return Token.EOF_TOKEN;
                    }
                    try {
                        int m = input.mark();
                        state.backtracking = 1;
                        state.failed = false;
                        mTokens();
                        state.backtracking = 0;

                        if (state.failed) {
                            input.rewind(m);
                            input.consume();
                        } else {
                            emit();
                        }
                    } catch (RecognitionException re) {
                        // shouldn't happen in backtracking mode, but...
                        reportError(re);
                        recover(re);
                    }
                } else {
                    Token result = tokenBuffer.poll();
                    if (result == Token.SKIP_TOKEN || result.getType() == Token.INVALID_TOKEN_TYPE || result == null)
                    {
                        // discard
                        // SKIP & INVALID
                        // tokens
                        continue;
                    }
                    return result;
                }
            }
        }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PLSQLLexer() {} 
    public PLSQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PLSQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "PLSQLLexer.g"; }

    // $ANTLR start "FOR_NOTATION"
    public final void mFOR_NOTATION() throws RecognitionException {
        try {
            int _type = FOR_NOTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:115:5: ( UNSIGNED_INTEGER '..' UNSIGNED_INTEGER )
            // PLSQLLexer.g:115:10: UNSIGNED_INTEGER '..' UNSIGNED_INTEGER
            {
            mUNSIGNED_INTEGER(); 


            state.type = UNSIGNED_INTEGER; emit(); advanceInput();

            match(".."); 



            state.type = DOUBLE_PERIOD; emit(); advanceInput();

            mUNSIGNED_INTEGER(); 


            state.type = UNSIGNED_INTEGER; emit(); advanceInput(); _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR_NOTATION"

    // $ANTLR start "NATIONAL_CHAR_STRING_LIT"
    public final void mNATIONAL_CHAR_STRING_LIT() throws RecognitionException {
        try {
            int _type = NATIONAL_CHAR_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:126:5: ( ( 'N' | 'n' ) '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' )
            // PLSQLLexer.g:126:10: ( 'N' | 'n' ) '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\''); 

            // PLSQLLexer.g:126:27: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\'') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='\'') ) {
                        alt1=2;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // PLSQLLexer.g:126:51: ~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // PLSQLLexer.g:126:76: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    }
            	    break;
            	case 3 :
            	    // PLSQLLexer.g:126:88: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NATIONAL_CHAR_STRING_LIT"

    // $ANTLR start "BIT_STRING_LIT"
    public final void mBIT_STRING_LIT() throws RecognitionException {
        try {
            int _type = BIT_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:133:5: ( ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+ )
            // PLSQLLexer.g:133:10: ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // PLSQLLexer.g:133:22: ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PLSQLLexer.g:133:23: '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )?
            	    {
            	    match('\''); 

            	    // PLSQLLexer.g:133:28: ( '0' | '1' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0 >= '0' && LA2_0 <= '1')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // PLSQLLexer.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    match('\''); 

            	    // PLSQLLexer.g:133:46: ( SEPARATOR )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' '||LA3_0=='-'||LA3_0=='/') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // PLSQLLexer.g:133:46: SEPARATOR
            	            {
            	            mSEPARATOR(); 


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BIT_STRING_LIT"

    // $ANTLR start "HEX_STRING_LIT"
    public final void mHEX_STRING_LIT() throws RecognitionException {
        try {
            int _type = HEX_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:141:5: ( ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+ )
            // PLSQLLexer.g:141:10: ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // PLSQLLexer.g:141:22: ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // PLSQLLexer.g:141:23: '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )?
            	    {
            	    match('\''); 

            	    // PLSQLLexer.g:141:28: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'F')||(LA5_0 >= 'a' && LA5_0 <= 'f')) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // PLSQLLexer.g:
            	    	    {
            	    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	    	        input.consume();
            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    match('\''); 

            	    // PLSQLLexer.g:141:67: ( SEPARATOR )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' '||LA6_0=='-'||LA6_0=='/') ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // PLSQLLexer.g:141:67: SEPARATOR
            	            {
            	            mSEPARATOR(); 


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_STRING_LIT"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:146:5: ( '.' )
            // PLSQLLexer.g:146:10: '.'
            {
            match('.'); 

                if ((char) input.LA(1) == '.') {
                        input.consume();
                        _type = DOUBLE_PERIOD;
                    }
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "EXACT_NUM_LIT"
    public final void mEXACT_NUM_LIT() throws RecognitionException {
        try {
            int _type = EXACT_NUM_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:160:5: ( ( UNSIGNED_INTEGER ( '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? ) ( 'D' | 'd' | 'f' | 'F' )? )
            // PLSQLLexer.g:160:7: ( UNSIGNED_INTEGER ( '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? ) ( 'D' | 'd' | 'f' | 'F' )?
            {
            // PLSQLLexer.g:160:7: ( UNSIGNED_INTEGER ( '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='.') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // PLSQLLexer.g:161:13: UNSIGNED_INTEGER ( '.' UNSIGNED_INTEGER |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    {
                    mUNSIGNED_INTEGER(); 


                    // PLSQLLexer.g:162:13: ( '.' UNSIGNED_INTEGER |)
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    else {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // PLSQLLexer.g:162:15: '.' UNSIGNED_INTEGER
                            {
                            match('.'); 

                            mUNSIGNED_INTEGER(); 


                            }
                            break;
                        case 2 :
                            // PLSQLLexer.g:163:18: 
                            {
                            _type = UNSIGNED_INTEGER;

                            }
                            break;

                    }


                    // PLSQLLexer.g:164:15: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // PLSQLLexer.g:164:17: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            // PLSQLLexer.g:164:29: ( '+' | '-' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='+'||LA9_0=='-') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // PLSQLLexer.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();
                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            mUNSIGNED_INTEGER(); 


                            _type = APPROXIMATE_NUM_LIT;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:165:10: '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    {
                    match('.'); 

                    mUNSIGNED_INTEGER(); 


                    // PLSQLLexer.g:165:31: ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // PLSQLLexer.g:165:33: ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            // PLSQLLexer.g:165:45: ( '+' | '-' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='+'||LA11_0=='-') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // PLSQLLexer.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();
                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;
                                    }


                                    }
                                    break;

                            }


                            mUNSIGNED_INTEGER(); 


                            _type = APPROXIMATE_NUM_LIT;

                            }
                            break;

                    }


                    }
                    break;

            }


            // PLSQLLexer.g:167:5: ( 'D' | 'd' | 'f' | 'F' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PLSQLLexer.g:
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXACT_NUM_LIT"

    // $ANTLR start "CHAR_STRING"
    public final void mCHAR_STRING() throws RecognitionException {
        try {
            int _type = CHAR_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:174:5: ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' )
            // PLSQLLexer.g:174:10: '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
            {
            match('\''); 

            // PLSQLLexer.g:174:15: ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
            loop15:
            do {
                int alt15=4;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\'') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='\'') ) {
                        alt15=2;
                    }


                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '\uFFFF')) ) {
                    alt15=1;
                }
                else if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                    alt15=3;
                }


                switch (alt15) {
            	case 1 :
            	    // PLSQLLexer.g:174:39: ~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // PLSQLLexer.g:174:63: '\\'' '\\''
            	    {
            	    match('\''); 

            	    match('\''); 

            	    }
            	    break;
            	case 3 :
            	    // PLSQLLexer.g:174:75: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_STRING"

    // $ANTLR start "CHAR_STRING_PERL"
    public final void mCHAR_STRING_PERL() throws RecognitionException {
        try {
            int _type = CHAR_STRING_PERL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:179:21: ( ( 'q' | 'Q' ) ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER ) )
            // PLSQLLexer.g:179:23: ( 'q' | 'Q' ) ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // PLSQLLexer.g:179:33: ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER )
            int alt16=5;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\'') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='<') ) {
                    alt16=1;
                }
                else if ( (LA16_1=='{') ) {
                    alt16=2;
                }
                else if ( (LA16_1=='[') ) {
                    alt16=3;
                }
                else if ( (LA16_1=='(') ) {
                    alt16=4;
                }
                else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '\b')||(LA16_1 >= '\u000B' && LA16_1 <= '\f')||(LA16_1 >= '\u000E' && LA16_1 <= '\u001F')||(LA16_1 >= '!' && LA16_1 <= '\'')||(LA16_1 >= ')' && LA16_1 <= ';')||(LA16_1 >= '=' && LA16_1 <= 'Z')||(LA16_1 >= '\\' && LA16_1 <= 'z')||(LA16_1 >= '|' && LA16_1 <= '\uFFFF')) ) {
                    alt16=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // PLSQLLexer.g:179:35: QS_ANGLE
                    {
                    mQS_ANGLE(); 


                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:179:46: QS_BRACE
                    {
                    mQS_BRACE(); 


                    }
                    break;
                case 3 :
                    // PLSQLLexer.g:179:57: QS_BRACK
                    {
                    mQS_BRACK(); 


                    }
                    break;
                case 4 :
                    // PLSQLLexer.g:179:68: QS_PAREN
                    {
                    mQS_PAREN(); 


                    }
                    break;
                case 5 :
                    // PLSQLLexer.g:179:79: QS_OTHER
                    {
                    mQS_OTHER(); 


                    }
                    break;

            }


            _type = CHAR_STRING;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_STRING_PERL"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            // PLSQLLexer.g:180:21: ( '\\'' )
            // PLSQLLexer.g:180:23: '\\''
            {
            match('\''); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "QS_ANGLE"
    public final void mQS_ANGLE() throws RecognitionException {
        try {
            // PLSQLLexer.g:181:21: ( QUOTE '<' ( options {greedy=false; } : . )* '>' QUOTE )
            // PLSQLLexer.g:181:23: QUOTE '<' ( options {greedy=false; } : . )* '>' QUOTE
            {
            mQUOTE(); 


            match('<'); 

            // PLSQLLexer.g:181:33: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='>') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='\'') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '&')||(LA17_1 >= '(' && LA17_1 <= '\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '=')||(LA17_0 >= '?' && LA17_0 <= '\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // PLSQLLexer.g:181:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match('>'); 

            mQUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QS_ANGLE"

    // $ANTLR start "QS_BRACE"
    public final void mQS_BRACE() throws RecognitionException {
        try {
            // PLSQLLexer.g:182:21: ( QUOTE '{' ( options {greedy=false; } : . )* '}' QUOTE )
            // PLSQLLexer.g:182:23: QUOTE '{' ( options {greedy=false; } : . )* '}' QUOTE
            {
            mQUOTE(); 


            match('{'); 

            // PLSQLLexer.g:182:33: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='}') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='\'') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '&')||(LA18_1 >= '(' && LA18_1 <= '\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '|')||(LA18_0 >= '~' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // PLSQLLexer.g:182:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match('}'); 

            mQUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QS_BRACE"

    // $ANTLR start "QS_BRACK"
    public final void mQS_BRACK() throws RecognitionException {
        try {
            // PLSQLLexer.g:183:21: ( QUOTE '[' ( options {greedy=false; } : . )* ']' QUOTE )
            // PLSQLLexer.g:183:23: QUOTE '[' ( options {greedy=false; } : . )* ']' QUOTE
            {
            mQUOTE(); 


            match('['); 

            // PLSQLLexer.g:183:33: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==']') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='\'') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1 >= '\u0000' && LA19_1 <= '&')||(LA19_1 >= '(' && LA19_1 <= '\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\\')||(LA19_0 >= '^' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // PLSQLLexer.g:183:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match(']'); 

            mQUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QS_BRACK"

    // $ANTLR start "QS_PAREN"
    public final void mQS_PAREN() throws RecognitionException {
        try {
            // PLSQLLexer.g:184:21: ( QUOTE '(' ( options {greedy=false; } : . )* ')' QUOTE )
            // PLSQLLexer.g:184:23: QUOTE '(' ( options {greedy=false; } : . )* ')' QUOTE
            {
            mQUOTE(); 


            match('('); 

            // PLSQLLexer.g:184:33: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==')') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='\'') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1 >= '\u0000' && LA20_1 <= '&')||(LA20_1 >= '(' && LA20_1 <= '\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '(')||(LA20_0 >= '*' && LA20_0 <= '\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // PLSQLLexer.g:184:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(')'); 

            mQUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QS_PAREN"

    // $ANTLR start "QS_OTHER_CH"
    public final void mQS_OTHER_CH() throws RecognitionException {
        try {
            // PLSQLLexer.g:186:21: (~ ( '<' | '{' | '[' | '(' | ' ' | '\\t' | '\\n' | '\\r' ) )
            // PLSQLLexer.g:
            {
            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\'')||(input.LA(1) >= ')' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= 'Z')||(input.LA(1) >= '\\' && input.LA(1) <= 'z')||(input.LA(1) >= '|' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QS_OTHER_CH"

    // $ANTLR start "QS_OTHER"
    public final void mQS_OTHER() throws RecognitionException {
        try {
            CommonToken delimiter=null;

            // PLSQLLexer.g:196:3: ( QUOTE delimiter= QS_OTHER_CH ({...}? => . )* ({...}? => . ) QUOTE )
            // PLSQLLexer.g:197:3: QUOTE delimiter= QS_OTHER_CH ({...}? => . )* ({...}? => . ) QUOTE
            {
            mQUOTE(); 


            int delimiterStart819 = getCharIndex();
            int delimiterStartLine819 = getLine();
            int delimiterStartCharPos819 = getCharPositionInLine();
            mQS_OTHER_CH(); 
            delimiter = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, delimiterStart819, getCharIndex()-1);
            delimiter.setLine(delimiterStartLine819);
            delimiter.setCharPositionInLine(delimiterStartCharPos819);


            // PLSQLLexer.g:199:5: ({...}? => . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= '\u0000' && LA21_0 <= '\uFFFF')) && ((( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') )||( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) == '\'' )))) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='\'') && ((( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') )||( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) == '\'' )))) {
                        int LA21_2 = input.LA(3);

                        if ( ((LA21_2 >= '\u0000' && LA21_2 <= '\uFFFF')) && (( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') ))) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1 >= '\u0000' && LA21_1 <= '&')||(LA21_1 >= '(' && LA21_1 <= '\uFFFF')) && (( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') ))) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // PLSQLLexer.g:199:7: {...}? => .
            	    {
            	    if ( !(( input.LT(1) != (delimiter!=null?delimiter.getText():null).charAt(0) || ( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) != '\'') )) ) {
            	        throw new FailedPredicateException(input, "QS_OTHER", " input.LT(1) != $delimiter.text.charAt(0) || ( input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) != '\\'') ");
            	    }

            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // PLSQLLexer.g:200:5: ({...}? => . )
            // PLSQLLexer.g:200:7: {...}? => .
            {
            if ( !(( input.LT(1) == (delimiter!=null?delimiter.getText():null).charAt(0) && input.LT(2) == '\'' )) ) {
                throw new FailedPredicateException(input, "QS_OTHER", " input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) == '\\'' ");
            }

            matchAny(); 

            }


            mQUOTE(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QS_OTHER"

    // $ANTLR start "DELIMITED_ID"
    public final void mDELIMITED_ID() throws RecognitionException {
        try {
            int _type = DELIMITED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:210:5: ( '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"' )
            // PLSQLLexer.g:210:10: '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+ '\"'
            {
            match('\"'); 

            // PLSQLLexer.g:210:14: (~ ( '\"' | '\\r' | '\\n' ) | '\"' '\"' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\"') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='\"') ) {
                        alt22=2;
                    }


                }
                else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '\t')||(LA22_0 >= '\u000B' && LA22_0 <= '\f')||(LA22_0 >= '\u000E' && LA22_0 <= '!')||(LA22_0 >= '#' && LA22_0 <= '\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // PLSQLLexer.g:210:15: ~ ( '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // PLSQLLexer.g:210:38: '\"' '\"'
            	    {
            	    match('\"'); 

            	    match('\"'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELIMITED_ID"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:216:5: ( '%' )
            // PLSQLLexer.g:216:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:220:5: ( '&' )
            // PLSQLLexer.g:220:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "LEFT_PAREN"
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:224:5: ( '(' )
            // PLSQLLexer.g:224:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_PAREN"

    // $ANTLR start "RIGHT_PAREN"
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:228:5: ( ')' )
            // PLSQLLexer.g:228:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_PAREN"

    // $ANTLR start "DOUBLE_ASTERISK"
    public final void mDOUBLE_ASTERISK() throws RecognitionException {
        try {
            int _type = DOUBLE_ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:232:5: ( '**' )
            // PLSQLLexer.g:232:10: '**'
            {
            match("**"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_ASTERISK"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:236:5: ( '*' )
            // PLSQLLexer.g:236:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "PLUS_SIGN"
    public final void mPLUS_SIGN() throws RecognitionException {
        try {
            int _type = PLUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:240:5: ( '+' )
            // PLSQLLexer.g:240:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_SIGN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:244:5: ( ',' )
            // PLSQLLexer.g:244:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SOLIDUS"
    public final void mSOLIDUS() throws RecognitionException {
        try {
            int _type = SOLIDUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:248:5: ( '/' )
            // PLSQLLexer.g:248:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SOLIDUS"

    // $ANTLR start "AT_SIGN"
    public final void mAT_SIGN() throws RecognitionException {
        try {
            int _type = AT_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:252:5: ( '@' )
            // PLSQLLexer.g:252:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT_SIGN"

    // $ANTLR start "ASSIGN_OP"
    public final void mASSIGN_OP() throws RecognitionException {
        try {
            int _type = ASSIGN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:256:5: ( ':=' )
            // PLSQLLexer.g:256:10: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN_OP"

    // $ANTLR start "BINDVAR"
    public final void mBINDVAR() throws RecognitionException {
        try {
            int _type = BINDVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:261:5: ( COLON SIMPLE_LETTER ( SIMPLE_LETTER | '0' .. '9' | '_' )* | COLON DELIMITED_ID | COLON UNSIGNED_INTEGER | QUESTION_MARK )
            int alt24=4;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==':') ) {
                switch ( input.LA(2) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt24=1;
                    }
                    break;
                case '\"':
                    {
                    alt24=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt24=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA24_0=='?') ) {
                alt24=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // PLSQLLexer.g:261:10: COLON SIMPLE_LETTER ( SIMPLE_LETTER | '0' .. '9' | '_' )*
                    {
                    mCOLON(); 


                    mSIMPLE_LETTER(); 


                    // PLSQLLexer.g:261:31: ( SIMPLE_LETTER | '0' .. '9' | '_' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0 >= '0' && LA23_0 <= '9')||(LA23_0 >= 'A' && LA23_0 <= 'Z')||LA23_0=='_'||(LA23_0 >= 'a' && LA23_0 <= 'z')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // PLSQLLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:262:10: COLON DELIMITED_ID
                    {
                    mCOLON(); 


                    mDELIMITED_ID(); 


                    }
                    break;
                case 3 :
                    // PLSQLLexer.g:263:10: COLON UNSIGNED_INTEGER
                    {
                    mCOLON(); 


                    mUNSIGNED_INTEGER(); 


                    }
                    break;
                case 4 :
                    // PLSQLLexer.g:264:10: QUESTION_MARK
                    {
                    mQUESTION_MARK(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINDVAR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:268:5: ( ':' )
            // PLSQLLexer.g:268:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:272:5: ( ';' )
            // PLSQLLexer.g:272:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LESS_THAN_OR_EQUALS_OP"
    public final void mLESS_THAN_OR_EQUALS_OP() throws RecognitionException {
        try {
            int _type = LESS_THAN_OR_EQUALS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:276:5: ( '<=' )
            // PLSQLLexer.g:276:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN_OR_EQUALS_OP"

    // $ANTLR start "LESS_THAN_OP"
    public final void mLESS_THAN_OP() throws RecognitionException {
        try {
            int _type = LESS_THAN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:280:5: ( '<' )
            // PLSQLLexer.g:280:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_THAN_OP"

    // $ANTLR start "GREATER_THAN_OR_EQUALS_OP"
    public final void mGREATER_THAN_OR_EQUALS_OP() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OR_EQUALS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:284:5: ( '>=' )
            // PLSQLLexer.g:284:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN_OR_EQUALS_OP"

    // $ANTLR start "NOT_EQUAL_OP"
    public final void mNOT_EQUAL_OP() throws RecognitionException {
        try {
            int _type = NOT_EQUAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:288:5: ( '!=' | '<>' | '^=' | '~=' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case '!':
                {
                alt25=1;
                }
                break;
            case '<':
                {
                alt25=2;
                }
                break;
            case '^':
                {
                alt25=3;
                }
                break;
            case '~':
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // PLSQLLexer.g:288:10: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:289:10: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 3 :
                    // PLSQLLexer.g:290:10: '^='
                    {
                    match("^="); 



                    }
                    break;
                case 4 :
                    // PLSQLLexer.g:291:10: '~='
                    {
                    match("~="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL_OP"

    // $ANTLR start "CARRET_OPERATOR_PART"
    public final void mCARRET_OPERATOR_PART() throws RecognitionException {
        try {
            int _type = CARRET_OPERATOR_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:294:5: ( '^' )
            // PLSQLLexer.g:294:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARRET_OPERATOR_PART"

    // $ANTLR start "TILDE_OPERATOR_PART"
    public final void mTILDE_OPERATOR_PART() throws RecognitionException {
        try {
            int _type = TILDE_OPERATOR_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:298:5: ( '~' )
            // PLSQLLexer.g:298:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE_OPERATOR_PART"

    // $ANTLR start "EXCLAMATION_OPERATOR_PART"
    public final void mEXCLAMATION_OPERATOR_PART() throws RecognitionException {
        try {
            int _type = EXCLAMATION_OPERATOR_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:302:5: ( '!' )
            // PLSQLLexer.g:302:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXCLAMATION_OPERATOR_PART"

    // $ANTLR start "GREATER_THAN_OP"
    public final void mGREATER_THAN_OP() throws RecognitionException {
        try {
            int _type = GREATER_THAN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:306:5: ( '>' )
            // PLSQLLexer.g:306:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER_THAN_OP"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            // PLSQLLexer.g:311:5: ( '?' )
            // PLSQLLexer.g:311:10: '?'
            {
            match('?'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "CONCATENATION_OP"
    public final void mCONCATENATION_OP() throws RecognitionException {
        try {
            int _type = CONCATENATION_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:316:5: ( '||' )
            // PLSQLLexer.g:316:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONCATENATION_OP"

    // $ANTLR start "VERTICAL_BAR"
    public final void mVERTICAL_BAR() throws RecognitionException {
        try {
            int _type = VERTICAL_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:320:5: ( '|' )
            // PLSQLLexer.g:320:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERTICAL_BAR"

    // $ANTLR start "EQUALS_OP"
    public final void mEQUALS_OP() throws RecognitionException {
        try {
            int _type = EQUALS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:324:5: ( '=' )
            // PLSQLLexer.g:324:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS_OP"

    // $ANTLR start "LEFT_BRACKET"
    public final void mLEFT_BRACKET() throws RecognitionException {
        try {
            int _type = LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:329:5: ( '[' )
            // PLSQLLexer.g:329:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT_BRACKET"

    // $ANTLR start "RIGHT_BRACKET"
    public final void mRIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:333:5: ( ']' )
            // PLSQLLexer.g:333:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT_BRACKET"

    // $ANTLR start "INTRODUCER"
    public final void mINTRODUCER() throws RecognitionException {
        try {
            int _type = INTRODUCER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:340:5: ( '_' ( SEPARATOR )? )
            // PLSQLLexer.g:340:10: '_' ( SEPARATOR )?
            {
            match('_'); 

            // PLSQLLexer.g:340:14: ( SEPARATOR )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0 >= '\t' && LA26_0 <= '\n')||LA26_0=='\r'||LA26_0==' '||LA26_0=='-'||LA26_0=='/') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PLSQLLexer.g:340:15: SEPARATOR
                    {
                    mSEPARATOR(); 


                    _type = UNDERSCORE;

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTRODUCER"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:346:5: ( '-' | COMMENT | ( SPACE | NEWLINE )+ )
            int alt28=3;
            switch ( input.LA(1) ) {
            case '-':
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1=='-') ) {
                    alt28=2;
                }
                else {
                    alt28=1;
                }
                }
                break;
            case '/':
                {
                alt28=2;
                }
                break;
            case '\t':
            case '\n':
            case '\r':
            case ' ':
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // PLSQLLexer.g:346:10: '-'
                    {
                    match('-'); 

                    _type = MINUS_SIGN;

                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:347:10: COMMENT
                    {
                    mCOMMENT(); 


                     _channel=HIDDEN; 

                    }
                    break;
                case 3 :
                    // PLSQLLexer.g:348:10: ( SPACE | NEWLINE )+
                    {
                    // PLSQLLexer.g:348:10: ( SPACE | NEWLINE )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\t'||LA27_0==' ') ) {
                            alt27=1;
                        }
                        else if ( (LA27_0=='\n'||LA27_0=='\r') ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // PLSQLLexer.g:348:11: SPACE
                    	    {
                    	    mSPACE(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // PLSQLLexer.g:348:19: NEWLINE
                    	    {
                    	    mNEWLINE(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                     _channel=HIDDEN; 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "SIMPLE_LETTER"
    public final void mSIMPLE_LETTER() throws RecognitionException {
        try {
            // PLSQLLexer.g:356:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // PLSQLLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIMPLE_LETTER"

    // $ANTLR start "UNSIGNED_INTEGER"
    public final void mUNSIGNED_INTEGER() throws RecognitionException {
        try {
            // PLSQLLexer.g:365:5: ( ( '0' .. '9' )+ )
            // PLSQLLexer.g:365:10: ( '0' .. '9' )+
            {
            // PLSQLLexer.g:365:10: ( '0' .. '9' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0 >= '0' && LA29_0 <= '9')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // PLSQLLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNED_INTEGER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // PLSQLLexer.g:372:5: ( '--' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='-') ) {
                alt33=1;
            }
            else if ( (LA33_0=='/') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // PLSQLLexer.g:372:10: '--' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
                    {
                    match("--"); 



                    // PLSQLLexer.g:372:15: (~ ( '\\r' | '\\n' ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0 >= '\u0000' && LA30_0 <= '\t')||(LA30_0 >= '\u000B' && LA30_0 <= '\f')||(LA30_0 >= '\u000E' && LA30_0 <= '\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // PLSQLLexer.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    // PLSQLLexer.g:372:35: ( NEWLINE | EOF )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\n'||LA31_0=='\r') ) {
                        alt31=1;
                    }
                    else {
                        alt31=2;
                    }
                    switch (alt31) {
                        case 1 :
                            // PLSQLLexer.g:372:36: NEWLINE
                            {
                            mNEWLINE(); 


                            }
                            break;
                        case 2 :
                            // PLSQLLexer.g:372:44: EOF
                            {
                            match(EOF); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:373:10: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // PLSQLLexer.g:373:15: ( options {greedy=false; } : . )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='*') ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1=='/') ) {
                                alt32=2;
                            }
                            else if ( ((LA32_1 >= '\u0000' && LA32_1 <= '.')||(LA32_1 >= '0' && LA32_1 <= '\uFFFF')) ) {
                                alt32=1;
                            }


                        }
                        else if ( ((LA32_0 >= '\u0000' && LA32_0 <= ')')||(LA32_0 >= '+' && LA32_0 <= '\uFFFF')) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // PLSQLLexer.g:373:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    match("*/"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "PROMPT"
    public final void mPROMPT() throws RecognitionException {
        try {
            int _type = PROMPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:380:2: ( 'prompt' SPACE (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) )
            // PLSQLLexer.g:380:4: 'prompt' SPACE (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
            {
            match("prompt"); 



            mSPACE(); 


            // PLSQLLexer.g:380:19: (~ ( '\\r' | '\\n' ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0 >= '\u0000' && LA34_0 <= '\t')||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||(LA34_0 >= '\u000E' && LA34_0 <= '\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // PLSQLLexer.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // PLSQLLexer.g:380:39: ( NEWLINE | EOF )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\n'||LA35_0=='\r') ) {
                alt35=1;
            }
            else {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // PLSQLLexer.g:380:40: NEWLINE
                    {
                    mNEWLINE(); 


                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:380:48: EOF
                    {
                    match(EOF); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROMPT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // PLSQLLexer.g:389:5: ( '\\r' ( options {greedy=true; } : '\\n' )? | '\\n' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\r') ) {
                alt37=1;
            }
            else if ( (LA37_0=='\n') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // PLSQLLexer.g:389:10: '\\r' ( options {greedy=true; } : '\\n' )?
                    {
                    match('\r'); 

                    // PLSQLLexer.g:389:15: ( options {greedy=true; } : '\\n' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\n') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // PLSQLLexer.g:389:39: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PLSQLLexer.g:390:10: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // PLSQLLexer.g:396:10: ( ' ' | '\\t' )
            // PLSQLLexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "APPROXIMATE_NUM_LIT"
    public final void mAPPROXIMATE_NUM_LIT() throws RecognitionException {
        try {
            // PLSQLLexer.g:401:29: ()
            // PLSQLLexer.g:401:31: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "APPROXIMATE_NUM_LIT"

    // $ANTLR start "MINUS_SIGN"
    public final void mMINUS_SIGN() throws RecognitionException {
        try {
            // PLSQLLexer.g:402:20: ()
            // PLSQLLexer.g:402:22: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_SIGN"

    // $ANTLR start "UNDERSCORE"
    public final void mUNDERSCORE() throws RecognitionException {
        try {
            // PLSQLLexer.g:403:20: ()
            // PLSQLLexer.g:403:22: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNDERSCORE"

    // $ANTLR start "DOUBLE_PERIOD"
    public final void mDOUBLE_PERIOD() throws RecognitionException {
        try {
            // PLSQLLexer.g:404:23: ()
            // PLSQLLexer.g:404:25: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_PERIOD"

    // $ANTLR start "SQL92_RESERVED_ALL"
    public final void mSQL92_RESERVED_ALL() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:410:5: ( 'all' )
            // PLSQLLexer.g:410:10: 'all'
            {
            match("all"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ALL"

    // $ANTLR start "SQL92_RESERVED_ALTER"
    public final void mSQL92_RESERVED_ALTER() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:414:5: ( 'alter' )
            // PLSQLLexer.g:414:10: 'alter'
            {
            match("alter"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ALTER"

    // $ANTLR start "SQL92_RESERVED_AND"
    public final void mSQL92_RESERVED_AND() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:418:5: ( 'and' )
            // PLSQLLexer.g:418:10: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_AND"

    // $ANTLR start "SQL92_RESERVED_ANY"
    public final void mSQL92_RESERVED_ANY() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:422:5: ( 'any' )
            // PLSQLLexer.g:422:10: 'any'
            {
            match("any"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ANY"

    // $ANTLR start "SQL92_RESERVED_AS"
    public final void mSQL92_RESERVED_AS() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:426:5: ( 'as' )
            // PLSQLLexer.g:426:10: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_AS"

    // $ANTLR start "SQL92_RESERVED_ASC"
    public final void mSQL92_RESERVED_ASC() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:430:5: ( 'asc' )
            // PLSQLLexer.g:430:10: 'asc'
            {
            match("asc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ASC"

    // $ANTLR start "SQL92_RESERVED_BEGIN"
    public final void mSQL92_RESERVED_BEGIN() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:438:5: ( 'begin' )
            // PLSQLLexer.g:438:10: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_BEGIN"

    // $ANTLR start "SQL92_RESERVED_BETWEEN"
    public final void mSQL92_RESERVED_BETWEEN() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:442:5: ( 'between' )
            // PLSQLLexer.g:442:10: 'between'
            {
            match("between"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_BETWEEN"

    // $ANTLR start "SQL92_RESERVED_BY"
    public final void mSQL92_RESERVED_BY() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:446:5: ( 'by' )
            // PLSQLLexer.g:446:10: 'by'
            {
            match("by"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_BY"

    // $ANTLR start "SQL92_RESERVED_CASE"
    public final void mSQL92_RESERVED_CASE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:450:5: ( 'case' )
            // PLSQLLexer.g:450:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_CASE"

    // $ANTLR start "SQL92_RESERVED_CHECK"
    public final void mSQL92_RESERVED_CHECK() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_CHECK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:454:5: ( 'check' )
            // PLSQLLexer.g:454:10: 'check'
            {
            match("check"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_CHECK"

    // $ANTLR start "PLSQL_RESERVED_CLUSTERS"
    public final void mPLSQL_RESERVED_CLUSTERS() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_CLUSTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:458:5: ( 'clusters' )
            // PLSQLLexer.g:458:10: 'clusters'
            {
            match("clusters"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_CLUSTERS"

    // $ANTLR start "PLSQL_RESERVED_COLAUTH"
    public final void mPLSQL_RESERVED_COLAUTH() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_COLAUTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:462:5: ( 'colauth' )
            // PLSQLLexer.g:462:10: 'colauth'
            {
            match("colauth"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_COLAUTH"

    // $ANTLR start "PLSQL_RESERVED_COMPRESS"
    public final void mPLSQL_RESERVED_COMPRESS() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_COMPRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:466:5: ( 'compress' )
            // PLSQLLexer.g:466:10: 'compress'
            {
            match("compress"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_COMPRESS"

    // $ANTLR start "SQL92_RESERVED_CONNECT"
    public final void mSQL92_RESERVED_CONNECT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_CONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:470:5: ( 'connect' )
            // PLSQLLexer.g:470:10: 'connect'
            {
            match("connect"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_CONNECT"

    // $ANTLR start "PLSQL_NON_RESERVED_CONNECT_BY_ROOT"
    public final void mPLSQL_NON_RESERVED_CONNECT_BY_ROOT() throws RecognitionException {
        try {
            int _type = PLSQL_NON_RESERVED_CONNECT_BY_ROOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:478:5: ( 'connect_by_root' )
            // PLSQLLexer.g:478:10: 'connect_by_root'
            {
            match("connect_by_root"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_NON_RESERVED_CONNECT_BY_ROOT"

    // $ANTLR start "PLSQL_RESERVED_CRASH"
    public final void mPLSQL_RESERVED_CRASH() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_CRASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:482:5: ( 'crash' )
            // PLSQLLexer.g:482:10: 'crash'
            {
            match("crash"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_CRASH"

    // $ANTLR start "SQL92_RESERVED_CREATE"
    public final void mSQL92_RESERVED_CREATE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:486:5: ( 'create' )
            // PLSQLLexer.g:486:10: 'create'
            {
            match("create"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_CREATE"

    // $ANTLR start "SQL92_RESERVED_CURRENT"
    public final void mSQL92_RESERVED_CURRENT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_CURRENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:490:5: ( 'current' )
            // PLSQLLexer.g:490:10: 'current'
            {
            match("current"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_CURRENT"

    // $ANTLR start "SQL92_RESERVED_CURSOR"
    public final void mSQL92_RESERVED_CURSOR() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:494:5: ( 'cursor' )
            // PLSQLLexer.g:494:10: 'cursor'
            {
            match("cursor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_CURSOR"

    // $ANTLR start "SQL92_RESERVED_DATE"
    public final void mSQL92_RESERVED_DATE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:498:5: ( 'date' )
            // PLSQLLexer.g:498:10: 'date'
            {
            match("date"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DATE"

    // $ANTLR start "SQL92_RESERVED_DECLARE"
    public final void mSQL92_RESERVED_DECLARE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:502:5: ( 'declare' )
            // PLSQLLexer.g:502:10: 'declare'
            {
            match("declare"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DECLARE"

    // $ANTLR start "SQL92_RESERVED_DEFAULT"
    public final void mSQL92_RESERVED_DEFAULT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:506:5: ( 'default' )
            // PLSQLLexer.g:506:10: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DEFAULT"

    // $ANTLR start "SQL92_RESERVED_DELETE"
    public final void mSQL92_RESERVED_DELETE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:510:5: ( 'delete' )
            // PLSQLLexer.g:510:10: 'delete'
            {
            match("delete"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DELETE"

    // $ANTLR start "SQL92_RESERVED_DESC"
    public final void mSQL92_RESERVED_DESC() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:514:5: ( 'desc' )
            // PLSQLLexer.g:514:10: 'desc'
            {
            match("desc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DESC"

    // $ANTLR start "SQL92_RESERVED_DISTINCT"
    public final void mSQL92_RESERVED_DISTINCT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:518:5: ( 'distinct' )
            // PLSQLLexer.g:518:10: 'distinct'
            {
            match("distinct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DISTINCT"

    // $ANTLR start "SQL92_RESERVED_DROP"
    public final void mSQL92_RESERVED_DROP() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:522:5: ( 'drop' )
            // PLSQLLexer.g:522:10: 'drop'
            {
            match("drop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_DROP"

    // $ANTLR start "SQL92_RESERVED_ELSE"
    public final void mSQL92_RESERVED_ELSE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:526:5: ( 'else' )
            // PLSQLLexer.g:526:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ELSE"

    // $ANTLR start "SQL92_RESERVED_END"
    public final void mSQL92_RESERVED_END() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:530:5: ( 'end' )
            // PLSQLLexer.g:530:10: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_END"

    // $ANTLR start "SQL92_RESERVED_EXCEPTION"
    public final void mSQL92_RESERVED_EXCEPTION() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_EXCEPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken e=null;

            // PLSQLLexer.g:534:5: (e= 'exception' )
            // PLSQLLexer.g:534:10: e= 'exception'
            {
            int eStart = getCharIndex();
            match("exception"); 
            int eStartLine2560 = getLine();
            int eStartCharPos2560 = getCharPositionInLine();
            e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);
            e.setLine(eStartLine2560);
            e.setCharPositionInLine(eStartCharPos2560);



                e.setType(SQL92_RESERVED_EXCEPTION);
                emit(e);
                advanceInput();

                _type = Token.INVALID_TOKEN_TYPE;
                int markModel = input.mark();

                // Now loop over next Tokens in the input and eventually set Token's type to REGULAR_ID

                // Subclassed version will return NULL unless EOF is reached.
                // nextToken either returns NULL => then the next token is put into the queue tokenBuffer
                // or it returns Token.EOF, then nothing is put into the queue
                Token t1 = super.nextToken();
                {    // This "if" handles the situation when the "model" is the last text in the input.
                    if( t1 != null && t1.getType() == Token.EOF)
                    {
                         e.setType(REGULAR_ID);
                    } else {
                         t1 = tokenBuffer.pollLast(); // "withdraw" the next token from the queue
                         while(true)
                         {
                             if(t1.getType() == EOF)   // is it EOF?
                             {
                                 e.setType(REGULAR_ID);
                                 break;
                             }

                             if(t1.getChannel() == HIDDEN) // is it a white space? then advance to the next token
                             {
                                 t1 = super.nextToken(); if( t1 == null) { t1 = tokenBuffer.pollLast(); };
                                 continue;
                             }

                             if( t1.getType() != SQL92_RESERVED_WHEN && t1.getType() != SEMICOLON) // is something other than "when"
                             {
                                 e.setType(REGULAR_ID);
                                 break;
                             }

                             break; // we are in the model_clase do not rewrite anything
                          } // while true
                     } // else if( t1 != null && t1.getType() == Token.EOF)
                }
                input.rewind(markModel);
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_EXCEPTION"

    // $ANTLR start "PLSQL_RESERVED_EXCLUSIVE"
    public final void mPLSQL_RESERVED_EXCLUSIVE() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:587:5: ( 'exclusive' )
            // PLSQLLexer.g:587:10: 'exclusive'
            {
            match("exclusive"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_EXCLUSIVE"

    // $ANTLR start "SQL92_RESERVED_EXISTS"
    public final void mSQL92_RESERVED_EXISTS() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:591:5: ( 'exists' )
            // PLSQLLexer.g:591:10: 'exists'
            {
            match("exists"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_EXISTS"

    // $ANTLR start "SQL92_RESERVED_FALSE"
    public final void mSQL92_RESERVED_FALSE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:595:5: ( 'false' )
            // PLSQLLexer.g:595:10: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_FALSE"

    // $ANTLR start "SQL92_RESERVED_FETCH"
    public final void mSQL92_RESERVED_FETCH() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:599:5: ( 'fetch' )
            // PLSQLLexer.g:599:10: 'fetch'
            {
            match("fetch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_FETCH"

    // $ANTLR start "SQL92_RESERVED_FOR"
    public final void mSQL92_RESERVED_FOR() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:603:5: ( 'for' )
            // PLSQLLexer.g:603:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_FOR"

    // $ANTLR start "SQL92_RESERVED_FROM"
    public final void mSQL92_RESERVED_FROM() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:607:5: ( 'from' )
            // PLSQLLexer.g:607:10: 'from'
            {
            match("from"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_FROM"

    // $ANTLR start "SQL92_RESERVED_GOTO"
    public final void mSQL92_RESERVED_GOTO() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:611:5: ( 'goto' )
            // PLSQLLexer.g:611:10: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_GOTO"

    // $ANTLR start "SQL92_RESERVED_GRANT"
    public final void mSQL92_RESERVED_GRANT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_GRANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:615:5: ( 'grant' )
            // PLSQLLexer.g:615:10: 'grant'
            {
            match("grant"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_GRANT"

    // $ANTLR start "SQL92_RESERVED_GROUP"
    public final void mSQL92_RESERVED_GROUP() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:619:5: ( 'group' )
            // PLSQLLexer.g:619:10: 'group'
            {
            match("group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_GROUP"

    // $ANTLR start "SQL92_RESERVED_HAVING"
    public final void mSQL92_RESERVED_HAVING() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:623:5: ( 'having' )
            // PLSQLLexer.g:623:10: 'having'
            {
            match("having"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_HAVING"

    // $ANTLR start "PLSQL_RESERVED_IDENTIFIED"
    public final void mPLSQL_RESERVED_IDENTIFIED() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_IDENTIFIED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:627:5: ( 'identified' )
            // PLSQLLexer.g:627:10: 'identified'
            {
            match("identified"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_IDENTIFIED"

    // $ANTLR start "PLSQL_RESERVED_IF"
    public final void mPLSQL_RESERVED_IF() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:631:5: ( 'if' )
            // PLSQLLexer.g:631:10: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_IF"

    // $ANTLR start "SQL92_RESERVED_IN"
    public final void mSQL92_RESERVED_IN() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:635:5: ( 'in' )
            // PLSQLLexer.g:635:10: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_IN"

    // $ANTLR start "PLSQL_RESERVED_INDEX"
    public final void mPLSQL_RESERVED_INDEX() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:639:5: ( 'index' )
            // PLSQLLexer.g:639:10: 'index'
            {
            match("index"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_INDEX"

    // $ANTLR start "PLSQL_RESERVED_INDEXES"
    public final void mPLSQL_RESERVED_INDEXES() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_INDEXES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:643:5: ( 'indexes' )
            // PLSQLLexer.g:643:10: 'indexes'
            {
            match("indexes"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_INDEXES"

    // $ANTLR start "SQL92_RESERVED_INSERT"
    public final void mSQL92_RESERVED_INSERT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:647:5: ( 'insert' )
            // PLSQLLexer.g:647:10: 'insert'
            {
            match("insert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_INSERT"

    // $ANTLR start "SQL92_RESERVED_INTERSECT"
    public final void mSQL92_RESERVED_INTERSECT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:651:5: ( 'intersect' )
            // PLSQLLexer.g:651:10: 'intersect'
            {
            match("intersect"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_INTERSECT"

    // $ANTLR start "SQL92_RESERVED_INTO"
    public final void mSQL92_RESERVED_INTO() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:655:5: ( 'into' )
            // PLSQLLexer.g:655:10: 'into'
            {
            match("into"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_INTO"

    // $ANTLR start "SQL92_RESERVED_IS"
    public final void mSQL92_RESERVED_IS() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:659:5: ( 'is' )
            // PLSQLLexer.g:659:10: 'is'
            {
            match("is"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_IS"

    // $ANTLR start "SQL92_RESERVED_LIKE"
    public final void mSQL92_RESERVED_LIKE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:663:5: ( 'like' )
            // PLSQLLexer.g:663:10: 'like'
            {
            match("like"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_LIKE"

    // $ANTLR start "PLSQL_RESERVED_LOCK"
    public final void mPLSQL_RESERVED_LOCK() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:667:5: ( 'lock' )
            // PLSQLLexer.g:667:10: 'lock'
            {
            match("lock"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_LOCK"

    // $ANTLR start "PLSQL_RESERVED_MINUS"
    public final void mPLSQL_RESERVED_MINUS() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:671:5: ( 'minus' )
            // PLSQLLexer.g:671:10: 'minus'
            {
            match("minus"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_MINUS"

    // $ANTLR start "PLSQL_RESERVED_MODE"
    public final void mPLSQL_RESERVED_MODE() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_MODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:675:5: ( 'mode' )
            // PLSQLLexer.g:675:10: 'mode'
            {
            match("mode"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_MODE"

    // $ANTLR start "PLSQL_RESERVED_NOCOMPRESS"
    public final void mPLSQL_RESERVED_NOCOMPRESS() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_NOCOMPRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:679:5: ( 'nocompress' )
            // PLSQLLexer.g:679:10: 'nocompress'
            {
            match("nocompress"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_NOCOMPRESS"

    // $ANTLR start "SQL92_RESERVED_NOT"
    public final void mSQL92_RESERVED_NOT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:683:5: ( 'not' )
            // PLSQLLexer.g:683:10: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_NOT"

    // $ANTLR start "PLSQL_RESERVED_NOWAIT"
    public final void mPLSQL_RESERVED_NOWAIT() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_NOWAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:687:5: ( 'nowait' )
            // PLSQLLexer.g:687:10: 'nowait'
            {
            match("nowait"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_NOWAIT"

    // $ANTLR start "SQL92_RESERVED_NULL"
    public final void mSQL92_RESERVED_NULL() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:691:5: ( 'null' )
            // PLSQLLexer.g:691:10: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_NULL"

    // $ANTLR start "SQL92_RESERVED_OF"
    public final void mSQL92_RESERVED_OF() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:695:5: ( 'of' )
            // PLSQLLexer.g:695:10: 'of'
            {
            match("of"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_OF"

    // $ANTLR start "SQL92_RESERVED_ON"
    public final void mSQL92_RESERVED_ON() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:699:5: ( 'on' )
            // PLSQLLexer.g:699:10: 'on'
            {
            match("on"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ON"

    // $ANTLR start "SQL92_RESERVED_OPTION"
    public final void mSQL92_RESERVED_OPTION() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:703:5: ( 'option' )
            // PLSQLLexer.g:703:10: 'option'
            {
            match("option"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_OPTION"

    // $ANTLR start "SQL92_RESERVED_OR"
    public final void mSQL92_RESERVED_OR() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:707:5: ( 'or' )
            // PLSQLLexer.g:707:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_OR"

    // $ANTLR start "SQL92_RESERVED_ORDER"
    public final void mSQL92_RESERVED_ORDER() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:711:5: ( 'order' )
            // PLSQLLexer.g:711:10: 'order'
            {
            match("order"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_ORDER"

    // $ANTLR start "SQL92_RESERVED_OVERLAPS"
    public final void mSQL92_RESERVED_OVERLAPS() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_OVERLAPS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:715:5: ( 'overlaps' )
            // PLSQLLexer.g:715:10: 'overlaps'
            {
            match("overlaps"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_OVERLAPS"

    // $ANTLR start "SQL92_RESERVED_PRIOR"
    public final void mSQL92_RESERVED_PRIOR() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_PRIOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:719:5: ( 'prior' )
            // PLSQLLexer.g:719:10: 'prior'
            {
            match("prior"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_PRIOR"

    // $ANTLR start "SQL92_RESERVED_PROCEDURE"
    public final void mSQL92_RESERVED_PROCEDURE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:723:5: ( 'procedure' )
            // PLSQLLexer.g:723:10: 'procedure'
            {
            match("procedure"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_PROCEDURE"

    // $ANTLR start "SQL92_RESERVED_PUBLIC"
    public final void mSQL92_RESERVED_PUBLIC() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:727:5: ( 'public' )
            // PLSQLLexer.g:727:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_PUBLIC"

    // $ANTLR start "PLSQL_RESERVED_RESOURCE"
    public final void mPLSQL_RESERVED_RESOURCE() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_RESOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:731:5: ( 'resource' )
            // PLSQLLexer.g:731:10: 'resource'
            {
            match("resource"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_RESOURCE"

    // $ANTLR start "SQL92_RESERVED_REVOKE"
    public final void mSQL92_RESERVED_REVOKE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_REVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:735:5: ( 'revoke' )
            // PLSQLLexer.g:735:10: 'revoke'
            {
            match("revoke"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_REVOKE"

    // $ANTLR start "SQL92_RESERVED_SELECT"
    public final void mSQL92_RESERVED_SELECT() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:739:5: ( 'select' )
            // PLSQLLexer.g:739:10: 'select'
            {
            match("select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_SELECT"

    // $ANTLR start "PLSQL_RESERVED_SHARE"
    public final void mPLSQL_RESERVED_SHARE() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_SHARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:743:5: ( 'share' )
            // PLSQLLexer.g:743:10: 'share'
            {
            match("share"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_SHARE"

    // $ANTLR start "SQL92_RESERVED_SIZE"
    public final void mSQL92_RESERVED_SIZE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:747:5: ( 'size' )
            // PLSQLLexer.g:747:10: 'size'
            {
            match("size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_SIZE"

    // $ANTLR start "PLSQL_RESERVED_START"
    public final void mPLSQL_RESERVED_START() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:755:5: ( 'start' )
            // PLSQLLexer.g:755:10: 'start'
            {
            match("start"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_START"

    // $ANTLR start "PLSQL_RESERVED_TABAUTH"
    public final void mPLSQL_RESERVED_TABAUTH() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_TABAUTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:759:5: ( 'tabauth' )
            // PLSQLLexer.g:759:10: 'tabauth'
            {
            match("tabauth"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_TABAUTH"

    // $ANTLR start "SQL92_RESERVED_TABLE"
    public final void mSQL92_RESERVED_TABLE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:763:5: ( 'table' )
            // PLSQLLexer.g:763:10: 'table'
            {
            match("table"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_TABLE"

    // $ANTLR start "SQL92_RESERVED_THE"
    public final void mSQL92_RESERVED_THE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_THE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:767:5: ( 'the' )
            // PLSQLLexer.g:767:10: 'the'
            {
            match("the"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_THE"

    // $ANTLR start "SQL92_RESERVED_THEN"
    public final void mSQL92_RESERVED_THEN() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:771:5: ( 'then' )
            // PLSQLLexer.g:771:10: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_THEN"

    // $ANTLR start "SQL92_RESERVED_TO"
    public final void mSQL92_RESERVED_TO() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:775:5: ( 'to' )
            // PLSQLLexer.g:775:10: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_TO"

    // $ANTLR start "SQL92_RESERVED_TRUE"
    public final void mSQL92_RESERVED_TRUE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:779:5: ( 'true' )
            // PLSQLLexer.g:779:10: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_TRUE"

    // $ANTLR start "SQL92_RESERVED_UNION"
    public final void mSQL92_RESERVED_UNION() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:783:5: ( 'union' )
            // PLSQLLexer.g:783:10: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_UNION"

    // $ANTLR start "SQL92_RESERVED_UNIQUE"
    public final void mSQL92_RESERVED_UNIQUE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:787:5: ( 'unique' )
            // PLSQLLexer.g:787:10: 'unique'
            {
            match("unique"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_UNIQUE"

    // $ANTLR start "SQL92_RESERVED_UPDATE"
    public final void mSQL92_RESERVED_UPDATE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:791:5: ( 'update' )
            // PLSQLLexer.g:791:10: 'update'
            {
            match("update"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_UPDATE"

    // $ANTLR start "SQL92_RESERVED_VALUES"
    public final void mSQL92_RESERVED_VALUES() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:795:5: ( 'values' )
            // PLSQLLexer.g:795:10: 'values'
            {
            match("values"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_VALUES"

    // $ANTLR start "SQL92_RESERVED_VIEW"
    public final void mSQL92_RESERVED_VIEW() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:799:5: ( 'view' )
            // PLSQLLexer.g:799:10: 'view'
            {
            match("view"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_VIEW"

    // $ANTLR start "PLSQL_RESERVED_VIEWS"
    public final void mPLSQL_RESERVED_VIEWS() throws RecognitionException {
        try {
            int _type = PLSQL_RESERVED_VIEWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:803:5: ( 'views' )
            // PLSQLLexer.g:803:10: 'views'
            {
            match("views"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_RESERVED_VIEWS"

    // $ANTLR start "SQL92_RESERVED_WHEN"
    public final void mSQL92_RESERVED_WHEN() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:807:5: ( 'when' )
            // PLSQLLexer.g:807:10: 'when'
            {
            match("when"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_WHEN"

    // $ANTLR start "SQL92_RESERVED_WHERE"
    public final void mSQL92_RESERVED_WHERE() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:811:5: ( 'where' )
            // PLSQLLexer.g:811:10: 'where'
            {
            match("where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_WHERE"

    // $ANTLR start "SQL92_RESERVED_WITH"
    public final void mSQL92_RESERVED_WITH() throws RecognitionException {
        try {
            int _type = SQL92_RESERVED_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:815:5: ( 'with' )
            // PLSQLLexer.g:815:10: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQL92_RESERVED_WITH"

    // $ANTLR start "PLSQL_NON_RESERVED_USING"
    public final void mPLSQL_NON_RESERVED_USING() throws RecognitionException {
        try {
            int _type = PLSQL_NON_RESERVED_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:819:5: ( 'using' )
            // PLSQLLexer.g:819:10: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_NON_RESERVED_USING"

    // $ANTLR start "PLSQL_NON_RESERVED_MODEL"
    public final void mPLSQL_NON_RESERVED_MODEL() throws RecognitionException {
        try {
            int _type = PLSQL_NON_RESERVED_MODEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken m=null;

            // PLSQLLexer.g:823:5: (m= 'model' )
            // PLSQLLexer.g:823:10: m= 'model'
            {
            int mStart = getCharIndex();
            match("model"); 
            int mStartLine3767 = getLine();
            int mStartCharPos3767 = getCharPositionInLine();
            m = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, mStart, getCharIndex()-1);
            m.setLine(mStartLine3767);
            m.setCharPositionInLine(mStartCharPos3767);



                     // "model" is a keyword if and only if it is followed by ("main"|"partition"|"dimension")
                     // otherwise it is a identifier(REGULAR_ID).
                     // This wodoo implements something like context sensitive lexer.
                     // Here we've matched the word "model". Then the Token is created and en-queued in tokenBuffer
                     // We still remember the reference(m) onto this Token
                     m.setType(PLSQL_NON_RESERVED_MODEL);
                     emit(m);
                     advanceInput();

                     _type = Token.INVALID_TOKEN_TYPE;
                     int markModel = input.mark();

                     // Now loop over next Tokens in the input and eventually set Token's type to REGULAR_ID

                     // Subclassed version will return NULL unless EOF is reached.
                     // nextToken either returns NULL => then the next token is put into the queue tokenBuffer
                     // or it returns Token.EOF, then nothing is put into the queue
                     Token t1 = super.nextToken();
                     {    // This "if" handles the situation when the "model" is the last text in the input.
                          if( t1 != null && t1.getType() == Token.EOF)
                          {
                              m.setType(REGULAR_ID);
                          } else {
                              t1 = tokenBuffer.pollLast(); // "withdraw" the next token from the queue
                              while(true)
                              {
                                 if(t1.getType() == EOF)   // is it EOF?
                                 {
                                     m.setType(REGULAR_ID);
                                     break;
                                 }

                                 if(t1.getChannel() == HIDDEN) // is it a white space? then advance to the next token
                                 {
                                     t1 = super.nextToken(); if( t1 == null) { t1 = tokenBuffer.pollLast(); };
                                     continue;
                                 }

                                 if( t1.getType() != REGULAR_ID || // is something other than ("main"|"partition"|"dimension")
                                    ( !t1.getText().equalsIgnoreCase("main") &&
                                      !t1.getText().equalsIgnoreCase("partition") &&
                                      !t1.getText().equalsIgnoreCase("dimension")
                                   ))
                                 {
                                     m.setType(REGULAR_ID);
                                     break;
                                 }

                                 break; // we are in the model_clase do not rewrite anything
                              } // while true
                          } // else if( t1 != null && t1.getType() == Token.EOF)
                     }
                     input.rewind(markModel);
                

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_NON_RESERVED_MODEL"

    // $ANTLR start "PLSQL_NON_RESERVED_ELSIF"
    public final void mPLSQL_NON_RESERVED_ELSIF() throws RecognitionException {
        try {
            int _type = PLSQL_NON_RESERVED_ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:882:5: ( 'elsif' )
            // PLSQLLexer.g:882:10: 'elsif'
            {
            match("elsif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_NON_RESERVED_ELSIF"

    // $ANTLR start "PLSQL_NON_RESERVED_PIVOT"
    public final void mPLSQL_NON_RESERVED_PIVOT() throws RecognitionException {
        try {
            int _type = PLSQL_NON_RESERVED_PIVOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:886:5: ( 'pivot' )
            // PLSQLLexer.g:886:10: 'pivot'
            {
            match("pivot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_NON_RESERVED_PIVOT"

    // $ANTLR start "PLSQL_NON_RESERVED_UNPIVOT"
    public final void mPLSQL_NON_RESERVED_UNPIVOT() throws RecognitionException {
        try {
            int _type = PLSQL_NON_RESERVED_UNPIVOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:890:5: ( 'unpivot' )
            // PLSQLLexer.g:890:10: 'unpivot'
            {
            match("unpivot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLSQL_NON_RESERVED_UNPIVOT"

    // $ANTLR start "REGULAR_ID"
    public final void mREGULAR_ID() throws RecognitionException {
        try {
            int _type = REGULAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:894:5: ( ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )* )
            // PLSQLLexer.g:894:10: ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // PLSQLLexer.g:894:26: ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0 >= '#' && LA38_0 <= '$')||(LA38_0 >= '0' && LA38_0 <= '9')||(LA38_0 >= 'A' && LA38_0 <= 'Z')||LA38_0=='_'||(LA38_0 >= 'a' && LA38_0 <= 'z')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // PLSQLLexer.g:
            	    {
            	    if ( (input.LA(1) >= '#' && input.LA(1) <= '$')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGULAR_ID"

    // $ANTLR start "ZV"
    public final void mZV() throws RecognitionException {
        try {
            int _type = ZV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // PLSQLLexer.g:898:5: ( '@!' )
            // PLSQLLexer.g:898:10: '@!'
            {
            match("@!"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ZV"

    public void mTokens() throws RecognitionException {
        // PLSQLLexer.g:1:8: ( FOR_NOTATION | NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | PERIOD | EXACT_NUM_LIT | CHAR_STRING | CHAR_STRING_PERL | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | DOUBLE_ASTERISK | ASTERISK | PLUS_SIGN | COMMA | SOLIDUS | AT_SIGN | ASSIGN_OP | BINDVAR | COLON | SEMICOLON | LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OR_EQUALS_OP | NOT_EQUAL_OP | CARRET_OPERATOR_PART | TILDE_OPERATOR_PART | EXCLAMATION_OPERATOR_PART | GREATER_THAN_OP | CONCATENATION_OP | VERTICAL_BAR | EQUALS_OP | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR | PROMPT | SQL92_RESERVED_ALL | SQL92_RESERVED_ALTER | SQL92_RESERVED_AND | SQL92_RESERVED_ANY | SQL92_RESERVED_AS | SQL92_RESERVED_ASC | SQL92_RESERVED_BEGIN | SQL92_RESERVED_BETWEEN | SQL92_RESERVED_BY | SQL92_RESERVED_CASE | SQL92_RESERVED_CHECK | PLSQL_RESERVED_CLUSTERS | PLSQL_RESERVED_COLAUTH | PLSQL_RESERVED_COMPRESS | SQL92_RESERVED_CONNECT | PLSQL_NON_RESERVED_CONNECT_BY_ROOT | PLSQL_RESERVED_CRASH | SQL92_RESERVED_CREATE | SQL92_RESERVED_CURRENT | SQL92_RESERVED_CURSOR | SQL92_RESERVED_DATE | SQL92_RESERVED_DECLARE | SQL92_RESERVED_DEFAULT | SQL92_RESERVED_DELETE | SQL92_RESERVED_DESC | SQL92_RESERVED_DISTINCT | SQL92_RESERVED_DROP | SQL92_RESERVED_ELSE | SQL92_RESERVED_END | SQL92_RESERVED_EXCEPTION | PLSQL_RESERVED_EXCLUSIVE | SQL92_RESERVED_EXISTS | SQL92_RESERVED_FALSE | SQL92_RESERVED_FETCH | SQL92_RESERVED_FOR | SQL92_RESERVED_FROM | SQL92_RESERVED_GOTO | SQL92_RESERVED_GRANT | SQL92_RESERVED_GROUP | SQL92_RESERVED_HAVING | PLSQL_RESERVED_IDENTIFIED | PLSQL_RESERVED_IF | SQL92_RESERVED_IN | PLSQL_RESERVED_INDEX | PLSQL_RESERVED_INDEXES | SQL92_RESERVED_INSERT | SQL92_RESERVED_INTERSECT | SQL92_RESERVED_INTO | SQL92_RESERVED_IS | SQL92_RESERVED_LIKE | PLSQL_RESERVED_LOCK | PLSQL_RESERVED_MINUS | PLSQL_RESERVED_MODE | PLSQL_RESERVED_NOCOMPRESS | SQL92_RESERVED_NOT | PLSQL_RESERVED_NOWAIT | SQL92_RESERVED_NULL | SQL92_RESERVED_OF | SQL92_RESERVED_ON | SQL92_RESERVED_OPTION | SQL92_RESERVED_OR | SQL92_RESERVED_ORDER | SQL92_RESERVED_OVERLAPS | SQL92_RESERVED_PRIOR | SQL92_RESERVED_PROCEDURE | SQL92_RESERVED_PUBLIC | PLSQL_RESERVED_RESOURCE | SQL92_RESERVED_REVOKE | SQL92_RESERVED_SELECT | PLSQL_RESERVED_SHARE | SQL92_RESERVED_SIZE | PLSQL_RESERVED_START | PLSQL_RESERVED_TABAUTH | SQL92_RESERVED_TABLE | SQL92_RESERVED_THE | SQL92_RESERVED_THEN | SQL92_RESERVED_TO | SQL92_RESERVED_TRUE | SQL92_RESERVED_UNION | SQL92_RESERVED_UNIQUE | SQL92_RESERVED_UPDATE | SQL92_RESERVED_VALUES | SQL92_RESERVED_VIEW | PLSQL_RESERVED_VIEWS | SQL92_RESERVED_WHEN | SQL92_RESERVED_WHERE | SQL92_RESERVED_WITH | PLSQL_NON_RESERVED_USING | PLSQL_NON_RESERVED_MODEL | PLSQL_NON_RESERVED_ELSIF | PLSQL_NON_RESERVED_PIVOT | PLSQL_NON_RESERVED_UNPIVOT | REGULAR_ID | ZV )
        int alt39=133;
        alt39 = dfa39.predict(input);
        switch (alt39) {
            case 1 :
                // PLSQLLexer.g:1:10: FOR_NOTATION
                {
                mFOR_NOTATION(); 


                }
                break;
            case 2 :
                // PLSQLLexer.g:1:23: NATIONAL_CHAR_STRING_LIT
                {
                mNATIONAL_CHAR_STRING_LIT(); 


                }
                break;
            case 3 :
                // PLSQLLexer.g:1:48: BIT_STRING_LIT
                {
                mBIT_STRING_LIT(); 


                }
                break;
            case 4 :
                // PLSQLLexer.g:1:63: HEX_STRING_LIT
                {
                mHEX_STRING_LIT(); 


                }
                break;
            case 5 :
                // PLSQLLexer.g:1:78: PERIOD
                {
                mPERIOD(); 


                }
                break;
            case 6 :
                // PLSQLLexer.g:1:85: EXACT_NUM_LIT
                {
                mEXACT_NUM_LIT(); 


                }
                break;
            case 7 :
                // PLSQLLexer.g:1:99: CHAR_STRING
                {
                mCHAR_STRING(); 


                }
                break;
            case 8 :
                // PLSQLLexer.g:1:111: CHAR_STRING_PERL
                {
                mCHAR_STRING_PERL(); 


                }
                break;
            case 9 :
                // PLSQLLexer.g:1:128: DELIMITED_ID
                {
                mDELIMITED_ID(); 


                }
                break;
            case 10 :
                // PLSQLLexer.g:1:141: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 11 :
                // PLSQLLexer.g:1:149: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 12 :
                // PLSQLLexer.g:1:159: LEFT_PAREN
                {
                mLEFT_PAREN(); 


                }
                break;
            case 13 :
                // PLSQLLexer.g:1:170: RIGHT_PAREN
                {
                mRIGHT_PAREN(); 


                }
                break;
            case 14 :
                // PLSQLLexer.g:1:182: DOUBLE_ASTERISK
                {
                mDOUBLE_ASTERISK(); 


                }
                break;
            case 15 :
                // PLSQLLexer.g:1:198: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 16 :
                // PLSQLLexer.g:1:207: PLUS_SIGN
                {
                mPLUS_SIGN(); 


                }
                break;
            case 17 :
                // PLSQLLexer.g:1:217: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 18 :
                // PLSQLLexer.g:1:223: SOLIDUS
                {
                mSOLIDUS(); 


                }
                break;
            case 19 :
                // PLSQLLexer.g:1:231: AT_SIGN
                {
                mAT_SIGN(); 


                }
                break;
            case 20 :
                // PLSQLLexer.g:1:239: ASSIGN_OP
                {
                mASSIGN_OP(); 


                }
                break;
            case 21 :
                // PLSQLLexer.g:1:249: BINDVAR
                {
                mBINDVAR(); 


                }
                break;
            case 22 :
                // PLSQLLexer.g:1:257: COLON
                {
                mCOLON(); 


                }
                break;
            case 23 :
                // PLSQLLexer.g:1:263: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 24 :
                // PLSQLLexer.g:1:273: LESS_THAN_OR_EQUALS_OP
                {
                mLESS_THAN_OR_EQUALS_OP(); 


                }
                break;
            case 25 :
                // PLSQLLexer.g:1:296: LESS_THAN_OP
                {
                mLESS_THAN_OP(); 


                }
                break;
            case 26 :
                // PLSQLLexer.g:1:309: GREATER_THAN_OR_EQUALS_OP
                {
                mGREATER_THAN_OR_EQUALS_OP(); 


                }
                break;
            case 27 :
                // PLSQLLexer.g:1:335: NOT_EQUAL_OP
                {
                mNOT_EQUAL_OP(); 


                }
                break;
            case 28 :
                // PLSQLLexer.g:1:348: CARRET_OPERATOR_PART
                {
                mCARRET_OPERATOR_PART(); 


                }
                break;
            case 29 :
                // PLSQLLexer.g:1:369: TILDE_OPERATOR_PART
                {
                mTILDE_OPERATOR_PART(); 


                }
                break;
            case 30 :
                // PLSQLLexer.g:1:389: EXCLAMATION_OPERATOR_PART
                {
                mEXCLAMATION_OPERATOR_PART(); 


                }
                break;
            case 31 :
                // PLSQLLexer.g:1:415: GREATER_THAN_OP
                {
                mGREATER_THAN_OP(); 


                }
                break;
            case 32 :
                // PLSQLLexer.g:1:431: CONCATENATION_OP
                {
                mCONCATENATION_OP(); 


                }
                break;
            case 33 :
                // PLSQLLexer.g:1:448: VERTICAL_BAR
                {
                mVERTICAL_BAR(); 


                }
                break;
            case 34 :
                // PLSQLLexer.g:1:461: EQUALS_OP
                {
                mEQUALS_OP(); 


                }
                break;
            case 35 :
                // PLSQLLexer.g:1:471: LEFT_BRACKET
                {
                mLEFT_BRACKET(); 


                }
                break;
            case 36 :
                // PLSQLLexer.g:1:484: RIGHT_BRACKET
                {
                mRIGHT_BRACKET(); 


                }
                break;
            case 37 :
                // PLSQLLexer.g:1:498: INTRODUCER
                {
                mINTRODUCER(); 


                }
                break;
            case 38 :
                // PLSQLLexer.g:1:509: SEPARATOR
                {
                mSEPARATOR(); 


                }
                break;
            case 39 :
                // PLSQLLexer.g:1:519: PROMPT
                {
                mPROMPT(); 


                }
                break;
            case 40 :
                // PLSQLLexer.g:1:526: SQL92_RESERVED_ALL
                {
                mSQL92_RESERVED_ALL(); 


                }
                break;
            case 41 :
                // PLSQLLexer.g:1:545: SQL92_RESERVED_ALTER
                {
                mSQL92_RESERVED_ALTER(); 


                }
                break;
            case 42 :
                // PLSQLLexer.g:1:566: SQL92_RESERVED_AND
                {
                mSQL92_RESERVED_AND(); 


                }
                break;
            case 43 :
                // PLSQLLexer.g:1:585: SQL92_RESERVED_ANY
                {
                mSQL92_RESERVED_ANY(); 


                }
                break;
            case 44 :
                // PLSQLLexer.g:1:604: SQL92_RESERVED_AS
                {
                mSQL92_RESERVED_AS(); 


                }
                break;
            case 45 :
                // PLSQLLexer.g:1:622: SQL92_RESERVED_ASC
                {
                mSQL92_RESERVED_ASC(); 


                }
                break;
            case 46 :
                // PLSQLLexer.g:1:641: SQL92_RESERVED_BEGIN
                {
                mSQL92_RESERVED_BEGIN(); 


                }
                break;
            case 47 :
                // PLSQLLexer.g:1:662: SQL92_RESERVED_BETWEEN
                {
                mSQL92_RESERVED_BETWEEN(); 


                }
                break;
            case 48 :
                // PLSQLLexer.g:1:685: SQL92_RESERVED_BY
                {
                mSQL92_RESERVED_BY(); 


                }
                break;
            case 49 :
                // PLSQLLexer.g:1:703: SQL92_RESERVED_CASE
                {
                mSQL92_RESERVED_CASE(); 


                }
                break;
            case 50 :
                // PLSQLLexer.g:1:723: SQL92_RESERVED_CHECK
                {
                mSQL92_RESERVED_CHECK(); 


                }
                break;
            case 51 :
                // PLSQLLexer.g:1:744: PLSQL_RESERVED_CLUSTERS
                {
                mPLSQL_RESERVED_CLUSTERS(); 


                }
                break;
            case 52 :
                // PLSQLLexer.g:1:768: PLSQL_RESERVED_COLAUTH
                {
                mPLSQL_RESERVED_COLAUTH(); 


                }
                break;
            case 53 :
                // PLSQLLexer.g:1:791: PLSQL_RESERVED_COMPRESS
                {
                mPLSQL_RESERVED_COMPRESS(); 


                }
                break;
            case 54 :
                // PLSQLLexer.g:1:815: SQL92_RESERVED_CONNECT
                {
                mSQL92_RESERVED_CONNECT(); 


                }
                break;
            case 55 :
                // PLSQLLexer.g:1:838: PLSQL_NON_RESERVED_CONNECT_BY_ROOT
                {
                mPLSQL_NON_RESERVED_CONNECT_BY_ROOT(); 


                }
                break;
            case 56 :
                // PLSQLLexer.g:1:873: PLSQL_RESERVED_CRASH
                {
                mPLSQL_RESERVED_CRASH(); 


                }
                break;
            case 57 :
                // PLSQLLexer.g:1:894: SQL92_RESERVED_CREATE
                {
                mSQL92_RESERVED_CREATE(); 


                }
                break;
            case 58 :
                // PLSQLLexer.g:1:916: SQL92_RESERVED_CURRENT
                {
                mSQL92_RESERVED_CURRENT(); 


                }
                break;
            case 59 :
                // PLSQLLexer.g:1:939: SQL92_RESERVED_CURSOR
                {
                mSQL92_RESERVED_CURSOR(); 


                }
                break;
            case 60 :
                // PLSQLLexer.g:1:961: SQL92_RESERVED_DATE
                {
                mSQL92_RESERVED_DATE(); 


                }
                break;
            case 61 :
                // PLSQLLexer.g:1:981: SQL92_RESERVED_DECLARE
                {
                mSQL92_RESERVED_DECLARE(); 


                }
                break;
            case 62 :
                // PLSQLLexer.g:1:1004: SQL92_RESERVED_DEFAULT
                {
                mSQL92_RESERVED_DEFAULT(); 


                }
                break;
            case 63 :
                // PLSQLLexer.g:1:1027: SQL92_RESERVED_DELETE
                {
                mSQL92_RESERVED_DELETE(); 


                }
                break;
            case 64 :
                // PLSQLLexer.g:1:1049: SQL92_RESERVED_DESC
                {
                mSQL92_RESERVED_DESC(); 


                }
                break;
            case 65 :
                // PLSQLLexer.g:1:1069: SQL92_RESERVED_DISTINCT
                {
                mSQL92_RESERVED_DISTINCT(); 


                }
                break;
            case 66 :
                // PLSQLLexer.g:1:1093: SQL92_RESERVED_DROP
                {
                mSQL92_RESERVED_DROP(); 


                }
                break;
            case 67 :
                // PLSQLLexer.g:1:1113: SQL92_RESERVED_ELSE
                {
                mSQL92_RESERVED_ELSE(); 


                }
                break;
            case 68 :
                // PLSQLLexer.g:1:1133: SQL92_RESERVED_END
                {
                mSQL92_RESERVED_END(); 


                }
                break;
            case 69 :
                // PLSQLLexer.g:1:1152: SQL92_RESERVED_EXCEPTION
                {
                mSQL92_RESERVED_EXCEPTION(); 


                }
                break;
            case 70 :
                // PLSQLLexer.g:1:1177: PLSQL_RESERVED_EXCLUSIVE
                {
                mPLSQL_RESERVED_EXCLUSIVE(); 


                }
                break;
            case 71 :
                // PLSQLLexer.g:1:1202: SQL92_RESERVED_EXISTS
                {
                mSQL92_RESERVED_EXISTS(); 


                }
                break;
            case 72 :
                // PLSQLLexer.g:1:1224: SQL92_RESERVED_FALSE
                {
                mSQL92_RESERVED_FALSE(); 


                }
                break;
            case 73 :
                // PLSQLLexer.g:1:1245: SQL92_RESERVED_FETCH
                {
                mSQL92_RESERVED_FETCH(); 


                }
                break;
            case 74 :
                // PLSQLLexer.g:1:1266: SQL92_RESERVED_FOR
                {
                mSQL92_RESERVED_FOR(); 


                }
                break;
            case 75 :
                // PLSQLLexer.g:1:1285: SQL92_RESERVED_FROM
                {
                mSQL92_RESERVED_FROM(); 


                }
                break;
            case 76 :
                // PLSQLLexer.g:1:1305: SQL92_RESERVED_GOTO
                {
                mSQL92_RESERVED_GOTO(); 


                }
                break;
            case 77 :
                // PLSQLLexer.g:1:1325: SQL92_RESERVED_GRANT
                {
                mSQL92_RESERVED_GRANT(); 


                }
                break;
            case 78 :
                // PLSQLLexer.g:1:1346: SQL92_RESERVED_GROUP
                {
                mSQL92_RESERVED_GROUP(); 


                }
                break;
            case 79 :
                // PLSQLLexer.g:1:1367: SQL92_RESERVED_HAVING
                {
                mSQL92_RESERVED_HAVING(); 


                }
                break;
            case 80 :
                // PLSQLLexer.g:1:1389: PLSQL_RESERVED_IDENTIFIED
                {
                mPLSQL_RESERVED_IDENTIFIED(); 


                }
                break;
            case 81 :
                // PLSQLLexer.g:1:1415: PLSQL_RESERVED_IF
                {
                mPLSQL_RESERVED_IF(); 


                }
                break;
            case 82 :
                // PLSQLLexer.g:1:1433: SQL92_RESERVED_IN
                {
                mSQL92_RESERVED_IN(); 


                }
                break;
            case 83 :
                // PLSQLLexer.g:1:1451: PLSQL_RESERVED_INDEX
                {
                mPLSQL_RESERVED_INDEX(); 


                }
                break;
            case 84 :
                // PLSQLLexer.g:1:1472: PLSQL_RESERVED_INDEXES
                {
                mPLSQL_RESERVED_INDEXES(); 


                }
                break;
            case 85 :
                // PLSQLLexer.g:1:1495: SQL92_RESERVED_INSERT
                {
                mSQL92_RESERVED_INSERT(); 


                }
                break;
            case 86 :
                // PLSQLLexer.g:1:1517: SQL92_RESERVED_INTERSECT
                {
                mSQL92_RESERVED_INTERSECT(); 


                }
                break;
            case 87 :
                // PLSQLLexer.g:1:1542: SQL92_RESERVED_INTO
                {
                mSQL92_RESERVED_INTO(); 


                }
                break;
            case 88 :
                // PLSQLLexer.g:1:1562: SQL92_RESERVED_IS
                {
                mSQL92_RESERVED_IS(); 


                }
                break;
            case 89 :
                // PLSQLLexer.g:1:1580: SQL92_RESERVED_LIKE
                {
                mSQL92_RESERVED_LIKE(); 


                }
                break;
            case 90 :
                // PLSQLLexer.g:1:1600: PLSQL_RESERVED_LOCK
                {
                mPLSQL_RESERVED_LOCK(); 


                }
                break;
            case 91 :
                // PLSQLLexer.g:1:1620: PLSQL_RESERVED_MINUS
                {
                mPLSQL_RESERVED_MINUS(); 


                }
                break;
            case 92 :
                // PLSQLLexer.g:1:1641: PLSQL_RESERVED_MODE
                {
                mPLSQL_RESERVED_MODE(); 


                }
                break;
            case 93 :
                // PLSQLLexer.g:1:1661: PLSQL_RESERVED_NOCOMPRESS
                {
                mPLSQL_RESERVED_NOCOMPRESS(); 


                }
                break;
            case 94 :
                // PLSQLLexer.g:1:1687: SQL92_RESERVED_NOT
                {
                mSQL92_RESERVED_NOT(); 


                }
                break;
            case 95 :
                // PLSQLLexer.g:1:1706: PLSQL_RESERVED_NOWAIT
                {
                mPLSQL_RESERVED_NOWAIT(); 


                }
                break;
            case 96 :
                // PLSQLLexer.g:1:1728: SQL92_RESERVED_NULL
                {
                mSQL92_RESERVED_NULL(); 


                }
                break;
            case 97 :
                // PLSQLLexer.g:1:1748: SQL92_RESERVED_OF
                {
                mSQL92_RESERVED_OF(); 


                }
                break;
            case 98 :
                // PLSQLLexer.g:1:1766: SQL92_RESERVED_ON
                {
                mSQL92_RESERVED_ON(); 


                }
                break;
            case 99 :
                // PLSQLLexer.g:1:1784: SQL92_RESERVED_OPTION
                {
                mSQL92_RESERVED_OPTION(); 


                }
                break;
            case 100 :
                // PLSQLLexer.g:1:1806: SQL92_RESERVED_OR
                {
                mSQL92_RESERVED_OR(); 


                }
                break;
            case 101 :
                // PLSQLLexer.g:1:1824: SQL92_RESERVED_ORDER
                {
                mSQL92_RESERVED_ORDER(); 


                }
                break;
            case 102 :
                // PLSQLLexer.g:1:1845: SQL92_RESERVED_OVERLAPS
                {
                mSQL92_RESERVED_OVERLAPS(); 


                }
                break;
            case 103 :
                // PLSQLLexer.g:1:1869: SQL92_RESERVED_PRIOR
                {
                mSQL92_RESERVED_PRIOR(); 


                }
                break;
            case 104 :
                // PLSQLLexer.g:1:1890: SQL92_RESERVED_PROCEDURE
                {
                mSQL92_RESERVED_PROCEDURE(); 


                }
                break;
            case 105 :
                // PLSQLLexer.g:1:1915: SQL92_RESERVED_PUBLIC
                {
                mSQL92_RESERVED_PUBLIC(); 


                }
                break;
            case 106 :
                // PLSQLLexer.g:1:1937: PLSQL_RESERVED_RESOURCE
                {
                mPLSQL_RESERVED_RESOURCE(); 


                }
                break;
            case 107 :
                // PLSQLLexer.g:1:1961: SQL92_RESERVED_REVOKE
                {
                mSQL92_RESERVED_REVOKE(); 


                }
                break;
            case 108 :
                // PLSQLLexer.g:1:1983: SQL92_RESERVED_SELECT
                {
                mSQL92_RESERVED_SELECT(); 


                }
                break;
            case 109 :
                // PLSQLLexer.g:1:2005: PLSQL_RESERVED_SHARE
                {
                mPLSQL_RESERVED_SHARE(); 


                }
                break;
            case 110 :
                // PLSQLLexer.g:1:2026: SQL92_RESERVED_SIZE
                {
                mSQL92_RESERVED_SIZE(); 


                }
                break;
            case 111 :
                // PLSQLLexer.g:1:2046: PLSQL_RESERVED_START
                {
                mPLSQL_RESERVED_START(); 


                }
                break;
            case 112 :
                // PLSQLLexer.g:1:2067: PLSQL_RESERVED_TABAUTH
                {
                mPLSQL_RESERVED_TABAUTH(); 


                }
                break;
            case 113 :
                // PLSQLLexer.g:1:2090: SQL92_RESERVED_TABLE
                {
                mSQL92_RESERVED_TABLE(); 


                }
                break;
            case 114 :
                // PLSQLLexer.g:1:2111: SQL92_RESERVED_THE
                {
                mSQL92_RESERVED_THE(); 


                }
                break;
            case 115 :
                // PLSQLLexer.g:1:2130: SQL92_RESERVED_THEN
                {
                mSQL92_RESERVED_THEN(); 


                }
                break;
            case 116 :
                // PLSQLLexer.g:1:2150: SQL92_RESERVED_TO
                {
                mSQL92_RESERVED_TO(); 


                }
                break;
            case 117 :
                // PLSQLLexer.g:1:2168: SQL92_RESERVED_TRUE
                {
                mSQL92_RESERVED_TRUE(); 


                }
                break;
            case 118 :
                // PLSQLLexer.g:1:2188: SQL92_RESERVED_UNION
                {
                mSQL92_RESERVED_UNION(); 


                }
                break;
            case 119 :
                // PLSQLLexer.g:1:2209: SQL92_RESERVED_UNIQUE
                {
                mSQL92_RESERVED_UNIQUE(); 


                }
                break;
            case 120 :
                // PLSQLLexer.g:1:2231: SQL92_RESERVED_UPDATE
                {
                mSQL92_RESERVED_UPDATE(); 


                }
                break;
            case 121 :
                // PLSQLLexer.g:1:2253: SQL92_RESERVED_VALUES
                {
                mSQL92_RESERVED_VALUES(); 


                }
                break;
            case 122 :
                // PLSQLLexer.g:1:2275: SQL92_RESERVED_VIEW
                {
                mSQL92_RESERVED_VIEW(); 


                }
                break;
            case 123 :
                // PLSQLLexer.g:1:2295: PLSQL_RESERVED_VIEWS
                {
                mPLSQL_RESERVED_VIEWS(); 


                }
                break;
            case 124 :
                // PLSQLLexer.g:1:2316: SQL92_RESERVED_WHEN
                {
                mSQL92_RESERVED_WHEN(); 


                }
                break;
            case 125 :
                // PLSQLLexer.g:1:2336: SQL92_RESERVED_WHERE
                {
                mSQL92_RESERVED_WHERE(); 


                }
                break;
            case 126 :
                // PLSQLLexer.g:1:2357: SQL92_RESERVED_WITH
                {
                mSQL92_RESERVED_WITH(); 


                }
                break;
            case 127 :
                // PLSQLLexer.g:1:2377: PLSQL_NON_RESERVED_USING
                {
                mPLSQL_NON_RESERVED_USING(); 


                }
                break;
            case 128 :
                // PLSQLLexer.g:1:2402: PLSQL_NON_RESERVED_MODEL
                {
                mPLSQL_NON_RESERVED_MODEL(); 


                }
                break;
            case 129 :
                // PLSQLLexer.g:1:2427: PLSQL_NON_RESERVED_ELSIF
                {
                mPLSQL_NON_RESERVED_ELSIF(); 


                }
                break;
            case 130 :
                // PLSQLLexer.g:1:2452: PLSQL_NON_RESERVED_PIVOT
                {
                mPLSQL_NON_RESERVED_PIVOT(); 


                }
                break;
            case 131 :
                // PLSQLLexer.g:1:2477: PLSQL_NON_RESERVED_UNPIVOT
                {
                mPLSQL_NON_RESERVED_UNPIVOT(); 


                }
                break;
            case 132 :
                // PLSQLLexer.g:1:2504: REGULAR_ID
                {
                mREGULAR_ID(); 


                }
                break;
            case 133 :
                // PLSQLLexer.g:1:2515: ZV
                {
                mZV(); 


                }
                break;

        }

    }


    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA39_eotS =
        "\1\uffff\1\65\3\64\1\76\1\uffff\1\64\5\uffff\1\101\2\uffff\1\102"+
        "\1\104\1\106\2\uffff\1\111\1\113\1\114\1\115\1\116\1\120\5\uffff"+
        "\24\64\4\uffff\3\64\1\u008f\25\uffff\5\64\1\u0099\25\64\1\u00b7"+
        "\1\u00bb\1\u00bc\4\64\1\u00c1\1\u00c2\1\64\1\u00c5\10\64\1\u00cf"+
        "\10\64\1\uffff\1\64\1\u00da\4\64\1\uffff\4\64\1\u00e4\1\64\1\u00e6"+
        "\1\u00e7\1\u00e8\1\uffff\21\64\1\u00fc\4\64\1\u0102\6\64\1\uffff"+
        "\3\64\2\uffff\4\64\2\uffff\2\64\1\uffff\10\64\1\u011d\1\uffff\12"+
        "\64\1\uffff\1\64\1\u012b\7\64\1\uffff\1\64\3\uffff\1\u0134\11\64"+
        "\1\u013e\3\64\1\u0142\1\64\1\u0144\1\u0145\1\64\1\uffff\5\64\1\uffff"+
        "\1\u014c\1\u014d\7\64\1\u0155\1\u0156\1\u0157\1\64\1\u015a\7\64"+
        "\1\u0162\3\64\1\u0166\1\uffff\1\u0167\6\64\1\u016f\1\u0170\1\64"+
        "\1\u0172\2\64\1\uffff\1\u0175\3\64\1\u0179\1\64\1\u017b\1\u017c"+
        "\1\uffff\1\u017d\4\64\1\u0182\3\64\1\uffff\3\64\1\uffff\1\64\2\uffff"+
        "\1\u018a\3\64\1\u018e\1\u018f\2\uffff\1\u0190\1\u0191\2\64\1\u0195"+
        "\2\64\3\uffff\1\u0198\1\u0199\1\uffff\1\64\1\u019b\4\64\1\u01a0"+
        "\1\uffff\1\u01a1\1\64\1\u01a3\2\uffff\1\u01a4\3\64\1\u01a8\1\64"+
        "\1\u01aa\2\uffff\1\u01ab\1\uffff\1\64\1\u01ad\1\uffff\3\64\1\uffff"+
        "\1\u01b1\3\uffff\4\64\1\uffff\1\u01b6\1\64\1\u01b8\2\64\1\u01bb"+
        "\1\64\1\uffff\2\64\1\u01bf\4\uffff\1\u01c0\2\64\1\uffff\1\u01c3"+
        "\1\64\2\uffff\1\u01c5\1\uffff\2\64\1\u01c8\1\u01c9\2\uffff\1\64"+
        "\2\uffff\1\u01cb\1\64\1\u01cd\1\uffff\1\u01ce\2\uffff\1\64\1\uffff"+
        "\1\u01d0\1\uffff\1\64\1\uffff\1\64\1\u01d3\1\64\1\u01d6\1\uffff"+
        "\1\u01d7\1\uffff\1\u01d8\1\u01d9\1\uffff\3\64\2\uffff\1\64\1\u01de"+
        "\1\uffff\1\64\1\uffff\2\64\2\uffff\1\u01e2\1\uffff\1\u01e3\2\uffff"+
        "\1\64\1\uffff\1\64\1\u01e6\1\uffff\1\u01e7\1\64\4\uffff\1\u01e9"+
        "\3\64\1\uffff\1\64\1\u01ee\1\u01ef\2\uffff\1\64\1\u01f1\2\uffff"+
        "\1\64\1\uffff\1\u01f3\1\u01f4\1\64\1\u01f6\2\uffff\1\u01f7\1\uffff"+
        "\1\64\2\uffff\1\u01f9\2\uffff\1\64\1\uffff\3\64\1\u01fe\1\uffff";
    static final String DFA39_eofS =
        "\u01ff\uffff";
    static final String DFA39_minS =
        "\1\11\1\56\3\47\1\60\1\uffff\1\47\5\uffff\1\52\2\uffff\1\52\1\41"+
        "\1\42\2\uffff\5\75\1\174\5\uffff\1\151\1\154\1\47\2\141\1\154\1"+
        "\141\1\157\1\141\1\144\2\151\1\47\1\146\2\145\1\141\1\156\1\141"+
        "\1\150\2\uffff\1\56\1\uffff\1\143\1\154\1\147\1\43\25\uffff\1\151"+
        "\1\142\1\166\1\154\1\144\1\43\1\163\1\145\1\165\1\154\1\141\1\162"+
        "\1\164\1\143\1\163\1\157\1\163\1\144\1\143\1\154\1\164\1\162\1\157"+
        "\1\164\1\141\1\166\1\145\3\43\1\153\1\143\1\156\1\144\2\43\1\164"+
        "\1\43\1\145\1\163\1\154\1\141\1\172\1\141\1\142\1\145\1\43\1\165"+
        "\1\151\1\144\1\151\1\154\2\145\1\164\1\uffff\1\157\1\43\1\141\1"+
        "\154\1\151\1\167\1\uffff\1\143\1\157\1\154\1\157\1\43\1\145\3\43"+
        "\1\uffff\1\145\1\143\1\163\1\141\1\160\1\156\1\163\1\141\1\162\1"+
        "\145\1\154\1\141\1\145\1\143\1\164\1\160\1\145\1\43\1\145\2\163"+
        "\1\143\1\43\1\155\1\157\1\156\1\165\1\151\1\156\1\uffff\3\145\2"+
        "\uffff\1\145\1\153\1\165\1\145\2\uffff\1\151\1\145\1\uffff\1\162"+
        "\2\157\1\145\1\162\1\145\1\162\1\141\1\43\1\uffff\1\145\1\157\1"+
        "\151\1\141\1\156\1\165\1\167\1\156\1\150\1\155\1\uffff\1\151\1\43"+
        "\1\156\1\145\1\160\1\145\1\162\1\151\1\164\1\uffff\1\162\3\uffff"+
        "\1\43\1\153\1\164\1\165\1\162\1\145\1\150\1\164\1\145\1\157\1\43"+
        "\1\141\1\165\1\164\1\43\1\151\2\43\1\146\1\uffff\1\160\1\165\1\164"+
        "\1\145\1\150\1\uffff\2\43\1\164\1\160\1\156\1\164\1\170\2\162\3"+
        "\43\1\163\1\43\1\157\1\162\1\154\1\165\1\153\1\143\1\145\1\43\1"+
        "\164\1\165\1\145\1\43\1\uffff\1\43\1\156\1\165\1\166\1\164\1\147"+
        "\1\145\2\43\1\145\1\43\1\160\1\164\1\uffff\1\43\1\145\1\164\1\144"+
        "\1\43\1\143\2\43\1\uffff\1\43\1\145\1\164\1\145\1\143\1\43\1\145"+
        "\1\156\1\162\1\uffff\1\162\1\154\1\145\1\uffff\1\156\2\uffff\1\43"+
        "\1\164\2\163\2\43\2\uffff\2\43\1\147\1\151\1\43\1\164\1\163\3\uffff"+
        "\2\43\1\uffff\1\156\1\43\1\141\1\162\1\145\1\164\1\43\1\uffff\1"+
        "\43\1\164\1\43\2\uffff\1\43\1\145\1\157\1\145\1\43\1\163\1\43\2"+
        "\uffff\1\43\1\uffff\1\162\1\43\1\uffff\1\156\1\11\1\165\1\uffff"+
        "\1\43\3\uffff\1\162\1\150\1\163\1\164\1\uffff\1\43\1\164\1\43\1"+
        "\145\1\164\1\43\1\143\1\uffff\2\151\1\43\4\uffff\1\43\1\146\1\163"+
        "\1\uffff\1\43\1\145\2\uffff\1\43\1\uffff\1\160\1\143\2\43\2\uffff"+
        "\1\150\2\uffff\1\43\1\164\1\43\1\uffff\1\43\2\uffff\1\145\1\uffff"+
        "\1\43\1\uffff\1\162\1\uffff\1\163\1\43\1\163\1\43\1\uffff\1\43\1"+
        "\uffff\2\43\1\uffff\1\164\1\157\1\166\2\uffff\1\151\1\43\1\uffff"+
        "\1\143\1\uffff\1\163\1\145\2\uffff\1\43\1\uffff\1\43\2\uffff\1\163"+
        "\1\uffff\1\145\1\43\1\uffff\1\43\1\142\4\uffff\1\43\1\156\2\145"+
        "\1\uffff\1\164\2\43\2\uffff\1\163\1\43\2\uffff\1\171\1\uffff\2\43"+
        "\1\144\1\43\2\uffff\1\43\1\uffff\1\137\2\uffff\1\43\2\uffff\1\162"+
        "\1\uffff\2\157\1\164\1\43\1\uffff";
    static final String DFA39_maxS =
        "\1\176\1\71\1\165\1\171\1\47\1\71\1\uffff\1\47\5\uffff\1\52\2\uffff"+
        "\1\52\1\41\1\172\2\uffff\1\76\4\75\1\174\5\uffff\1\165\1\163\1\47"+
        "\1\165\1\162\1\170\2\162\1\141\1\163\2\157\1\47\1\166\1\145\1\164"+
        "\1\162\1\163\2\151\2\uffff\1\71\1\uffff\1\167\1\154\1\164\1\172"+
        "\25\uffff\1\157\1\142\1\166\1\164\1\171\1\172\1\163\1\145\1\165"+
        "\1\156\1\145\1\162\1\164\2\163\1\157\1\163\1\144\1\151\1\154\1\164"+
        "\1\162\1\157\1\164\1\157\1\166\1\145\3\172\1\153\1\143\1\156\1\144"+
        "\2\172\1\164\1\172\1\145\1\166\1\154\1\141\1\172\1\141\1\142\1\145"+
        "\1\172\1\165\1\160\1\144\1\151\1\154\2\145\1\164\1\uffff\1\157\1"+
        "\172\1\141\1\154\1\151\1\167\1\uffff\1\155\1\157\1\154\1\157\1\172"+
        "\1\145\3\172\1\uffff\1\145\1\143\1\163\1\141\1\160\1\156\1\163\1"+
        "\141\1\163\1\145\1\154\1\141\1\145\1\143\1\164\1\160\1\151\1\172"+
        "\1\154\2\163\1\143\1\172\1\155\1\157\1\156\1\165\1\151\1\156\1\uffff"+
        "\2\145\1\157\2\uffff\1\145\1\153\1\165\1\145\2\uffff\1\151\1\145"+
        "\1\uffff\1\162\2\157\1\145\1\162\1\145\1\162\1\154\1\172\1\uffff"+
        "\1\145\1\161\1\151\1\141\1\156\1\165\1\167\1\162\1\150\1\155\1\uffff"+
        "\1\151\1\172\1\156\1\145\1\160\1\145\1\162\1\151\1\164\1\uffff\1"+
        "\162\3\uffff\1\172\1\153\1\164\1\165\1\162\1\145\1\150\1\164\1\145"+
        "\1\157\1\172\1\141\1\165\1\164\1\172\1\151\2\172\1\146\1\uffff\1"+
        "\160\1\165\1\164\1\145\1\150\1\uffff\2\172\1\164\1\160\1\156\1\164"+
        "\1\170\2\162\3\172\1\163\1\172\1\157\1\162\1\154\1\165\1\153\1\143"+
        "\1\145\1\172\1\164\1\165\1\145\1\172\1\uffff\1\172\1\156\1\165\1"+
        "\166\1\164\1\147\1\145\2\172\1\145\1\172\1\160\1\164\1\uffff\1\172"+
        "\1\145\1\164\1\144\1\172\1\143\2\172\1\uffff\1\172\1\145\1\164\1"+
        "\145\1\143\1\172\1\145\1\156\1\162\1\uffff\1\162\1\154\1\145\1\uffff"+
        "\1\156\2\uffff\1\172\1\164\2\163\2\172\2\uffff\2\172\1\147\1\151"+
        "\1\172\1\164\1\163\3\uffff\2\172\1\uffff\1\156\1\172\1\141\1\162"+
        "\1\145\1\164\1\172\1\uffff\1\172\1\164\1\172\2\uffff\1\172\1\145"+
        "\1\157\1\145\1\172\1\163\1\172\2\uffff\1\172\1\uffff\1\162\1\172"+
        "\1\uffff\1\156\1\40\1\165\1\uffff\1\172\3\uffff\1\162\1\150\1\163"+
        "\1\164\1\uffff\1\172\1\164\1\172\1\145\1\164\1\172\1\143\1\uffff"+
        "\2\151\1\172\4\uffff\1\172\1\146\1\163\1\uffff\1\172\1\145\2\uffff"+
        "\1\172\1\uffff\1\160\1\143\2\172\2\uffff\1\150\2\uffff\1\172\1\164"+
        "\1\172\1\uffff\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff\1\162\1"+
        "\uffff\1\163\1\172\1\163\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\1\164\1\157\1\166\2\uffff\1\151\1\172\1\uffff\1\143\1\uffff\1\163"+
        "\1\145\2\uffff\1\172\1\uffff\1\172\2\uffff\1\163\1\uffff\1\145\1"+
        "\172\1\uffff\1\172\1\142\4\uffff\1\172\1\156\2\145\1\uffff\1\164"+
        "\2\172\2\uffff\1\163\1\172\2\uffff\1\171\1\uffff\2\172\1\144\1\172"+
        "\2\uffff\1\172\1\uffff\1\137\2\uffff\1\172\2\uffff\1\162\1\uffff"+
        "\2\157\1\164\1\172\1\uffff";
    static final String DFA39_acceptS =
        "\6\uffff\1\7\1\uffff\1\11\1\12\1\13\1\14\1\15\1\uffff\1\20\1\21"+
        "\3\uffff\1\25\1\27\6\uffff\1\42\1\43\1\44\1\45\1\46\24\uffff\1\u0084"+
        "\1\6\1\uffff\1\2\4\uffff\1\3\1\4\1\5\1\10\1\16\1\17\1\22\1\u0085"+
        "\1\23\1\24\1\26\1\30\1\33\1\31\1\32\1\37\1\36\1\34\1\35\1\40\1\41"+
        "\67\uffff\1\1\6\uffff\1\60\11\uffff\1\54\35\uffff\1\121\3\uffff"+
        "\1\122\1\130\4\uffff\1\141\1\142\2\uffff\1\144\11\uffff\1\164\12"+
        "\uffff\1\136\11\uffff\1\50\1\uffff\1\52\1\53\1\55\23\uffff\1\104"+
        "\5\uffff\1\112\32\uffff\1\162\15\uffff\1\140\10\uffff\1\61\11\uffff"+
        "\1\74\3\uffff\1\100\1\uffff\1\102\1\103\6\uffff\1\113\1\114\7\uffff"+
        "\1\127\1\131\1\132\2\uffff\1\134\7\uffff\1\156\3\uffff\1\163\1\165"+
        "\7\uffff\1\172\1\174\1\uffff\1\176\2\uffff\1\56\3\uffff\1\147\1"+
        "\uffff\1\u0082\1\51\1\62\4\uffff\1\70\7\uffff\1\u0081\3\uffff\1"+
        "\110\1\111\1\115\1\116\3\uffff\1\123\2\uffff\1\133\1\u0080\1\uffff"+
        "\1\145\4\uffff\1\155\1\157\1\uffff\1\161\1\166\3\uffff\1\177\1\uffff"+
        "\1\173\1\175\1\uffff\1\137\1\uffff\1\47\1\uffff\1\151\4\uffff\1"+
        "\71\1\uffff\1\73\2\uffff\1\77\3\uffff\1\107\1\117\2\uffff\1\125"+
        "\1\uffff\1\143\2\uffff\1\153\1\154\1\uffff\1\167\1\uffff\1\170\1"+
        "\171\1\uffff\1\57\2\uffff\1\64\2\uffff\1\66\1\72\1\75\1\76\4\uffff"+
        "\1\124\3\uffff\1\160\1\u0083\2\uffff\1\63\1\65\1\uffff\1\101\4\uffff"+
        "\1\146\1\152\1\uffff\1\150\1\uffff\1\105\1\106\1\uffff\1\126\1\135"+
        "\1\uffff\1\120\4\uffff\1\67";
    static final String DFA39_specialS =
        "\u01ff\uffff}>";
    static final String[] DFA39_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\27\1\10\2\uffff\1\11\1\12"+
            "\1\6\1\13\1\14\1\15\1\16\1\17\1\37\1\5\1\20\12\1\1\22\1\24\1"+
            "\25\1\33\1\26\1\23\1\21\1\64\1\42\13\64\1\54\2\64\1\7\6\64\1"+
            "\4\2\64\1\34\1\uffff\1\35\1\30\1\36\1\uffff\1\41\1\3\1\43\1"+
            "\44\1\45\1\46\1\47\1\50\1\51\2\64\1\52\1\53\1\2\1\55\1\40\1"+
            "\7\1\56\1\57\1\60\1\61\1\62\1\63\1\4\2\64\1\uffff\1\32\1\uffff"+
            "\1\31",
            "\1\66\1\uffff\12\1",
            "\1\67\107\uffff\1\70\5\uffff\1\71",
            "\1\74\75\uffff\1\72\23\uffff\1\73",
            "\1\75",
            "\12\65",
            "",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "",
            "\1\37",
            "\1\103",
            "\1\23\15\uffff\12\23\3\uffff\1\105\3\uffff\32\23\6\uffff\32"+
            "\23",
            "",
            "",
            "\1\107\1\110",
            "\1\112",
            "\1\110",
            "\1\110",
            "\1\110",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "\1\123\10\uffff\1\121\2\uffff\1\122",
            "\1\124\1\uffff\1\125\4\uffff\1\126",
            "\1\74",
            "\1\127\6\uffff\1\130\3\uffff\1\131\2\uffff\1\132\2\uffff\1"+
            "\133\2\uffff\1\134",
            "\1\135\3\uffff\1\136\3\uffff\1\137\10\uffff\1\140",
            "\1\141\1\uffff\1\142\11\uffff\1\143",
            "\1\144\3\uffff\1\145\11\uffff\1\146\2\uffff\1\147",
            "\1\150\2\uffff\1\151",
            "\1\152",
            "\1\153\1\uffff\1\154\7\uffff\1\155\4\uffff\1\156",
            "\1\157\5\uffff\1\160",
            "\1\161\5\uffff\1\162",
            "\1\67",
            "\1\163\7\uffff\1\164\1\uffff\1\165\1\uffff\1\166\3\uffff\1"+
            "\167",
            "\1\170",
            "\1\171\2\uffff\1\172\1\173\12\uffff\1\174",
            "\1\175\6\uffff\1\176\6\uffff\1\177\2\uffff\1\u0080",
            "\1\u0081\1\uffff\1\u0082\2\uffff\1\u0083",
            "\1\u0084\7\uffff\1\u0085",
            "\1\u0086\1\u0087",
            "",
            "",
            "\1\u0088\1\uffff\12\65",
            "",
            "\1\u0089\20\uffff\1\u008a\2\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d\14\uffff\1\u008e",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
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
            "\1\u0091\5\uffff\1\u0090",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\7\uffff\1\u0095",
            "\1\u0096\24\uffff\1\u0097",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64"+
            "\1\u0098\27\64",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\1\u009e\1\u009f",
            "\1\u00a0\3\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\2\uffff\1\u00a5\5\uffff\1\u00a6\6\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\5\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\15\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64"+
            "\1\u00b8\16\64\1\u00b9\1\u00ba\6\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00c3",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64"+
            "\1\u00c4\26\64",
            "\1\u00c6",
            "\1\u00c7\2\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00d0",
            "\1\u00d1\6\uffff\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00e0\11\uffff\1\u00df",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00e5",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\3\uffff\1\u00fb",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u00fd\6\uffff\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b\11\uffff\1\u010c",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a\12\uffff\1\u011b",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15"+
            "\64\1\u011c\14\64",
            "",
            "\1\u011e",
            "\1\u011f\1\uffff\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126\3\uffff\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "\1\u0133",
            "",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0143",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0158",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13"+
            "\64\1\u0159\16\64",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22"+
            "\64\1\u016e\7\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0171",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0173",
            "\1\u0174",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u017a",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u0192",
            "\1\u0193",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64"+
            "\1\u0194\25\64",
            "\1\u0196",
            "\1\u0197",
            "",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u019a",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01a2",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01a9",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01ac",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01ae",
            "\1\u01af\26\uffff\1\u01af",
            "\1\u01b0",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01b7",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01b9",
            "\1\u01ba",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01c4",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u01ca",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01cc",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u01cf",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01d1",
            "",
            "\1\u01d2",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01d4",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\u01d5\1\uffff"+
            "\32\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "",
            "\1\u01dd",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01df",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01e8",
            "",
            "",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u01f0",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u01f2",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "\1\u01f5",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "\1\u01f8",
            "",
            "",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            "",
            "",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\2\64\13\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FOR_NOTATION | NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | PERIOD | EXACT_NUM_LIT | CHAR_STRING | CHAR_STRING_PERL | DELIMITED_ID | PERCENT | AMPERSAND | LEFT_PAREN | RIGHT_PAREN | DOUBLE_ASTERISK | ASTERISK | PLUS_SIGN | COMMA | SOLIDUS | AT_SIGN | ASSIGN_OP | BINDVAR | COLON | SEMICOLON | LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OR_EQUALS_OP | NOT_EQUAL_OP | CARRET_OPERATOR_PART | TILDE_OPERATOR_PART | EXCLAMATION_OPERATOR_PART | GREATER_THAN_OP | CONCATENATION_OP | VERTICAL_BAR | EQUALS_OP | LEFT_BRACKET | RIGHT_BRACKET | INTRODUCER | SEPARATOR | PROMPT | SQL92_RESERVED_ALL | SQL92_RESERVED_ALTER | SQL92_RESERVED_AND | SQL92_RESERVED_ANY | SQL92_RESERVED_AS | SQL92_RESERVED_ASC | SQL92_RESERVED_BEGIN | SQL92_RESERVED_BETWEEN | SQL92_RESERVED_BY | SQL92_RESERVED_CASE | SQL92_RESERVED_CHECK | PLSQL_RESERVED_CLUSTERS | PLSQL_RESERVED_COLAUTH | PLSQL_RESERVED_COMPRESS | SQL92_RESERVED_CONNECT | PLSQL_NON_RESERVED_CONNECT_BY_ROOT | PLSQL_RESERVED_CRASH | SQL92_RESERVED_CREATE | SQL92_RESERVED_CURRENT | SQL92_RESERVED_CURSOR | SQL92_RESERVED_DATE | SQL92_RESERVED_DECLARE | SQL92_RESERVED_DEFAULT | SQL92_RESERVED_DELETE | SQL92_RESERVED_DESC | SQL92_RESERVED_DISTINCT | SQL92_RESERVED_DROP | SQL92_RESERVED_ELSE | SQL92_RESERVED_END | SQL92_RESERVED_EXCEPTION | PLSQL_RESERVED_EXCLUSIVE | SQL92_RESERVED_EXISTS | SQL92_RESERVED_FALSE | SQL92_RESERVED_FETCH | SQL92_RESERVED_FOR | SQL92_RESERVED_FROM | SQL92_RESERVED_GOTO | SQL92_RESERVED_GRANT | SQL92_RESERVED_GROUP | SQL92_RESERVED_HAVING | PLSQL_RESERVED_IDENTIFIED | PLSQL_RESERVED_IF | SQL92_RESERVED_IN | PLSQL_RESERVED_INDEX | PLSQL_RESERVED_INDEXES | SQL92_RESERVED_INSERT | SQL92_RESERVED_INTERSECT | SQL92_RESERVED_INTO | SQL92_RESERVED_IS | SQL92_RESERVED_LIKE | PLSQL_RESERVED_LOCK | PLSQL_RESERVED_MINUS | PLSQL_RESERVED_MODE | PLSQL_RESERVED_NOCOMPRESS | SQL92_RESERVED_NOT | PLSQL_RESERVED_NOWAIT | SQL92_RESERVED_NULL | SQL92_RESERVED_OF | SQL92_RESERVED_ON | SQL92_RESERVED_OPTION | SQL92_RESERVED_OR | SQL92_RESERVED_ORDER | SQL92_RESERVED_OVERLAPS | SQL92_RESERVED_PRIOR | SQL92_RESERVED_PROCEDURE | SQL92_RESERVED_PUBLIC | PLSQL_RESERVED_RESOURCE | SQL92_RESERVED_REVOKE | SQL92_RESERVED_SELECT | PLSQL_RESERVED_SHARE | SQL92_RESERVED_SIZE | PLSQL_RESERVED_START | PLSQL_RESERVED_TABAUTH | SQL92_RESERVED_TABLE | SQL92_RESERVED_THE | SQL92_RESERVED_THEN | SQL92_RESERVED_TO | SQL92_RESERVED_TRUE | SQL92_RESERVED_UNION | SQL92_RESERVED_UNIQUE | SQL92_RESERVED_UPDATE | SQL92_RESERVED_VALUES | SQL92_RESERVED_VIEW | PLSQL_RESERVED_VIEWS | SQL92_RESERVED_WHEN | SQL92_RESERVED_WHERE | SQL92_RESERVED_WITH | PLSQL_NON_RESERVED_USING | PLSQL_NON_RESERVED_MODEL | PLSQL_NON_RESERVED_ELSIF | PLSQL_NON_RESERVED_PIVOT | PLSQL_NON_RESERVED_UNPIVOT | REGULAR_ID | ZV );";
        }
    }
 

}