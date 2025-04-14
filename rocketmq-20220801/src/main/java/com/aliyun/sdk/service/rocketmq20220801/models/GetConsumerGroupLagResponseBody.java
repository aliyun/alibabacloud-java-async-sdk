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
 * {@link GetConsumerGroupLagResponseBody} extends {@link TeaModel}
 *
 * <p>GetConsumerGroupLagResponseBody</p>
 */
public class GetConsumerGroupLagResponseBody extends TeaModel {
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

    private GetConsumerGroupLagResponseBody(Builder builder) {
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

    public static GetConsumerGroupLagResponseBody create() {
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

        private Builder(GetConsumerGroupLagResponseBody model) {
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
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>Topic.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Dynamic error code</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter instanceId is mandatory for this action .</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5764C40-FB8C-53AE-B95D-96AB3D0E9375</p>
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

        public GetConsumerGroupLagResponseBody build() {
            return new GetConsumerGroupLagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConsumerGroupLagResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupLagResponseBody</p>
     */
    public static class TotalLag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deliveryDuration")
        private Long deliveryDuration;

        @com.aliyun.core.annotation.NameInMap("inflightCount")
        private Long inflightCount;

        @com.aliyun.core.annotation.NameInMap("lastConsumeTimestamp")
        private Long lastConsumeTimestamp;

        @com.aliyun.core.annotation.NameInMap("readyCount")
        private Long readyCount;

        private TotalLag(Builder builder) {
            this.deliveryDuration = builder.deliveryDuration;
            this.inflightCount = builder.inflightCount;
            this.lastConsumeTimestamp = builder.lastConsumeTimestamp;
            this.readyCount = builder.readyCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalLag create() {
            return builder().build();
        }

        /**
         * @return deliveryDuration
         */
        public Long getDeliveryDuration() {
            return this.deliveryDuration;
        }

        /**
         * @return inflightCount
         */
        public Long getInflightCount() {
            return this.inflightCount;
        }

        /**
         * @return lastConsumeTimestamp
         */
        public Long getLastConsumeTimestamp() {
            return this.lastConsumeTimestamp;
        }

        /**
         * @return readyCount
         */
        public Long getReadyCount() {
            return this.readyCount;
        }

        public static final class Builder {
            private Long deliveryDuration; 
            private Long inflightCount; 
            private Long lastConsumeTimestamp; 
            private Long readyCount; 

            private Builder() {
            } 

            private Builder(TotalLag model) {
                this.deliveryDuration = model.deliveryDuration;
                this.inflightCount = model.inflightCount;
                this.lastConsumeTimestamp = model.lastConsumeTimestamp;
                this.readyCount = model.readyCount;
            } 

            /**
             * <p>Delivery delay time, in seconds</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder deliveryDuration(Long deliveryDuration) {
                this.deliveryDuration = deliveryDuration;
                return this;
            }

            /**
             * <p>The number of messages being consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inflightCount(Long inflightCount) {
                this.inflightCount = inflightCount;
                return this;
            }

            /**
             * <p>Last consumption time</p>
             * 
             * <strong>example:</strong>
             * <p>1735629607846</p>
             */
            public Builder lastConsumeTimestamp(Long lastConsumeTimestamp) {
                this.lastConsumeTimestamp = lastConsumeTimestamp;
                return this;
            }

            /**
             * <p>Ready message count</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder readyCount(Long readyCount) {
                this.readyCount = readyCount;
                return this;
            }

            public TotalLag build() {
                return new TotalLag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConsumerGroupLagResponseBody} extends {@link TeaModel}
     *
     * <p>GetConsumerGroupLagResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicLagMap")
        private java.util.Map<String, DataTopicLagMapValue> topicLagMap;

        @com.aliyun.core.annotation.NameInMap("totalLag")
        private TotalLag totalLag;

        private Data(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.topicLagMap = builder.topicLagMap;
            this.totalLag = builder.totalLag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topicLagMap
         */
        public java.util.Map<String, DataTopicLagMapValue> getTopicLagMap() {
            return this.topicLagMap;
        }

        /**
         * @return totalLag
         */
        public TotalLag getTotalLag() {
            return this.totalLag;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String instanceId; 
            private String regionId; 
            private java.util.Map<String, DataTopicLagMapValue> topicLagMap; 
            private TotalLag totalLag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.consumerGroupId = model.consumerGroupId;
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.topicLagMap = model.topicLagMap;
                this.totalLag = model.totalLag;
            } 

            /**
             * <p>Consumer Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>CID-TEST</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-7e22ody****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Backlog for each topic</p>
             */
            public Builder topicLagMap(java.util.Map<String, DataTopicLagMapValue> topicLagMap) {
                this.topicLagMap = topicLagMap;
                return this;
            }

            /**
             * <p>Total lag count</p>
             */
            public Builder totalLag(TotalLag totalLag) {
                this.totalLag = totalLag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
