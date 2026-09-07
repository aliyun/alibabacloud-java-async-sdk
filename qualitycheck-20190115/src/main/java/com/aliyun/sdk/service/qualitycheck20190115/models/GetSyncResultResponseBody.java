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
 * {@link GetSyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyncResultResponseBody</p>
 */
public class GetSyncResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCountId")
    private String resultCountId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSyncResultResponseBody(Builder builder) {
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

    public static GetSyncResultResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCountId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSyncResultResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultCountId = model.resultCountId;
            this.success = model.success;
        } 

        /**
         * <p>Result code. A value of 200 indicates success. Any other value indicates failure. The caller can use this field to determine the cause of failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>Query result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Error details when an error occurs; &quot;successful&quot; when the operation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>76DB5D8C-5BD9-42A7-B527-5AF3A5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Internal field. Ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder resultCountId(String resultCountId) {
            this.resultCountId = resultCountId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded. The caller can use this field to determine the request status: true indicates success; false or null indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSyncResultResponseBody build() {
            return new GetSyncResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillGroup")
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

            private Builder() {
            } 

            private Builder(Agent model) {
                this.id = model.id;
                this.name = model.name;
                this.skillGroup = model.skillGroup;
            } 

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12221</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Agent name</p>
             * 
             * <strong>example:</strong>
             * <p>李四</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Skill group name</p>
             * 
             * <strong>example:</strong>
             * <p>客服组</p>
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
    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class AsrResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Integer silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private AsrResult(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.role = builder.role;
            this.silenceDuration = builder.silenceDuration;
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
            private String role; 
            private Integer silenceDuration; 
            private Integer speechRate; 
            private String words; 

            private Builder() {
            } 

            private Builder(AsrResult model) {
                this.begin = model.begin;
                this.emotionValue = model.emotionValue;
                this.end = model.end;
                this.role = model.role;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.words = model.words;
            } 

            /**
             * <p>The start time of this sentence, which is the offset from the starting point in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>340</p>
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>Emotion intensity value ranging from 1 to 10. A higher value indicates stronger emotion.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>The end time of this sentence, which is the offset from the starting point in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Role in the dialogue content. Possible values: agent, Customer.</p>
             * 
             * <strong>example:</strong>
             * <p>客服</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Internal field. Ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder silenceDuration(Integer silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>The average speech rate of this sentence, in characters per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>221</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>Dialogue content.</p>
             * 
             * <strong>example:</strong>
             * <p>您好，很高兴为您服务</p>
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
    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class KeyWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private String cid;

        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        @com.aliyun.core.annotation.NameInMap("Val")
        private String val;

        private KeyWords(Builder builder) {
            this.cid = builder.cid;
            this.from = builder.from;
            this.to = builder.to;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyWords create() {
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

            private Builder() {
            } 

            private Builder(KeyWords model) {
                this.cid = model.cid;
                this.from = model.from;
                this.to = model.to;
                this.val = model.val;
            } 

            /**
             * <p>The ID of the condition that was hit.</p>
             * 
             * <strong>example:</strong>
             * <p>66666</p>
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * <p>The starting character position (inclusive) of the keyword to be highlighted. The value starts from 0 and can be at most the total number of characters in the sentence minus 1.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The ending character position (exclusive) of the keyword to be highlighted. The maximum value is the total number of characters in the sentence minus 1. For example, in the sentence “不可能给你退货的”, if from=0 and to=3, the highlighted keyword is “不可能”, which consists of three characters.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            /**
             * <p>The exact keyword content.</p>
             * 
             * <strong>example:</strong>
             * <p>投诉</p>
             */
            public Builder val(String val) {
                this.val = val;
                return this;
            }

            public KeyWords build() {
                return new KeyWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

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
            private Integer end; 
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
                this.role = model.role;
                this.silenceDuration = model.silenceDuration;
                this.speechRate = model.speechRate;
                this.words = model.words;
            } 

            /**
             * <p>The Start Time of this sentence, represented as an offset in milliseconds from the starting point.</p>
             * 
             * <strong>example:</strong>
             * <p>440</p>
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>Emotion intensity value ranging from 1 to 10. A higher value indicates stronger emotion.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>The End Time of this sentence, represented as an offset in milliseconds from the starting point.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The role in the conversation content. Possible values: agent, Customer, System.</p>
             * 
             * <strong>example:</strong>
             * <p>客服</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Internal field. Ignore.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder silenceDuration(Integer silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>The speech rate of this sentence.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>A sentence spoken by this role.</p>
             * 
             * <strong>example:</strong>
             * <p>我要投诉</p>
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
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class Hits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private java.util.List<String> cid;

        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private java.util.List<KeyWords> keyWords;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private Phrase phrase;

        private Hits(Builder builder) {
            this.cid = builder.cid;
            this.keyWords = builder.keyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hits create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public java.util.List<String> getCid() {
            return this.cid;
        }

        /**
         * @return keyWords
         */
        public java.util.List<KeyWords> getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private java.util.List<String> cid; 
            private java.util.List<KeyWords> keyWords; 
            private Phrase phrase; 

            private Builder() {
            } 

            private Builder(Hits model) {
                this.cid = model.cid;
                this.keyWords = model.keyWords;
                this.phrase = model.phrase;
            } 

            /**
             * <p>List of hit condition IDs.</p>
             */
            public Builder cid(java.util.List<String> cid) {
                this.cid = cid;
                return this;
            }

            /**
             * <p>Returns the specific characters in the current sentence that hit the rule, which are the keywords to be highlighted.</p>
             */
            public Builder keyWords(java.util.List<KeyWords> keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>Details of the sentence that hit the current rule.</p>
             */
            public Builder phrase(Phrase phrase) {
                this.phrase = phrase;
                return this;
            }

            public Hits build() {
                return new Hits(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class HitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hits")
        private java.util.List<Hits> hits;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private HitResult(Builder builder) {
            this.hits = builder.hits;
            this.name = builder.name;
            this.reviewResult = builder.reviewResult;
            this.rid = builder.rid;
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
        public java.util.List<Hits> getHits() {
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Hits> hits; 
            private String name; 
            private Integer reviewResult; 
            private String rid; 
            private String type; 

            private Builder() {
            } 

            private Builder(HitResult model) {
                this.hits = model.hits;
                this.name = model.name;
                this.reviewResult = model.reviewResult;
                this.rid = model.rid;
                this.type = model.type;
            } 

            /**
             * <p>Specific hit location information. At the sentence dimension, returns which condition in the rule was hit and which specific characters triggered the hit within the sentence.</p>
             */
            public Builder hits(java.util.List<Hits> hits) {
                this.hits = hits;
                return this;
            }

            /**
             * <p>Hit rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试规则</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Review accuracy; possible values: 0 (fault); 1 (correct).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * <p>Hit rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1211</p>
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * <p>Rule type associated with the hit rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class Recording extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallTime")
        private String callTime;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Integer callType;

        @com.aliyun.core.annotation.NameInMap("Callee")
        private String callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("DataSetName")
        private String dataSetName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("DurationAudio")
        private Long durationAudio;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryId")
        private String primaryId;

        @com.aliyun.core.annotation.NameInMap("Remark1")
        private String remark1;

        @com.aliyun.core.annotation.NameInMap("Remark2")
        private String remark2;

        @com.aliyun.core.annotation.NameInMap("Remark3")
        private String remark3;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Recording(Builder builder) {
            this.business = builder.business;
            this.callId = builder.callId;
            this.callTime = builder.callTime;
            this.callType = builder.callType;
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.dataSetName = builder.dataSetName;
            this.duration = builder.duration;
            this.durationAudio = builder.durationAudio;
            this.id = builder.id;
            this.name = builder.name;
            this.primaryId = builder.primaryId;
            this.remark1 = builder.remark1;
            this.remark2 = builder.remark2;
            this.remark3 = builder.remark3;
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
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return durationAudio
         */
        public Long getDurationAudio() {
            return this.durationAudio;
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
            private Long duration; 
            private Long durationAudio; 
            private String id; 
            private String name; 
            private String primaryId; 
            private String remark1; 
            private String remark2; 
            private String remark3; 
            private String url; 

            private Builder() {
            } 

            private Builder(Recording model) {
                this.business = model.business;
                this.callId = model.callId;
                this.callTime = model.callTime;
                this.callType = model.callType;
                this.callee = model.callee;
                this.caller = model.caller;
                this.dataSetName = model.dataSetName;
                this.duration = model.duration;
                this.durationAudio = model.durationAudio;
                this.id = model.id;
                this.name = model.name;
                this.primaryId = model.primaryId;
                this.remark1 = model.remark1;
                this.remark2 = model.remark2;
                this.remark3 = model.remark3;
                this.url = model.url;
            } 

            /**
             * <p>Line-of-business name.</p>
             * 
             * <strong>example:</strong>
             * <p>客服部</p>
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>Recording generation UNIX timestamp, accurate to milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1563967699000</p>
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * <p>Call type:  </p>
             * <ul>
             * <li>1: Outgoing call  </li>
             * <li>3: Incoming call</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callType(Integer callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>Callee number.</p>
             * 
             * <strong>example:</strong>
             * <p>1888888***</p>
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * <p>Caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>0108888****</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>Internal field. Ignore this.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * <p>Total number of words in the conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>232</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder durationAudio(Long durationAudio) {
                this.durationAudio = durationAudio;
                return this;
            }

            /**
             * <p>File ID, which is the callId in the request parameters. If not specified, a random ID will be generated.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Recording file name.</p>
             * 
             * <strong>example:</strong>
             * <p>123123.wav</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Internal field. Ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder primaryId(String primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * <p>Custom data 1.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder remark1(String remark1) {
                this.remark1 = remark1;
                return this;
            }

            /**
             * <p>Custom data 2.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder remark2(String remark2) {
                this.remark2 = remark2;
                return this;
            }

            /**
             * <p>Custom data 3.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder remark3(String remark3) {
                this.remark3 = remark3;
                return this;
            }

            /**
             * <p>Recording file URL, used for playback.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://aliyun.com/xxx.wav">http://aliyun.com/xxx.wav</a></p>
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
    /**
     * 
     * {@link GetSyncResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyncResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Agent agent;

        @com.aliyun.core.annotation.NameInMap("AsrResult")
        private java.util.List<AsrResult> asrResult;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("HitResult")
        private java.util.List<HitResult> hitResult;

        @com.aliyun.core.annotation.NameInMap("Recording")
        private Recording recording;

        @com.aliyun.core.annotation.NameInMap("Resolver")
        private String resolver;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("ReviewStatus")
        private Integer reviewStatus;

        @com.aliyun.core.annotation.NameInMap("Reviewer")
        private String reviewer;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private Data(Builder builder) {
            this.agent = builder.agent;
            this.asrResult = builder.asrResult;
            this.comments = builder.comments;
            this.createTime = builder.createTime;
            this.errorMessage = builder.errorMessage;
            this.hitResult = builder.hitResult;
            this.recording = builder.recording;
            this.resolver = builder.resolver;
            this.reviewResult = builder.reviewResult;
            this.reviewStatus = builder.reviewStatus;
            this.reviewer = builder.reviewer;
            this.score = builder.score;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
        public java.util.List<AsrResult> getAsrResult() {
            return this.asrResult;
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return hitResult
         */
        public java.util.List<HitResult> getHitResult() {
            return this.hitResult;
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
         * @return reviewer
         */
        public String getReviewer() {
            return this.reviewer;
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
            private java.util.List<AsrResult> asrResult; 
            private String comments; 
            private String createTime; 
            private String errorMessage; 
            private java.util.List<HitResult> hitResult; 
            private Recording recording; 
            private String resolver; 
            private Integer reviewResult; 
            private Integer reviewStatus; 
            private String reviewer; 
            private Integer score; 
            private Integer status; 
            private String taskId; 
            private String taskName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agent = model.agent;
                this.asrResult = model.asrResult;
                this.comments = model.comments;
                this.createTime = model.createTime;
                this.errorMessage = model.errorMessage;
                this.hitResult = model.hitResult;
                this.recording = model.recording;
                this.resolver = model.resolver;
                this.reviewResult = model.reviewResult;
                this.reviewStatus = model.reviewStatus;
                this.reviewer = model.reviewer;
                this.score = model.score;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
            } 

            /**
             * <p>Agent information</p>
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * <p>Transcription result (dialogue text)</p>
             */
            public Builder asrResult(java.util.List<AsrResult> asrResult) {
                this.asrResult = asrResult;
                return this;
            }

            /**
             * <p>Review comments.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>Job Creation Time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-24T19:31Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>When status is neither 0 nor 1, this field indicates the Error Details.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Rule hit result.</p>
             */
            public Builder hitResult(java.util.List<HitResult> hitResult) {
                this.hitResult = hitResult;
                return this;
            }

            /**
             * <p>Recording file information</p>
             */
            public Builder recording(Recording recording) {
                this.recording = recording;
                return this;
            }

            /**
             * <p>The quality inspector who actually reviewed the task.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder resolver(String resolver) {
                this.resolver = resolver;
                return this;
            }

            /**
             * <p>Review accuracy. Possible values: 0 (fault); 1 (correct); 2 (partially correct); 3 (pending review).</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * <p>Review status; possible values: 0 (not reviewed); 1 (reviewed).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reviewStatus(Integer reviewStatus) {
                this.reviewStatus = reviewStatus;
                return this;
            }

            /**
             * <p>Username of the assigned quality inspector.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder reviewer(String reviewer) {
                this.reviewer = reviewer;
                return this;
            }

            /**
             * <p>Quality inspection score, with a maximum of 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Current job status. Possible values: 0 (not completed); 1 (completed). The caller can use this field to determine whether the job is complete. Values other than 0 or 1 indicate an error; see the errorMessage field for Error Details.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20201231de3d34ec-40fa-4a55-8d27-76ea*****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Internal field. Ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
