// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetResultToReviewResponseBody</p>
 */
public class GetResultToReviewResponseBody extends TeaModel {
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

    private GetResultToReviewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResultToReviewResponseBody create() {
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

        public GetResultToReviewResponseBody build() {
            return new GetResultToReviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class Dialogue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("HourMinSec")
        private String hourMinSec;

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

        private Dialogue(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.hourMinSec = builder.hourMinSec;
            this.identity = builder.identity;
            this.role = builder.role;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogue create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
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
         * @return hourMinSec
         */
        public String getHourMinSec() {
            return this.hourMinSec;
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
            private String beginTime; 
            private Integer emotionValue; 
            private Long end; 
            private String hourMinSec; 
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
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
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
             * HourMinSec.
             */
            public Builder hourMinSec(String hourMinSec) {
                this.hourMinSec = hourMinSec;
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

            public Dialogue build() {
                return new Dialogue(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class Dialogues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dialogue")
        private java.util.List < Dialogue> dialogue;

        private Dialogues(Builder builder) {
            this.dialogue = builder.dialogue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dialogues create() {
            return builder().build();
        }

        /**
         * @return dialogue
         */
        public java.util.List < Dialogue> getDialogue() {
            return this.dialogue;
        }

        public static final class Builder {
            private java.util.List < Dialogue> dialogue; 

            /**
             * Dialogue.
             */
            public Builder dialogue(java.util.List < Dialogue> dialogue) {
                this.dialogue = dialogue;
                return this;
            }

            public Dialogues build() {
                return new Dialogues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ComplainHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private Integer operationType;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        private ComplainHistories(Builder builder) {
            this.comments = builder.comments;
            this.operationTime = builder.operationTime;
            this.operationType = builder.operationType;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplainHistories create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return operationType
         */
        public Integer getOperationType() {
            return this.operationType;
        }

        /**
         * @return operator
         */
        public Long getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        public static final class Builder {
            private String comments; 
            private String operationTime; 
            private Integer operationType; 
            private Long operator; 
            private String operatorName; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(Integer operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            public ComplainHistories build() {
                return new ComplainHistories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class HitRuleReviewInfoComplainHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplainHistories")
        private java.util.List < ComplainHistories> complainHistories;

        private HitRuleReviewInfoComplainHistories(Builder builder) {
            this.complainHistories = builder.complainHistories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitRuleReviewInfoComplainHistories create() {
            return builder().build();
        }

        /**
         * @return complainHistories
         */
        public java.util.List < ComplainHistories> getComplainHistories() {
            return this.complainHistories;
        }

        public static final class Builder {
            private java.util.List < ComplainHistories> complainHistories; 

            /**
             * ComplainHistories.
             */
            public Builder complainHistories(java.util.List < ComplainHistories> complainHistories) {
                this.complainHistories = complainHistories;
                return this;
            }

            public HitRuleReviewInfoComplainHistories build() {
                return new HitRuleReviewInfoComplainHistories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class Cid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private java.util.List < String > cid;

        private Cid(Builder builder) {
            this.cid = builder.cid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cid create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public java.util.List < String > getCid() {
            return this.cid;
        }

        public static final class Builder {
            private java.util.List < String > cid; 

            /**
             * Cid.
             */
            public Builder cid(java.util.List < String > cid) {
                this.cid = cid;
                return this;
            }

            public Cid build() {
                return new Cid(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class KeyWord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private String cid;

        @com.aliyun.core.annotation.NameInMap("CustomizeCode")
        private String customizeCode;

        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private String tid;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        @com.aliyun.core.annotation.NameInMap("Val")
        private String val;

        private KeyWord(Builder builder) {
            this.cid = builder.cid;
            this.customizeCode = builder.customizeCode;
            this.from = builder.from;
            this.pid = builder.pid;
            this.tid = builder.tid;
            this.to = builder.to;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyWord create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public String getCid() {
            return this.cid;
        }

        /**
         * @return customizeCode
         */
        public String getCustomizeCode() {
            return this.customizeCode;
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
         * @return tid
         */
        public String getTid() {
            return this.tid;
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
            private String cid; 
            private String customizeCode; 
            private Integer from; 
            private Integer pid; 
            private String tid; 
            private Integer to; 
            private String val; 

            /**
             * Cid.
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * CustomizeCode.
             */
            public Builder customizeCode(String customizeCode) {
                this.customizeCode = customizeCode;
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
             * Tid.
             */
            public Builder tid(String tid) {
                this.tid = tid;
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

            public KeyWord build() {
                return new KeyWord(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class KeyWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWord")
        private java.util.List < KeyWord> keyWord;

        private KeyWords(Builder builder) {
            this.keyWord = builder.keyWord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyWords create() {
            return builder().build();
        }

        /**
         * @return keyWord
         */
        public java.util.List < KeyWord> getKeyWord() {
            return this.keyWord;
        }

        public static final class Builder {
            private java.util.List < KeyWord> keyWord; 

            /**
             * KeyWord.
             */
            public Builder keyWord(java.util.List < KeyWord> keyWord) {
                this.keyWord = keyWord;
                return this;
            }

            public KeyWords build() {
                return new KeyWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Phrase(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.identity = builder.identity;
            this.pid = builder.pid;
            this.role = builder.role;
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
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
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
            private Integer pid; 
            private String role; 
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
             * Pid.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
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
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ConditionHitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private Cid cid;

        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private KeyWords keyWords;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private Phrase phrase;

        private ConditionHitInfo(Builder builder) {
            this.cid = builder.cid;
            this.keyWords = builder.keyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionHitInfo create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public Cid getCid() {
            return this.cid;
        }

        /**
         * @return keyWords
         */
        public KeyWords getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private Cid cid; 
            private KeyWords keyWords; 
            private Phrase phrase; 

            /**
             * Cid.
             */
            public Builder cid(Cid cid) {
                this.cid = cid;
                return this;
            }

            /**
             * KeyWords.
             */
            public Builder keyWords(KeyWords keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * Phrase.
             */
            public Builder phrase(Phrase phrase) {
                this.phrase = phrase;
                return this;
            }

            public ConditionHitInfo build() {
                return new ConditionHitInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ConditionHitInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionHitInfo")
        private java.util.List < ConditionHitInfo> conditionHitInfo;

        private ConditionHitInfoList(Builder builder) {
            this.conditionHitInfo = builder.conditionHitInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionHitInfoList create() {
            return builder().build();
        }

        /**
         * @return conditionHitInfo
         */
        public java.util.List < ConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

        public static final class Builder {
            private java.util.List < ConditionHitInfo> conditionHitInfo; 

            /**
             * ConditionHitInfo.
             */
            public Builder conditionHitInfo(java.util.List < ConditionHitInfo> conditionHitInfo) {
                this.conditionHitInfo = conditionHitInfo;
                return this;
            }

            public ConditionHitInfoList build() {
                return new ConditionHitInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitId")
        private String hitId;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("ReviewTime")
        private String reviewTime;

        @com.aliyun.core.annotation.NameInMap("Reviewer")
        private String reviewer;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        private ReviewInfo(Builder builder) {
            this.hitId = builder.hitId;
            this.reviewResult = builder.reviewResult;
            this.reviewTime = builder.reviewTime;
            this.reviewer = builder.reviewer;
            this.rid = builder.rid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewInfo create() {
            return builder().build();
        }

        /**
         * @return hitId
         */
        public String getHitId() {
            return this.hitId;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return reviewTime
         */
        public String getReviewTime() {
            return this.reviewTime;
        }

        /**
         * @return reviewer
         */
        public String getReviewer() {
            return this.reviewer;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        public static final class Builder {
            private String hitId; 
            private Integer reviewResult; 
            private String reviewTime; 
            private String reviewer; 
            private Long rid; 

            /**
             * HitId.
             */
            public Builder hitId(String hitId) {
                this.hitId = hitId;
                return this;
            }

            /**
             * ReviewResult.
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * ReviewTime.
             */
            public Builder reviewTime(String reviewTime) {
                this.reviewTime = reviewTime;
                return this;
            }

            /**
             * Reviewer.
             */
            public Builder reviewer(String reviewer) {
                this.reviewer = reviewer;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            public ReviewInfo build() {
                return new ReviewInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class HitRuleReviewInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReview")
        private Integer autoReview;

        @com.aliyun.core.annotation.NameInMap("ComplainHistories")
        private HitRuleReviewInfoComplainHistories complainHistories;

        @com.aliyun.core.annotation.NameInMap("Complainable")
        private Boolean complainable;

        @com.aliyun.core.annotation.NameInMap("ConditionHitInfoList")
        private ConditionHitInfoList conditionHitInfoList;

        @com.aliyun.core.annotation.NameInMap("ReviewInfo")
        private ReviewInfo reviewInfo;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ScoreId")
        private Long scoreId;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreSubId")
        private Long scoreSubId;

        @com.aliyun.core.annotation.NameInMap("ScoreSubName")
        private String scoreSubName;

        private HitRuleReviewInfo(Builder builder) {
            this.autoReview = builder.autoReview;
            this.complainHistories = builder.complainHistories;
            this.complainable = builder.complainable;
            this.conditionHitInfoList = builder.conditionHitInfoList;
            this.reviewInfo = builder.reviewInfo;
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
            this.scoreId = builder.scoreId;
            this.scoreNum = builder.scoreNum;
            this.scoreSubId = builder.scoreSubId;
            this.scoreSubName = builder.scoreSubName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitRuleReviewInfo create() {
            return builder().build();
        }

        /**
         * @return autoReview
         */
        public Integer getAutoReview() {
            return this.autoReview;
        }

        /**
         * @return complainHistories
         */
        public HitRuleReviewInfoComplainHistories getComplainHistories() {
            return this.complainHistories;
        }

        /**
         * @return complainable
         */
        public Boolean getComplainable() {
            return this.complainable;
        }

        /**
         * @return conditionHitInfoList
         */
        public ConditionHitInfoList getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        /**
         * @return reviewInfo
         */
        public ReviewInfo getReviewInfo() {
            return this.reviewInfo;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return scoreId
         */
        public Long getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreSubId
         */
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        /**
         * @return scoreSubName
         */
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public static final class Builder {
            private Integer autoReview; 
            private HitRuleReviewInfoComplainHistories complainHistories; 
            private Boolean complainable; 
            private ConditionHitInfoList conditionHitInfoList; 
            private ReviewInfo reviewInfo; 
            private Long rid; 
            private String ruleName; 
            private Long scoreId; 
            private Integer scoreNum; 
            private Long scoreSubId; 
            private String scoreSubName; 

            /**
             * AutoReview.
             */
            public Builder autoReview(Integer autoReview) {
                this.autoReview = autoReview;
                return this;
            }

            /**
             * ComplainHistories.
             */
            public Builder complainHistories(HitRuleReviewInfoComplainHistories complainHistories) {
                this.complainHistories = complainHistories;
                return this;
            }

            /**
             * Complainable.
             */
            public Builder complainable(Boolean complainable) {
                this.complainable = complainable;
                return this;
            }

            /**
             * ConditionHitInfoList.
             */
            public Builder conditionHitInfoList(ConditionHitInfoList conditionHitInfoList) {
                this.conditionHitInfoList = conditionHitInfoList;
                return this;
            }

            /**
             * ReviewInfo.
             */
            public Builder reviewInfo(ReviewInfo reviewInfo) {
                this.reviewInfo = reviewInfo;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
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

            /**
             * ScoreId.
             */
            public Builder scoreId(Long scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreNum.
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * ScoreSubId.
             */
            public Builder scoreSubId(Long scoreSubId) {
                this.scoreSubId = scoreSubId;
                return this;
            }

            /**
             * ScoreSubName.
             */
            public Builder scoreSubName(String scoreSubName) {
                this.scoreSubName = scoreSubName;
                return this;
            }

            public HitRuleReviewInfo build() {
                return new HitRuleReviewInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class HitRuleReviewInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitRuleReviewInfo")
        private java.util.List < HitRuleReviewInfo> hitRuleReviewInfo;

        private HitRuleReviewInfoList(Builder builder) {
            this.hitRuleReviewInfo = builder.hitRuleReviewInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitRuleReviewInfoList create() {
            return builder().build();
        }

        /**
         * @return hitRuleReviewInfo
         */
        public java.util.List < HitRuleReviewInfo> getHitRuleReviewInfo() {
            return this.hitRuleReviewInfo;
        }

        public static final class Builder {
            private java.util.List < HitRuleReviewInfo> hitRuleReviewInfo; 

            /**
             * HitRuleReviewInfo.
             */
            public Builder hitRuleReviewInfo(java.util.List < HitRuleReviewInfo> hitRuleReviewInfo) {
                this.hitRuleReviewInfo = hitRuleReviewInfo;
                return this;
            }

            public HitRuleReviewInfoList build() {
                return new HitRuleReviewInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ComplainHistoriesComplainHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private Integer operationType;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        private ComplainHistoriesComplainHistories(Builder builder) {
            this.comments = builder.comments;
            this.operationTime = builder.operationTime;
            this.operationType = builder.operationType;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplainHistoriesComplainHistories create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return operationType
         */
        public Integer getOperationType() {
            return this.operationType;
        }

        /**
         * @return operator
         */
        public Long getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        public static final class Builder {
            private String comments; 
            private String operationTime; 
            private Integer operationType; 
            private Long operator; 
            private String operatorName; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(Integer operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            public ComplainHistoriesComplainHistories build() {
                return new ComplainHistoriesComplainHistories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ManualScoreInfoComplainHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplainHistories")
        private java.util.List < ComplainHistoriesComplainHistories> complainHistories;

        private ManualScoreInfoComplainHistories(Builder builder) {
            this.complainHistories = builder.complainHistories;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManualScoreInfoComplainHistories create() {
            return builder().build();
        }

        /**
         * @return complainHistories
         */
        public java.util.List < ComplainHistoriesComplainHistories> getComplainHistories() {
            return this.complainHistories;
        }

        public static final class Builder {
            private java.util.List < ComplainHistoriesComplainHistories> complainHistories; 

            /**
             * ComplainHistories.
             */
            public Builder complainHistories(java.util.List < ComplainHistoriesComplainHistories> complainHistories) {
                this.complainHistories = complainHistories;
                return this;
            }

            public ManualScoreInfoComplainHistories build() {
                return new ManualScoreInfoComplainHistories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ManualScoreInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplainHistories")
        private ManualScoreInfoComplainHistories complainHistories;

        @com.aliyun.core.annotation.NameInMap("Complainable")
        private Boolean complainable;

        @com.aliyun.core.annotation.NameInMap("ScoreId")
        private Long scoreId;

        @com.aliyun.core.annotation.NameInMap("ScoreNum")
        private Integer scoreNum;

        @com.aliyun.core.annotation.NameInMap("ScoreSubId")
        private Long scoreSubId;

        @com.aliyun.core.annotation.NameInMap("ScoreSubName")
        private String scoreSubName;

        private ManualScoreInfo(Builder builder) {
            this.complainHistories = builder.complainHistories;
            this.complainable = builder.complainable;
            this.scoreId = builder.scoreId;
            this.scoreNum = builder.scoreNum;
            this.scoreSubId = builder.scoreSubId;
            this.scoreSubName = builder.scoreSubName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManualScoreInfo create() {
            return builder().build();
        }

        /**
         * @return complainHistories
         */
        public ManualScoreInfoComplainHistories getComplainHistories() {
            return this.complainHistories;
        }

        /**
         * @return complainable
         */
        public Boolean getComplainable() {
            return this.complainable;
        }

        /**
         * @return scoreId
         */
        public Long getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreNum
         */
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        /**
         * @return scoreSubId
         */
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        /**
         * @return scoreSubName
         */
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public static final class Builder {
            private ManualScoreInfoComplainHistories complainHistories; 
            private Boolean complainable; 
            private Long scoreId; 
            private Integer scoreNum; 
            private Long scoreSubId; 
            private String scoreSubName; 

            /**
             * ComplainHistories.
             */
            public Builder complainHistories(ManualScoreInfoComplainHistories complainHistories) {
                this.complainHistories = complainHistories;
                return this;
            }

            /**
             * Complainable.
             */
            public Builder complainable(Boolean complainable) {
                this.complainable = complainable;
                return this;
            }

            /**
             * ScoreId.
             */
            public Builder scoreId(Long scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreNum.
             */
            public Builder scoreNum(Integer scoreNum) {
                this.scoreNum = scoreNum;
                return this;
            }

            /**
             * ScoreSubId.
             */
            public Builder scoreSubId(Long scoreSubId) {
                this.scoreSubId = scoreSubId;
                return this;
            }

            /**
             * ScoreSubName.
             */
            public Builder scoreSubName(String scoreSubName) {
                this.scoreSubName = scoreSubName;
                return this;
            }

            public ManualScoreInfo build() {
                return new ManualScoreInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ManualScoreInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ManualScoreInfo")
        private java.util.List < ManualScoreInfo> manualScoreInfo;

        private ManualScoreInfoList(Builder builder) {
            this.manualScoreInfo = builder.manualScoreInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManualScoreInfoList create() {
            return builder().build();
        }

        /**
         * @return manualScoreInfo
         */
        public java.util.List < ManualScoreInfo> getManualScoreInfo() {
            return this.manualScoreInfo;
        }

        public static final class Builder {
            private java.util.List < ManualScoreInfo> manualScoreInfo; 

            /**
             * ManualScoreInfo.
             */
            public Builder manualScoreInfo(java.util.List < ManualScoreInfo> manualScoreInfo) {
                this.manualScoreInfo = manualScoreInfo;
                return this;
            }

            public ManualScoreInfoList build() {
                return new ManualScoreInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewRightRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        private ReviewRightRule(Builder builder) {
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewRightRule create() {
            return builder().build();
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long rid; 
            private String ruleName; 

            /**
             * rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public ReviewRightRule build() {
                return new ReviewRightRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewHistoryReviewRightRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewRightRule")
        private java.util.List < ReviewRightRule> reviewRightRule;

        private ReviewHistoryReviewRightRule(Builder builder) {
            this.reviewRightRule = builder.reviewRightRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewHistoryReviewRightRule create() {
            return builder().build();
        }

        /**
         * @return reviewRightRule
         */
        public java.util.List < ReviewRightRule> getReviewRightRule() {
            return this.reviewRightRule;
        }

        public static final class Builder {
            private java.util.List < ReviewRightRule> reviewRightRule; 

            /**
             * ReviewRightRule.
             */
            public Builder reviewRightRule(java.util.List < ReviewRightRule> reviewRightRule) {
                this.reviewRightRule = reviewRightRule;
                return this;
            }

            public ReviewHistoryReviewRightRule build() {
                return new ReviewHistoryReviewRightRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("ComplainResult")
        private Integer complainResult;

        @com.aliyun.core.annotation.NameInMap("OldScore")
        private Integer oldScore;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("ReviewManagerType")
        private String reviewManagerType;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("ReviewRightRule")
        private ReviewHistoryReviewRightRule reviewRightRule;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TimeStr")
        private String timeStr;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private ReviewHistory(Builder builder) {
            this.comments = builder.comments;
            this.complainResult = builder.complainResult;
            this.oldScore = builder.oldScore;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
            this.reviewManagerType = builder.reviewManagerType;
            this.reviewResult = builder.reviewResult;
            this.reviewRightRule = builder.reviewRightRule;
            this.score = builder.score;
            this.time = builder.time;
            this.timeStr = builder.timeStr;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewHistory create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return complainResult
         */
        public Integer getComplainResult() {
            return this.complainResult;
        }

        /**
         * @return oldScore
         */
        public Integer getOldScore() {
            return this.oldScore;
        }

        /**
         * @return operator
         */
        public Long getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return reviewManagerType
         */
        public String getReviewManagerType() {
            return this.reviewManagerType;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return reviewRightRule
         */
        public ReviewHistoryReviewRightRule getReviewRightRule() {
            return this.reviewRightRule;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return timeStr
         */
        public String getTimeStr() {
            return this.timeStr;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String comments; 
            private Integer complainResult; 
            private Integer oldScore; 
            private Long operator; 
            private String operatorName; 
            private String reviewManagerType; 
            private Integer reviewResult; 
            private ReviewHistoryReviewRightRule reviewRightRule; 
            private Integer score; 
            private Long time; 
            private String timeStr; 
            private Integer type; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * ComplainResult.
             */
            public Builder complainResult(Integer complainResult) {
                this.complainResult = complainResult;
                return this;
            }

            /**
             * OldScore.
             */
            public Builder oldScore(Integer oldScore) {
                this.oldScore = oldScore;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * ReviewManagerType.
             */
            public Builder reviewManagerType(String reviewManagerType) {
                this.reviewManagerType = reviewManagerType;
                return this;
            }

            /**
             * ReviewResult.
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * ReviewRightRule.
             */
            public Builder reviewRightRule(ReviewHistoryReviewRightRule reviewRightRule) {
                this.reviewRightRule = reviewRightRule;
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
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TimeStr.
             */
            public Builder timeStr(String timeStr) {
                this.timeStr = timeStr;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ReviewHistory build() {
                return new ReviewHistory(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewHistory")
        private java.util.List < ReviewHistory> reviewHistory;

        private ReviewHistoryList(Builder builder) {
            this.reviewHistory = builder.reviewHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewHistoryList create() {
            return builder().build();
        }

        /**
         * @return reviewHistory
         */
        public java.util.List < ReviewHistory> getReviewHistory() {
            return this.reviewHistory;
        }

        public static final class Builder {
            private java.util.List < ReviewHistory> reviewHistory; 

            /**
             * ReviewHistory.
             */
            public Builder reviewHistory(java.util.List < ReviewHistory> reviewHistory) {
                this.reviewHistory = reviewHistory;
                return this;
            }

            public ReviewHistoryList build() {
                return new ReviewHistoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewKeyIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewKeyIdList")
        private java.util.List < Long > reviewKeyIdList;

        private ReviewKeyIdList(Builder builder) {
            this.reviewKeyIdList = builder.reviewKeyIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewKeyIdList create() {
            return builder().build();
        }

        /**
         * @return reviewKeyIdList
         */
        public java.util.List < Long > getReviewKeyIdList() {
            return this.reviewKeyIdList;
        }

        public static final class Builder {
            private java.util.List < Long > reviewKeyIdList; 

            /**
             * ReviewKeyIdList.
             */
            public Builder reviewKeyIdList(java.util.List < Long > reviewKeyIdList) {
                this.reviewKeyIdList = reviewKeyIdList;
                return this;
            }

            public ReviewKeyIdList build() {
                return new ReviewKeyIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class ReviewTypeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewKeyIdList")
        private ReviewKeyIdList reviewKeyIdList;

        @com.aliyun.core.annotation.NameInMap("ReviewTypeId")
        private Long reviewTypeId;

        private ReviewTypeIdList(Builder builder) {
            this.reviewKeyIdList = builder.reviewKeyIdList;
            this.reviewTypeId = builder.reviewTypeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewTypeIdList create() {
            return builder().build();
        }

        /**
         * @return reviewKeyIdList
         */
        public ReviewKeyIdList getReviewKeyIdList() {
            return this.reviewKeyIdList;
        }

        /**
         * @return reviewTypeId
         */
        public Long getReviewTypeId() {
            return this.reviewTypeId;
        }

        public static final class Builder {
            private ReviewKeyIdList reviewKeyIdList; 
            private Long reviewTypeId; 

            /**
             * ReviewKeyIdList.
             */
            public Builder reviewKeyIdList(ReviewKeyIdList reviewKeyIdList) {
                this.reviewKeyIdList = reviewKeyIdList;
                return this;
            }

            /**
             * ReviewTypeId.
             */
            public Builder reviewTypeId(Long reviewTypeId) {
                this.reviewTypeId = reviewTypeId;
                return this;
            }

            public ReviewTypeIdList build() {
                return new ReviewTypeIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class DataReviewTypeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewTypeIdList")
        private java.util.List < ReviewTypeIdList> reviewTypeIdList;

        private DataReviewTypeIdList(Builder builder) {
            this.reviewTypeIdList = builder.reviewTypeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataReviewTypeIdList create() {
            return builder().build();
        }

        /**
         * @return reviewTypeIdList
         */
        public java.util.List < ReviewTypeIdList> getReviewTypeIdList() {
            return this.reviewTypeIdList;
        }

        public static final class Builder {
            private java.util.List < ReviewTypeIdList> reviewTypeIdList; 

            /**
             * ReviewTypeIdList.
             */
            public Builder reviewTypeIdList(java.util.List < ReviewTypeIdList> reviewTypeIdList) {
                this.reviewTypeIdList = reviewTypeIdList;
                return this;
            }

            public DataReviewTypeIdList build() {
                return new DataReviewTypeIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResultToReviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetResultToReviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioScheme")
        private String audioScheme;

        @com.aliyun.core.annotation.NameInMap("AudioURL")
        private String audioURL;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("Dialogues")
        private Dialogues dialogues;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileMergeName")
        private String fileMergeName;

        @com.aliyun.core.annotation.NameInMap("HitRuleReviewInfoList")
        private HitRuleReviewInfoList hitRuleReviewInfoList;

        @com.aliyun.core.annotation.NameInMap("ManualScoreInfoList")
        private ManualScoreInfoList manualScoreInfoList;

        @com.aliyun.core.annotation.NameInMap("ReviewHistoryList")
        private ReviewHistoryList reviewHistoryList;

        @com.aliyun.core.annotation.NameInMap("ReviewTypeIdList")
        private DataReviewTypeIdList reviewTypeIdList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TotalScore")
        private Integer totalScore;

        @com.aliyun.core.annotation.NameInMap("Vid")
        private String vid;

        private Data(Builder builder) {
            this.audioScheme = builder.audioScheme;
            this.audioURL = builder.audioURL;
            this.comments = builder.comments;
            this.dialogues = builder.dialogues;
            this.fileId = builder.fileId;
            this.fileMergeName = builder.fileMergeName;
            this.hitRuleReviewInfoList = builder.hitRuleReviewInfoList;
            this.manualScoreInfoList = builder.manualScoreInfoList;
            this.reviewHistoryList = builder.reviewHistoryList;
            this.reviewTypeIdList = builder.reviewTypeIdList;
            this.status = builder.status;
            this.totalScore = builder.totalScore;
            this.vid = builder.vid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return audioScheme
         */
        public String getAudioScheme() {
            return this.audioScheme;
        }

        /**
         * @return audioURL
         */
        public String getAudioURL() {
            return this.audioURL;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return dialogues
         */
        public Dialogues getDialogues() {
            return this.dialogues;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileMergeName
         */
        public String getFileMergeName() {
            return this.fileMergeName;
        }

        /**
         * @return hitRuleReviewInfoList
         */
        public HitRuleReviewInfoList getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        /**
         * @return manualScoreInfoList
         */
        public ManualScoreInfoList getManualScoreInfoList() {
            return this.manualScoreInfoList;
        }

        /**
         * @return reviewHistoryList
         */
        public ReviewHistoryList getReviewHistoryList() {
            return this.reviewHistoryList;
        }

        /**
         * @return reviewTypeIdList
         */
        public DataReviewTypeIdList getReviewTypeIdList() {
            return this.reviewTypeIdList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return totalScore
         */
        public Integer getTotalScore() {
            return this.totalScore;
        }

        /**
         * @return vid
         */
        public String getVid() {
            return this.vid;
        }

        public static final class Builder {
            private String audioScheme; 
            private String audioURL; 
            private String comments; 
            private Dialogues dialogues; 
            private String fileId; 
            private String fileMergeName; 
            private HitRuleReviewInfoList hitRuleReviewInfoList; 
            private ManualScoreInfoList manualScoreInfoList; 
            private ReviewHistoryList reviewHistoryList; 
            private DataReviewTypeIdList reviewTypeIdList; 
            private Integer status; 
            private Integer totalScore; 
            private String vid; 

            /**
             * AudioScheme.
             */
            public Builder audioScheme(String audioScheme) {
                this.audioScheme = audioScheme;
                return this;
            }

            /**
             * AudioURL.
             */
            public Builder audioURL(String audioURL) {
                this.audioURL = audioURL;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * Dialogues.
             */
            public Builder dialogues(Dialogues dialogues) {
                this.dialogues = dialogues;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileMergeName.
             */
            public Builder fileMergeName(String fileMergeName) {
                this.fileMergeName = fileMergeName;
                return this;
            }

            /**
             * HitRuleReviewInfoList.
             */
            public Builder hitRuleReviewInfoList(HitRuleReviewInfoList hitRuleReviewInfoList) {
                this.hitRuleReviewInfoList = hitRuleReviewInfoList;
                return this;
            }

            /**
             * ManualScoreInfoList.
             */
            public Builder manualScoreInfoList(ManualScoreInfoList manualScoreInfoList) {
                this.manualScoreInfoList = manualScoreInfoList;
                return this;
            }

            /**
             * ReviewHistoryList.
             */
            public Builder reviewHistoryList(ReviewHistoryList reviewHistoryList) {
                this.reviewHistoryList = reviewHistoryList;
                return this;
            }

            /**
             * ReviewTypeIdList.
             */
            public Builder reviewTypeIdList(DataReviewTypeIdList reviewTypeIdList) {
                this.reviewTypeIdList = reviewTypeIdList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TotalScore.
             */
            public Builder totalScore(Integer totalScore) {
                this.totalScore = totalScore;
                return this;
            }

            /**
             * Vid.
             */
            public Builder vid(String vid) {
                this.vid = vid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
