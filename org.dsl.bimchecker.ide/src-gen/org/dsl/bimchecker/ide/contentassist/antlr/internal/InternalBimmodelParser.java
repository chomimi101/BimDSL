package org.dsl.bimchecker.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.dsl.bimchecker.services.BimmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBimmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IFCNAME", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'alias'", "'='", "'or'", "'annotation'", "':'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int RULE_IFCNAME=5;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBimmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBimmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBimmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBimmodel.g"; }


    	private BimmodelGrammarAccess grammarAccess;

    	public void setGrammarAccess(BimmodelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBimmodel"
    // InternalBimmodel.g:53:1: entryRuleBimmodel : ruleBimmodel EOF ;
    public final void entryRuleBimmodel() throws RecognitionException {
        try {
            // InternalBimmodel.g:54:1: ( ruleBimmodel EOF )
            // InternalBimmodel.g:55:1: ruleBimmodel EOF
            {
             before(grammarAccess.getBimmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleBimmodel();

            state._fsp--;

             after(grammarAccess.getBimmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBimmodel"


    // $ANTLR start "ruleBimmodel"
    // InternalBimmodel.g:62:1: ruleBimmodel : ( ( rule__Bimmodel__RulesAssignment )* ) ;
    public final void ruleBimmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:66:2: ( ( ( rule__Bimmodel__RulesAssignment )* ) )
            // InternalBimmodel.g:67:2: ( ( rule__Bimmodel__RulesAssignment )* )
            {
            // InternalBimmodel.g:67:2: ( ( rule__Bimmodel__RulesAssignment )* )
            // InternalBimmodel.g:68:3: ( rule__Bimmodel__RulesAssignment )*
            {
             before(grammarAccess.getBimmodelAccess().getRulesAssignment()); 
            // InternalBimmodel.g:69:3: ( rule__Bimmodel__RulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBimmodel.g:69:4: rule__Bimmodel__RulesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Bimmodel__RulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBimmodelAccess().getRulesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBimmodel"


    // $ANTLR start "entryRuleRule"
    // InternalBimmodel.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalBimmodel.g:79:1: ( ruleRule EOF )
            // InternalBimmodel.g:80:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalBimmodel.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalBimmodel.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalBimmodel.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalBimmodel.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalBimmodel.g:94:3: ( rule__Rule__Group__0 )
            // InternalBimmodel.g:94:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAliass"
    // InternalBimmodel.g:103:1: entryRuleAliass : ruleAliass EOF ;
    public final void entryRuleAliass() throws RecognitionException {
        try {
            // InternalBimmodel.g:104:1: ( ruleAliass EOF )
            // InternalBimmodel.g:105:1: ruleAliass EOF
            {
             before(grammarAccess.getAliassRule()); 
            pushFollow(FOLLOW_1);
            ruleAliass();

            state._fsp--;

             after(grammarAccess.getAliassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAliass"


    // $ANTLR start "ruleAliass"
    // InternalBimmodel.g:112:1: ruleAliass : ( ( rule__Aliass__Group__0 ) ) ;
    public final void ruleAliass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:116:2: ( ( ( rule__Aliass__Group__0 ) ) )
            // InternalBimmodel.g:117:2: ( ( rule__Aliass__Group__0 ) )
            {
            // InternalBimmodel.g:117:2: ( ( rule__Aliass__Group__0 ) )
            // InternalBimmodel.g:118:3: ( rule__Aliass__Group__0 )
            {
             before(grammarAccess.getAliassAccess().getGroup()); 
            // InternalBimmodel.g:119:3: ( rule__Aliass__Group__0 )
            // InternalBimmodel.g:119:4: rule__Aliass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aliass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAliassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAliass"


    // $ANTLR start "entryRuleAnnotation"
    // InternalBimmodel.g:128:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalBimmodel.g:129:1: ( ruleAnnotation EOF )
            // InternalBimmodel.g:130:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalBimmodel.g:137:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:141:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalBimmodel.g:142:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalBimmodel.g:142:2: ( ( rule__Annotation__Group__0 ) )
            // InternalBimmodel.g:143:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalBimmodel.g:144:3: ( rule__Annotation__Group__0 )
            // InternalBimmodel.g:144:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationDetail"
    // InternalBimmodel.g:153:1: entryRuleAnnotationDetail : ruleAnnotationDetail EOF ;
    public final void entryRuleAnnotationDetail() throws RecognitionException {
        try {
            // InternalBimmodel.g:154:1: ( ruleAnnotationDetail EOF )
            // InternalBimmodel.g:155:1: ruleAnnotationDetail EOF
            {
             before(grammarAccess.getAnnotationDetailRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationDetail();

            state._fsp--;

             after(grammarAccess.getAnnotationDetailRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotationDetail"


    // $ANTLR start "ruleAnnotationDetail"
    // InternalBimmodel.g:162:1: ruleAnnotationDetail : ( ( rule__AnnotationDetail__Group__0 ) ) ;
    public final void ruleAnnotationDetail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:166:2: ( ( ( rule__AnnotationDetail__Group__0 ) ) )
            // InternalBimmodel.g:167:2: ( ( rule__AnnotationDetail__Group__0 ) )
            {
            // InternalBimmodel.g:167:2: ( ( rule__AnnotationDetail__Group__0 ) )
            // InternalBimmodel.g:168:3: ( rule__AnnotationDetail__Group__0 )
            {
             before(grammarAccess.getAnnotationDetailAccess().getGroup()); 
            // InternalBimmodel.g:169:3: ( rule__AnnotationDetail__Group__0 )
            // InternalBimmodel.g:169:4: rule__AnnotationDetail__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationDetailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationDetail"


    // $ANTLR start "entryRuleObjectName"
    // InternalBimmodel.g:178:1: entryRuleObjectName : ruleObjectName EOF ;
    public final void entryRuleObjectName() throws RecognitionException {
        try {
            // InternalBimmodel.g:179:1: ( ruleObjectName EOF )
            // InternalBimmodel.g:180:1: ruleObjectName EOF
            {
             before(grammarAccess.getObjectNameRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectName();

            state._fsp--;

             after(grammarAccess.getObjectNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjectName"


    // $ANTLR start "ruleObjectName"
    // InternalBimmodel.g:187:1: ruleObjectName : ( RULE_STRING ) ;
    public final void ruleObjectName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:191:2: ( ( RULE_STRING ) )
            // InternalBimmodel.g:192:2: ( RULE_STRING )
            {
            // InternalBimmodel.g:192:2: ( RULE_STRING )
            // InternalBimmodel.g:193:3: RULE_STRING
            {
             before(grammarAccess.getObjectNameAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectNameAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectName"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalBimmodel.g:202:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:206:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalBimmodel.g:207:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalBimmodel.g:214:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:218:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalBimmodel.g:219:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalBimmodel.g:219:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalBimmodel.g:220:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalBimmodel.g:221:2: ( rule__Rule__NameAssignment_0 )
            // InternalBimmodel.g:221:3: rule__Rule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalBimmodel.g:229:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:233:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalBimmodel.g:234:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalBimmodel.g:241:1: rule__Rule__Group__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:245:1: ( ( '{' ) )
            // InternalBimmodel.g:246:1: ( '{' )
            {
            // InternalBimmodel.g:246:1: ( '{' )
            // InternalBimmodel.g:247:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalBimmodel.g:256:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:260:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalBimmodel.g:261:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalBimmodel.g:268:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AlialistAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:272:1: ( ( ( rule__Rule__AlialistAssignment_2 ) ) )
            // InternalBimmodel.g:273:1: ( ( rule__Rule__AlialistAssignment_2 ) )
            {
            // InternalBimmodel.g:273:1: ( ( rule__Rule__AlialistAssignment_2 ) )
            // InternalBimmodel.g:274:2: ( rule__Rule__AlialistAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getAlialistAssignment_2()); 
            // InternalBimmodel.g:275:2: ( rule__Rule__AlialistAssignment_2 )
            // InternalBimmodel.g:275:3: rule__Rule__AlialistAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__AlialistAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlialistAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalBimmodel.g:283:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:287:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalBimmodel.g:288:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalBimmodel.g:295:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__AnnoinfoAssignment_3 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:299:1: ( ( ( rule__Rule__AnnoinfoAssignment_3 )? ) )
            // InternalBimmodel.g:300:1: ( ( rule__Rule__AnnoinfoAssignment_3 )? )
            {
            // InternalBimmodel.g:300:1: ( ( rule__Rule__AnnoinfoAssignment_3 )? )
            // InternalBimmodel.g:301:2: ( rule__Rule__AnnoinfoAssignment_3 )?
            {
             before(grammarAccess.getRuleAccess().getAnnoinfoAssignment_3()); 
            // InternalBimmodel.g:302:2: ( rule__Rule__AnnoinfoAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBimmodel.g:302:3: rule__Rule__AnnoinfoAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__AnnoinfoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getAnnoinfoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalBimmodel.g:310:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:314:1: ( rule__Rule__Group__4__Impl )
            // InternalBimmodel.g:315:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalBimmodel.g:321:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:325:1: ( ( '}' ) )
            // InternalBimmodel.g:326:1: ( '}' )
            {
            // InternalBimmodel.g:326:1: ( '}' )
            // InternalBimmodel.g:327:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Aliass__Group__0"
    // InternalBimmodel.g:337:1: rule__Aliass__Group__0 : rule__Aliass__Group__0__Impl rule__Aliass__Group__1 ;
    public final void rule__Aliass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:341:1: ( rule__Aliass__Group__0__Impl rule__Aliass__Group__1 )
            // InternalBimmodel.g:342:2: rule__Aliass__Group__0__Impl rule__Aliass__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Aliass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aliass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__0"


    // $ANTLR start "rule__Aliass__Group__0__Impl"
    // InternalBimmodel.g:349:1: rule__Aliass__Group__0__Impl : ( 'alias' ) ;
    public final void rule__Aliass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:353:1: ( ( 'alias' ) )
            // InternalBimmodel.g:354:1: ( 'alias' )
            {
            // InternalBimmodel.g:354:1: ( 'alias' )
            // InternalBimmodel.g:355:2: 'alias'
            {
             before(grammarAccess.getAliassAccess().getAliasKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAliassAccess().getAliasKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__0__Impl"


    // $ANTLR start "rule__Aliass__Group__1"
    // InternalBimmodel.g:364:1: rule__Aliass__Group__1 : rule__Aliass__Group__1__Impl rule__Aliass__Group__2 ;
    public final void rule__Aliass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:368:1: ( rule__Aliass__Group__1__Impl rule__Aliass__Group__2 )
            // InternalBimmodel.g:369:2: rule__Aliass__Group__1__Impl rule__Aliass__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Aliass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aliass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__1"


    // $ANTLR start "rule__Aliass__Group__1__Impl"
    // InternalBimmodel.g:376:1: rule__Aliass__Group__1__Impl : ( '=' ) ;
    public final void rule__Aliass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:380:1: ( ( '=' ) )
            // InternalBimmodel.g:381:1: ( '=' )
            {
            // InternalBimmodel.g:381:1: ( '=' )
            // InternalBimmodel.g:382:2: '='
            {
             before(grammarAccess.getAliassAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAliassAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__1__Impl"


    // $ANTLR start "rule__Aliass__Group__2"
    // InternalBimmodel.g:391:1: rule__Aliass__Group__2 : rule__Aliass__Group__2__Impl rule__Aliass__Group__3 ;
    public final void rule__Aliass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:395:1: ( rule__Aliass__Group__2__Impl rule__Aliass__Group__3 )
            // InternalBimmodel.g:396:2: rule__Aliass__Group__2__Impl rule__Aliass__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Aliass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aliass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__2"


    // $ANTLR start "rule__Aliass__Group__2__Impl"
    // InternalBimmodel.g:403:1: rule__Aliass__Group__2__Impl : ( ( rule__Aliass__AliassAssignment_2 ) ) ;
    public final void rule__Aliass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:407:1: ( ( ( rule__Aliass__AliassAssignment_2 ) ) )
            // InternalBimmodel.g:408:1: ( ( rule__Aliass__AliassAssignment_2 ) )
            {
            // InternalBimmodel.g:408:1: ( ( rule__Aliass__AliassAssignment_2 ) )
            // InternalBimmodel.g:409:2: ( rule__Aliass__AliassAssignment_2 )
            {
             before(grammarAccess.getAliassAccess().getAliassAssignment_2()); 
            // InternalBimmodel.g:410:2: ( rule__Aliass__AliassAssignment_2 )
            // InternalBimmodel.g:410:3: rule__Aliass__AliassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Aliass__AliassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAliassAccess().getAliassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__2__Impl"


    // $ANTLR start "rule__Aliass__Group__3"
    // InternalBimmodel.g:418:1: rule__Aliass__Group__3 : rule__Aliass__Group__3__Impl ;
    public final void rule__Aliass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:422:1: ( rule__Aliass__Group__3__Impl )
            // InternalBimmodel.g:423:2: rule__Aliass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aliass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__3"


    // $ANTLR start "rule__Aliass__Group__3__Impl"
    // InternalBimmodel.g:429:1: rule__Aliass__Group__3__Impl : ( ( rule__Aliass__Group_3__0 )* ) ;
    public final void rule__Aliass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:433:1: ( ( ( rule__Aliass__Group_3__0 )* ) )
            // InternalBimmodel.g:434:1: ( ( rule__Aliass__Group_3__0 )* )
            {
            // InternalBimmodel.g:434:1: ( ( rule__Aliass__Group_3__0 )* )
            // InternalBimmodel.g:435:2: ( rule__Aliass__Group_3__0 )*
            {
             before(grammarAccess.getAliassAccess().getGroup_3()); 
            // InternalBimmodel.g:436:2: ( rule__Aliass__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBimmodel.g:436:3: rule__Aliass__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Aliass__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAliassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group__3__Impl"


    // $ANTLR start "rule__Aliass__Group_3__0"
    // InternalBimmodel.g:445:1: rule__Aliass__Group_3__0 : rule__Aliass__Group_3__0__Impl rule__Aliass__Group_3__1 ;
    public final void rule__Aliass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:449:1: ( rule__Aliass__Group_3__0__Impl rule__Aliass__Group_3__1 )
            // InternalBimmodel.g:450:2: rule__Aliass__Group_3__0__Impl rule__Aliass__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Aliass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aliass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group_3__0"


    // $ANTLR start "rule__Aliass__Group_3__0__Impl"
    // InternalBimmodel.g:457:1: rule__Aliass__Group_3__0__Impl : ( 'or' ) ;
    public final void rule__Aliass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:461:1: ( ( 'or' ) )
            // InternalBimmodel.g:462:1: ( 'or' )
            {
            // InternalBimmodel.g:462:1: ( 'or' )
            // InternalBimmodel.g:463:2: 'or'
            {
             before(grammarAccess.getAliassAccess().getOrKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAliassAccess().getOrKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group_3__0__Impl"


    // $ANTLR start "rule__Aliass__Group_3__1"
    // InternalBimmodel.g:472:1: rule__Aliass__Group_3__1 : rule__Aliass__Group_3__1__Impl ;
    public final void rule__Aliass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:476:1: ( rule__Aliass__Group_3__1__Impl )
            // InternalBimmodel.g:477:2: rule__Aliass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aliass__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group_3__1"


    // $ANTLR start "rule__Aliass__Group_3__1__Impl"
    // InternalBimmodel.g:483:1: rule__Aliass__Group_3__1__Impl : ( ( rule__Aliass__AliassAssignment_3_1 ) ) ;
    public final void rule__Aliass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:487:1: ( ( ( rule__Aliass__AliassAssignment_3_1 ) ) )
            // InternalBimmodel.g:488:1: ( ( rule__Aliass__AliassAssignment_3_1 ) )
            {
            // InternalBimmodel.g:488:1: ( ( rule__Aliass__AliassAssignment_3_1 ) )
            // InternalBimmodel.g:489:2: ( rule__Aliass__AliassAssignment_3_1 )
            {
             before(grammarAccess.getAliassAccess().getAliassAssignment_3_1()); 
            // InternalBimmodel.g:490:2: ( rule__Aliass__AliassAssignment_3_1 )
            // InternalBimmodel.g:490:3: rule__Aliass__AliassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Aliass__AliassAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAliassAccess().getAliassAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__Group_3__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalBimmodel.g:499:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:503:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalBimmodel.g:504:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalBimmodel.g:511:1: rule__Annotation__Group__0__Impl : ( 'annotation' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:515:1: ( ( 'annotation' ) )
            // InternalBimmodel.g:516:1: ( 'annotation' )
            {
            // InternalBimmodel.g:516:1: ( 'annotation' )
            // InternalBimmodel.g:517:2: 'annotation'
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalBimmodel.g:526:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:530:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalBimmodel.g:531:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalBimmodel.g:538:1: rule__Annotation__Group__1__Impl : ( ':' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:542:1: ( ( ':' ) )
            // InternalBimmodel.g:543:1: ( ':' )
            {
            // InternalBimmodel.g:543:1: ( ':' )
            // InternalBimmodel.g:544:2: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalBimmodel.g:553:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:557:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalBimmodel.g:558:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalBimmodel.g:565:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__AnnotationNameAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:569:1: ( ( ( rule__Annotation__AnnotationNameAssignment_2 ) ) )
            // InternalBimmodel.g:570:1: ( ( rule__Annotation__AnnotationNameAssignment_2 ) )
            {
            // InternalBimmodel.g:570:1: ( ( rule__Annotation__AnnotationNameAssignment_2 ) )
            // InternalBimmodel.g:571:2: ( rule__Annotation__AnnotationNameAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationNameAssignment_2()); 
            // InternalBimmodel.g:572:2: ( rule__Annotation__AnnotationNameAssignment_2 )
            // InternalBimmodel.g:572:3: rule__Annotation__AnnotationNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__AnnotationNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAnnotationNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // InternalBimmodel.g:580:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:584:1: ( rule__Annotation__Group__3__Impl )
            // InternalBimmodel.g:585:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // InternalBimmodel.g:591:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__AnnodetailAssignment_3 )? ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:595:1: ( ( ( rule__Annotation__AnnodetailAssignment_3 )? ) )
            // InternalBimmodel.g:596:1: ( ( rule__Annotation__AnnodetailAssignment_3 )? )
            {
            // InternalBimmodel.g:596:1: ( ( rule__Annotation__AnnodetailAssignment_3 )? )
            // InternalBimmodel.g:597:2: ( rule__Annotation__AnnodetailAssignment_3 )?
            {
             before(grammarAccess.getAnnotationAccess().getAnnodetailAssignment_3()); 
            // InternalBimmodel.g:598:2: ( rule__Annotation__AnnodetailAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBimmodel.g:598:3: rule__Annotation__AnnodetailAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__AnnodetailAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getAnnodetailAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__AnnotationDetail__Group__0"
    // InternalBimmodel.g:607:1: rule__AnnotationDetail__Group__0 : rule__AnnotationDetail__Group__0__Impl rule__AnnotationDetail__Group__1 ;
    public final void rule__AnnotationDetail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:611:1: ( rule__AnnotationDetail__Group__0__Impl rule__AnnotationDetail__Group__1 )
            // InternalBimmodel.g:612:2: rule__AnnotationDetail__Group__0__Impl rule__AnnotationDetail__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AnnotationDetail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group__0"


    // $ANTLR start "rule__AnnotationDetail__Group__0__Impl"
    // InternalBimmodel.g:619:1: rule__AnnotationDetail__Group__0__Impl : ( '=' ) ;
    public final void rule__AnnotationDetail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:623:1: ( ( '=' ) )
            // InternalBimmodel.g:624:1: ( '=' )
            {
            // InternalBimmodel.g:624:1: ( '=' )
            // InternalBimmodel.g:625:2: '='
            {
             before(grammarAccess.getAnnotationDetailAccess().getEqualsSignKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAnnotationDetailAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group__0__Impl"


    // $ANTLR start "rule__AnnotationDetail__Group__1"
    // InternalBimmodel.g:634:1: rule__AnnotationDetail__Group__1 : rule__AnnotationDetail__Group__1__Impl rule__AnnotationDetail__Group__2 ;
    public final void rule__AnnotationDetail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:638:1: ( rule__AnnotationDetail__Group__1__Impl rule__AnnotationDetail__Group__2 )
            // InternalBimmodel.g:639:2: rule__AnnotationDetail__Group__1__Impl rule__AnnotationDetail__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AnnotationDetail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group__1"


    // $ANTLR start "rule__AnnotationDetail__Group__1__Impl"
    // InternalBimmodel.g:646:1: rule__AnnotationDetail__Group__1__Impl : ( ( rule__AnnotationDetail__Group_1__0 )* ) ;
    public final void rule__AnnotationDetail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:650:1: ( ( ( rule__AnnotationDetail__Group_1__0 )* ) )
            // InternalBimmodel.g:651:1: ( ( rule__AnnotationDetail__Group_1__0 )* )
            {
            // InternalBimmodel.g:651:1: ( ( rule__AnnotationDetail__Group_1__0 )* )
            // InternalBimmodel.g:652:2: ( rule__AnnotationDetail__Group_1__0 )*
            {
             before(grammarAccess.getAnnotationDetailAccess().getGroup_1()); 
            // InternalBimmodel.g:653:2: ( rule__AnnotationDetail__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==16) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalBimmodel.g:653:3: rule__AnnotationDetail__Group_1__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AnnotationDetail__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAnnotationDetailAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group__1__Impl"


    // $ANTLR start "rule__AnnotationDetail__Group__2"
    // InternalBimmodel.g:661:1: rule__AnnotationDetail__Group__2 : rule__AnnotationDetail__Group__2__Impl ;
    public final void rule__AnnotationDetail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:665:1: ( rule__AnnotationDetail__Group__2__Impl )
            // InternalBimmodel.g:666:2: rule__AnnotationDetail__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group__2"


    // $ANTLR start "rule__AnnotationDetail__Group__2__Impl"
    // InternalBimmodel.g:672:1: rule__AnnotationDetail__Group__2__Impl : ( ( rule__AnnotationDetail__AnnosAssignment_2 ) ) ;
    public final void rule__AnnotationDetail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:676:1: ( ( ( rule__AnnotationDetail__AnnosAssignment_2 ) ) )
            // InternalBimmodel.g:677:1: ( ( rule__AnnotationDetail__AnnosAssignment_2 ) )
            {
            // InternalBimmodel.g:677:1: ( ( rule__AnnotationDetail__AnnosAssignment_2 ) )
            // InternalBimmodel.g:678:2: ( rule__AnnotationDetail__AnnosAssignment_2 )
            {
             before(grammarAccess.getAnnotationDetailAccess().getAnnosAssignment_2()); 
            // InternalBimmodel.g:679:2: ( rule__AnnotationDetail__AnnosAssignment_2 )
            // InternalBimmodel.g:679:3: rule__AnnotationDetail__AnnosAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__AnnosAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationDetailAccess().getAnnosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group__2__Impl"


    // $ANTLR start "rule__AnnotationDetail__Group_1__0"
    // InternalBimmodel.g:688:1: rule__AnnotationDetail__Group_1__0 : rule__AnnotationDetail__Group_1__0__Impl rule__AnnotationDetail__Group_1__1 ;
    public final void rule__AnnotationDetail__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:692:1: ( rule__AnnotationDetail__Group_1__0__Impl rule__AnnotationDetail__Group_1__1 )
            // InternalBimmodel.g:693:2: rule__AnnotationDetail__Group_1__0__Impl rule__AnnotationDetail__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__AnnotationDetail__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group_1__0"


    // $ANTLR start "rule__AnnotationDetail__Group_1__0__Impl"
    // InternalBimmodel.g:700:1: rule__AnnotationDetail__Group_1__0__Impl : ( ( rule__AnnotationDetail__AnnosAssignment_1_0 ) ) ;
    public final void rule__AnnotationDetail__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:704:1: ( ( ( rule__AnnotationDetail__AnnosAssignment_1_0 ) ) )
            // InternalBimmodel.g:705:1: ( ( rule__AnnotationDetail__AnnosAssignment_1_0 ) )
            {
            // InternalBimmodel.g:705:1: ( ( rule__AnnotationDetail__AnnosAssignment_1_0 ) )
            // InternalBimmodel.g:706:2: ( rule__AnnotationDetail__AnnosAssignment_1_0 )
            {
             before(grammarAccess.getAnnotationDetailAccess().getAnnosAssignment_1_0()); 
            // InternalBimmodel.g:707:2: ( rule__AnnotationDetail__AnnosAssignment_1_0 )
            // InternalBimmodel.g:707:3: rule__AnnotationDetail__AnnosAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__AnnosAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationDetailAccess().getAnnosAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group_1__0__Impl"


    // $ANTLR start "rule__AnnotationDetail__Group_1__1"
    // InternalBimmodel.g:715:1: rule__AnnotationDetail__Group_1__1 : rule__AnnotationDetail__Group_1__1__Impl ;
    public final void rule__AnnotationDetail__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:719:1: ( rule__AnnotationDetail__Group_1__1__Impl )
            // InternalBimmodel.g:720:2: rule__AnnotationDetail__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationDetail__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group_1__1"


    // $ANTLR start "rule__AnnotationDetail__Group_1__1__Impl"
    // InternalBimmodel.g:726:1: rule__AnnotationDetail__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__AnnotationDetail__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:730:1: ( ( 'or' ) )
            // InternalBimmodel.g:731:1: ( 'or' )
            {
            // InternalBimmodel.g:731:1: ( 'or' )
            // InternalBimmodel.g:732:2: 'or'
            {
             before(grammarAccess.getAnnotationDetailAccess().getOrKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAnnotationDetailAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__Group_1__1__Impl"


    // $ANTLR start "rule__Bimmodel__RulesAssignment"
    // InternalBimmodel.g:742:1: rule__Bimmodel__RulesAssignment : ( ruleRule ) ;
    public final void rule__Bimmodel__RulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:746:1: ( ( ruleRule ) )
            // InternalBimmodel.g:747:2: ( ruleRule )
            {
            // InternalBimmodel.g:747:2: ( ruleRule )
            // InternalBimmodel.g:748:3: ruleRule
            {
             before(grammarAccess.getBimmodelAccess().getRulesRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getBimmodelAccess().getRulesRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bimmodel__RulesAssignment"


    // $ANTLR start "rule__Rule__NameAssignment_0"
    // InternalBimmodel.g:757:1: rule__Rule__NameAssignment_0 : ( ruleObjectName ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:761:1: ( ( ruleObjectName ) )
            // InternalBimmodel.g:762:2: ( ruleObjectName )
            {
            // InternalBimmodel.g:762:2: ( ruleObjectName )
            // InternalBimmodel.g:763:3: ruleObjectName
            {
             before(grammarAccess.getRuleAccess().getNameObjectNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectName();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getNameObjectNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_0"


    // $ANTLR start "rule__Rule__AlialistAssignment_2"
    // InternalBimmodel.g:772:1: rule__Rule__AlialistAssignment_2 : ( ruleAliass ) ;
    public final void rule__Rule__AlialistAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:776:1: ( ( ruleAliass ) )
            // InternalBimmodel.g:777:2: ( ruleAliass )
            {
            // InternalBimmodel.g:777:2: ( ruleAliass )
            // InternalBimmodel.g:778:3: ruleAliass
            {
             before(grammarAccess.getRuleAccess().getAlialistAliassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAliass();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAlialistAliassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AlialistAssignment_2"


    // $ANTLR start "rule__Rule__AnnoinfoAssignment_3"
    // InternalBimmodel.g:787:1: rule__Rule__AnnoinfoAssignment_3 : ( ruleAnnotation ) ;
    public final void rule__Rule__AnnoinfoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:791:1: ( ( ruleAnnotation ) )
            // InternalBimmodel.g:792:2: ( ruleAnnotation )
            {
            // InternalBimmodel.g:792:2: ( ruleAnnotation )
            // InternalBimmodel.g:793:3: ruleAnnotation
            {
             before(grammarAccess.getRuleAccess().getAnnoinfoAnnotationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAnnoinfoAnnotationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AnnoinfoAssignment_3"


    // $ANTLR start "rule__Aliass__AliassAssignment_2"
    // InternalBimmodel.g:802:1: rule__Aliass__AliassAssignment_2 : ( RULE_IFCNAME ) ;
    public final void rule__Aliass__AliassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:806:1: ( ( RULE_IFCNAME ) )
            // InternalBimmodel.g:807:2: ( RULE_IFCNAME )
            {
            // InternalBimmodel.g:807:2: ( RULE_IFCNAME )
            // InternalBimmodel.g:808:3: RULE_IFCNAME
            {
             before(grammarAccess.getAliassAccess().getAliassIFCNAMETerminalRuleCall_2_0()); 
            match(input,RULE_IFCNAME,FOLLOW_2); 
             after(grammarAccess.getAliassAccess().getAliassIFCNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__AliassAssignment_2"


    // $ANTLR start "rule__Aliass__AliassAssignment_3_1"
    // InternalBimmodel.g:817:1: rule__Aliass__AliassAssignment_3_1 : ( RULE_IFCNAME ) ;
    public final void rule__Aliass__AliassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:821:1: ( ( RULE_IFCNAME ) )
            // InternalBimmodel.g:822:2: ( RULE_IFCNAME )
            {
            // InternalBimmodel.g:822:2: ( RULE_IFCNAME )
            // InternalBimmodel.g:823:3: RULE_IFCNAME
            {
             before(grammarAccess.getAliassAccess().getAliassIFCNAMETerminalRuleCall_3_1_0()); 
            match(input,RULE_IFCNAME,FOLLOW_2); 
             after(grammarAccess.getAliassAccess().getAliassIFCNAMETerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aliass__AliassAssignment_3_1"


    // $ANTLR start "rule__Annotation__AnnotationNameAssignment_2"
    // InternalBimmodel.g:832:1: rule__Annotation__AnnotationNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Annotation__AnnotationNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:836:1: ( ( RULE_ID ) )
            // InternalBimmodel.g:837:2: ( RULE_ID )
            {
            // InternalBimmodel.g:837:2: ( RULE_ID )
            // InternalBimmodel.g:838:3: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getAnnotationNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnotationNameAssignment_2"


    // $ANTLR start "rule__Annotation__AnnodetailAssignment_3"
    // InternalBimmodel.g:847:1: rule__Annotation__AnnodetailAssignment_3 : ( ruleAnnotationDetail ) ;
    public final void rule__Annotation__AnnodetailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:851:1: ( ( ruleAnnotationDetail ) )
            // InternalBimmodel.g:852:2: ( ruleAnnotationDetail )
            {
            // InternalBimmodel.g:852:2: ( ruleAnnotationDetail )
            // InternalBimmodel.g:853:3: ruleAnnotationDetail
            {
             before(grammarAccess.getAnnotationAccess().getAnnodetailAnnotationDetailParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotationDetail();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAnnodetailAnnotationDetailParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnodetailAssignment_3"


    // $ANTLR start "rule__AnnotationDetail__AnnosAssignment_1_0"
    // InternalBimmodel.g:862:1: rule__AnnotationDetail__AnnosAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__AnnotationDetail__AnnosAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:866:1: ( ( RULE_STRING ) )
            // InternalBimmodel.g:867:2: ( RULE_STRING )
            {
            // InternalBimmodel.g:867:2: ( RULE_STRING )
            // InternalBimmodel.g:868:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationDetailAccess().getAnnosSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationDetailAccess().getAnnosSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__AnnosAssignment_1_0"


    // $ANTLR start "rule__AnnotationDetail__AnnosAssignment_2"
    // InternalBimmodel.g:877:1: rule__AnnotationDetail__AnnosAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AnnotationDetail__AnnosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBimmodel.g:881:1: ( ( RULE_STRING ) )
            // InternalBimmodel.g:882:2: ( RULE_STRING )
            {
            // InternalBimmodel.g:882:2: ( RULE_STRING )
            // InternalBimmodel.g:883:3: RULE_STRING
            {
             before(grammarAccess.getAnnotationDetailAccess().getAnnosSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationDetailAccess().getAnnosSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationDetail__AnnosAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});

}