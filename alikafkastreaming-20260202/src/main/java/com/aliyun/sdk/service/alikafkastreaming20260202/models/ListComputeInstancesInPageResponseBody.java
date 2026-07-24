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
 * {@link ListComputeInstancesInPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListComputeInstancesInPageResponseBody</p>
 */
public class ListComputeInstancesInPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListComputeInstancesInPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeInstancesInPageResponseBody create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long code; 
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListComputeInstancesInPageResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListComputeInstancesInPageResponseBody build() {
            return new ListComputeInstancesInPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeInstancesInPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeInstancesInPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenewFlag")
        private Boolean autoRenewFlag;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

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

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        @com.aliyun.core.annotation.NameInMap("TotalJobs")
        private Long totalJobs;

        @com.aliyun.core.annotation.NameInMap("TotalRunningJobs")
        private Long totalRunningJobs;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.autoRenewFlag = builder.autoRenewFlag;
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.cu = builder.cu;
            this.cuLimitSum = builder.cuLimitSum;
            this.cuReservedSum = builder.cuReservedSum;
            this.cuUsedSum = builder.cuUsedSum;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.owner = builder.owner;
            this.regionId = builder.regionId;
            this.serviceStatus = builder.serviceStatus;
            this.totalJobs = builder.totalJobs;
            this.totalRunningJobs = builder.totalRunningJobs;
            this.vSwitchIds = builder.vSwitchIds;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoRenewFlag
         */
        public Boolean getAutoRenewFlag() {
            return this.autoRenewFlag;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean autoRenewFlag; 
            private String chargeType; 
            private String commodityCode; 
            private String createTime; 
            private Integer cu; 
            private Double cuLimitSum; 
            private Double cuReservedSum; 
            private Double cuUsedSum; 
            private String expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String owner; 
            private String regionId; 
            private String serviceStatus; 
            private Long totalJobs; 
            private Long totalRunningJobs; 
            private java.util.List<String> vSwitchIds; 
            private String version; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoRenewFlag = model.autoRenewFlag;
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.createTime = model.createTime;
                this.cu = model.cu;
                this.cuLimitSum = model.cuLimitSum;
                this.cuReservedSum = model.cuReservedSum;
                this.cuUsedSum = model.cuUsedSum;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.owner = model.owner;
                this.regionId = model.regionId;
                this.serviceStatus = model.serviceStatus;
                this.totalJobs = model.totalJobs;
                this.totalRunningJobs = model.totalRunningJobs;
                this.vSwitchIds = model.vSwitchIds;
                this.version = model.version;
                this.vpcId = model.vpcId;
            } 

            /**
             * AutoRenewFlag.
             */
            public Builder autoRenewFlag(Boolean autoRenewFlag) {
                this.autoRenewFlag = autoRenewFlag;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
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
             * Cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
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
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
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
