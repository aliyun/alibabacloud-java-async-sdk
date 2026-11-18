// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link CreateTairAIGatewayInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTairAIGatewayInstanceResponseBody</p>
 */
public class CreateTairAIGatewayInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceResults")
    private InstanceResults instanceResults;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VClusterId")
    private String vClusterId;

    @com.aliyun.core.annotation.NameInMap("VkName")
    private String vkName;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateTairAIGatewayInstanceResponseBody(Builder builder) {
        this.failCount = builder.failCount;
        this.instanceId = builder.instanceId;
        this.instanceResults = builder.instanceResults;
        this.nodeId = builder.nodeId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.totalCount = builder.totalCount;
        this.vClusterId = builder.vClusterId;
        this.vkName = builder.vkName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTairAIGatewayInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceResults
     */
    public InstanceResults getInstanceResults() {
        return this.instanceResults;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vClusterId
     */
    public String getVClusterId() {
        return this.vClusterId;
    }

    /**
     * @return vkName
     */
    public String getVkName() {
        return this.vkName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Integer failCount; 
        private String instanceId; 
        private InstanceResults instanceResults; 
        private String nodeId; 
        private Long orderId; 
        private String regionId; 
        private String requestId; 
        private Integer successCount; 
        private Integer totalCount; 
        private String vClusterId; 
        private String vkName; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(CreateTairAIGatewayInstanceResponseBody model) {
            this.failCount = model.failCount;
            this.instanceId = model.instanceId;
            this.instanceResults = model.instanceResults;
            this.nodeId = model.nodeId;
            this.orderId = model.orderId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
            this.totalCount = model.totalCount;
            this.vClusterId = model.vClusterId;
            this.vkName = model.vkName;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The number of instances that failed to be created in a batch. This parameter is not returned when a single instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tg-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceResults.
         */
        public Builder instanceResults(InstanceResults instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. The ID of the virtual node.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****-db-0</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20881824000****</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of instances successfully created in a batch. This parameter is not returned when a single instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The total number of instances created in a batch. This parameter is not returned when a single instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. The ID of the virtual cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>vc-16965a9267*****-*****</p>
         */
        public Builder vClusterId(String vClusterId) {
            this.vClusterId = vClusterId;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated. The instance ID of the VCluster virtual cluster where the VNode resides.</p>
         * 
         * <strong>example:</strong>
         * <p>tk-2ze4bba3c8fe****</p>
         */
        public Builder vkName(String vkName) {
            this.vkName = vkName;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-l</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateTairAIGatewayInstanceResponseBody build() {
            return new CreateTairAIGatewayInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTairAIGatewayInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTairAIGatewayInstanceResponseBody</p>
     */
    public static class InstanceResultsInstanceResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private InstanceResultsInstanceResults(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResultsInstanceResults create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String instanceId; 
            private Long orderId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(InstanceResultsInstanceResults model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.instanceId = model.instanceId;
                this.orderId = model.orderId;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tg-bp1zxszhcgatnx****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20881824000****</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public InstanceResultsInstanceResults build() {
                return new InstanceResultsInstanceResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTairAIGatewayInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTairAIGatewayInstanceResponseBody</p>
     */
    public static class InstanceResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceResults")
        private java.util.List<InstanceResultsInstanceResults> instanceResults;

        private InstanceResults(Builder builder) {
            this.instanceResults = builder.instanceResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResults create() {
            return builder().build();
        }

        /**
         * @return instanceResults
         */
        public java.util.List<InstanceResultsInstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

        public static final class Builder {
            private java.util.List<InstanceResultsInstanceResults> instanceResults; 

            private Builder() {
            } 

            private Builder(InstanceResults model) {
                this.instanceResults = model.instanceResults;
            } 

            /**
             * instanceResults.
             */
            public Builder instanceResults(java.util.List<InstanceResultsInstanceResults> instanceResults) {
                this.instanceResults = instanceResults;
                return this;
            }

            public InstanceResults build() {
                return new InstanceResults(this);
            } 

        } 

    }
}
