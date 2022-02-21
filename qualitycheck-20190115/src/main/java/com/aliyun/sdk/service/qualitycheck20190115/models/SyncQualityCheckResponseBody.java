// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncQualityCheckResponseBody} extends {@link TeaModel}
 *
 * <p>SyncQualityCheckResponseBody</p>
 */
public class SyncQualityCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        public SyncQualityCheckResponseBody build() {
            return new SyncQualityCheckResponseBody(this);
        } 

    } 

    public static class HitKeyWords extends TeaModel {
        @NameInMap("Cid")
        private Integer cid;

        @NameInMap("From")
        private Integer from;

        @NameInMap("Pid")
        private Integer pid;

        @NameInMap("To")
        private Integer to;

        @NameInMap("Val")
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

            /**
             * Cid.
             */
            public Builder cid(Integer cid) {
                this.cid = cid;
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
             * Pid.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            /**
             * Val.
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
    public static class Phrase extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("EmotionValue")
        private Integer emotionValue;

        @NameInMap("End")
        private Long end;

        @NameInMap("Identity")
        private String identity;

        @NameInMap("Role")
        private String role;

        @NameInMap("SilenceDuration")
        private Integer silenceDuration;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Words")
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

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * EmotionValue.
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SilenceDuration.
             */
            public Builder silenceDuration(Integer silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Words.
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
    public static class Hit extends TeaModel {
        @NameInMap("HitKeyWords")
        private java.util.List < HitKeyWords> hitKeyWords;

        @NameInMap("Phrase")
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
        public java.util.List < HitKeyWords> getHitKeyWords() {
            return this.hitKeyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private java.util.List < HitKeyWords> hitKeyWords; 
            private Phrase phrase; 

            /**
             * HitKeyWords.
             */
            public Builder hitKeyWords(java.util.List < HitKeyWords> hitKeyWords) {
                this.hitKeyWords = hitKeyWords;
                return this;
            }

            /**
             * Phrase.
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
    public static class Rules extends TeaModel {
        @NameInMap("Hit")
        private java.util.List < Hit> hit;

        @NameInMap("Rid")
        private String rid;

        @NameInMap("RuleName")
        private String ruleName;

        private Rules(Builder builder) {
            this.hit = builder.hit;
            this.rid = builder.rid;
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
        public java.util.List < Hit> getHit() {
            return this.hit;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private java.util.List < Hit> hit; 
            private String rid; 
            private String ruleName; 

            /**
             * Hit.
             */
            public Builder hit(java.util.List < Hit> hit) {
                this.hit = hit;
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
             * RuleName.
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
    public static class Data extends TeaModel {
        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Tid")
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
        public java.util.List < Rules> getRules() {
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
            private java.util.List < Rules> rules; 
            private Integer score; 
            private String taskId; 
            private String tid; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Tid.
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
