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
 * {@link GetUnactivatedLicenseOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GetUnactivatedLicenseOrderResponseBody</p>
 */
public class GetUnactivatedLicenseOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUnactivatedLicenseOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnactivatedLicenseOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUnactivatedLicenseOrderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public GetUnactivatedLicenseOrderResponseBody build() {
            return new GetUnactivatedLicenseOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUnactivatedLicenseOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnactivatedLicenseOrderResponseBody</p>
     */
    public static class LicenseConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("FeatureIds")
        private String featureIds;

        @com.aliyun.core.annotation.NameInMap("IsTrial")
        private Boolean isTrial;

        @com.aliyun.core.annotation.NameInMap("SdkId")
        private String sdkId;

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
        public String getSdkId() {
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
            private String sdkId; 
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
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * FeatureIds.
             */
            public Builder featureIds(String featureIds) {
                this.featureIds = featureIds;
                return this;
            }

            /**
             * IsTrial.
             */
            public Builder isTrial(Boolean isTrial) {
                this.isTrial = isTrial;
                return this;
            }

            /**
             * SdkId.
             */
            public Builder sdkId(String sdkId) {
                this.sdkId = sdkId;
                return this;
            }

            /**
             * SdkName.
             */
            public Builder sdkName(String sdkName) {
                this.sdkName = sdkName;
                return this;
            }

            /**
             * Subscription.
             */
            public Builder subscription(String subscription) {
                this.subscription = subscription;
                return this;
            }

            /**
             * SubscriptionImp.
             */
            public Builder subscriptionImp(String subscriptionImp) {
                this.subscriptionImp = subscriptionImp;
                return this;
            }

            /**
             * SubscriptionPkg.
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
    /**
     * 
     * {@link GetUnactivatedLicenseOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnactivatedLicenseOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginOn")
        private String beginOn;

        @com.aliyun.core.annotation.NameInMap("ContractNo")
        private String contractNo;

        @com.aliyun.core.annotation.NameInMap("ExpiredOn")
        private String expiredOn;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LicenseConfigs")
        private java.util.List<LicenseConfigs> licenseConfigs;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        private Data(Builder builder) {
            this.beginOn = builder.beginOn;
            this.contractNo = builder.contractNo;
            this.expiredOn = builder.expiredOn;
            this.instanceId = builder.instanceId;
            this.licenseConfigs = builder.licenseConfigs;
            this.orderType = builder.orderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return licenseConfigs
         */
        public java.util.List<LicenseConfigs> getLicenseConfigs() {
            return this.licenseConfigs;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        public static final class Builder {
            private String beginOn; 
            private String contractNo; 
            private String expiredOn; 
            private String instanceId; 
            private java.util.List<LicenseConfigs> licenseConfigs; 
            private String orderType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.beginOn = model.beginOn;
                this.contractNo = model.contractNo;
                this.expiredOn = model.expiredOn;
                this.instanceId = model.instanceId;
                this.licenseConfigs = model.licenseConfigs;
                this.orderType = model.orderType;
            } 

            /**
             * BeginOn.
             */
            public Builder beginOn(String beginOn) {
                this.beginOn = beginOn;
                return this;
            }

            /**
             * ContractNo.
             */
            public Builder contractNo(String contractNo) {
                this.contractNo = contractNo;
                return this;
            }

            /**
             * ExpiredOn.
             */
            public Builder expiredOn(String expiredOn) {
                this.expiredOn = expiredOn;
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
             * LicenseConfigs.
             */
            public Builder licenseConfigs(java.util.List<LicenseConfigs> licenseConfigs) {
                this.licenseConfigs = licenseConfigs;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
