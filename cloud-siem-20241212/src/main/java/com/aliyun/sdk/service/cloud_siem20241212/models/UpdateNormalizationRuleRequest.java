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
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

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
        this.lang = builder.lang;
        this.normalizationRuleDescription = builder.normalizationRuleDescription;
        this.normalizationRuleExpression = builder.normalizationRuleExpression;
        this.normalizationRuleFormat = builder.normalizationRuleFormat;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.normalizationRuleIds = builder.normalizationRuleIds;
        this.normalizationRuleMode = builder.normalizationRuleMode;
        this.normalizationRuleName = builder.normalizationRuleName;
        this.normalizationRuleType = builder.normalizationRuleType;
        this.normalizationSchemaId = builder.normalizationSchemaId;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
        private String lang; 
        private String normalizationRuleDescription; 
        private String normalizationRuleExpression; 
        private String normalizationRuleFormat; 
        private String normalizationRuleId; 
        private java.util.List<String> normalizationRuleIds; 
        private String normalizationRuleMode; 
        private String normalizationRuleName; 
        private String normalizationRuleType; 
        private String normalizationSchemaId; 
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
            this.lang = request.lang;
            this.normalizationRuleDescription = request.normalizationRuleDescription;
            this.normalizationRuleExpression = request.normalizationRuleExpression;
            this.normalizationRuleFormat = request.normalizationRuleFormat;
            this.normalizationRuleId = request.normalizationRuleId;
            this.normalizationRuleIds = request.normalizationRuleIds;
            this.normalizationRuleMode = request.normalizationRuleMode;
            this.normalizationRuleName = request.normalizationRuleName;
            this.normalizationRuleType = request.normalizationRuleType;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.orderField = request.orderField;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorId = request.vendorId;
        } 

        /**
         * ExtendContentPacked.
         */
        public Builder extendContentPacked(String extendContentPacked) {
            this.putBodyParameter("ExtendContentPacked", extendContentPacked);
            this.extendContentPacked = extendContentPacked;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NormalizationRuleDescription.
         */
        public Builder normalizationRuleDescription(String normalizationRuleDescription) {
            this.putBodyParameter("NormalizationRuleDescription", normalizationRuleDescription);
            this.normalizationRuleDescription = normalizationRuleDescription;
            return this;
        }

        /**
         * NormalizationRuleExpression.
         */
        public Builder normalizationRuleExpression(String normalizationRuleExpression) {
            this.putBodyParameter("NormalizationRuleExpression", normalizationRuleExpression);
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }

        /**
         * NormalizationRuleFormat.
         */
        public Builder normalizationRuleFormat(String normalizationRuleFormat) {
            this.putBodyParameter("NormalizationRuleFormat", normalizationRuleFormat);
            this.normalizationRuleFormat = normalizationRuleFormat;
            return this;
        }

        /**
         * NormalizationRuleId.
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * NormalizationRuleIds.
         */
        public Builder normalizationRuleIds(java.util.List<String> normalizationRuleIds) {
            String normalizationRuleIdsShrink = shrink(normalizationRuleIds, "NormalizationRuleIds", "json");
            this.putBodyParameter("NormalizationRuleIds", normalizationRuleIdsShrink);
            this.normalizationRuleIds = normalizationRuleIds;
            return this;
        }

        /**
         * NormalizationRuleMode.
         */
        public Builder normalizationRuleMode(String normalizationRuleMode) {
            this.putBodyParameter("NormalizationRuleMode", normalizationRuleMode);
            this.normalizationRuleMode = normalizationRuleMode;
            return this;
        }

        /**
         * NormalizationRuleName.
         */
        public Builder normalizationRuleName(String normalizationRuleName) {
            this.putBodyParameter("NormalizationRuleName", normalizationRuleName);
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }

        /**
         * NormalizationRuleType.
         */
        public Builder normalizationRuleType(String normalizationRuleType) {
            this.putBodyParameter("NormalizationRuleType", normalizationRuleType);
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }

        /**
         * NormalizationSchemaId.
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * VendorId.
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
