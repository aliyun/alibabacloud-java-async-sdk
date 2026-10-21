// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateNormalizationRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateNormalizationRuleRequest</p>
 */
public class UpdateNormalizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendContentPacked")
    private String extendContentPacked;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendFieldStoreMode")
    private String extendFieldStoreMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
    private String normalizationCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleDescription")
    private String normalizationRuleDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleExpression")
    private String normalizationRuleExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleFormat")
    private String normalizationRuleFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleIds")
    private java.util.List<String> normalizationRuleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleMode")
    private String normalizationRuleMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleName")
    private String normalizationRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleType")
    private String normalizationRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSecurityDomainId")
    private String normalizationSecurityDomainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorId")
    private String vendorId;

    private UpdateNormalizationRuleRequest(Builder builder) {
        super(builder);
        this.extendContentPacked = builder.extendContentPacked;
        this.extendFieldStoreMode = builder.extendFieldStoreMode;
        this.lang = builder.lang;
        this.normalizationCategoryId = builder.normalizationCategoryId;
        this.normalizationRuleDescription = builder.normalizationRuleDescription;
        this.normalizationRuleExpression = builder.normalizationRuleExpression;
        this.normalizationRuleFormat = builder.normalizationRuleFormat;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.normalizationRuleIds = builder.normalizationRuleIds;
        this.normalizationRuleMode = builder.normalizationRuleMode;
        this.normalizationRuleName = builder.normalizationRuleName;
        this.normalizationRuleType = builder.normalizationRuleType;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.normalizationSecurityDomainId = builder.normalizationSecurityDomainId;
        this.orderField = builder.orderField;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorId = builder.vendorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNormalizationRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extendContentPacked
     */
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    /**
     * @return extendFieldStoreMode
     */
    public String getExtendFieldStoreMode() {
        return this.extendFieldStoreMode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return normalizationCategoryId
     */
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    /**
     * @return normalizationRuleDescription
     */
    public String getNormalizationRuleDescription() {
        return this.normalizationRuleDescription;
    }

    /**
     * @return normalizationRuleExpression
     */
    public String getNormalizationRuleExpression() {
        return this.normalizationRuleExpression;
    }

    /**
     * @return normalizationRuleFormat
     */
    public String getNormalizationRuleFormat() {
        return this.normalizationRuleFormat;
    }

    /**
     * @return normalizationRuleId
     */
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    /**
     * @return normalizationRuleIds
     */
    public java.util.List<String> getNormalizationRuleIds() {
        return this.normalizationRuleIds;
    }

    /**
     * @return normalizationRuleMode
     */
    public String getNormalizationRuleMode() {
        return this.normalizationRuleMode;
    }

    /**
     * @return normalizationRuleName
     */
    public String getNormalizationRuleName() {
        return this.normalizationRuleName;
    }

    /**
     * @return normalizationRuleType
     */
    public String getNormalizationRuleType() {
        return this.normalizationRuleType;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    /**
     * @return normalizationSecurityDomainId
     */
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return vendorId
     */
    public String getVendorId() {
        return this.vendorId;
    }

    public static final class Builder extends Request.Builder<UpdateNormalizationRuleRequest, Builder> {
        private String extendContentPacked; 
        private String extendFieldStoreMode; 
        private String lang; 
        private String normalizationCategoryId; 
        private String normalizationRuleDescription; 
        private String normalizationRuleExpression; 
        private String normalizationRuleFormat; 
        private String normalizationRuleId; 
        private java.util.List<String> normalizationRuleIds; 
        private String normalizationRuleMode; 
        private String normalizationRuleName; 
        private String normalizationRuleType; 
        private String normalizationSchemaId; 
        private String normalizationSecurityDomainId; 
        private String orderField; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 
        private String vendorId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNormalizationRuleRequest request) {
            super(request);
            this.extendContentPacked = request.extendContentPacked;
            this.extendFieldStoreMode = request.extendFieldStoreMode;
            this.lang = request.lang;
            this.normalizationCategoryId = request.normalizationCategoryId;
            this.normalizationRuleDescription = request.normalizationRuleDescription;
            this.normalizationRuleExpression = request.normalizationRuleExpression;
            this.normalizationRuleFormat = request.normalizationRuleFormat;
            this.normalizationRuleId = request.normalizationRuleId;
            this.normalizationRuleIds = request.normalizationRuleIds;
            this.normalizationRuleMode = request.normalizationRuleMode;
            this.normalizationRuleName = request.normalizationRuleName;
            this.normalizationRuleType = request.normalizationRuleType;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.normalizationSecurityDomainId = request.normalizationSecurityDomainId;
            this.orderField = request.orderField;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorId = request.vendorId;
        } 

        /**
         * <p>Specifies whether to pack non-standard fields into the extended field extend_content. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder extendContentPacked(String extendContentPacked) {
            this.putBodyParameter("ExtendContentPacked", extendContentPacked);
            this.extendContentPacked = extendContentPacked;
            return this;
        }

        /**
         * <p>The extended field storage mode. Valid values: flat, pack, reject.</p>
         * 
         * <strong>example:</strong>
         * <p>flat</p>
         */
        public Builder extendFieldStoreMode(String extendFieldStoreMode) {
            this.putBodyParameter("ExtendFieldStoreMode", extendFieldStoreMode);
            this.extendFieldStoreMode = extendFieldStoreMode;
            return this;
        }

        /**
         * <p>The language of the response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The normalization category to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>HOST_CATEGORY</p>
         */
        public Builder normalizationCategoryId(String normalizationCategoryId) {
            this.putBodyParameter("NormalizationCategoryId", normalizationCategoryId);
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }

        /**
         * <p>The normalization rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np</p>
         */
        public Builder normalizationRuleDescription(String normalizationRuleDescription) {
            this.putBodyParameter("NormalizationRuleDescription", normalizationRuleDescription);
            this.normalizationRuleDescription = normalizationRuleDescription;
            return this;
        }

        /**
         * <p>The normalization rule expression.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content</li>
         * </ul>
         */
        public Builder normalizationRuleExpression(String normalizationRuleExpression) {
            this.putBodyParameter("NormalizationRuleExpression", normalizationRuleExpression);
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }

        /**
         * <p>The normalization rule format.</p>
         * 
         * <strong>example:</strong>
         * <p>SPL</p>
         */
        public Builder normalizationRuleFormat(String normalizationRuleFormat) {
            this.putBodyParameter("NormalizationRuleFormat", normalizationRuleFormat);
            this.normalizationRuleFormat = normalizationRuleFormat;
            return this;
        }

        /**
         * <p>The normalization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nr-z0b2ssjteut85uoh9nzp</p>
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * <p>The list of normalization rule IDs.</p>
         */
        public Builder normalizationRuleIds(java.util.List<String> normalizationRuleIds) {
            String normalizationRuleIdsShrink = shrink(normalizationRuleIds, "NormalizationRuleIds", "json");
            this.putBodyParameter("NormalizationRuleIds", normalizationRuleIdsShrink);
            this.normalizationRuleIds = normalizationRuleIds;
            return this;
        }

        /**
         * <p>The normalization rule mode. Valid values:</p>
         * <ul>
         * <li>both</li>
         * <li>scan</li>
         * <li>realtime</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>both</p>
         */
        public Builder normalizationRuleMode(String normalizationRuleMode) {
            this.putBodyParameter("NormalizationRuleMode", normalizationRuleMode);
            this.normalizationRuleMode = normalizationRuleMode;
            return this;
        }

        /**
         * <p>The normalization rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np</p>
         */
        public Builder normalizationRuleName(String normalizationRuleName) {
            this.putBodyParameter("NormalizationRuleName", normalizationRuleName);
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }

        /**
         * <p>The normalization rule type. Valid values:</p>
         * <ul>
         * <li>predefined: predefined normalization rule.</li>
         * <li>custom: custom normalization rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder normalizationRuleType(String normalizationRuleType) {
            this.putBodyParameter("NormalizationRuleType", normalizationRuleType);
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }

        /**
         * <p>The normalization schema ID.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY</p>
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * <p>The normalization security domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_AND_WEB_SECURITY</p>
         */
        public Builder normalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.putBodyParameter("NormalizationSecurityDomainId", normalizationSecurityDomainId);
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }

        /**
         * <p>The field used to sort the rule list. Valid values:</p>
         * <ul>
         * <li>GmtModified: Sort by modification time.</li>
         * <li>Id: Sort by rule ID (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Id</p>
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The region where the data management center of the threat detection service is located. Select the management center region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets are located outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of the member account that the administrator switches to.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The vendor ID associated with the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        public Builder vendorId(String vendorId) {
            this.putBodyParameter("VendorId", vendorId);
            this.vendorId = vendorId;
            return this;
        }

        @Override
        public UpdateNormalizationRuleRequest build() {
            return new UpdateNormalizationRuleRequest(this);
        } 

    } 

}
