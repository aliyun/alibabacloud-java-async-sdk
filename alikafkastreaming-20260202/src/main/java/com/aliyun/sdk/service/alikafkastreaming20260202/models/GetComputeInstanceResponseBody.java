// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link GetComputeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeInstanceResponseBody</p>
 */
public class GetComputeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetComputeInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetComputeInstanceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019F5939-507B-57C1-B82C-E55821456FA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetComputeInstanceResponseBody build() {
            return new GetComputeInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComputeInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetComputeInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CuLimitSum")
        private Double cuLimitSum;

        @com.aliyun.core.annotation.NameInMap("CuReservedSum")
        private Double cuReservedSum;

        @com.aliyun.core.annotation.NameInMap("CuUsedSum")
        private Double cuUsedSum;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("TotalJobs")
        private Long totalJobs;

        @com.aliyun.core.annotation.NameInMap("TotalRunningJobs")
        private Long totalRunningJobs;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.cuLimitSum = builder.cuLimitSum;
            this.cuReservedSum = builder.cuReservedSum;
            this.cuUsedSum = builder.cuUsedSum;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceStatus = builder.serviceStatus;
            this.totalJobs = builder.totalJobs;
            this.totalRunningJobs = builder.totalRunningJobs;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cuLimitSum
         */
        public Double getCuLimitSum() {
            return this.cuLimitSum;
        }

        /**
         * @return cuReservedSum
         */
        public Double getCuReservedSum() {
            return this.cuReservedSum;
        }

        /**
         * @return cuUsedSum
         */
        public Double getCuUsedSum() {
            return this.cuUsedSum;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return totalJobs
         */
        public Long getTotalJobs() {
            return this.totalJobs;
        }

        /**
         * @return totalRunningJobs
         */
        public Long getTotalRunningJobs() {
            return this.totalRunningJobs;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String chargeType; 
            private String createTime; 
            private Double cuLimitSum; 
            private Double cuReservedSum; 
            private Double cuUsedSum; 
            private String expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 
            private String resourceGroupId; 
            private String serviceStatus; 
            private Long totalJobs; 
            private Long totalRunningJobs; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.cuLimitSum = model.cuLimitSum;
                this.cuReservedSum = model.cuReservedSum;
                this.cuUsedSum = model.cuUsedSum;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceStatus = model.serviceStatus;
                this.totalJobs = model.totalJobs;
                this.totalRunningJobs = model.totalRunningJobs;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>POST_PAID</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-02T16:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The total CU limit.</p>
             * 
             * <strong>example:</strong>
             * <p>4.0</p>
             */
            public Builder cuLimitSum(Double cuLimitSum) {
                this.cuLimitSum = cuLimitSum;
                return this;
            }

            /**
             * <p>The total number of reserved CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder cuReservedSum(Double cuReservedSum) {
                this.cuReservedSum = cuReservedSum;
                return this;
            }

            /**
             * <p>The total number of used CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2.5</p>
             */
            public Builder cuUsedSum(Double cuUsedSum) {
                this.cuUsedSum = cuUsedSum;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2027-09-02T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The compute instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka_streaming-cn-pe333xxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the compute instance.</p>
             * 
             * <strong>example:</strong>
             * <p>streaming-prod</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek53bg4tl6fgma</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The service status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The total number of jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalJobs(Long totalJobs) {
                this.totalJobs = totalJobs;
                return this;
            }

            /**
             * <p>The number of running jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalRunningJobs(Long totalRunningJobs) {
                this.totalRunningJobs = totalRunningJobs;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1abcdefg</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
