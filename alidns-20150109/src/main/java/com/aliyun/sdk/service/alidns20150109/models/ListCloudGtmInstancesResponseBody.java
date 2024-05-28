// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudGtmInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudGtmInstancesResponseBody</p>
 */
public class ListCloudGtmInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private ListCloudGtmInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Instances instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListCloudGtmInstancesResponseBody build() {
            return new ListCloudGtmInstancesResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MonitorTaskQuota")
        private Integer monitorTaskQuota;

        @com.aliyun.core.annotation.NameInMap("MonthlyEmailUsed")
        private Integer monthlyEmailUsed;

        @com.aliyun.core.annotation.NameInMap("MonthlySmsQuota")
        private Integer monthlySmsQuota;

        @com.aliyun.core.annotation.NameInMap("MonthlySmsUsed")
        private Integer monthlySmsUsed;

        @com.aliyun.core.annotation.NameInMap("MonthlyWebhookUsed")
        private Integer monthlyWebhookUsed;

        @com.aliyun.core.annotation.NameInMap("ScheduleDomainName")
        private String scheduleDomainName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private Instance(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.expireTime = builder.expireTime;
            this.expireTimestamp = builder.expireTimestamp;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.monitorTaskQuota = builder.monitorTaskQuota;
            this.monthlyEmailUsed = builder.monthlyEmailUsed;
            this.monthlySmsQuota = builder.monthlySmsQuota;
            this.monthlySmsUsed = builder.monthlySmsUsed;
            this.monthlyWebhookUsed = builder.monthlyWebhookUsed;
            this.scheduleDomainName = builder.scheduleDomainName;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
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
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
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
         * @return monitorTaskQuota
         */
        public Integer getMonitorTaskQuota() {
            return this.monitorTaskQuota;
        }

        /**
         * @return monthlyEmailUsed
         */
        public Integer getMonthlyEmailUsed() {
            return this.monthlyEmailUsed;
        }

        /**
         * @return monthlySmsQuota
         */
        public Integer getMonthlySmsQuota() {
            return this.monthlySmsQuota;
        }

        /**
         * @return monthlySmsUsed
         */
        public Integer getMonthlySmsUsed() {
            return this.monthlySmsUsed;
        }

        /**
         * @return monthlyWebhookUsed
         */
        public Integer getMonthlyWebhookUsed() {
            return this.monthlyWebhookUsed;
        }

        /**
         * @return scheduleDomainName
         */
        public String getScheduleDomainName() {
            return this.scheduleDomainName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String commodityCode; 
            private String createTime; 
            private Long createTimestamp; 
            private String expireTime; 
            private Long expireTimestamp; 
            private String instanceId; 
            private String instanceName; 
            private Integer monitorTaskQuota; 
            private Integer monthlyEmailUsed; 
            private Integer monthlySmsQuota; 
            private Integer monthlySmsUsed; 
            private Integer monthlyWebhookUsed; 
            private String scheduleDomainName; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String versionCode; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ExpireTimestamp.
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
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
             * MonitorTaskQuota.
             */
            public Builder monitorTaskQuota(Integer monitorTaskQuota) {
                this.monitorTaskQuota = monitorTaskQuota;
                return this;
            }

            /**
             * MonthlyEmailUsed.
             */
            public Builder monthlyEmailUsed(Integer monthlyEmailUsed) {
                this.monthlyEmailUsed = monthlyEmailUsed;
                return this;
            }

            /**
             * MonthlySmsQuota.
             */
            public Builder monthlySmsQuota(Integer monthlySmsQuota) {
                this.monthlySmsQuota = monthlySmsQuota;
                return this;
            }

            /**
             * MonthlySmsUsed.
             */
            public Builder monthlySmsUsed(Integer monthlySmsUsed) {
                this.monthlySmsUsed = monthlySmsUsed;
                return this;
            }

            /**
             * MonthlyWebhookUsed.
             */
            public Builder monthlyWebhookUsed(Integer monthlyWebhookUsed) {
                this.monthlyWebhookUsed = monthlyWebhookUsed;
                return this;
            }

            /**
             * ScheduleDomainName.
             */
            public Builder scheduleDomainName(String scheduleDomainName) {
                this.scheduleDomainName = scheduleDomainName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
