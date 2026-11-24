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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9079DD86-09F1-5303-A64F-D9089F96BC16</p>
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

        /**
         * <p>The total number of entries that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.autoRenewFlag = builder.autoRenewFlag;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean autoRenewFlag; 
            private String chargeType; 
            private String createTime; 
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
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoRenewFlag = model.autoRenewFlag;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
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
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>Indicates whether auto-renewal is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenewFlag(Boolean autoRenewFlag) {
                this.autoRenewFlag = autoRenewFlag;
                return this;
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
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
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
             * <p>alikafka_streaming-cn-xxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>streaming-prod</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The owner of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * <p>The VPC ID.</p>
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
