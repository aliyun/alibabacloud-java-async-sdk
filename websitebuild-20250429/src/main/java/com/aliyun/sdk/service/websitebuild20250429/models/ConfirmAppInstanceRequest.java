// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ConfirmAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConfirmAppInstanceRequest</p>
 */
public class ConfirmAppInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployArea")
    private String deployArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private String siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialBizId")
    private String trialBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private ConfirmAppInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationType = builder.applicationType;
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.deployArea = builder.deployArea;
        this.duration = builder.duration;
        this.extend = builder.extend;
        this.paymentType = builder.paymentType;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
        this.siteVersion = builder.siteVersion;
        this.trialBizId = builder.trialBizId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmAppInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deployArea
     */
    public String getDeployArea() {
        return this.deployArea;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return siteVersion
     */
    public String getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return trialBizId
     */
    public String getTrialBizId() {
        return this.trialBizId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ConfirmAppInstanceRequest, Builder> {
        private String regionId; 
        private String applicationType; 
        private Boolean autoRenew; 
        private String clientToken; 
        private String deployArea; 
        private Integer duration; 
        private String extend; 
        private String paymentType; 
        private String pricingCycle; 
        private Integer quantity; 
        private String siteVersion; 
        private String trialBizId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmAppInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationType = request.applicationType;
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.deployArea = request.deployArea;
            this.duration = request.duration;
            this.extend = request.extend;
            this.paymentType = request.paymentType;
            this.pricingCycle = request.pricingCycle;
            this.quantity = request.quantity;
            this.siteVersion = request.siteVersion;
            this.trialBizId = request.trialBizId;
            this.version = request.version;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>PC_WebSite</p>
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal upon expiration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Generate a unique value from your client. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The deployment region.</p>
         * 
         * <strong>example:</strong>
         * <p>HongKong</p>
         */
        public Builder deployArea(String deployArea) {
            this.putQueryParameter("DeployArea", deployArea);
            this.deployArea = deployArea;
            return this;
        }

        /**
         * <p>Required. The number of subscription periods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;deliveryNodeName\&quot;:\&quot;视觉设计确认\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Reject\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Customer\&quot;}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>The payment type.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_PAY</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>Required. The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li>Year: year</li>
         * <li>Month: month</li>
         * <li>Day: day</li>
         * <li>Hour: hour.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>Required. The number of instances to purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>The website version.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic_Edition</p>
         */
        public Builder siteVersion(String siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>The business ID of the trial instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WS123456</p>
         */
        public Builder trialBizId(String trialBizId) {
            this.putQueryParameter("TrialBizId", trialBizId);
            this.trialBizId = trialBizId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ConfirmAppInstanceRequest build() {
            return new ConfirmAppInstanceRequest(this);
        } 

    } 

}
