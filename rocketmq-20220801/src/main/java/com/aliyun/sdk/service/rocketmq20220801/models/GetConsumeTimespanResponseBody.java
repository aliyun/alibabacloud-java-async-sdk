// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetConsumeTimespanResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumeTimespanResponseBody</p>
 */
public class GetConsumeTimespanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetConsumeTimespanResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumeTimespanResponseBody create() {
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetConsumeTimespanResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>MissingInstanceId</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter instanceId is mandatory for this action .</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID of the request. Use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C115601B-8736-5BBF-AC99-7FEAE1245A80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumeTimespanResponseBody build() {
            return new GetConsumeTimespanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumeTimespanResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumeTimespanResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumeTimestamp")
        private Long consumeTimestamp;

        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("maxTimestamp")
        private Long maxTimestamp;

        @com.aliyun.core.annotation.NameInMap("minTimestamp")
        private Long minTimestamp;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private Data(Builder builder) {
            this.consumeTimestamp = builder.consumeTimestamp;
            this.consumerGroupId = builder.consumerGroupId;
            this.instanceId = builder.instanceId;
            this.maxTimestamp = builder.maxTimestamp;
            this.minTimestamp = builder.minTimestamp;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumeTimestamp
         */
        public Long getConsumeTimestamp() {
            return this.consumeTimestamp;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxTimestamp
         */
        public Long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        /**
         * @return minTimestamp
         */
        public Long getMinTimestamp() {
            return this.minTimestamp;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long consumeTimestamp; 
            private String consumerGroupId; 
            private String instanceId; 
            private Long maxTimestamp; 
            private Long minTimestamp; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumeTimestamp = model.consumeTimestamp;
                this.consumerGroupId = model.consumerGroupId;
                this.instanceId = model.instanceId;
                this.maxTimestamp = model.maxTimestamp;
                this.minTimestamp = model.minTimestamp;
                this.topicName = model.topicName;
            } 

            /**
             * <p>The last time the consumer group consumed a message from this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026400</p>
             */
            public Builder consumeTimestamp(Long consumeTimestamp) {
                this.consumeTimestamp = consumeTimestamp;
                return this;
            }

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>CID-TEST</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-7e22ody****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The production time of the latest message in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026833</p>
             */
            public Builder maxTimestamp(Long maxTimestamp) {
                this.maxTimestamp = maxTimestamp;
                return this;
            }

            /**
             * <p>The production time of the earliest message in the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026222</p>
             */
            public Builder minTimestamp(Long minTimestamp) {
                this.minTimestamp = minTimestamp;
                return this;
            }

            /**
             * <p>The topic to which the consumer group subscribes.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_test</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
