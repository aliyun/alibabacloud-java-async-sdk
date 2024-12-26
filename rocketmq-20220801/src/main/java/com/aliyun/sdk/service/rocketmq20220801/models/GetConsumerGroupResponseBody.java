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
 * {@link GetConsumerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerGroupResponseBody</p>
 */
public class GetConsumerGroupResponseBody extends TeaModel {
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

    private GetConsumerGroupResponseBody(Builder builder) {
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

    public static GetConsumerGroupResponseBody create() {
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

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidConsumerGroupId</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ConsumerGroupId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>consumerGroupId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter consumerGroupId is invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7F94090-3358-506A-97DC-34BC803C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumerGroupResponseBody build() {
            return new GetConsumerGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupResponseBody</p>
     */
    public static class ConsumeRetryPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deadLetterTargetTopic")
        private String deadLetterTargetTopic;

        @com.aliyun.core.annotation.NameInMap("maxRetryTimes")
        private Integer maxRetryTimes;

        @com.aliyun.core.annotation.NameInMap("retryPolicy")
        private String retryPolicy;

        private ConsumeRetryPolicy(Builder builder) {
            this.deadLetterTargetTopic = builder.deadLetterTargetTopic;
            this.maxRetryTimes = builder.maxRetryTimes;
            this.retryPolicy = builder.retryPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeRetryPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetTopic
         */
        public String getDeadLetterTargetTopic() {
            return this.deadLetterTargetTopic;
        }

        /**
         * @return maxRetryTimes
         */
        public Integer getMaxRetryTimes() {
            return this.maxRetryTimes;
        }

        /**
         * @return retryPolicy
         */
        public String getRetryPolicy() {
            return this.retryPolicy;
        }

        public static final class Builder {
            private String deadLetterTargetTopic; 
            private Integer maxRetryTimes; 
            private String retryPolicy; 

            /**
             * <p>The dead-letter topic.</p>
             * <p>If a consumer still fails to consume a message after the message is retried for a specified number of times, the message is delivered to a dead-letter topic for subsequent business recovery or troubleshooting. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry and dead-letter messages</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>DLQ_mqtest</p>
             */
            public Builder deadLetterTargetTopic(String deadLetterTargetTopic) {
                this.deadLetterTargetTopic = deadLetterTargetTopic;
                return this;
            }

            /**
             * <p>The maximum number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder maxRetryTimes(Integer maxRetryTimes) {
                this.maxRetryTimes = maxRetryTimes;
                return this;
            }

            /**
             * <p>The retry policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>FixedRetryPolicy</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>Failed messages are retried at a fixed interval</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>DefaultRetryPolicy</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>Failed messages are retried at incremental intervals as the number of retries increases</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DefaultRetryPolicy</p>
             */
            public Builder retryPolicy(String retryPolicy) {
                this.retryPolicy = retryPolicy;
                return this;
            }

            public ConsumeRetryPolicy build() {
                return new ConsumeRetryPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConsumerGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumeRetryPolicy")
        private ConsumeRetryPolicy consumeRetryPolicy;

        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("deliveryOrderType")
        private String deliveryOrderType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.consumeRetryPolicy = builder.consumeRetryPolicy;
            this.consumerGroupId = builder.consumerGroupId;
            this.createTime = builder.createTime;
            this.deliveryOrderType = builder.deliveryOrderType;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return consumeRetryPolicy
         */
        public ConsumeRetryPolicy getConsumeRetryPolicy() {
            return this.consumeRetryPolicy;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deliveryOrderType
         */
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private ConsumeRetryPolicy consumeRetryPolicy; 
            private String consumerGroupId; 
            private String createTime; 
            private String deliveryOrderType; 
            private String instanceId; 
            private String regionId; 
            private String remark; 
            private String status; 
            private String updateTime; 

            /**
             * <p>The consumption retry policy that you want to configure for the consumer group. For more information, see <a href="https://help.aliyun.com/document_detail/440356.html">Consumption retry</a>.</p>
             */
            public Builder consumeRetryPolicy(ConsumeRetryPolicy consumeRetryPolicy) {
                this.consumeRetryPolicy = consumeRetryPolicy;
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
             * <p>The time when the consumer group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 20:05:50</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The message delivery order of the consumer group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Concurrently</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>concurrent delivery</p>
             * <!-- -->
             * </li>
             * <li><p>Orderly</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>ordered delivery</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Concurrently</p>
             */
            public Builder deliveryOrderType(String deliveryOrderType) {
                this.deliveryOrderType = deliveryOrderType;
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
             * <p>The ID of the region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The remarks on the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>This is the remark for test.</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The state of the consumer group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>RUNNING</p>
             * <!-- -->
             * 
             * <p>: The consumer group is</p>
             * <!-- -->
             * 
             * <p>running</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * <li><p>CREATING</p>
             * <!-- -->
             * 
             * <p>: The consumer group is</p>
             * <!-- -->
             * 
             * <p>being created</p>
             * <!-- -->
             * 
             * <p>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the consumer group was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01 20:05:50</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
