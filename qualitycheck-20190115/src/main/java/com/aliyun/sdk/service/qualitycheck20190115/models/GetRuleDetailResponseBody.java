// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleDetailResponseBody</p>
 */
public class GetRuleDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRuleDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRuleDetailResponseBody build() {
            return new GetRuleDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Anchor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorCid")
        private String anchorCid;

        @com.aliyun.core.annotation.NameInMap("HitTime")
        private Integer hitTime;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        private Anchor(Builder builder) {
            this.anchorCid = builder.anchorCid;
            this.hitTime = builder.hitTime;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Anchor create() {
            return builder().build();
        }

        /**
         * @return anchorCid
         */
        public String getAnchorCid() {
            return this.anchorCid;
        }

        /**
         * @return hitTime
         */
        public Integer getHitTime() {
            return this.hitTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String anchorCid; 
            private Integer hitTime; 
            private String location; 

            /**
             * AnchorCid.
             */
            public Builder anchorCid(String anchorCid) {
                this.anchorCid = anchorCid;
                return this;
            }

            /**
             * HitTime.
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public Anchor build() {
                return new Anchor(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        private Range(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        public static final class Builder {
            private Integer from; 
            private Integer to; 

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class CheckRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Absolute")
        private Boolean absolute;

        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Anchor anchor;

        @com.aliyun.core.annotation.NameInMap("Range")
        private Range range;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private CheckRange(Builder builder) {
            this.absolute = builder.absolute;
            this.anchor = builder.anchor;
            this.range = builder.range;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRange create() {
            return builder().build();
        }

        /**
         * @return absolute
         */
        public Boolean getAbsolute() {
            return this.absolute;
        }

        /**
         * @return anchor
         */
        public Anchor getAnchor() {
            return this.anchor;
        }

        /**
         * @return range
         */
        public Range getRange() {
            return this.range;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private Boolean absolute; 
            private Anchor anchor; 
            private Range range; 
            private String role; 

            /**
             * Absolute.
             */
            public Builder absolute(Boolean absolute) {
                this.absolute = absolute;
                return this;
            }

            /**
             * Anchor.
             */
            public Builder anchor(Anchor anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public CheckRange build() {
                return new CheckRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class AntModelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntModelInfo")
        private java.util.List < String > antModelInfo;

        private AntModelInfo(Builder builder) {
            this.antModelInfo = builder.antModelInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AntModelInfo create() {
            return builder().build();
        }

        /**
         * @return antModelInfo
         */
        public java.util.List < String > getAntModelInfo() {
            return this.antModelInfo;
        }

        public static final class Builder {
            private java.util.List < String > antModelInfo; 

            /**
             * AntModelInfo.
             */
            public Builder antModelInfo(java.util.List < String > antModelInfo) {
                this.antModelInfo = antModelInfo;
                return this;
            }

            public AntModelInfo build() {
                return new AntModelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Excludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Excludes")
        private java.util.List < String > excludes;

        private Excludes(Builder builder) {
            this.excludes = builder.excludes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Excludes create() {
            return builder().build();
        }

        /**
         * @return excludes
         */
        public java.util.List < String > getExcludes() {
            return this.excludes;
        }

        public static final class Builder {
            private java.util.List < String > excludes; 

            /**
             * Excludes.
             */
            public Builder excludes(java.util.List < String > excludes) {
                this.excludes = excludes;
                return this;
            }

            public Excludes build() {
                return new Excludes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class OperKeyWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperKeyWord")
        private java.util.List < String > operKeyWord;

        private OperKeyWords(Builder builder) {
            this.operKeyWord = builder.operKeyWord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperKeyWords create() {
            return builder().build();
        }

        /**
         * @return operKeyWord
         */
        public java.util.List < String > getOperKeyWord() {
            return this.operKeyWord;
        }

        public static final class Builder {
            private java.util.List < String > operKeyWord; 

            /**
             * OperKeyWord.
             */
            public Builder operKeyWord(java.util.List < String > operKeyWord) {
                this.operKeyWord = operKeyWord;
                return this;
            }

            public OperKeyWords build() {
                return new OperKeyWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Pvalues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pvalues")
        private java.util.List < String > pvalues;

        private Pvalues(Builder builder) {
            this.pvalues = builder.pvalues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pvalues create() {
            return builder().build();
        }

        /**
         * @return pvalues
         */
        public java.util.List < String > getPvalues() {
            return this.pvalues;
        }

        public static final class Builder {
            private java.util.List < String > pvalues; 

            /**
             * Pvalues.
             */
            public Builder pvalues(java.util.List < String > pvalues) {
                this.pvalues = pvalues;
                return this;
            }

            public Pvalues build() {
                return new Pvalues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class References extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reference")
        private java.util.List < String > reference;

        private References(Builder builder) {
            this.reference = builder.reference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static References create() {
            return builder().build();
        }

        /**
         * @return reference
         */
        public java.util.List < String > getReference() {
            return this.reference;
        }

        public static final class Builder {
            private java.util.List < String > reference; 

            /**
             * Reference.
             */
            public Builder reference(java.util.List < String > reference) {
                this.reference = reference;
                return this;
            }

            public References build() {
                return new References(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class SimilarlySentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimilarlySentence")
        private java.util.List < String > similarlySentence;

        private SimilarlySentences(Builder builder) {
            this.similarlySentence = builder.similarlySentence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarlySentences create() {
            return builder().build();
        }

        /**
         * @return similarlySentence
         */
        public java.util.List < String > getSimilarlySentence() {
            return this.similarlySentence;
        }

        public static final class Builder {
            private java.util.List < String > similarlySentence; 

            /**
             * SimilarlySentence.
             */
            public Builder similarlySentence(java.util.List < String > similarlySentence) {
                this.similarlySentence = similarlySentence;
                return this;
            }

            public SimilarlySentences build() {
                return new SimilarlySentences(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntModelInfo")
        private AntModelInfo antModelInfo;

        @com.aliyun.core.annotation.NameInMap("Average")
        private Boolean average;

        @com.aliyun.core.annotation.NameInMap("BeginType")
        private String beginType;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("CompareOperator")
        private String compareOperator;

        @com.aliyun.core.annotation.NameInMap("ContextChatMatch")
        private Boolean contextChatMatch;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Integer delayTime;

        @com.aliyun.core.annotation.NameInMap("DifferentRole")
        private Boolean differentRole;

        @com.aliyun.core.annotation.NameInMap("Excludes")
        private Excludes excludes;

        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("FromEnd")
        private Boolean fromEnd;

        @com.aliyun.core.annotation.NameInMap("HitTime")
        private Integer hitTime;

        @com.aliyun.core.annotation.NameInMap("InSentence")
        private Boolean inSentence;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("KeywordExtension")
        private Boolean keywordExtension;

        @com.aliyun.core.annotation.NameInMap("KeywordMatchSize")
        private Integer keywordMatchSize;

        @com.aliyun.core.annotation.NameInMap("MaxEmotionChangeValue")
        private Integer maxEmotionChangeValue;

        @com.aliyun.core.annotation.NameInMap("MinWordSize")
        private Integer minWordSize;

        @com.aliyun.core.annotation.NameInMap("NotRegex")
        private String notRegex;

        @com.aliyun.core.annotation.NameInMap("OperKeyWords")
        private OperKeyWords operKeyWords;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private String phrase;

        @com.aliyun.core.annotation.NameInMap("Pvalues")
        private Pvalues pvalues;

        @com.aliyun.core.annotation.NameInMap("References")
        private References references;

        @com.aliyun.core.annotation.NameInMap("Regex")
        private String regex;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Similarity_threshold")
        private Float similarityThreshold;

        @com.aliyun.core.annotation.NameInMap("SimilarlySentences")
        private SimilarlySentences similarlySentences;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Integer target;

        @com.aliyun.core.annotation.NameInMap("TargetRole")
        private String targetRole;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("VelocityInMint")
        private Integer velocityInMint;

        private Param(Builder builder) {
            this.antModelInfo = builder.antModelInfo;
            this.average = builder.average;
            this.beginType = builder.beginType;
            this.checkType = builder.checkType;
            this.compareOperator = builder.compareOperator;
            this.contextChatMatch = builder.contextChatMatch;
            this.delayTime = builder.delayTime;
            this.differentRole = builder.differentRole;
            this.excludes = builder.excludes;
            this.from = builder.from;
            this.fromEnd = builder.fromEnd;
            this.hitTime = builder.hitTime;
            this.inSentence = builder.inSentence;
            this.interval = builder.interval;
            this.keywordExtension = builder.keywordExtension;
            this.keywordMatchSize = builder.keywordMatchSize;
            this.maxEmotionChangeValue = builder.maxEmotionChangeValue;
            this.minWordSize = builder.minWordSize;
            this.notRegex = builder.notRegex;
            this.operKeyWords = builder.operKeyWords;
            this.phrase = builder.phrase;
            this.pvalues = builder.pvalues;
            this.references = builder.references;
            this.regex = builder.regex;
            this.score = builder.score;
            this.similarityThreshold = builder.similarityThreshold;
            this.similarlySentences = builder.similarlySentences;
            this.target = builder.target;
            this.targetRole = builder.targetRole;
            this.threshold = builder.threshold;
            this.velocityInMint = builder.velocityInMint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return antModelInfo
         */
        public AntModelInfo getAntModelInfo() {
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
         * @return excludes
         */
        public Excludes getExcludes() {
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
         * @return keywordExtension
         */
        public Boolean getKeywordExtension() {
            return this.keywordExtension;
        }

        /**
         * @return keywordMatchSize
         */
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
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
         * @return notRegex
         */
        public String getNotRegex() {
            return this.notRegex;
        }

        /**
         * @return operKeyWords
         */
        public OperKeyWords getOperKeyWords() {
            return this.operKeyWords;
        }

        /**
         * @return phrase
         */
        public String getPhrase() {
            return this.phrase;
        }

        /**
         * @return pvalues
         */
        public Pvalues getPvalues() {
            return this.pvalues;
        }

        /**
         * @return references
         */
        public References getReferences() {
            return this.references;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
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
        public Float getSimilarityThreshold() {
            return this.similarityThreshold;
        }

        /**
         * @return similarlySentences
         */
        public SimilarlySentences getSimilarlySentences() {
            return this.similarlySentences;
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
         * @return velocityInMint
         */
        public Integer getVelocityInMint() {
            return this.velocityInMint;
        }

        public static final class Builder {
            private AntModelInfo antModelInfo; 
            private Boolean average; 
            private String beginType; 
            private Integer checkType; 
            private String compareOperator; 
            private Boolean contextChatMatch; 
            private Integer delayTime; 
            private Boolean differentRole; 
            private Excludes excludes; 
            private Integer from; 
            private Boolean fromEnd; 
            private Integer hitTime; 
            private Boolean inSentence; 
            private Integer interval; 
            private Boolean keywordExtension; 
            private Integer keywordMatchSize; 
            private Integer maxEmotionChangeValue; 
            private Integer minWordSize; 
            private String notRegex; 
            private OperKeyWords operKeyWords; 
            private String phrase; 
            private Pvalues pvalues; 
            private References references; 
            private String regex; 
            private Integer score; 
            private Float similarityThreshold; 
            private SimilarlySentences similarlySentences; 
            private Integer target; 
            private String targetRole; 
            private Float threshold; 
            private Integer velocityInMint; 

            /**
             * AntModelInfo.
             */
            public Builder antModelInfo(AntModelInfo antModelInfo) {
                this.antModelInfo = antModelInfo;
                return this;
            }

            /**
             * Average.
             */
            public Builder average(Boolean average) {
                this.average = average;
                return this;
            }

            /**
             * BeginType.
             */
            public Builder beginType(String beginType) {
                this.beginType = beginType;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * CompareOperator.
             */
            public Builder compareOperator(String compareOperator) {
                this.compareOperator = compareOperator;
                return this;
            }

            /**
             * ContextChatMatch.
             */
            public Builder contextChatMatch(Boolean contextChatMatch) {
                this.contextChatMatch = contextChatMatch;
                return this;
            }

            /**
             * DelayTime.
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * DifferentRole.
             */
            public Builder differentRole(Boolean differentRole) {
                this.differentRole = differentRole;
                return this;
            }

            /**
             * Excludes.
             */
            public Builder excludes(Excludes excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * FromEnd.
             */
            public Builder fromEnd(Boolean fromEnd) {
                this.fromEnd = fromEnd;
                return this;
            }

            /**
             * HitTime.
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * InSentence.
             */
            public Builder inSentence(Boolean inSentence) {
                this.inSentence = inSentence;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * KeywordExtension.
             */
            public Builder keywordExtension(Boolean keywordExtension) {
                this.keywordExtension = keywordExtension;
                return this;
            }

            /**
             * KeywordMatchSize.
             */
            public Builder keywordMatchSize(Integer keywordMatchSize) {
                this.keywordMatchSize = keywordMatchSize;
                return this;
            }

            /**
             * MaxEmotionChangeValue.
             */
            public Builder maxEmotionChangeValue(Integer maxEmotionChangeValue) {
                this.maxEmotionChangeValue = maxEmotionChangeValue;
                return this;
            }

            /**
             * MinWordSize.
             */
            public Builder minWordSize(Integer minWordSize) {
                this.minWordSize = minWordSize;
                return this;
            }

            /**
             * NotRegex.
             */
            public Builder notRegex(String notRegex) {
                this.notRegex = notRegex;
                return this;
            }

            /**
             * OperKeyWords.
             */
            public Builder operKeyWords(OperKeyWords operKeyWords) {
                this.operKeyWords = operKeyWords;
                return this;
            }

            /**
             * Phrase.
             */
            public Builder phrase(String phrase) {
                this.phrase = phrase;
                return this;
            }

            /**
             * Pvalues.
             */
            public Builder pvalues(Pvalues pvalues) {
                this.pvalues = pvalues;
                return this;
            }

            /**
             * References.
             */
            public Builder references(References references) {
                this.references = references;
                return this;
            }

            /**
             * Regex.
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * Similarity_threshold.
             */
            public Builder similarityThreshold(Float similarityThreshold) {
                this.similarityThreshold = similarityThreshold;
                return this;
            }

            /**
             * SimilarlySentences.
             */
            public Builder similarlySentences(SimilarlySentences similarlySentences) {
                this.similarlySentences = similarlySentences;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Integer target) {
                this.target = target;
                return this;
            }

            /**
             * TargetRole.
             */
            public Builder targetRole(String targetRole) {
                this.targetRole = targetRole;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * VelocityInMint.
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
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class OperatorBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Oid")
        private String oid;

        @com.aliyun.core.annotation.NameInMap("OperName")
        private String operName;

        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private OperatorBasicInfo(Builder builder) {
            this.oid = builder.oid;
            this.operName = builder.operName;
            this.param = builder.param;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatorBasicInfo create() {
            return builder().build();
        }

        /**
         * @return oid
         */
        public String getOid() {
            return this.oid;
        }

        /**
         * @return operName
         */
        public String getOperName() {
            return this.operName;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String oid; 
            private String operName; 
            private Param param; 
            private String type; 

            /**
             * Oid.
             */
            public Builder oid(String oid) {
                this.oid = oid;
                return this;
            }

            /**
             * OperName.
             */
            public Builder operName(String operName) {
                this.operName = operName;
                return this;
            }

            /**
             * Param.
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OperatorBasicInfo build() {
                return new OperatorBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperatorBasicInfo")
        private java.util.List < OperatorBasicInfo> operatorBasicInfo;

        private Operators(Builder builder) {
            this.operatorBasicInfo = builder.operatorBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operators create() {
            return builder().build();
        }

        /**
         * @return operatorBasicInfo
         */
        public java.util.List < OperatorBasicInfo> getOperatorBasicInfo() {
            return this.operatorBasicInfo;
        }

        public static final class Builder {
            private java.util.List < OperatorBasicInfo> operatorBasicInfo; 

            /**
             * OperatorBasicInfo.
             */
            public Builder operatorBasicInfo(java.util.List < OperatorBasicInfo> operatorBasicInfo) {
                this.operatorBasicInfo = operatorBasicInfo;
                return this;
            }

            public Operators build() {
                return new Operators(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class ConditionBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckRange")
        private CheckRange checkRange;

        @com.aliyun.core.annotation.NameInMap("ConditionInfoCid")
        private String conditionInfoCid;

        @com.aliyun.core.annotation.NameInMap("OperLambda")
        private String operLambda;

        @com.aliyun.core.annotation.NameInMap("Operators")
        private Operators operators;

        private ConditionBasicInfo(Builder builder) {
            this.checkRange = builder.checkRange;
            this.conditionInfoCid = builder.conditionInfoCid;
            this.operLambda = builder.operLambda;
            this.operators = builder.operators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionBasicInfo create() {
            return builder().build();
        }

        /**
         * @return checkRange
         */
        public CheckRange getCheckRange() {
            return this.checkRange;
        }

        /**
         * @return conditionInfoCid
         */
        public String getConditionInfoCid() {
            return this.conditionInfoCid;
        }

        /**
         * @return operLambda
         */
        public String getOperLambda() {
            return this.operLambda;
        }

        /**
         * @return operators
         */
        public Operators getOperators() {
            return this.operators;
        }

        public static final class Builder {
            private CheckRange checkRange; 
            private String conditionInfoCid; 
            private String operLambda; 
            private Operators operators; 

            /**
             * CheckRange.
             */
            public Builder checkRange(CheckRange checkRange) {
                this.checkRange = checkRange;
                return this;
            }

            /**
             * ConditionInfoCid.
             */
            public Builder conditionInfoCid(String conditionInfoCid) {
                this.conditionInfoCid = conditionInfoCid;
                return this;
            }

            /**
             * OperLambda.
             */
            public Builder operLambda(String operLambda) {
                this.operLambda = operLambda;
                return this;
            }

            /**
             * Operators.
             */
            public Builder operators(Operators operators) {
                this.operators = operators;
                return this;
            }

            public ConditionBasicInfo build() {
                return new ConditionBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionBasicInfo")
        private java.util.List < ConditionBasicInfo> conditionBasicInfo;

        private Conditions(Builder builder) {
            this.conditionBasicInfo = builder.conditionBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return conditionBasicInfo
         */
        public java.util.List < ConditionBasicInfo> getConditionBasicInfo() {
            return this.conditionBasicInfo;
        }

        public static final class Builder {
            private java.util.List < ConditionBasicInfo> conditionBasicInfo; 

            /**
             * ConditionBasicInfo.
             */
            public Builder conditionBasicInfo(java.util.List < ConditionBasicInfo> conditionBasicInfo) {
                this.conditionBasicInfo = conditionBasicInfo;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class BusinessCategoryBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bid")
        private Integer bid;

        @com.aliyun.core.annotation.NameInMap("BusinessName")
        private String businessName;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private Integer serviceType;

        private BusinessCategoryBasicInfo(Builder builder) {
            this.bid = builder.bid;
            this.businessName = builder.businessName;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessCategoryBasicInfo create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public Integer getBid() {
            return this.bid;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return serviceType
         */
        public Integer getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private Integer bid; 
            private String businessName; 
            private Integer serviceType; 

            /**
             * Bid.
             */
            public Builder bid(Integer bid) {
                this.bid = bid;
                return this;
            }

            /**
             * BusinessName.
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(Integer serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public BusinessCategoryBasicInfo build() {
                return new BusinessCategoryBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class BusinessCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessCategoryBasicInfo")
        private java.util.List < BusinessCategoryBasicInfo> businessCategoryBasicInfo;

        private BusinessCategories(Builder builder) {
            this.businessCategoryBasicInfo = builder.businessCategoryBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessCategories create() {
            return builder().build();
        }

        /**
         * @return businessCategoryBasicInfo
         */
        public java.util.List < BusinessCategoryBasicInfo> getBusinessCategoryBasicInfo() {
            return this.businessCategoryBasicInfo;
        }

        public static final class Builder {
            private java.util.List < BusinessCategoryBasicInfo> businessCategoryBasicInfo; 

            /**
             * BusinessCategoryBasicInfo.
             */
            public Builder businessCategoryBasicInfo(java.util.List < BusinessCategoryBasicInfo> businessCategoryBasicInfo) {
                this.businessCategoryBasicInfo = businessCategoryBasicInfo;
                return this;
            }

            public BusinessCategories build() {
                return new BusinessCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Triggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Trigger")
        private java.util.List < String > trigger;

        private Triggers(Builder builder) {
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return trigger
         */
        public java.util.List < String > getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private java.util.List < String > trigger; 

            /**
             * Trigger.
             */
            public Builder trigger(java.util.List < String > trigger) {
                this.trigger = trigger;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class RuleBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessCategories")
        private BusinessCategories businessCategories;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("RuleLambda")
        private String ruleLambda;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private Triggers triggers;

        private RuleBasicInfo(Builder builder) {
            this.businessCategories = builder.businessCategories;
            this.rid = builder.rid;
            this.ruleLambda = builder.ruleLambda;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleBasicInfo create() {
            return builder().build();
        }

        /**
         * @return businessCategories
         */
        public BusinessCategories getBusinessCategories() {
            return this.businessCategories;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return ruleLambda
         */
        public String getRuleLambda() {
            return this.ruleLambda;
        }

        /**
         * @return triggers
         */
        public Triggers getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private BusinessCategories businessCategories; 
            private String rid; 
            private String ruleLambda; 
            private Triggers triggers; 

            /**
             * BusinessCategories.
             */
            public Builder businessCategories(BusinessCategories businessCategories) {
                this.businessCategories = businessCategories;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * RuleLambda.
             */
            public Builder ruleLambda(String ruleLambda) {
                this.ruleLambda = ruleLambda;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(Triggers triggers) {
                this.triggers = triggers;
                return this;
            }

            public RuleBasicInfo build() {
                return new RuleBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleBasicInfo")
        private java.util.List < RuleBasicInfo> ruleBasicInfo;

        private Rules(Builder builder) {
            this.ruleBasicInfo = builder.ruleBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return ruleBasicInfo
         */
        public java.util.List < RuleBasicInfo> getRuleBasicInfo() {
            return this.ruleBasicInfo;
        }

        public static final class Builder {
            private java.util.List < RuleBasicInfo> ruleBasicInfo; 

            /**
             * RuleBasicInfo.
             */
            public Builder ruleBasicInfo(java.util.List < RuleBasicInfo> ruleBasicInfo) {
                this.ruleBasicInfo = ruleBasicInfo;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private Conditions conditions;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        private Data(Builder builder) {
            this.conditions = builder.conditions;
            this.count = builder.count;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public Conditions getConditions() {
            return this.conditions;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Conditions conditions; 
            private Integer count; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Rules rules; 

            /**
             * Conditions.
             */
            public Builder conditions(Conditions conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
