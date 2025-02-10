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
 * {@link DescribeDnsGtmInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstancesResponseBody</p>
 */
public class DescribeDnsGtmInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GtmInstances")
    private java.util.List<GtmInstances> gtmInstances;

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

    private DescribeDnsGtmInstancesResponseBody(Builder builder) {
        this.gtmInstances = builder.gtmInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return gtmInstances
     */
    public java.util.List<GtmInstances> getGtmInstances() {
        return this.gtmInstances;
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
        private java.util.List<GtmInstances> gtmInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * <p>The Global Traffic Manager (GTM) instances.</p>
         */
        public Builder gtmInstances(java.util.List<GtmInstances> gtmInstances) {
            this.gtmInstances = gtmInstances;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>84314904-D047-4176-A0EC-256D7F68C7F5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDnsGtmInstancesResponseBody build() {
            return new DescribeDnsGtmInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstancesResponseBody</p>
     */
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingtalkNotice")
        private String dingtalkNotice;

        @com.aliyun.core.annotation.NameInMap("EmailNotice")
        private String emailNotice;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private String noticeType;

        @com.aliyun.core.annotation.NameInMap("SmsNotice")
        private String smsNotice;

        private AlertConfig(Builder builder) {
            this.dingtalkNotice = builder.dingtalkNotice;
            this.emailNotice = builder.emailNotice;
            this.noticeType = builder.noticeType;
            this.smsNotice = builder.smsNotice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfig create() {
            return builder().build();
        }

        /**
         * @return dingtalkNotice
         */
        public String getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        /**
         * @return emailNotice
         */
        public String getEmailNotice() {
            return this.emailNotice;
        }

        /**
         * @return noticeType
         */
        public String getNoticeType() {
            return this.noticeType;
        }

        /**
         * @return smsNotice
         */
        public String getSmsNotice() {
            return this.smsNotice;
        }

        public static final class Builder {
            private String dingtalkNotice; 
            private String emailNotice; 
            private String noticeType; 
            private String smsNotice; 

            /**
             * <p>Indicates whether DingTalk alert notifications are configured. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false | null</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dingtalkNotice(String dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * <p>Indicates whether email notifications are configured. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false | null</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailNotice(String emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * <p>The type of the alert event. Valid values:</p>
             * <ul>
             * <li>ADDR_ALERT: The address is unavailable.</li>
             * <li>ADDR_RESUME: The address becomes available.</li>
             * <li>ADDR_POOL_GROUP_UNAVAILABLE: The address pool set is unavailable.</li>
             * <li>ADDR_POOL_GROUP_AVAILABLE: The address pool set becomes available.</li>
             * <li>ACCESS_STRATEGY_POOL_GROUP_SWITCH: Switchover is triggered between the primary and secondary address pools.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ADDR_ALERT</p>
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * <p>Indicates whether SMS notifications are configured. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false | null</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder smsNotice(String smsNotice) {
                this.smsNotice = smsNotice;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstancesResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private java.util.List<AlertConfig> alertConfig;

        @com.aliyun.core.annotation.NameInMap("AlertGroup")
        private String alertGroup;

        @com.aliyun.core.annotation.NameInMap("CnameType")
        private String cnameType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PublicCnameMode")
        private String publicCnameMode;

        @com.aliyun.core.annotation.NameInMap("PublicRr")
        private String publicRr;

        @com.aliyun.core.annotation.NameInMap("PublicUserDomainName")
        private String publicUserDomainName;

        @com.aliyun.core.annotation.NameInMap("PublicZoneName")
        private String publicZoneName;

        @com.aliyun.core.annotation.NameInMap("StrategyMode")
        private String strategyMode;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private Config(Builder builder) {
            this.alertConfig = builder.alertConfig;
            this.alertGroup = builder.alertGroup;
            this.cnameType = builder.cnameType;
            this.instanceName = builder.instanceName;
            this.publicCnameMode = builder.publicCnameMode;
            this.publicRr = builder.publicRr;
            this.publicUserDomainName = builder.publicUserDomainName;
            this.publicZoneName = builder.publicZoneName;
            this.strategyMode = builder.strategyMode;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public java.util.List<AlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        /**
         * @return alertGroup
         */
        public String getAlertGroup() {
            return this.alertGroup;
        }

        /**
         * @return cnameType
         */
        public String getCnameType() {
            return this.cnameType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return publicCnameMode
         */
        public String getPublicCnameMode() {
            return this.publicCnameMode;
        }

        /**
         * @return publicRr
         */
        public String getPublicRr() {
            return this.publicRr;
        }

        /**
         * @return publicUserDomainName
         */
        public String getPublicUserDomainName() {
            return this.publicUserDomainName;
        }

        /**
         * @return publicZoneName
         */
        public String getPublicZoneName() {
            return this.publicZoneName;
        }

        /**
         * @return strategyMode
         */
        public String getStrategyMode() {
            return this.strategyMode;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private java.util.List<AlertConfig> alertConfig; 
            private String alertGroup; 
            private String cnameType; 
            private String instanceName; 
            private String publicCnameMode; 
            private String publicRr; 
            private String publicUserDomainName; 
            private String publicZoneName; 
            private String strategyMode; 
            private Integer ttl; 

            /**
             * <p>The alert notification method.</p>
             */
            public Builder alertConfig(java.util.List<AlertConfig> alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            /**
             * <p>The alert contact groups. The value is in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroup</p>
             */
            public Builder alertGroup(String alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * <p>The type of the CNAME. Valid value:</p>
             * <ul>
             * <li>PUBLIC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder cnameType(String cnameType) {
                this.cnameType = cnameType;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceTest</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Specifies whether to use a custom CNAME or a system-assigned CNAME to access GTM over the Internet. Valid values:</p>
             * <ul>
             * <li>CUSTOM: a custom CNAME</li>
             * <li>SYSTEM_ASSIGN: a system-assigned CNAME. You cannot set PublicCnameMode to this value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder publicCnameMode(String publicCnameMode) {
                this.publicCnameMode = publicCnameMode;
                return this;
            }

            /**
             * <p>The hostname of the domain name that is used to access GTM over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>test.rr</p>
             */
            public Builder publicRr(String publicRr) {
                this.publicRr = publicRr;
                return this;
            }

            /**
             * <p>The domain name that is used to access GTM over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder publicUserDomainName(String publicUserDomainName) {
                this.publicUserDomainName = publicUserDomainName;
                return this;
            }

            /**
             * <p>The canonical name (CNAME) that is used to access GTM over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>test.rr.gtm-003.com</p>
             */
            public Builder publicZoneName(String publicZoneName) {
                this.publicZoneName = publicZoneName;
                return this;
            }

            /**
             * <p>The type of the access policy. Valid values:</p>
             * <ul>
             * <li>LATENCY: latency-based access policy</li>
             * <li>GEO: geographical location-based access policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>geo</p>
             */
            public Builder strategyMode(String strategyMode) {
                this.strategyMode = strategyMode;
                return this;
            }

            /**
             * <p>The global time to live (TTL).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstancesResponseBody</p>
     */
    public static class UsedQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingtalkUsedCount")
        private Integer dingtalkUsedCount;

        @com.aliyun.core.annotation.NameInMap("EmailUsedCount")
        private Integer emailUsedCount;

        @com.aliyun.core.annotation.NameInMap("SmsUsedCount")
        private Integer smsUsedCount;

        @com.aliyun.core.annotation.NameInMap("TaskUsedCount")
        private Integer taskUsedCount;

        private UsedQuota(Builder builder) {
            this.dingtalkUsedCount = builder.dingtalkUsedCount;
            this.emailUsedCount = builder.emailUsedCount;
            this.smsUsedCount = builder.smsUsedCount;
            this.taskUsedCount = builder.taskUsedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsedQuota create() {
            return builder().build();
        }

        /**
         * @return dingtalkUsedCount
         */
        public Integer getDingtalkUsedCount() {
            return this.dingtalkUsedCount;
        }

        /**
         * @return emailUsedCount
         */
        public Integer getEmailUsedCount() {
            return this.emailUsedCount;
        }

        /**
         * @return smsUsedCount
         */
        public Integer getSmsUsedCount() {
            return this.smsUsedCount;
        }

        /**
         * @return taskUsedCount
         */
        public Integer getTaskUsedCount() {
            return this.taskUsedCount;
        }

        public static final class Builder {
            private Integer dingtalkUsedCount; 
            private Integer emailUsedCount; 
            private Integer smsUsedCount; 
            private Integer taskUsedCount; 

            /**
             * <p>The total number of sent DingTalk notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dingtalkUsedCount(Integer dingtalkUsedCount) {
                this.dingtalkUsedCount = dingtalkUsedCount;
                return this;
            }

            /**
             * <p>The total number of sent email notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder emailUsedCount(Integer emailUsedCount) {
                this.emailUsedCount = emailUsedCount;
                return this;
            }

            /**
             * <p>The total number of sent SMS notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder smsUsedCount(Integer smsUsedCount) {
                this.smsUsedCount = smsUsedCount;
                return this;
            }

            /**
             * <p>The number of created detection tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder taskUsedCount(Integer taskUsedCount) {
                this.taskUsedCount = taskUsedCount;
                return this;
            }

            public UsedQuota build() {
                return new UsedQuota(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstancesResponseBody</p>
     */
    public static class GtmInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

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

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SmsQuota")
        private Integer smsQuota;

        @com.aliyun.core.annotation.NameInMap("TaskQuota")
        private Integer taskQuota;

        @com.aliyun.core.annotation.NameInMap("UsedQuota")
        private UsedQuota usedQuota;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private GtmInstances(Builder builder) {
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.expireTime = builder.expireTime;
            this.expireTimestamp = builder.expireTimestamp;
            this.instanceId = builder.instanceId;
            this.paymentType = builder.paymentType;
            this.resourceGroupId = builder.resourceGroupId;
            this.smsQuota = builder.smsQuota;
            this.taskQuota = builder.taskQuota;
            this.usedQuota = builder.usedQuota;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GtmInstances create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
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
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return smsQuota
         */
        public Integer getSmsQuota() {
            return this.smsQuota;
        }

        /**
         * @return taskQuota
         */
        public Integer getTaskQuota() {
            return this.taskQuota;
        }

        /**
         * @return usedQuota
         */
        public UsedQuota getUsedQuota() {
            return this.usedQuota;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private Config config; 
            private String createTime; 
            private Long createTimestamp; 
            private String expireTime; 
            private Long expireTimestamp; 
            private String instanceId; 
            private String paymentType; 
            private String resourceGroupId; 
            private Integer smsQuota; 
            private Integer taskQuota; 
            private UsedQuota usedQuota; 
            private String versionCode; 

            /**
             * <p>The configurations of the instance.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time when the instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-14T06:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the instance was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1602658709000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-14T06:58Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1602658709000</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>instance1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The billing method of the GTM instance. Valid value:</p>
             * <ul>
             * <li>Subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Subscription</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>resourceGroupid123</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The total number of Short Message Service (SMS) notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder smsQuota(Integer smsQuota) {
                this.smsQuota = smsQuota;
                return this;
            }

            /**
             * <p>The total number of detection tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskQuota(Integer taskQuota) {
                this.taskQuota = taskQuota;
                return this;
            }

            /**
             * <p>The used quota.</p>
             */
            public Builder usedQuota(UsedQuota usedQuota) {
                this.usedQuota = usedQuota;
                return this;
            }

            /**
             * <p>The version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testVersion1</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public GtmInstances build() {
                return new GtmInstances(this);
            } 

        } 

    }
}
