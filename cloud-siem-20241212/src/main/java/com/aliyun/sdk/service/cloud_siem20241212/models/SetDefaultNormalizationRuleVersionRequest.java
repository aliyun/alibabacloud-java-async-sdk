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
 * {@link SetDefaultNormalizationRuleVersionRequest} extends {@link RequestModel}
 *
 * <p>SetDefaultNormalizationRuleVersionRequest</p>
 */
public class SetDefaultNormalizationRuleVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleVersion")
    private Integer normalizationRuleVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private SetDefaultNormalizationRuleVersionRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.normalizationRuleVersion = builder.normalizationRuleVersion;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultNormalizationRuleVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return normalizationRuleId
     */
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    /**
     * @return normalizationRuleVersion
     */
    public Integer getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
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

    public static final class Builder extends Request.Builder<SetDefaultNormalizationRuleVersionRequest, Builder> {
        private String lang; 
        private String normalizationRuleId; 
        private Integer normalizationRuleVersion; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(SetDefaultNormalizationRuleVersionRequest request) {
            super(request);
            this.lang = request.lang;
            this.normalizationRuleId = request.normalizationRuleId;
            this.normalizationRuleVersion = request.normalizationRuleVersion;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
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
         * <p>The normalization rule ID. Only custom-type normalization rules are supported. This operation does not support preset normalization rules.</p>
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
         * <p>The normalization rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        public Builder normalizationRuleVersion(Integer normalizationRuleVersion) {
            this.putBodyParameter("NormalizationRuleVersion", normalizationRuleVersion);
            this.normalizationRuleVersion = normalizationRuleVersion;
            return this;
        }

        /**
         * <p>The region where the data management center of the threat analysis feature is located. Select the region based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets reside outside China.</li>
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
         * <p>The user ID that the administrator uses to switch to the view of another member account.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public SetDefaultNormalizationRuleVersionRequest build() {
            return new SetDefaultNormalizationRuleVersionRequest(this);
        } 

    } 

}
