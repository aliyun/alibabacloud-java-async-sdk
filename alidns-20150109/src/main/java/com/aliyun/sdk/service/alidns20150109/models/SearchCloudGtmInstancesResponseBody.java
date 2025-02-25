// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SearchCloudGtmInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchCloudGtmInstancesResponseBody</p>
 */
public class SearchCloudGtmInstancesResponseBody extends TeaModel {
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

    private SearchCloudGtmInstancesResponseBody(Builder builder) {
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

    public static SearchCloudGtmInstancesResponseBody create() {
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
         * <p>The instances.</p>
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>Current page number, starting at <strong>1</strong>, default is <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of instances found from the search.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public SearchCloudGtmInstancesResponseBody build() {
            return new SearchCloudGtmInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchCloudGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstancesResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTimestamp")
        private String expireTimestamp;

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
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expireTimestamp
         */
        public String getExpireTimestamp() {
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
            private Long expireTime; 
            private String expireTimestamp; 
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
             * <p>The commodity code. Valid values:</p>
             * <ul>
             * <li>dns_gtm_public_cn: commodity code on the China site (aliyun.com)</li>
             * <li>dns_gtm_public_intl: commodity code on the international site (alibabacloud.com)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dns_gtm_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>Instance creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Instance creation time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1710467214858</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Instance expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-05T16:00Z</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Instance expiration time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1725552000000</p>
             */
            public Builder expireTimestamp(String expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The ID of the GTM 3.0 instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gtm-cn-wwo3a3hbz**</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Schedule instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Monitor probe task quota.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder monitorTaskQuota(Integer monitorTaskQuota) {
                this.monitorTaskQuota = monitorTaskQuota;
                return this;
            }

            /**
             * <p>Monthly email sending volume.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder monthlyEmailUsed(Integer monthlyEmailUsed) {
                this.monthlyEmailUsed = monthlyEmailUsed;
                return this;
            }

            /**
             * <p>SMS quota, only supported on the China site. International site does not support SMS.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder monthlySmsQuota(Integer monthlySmsQuota) {
                this.monthlySmsQuota = monthlySmsQuota;
                return this;
            }

            /**
             * <p>Monthly SMS sending volume, only supported by the China site as international sites do not support SMS.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder monthlySmsUsed(Integer monthlySmsUsed) {
                this.monthlySmsUsed = monthlySmsUsed;
                return this;
            }

            /**
             * <p>Monthly webhook dispatch volume.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder monthlyWebhookUsed(Integer monthlyWebhookUsed) {
                this.monthlyWebhookUsed = monthlyWebhookUsed;
                return this;
            }

            /**
             * <p>The access domain name, which consists of a hostname and a zone or a subzone.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder scheduleDomainName(String scheduleDomainName) {
                this.scheduleDomainName = scheduleDomainName;
                return this;
            }

            /**
             * <p>The last modified time of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The last modified time of the instance (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1710467214858</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>Global Traffic Management version 3.0 instance types:</p>
             * <ul>
             * <li>standard: Standard Edition</li>
             * <li>ultimate: Ultimate Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ultimate</p>
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
    /**
     * 
     * {@link SearchCloudGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

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
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
