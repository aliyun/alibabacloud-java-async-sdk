// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link LicenseInstanceAppDTO} extends {@link TeaModel}
 *
 * <p>LicenseInstanceAppDTO</p>
 */
public class LicenseInstanceAppDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("BeginOn")
    private String beginOn;

    @com.aliyun.core.annotation.NameInMap("ContractNo")
    private String contractNo;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("ExpiredOn")
    private String expiredOn;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("ItemId")
    private String itemId;

    @com.aliyun.core.annotation.NameInMap("LicenseConfigs")
    private java.util.List<LicenseConfigs> licenseConfigs;

    @com.aliyun.core.annotation.NameInMap("ModificationTime")
    private String modificationTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private LicenseInstanceAppDTO(Builder builder) {
        this.appId = builder.appId;
        this.beginOn = builder.beginOn;
        this.contractNo = builder.contractNo;
        this.creationTime = builder.creationTime;
        this.expiredOn = builder.expiredOn;
        this.instanceId = builder.instanceId;
        this.itemId = builder.itemId;
        this.licenseConfigs = builder.licenseConfigs;
        this.modificationTime = builder.modificationTime;
        this.status = builder.status;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LicenseInstanceAppDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return beginOn
     */
    public String getBeginOn() {
        return this.beginOn;
    }

    /**
     * @return contractNo
     */
    public String getContractNo() {
        return this.contractNo;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return expiredOn
     */
    public String getExpiredOn() {
        return this.expiredOn;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return licenseConfigs
     */
    public java.util.List<LicenseConfigs> getLicenseConfigs() {
        return this.licenseConfigs;
    }

    /**
     * @return modificationTime
     */
    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String appId; 
        private String beginOn; 
        private String contractNo; 
        private String creationTime; 
        private String expiredOn; 
        private String instanceId; 
        private String itemId; 
        private java.util.List<LicenseConfigs> licenseConfigs; 
        private String modificationTime; 
        private String status; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(LicenseInstanceAppDTO model) {
            this.appId = model.appId;
            this.beginOn = model.beginOn;
            this.contractNo = model.contractNo;
            this.creationTime = model.creationTime;
            this.expiredOn = model.expiredOn;
            this.instanceId = model.instanceId;
            this.itemId = model.itemId;
            this.licenseConfigs = model.licenseConfigs;
            this.modificationTime = model.modificationTime;
            this.status = model.status;
            this.userId = model.userId;
        } 

        /**
         * <p>appId</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>beginOn</p>
         */
        public Builder beginOn(String beginOn) {
            this.beginOn = beginOn;
            return this;
        }

        /**
         * <p>contractNo</p>
         */
        public Builder contractNo(String contractNo) {
            this.contractNo = contractNo;
            return this;
        }

        /**
         * <p>creationTime</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>expiredOn</p>
         */
        public Builder expiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }

        /**
         * <p>instanceId</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>itemId</p>
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>LicenseConfigDTOS</p>
         */
        public Builder licenseConfigs(java.util.List<LicenseConfigs> licenseConfigs) {
            this.licenseConfigs = licenseConfigs;
            return this;
        }

        /**
         * <p>modificationTime</p>
         */
        public Builder modificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        /**
         * <p>status</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>userId</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public LicenseInstanceAppDTO build() {
            return new LicenseInstanceAppDTO(this);
        } 

    } 

    /**
     * 
     * {@link LicenseInstanceAppDTO} extends {@link TeaModel}
     *
     * <p>LicenseInstanceAppDTO</p>
     */
    public static class LicenseConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("FeatureIds")
        private String featureIds;

        @com.aliyun.core.annotation.NameInMap("IsTrial")
        private Boolean isTrial;

        @com.aliyun.core.annotation.NameInMap("SdkId")
        private Integer sdkId;

        @com.aliyun.core.annotation.NameInMap("SdkName")
        private String sdkName;

        @com.aliyun.core.annotation.NameInMap("Subscription")
        private String subscription;

        @com.aliyun.core.annotation.NameInMap("SubscriptionImp")
        private String subscriptionImp;

        @com.aliyun.core.annotation.NameInMap("SubscriptionPkg")
        private String subscriptionPkg;

        private LicenseConfigs(Builder builder) {
            this.businessType = builder.businessType;
            this.featureIds = builder.featureIds;
            this.isTrial = builder.isTrial;
            this.sdkId = builder.sdkId;
            this.sdkName = builder.sdkName;
            this.subscription = builder.subscription;
            this.subscriptionImp = builder.subscriptionImp;
            this.subscriptionPkg = builder.subscriptionPkg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseConfigs create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return featureIds
         */
        public String getFeatureIds() {
            return this.featureIds;
        }

        /**
         * @return isTrial
         */
        public Boolean getIsTrial() {
            return this.isTrial;
        }

        /**
         * @return sdkId
         */
        public Integer getSdkId() {
            return this.sdkId;
        }

        /**
         * @return sdkName
         */
        public String getSdkName() {
            return this.sdkName;
        }

        /**
         * @return subscription
         */
        public String getSubscription() {
            return this.subscription;
        }

        /**
         * @return subscriptionImp
         */
        public String getSubscriptionImp() {
            return this.subscriptionImp;
        }

        /**
         * @return subscriptionPkg
         */
        public String getSubscriptionPkg() {
            return this.subscriptionPkg;
        }

        public static final class Builder {
            private String businessType; 
            private String featureIds; 
            private Boolean isTrial; 
            private Integer sdkId; 
            private String sdkName; 
            private String subscription; 
            private String subscriptionImp; 
            private String subscriptionPkg; 

            private Builder() {
            } 

            private Builder(LicenseConfigs model) {
                this.businessType = model.businessType;
                this.featureIds = model.featureIds;
                this.isTrial = model.isTrial;
                this.sdkId = model.sdkId;
                this.sdkName = model.sdkName;
                this.subscription = model.subscription;
                this.subscriptionImp = model.subscriptionImp;
                this.subscriptionPkg = model.subscriptionPkg;
            } 

            /**
             * <p>businessType</p>
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * <p>featureIds</p>
             */
            public Builder featureIds(String featureIds) {
                this.featureIds = featureIds;
                return this;
            }

            /**
             * <p>isTrial</p>
             */
            public Builder isTrial(Boolean isTrial) {
                this.isTrial = isTrial;
                return this;
            }

            /**
             * <p>sdkId</p>
             */
            public Builder sdkId(Integer sdkId) {
                this.sdkId = sdkId;
                return this;
            }

            /**
             * <p>sdkName</p>
             */
            public Builder sdkName(String sdkName) {
                this.sdkName = sdkName;
                return this;
            }

            /**
             * <p>subscription</p>
             */
            public Builder subscription(String subscription) {
                this.subscription = subscription;
                return this;
            }

            /**
             * <p>subscriptionImp</p>
             */
            public Builder subscriptionImp(String subscriptionImp) {
                this.subscriptionImp = subscriptionImp;
                return this;
            }

            /**
             * <p>subscriptionPkg</p>
             */
            public Builder subscriptionPkg(String subscriptionPkg) {
                this.subscriptionPkg = subscriptionPkg;
                return this;
            }

            public LicenseConfigs build() {
                return new LicenseConfigs(this);
            } 

        } 

    }
}
