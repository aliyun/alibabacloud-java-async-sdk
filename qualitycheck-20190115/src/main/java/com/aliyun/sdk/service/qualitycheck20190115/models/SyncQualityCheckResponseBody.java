// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SyncQualityCheckResponseBody</p>
 */
public class SyncQualityCheckResponseBody extends TeaModel {
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

    private SyncQualityCheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncQualityCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SyncQualityCheckResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Result status code. 200 indicates success. Other values indicate failure. The caller can determine the reason for failure using this field.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned result, including hit information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error details if an error occurs. &quot;successful&quot; if successful.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Unique request identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>66E1ACB8-17B2-4BE8-8581-954A8*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. The caller can use this field to determine if the request succeeded: true for success; false/null for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SyncQualityCheckResponseBody build() {
            return new SyncQualityCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SyncQualityCheckResponseBody</p>
     */
    public static class HitKeyWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private Integer cid;

        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        @com.aliyun.core.annotation.NameInMap("Val")
        private String val;

        private HitKeyWords(Builder builder) {
            this.cid = builder.cid;
            this.from = builder.from;
            this.pid = builder.pid;
            this.to = builder.to;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitKeyWords create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public Integer getCid() {
            return this.cid;
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        /**
         * @return val
         */
        public String getVal() {
            return this.val;
        }

        public static final class Builder {
            private Integer cid; 
            private Integer from; 
            private Integer pid; 
            private Integer to; 
            private String val; 

            private Builder() {
            } 

            private Builder(HitKeyWords model) {
                this.cid = model.cid;
                this.from = model.from;
                this.pid = model.pid;
                this.to = model.to;
                this.val = model.val;
            } 

            /**
             * <p>Condition ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2312</p>
             */
            public Builder cid(Integer cid) {
                this.cid = cid;
                return this;
            }

            /**
             * <p>Start position of the keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * <p>Index value of the hit sentence in the entire conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>End position of the keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            /**
             * <p>Keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>你好</p>
             */
            public Builder val(String val) {
                this.val = val;
                return this;
            }

            public HitKeyWords build() {
                return new HitKeyWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SyncQualityCheckResponseBody</p>
     */
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Integer silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Phrase(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.identity = builder.identity;
            this.role = builder.role;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phrase create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return silenceDuration
         */
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private Integer emotionValue; 
            private Long end; 
            private String identity; 
            private String role; 
            private Integer silenceDuration; 
            private Integer speechRate; 
            private String words; 

            private Builder() {
            } 

            private Builder(Phrase model) {
                this.begin = model.begin;
                this.emotionValue = model.emotionValue;
                this.end = model.end;
                this.identity = model.identity;
                this.role = model.role;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.words = model.words;
            } 

            /**
             * <p>Start time of this sentence relative to the entire conversation, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1230</p>
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>Emotional value of this sentence, 0-10. Higher values indicate stronger emotions.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>End time of this sentence relative to the entire conversation, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3440</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Deprecated field. Ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * <p>Role of this sentence. Valid values: customer service representative, customer.</p>
             * 
             * <strong>example:</strong>
             * <p>客服</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Deprecated field. Ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder silenceDuration(Integer silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>Speech rate of this sentence, in characters per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>Dialogue content.</p>
             * 
             * <strong>example:</strong>
             * <p>你好请问有什么可以帮您的</p>
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public Phrase build() {
                return new Phrase(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SyncQualityCheckResponseBody</p>
     */
    public static class Hit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitKeyWords")
        private java.util.List<HitKeyWords> hitKeyWords;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private Phrase phrase;

        private Hit(Builder builder) {
            this.hitKeyWords = builder.hitKeyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hit create() {
            return builder().build();
        }

        /**
         * @return hitKeyWords
         */
        public java.util.List<HitKeyWords> getHitKeyWords() {
            return this.hitKeyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private java.util.List<HitKeyWords> hitKeyWords; 
            private Phrase phrase; 

            private Builder() {
            } 

            private Builder(Hit model) {
                this.hitKeyWords = model.hitKeyWords;
                this.phrase = model.phrase;
            } 

            /**
             * <p>Keywords that met the condition.</p>
             */
            public Builder hitKeyWords(java.util.List<HitKeyWords> hitKeyWords) {
                this.hitKeyWords = hitKeyWords;
                return this;
            }

            /**
             * <p>Dialogue content that met the condition.</p>
             */
            public Builder phrase(Phrase phrase) {
                this.phrase = phrase;
                return this;
            }

            public Hit build() {
                return new Hit(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SyncQualityCheckResponseBody</p>
     */
    public static class RuleInfoBase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("RuleCategoryName")
        private String ruleCategoryName;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @com.aliyun.core.annotation.NameInMap("ScoreType")
        private Integer scoreType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private RuleInfoBase(Builder builder) {
            this.comments = builder.comments;
            this.level = builder.level;
            this.ruleCategoryName = builder.ruleCategoryName;
            this.scoreNum = builder.scoreNum;
            this.scoreNumType = builder.scoreNumType;
            this.scoreType = builder.scoreType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfoBase create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return ruleCategoryName
         */
        public String getRuleCategoryName() {
            return this.ruleCategoryName;
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreNumType
         */
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        /**
         * @return scoreType
         */
        public Integer getScoreType() {
            return this.scoreType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String comments; 
            private Integer level; 
            private String ruleCategoryName; 
            private Integer scoreNum; 
            private Integer scoreNumType; 
            private Integer scoreType; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(RuleInfoBase model) {
                this.comments = model.comments;
                this.level = model.level;
                this.ruleCategoryName = model.ruleCategoryName;
                this.scoreNum = model.scoreNum;
                this.scoreNumType = model.scoreNumType;
                this.scoreType = model.scoreType;
                this.type = model.type;
            } 

            /**
             * <p>Rule remarks</p>
             * 
             * <strong>example:</strong>
             * <p>邀约客户，客户不同意参加试听</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>Rule importance level</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Rule category name</p>
             * <blockquote>
             * <p>Notice: The requiredFields parameter must include &quot;ruleInfoBase.ruleCategoryName&quot;.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>服务规范</p>
             */
            public Builder ruleCategoryName(String ruleCategoryName) {
                this.ruleCategoryName = ruleCategoryName;
                return this;
            }

            /**
             * <p>Score value</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * <p>Scoring type. 0: bonus/penalty points, 1: one-time score.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * <p>1 for bonus points, 3 for penalty points. Default is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scoreType(Integer scoreType) {
                this.scoreType = scoreType;
                return this;
            }

            /**
             * <p>Rule type ID</p>
             * <blockquote>
             * <p>Notice: The requiredFields parameter must include &quot;ruleInfoBase&quot;.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public RuleInfoBase build() {
                return new RuleInfoBase(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SyncQualityCheckResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hit")
        private java.util.List<Hit> hit;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("RuleInfoBase")
        private RuleInfoBase ruleInfoBase;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private Rules(Builder builder) {
            this.hit = builder.hit;
            this.rid = builder.rid;
            this.ruleInfoBase = builder.ruleInfoBase;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public java.util.List<Hit> getHit() {
            return this.hit;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return ruleInfoBase
         */
        public RuleInfoBase getRuleInfoBase() {
            return this.ruleInfoBase;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private java.util.List<Hit> hit; 
            private String rid; 
            private RuleInfoBase ruleInfoBase; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.hit = model.hit;
                this.rid = model.rid;
                this.ruleInfoBase = model.ruleInfoBase;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>List of hit sentences. For this API, if a hit occurs, it is a single data entry.</p>
             */
            public Builder hit(java.util.List<Hit> hit) {
                this.hit = hit;
                return this;
            }

            /**
             * <p>ID of the hit rule.</p>
             * 
             * <strong>example:</strong>
             * <p>232232</p>
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * <p>Rule basic information</p>
             */
            public Builder ruleInfoBase(RuleInfoBase ruleInfoBase) {
                this.ruleInfoBase = ruleInfoBase;
                return this;
            }

            /**
             * <p>Name of the hit rule.</p>
             * 
             * <strong>example:</strong>
             * <p>禁用语</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
     *
     * <p>SyncQualityCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private String tid;

        private Data(Builder builder) {
            this.beginTime = builder.beginTime;
            this.rules = builder.rules;
            this.score = builder.score;
            this.taskId = builder.taskId;
            this.tid = builder.tid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tid
         */
        public String getTid() {
            return this.tid;
        }

        public static final class Builder {
            private Long beginTime; 
            private java.util.List<Rules> rules; 
            private Integer score; 
            private String taskId; 
            private String tid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.beginTime = model.beginTime;
                this.rules = model.rules;
                this.score = model.score;
                this.taskId = model.taskId;
                this.tid = model.tid;
            } 

            /**
             * <p>Time of recording and dialogue occurrence, in milliseconds since January 1, 1970, 00:00:00 UTC (UNIX timestamp in milliseconds, such as 1584535485856).</p>
             * 
             * <strong>example:</strong>
             * <p>1584535485856</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>List of hit rules. Each item is a rule. Only hit rule information and hit rule location information are returned.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>Final score, with a maximum of 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>66E1ACB866E1ACB8</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Unique identifier for the current conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>20200876-66E1ACB8</p>
             */
            public Builder tid(String tid) {
                this.tid = tid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
