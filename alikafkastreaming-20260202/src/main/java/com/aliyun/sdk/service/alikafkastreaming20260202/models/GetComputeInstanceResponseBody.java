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
         * Code.
         */
        public Builder code(Long code) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("ServiceVersion")
        private String serviceVersion;

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
            this.orderId = builder.orderId;
            this.regionId = builder.regionId;
            this.serviceStatus = builder.serviceStatus;
            this.serviceVersion = builder.serviceVersion;
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
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
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
            private String orderId; 
            private String regionId; 
            private String serviceStatus; 
            private String serviceVersion; 
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
                this.orderId = model.orderId;
                this.regionId = model.regionId;
                this.serviceStatus = model.serviceStatus;
                this.serviceVersion = model.serviceVersion;
                this.totalJobs = model.totalJobs;
                this.totalRunningJobs = model.totalRunningJobs;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CuLimitSum.
             */
            public Builder cuLimitSum(Double cuLimitSum) {
                this.cuLimitSum = cuLimitSum;
                return this;
            }

            /**
             * CuReservedSum.
             */
            public Builder cuReservedSum(Double cuReservedSum) {
                this.cuReservedSum = cuReservedSum;
                return this;
            }

            /**
             * CuUsedSum.
             */
            public Builder cuUsedSum(Double cuUsedSum) {
                this.cuUsedSum = cuUsedSum;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            /**
             * TotalJobs.
             */
            public Builder totalJobs(Long totalJobs) {
                this.totalJobs = totalJobs;
                return this;
            }

            /**
             * TotalRunningJobs.
             */
            public Builder totalRunningJobs(Long totalRunningJobs) {
                this.totalRunningJobs = totalRunningJobs;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
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
