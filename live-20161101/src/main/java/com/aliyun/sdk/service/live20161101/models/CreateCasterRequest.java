// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateCasterRequest} extends {@link RequestModel}
 *
 * <p>CreateCasterRequest</p>
 */
public class CreateCasterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterName")
    private String casterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterTemplate")
    private String casterTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NormType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer normType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PurchaseTime")
    private String purchaseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateCasterRequest(Builder builder) {
        super(builder);
        this.casterName = builder.casterName;
        this.casterTemplate = builder.casterTemplate;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.expireTime = builder.expireTime;
        this.normType = builder.normType;
        this.ownerId = builder.ownerId;
        this.purchaseTime = builder.purchaseTime;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCasterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return casterTemplate
     */
    public String getCasterTemplate() {
        return this.casterTemplate;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return normType
     */
    public Integer getNormType() {
        return this.normType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return purchaseTime
     */
    public String getPurchaseTime() {
        return this.purchaseTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateCasterRequest, Builder> {
        private String casterName; 
        private String casterTemplate; 
        private String chargeType; 
        private String clientToken; 
        private String expireTime; 
        private Integer normType; 
        private Long ownerId; 
        private String purchaseTime; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateCasterRequest request) {
            super(request);
            this.casterName = request.casterName;
            this.casterTemplate = request.casterTemplate;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.expireTime = request.expireTime;
            this.normType = request.normType;
            this.ownerId = request.ownerId;
            this.purchaseTime = request.purchaseTime;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * <p>The name of the production studio.</p>
         * 
         * <strong>example:</strong>
         * <p>liveCaster****</p>
         */
        public Builder casterName(String casterName) {
            this.putQueryParameter("CasterName", casterName);
            this.casterName = casterName;
            return this;
        }

        /**
         * <p>The preset resolution of the production studio. If the subscription billing method is used, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>lp_ld</strong>: low definition</li>
         * <li><strong>lp_sd</strong>: standard definition</li>
         * <li><strong>lp_hd</strong>: high definition</li>
         * <li><strong>lp_ud</strong>: ultra high definition</li>
         * <li><strong>lp_ld_v</strong>: low definition (portrait mode)</li>
         * <li><strong>lp_sd_v</strong>: standard definition (portrait mode)</li>
         * <li><strong>lp_hd_v</strong>: high definition (portrait mode)</li>
         * <li><strong>lp_ud_v</strong>: ultra high definition (portrait mode)</li>
         * </ul>
         * <blockquote>
         * <p> If the pay-as-you-go billing method is used, you must call the <a href="https://help.aliyun.com/document_detail/60271.html">SetCasterConfig</a> operation to specify the resolution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lp_sd</p>
         */
        public Builder casterTemplate(String casterTemplate) {
            this.putQueryParameter("CasterTemplate", casterTemplate);
            this.casterTemplate = casterTemplate;
            return this;
        }

        /**
         * <p>The billing method. Only the pay-as-you-go billing method is supported.**** Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription. This billing method is not yet supported.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can specify a custom value for this parameter, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>53200b81-b761-4c10-842a-a0726d97****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The expiration time of the production studio. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> This parameter is valid only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-08-22T12:10:10Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The type of the production studio. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: general mode</li>
         * <li><strong>6</strong>: playlist mode (for carousel playback)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder normType(Integer normType) {
            this.putQueryParameter("NormType", normType);
            this.normType = normType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The time when the production studio was purchased. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> This parameter is valid only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-08-20T12:10:10Z</p>
         */
        public Builder purchaseTime(String purchaseTime) {
            this.putQueryParameter("PurchaseTime", purchaseTime);
            this.purchaseTime = purchaseTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzw******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateCasterRequest build() {
            return new CreateCasterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCasterRequest} extends {@link TeaModel}
     *
     * <p>CreateCasterRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
