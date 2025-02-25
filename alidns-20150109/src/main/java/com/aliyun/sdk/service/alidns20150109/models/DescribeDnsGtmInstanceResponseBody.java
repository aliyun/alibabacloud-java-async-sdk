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
 * {@link DescribeDnsGtmInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceResponseBody</p>
 */
public class DescribeDnsGtmInstanceResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private DescribeDnsGtmInstanceResponseBody(Builder builder) {
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.expireTime = builder.expireTime;
        this.expireTimestamp = builder.expireTimestamp;
        this.instanceId = builder.instanceId;
        this.paymentType = builder.paymentType;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.smsQuota = builder.smsQuota;
        this.taskQuota = builder.taskQuota;
        this.usedQuota = builder.usedQuota;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstanceResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
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
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T06:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The UNIX timestamp that indicates when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1602656937000</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T06:58Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The UNIX timestamp that indicates when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1602656937000</p>
         */
        public Builder expireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceid1</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The billing method. Valid value:</p>
         * <ul>
         * <li>Subscription: You can pay in advance for the use of resources.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>84314904-D047-4176-A0EC-256D7F68C7F5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>resourcegroupid1</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The total number of SMS notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder smsQuota(Integer smsQuota) {
            this.smsQuota = smsQuota;
            return this;
        }

        /**
         * <p>The total number of detection tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>versioncode1</p>
         */
        public Builder versionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }

        public DescribeDnsGtmInstanceResponseBody build() {
            return new DescribeDnsGtmInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsGtmInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstanceResponseBody</p>
     */
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingtalkNotice")
        private Boolean dingtalkNotice;

        @com.aliyun.core.annotation.NameInMap("EmailNotice")
        private Boolean emailNotice;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private String noticeType;

        @com.aliyun.core.annotation.NameInMap("SmsNotice")
        private Boolean smsNotice;

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
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        /**
         * @return emailNotice
         */
        public Boolean getEmailNotice() {
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
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

        public static final class Builder {
            private Boolean dingtalkNotice; 
            private Boolean emailNotice; 
            private String noticeType; 
            private Boolean smsNotice; 

            /**
             * DingtalkNotice.
             */
            public Builder dingtalkNotice(Boolean dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * <p>Indicates whether email notification is configured. Valid values:</p>
             * <ul>
             * <li>true: Email notification is configured.</li>
             * <li>false: Email notification is not configured. null: Email notification is not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailNotice(Boolean emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * <p>The type of the alert event. Valid values:</p>
             * <ul>
             * <li>ADDR_ALERT: The address is unavailable.</li>
             * <li>ADDR_RESUME: The address is restored and becomes available.</li>
             * <li>ADDR_POOL_GROUP_UNAVAILABLE: The address pool group is unavailable.</li>
             * <li>ADDR_POOL_GROUP_AVAILABLE: The address pool group is restored and becomes available.</li>
             * <li>ACCESS_STRATEGY_POOL_GROUP_SWITCH: Switchover is triggered between the primary and secondary address pools.</li>
             * <li>MONITOR_NODE_IP_CHANGE: The IP address of the monitoring node has changed.</li>
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
             * <p>Indicates whether SMS notification is configured. Valid values:</p>
             * <ul>
             * <li>true: SMS notification is configured.</li>
             * <li>false: SMS notification is not configured. null: SMS notification is not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder smsNotice(Boolean smsNotice) {
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
     * {@link DescribeDnsGtmInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstanceResponseBody</p>
     */
    public static class ConfigAlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private java.util.List<AlertConfig> alertConfig;

        private ConfigAlertConfig(Builder builder) {
            this.alertConfig = builder.alertConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigAlertConfig create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public java.util.List<AlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        public static final class Builder {
            private java.util.List<AlertConfig> alertConfig; 

            /**
             * AlertConfig.
             */
            public Builder alertConfig(java.util.List<AlertConfig> alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            public ConfigAlertConfig build() {
                return new ConfigAlertConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstanceResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private ConfigAlertConfig alertConfig;

        @com.aliyun.core.annotation.NameInMap("AlertGroup")
        private String alertGroup;

        @com.aliyun.core.annotation.NameInMap("CnameType")
        private String cnameType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PubicZoneName")
        private String pubicZoneName;

        @com.aliyun.core.annotation.NameInMap("PublicCnameMode")
        private String publicCnameMode;

        @com.aliyun.core.annotation.NameInMap("PublicRr")
        private String publicRr;

        @com.aliyun.core.annotation.NameInMap("PublicUserDomainName")
        private String publicUserDomainName;

        @com.aliyun.core.annotation.NameInMap("StrategyMode")
        private String strategyMode;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private Config(Builder builder) {
            this.alertConfig = builder.alertConfig;
            this.alertGroup = builder.alertGroup;
            this.cnameType = builder.cnameType;
            this.instanceName = builder.instanceName;
            this.pubicZoneName = builder.pubicZoneName;
            this.publicCnameMode = builder.publicCnameMode;
            this.publicRr = builder.publicRr;
            this.publicUserDomainName = builder.publicUserDomainName;
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
        public ConfigAlertConfig getAlertConfig() {
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
         * @return pubicZoneName
         */
        public String getPubicZoneName() {
            return this.pubicZoneName;
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
            private ConfigAlertConfig alertConfig; 
            private String alertGroup; 
            private String cnameType; 
            private String instanceName; 
            private String pubicZoneName; 
            private String publicCnameMode; 
            private String publicRr; 
            private String publicUserDomainName; 
            private String strategyMode; 
            private Integer ttl; 

            /**
             * <p>The alert notification method.</p>
             */
            public Builder alertConfig(ConfigAlertConfig alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            /**
             * <p>The name of the alert group.</p>
             * 
             * <strong>example:</strong>
             * <p>alertgroup1</p>
             */
            public Builder alertGroup(String alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * <p>The type of the CNAME domain name that is used to access the instance. Valid value:</p>
             * <ul>
             * <li>PUBLIC: The CNAME domain name is used to access the instance over the Internet.</li>
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
             * <p>instancetest1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The domain name that is used to access the instance over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>test.rr.gtm-003.com</p>
             */
            public Builder pubicZoneName(String pubicZoneName) {
                this.pubicZoneName = pubicZoneName;
                return this;
            }

            /**
             * <p>Indicates whether a custom CNAME domain name or a CNAME domain name assigned by the system is used to access the instance over the Internet. Valid values:</p>
             * <ul>
             * <li>CUSTOM: A custom CNAME domain name is used.</li>
             * <li>SYSTEM_ASSIGN: A CNAME domain name assigned by the system is used.</li>
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
             * <p>The hostname corresponding to the CNAME domain name that is used to access the instance over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>test.rr</p>
             */
            public Builder publicRr(String publicRr) {
                this.publicRr = publicRr;
                return this;
            }

            /**
             * <p>The service domain name that is used over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder publicUserDomainName(String publicUserDomainName) {
                this.publicUserDomainName = publicUserDomainName;
                return this;
            }

            /**
             * <p>The type of the access policy. Valid values:</p>
             * <ul>
             * <li>LATENCY: Latency-based</li>
             * <li>GEO: Geographical location-based</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GEO</p>
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
     * {@link DescribeDnsGtmInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstanceResponseBody</p>
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
             * DingtalkUsedCount.
             */
            public Builder dingtalkUsedCount(Integer dingtalkUsedCount) {
                this.dingtalkUsedCount = dingtalkUsedCount;
                return this;
            }

            /**
             * <p>The total number of emails that were sent.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder emailUsedCount(Integer emailUsedCount) {
                this.emailUsedCount = emailUsedCount;
                return this;
            }

            /**
             * <p>The total number of short messages that were sent.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder smsUsedCount(Integer smsUsedCount) {
                this.smsUsedCount = smsUsedCount;
                return this;
            }

            /**
             * <p>The number of detection tasks that were created.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
}
