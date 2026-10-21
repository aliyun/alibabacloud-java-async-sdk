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
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The storage mode of extended fields. Valid values: flat, pack, and reject.</p>
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
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required in actual API calls. If this parameter is not provided, the service returns a 400 error with the message \&quot;The specified Lang can not be empty.\&quot; Explicitly specify the language code.</p>
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
         * <p>The log sample in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aaa&quot;:&quot;bbb&quot;,&quot;xxx&quot;:&quot;yyy&quot;}</p>
         */
        public Builder logSample(String logSample) {
            this.putBodyParameter("LogSample", logSample);
            this.logSample = logSample;
            return this;
        }

        /**
         * <p>The normalization category to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        public Builder normalizationCategoryId(String normalizationCategoryId) {
            this.putBodyParameter("NormalizationCategoryId", normalizationCategoryId);
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }

        /**
         * <p>The expression of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder normalizationRuleExpression(String normalizationRuleExpression) {
            this.putBodyParameter("NormalizationRuleExpression", normalizationRuleExpression);
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }

        /**
         * <p>The mode of the normalization rule. Valid values: both and realtime.</p>
         * 
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        public Builder normalizationRuleMode(String normalizationRuleMode) {
            this.putBodyParameter("NormalizationRuleMode", normalizationRuleMode);
            this.normalizationRuleMode = normalizationRuleMode;
            return this;
        }

        /**
         * <p>The ID of the normalization schema to which the rule belongs. This parameter is required in actual API calls. If this parameter is not provided, the service returns a 400 error.</p>
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
         * <p>The ID of the product.</p>
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
         * <p>The region where the data management center of Threat Analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
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
         * <p>The ID of the user whose perspective the administrator switches to.</p>
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
         * <p>The ID of the vendor.</p>
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
        public ValidateNormalizationRuleRequest build() {
            return new ValidateNormalizationRuleRequest(this);
        } 

    } 

}
