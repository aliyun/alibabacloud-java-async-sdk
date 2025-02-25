// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link GetSecretAsrDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecretAsrDetailResponseBody</p>
 */
public class GetSecretAsrDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ASR details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSecretAsrDetailResponseBody build() {
            return new GetSecretAsrDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecretAsrDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecretAsrDetailResponseBody</p>
     */
    public static class Sentences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private Integer channelId;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private String emotionValue;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SilenceDuration")
        private Long silenceDuration;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Text")
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
             * <p>The start time offset of the sentence. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1020</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The ID of the audio track to which the sentence belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder channelId(Integer channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The emotion value. Value range: 1 to 10. The higher the value, the stronger the emotion.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder emotionValue(String emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * <p>The end time offset of the sentence. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1770</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The silence duration between the current sentence and the previous sentence. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder silenceDuration(Long silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * <p>The average speech rate of the sentence. Unit: number of words per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * <p>The recognition result of the sentence.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello</p>
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
    /**
     * 
     * {@link GetSecretAsrDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecretAsrDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDuration")
        private Long bizDuration;

        @com.aliyun.core.annotation.NameInMap("BusinessId")
        private String businessId;

        @com.aliyun.core.annotation.NameInMap("BusinessKey")
        private String businessKey;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Sentences")
        private java.util.List<Sentences> sentences;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public java.util.List<Sentences> getSentences() {
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
            private java.util.List<Sentences> sentences; 
            private String type; 

            /**
             * <p>The total duration of the audio file that was recognized. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10944</p>
             */
            public Builder bizDuration(Long bizDuration) {
                this.bizDuration = bizDuration;
                return this;
            }

            /**
             * <p>The ID of the business process.</p>
             * 
             * <strong>example:</strong>
             * <p>435ee78c7a019650@!FC100000074672458@!2020061522****</p>
             */
            public Builder businessId(String businessId) {
                this.businessId = businessId;
                return this;
            }

            /**
             * <p>The business keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>JCGTncltuNao****</p>
             */
            public Builder businessKey(String businessKey) {
                this.businessKey = businessKey;
                return this;
            }

            /**
             * <p>The status code. The status code 21050000 indicates that the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>21050000</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8d2329d407a83447a83be441681f4872ac74nE</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The ASR result.</p>
             */
            public Builder sentences(java.util.List<Sentences> sentences) {
                this.sentences = sentences;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>asrResult</p>
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
