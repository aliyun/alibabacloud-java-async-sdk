// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretAsrDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretAsrDetailResponseBody</p>
 */
public class GetSecretAsrDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetSecretAsrDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretAsrDetailResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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

        public GetSecretAsrDetailResponseBody build() {
            return new GetSecretAsrDetailResponseBody(this);
        } 

    } 

    public static class Sentences extends TeaModel {
        @NameInMap("BeginTime")
        private Long beginTime;

        @NameInMap("ChannelId")
        private Integer channelId;

        @NameInMap("EmotionValue")
        private String emotionValue;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("SilenceDuration")
        private Long silenceDuration;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Text")
        private String text;

        private Sentences(Builder builder) {
            this.beginTime = builder.beginTime;
            this.channelId = builder.channelId;
            this.emotionValue = builder.emotionValue;
            this.endTime = builder.endTime;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sentences create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return channelId
         */
        public Integer getChannelId() {
            return this.channelId;
        }

        /**
         * @return emotionValue
         */
        public String getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return silenceDuration
         */
        public Long getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Long beginTime; 
            private Integer channelId; 
            private String emotionValue; 
            private Long endTime; 
            private Long silenceDuration; 
            private Integer speechRate; 
            private String text; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(Integer channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * EmotionValue.
             */
            public Builder emotionValue(String emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * SilenceDuration.
             */
            public Builder silenceDuration(Long silenceDuration) {
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
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Sentences build() {
                return new Sentences(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BizDuration")
        private Long bizDuration;

        @NameInMap("BusinessId")
        private String businessId;

        @NameInMap("BusinessKey")
        private String businessKey;

        @NameInMap("Code")
        private String code;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("Sentences")
        private java.util.List < Sentences> sentences;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.bizDuration = builder.bizDuration;
            this.businessId = builder.businessId;
            this.businessKey = builder.businessKey;
            this.code = builder.code;
            this.msg = builder.msg;
            this.requestId = builder.requestId;
            this.sentences = builder.sentences;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizDuration
         */
        public Long getBizDuration() {
            return this.bizDuration;
        }

        /**
         * @return businessId
         */
        public String getBusinessId() {
            return this.businessId;
        }

        /**
         * @return businessKey
         */
        public String getBusinessKey() {
            return this.businessKey;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return sentences
         */
        public java.util.List < Sentences> getSentences() {
            return this.sentences;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizDuration; 
            private String businessId; 
            private String businessKey; 
            private String code; 
            private String msg; 
            private String requestId; 
            private java.util.List < Sentences> sentences; 
            private String type; 

            /**
             * BizDuration.
             */
            public Builder bizDuration(Long bizDuration) {
                this.bizDuration = bizDuration;
                return this;
            }

            /**
             * BusinessId.
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * BusinessKey.
             */
            public Builder businessKey(String businessKey) {
                this.businessKey = businessKey;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
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
             * Sentences.
             */
            public Builder sentences(java.util.List < Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
