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
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
    private String normalizationCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ValidateNormalizationRuleRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.lang = builder.lang;
        this.normalizationCategoryId = builder.normalizationCategoryId;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
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
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
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

    public static final class Builder extends Request.Builder<ValidateNormalizationRuleRequest, Builder> {
        private String data; 
        private String lang; 
        private String normalizationCategoryId; 
        private String normalizationSchemaId; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ValidateNormalizationRuleRequest request) {
            super(request);
            this.data = request.data;
            this.lang = request.lang;
            this.normalizationCategoryId = request.normalizationCategoryId;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
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
         * NormalizationSchemaId.
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
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

        @Override
        public ValidateNormalizationRuleRequest build() {
            return new ValidateNormalizationRuleRequest(this);
        } 

    } 

}
