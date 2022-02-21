// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstancesResponseBody</p>
 */
public class DescribeDnsGtmInstancesResponseBody extends TeaModel {
    @NameInMap("GtmInstances")
    private java.util.List < GtmInstances> gtmInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
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
    public java.util.List < GtmInstances> getGtmInstances() {
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
        private java.util.List < GtmInstances> gtmInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * GtmInstances.
         */
        public Builder gtmInstances(java.util.List < GtmInstances> gtmInstances) {
            this.gtmInstances = gtmInstances;
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

        public DescribeDnsGtmInstancesResponseBody build() {
            return new DescribeDnsGtmInstancesResponseBody(this);
        } 

    } 

    public static class AlertConfig extends TeaModel {
        @NameInMap("DingtalkNotice")
        private String dingtalkNotice;

        @NameInMap("EmailNotice")
        private String emailNotice;

        @NameInMap("NoticeType")
        private String noticeType;

        @NameInMap("SmsNotice")
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
             * DingtalkNotice.
             */
            public Builder dingtalkNotice(String dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * EmailNotice.
             */
            public Builder emailNotice(String emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * NoticeType.
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * SmsNotice.
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
    public static class Config extends TeaModel {
        @NameInMap("AlertConfig")
        private java.util.List < AlertConfig> alertConfig;

        @NameInMap("AlertGroup")
        private String alertGroup;

        @NameInMap("CnameType")
        private String cnameType;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("PublicCnameMode")
        private String publicCnameMode;

        @NameInMap("PublicRr")
        private String publicRr;

        @NameInMap("PublicUserDomainName")
        private String publicUserDomainName;

        @NameInMap("PublicZoneName")
        private String publicZoneName;

        @NameInMap("StrategyMode")
        private String strategyMode;

        @NameInMap("Ttl")
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
        public java.util.List < AlertConfig> getAlertConfig() {
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
            private java.util.List < AlertConfig> alertConfig; 
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
             * AlertConfig.
             */
            public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            /**
             * AlertGroup.
             */
            public Builder alertGroup(String alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * CnameType.
             */
            public Builder cnameType(String cnameType) {
                this.cnameType = cnameType;
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
             * PublicCnameMode.
             */
            public Builder publicCnameMode(String publicCnameMode) {
                this.publicCnameMode = publicCnameMode;
                return this;
            }

            /**
             * PublicRr.
             */
            public Builder publicRr(String publicRr) {
                this.publicRr = publicRr;
                return this;
            }

            /**
             * PublicUserDomainName.
             */
            public Builder publicUserDomainName(String publicUserDomainName) {
                this.publicUserDomainName = publicUserDomainName;
                return this;
            }

            /**
             * PublicZoneName.
             */
            public Builder publicZoneName(String publicZoneName) {
                this.publicZoneName = publicZoneName;
                return this;
            }

            /**
             * StrategyMode.
             */
            public Builder strategyMode(String strategyMode) {
                this.strategyMode = strategyMode;
                return this;
            }

            /**
             * Ttl.
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
    public static class UsedQuota extends TeaModel {
        @NameInMap("DingtalkUsedCount")
        private Integer dingtalkUsedCount;

        @NameInMap("EmailUsedCount")
        private Integer emailUsedCount;

        @NameInMap("SmsUsedCount")
        private Integer smsUsedCount;

        @NameInMap("TaskUsedCount")
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
             * EmailUsedCount.
             */
            public Builder emailUsedCount(Integer emailUsedCount) {
                this.emailUsedCount = emailUsedCount;
                return this;
            }

            /**
             * SmsUsedCount.
             */
            public Builder smsUsedCount(Integer smsUsedCount) {
                this.smsUsedCount = smsUsedCount;
                return this;
            }

            /**
             * TaskUsedCount.
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
    public static class GtmInstances extends TeaModel {
        @NameInMap("Config")
        private Config config;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ExpireTimestamp")
        private Long expireTimestamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SmsQuota")
        private Integer smsQuota;

        @NameInMap("TaskQuota")
        private Integer taskQuota;

        @NameInMap("UsedQuota")
        private UsedQuota usedQuota;

        @NameInMap("VersionCode")
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
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
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
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SmsQuota.
             */
            public Builder smsQuota(Integer smsQuota) {
                this.smsQuota = smsQuota;
                return this;
            }

            /**
             * TaskQuota.
             */
            public Builder taskQuota(Integer taskQuota) {
                this.taskQuota = taskQuota;
                return this;
            }

            /**
             * UsedQuota.
             */
            public Builder usedQuota(UsedQuota usedQuota) {
                this.usedQuota = usedQuota;
                return this;
            }

            /**
             * VersionCode.
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
