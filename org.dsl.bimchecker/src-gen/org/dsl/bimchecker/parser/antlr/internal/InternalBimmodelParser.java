package org.dsl.bimchecker.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.dsl.bimchecker.services.BimmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBimmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IFCNAME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'alias'", "'='", "'or'", "'annotation'", "':'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=6;
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
    public static final int RULE_IFCNAME=4;
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

        public InternalBimmodelParser(TokenStream input, BimmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Bimmodel";
       	}

       	@Override
       	protected BimmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBimmodel"
    // InternalBimmodel.g:64:1: entryRuleBimmodel returns [EObject current=null] : iv_ruleBimmodel= ruleBimmodel EOF ;
    public final EObject entryRuleBimmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBimmodel = null;


        try {
            // InternalBimmodel.g:64:49: (iv_ruleBimmodel= ruleBimmodel EOF )
            // InternalBimmodel.g:65:2: iv_ruleBimmodel= ruleBimmodel EOF
            {
             newCompositeNode(grammarAccess.getBimmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBimmodel=ruleBimmodel();

            state._fsp--;

             current =iv_ruleBimmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBimmodel"


    // $ANTLR start "ruleBimmodel"
    // InternalBimmodel.g:71:1: ruleBimmodel returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )* ;
    public final EObject ruleBimmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalBimmodel.g:77:2: ( ( (lv_rules_0_0= ruleRule ) )* )
            // InternalBimmodel.g:78:2: ( (lv_rules_0_0= ruleRule ) )*
            {
            // InternalBimmodel.g:78:2: ( (lv_rules_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBimmodel.g:79:3: (lv_rules_0_0= ruleRule )
            	    {
            	    // InternalBimmodel.g:79:3: (lv_rules_0_0= ruleRule )
            	    // InternalBimmodel.g:80:4: lv_rules_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getBimmodelAccess().getRulesRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBimmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rules",
            	    					lv_rules_0_0,
            	    					"org.dsl.bimchecker.Bimmodel.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBimmodel"


    // $ANTLR start "entryRuleRule"
    // InternalBimmodel.g:100:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalBimmodel.g:100:45: (iv_ruleRule= ruleRule EOF )
            // InternalBimmodel.g:101:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalBimmodel.g:107:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleObjectName ) ) otherlv_1= '{' ( (lv_alialist_2_0= ruleAliass ) ) ( (lv_annoinfo_3_0= ruleAnnotation ) )? otherlv_4= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_alialist_2_0 = null;

        EObject lv_annoinfo_3_0 = null;



        	enterRule();

        try {
            // InternalBimmodel.g:113:2: ( ( ( (lv_name_0_0= ruleObjectName ) ) otherlv_1= '{' ( (lv_alialist_2_0= ruleAliass ) ) ( (lv_annoinfo_3_0= ruleAnnotation ) )? otherlv_4= '}' ) )
            // InternalBimmodel.g:114:2: ( ( (lv_name_0_0= ruleObjectName ) ) otherlv_1= '{' ( (lv_alialist_2_0= ruleAliass ) ) ( (lv_annoinfo_3_0= ruleAnnotation ) )? otherlv_4= '}' )
            {
            // InternalBimmodel.g:114:2: ( ( (lv_name_0_0= ruleObjectName ) ) otherlv_1= '{' ( (lv_alialist_2_0= ruleAliass ) ) ( (lv_annoinfo_3_0= ruleAnnotation ) )? otherlv_4= '}' )
            // InternalBimmodel.g:115:3: ( (lv_name_0_0= ruleObjectName ) ) otherlv_1= '{' ( (lv_alialist_2_0= ruleAliass ) ) ( (lv_annoinfo_3_0= ruleAnnotation ) )? otherlv_4= '}'
            {
            // InternalBimmodel.g:115:3: ( (lv_name_0_0= ruleObjectName ) )
            // InternalBimmodel.g:116:4: (lv_name_0_0= ruleObjectName )
            {
            // InternalBimmodel.g:116:4: (lv_name_0_0= ruleObjectName )
            // InternalBimmodel.g:117:5: lv_name_0_0= ruleObjectName
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getNameObjectNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleObjectName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.dsl.bimchecker.Bimmodel.ObjectName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBimmodel.g:138:3: ( (lv_alialist_2_0= ruleAliass ) )
            // InternalBimmodel.g:139:4: (lv_alialist_2_0= ruleAliass )
            {
            // InternalBimmodel.g:139:4: (lv_alialist_2_0= ruleAliass )
            // InternalBimmodel.g:140:5: lv_alialist_2_0= ruleAliass
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getAlialistAliassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_alialist_2_0=ruleAliass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"alialist",
            						lv_alialist_2_0,
            						"org.dsl.bimchecker.Bimmodel.Aliass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBimmodel.g:157:3: ( (lv_annoinfo_3_0= ruleAnnotation ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBimmodel.g:158:4: (lv_annoinfo_3_0= ruleAnnotation )
                    {
                    // InternalBimmodel.g:158:4: (lv_annoinfo_3_0= ruleAnnotation )
                    // InternalBimmodel.g:159:5: lv_annoinfo_3_0= ruleAnnotation
                    {

                    					newCompositeNode(grammarAccess.getRuleAccess().getAnnoinfoAnnotationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_annoinfo_3_0=ruleAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleRule());
                    					}
                    					set(
                    						current,
                    						"annoinfo",
                    						lv_annoinfo_3_0,
                    						"org.dsl.bimchecker.Bimmodel.Annotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAliass"
    // InternalBimmodel.g:184:1: entryRuleAliass returns [EObject current=null] : iv_ruleAliass= ruleAliass EOF ;
    public final EObject entryRuleAliass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliass = null;


        try {
            // InternalBimmodel.g:184:47: (iv_ruleAliass= ruleAliass EOF )
            // InternalBimmodel.g:185:2: iv_ruleAliass= ruleAliass EOF
            {
             newCompositeNode(grammarAccess.getAliassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAliass=ruleAliass();

            state._fsp--;

             current =iv_ruleAliass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliass"


    // $ANTLR start "ruleAliass"
    // InternalBimmodel.g:191:1: ruleAliass returns [EObject current=null] : (otherlv_0= 'alias' otherlv_1= '=' ( (lv_aliass_2_0= RULE_IFCNAME ) ) (otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) ) )* ) ;
    public final EObject ruleAliass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_aliass_2_0=null;
        Token otherlv_3=null;
        Token lv_aliass_4_0=null;


        	enterRule();

        try {
            // InternalBimmodel.g:197:2: ( (otherlv_0= 'alias' otherlv_1= '=' ( (lv_aliass_2_0= RULE_IFCNAME ) ) (otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) ) )* ) )
            // InternalBimmodel.g:198:2: (otherlv_0= 'alias' otherlv_1= '=' ( (lv_aliass_2_0= RULE_IFCNAME ) ) (otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) ) )* )
            {
            // InternalBimmodel.g:198:2: (otherlv_0= 'alias' otherlv_1= '=' ( (lv_aliass_2_0= RULE_IFCNAME ) ) (otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) ) )* )
            // InternalBimmodel.g:199:3: otherlv_0= 'alias' otherlv_1= '=' ( (lv_aliass_2_0= RULE_IFCNAME ) ) (otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAliassAccess().getAliasKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAliassAccess().getEqualsSignKeyword_1());
            		
            // InternalBimmodel.g:207:3: ( (lv_aliass_2_0= RULE_IFCNAME ) )
            // InternalBimmodel.g:208:4: (lv_aliass_2_0= RULE_IFCNAME )
            {
            // InternalBimmodel.g:208:4: (lv_aliass_2_0= RULE_IFCNAME )
            // InternalBimmodel.g:209:5: lv_aliass_2_0= RULE_IFCNAME
            {
            lv_aliass_2_0=(Token)match(input,RULE_IFCNAME,FOLLOW_10); 

            					newLeafNode(lv_aliass_2_0, grammarAccess.getAliassAccess().getAliassIFCNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliassRule());
            					}
            					addWithLastConsumed(
            						current,
            						"aliass",
            						lv_aliass_2_0,
            						"org.dsl.bimchecker.Bimmodel.IFCNAME");
            				

            }


            }

            // InternalBimmodel.g:225:3: (otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBimmodel.g:226:4: otherlv_3= 'or' ( (lv_aliass_4_0= RULE_IFCNAME ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAliassAccess().getOrKeyword_3_0());
            	    			
            	    // InternalBimmodel.g:230:4: ( (lv_aliass_4_0= RULE_IFCNAME ) )
            	    // InternalBimmodel.g:231:5: (lv_aliass_4_0= RULE_IFCNAME )
            	    {
            	    // InternalBimmodel.g:231:5: (lv_aliass_4_0= RULE_IFCNAME )
            	    // InternalBimmodel.g:232:6: lv_aliass_4_0= RULE_IFCNAME
            	    {
            	    lv_aliass_4_0=(Token)match(input,RULE_IFCNAME,FOLLOW_10); 

            	    						newLeafNode(lv_aliass_4_0, grammarAccess.getAliassAccess().getAliassIFCNAMETerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAliassRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"aliass",
            	    							lv_aliass_4_0,
            	    							"org.dsl.bimchecker.Bimmodel.IFCNAME");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliass"


    // $ANTLR start "entryRuleAnnotation"
    // InternalBimmodel.g:253:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalBimmodel.g:253:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalBimmodel.g:254:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalBimmodel.g:260:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= 'annotation' otherlv_1= ':' ( (lv_annotationName_2_0= RULE_ID ) ) ( (lv_annodetail_3_0= ruleAnnotationDetail ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_annotationName_2_0=null;
        EObject lv_annodetail_3_0 = null;



        	enterRule();

        try {
            // InternalBimmodel.g:266:2: ( (otherlv_0= 'annotation' otherlv_1= ':' ( (lv_annotationName_2_0= RULE_ID ) ) ( (lv_annodetail_3_0= ruleAnnotationDetail ) )? ) )
            // InternalBimmodel.g:267:2: (otherlv_0= 'annotation' otherlv_1= ':' ( (lv_annotationName_2_0= RULE_ID ) ) ( (lv_annodetail_3_0= ruleAnnotationDetail ) )? )
            {
            // InternalBimmodel.g:267:2: (otherlv_0= 'annotation' otherlv_1= ':' ( (lv_annotationName_2_0= RULE_ID ) ) ( (lv_annodetail_3_0= ruleAnnotationDetail ) )? )
            // InternalBimmodel.g:268:3: otherlv_0= 'annotation' otherlv_1= ':' ( (lv_annotationName_2_0= RULE_ID ) ) ( (lv_annodetail_3_0= ruleAnnotationDetail ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getAnnotationKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getColonKeyword_1());
            		
            // InternalBimmodel.g:276:3: ( (lv_annotationName_2_0= RULE_ID ) )
            // InternalBimmodel.g:277:4: (lv_annotationName_2_0= RULE_ID )
            {
            // InternalBimmodel.g:277:4: (lv_annotationName_2_0= RULE_ID )
            // InternalBimmodel.g:278:5: lv_annotationName_2_0= RULE_ID
            {
            lv_annotationName_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_annotationName_2_0, grammarAccess.getAnnotationAccess().getAnnotationNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"annotationName",
            						lv_annotationName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBimmodel.g:294:3: ( (lv_annodetail_3_0= ruleAnnotationDetail ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBimmodel.g:295:4: (lv_annodetail_3_0= ruleAnnotationDetail )
                    {
                    // InternalBimmodel.g:295:4: (lv_annodetail_3_0= ruleAnnotationDetail )
                    // InternalBimmodel.g:296:5: lv_annodetail_3_0= ruleAnnotationDetail
                    {

                    					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnodetailAnnotationDetailParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_annodetail_3_0=ruleAnnotationDetail();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    					}
                    					set(
                    						current,
                    						"annodetail",
                    						lv_annodetail_3_0,
                    						"org.dsl.bimchecker.Bimmodel.AnnotationDetail");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationDetail"
    // InternalBimmodel.g:317:1: entryRuleAnnotationDetail returns [EObject current=null] : iv_ruleAnnotationDetail= ruleAnnotationDetail EOF ;
    public final EObject entryRuleAnnotationDetail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationDetail = null;


        try {
            // InternalBimmodel.g:317:57: (iv_ruleAnnotationDetail= ruleAnnotationDetail EOF )
            // InternalBimmodel.g:318:2: iv_ruleAnnotationDetail= ruleAnnotationDetail EOF
            {
             newCompositeNode(grammarAccess.getAnnotationDetailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationDetail=ruleAnnotationDetail();

            state._fsp--;

             current =iv_ruleAnnotationDetail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationDetail"


    // $ANTLR start "ruleAnnotationDetail"
    // InternalBimmodel.g:324:1: ruleAnnotationDetail returns [EObject current=null] : (otherlv_0= '=' ( ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or' )* ( (lv_annos_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotationDetail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_annos_1_0=null;
        Token otherlv_2=null;
        Token lv_annos_3_0=null;


        	enterRule();

        try {
            // InternalBimmodel.g:330:2: ( (otherlv_0= '=' ( ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or' )* ( (lv_annos_3_0= RULE_STRING ) ) ) )
            // InternalBimmodel.g:331:2: (otherlv_0= '=' ( ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or' )* ( (lv_annos_3_0= RULE_STRING ) ) )
            {
            // InternalBimmodel.g:331:2: (otherlv_0= '=' ( ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or' )* ( (lv_annos_3_0= RULE_STRING ) ) )
            // InternalBimmodel.g:332:3: otherlv_0= '=' ( ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or' )* ( (lv_annos_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationDetailAccess().getEqualsSignKeyword_0());
            		
            // InternalBimmodel.g:336:3: ( ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or' )*
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
            	    // InternalBimmodel.g:337:4: ( (lv_annos_1_0= RULE_STRING ) ) otherlv_2= 'or'
            	    {
            	    // InternalBimmodel.g:337:4: ( (lv_annos_1_0= RULE_STRING ) )
            	    // InternalBimmodel.g:338:5: (lv_annos_1_0= RULE_STRING )
            	    {
            	    // InternalBimmodel.g:338:5: (lv_annos_1_0= RULE_STRING )
            	    // InternalBimmodel.g:339:6: lv_annos_1_0= RULE_STRING
            	    {
            	    lv_annos_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    						newLeafNode(lv_annos_1_0, grammarAccess.getAnnotationDetailAccess().getAnnosSTRINGTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAnnotationDetailRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"annos",
            	    							lv_annos_1_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAnnotationDetailAccess().getOrKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalBimmodel.g:360:3: ( (lv_annos_3_0= RULE_STRING ) )
            // InternalBimmodel.g:361:4: (lv_annos_3_0= RULE_STRING )
            {
            // InternalBimmodel.g:361:4: (lv_annos_3_0= RULE_STRING )
            // InternalBimmodel.g:362:5: lv_annos_3_0= RULE_STRING
            {
            lv_annos_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_annos_3_0, grammarAccess.getAnnotationDetailAccess().getAnnosSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnotationDetailRule());
            					}
            					addWithLastConsumed(
            						current,
            						"annos",
            						lv_annos_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationDetail"


    // $ANTLR start "entryRuleObjectName"
    // InternalBimmodel.g:382:1: entryRuleObjectName returns [String current=null] : iv_ruleObjectName= ruleObjectName EOF ;
    public final String entryRuleObjectName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjectName = null;


        try {
            // InternalBimmodel.g:382:50: (iv_ruleObjectName= ruleObjectName EOF )
            // InternalBimmodel.g:383:2: iv_ruleObjectName= ruleObjectName EOF
            {
             newCompositeNode(grammarAccess.getObjectNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectName=ruleObjectName();

            state._fsp--;

             current =iv_ruleObjectName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectName"


    // $ANTLR start "ruleObjectName"
    // InternalBimmodel.g:389:1: ruleObjectName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleObjectName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalBimmodel.g:395:2: (this_STRING_0= RULE_STRING )
            // InternalBimmodel.g:396:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getObjectNameAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});

}