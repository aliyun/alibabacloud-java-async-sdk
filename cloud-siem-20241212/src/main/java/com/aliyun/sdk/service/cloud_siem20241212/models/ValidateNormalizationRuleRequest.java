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
 * {@link ValidateNormalizationRuleRequest} extends {@link RequestModel}
 *
 * <p>ValidateNormalizationRuleRequest</p>
 */
public class ValidateNormalizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendFieldStoreMode")
    private String extendFieldStoreMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogSample")
    private String logSample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
    private String normalizationCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleExpression")
    private String normalizationRuleExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleMode")
    private String normalizationRuleMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    private String normalizationSchemaId;

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

    private ValidateNormalizationRuleRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.extendFieldStoreMode = builder.extendFieldStoreMode;
        this.lang = builder.lang;
        this.logSample = builder.logSample;
        this.normalizationCategoryId = builder.normalizationCategoryId;
        this.normalizationRuleExpression = builder.normalizationRuleExpression;
        this.normalizationRuleMode = builder.normalizationRuleMode;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorId = builder.vendorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateNormalizationRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return logSample
     */
    public String getLogSample() {
        return this.logSample;
    }

    /**
     * @return normalizationCategoryId
     */
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    /**
     * @return normalizationRuleExpression
     */
    public String getNormalizationRuleExpression() {
        return this.normalizationRuleExpression;
    }

    /**
     * @return normalizationRuleMode
     */
    public String getNormalizationRuleMode() {
        return this.normalizationRuleMode;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
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

    public static final class Builder extends Request.Builder<ValidateNormalizationRuleRequest, Builder> {
        private String data; 
        private String extendFieldStoreMode; 
        private String lang; 
        private String logSample; 
        private String normalizationCategoryId; 
        private String normalizationRuleExpression; 
        private String normalizationRuleMode; 
        private String normalizationSchemaId; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 
        private String vendorId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateNormalizationRuleRequest request) {
            super(request);
            this.data = request.data;
            this.extendFieldStoreMode = request.extendFieldStoreMode;
            this.lang = request.lang;
            this.logSample = request.logSample;
            this.normalizationCategoryId = request.normalizationCategoryId;
            this.normalizationRuleExpression = request.normalizationRuleExpression;
            this.normalizationRuleMode = request.normalizationRuleMode;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorId = request.vendorId;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * ExtendFieldStoreMode.
         */
        public Builder extendFieldStoreMode(String extendFieldStoreMode) {
            this.putBodyParameter("ExtendFieldStoreMode", extendFieldStoreMode);
            this.extendFieldStoreMode = extendFieldStoreMode;
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
         * LogSample.
         */
        public Builder logSample(String logSample) {
            this.putBodyParameter("LogSample", logSample);
            this.logSample = logSample;
            return this;
        }

        /**
         * NormalizationCategoryId.
         */
        public Builder normalizationCategoryId(String normalizationCategoryId) {
            this.putBodyParameter("NormalizationCategoryId", normalizationCategoryId);
            this.normalizationCategoryId = normalizationCategoryId;
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
         * NormalizationRuleMode.
         */
        public Builder normalizationRuleMode(String normalizationRuleMode) {
            this.putBodyParameter("NormalizationRuleMode", normalizationRuleMode);
            this.normalizationRuleMode = normalizationRuleMode;
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
        public ValidateNormalizationRuleRequest build() {
            return new ValidateNormalizationRuleRequest(this);
        } 

    } 

}
