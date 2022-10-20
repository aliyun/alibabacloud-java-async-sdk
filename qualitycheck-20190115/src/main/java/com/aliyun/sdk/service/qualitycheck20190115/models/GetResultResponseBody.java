// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetResultResponseBody</p>
 */
public class GetResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCountId")
    private String resultCountId;

    @NameInMap("Success")
    private Boolean success;

    private GetResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCountId = builder.resultCountId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCountId
     */
    public String getResultCountId() {
        return this.resultCountId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCountId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCountId.
         */
        public Builder resultCountId(String resultCountId) {
            this.resultCountId = resultCountId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetResultResponseBody build() {
            return new GetResultResponseBody(this);
        } 

    } 

    public static class Agent extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("SkillGroup")
        private String skillGroup;

        private Agent(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.skillGroup = builder.skillGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillGroup
         */
        public String getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String skillGroup; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SkillGroup.
             */
            public Builder skillGroup(String skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    public static class AsrResult extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("EmotionValue")
        private Integer emotionValue;

        @NameInMap("End")
        private Long end;

        @NameInMap("Role")
        private String role;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Words")
        private String words;

        private AsrResult(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.role = builder.role;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrResult create() {
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
         * @return role
         */
        public String getRole() {
            return this.role;
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
            private String role; 
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
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
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

            public AsrResult build() {
                return new AsrResult(this);
            } 

        } 

    }
    public static class ResultInfoAsrResult extends TeaModel {
        @NameInMap("AsrResult")
        private java.util.List < AsrResult> asrResult;

        private ResultInfoAsrResult(Builder builder) {
            this.asrResult = builder.asrResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoAsrResult create() {
            return builder().build();
        }

        /**
         * @return asrResult
         */
        public java.util.List < AsrResult> getAsrResult() {
            return this.asrResult;
        }

        public static final class Builder {
            private java.util.List < AsrResult> asrResult; 

            /**
             * AsrResult.
             */
            public Builder asrResult(java.util.List < AsrResult> asrResult) {
                this.asrResult = asrResult;
                return this;
            }

            public ResultInfoAsrResult build() {
                return new ResultInfoAsrResult(this);
            } 

        } 

    }
    public static class Cid extends TeaModel {
        @NameInMap("Cid")
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
    public static class KeyWord extends TeaModel {
        @NameInMap("Cid")
        private String cid;

        @NameInMap("From")
        private Integer from;

        @NameInMap("To")
        private Integer to;

        @NameInMap("Val")
        private String val;

        private KeyWord(Builder builder) {
            this.cid = builder.cid;
            this.from = builder.from;
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

        /**
         * @return val
         */
        public String getVal() {
            return this.val;
        }

        public static final class Builder {
            private String cid; 
            private Integer from; 
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
    public static class KeyWords extends TeaModel {
        @NameInMap("KeyWord")
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
    public static class Phrase extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("EmotionValue")
        private Integer emotionValue;

        @NameInMap("End")
        private Integer end;

        @NameInMap("Role")
        private String role;

        @NameInMap("Words")
        private String words;

        private Phrase(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
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
        public Integer getEnd() {
            return this.end;
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
            private Integer end; 
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
            public Builder end(Integer end) {
                this.end = end;
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
    public static class Hit extends TeaModel {
        @NameInMap("Cid")
        private Cid cid;

        @NameInMap("KeyWords")
        private KeyWords keyWords;

        @NameInMap("Phrase")
        private Phrase phrase;

        private Hit(Builder builder) {
            this.cid = builder.cid;
            this.keyWords = builder.keyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hit create() {
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

            public Hit build() {
                return new Hit(this);
            } 

        } 

    }
    public static class Hits extends TeaModel {
        @NameInMap("Hit")
        private java.util.List < Hit> hit;

        private Hits(Builder builder) {
            this.hit = builder.hit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hits create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public java.util.List < Hit> getHit() {
            return this.hit;
        }

        public static final class Builder {
            private java.util.List < Hit> hit; 

            /**
             * Hit.
             */
            public Builder hit(java.util.List < Hit> hit) {
                this.hit = hit;
                return this;
            }

            public Hits build() {
                return new Hits(this);
            } 

        } 

    }
    public static class HitResult extends TeaModel {
        @NameInMap("Hits")
        private Hits hits;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReviewResult")
        private Integer reviewResult;

        @NameInMap("Rid")
        private String rid;

        @NameInMap("SchemeId")
        private Long schemeId;

        @NameInMap("SchemeVersion")
        private Long schemeVersion;

        @NameInMap("Type")
        private String type;

        private HitResult(Builder builder) {
            this.hits = builder.hits;
            this.name = builder.name;
            this.reviewResult = builder.reviewResult;
            this.rid = builder.rid;
            this.schemeId = builder.schemeId;
            this.schemeVersion = builder.schemeVersion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitResult create() {
            return builder().build();
        }

        /**
         * @return hits
         */
        public Hits getHits() {
            return this.hits;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return schemeVersion
         */
        public Long getSchemeVersion() {
            return this.schemeVersion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Hits hits; 
            private String name; 
            private Integer reviewResult; 
            private String rid; 
            private Long schemeId; 
            private Long schemeVersion; 
            private String type; 

            /**
             * Hits.
             */
            public Builder hits(Hits hits) {
                this.hits = hits;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Rid.
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * SchemeId.
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            /**
             * SchemeVersion.
             */
            public Builder schemeVersion(Long schemeVersion) {
                this.schemeVersion = schemeVersion;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HitResult build() {
                return new HitResult(this);
            } 

        } 

    }
    public static class ResultInfoHitResult extends TeaModel {
        @NameInMap("HitResult")
        private java.util.List < HitResult> hitResult;

        private ResultInfoHitResult(Builder builder) {
            this.hitResult = builder.hitResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoHitResult create() {
            return builder().build();
        }

        /**
         * @return hitResult
         */
        public java.util.List < HitResult> getHitResult() {
            return this.hitResult;
        }

        public static final class Builder {
            private java.util.List < HitResult> hitResult; 

            /**
             * HitResult.
             */
            public Builder hitResult(java.util.List < HitResult> hitResult) {
                this.hitResult = hitResult;
                return this;
            }

            public ResultInfoHitResult build() {
                return new ResultInfoHitResult(this);
            } 

        } 

    }
    public static class HitScore extends TeaModel {
        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("ScoreId")
        private String scoreId;

        @NameInMap("ScoreName")
        private String scoreName;

        @NameInMap("ScoreNumber")
        private String scoreNumber;

        private HitScore(Builder builder) {
            this.ruleId = builder.ruleId;
            this.scoreId = builder.scoreId;
            this.scoreName = builder.scoreName;
            this.scoreNumber = builder.scoreNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitScore create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return scoreId
         */
        public String getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreName
         */
        public String getScoreName() {
            return this.scoreName;
        }

        /**
         * @return scoreNumber
         */
        public String getScoreNumber() {
            return this.scoreNumber;
        }

        public static final class Builder {
            private String ruleId; 
            private String scoreId; 
            private String scoreName; 
            private String scoreNumber; 

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ScoreId.
             */
            public Builder scoreId(String scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreName.
             */
            public Builder scoreName(String scoreName) {
                this.scoreName = scoreName;
                return this;
            }

            /**
             * ScoreNumber.
             */
            public Builder scoreNumber(String scoreNumber) {
                this.scoreNumber = scoreNumber;
                return this;
            }

            public HitScore build() {
                return new HitScore(this);
            } 

        } 

    }
    public static class ResultInfoHitScore extends TeaModel {
        @NameInMap("HitScore")
        private java.util.List < HitScore> hitScore;

        private ResultInfoHitScore(Builder builder) {
            this.hitScore = builder.hitScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoHitScore create() {
            return builder().build();
        }

        /**
         * @return hitScore
         */
        public java.util.List < HitScore> getHitScore() {
            return this.hitScore;
        }

        public static final class Builder {
            private java.util.List < HitScore> hitScore; 

            /**
             * HitScore.
             */
            public Builder hitScore(java.util.List < HitScore> hitScore) {
                this.hitScore = hitScore;
                return this;
            }

            public ResultInfoHitScore build() {
                return new ResultInfoHitScore(this);
            } 

        } 

    }
    public static class Recording extends TeaModel {
        @NameInMap("Business")
        private String business;

        @NameInMap("CallId")
        private String callId;

        @NameInMap("CallTime")
        private String callTime;

        @NameInMap("CallType")
        private Integer callType;

        @NameInMap("Callee")
        private String callee;

        @NameInMap("Caller")
        private String caller;

        @NameInMap("DataSetName")
        private String dataSetName;

        @NameInMap("DialogueSize")
        private Integer dialogueSize;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PrimaryId")
        private String primaryId;

        @NameInMap("Remark1")
        private String remark1;

        @NameInMap("Remark10")
        private String remark10;

        @NameInMap("Remark11")
        private String remark11;

        @NameInMap("Remark12")
        private String remark12;

        @NameInMap("Remark13")
        private String remark13;

        @NameInMap("Remark2")
        private String remark2;

        @NameInMap("Remark3")
        private String remark3;

        @NameInMap("Remark4")
        private String remark4;

        @NameInMap("Remark5")
        private Long remark5;

        @NameInMap("Remark6")
        private String remark6;

        @NameInMap("Remark7")
        private String remark7;

        @NameInMap("Remark8")
        private String remark8;

        @NameInMap("Remark9")
        private String remark9;

        @NameInMap("Url")
        private String url;

        private Recording(Builder builder) {
            this.business = builder.business;
            this.callId = builder.callId;
            this.callTime = builder.callTime;
            this.callType = builder.callType;
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.dataSetName = builder.dataSetName;
            this.dialogueSize = builder.dialogueSize;
            this.duration = builder.duration;
            this.id = builder.id;
            this.name = builder.name;
            this.primaryId = builder.primaryId;
            this.remark1 = builder.remark1;
            this.remark10 = builder.remark10;
            this.remark11 = builder.remark11;
            this.remark12 = builder.remark12;
            this.remark13 = builder.remark13;
            this.remark2 = builder.remark2;
            this.remark3 = builder.remark3;
            this.remark4 = builder.remark4;
            this.remark5 = builder.remark5;
            this.remark6 = builder.remark6;
            this.remark7 = builder.remark7;
            this.remark8 = builder.remark8;
            this.remark9 = builder.remark9;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recording create() {
            return builder().build();
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callTime
         */
        public String getCallTime() {
            return this.callTime;
        }

        /**
         * @return callType
         */
        public Integer getCallType() {
            return this.callType;
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return dataSetName
         */
        public String getDataSetName() {
            return this.dataSetName;
        }

        /**
         * @return dialogueSize
         */
        public Integer getDialogueSize() {
            return this.dialogueSize;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryId
         */
        public String getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return remark1
         */
        public String getRemark1() {
            return this.remark1;
        }

        /**
         * @return remark10
         */
        public String getRemark10() {
            return this.remark10;
        }

        /**
         * @return remark11
         */
        public String getRemark11() {
            return this.remark11;
        }

        /**
         * @return remark12
         */
        public String getRemark12() {
            return this.remark12;
        }

        /**
         * @return remark13
         */
        public String getRemark13() {
            return this.remark13;
        }

        /**
         * @return remark2
         */
        public String getRemark2() {
            return this.remark2;
        }

        /**
         * @return remark3
         */
        public String getRemark3() {
            return this.remark3;
        }

        /**
         * @return remark4
         */
        public String getRemark4() {
            return this.remark4;
        }

        /**
         * @return remark5
         */
        public Long getRemark5() {
            return this.remark5;
        }

        /**
         * @return remark6
         */
        public String getRemark6() {
            return this.remark6;
        }

        /**
         * @return remark7
         */
        public String getRemark7() {
            return this.remark7;
        }

        /**
         * @return remark8
         */
        public String getRemark8() {
            return this.remark8;
        }

        /**
         * @return remark9
         */
        public String getRemark9() {
            return this.remark9;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String business; 
            private String callId; 
            private String callTime; 
            private Integer callType; 
            private String callee; 
            private String caller; 
            private String dataSetName; 
            private Integer dialogueSize; 
            private Long duration; 
            private String id; 
            private String name; 
            private String primaryId; 
            private String remark1; 
            private String remark10; 
            private String remark11; 
            private String remark12; 
            private String remark13; 
            private String remark2; 
            private String remark3; 
            private String remark4; 
            private Long remark5; 
            private String remark6; 
            private String remark7; 
            private String remark8; 
            private String remark9; 
            private String url; 

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CallTime.
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * CallType.
             */
            public Builder callType(Integer callType) {
                this.callType = callType;
                return this;
            }

            /**
             * Callee.
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * DataSetName.
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * DialogueSize.
             */
            public Builder dialogueSize(Integer dialogueSize) {
                this.dialogueSize = dialogueSize;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PrimaryId.
             */
            public Builder primaryId(String primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * Remark1.
             */
            public Builder remark1(String remark1) {
                this.remark1 = remark1;
                return this;
            }

            /**
             * Remark10.
             */
            public Builder remark10(String remark10) {
                this.remark10 = remark10;
                return this;
            }

            /**
             * Remark11.
             */
            public Builder remark11(String remark11) {
                this.remark11 = remark11;
                return this;
            }

            /**
             * Remark12.
             */
            public Builder remark12(String remark12) {
                this.remark12 = remark12;
                return this;
            }

            /**
             * Remark13.
             */
            public Builder remark13(String remark13) {
                this.remark13 = remark13;
                return this;
            }

            /**
             * Remark2.
             */
            public Builder remark2(String remark2) {
                this.remark2 = remark2;
                return this;
            }

            /**
             * Remark3.
             */
            public Builder remark3(String remark3) {
                this.remark3 = remark3;
                return this;
            }

            /**
             * Remark4.
             */
            public Builder remark4(String remark4) {
                this.remark4 = remark4;
                return this;
            }

            /**
             * Remark5.
             */
            public Builder remark5(Long remark5) {
                this.remark5 = remark5;
                return this;
            }

            /**
             * Remark6.
             */
            public Builder remark6(String remark6) {
                this.remark6 = remark6;
                return this;
            }

            /**
             * Remark7.
             */
            public Builder remark7(String remark7) {
                this.remark7 = remark7;
                return this;
            }

            /**
             * Remark8.
             */
            public Builder remark8(String remark8) {
                this.remark8 = remark8;
                return this;
            }

            /**
             * Remark9.
             */
            public Builder remark9(String remark9) {
                this.remark9 = remark9;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Recording build() {
                return new Recording(this);
            } 

        } 

    }
    public static class SchemeIdList extends TeaModel {
        @NameInMap("SchemeIdList")
        private java.util.List < Long > schemeIdList;

        private SchemeIdList(Builder builder) {
            this.schemeIdList = builder.schemeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeIdList create() {
            return builder().build();
        }

        /**
         * @return schemeIdList
         */
        public java.util.List < Long > getSchemeIdList() {
            return this.schemeIdList;
        }

        public static final class Builder {
            private java.util.List < Long > schemeIdList; 

            /**
             * SchemeIdList.
             */
            public Builder schemeIdList(java.util.List < Long > schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            public SchemeIdList build() {
                return new SchemeIdList(this);
            } 

        } 

    }
    public static class SchemeNameList extends TeaModel {
        @NameInMap("SchemeNameList")
        private java.util.List < String > schemeNameList;

        private SchemeNameList(Builder builder) {
            this.schemeNameList = builder.schemeNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeNameList create() {
            return builder().build();
        }

        /**
         * @return schemeNameList
         */
        public java.util.List < String > getSchemeNameList() {
            return this.schemeNameList;
        }

        public static final class Builder {
            private java.util.List < String > schemeNameList; 

            /**
             * SchemeNameList.
             */
            public Builder schemeNameList(java.util.List < String > schemeNameList) {
                this.schemeNameList = schemeNameList;
                return this;
            }

            public SchemeNameList build() {
                return new SchemeNameList(this);
            } 

        } 

    }
    public static class ResultInfo extends TeaModel {
        @NameInMap("Agent")
        private Agent agent;

        @NameInMap("AsrResult")
        private ResultInfoAsrResult asrResult;

        @NameInMap("AssignmentTime")
        private String assignmentTime;

        @NameInMap("Comments")
        private String comments;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimeLong")
        private String createTimeLong;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("HitResult")
        private ResultInfoHitResult hitResult;

        @NameInMap("HitScore")
        private ResultInfoHitScore hitScore;

        @NameInMap("LastDataId")
        private String lastDataId;

        @NameInMap("Recording")
        private Recording recording;

        @NameInMap("Resolver")
        private String resolver;

        @NameInMap("ReviewResult")
        private Integer reviewResult;

        @NameInMap("ReviewStatus")
        private Integer reviewStatus;

        @NameInMap("ReviewTime")
        private String reviewTime;

        @NameInMap("ReviewTimeLong")
        private String reviewTimeLong;

        @NameInMap("ReviewType")
        private Integer reviewType;

        @NameInMap("Reviewer")
        private String reviewer;

        @NameInMap("SchemeIdList")
        private SchemeIdList schemeIdList;

        @NameInMap("SchemeNameList")
        private SchemeNameList schemeNameList;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private ResultInfo(Builder builder) {
            this.agent = builder.agent;
            this.asrResult = builder.asrResult;
            this.assignmentTime = builder.assignmentTime;
            this.comments = builder.comments;
            this.createTime = builder.createTime;
            this.createTimeLong = builder.createTimeLong;
            this.errorMessage = builder.errorMessage;
            this.hitResult = builder.hitResult;
            this.hitScore = builder.hitScore;
            this.lastDataId = builder.lastDataId;
            this.recording = builder.recording;
            this.resolver = builder.resolver;
            this.reviewResult = builder.reviewResult;
            this.reviewStatus = builder.reviewStatus;
            this.reviewTime = builder.reviewTime;
            this.reviewTimeLong = builder.reviewTimeLong;
            this.reviewType = builder.reviewType;
            this.reviewer = builder.reviewer;
            this.schemeIdList = builder.schemeIdList;
            this.schemeNameList = builder.schemeNameList;
            this.score = builder.score;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfo create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public Agent getAgent() {
            return this.agent;
        }

        /**
         * @return asrResult
         */
        public ResultInfoAsrResult getAsrResult() {
            return this.asrResult;
        }

        /**
         * @return assignmentTime
         */
        public String getAssignmentTime() {
            return this.assignmentTime;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeLong
         */
        public String getCreateTimeLong() {
            return this.createTimeLong;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return hitResult
         */
        public ResultInfoHitResult getHitResult() {
            return this.hitResult;
        }

        /**
         * @return hitScore
         */
        public ResultInfoHitScore getHitScore() {
            return this.hitScore;
        }

        /**
         * @return lastDataId
         */
        public String getLastDataId() {
            return this.lastDataId;
        }

        /**
         * @return recording
         */
        public Recording getRecording() {
            return this.recording;
        }

        /**
         * @return resolver
         */
        public String getResolver() {
            return this.resolver;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return reviewStatus
         */
        public Integer getReviewStatus() {
            return this.reviewStatus;
        }

        /**
         * @return reviewTime
         */
        public String getReviewTime() {
            return this.reviewTime;
        }

        /**
         * @return reviewTimeLong
         */
        public String getReviewTimeLong() {
            return this.reviewTimeLong;
        }

        /**
         * @return reviewType
         */
        public Integer getReviewType() {
            return this.reviewType;
        }

        /**
         * @return reviewer
         */
        public String getReviewer() {
            return this.reviewer;
        }

        /**
         * @return schemeIdList
         */
        public SchemeIdList getSchemeIdList() {
            return this.schemeIdList;
        }

        /**
         * @return schemeNameList
         */
        public SchemeNameList getSchemeNameList() {
            return this.schemeNameList;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private Agent agent; 
            private ResultInfoAsrResult asrResult; 
            private String assignmentTime; 
            private String comments; 
            private String createTime; 
            private String createTimeLong; 
            private String errorMessage; 
            private ResultInfoHitResult hitResult; 
            private ResultInfoHitScore hitScore; 
            private String lastDataId; 
            private Recording recording; 
            private String resolver; 
            private Integer reviewResult; 
            private Integer reviewStatus; 
            private String reviewTime; 
            private String reviewTimeLong; 
            private Integer reviewType; 
            private String reviewer; 
            private SchemeIdList schemeIdList; 
            private SchemeNameList schemeNameList; 
            private Integer score; 
            private Integer status; 
            private String taskId; 
            private String taskName; 

            /**
             * Agent.
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * AsrResult.
             */
            public Builder asrResult(ResultInfoAsrResult asrResult) {
                this.asrResult = asrResult;
                return this;
            }

            /**
             * AssignmentTime.
             */
            public Builder assignmentTime(String assignmentTime) {
                this.assignmentTime = assignmentTime;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimeLong.
             */
            public Builder createTimeLong(String createTimeLong) {
                this.createTimeLong = createTimeLong;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * HitResult.
             */
            public Builder hitResult(ResultInfoHitResult hitResult) {
                this.hitResult = hitResult;
                return this;
            }

            /**
             * HitScore.
             */
            public Builder hitScore(ResultInfoHitScore hitScore) {
                this.hitScore = hitScore;
                return this;
            }

            /**
             * LastDataId.
             */
            public Builder lastDataId(String lastDataId) {
                this.lastDataId = lastDataId;
                return this;
            }

            /**
             * Recording.
             */
            public Builder recording(Recording recording) {
                this.recording = recording;
                return this;
            }

            /**
             * Resolver.
             */
            public Builder resolver(String resolver) {
                this.resolver = resolver;
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
             * ReviewStatus.
             */
            public Builder reviewStatus(Integer reviewStatus) {
                this.reviewStatus = reviewStatus;
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
             * ReviewTimeLong.
             */
            public Builder reviewTimeLong(String reviewTimeLong) {
                this.reviewTimeLong = reviewTimeLong;
                return this;
            }

            /**
             * ReviewType.
             */
            public Builder reviewType(Integer reviewType) {
                this.reviewType = reviewType;
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
             * SchemeIdList.
             */
            public Builder schemeIdList(SchemeIdList schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            /**
             * SchemeNameList.
             */
            public Builder schemeNameList(SchemeNameList schemeNameList) {
                this.schemeNameList = schemeNameList;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
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
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public ResultInfo build() {
                return new ResultInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ResultInfo")
        private java.util.List < ResultInfo> resultInfo;

        private Data(Builder builder) {
            this.resultInfo = builder.resultInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resultInfo
         */
        public java.util.List < ResultInfo> getResultInfo() {
            return this.resultInfo;
        }

        public static final class Builder {
            private java.util.List < ResultInfo> resultInfo; 

            /**
             * ResultInfo.
             */
            public Builder resultInfo(java.util.List < ResultInfo> resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
