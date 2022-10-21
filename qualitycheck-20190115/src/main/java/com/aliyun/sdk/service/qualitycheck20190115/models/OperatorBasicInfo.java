// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperatorBasicInfo} extends {@link TeaModel}
 *
 * <p>OperatorBasicInfo</p>
 */
public class OperatorBasicInfo extends TeaModel {
    @NameInMap("Id")
    private Long id;

    @NameInMap("Name")
    private String name;

    @NameInMap("Oid")
    private String oid;

    @NameInMap("Param")
    private Param param;

    @NameInMap("QualityCheckType")
    private Integer qualityCheckType;

    @NameInMap("Type")
    private String type;

    @NameInMap("UserGroup")
    private String userGroup;

    private OperatorBasicInfo(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.oid = builder.oid;
        this.param = builder.param;
        this.qualityCheckType = builder.qualityCheckType;
        this.type = builder.type;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperatorBasicInfo create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oid
     */
    public String getOid() {
        return this.oid;
    }

    /**
     * @return param
     */
    public Param getParam() {
        return this.param;
    }

    /**
     * @return qualityCheckType
     */
    public Integer getQualityCheckType() {
        return this.qualityCheckType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userGroup
     */
    public String getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private Long id; 
        private String name; 
        private String oid; 
        private Param param; 
        private Integer qualityCheckType; 
        private String type; 
        private String userGroup; 

        /**
         * 主键id
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * 算子名
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 可能是主键id，也可能是前端生成的id
         */
        public Builder oid(String oid) {
            this.oid = oid;
            return this;
        }

        /**
         * 算子参数
         */
        public Builder param(Param param) {
            this.param = param;
            return this;
        }

        /**
         * 质检类型：0 离线质检，1 实时质检
         */
        public Builder qualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }

        /**
         * 算子类别
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 用户组
         */
        public Builder userGroup(String userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public OperatorBasicInfo build() {
            return new OperatorBasicInfo(this);
        } 

    } 

    public static class Param extends TeaModel {
        @NameInMap("AnswerThreshold")
        private String answerThreshold;

        @NameInMap("AntModelInfo")
        private java.util.Map < String, String > antModelInfo;

        @NameInMap("Average")
        private Boolean average;

        @NameInMap("BeginType")
        private String beginType;

        @NameInMap("BotId")
        private String botId;

        @NameInMap("Case_sensitive")
        private Boolean caseSensitive;

        @NameInMap("CategoryPathCode")
        private String categoryPathCode;

        @NameInMap("CheckFirstSentence")
        private Boolean checkFirstSentence;

        @NameInMap("CheckType")
        private Integer checkType;

        @NameInMap("CompareOperator")
        private String compareOperator;

        @NameInMap("ContextChatMatch")
        private Boolean contextChatMatch;

        @NameInMap("CustomerParam")
        private JudgeNodeMetaDesc customerParam;

        @NameInMap("DelayTime")
        private Integer delayTime;

        @NameInMap("Different_role")
        private Boolean differentRole;

        @NameInMap("EndType")
        private String endType;

        @NameInMap("Excludes")
        private java.util.List < String > excludes;

        @NameInMap("From")
        private Integer from;

        @NameInMap("From_end")
        private Boolean fromEnd;

        @NameInMap("Hit_time")
        private Integer hitTime;

        @NameInMap("In_sentence")
        private Boolean inSentence;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("IntervalEnd")
        private Integer intervalEnd;

        @NameInMap("KeywordExtension")
        private Integer keywordExtension;

        @NameInMap("KeywordMatchSize")
        private Integer keywordMatchSize;

        @NameInMap("Keywords")
        private java.util.List < String > keywords;

        @NameInMap("KnowledgeInfo")
        private String knowledgeInfo;

        @NameInMap("KnowledgeSentenceNum")
        private Integer knowledgeSentenceNum;

        @NameInMap("KnowledgeTargetId")
        private String knowledgeTargetId;

        @NameInMap("KnowledgeTargetName")
        private String knowledgeTargetName;

        @NameInMap("KnowledgeTargetType")
        private Integer knowledgeTargetType;

        @NameInMap("LgfSentences")
        private java.util.List < String > lgfSentences;

        @NameInMap("MaxEmotionChangeValue")
        private Integer maxEmotionChangeValue;

        @NameInMap("MinWordSize")
        private Integer minWordSize;

        @NameInMap("Near_dialogue")
        private Boolean nearDialogue;

        @NameInMap("NotRegex")
        private String notRegex;

        @NameInMap("Phrase")
        private String phrase;

        @NameInMap("Pkey")
        private String pkey;

        @NameInMap("Poutput_type")
        private Integer poutputType;

        @NameInMap("QuestionThreshold")
        private String questionThreshold;

        @NameInMap("References")
        private java.util.List < String > references;

        @NameInMap("Regex")
        private String regex;

        @NameInMap("RoleId")
        private Integer roleId;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("Similarity_threshold")
        private Double similarityThreshold;

        @NameInMap("SimilarlySentences")
        private java.util.List < String > similarlySentences;

        @NameInMap("Synonyms")
        private java.util.Map < String, java.util.List<String>> synonyms;

        @NameInMap("Target")
        private Integer target;

        @NameInMap("Target_role")
        private String targetRole;

        @NameInMap("Threshold")
        private Float threshold;

        @NameInMap("UseEasAlgorithm")
        private Boolean useEasAlgorithm;

        @NameInMap("Velocity")
        private Double velocity;

        @NameInMap("VelocityInMint")
        private Integer velocityInMint;

        private Param(Builder builder) {
            this.answerThreshold = builder.answerThreshold;
            this.antModelInfo = builder.antModelInfo;
            this.average = builder.average;
            this.beginType = builder.beginType;
            this.botId = builder.botId;
            this.caseSensitive = builder.caseSensitive;
            this.categoryPathCode = builder.categoryPathCode;
            this.checkFirstSentence = builder.checkFirstSentence;
            this.checkType = builder.checkType;
            this.compareOperator = builder.compareOperator;
            this.contextChatMatch = builder.contextChatMatch;
            this.customerParam = builder.customerParam;
            this.delayTime = builder.delayTime;
            this.differentRole = builder.differentRole;
            this.endType = builder.endType;
            this.excludes = builder.excludes;
            this.from = builder.from;
            this.fromEnd = builder.fromEnd;
            this.hitTime = builder.hitTime;
            this.inSentence = builder.inSentence;
            this.interval = builder.interval;
            this.intervalEnd = builder.intervalEnd;
            this.keywordExtension = builder.keywordExtension;
            this.keywordMatchSize = builder.keywordMatchSize;
            this.keywords = builder.keywords;
            this.knowledgeInfo = builder.knowledgeInfo;
            this.knowledgeSentenceNum = builder.knowledgeSentenceNum;
            this.knowledgeTargetId = builder.knowledgeTargetId;
            this.knowledgeTargetName = builder.knowledgeTargetName;
            this.knowledgeTargetType = builder.knowledgeTargetType;
            this.lgfSentences = builder.lgfSentences;
            this.maxEmotionChangeValue = builder.maxEmotionChangeValue;
            this.minWordSize = builder.minWordSize;
            this.nearDialogue = builder.nearDialogue;
            this.notRegex = builder.notRegex;
            this.phrase = builder.phrase;
            this.pkey = builder.pkey;
            this.poutputType = builder.poutputType;
            this.questionThreshold = builder.questionThreshold;
            this.references = builder.references;
            this.regex = builder.regex;
            this.roleId = builder.roleId;
            this.score = builder.score;
            this.similarityThreshold = builder.similarityThreshold;
            this.similarlySentences = builder.similarlySentences;
            this.synonyms = builder.synonyms;
            this.target = builder.target;
            this.targetRole = builder.targetRole;
            this.threshold = builder.threshold;
            this.useEasAlgorithm = builder.useEasAlgorithm;
            this.velocity = builder.velocity;
            this.velocityInMint = builder.velocityInMint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return answerThreshold
         */
        public String getAnswerThreshold() {
            return this.answerThreshold;
        }

        /**
         * @return antModelInfo
         */
        public java.util.Map < String, String > getAntModelInfo() {
            return this.antModelInfo;
        }

        /**
         * @return average
         */
        public Boolean getAverage() {
            return this.average;
        }

        /**
         * @return beginType
         */
        public String getBeginType() {
            return this.beginType;
        }

        /**
         * @return botId
         */
        public String getBotId() {
            return this.botId;
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return categoryPathCode
         */
        public String getCategoryPathCode() {
            return this.categoryPathCode;
        }

        /**
         * @return checkFirstSentence
         */
        public Boolean getCheckFirstSentence() {
            return this.checkFirstSentence;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return compareOperator
         */
        public String getCompareOperator() {
            return this.compareOperator;
        }

        /**
         * @return contextChatMatch
         */
        public Boolean getContextChatMatch() {
            return this.contextChatMatch;
        }

        /**
         * @return customerParam
         */
        public JudgeNodeMetaDesc getCustomerParam() {
            return this.customerParam;
        }

        /**
         * @return delayTime
         */
        public Integer getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return differentRole
         */
        public Boolean getDifferentRole() {
            return this.differentRole;
        }

        /**
         * @return endType
         */
        public String getEndType() {
            return this.endType;
        }

        /**
         * @return excludes
         */
        public java.util.List < String > getExcludes() {
            return this.excludes;
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return fromEnd
         */
        public Boolean getFromEnd() {
            return this.fromEnd;
        }

        /**
         * @return hitTime
         */
        public Integer getHitTime() {
            return this.hitTime;
        }

        /**
         * @return inSentence
         */
        public Boolean getInSentence() {
            return this.inSentence;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return intervalEnd
         */
        public Integer getIntervalEnd() {
            return this.intervalEnd;
        }

        /**
         * @return keywordExtension
         */
        public Integer getKeywordExtension() {
            return this.keywordExtension;
        }

        /**
         * @return keywordMatchSize
         */
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
        }

        /**
         * @return keywords
         */
        public java.util.List < String > getKeywords() {
            return this.keywords;
        }

        /**
         * @return knowledgeInfo
         */
        public String getKnowledgeInfo() {
            return this.knowledgeInfo;
        }

        /**
         * @return knowledgeSentenceNum
         */
        public Integer getKnowledgeSentenceNum() {
            return this.knowledgeSentenceNum;
        }

        /**
         * @return knowledgeTargetId
         */
        public String getKnowledgeTargetId() {
            return this.knowledgeTargetId;
        }

        /**
         * @return knowledgeTargetName
         */
        public String getKnowledgeTargetName() {
            return this.knowledgeTargetName;
        }

        /**
         * @return knowledgeTargetType
         */
        public Integer getKnowledgeTargetType() {
            return this.knowledgeTargetType;
        }

        /**
         * @return lgfSentences
         */
        public java.util.List < String > getLgfSentences() {
            return this.lgfSentences;
        }

        /**
         * @return maxEmotionChangeValue
         */
        public Integer getMaxEmotionChangeValue() {
            return this.maxEmotionChangeValue;
        }

        /**
         * @return minWordSize
         */
        public Integer getMinWordSize() {
            return this.minWordSize;
        }

        /**
         * @return nearDialogue
         */
        public Boolean getNearDialogue() {
            return this.nearDialogue;
        }

        /**
         * @return notRegex
         */
        public String getNotRegex() {
            return this.notRegex;
        }

        /**
         * @return phrase
         */
        public String getPhrase() {
            return this.phrase;
        }

        /**
         * @return pkey
         */
        public String getPkey() {
            return this.pkey;
        }

        /**
         * @return poutputType
         */
        public Integer getPoutputType() {
            return this.poutputType;
        }

        /**
         * @return questionThreshold
         */
        public String getQuestionThreshold() {
            return this.questionThreshold;
        }

        /**
         * @return references
         */
        public java.util.List < String > getReferences() {
            return this.references;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        /**
         * @return roleId
         */
        public Integer getRoleId() {
            return this.roleId;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return similarityThreshold
         */
        public Double getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        /**
         * @return similarlySentences
         */
        public java.util.List < String > getSimilarlySentences() {
            return this.similarlySentences;
        }

        /**
         * @return synonyms
         */
        public java.util.Map < String, java.util.List<String>> getSynonyms() {
            return this.synonyms;
        }

        /**
         * @return target
         */
        public Integer getTarget() {
            return this.target;
        }

        /**
         * @return targetRole
         */
        public String getTargetRole() {
            return this.targetRole;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return useEasAlgorithm
         */
        public Boolean getUseEasAlgorithm() {
            return this.useEasAlgorithm;
        }

        /**
         * @return velocity
         */
        public Double getVelocity() {
            return this.velocity;
        }

        /**
         * @return velocityInMint
         */
        public Integer getVelocityInMint() {
            return this.velocityInMint;
        }

        public static final class Builder {
            private String answerThreshold; 
            private java.util.Map < String, String > antModelInfo; 
            private Boolean average; 
            private String beginType; 
            private String botId; 
            private Boolean caseSensitive; 
            private String categoryPathCode; 
            private Boolean checkFirstSentence; 
            private Integer checkType; 
            private String compareOperator; 
            private Boolean contextChatMatch; 
            private JudgeNodeMetaDesc customerParam; 
            private Integer delayTime; 
            private Boolean differentRole; 
            private String endType; 
            private java.util.List < String > excludes; 
            private Integer from; 
            private Boolean fromEnd; 
            private Integer hitTime; 
            private Boolean inSentence; 
            private Integer interval; 
            private Integer intervalEnd; 
            private Integer keywordExtension; 
            private Integer keywordMatchSize; 
            private java.util.List < String > keywords; 
            private String knowledgeInfo; 
            private Integer knowledgeSentenceNum; 
            private String knowledgeTargetId; 
            private String knowledgeTargetName; 
            private Integer knowledgeTargetType; 
            private java.util.List < String > lgfSentences; 
            private Integer maxEmotionChangeValue; 
            private Integer minWordSize; 
            private Boolean nearDialogue; 
            private String notRegex; 
            private String phrase; 
            private String pkey; 
            private Integer poutputType; 
            private String questionThreshold; 
            private java.util.List < String > references; 
            private String regex; 
            private Integer roleId; 
            private Integer score; 
            private Double similarityThreshold; 
            private java.util.List < String > similarlySentences; 
            private java.util.Map < String, java.util.List<String>> synonyms; 
            private Integer target; 
            private String targetRole; 
            private Float threshold; 
            private Boolean useEasAlgorithm; 
            private Double velocity; 
            private Integer velocityInMint; 

            /**
             * 答案命中阈值
             */
            public Builder answerThreshold(String answerThreshold) {
                this.answerThreshold = answerThreshold;
                return this;
            }

            /**
             * 蚂蚁模型信息
             */
            public Builder antModelInfo(java.util.Map < String, String > antModelInfo) {
                this.antModelInfo = antModelInfo;
                return this;
            }

            /**
             * 语速检测，是否计算整个对话平均语速，默认false
             */
            public Builder average(Boolean average) {
                this.average = average;
                return this;
            }

            /**
             * 时长算子，时长计算开始类型，录音开始，还是某句对话开始
             */
            public Builder beginType(String beginType) {
                this.beginType = beginType;
                return this;
            }

            /**
             * 机器人id
             */
            public Builder botId(String botId) {
                this.botId = botId;
                return this;
            }

            /**
             * 区分大小写
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * 知识类目路径
             */
            public Builder categoryPathCode(String categoryPathCode) {
                this.categoryPathCode = categoryPathCode;
                return this;
            }

            /**
             * 静音检测：要不要检测第一句话
             */
            public Builder checkFirstSentence(Boolean checkFirstSentence) {
                this.checkFirstSentence = checkFirstSentence;
                return this;
            }

            /**
             * 检测方式，1 相邻句能量波动 2 最大能量跨度 默认1
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * 大于，还是小于，gt/lt
             */
            public Builder compareOperator(String compareOperator) {
                this.compareOperator = compareOperator;
                return this;
            }

            /**
             * 是否单句话匹配；
             */
            public Builder contextChatMatch(Boolean contextChatMatch) {
                this.contextChatMatch = contextChatMatch;
                return this;
            }

            /**
             * 随录参数算子参数
             */
            public Builder customerParam(JudgeNodeMetaDesc customerParam) {
                this.customerParam = customerParam;
                return this;
            }

            /**
             * 抢话算子 延时时长
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * different_role
             */
            public Builder differentRole(Boolean differentRole) {
                this.differentRole = differentRole;
                return this;
            }

            /**
             * 时长算子，时长计算结束类型，录音结束，还是某句对话结束
             */
            public Builder endType(String endType) {
                this.endType = endType;
                return this;
            }

            /**
             * 上下文重复算子：排除掉某些对话
             */
            public Builder excludes(java.util.List < String > excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * 上下文重复算子：检测当前句的前from句是否有重复；0表示前面的所有句
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * from_end
             */
            public Builder fromEnd(Boolean fromEnd) {
                this.fromEnd = fromEnd;
                return this;
            }

            /**
             * 上下文重复算子：重复几次
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * 生效句子， true单个句子，false多个句子
             */
            public Builder inSentence(Boolean inSentence) {
                this.inSentence = inSentence;
                return this;
            }

            /**
             * interval代表区间范围开始
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * intervalEnd 代表区间范围结束
             */
            public Builder intervalEnd(Integer intervalEnd) {
                this.intervalEnd = intervalEnd;
                return this;
            }

            /**
             * 关键字扩展
             */
            public Builder keywordExtension(Integer keywordExtension) {
                this.keywordExtension = keywordExtension;
                return this;
            }

            /**
             * 匹配到的关键字数量
             */
            public Builder keywordMatchSize(Integer keywordMatchSize) {
                this.keywordMatchSize = keywordMatchSize;
                return this;
            }

            /**
             * 关键词
             */
            public Builder keywords(java.util.List < String > keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * 知识信息
             */
            public Builder knowledgeInfo(String knowledgeInfo) {
                this.knowledgeInfo = knowledgeInfo;
                return this;
            }

            /**
             * 命中问题后几句内检测答案
             */
            public Builder knowledgeSentenceNum(Integer knowledgeSentenceNum) {
                this.knowledgeSentenceNum = knowledgeSentenceNum;
                return this;
            }

            /**
             * 知识类目或者知识Id
             */
            public Builder knowledgeTargetId(String knowledgeTargetId) {
                this.knowledgeTargetId = knowledgeTargetId;
                return this;
            }

            /**
             * 知识类目名字或知识名字
             */
            public Builder knowledgeTargetName(String knowledgeTargetName) {
                this.knowledgeTargetName = knowledgeTargetName;
                return this;
            }

            /**
             * 0-类目 1-知识
             */
            public Builder knowledgeTargetType(Integer knowledgeTargetType) {
                this.knowledgeTargetType = knowledgeTargetType;
                return this;
            }

            /**
             * lgf句子
             */
            public Builder lgfSentences(java.util.List < String > lgfSentences) {
                this.lgfSentences = lgfSentences;
                return this;
            }

            /**
             * 能量值变化，默认3, 1~9
             */
            public Builder maxEmotionChangeValue(Integer maxEmotionChangeValue) {
                this.maxEmotionChangeValue = maxEmotionChangeValue;
                return this;
            }

            /**
             * 句子中最少字数，小于此字数的句子不检查
             */
            public Builder minWordSize(Integer minWordSize) {
                this.minWordSize = minWordSize;
                return this;
            }

            /**
             * true表示取不同角色相邻的两句话，false表示取不同角色的第一句话比较响应时间（默认）
             */
            public Builder nearDialogue(Boolean nearDialogue) {
                this.nearDialogue = nearDialogue;
                return this;
            }

            /**
             * 排除的正则表达式
             */
            public Builder notRegex(String notRegex) {
                this.notRegex = notRegex;
                return this;
            }

            /**
             * 语句
             */
            public Builder phrase(String phrase) {
                this.phrase = phrase;
                return this;
            }

            /**
             * 涉外属性需要的变量
             */
            public Builder pkey(String pkey) {
                this.pkey = pkey;
                return this;
            }

            /**
             * poutput类型
             */
            public Builder poutputType(Integer poutputType) {
                this.poutputType = poutputType;
                return this;
            }

            /**
             * 问题命中阈值
             */
            public Builder questionThreshold(String questionThreshold) {
                this.questionThreshold = questionThreshold;
                return this;
            }

            /**
             * references引用
             */
            public Builder references(java.util.List < String > references) {
                this.references = references;
                return this;
            }

            /**
             * 正则表达式
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            /**
             * 算子中使用角色，目前用于上下文重复算子，与target_role一起使用。
             */
            public Builder roleId(Integer roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * 分数
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * 相似度阈值
             */
            public Builder similarityThreshold(Double similarityThreshold) {
                this.similarityThreshold = similarityThreshold;
                return this;
            }

            /**
             * 相识问
             */
            public Builder similarlySentences(java.util.List < String > similarlySentences) {
                this.similarlySentences = similarlySentences;
                return this;
            }

            /**
             * 同义词
             */
            public Builder synonyms(java.util.Map < String, java.util.List<String>> synonyms) {
                this.synonyms = synonyms;
                return this;
            }

            /**
             * target
             */
            public Builder target(Integer target) {
                this.target = target;
                return this;
            }

            /**
             * target_role
             */
            public Builder targetRole(String targetRole) {
                this.targetRole = targetRole;
                return this;
            }

            /**
             * 阈值
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * 使用eas算法
             */
            public Builder useEasAlgorithm(Boolean useEasAlgorithm) {
                this.useEasAlgorithm = useEasAlgorithm;
                return this;
            }

            /**
             * 速度
             */
            public Builder velocity(Double velocity) {
                this.velocity = velocity;
                return this;
            }

            /**
             * velocityInMint
             */
            public Builder velocityInMint(Integer velocityInMint) {
                this.velocityInMint = velocityInMint;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
