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
 * {@link CreateAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInstanceRequest</p>
 */
public class CreateAppInstanceRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private String siteVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private CreateAppInstanceRequest(Builder builder) {
        super(builder);
        this.applicationType = builder.applicationType;
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.deployArea = builder.deployArea;
        this.duration = builder.duration;
        this.extend = builder.extend;
        this.paymentType = builder.paymentType;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
        this.resourceGroupId = builder.resourceGroupId;
        this.siteVersion = builder.siteVersion;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return siteVersion
     */
    public String getSiteVersion() {
        return this.siteVersion;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateAppInstanceRequest, Builder> {
        private String applicationType; 
        private Boolean autoRenew; 
        private String clientToken; 
        private String deployArea; 
        private Integer duration; 
        private String extend; 
        private String paymentType; 
        private String pricingCycle; 
        private Integer quantity; 
        private String resourceGroupId; 
        private String siteVersion; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInstanceRequest request) {
            super(request);
            this.applicationType = request.applicationType;
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.deployArea = request.deployArea;
            this.duration = request.duration;
            this.extend = request.extend;
            this.paymentType = request.paymentType;
            this.pricingCycle = request.pricingCycle;
            this.quantity = request.quantity;
            this.resourceGroupId = request.resourceGroupId;
            this.siteVersion = request.siteVersion;
            this.tags = request.tags;
        } 

        /**
         * <p>Application type</p>
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
         * <p>Whether to enable auto-renewal upon expiration</p>
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
         * <p>Ensures idempotence of the request. Generate a unique value from your client to ensure that it is unique across different requests. ClientToken only supports ASCII characters and cannot exceed 64 characters</p>
         * 
         * <strong>example:</strong>
         * <p>210713a117660695309606626a</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Deployment area</p>
         * 
         * <strong>example:</strong>
         * <p>ChineseMainland</p>
         */
        public Builder deployArea(String deployArea) {
            this.putQueryParameter("DeployArea", deployArea);
            this.deployArea = deployArea;
            return this;
        }

        /**
         * <p>Required. The number of subscription periods</p>
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
         * <p>Extended information</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * <p>Payment type</p>
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
         * <p>Required. The unit of the subscription period, Year: Year, Month: Month, Day: Day, Hour: Hour</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>Required. The quantity of instances to be ordered.</p>
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Site version</p>
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
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateAppInstanceRequest build() {
            return new CreateAppInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateAppInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
