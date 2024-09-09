// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * dynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetConsumerGroupLagResponseBody build() {
            return new GetConsumerGroupLagResponseBody(this);
        } 

    } 

    public static class TotalLag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deliveryDuration")
        private Long deliveryDuration;

        @com.aliyun.core.annotation.NameInMap("inflightCount")
        private Long inflightCount;

        @com.aliyun.core.annotation.NameInMap("readyCount")
        private Long readyCount;

        private TotalLag(Builder builder) {
            this.deliveryDuration = builder.deliveryDuration;
            this.inflightCount = builder.inflightCount;
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
         * @return readyCount
         */
        public Long getReadyCount() {
            return this.readyCount;
        }

        public static final class Builder {
            private Long deliveryDuration; 
            private Long inflightCount; 
            private Long readyCount; 

            /**
             * deliveryDuration.
             */
            public Builder deliveryDuration(Long deliveryDuration) {
                this.deliveryDuration = deliveryDuration;
                return this;
            }

            /**
             * inflightCount.
             */
            public Builder inflightCount(Long inflightCount) {
                this.inflightCount = inflightCount;
                return this;
            }

            /**
             * readyCount.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicLagMap")
        private java.util.Map < String, DataTopicLagMapValue > topicLagMap;

        @com.aliyun.core.annotation.NameInMap("totalLag")
        private TotalLag totalLag;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.topicLagMap = builder.topicLagMap;
            this.totalLag = builder.totalLag;
            this.updateTime = builder.updateTime;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public java.util.Map < String, DataTopicLagMapValue > getTopicLagMap() {
            return this.topicLagMap;
        }

        /**
         * @return totalLag
         */
        public TotalLag getTotalLag() {
            return this.totalLag;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String createTime; 
            private String instanceId; 
            private String regionId; 
            private java.util.Map < String, DataTopicLagMapValue > topicLagMap; 
            private TotalLag totalLag; 
            private String updateTime; 

            /**
             * consumerGroupId.
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * topicLagMap.
             */
            public Builder topicLagMap(java.util.Map < String, DataTopicLagMapValue > topicLagMap) {
                this.topicLagMap = topicLagMap;
                return this;
            }

            /**
             * totalLag.
             */
            public Builder totalLag(TotalLag totalLag) {
                this.totalLag = totalLag;
                return this;
            }

            /**
             * updateTime.
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
