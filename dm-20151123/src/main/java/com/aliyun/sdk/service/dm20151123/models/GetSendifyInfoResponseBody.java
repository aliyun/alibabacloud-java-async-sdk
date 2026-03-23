// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetSendifyInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSendifyInfoResponseBody</p>
 */
public class GetSendifyInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BuyResourcePackageUrl")
    private String buyResourcePackageUrl;

    @com.aliyun.core.annotation.NameInMap("BuyUrl")
    private String buyUrl;

    @com.aliyun.core.annotation.NameInMap("Discount")
    private String discount;

    @com.aliyun.core.annotation.NameInMap("DowngradeUrl")
    private String downgradeUrl;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("LearnMoreUrl")
    private String learnMoreUrl;

    @com.aliyun.core.annotation.NameInMap("Opened")
    private Boolean opened;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("RenewUrl")
    private String renewUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpecUpgradeUrl")
    private String specUpgradeUrl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportTrial")
    private Boolean supportTrial;

    @com.aliyun.core.annotation.NameInMap("UpgradeUrl")
    private String upgradeUrl;

    private GetSendifyInfoResponseBody(Builder builder) {
        this.buyResourcePackageUrl = builder.buyResourcePackageUrl;
        this.buyUrl = builder.buyUrl;
        this.discount = builder.discount;
        this.downgradeUrl = builder.downgradeUrl;
        this.expireTime = builder.expireTime;
        this.learnMoreUrl = builder.learnMoreUrl;
        this.opened = builder.opened;
        this.productCode = builder.productCode;
        this.renewUrl = builder.renewUrl;
        this.requestId = builder.requestId;
        this.specUpgradeUrl = builder.specUpgradeUrl;
        this.status = builder.status;
        this.supportTrial = builder.supportTrial;
        this.upgradeUrl = builder.upgradeUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSendifyInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buyResourcePackageUrl
     */
    public String getBuyResourcePackageUrl() {
        return this.buyResourcePackageUrl;
    }

    /**
     * @return buyUrl
     */
    public String getBuyUrl() {
        return this.buyUrl;
    }

    /**
     * @return discount
     */
    public String getDiscount() {
        return this.discount;
    }

    /**
     * @return downgradeUrl
     */
    public String getDowngradeUrl() {
        return this.downgradeUrl;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return learnMoreUrl
     */
    public String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    /**
     * @return opened
     */
    public Boolean getOpened() {
        return this.opened;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return renewUrl
     */
    public String getRenewUrl() {
        return this.renewUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specUpgradeUrl
     */
    public String getSpecUpgradeUrl() {
        return this.specUpgradeUrl;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportTrial
     */
    public Boolean getSupportTrial() {
        return this.supportTrial;
    }

    /**
     * @return upgradeUrl
     */
    public String getUpgradeUrl() {
        return this.upgradeUrl;
    }

    public static final class Builder {
        private String buyResourcePackageUrl; 
        private String buyUrl; 
        private String discount; 
        private String downgradeUrl; 
        private String expireTime; 
        private String learnMoreUrl; 
        private Boolean opened; 
        private String productCode; 
        private String renewUrl; 
        private String requestId; 
        private String specUpgradeUrl; 
        private String status; 
        private Boolean supportTrial; 
        private String upgradeUrl; 

        private Builder() {
        } 

        private Builder(GetSendifyInfoResponseBody model) {
            this.buyResourcePackageUrl = model.buyResourcePackageUrl;
            this.buyUrl = model.buyUrl;
            this.discount = model.discount;
            this.downgradeUrl = model.downgradeUrl;
            this.expireTime = model.expireTime;
            this.learnMoreUrl = model.learnMoreUrl;
            this.opened = model.opened;
            this.productCode = model.productCode;
            this.renewUrl = model.renewUrl;
            this.requestId = model.requestId;
            this.specUpgradeUrl = model.specUpgradeUrl;
            this.status = model.status;
            this.supportTrial = model.supportTrial;
            this.upgradeUrl = model.upgradeUrl;
        } 

        /**
         * BuyResourcePackageUrl.
         */
        public Builder buyResourcePackageUrl(String buyResourcePackageUrl) {
            this.buyResourcePackageUrl = buyResourcePackageUrl;
            return this;
        }

        /**
         * BuyUrl.
         */
        public Builder buyUrl(String buyUrl) {
            this.buyUrl = buyUrl;
            return this;
        }

        /**
         * Discount.
         */
        public Builder discount(String discount) {
            this.discount = discount;
            return this;
        }

        /**
         * DowngradeUrl.
         */
        public Builder downgradeUrl(String downgradeUrl) {
            this.downgradeUrl = downgradeUrl;
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
         * LearnMoreUrl.
         */
        public Builder learnMoreUrl(String learnMoreUrl) {
            this.learnMoreUrl = learnMoreUrl;
            return this;
        }

        /**
         * Opened.
         */
        public Builder opened(Boolean opened) {
            this.opened = opened;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * RenewUrl.
         */
        public Builder renewUrl(String renewUrl) {
            this.renewUrl = renewUrl;
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
         * SpecUpgradeUrl.
         */
        public Builder specUpgradeUrl(String specUpgradeUrl) {
            this.specUpgradeUrl = specUpgradeUrl;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupportTrial.
         */
        public Builder supportTrial(Boolean supportTrial) {
            this.supportTrial = supportTrial;
            return this;
        }

        /**
         * UpgradeUrl.
         */
        public Builder upgradeUrl(String upgradeUrl) {
            this.upgradeUrl = upgradeUrl;
            return this;
        }

        public GetSendifyInfoResponseBody build() {
            return new GetSendifyInfoResponseBody(this);
        } 

    } 

}
