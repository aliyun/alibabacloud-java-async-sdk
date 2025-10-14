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
 * {@link UpdateDataIngestionTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataIngestionTemplateRequest</p>
 */
public class UpdateDataIngestionTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionStatus")
    private String dataIngestionStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateId")
    private String dataIngestionTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateName")
    private String dataIngestionTemplateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataIngestionTemplateRequest(Builder builder) {
        super(builder);
        this.dataIngestionStatus = builder.dataIngestionStatus;
        this.dataIngestionTemplateId = builder.dataIngestionTemplateId;
        this.dataIngestionTemplateName = builder.dataIngestionTemplateName;
        this.lang = builder.lang;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataIngestionTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestionStatus
     */
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    /**
     * @return dataIngestionTemplateId
     */
    public String getDataIngestionTemplateId() {
        return this.dataIngestionTemplateId;
    }

    /**
     * @return dataIngestionTemplateName
     */
    public String getDataIngestionTemplateName() {
        return this.dataIngestionTemplateName;
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

    public static final class Builder extends Request.Builder<UpdateDataIngestionTemplateRequest, Builder> {
        private String dataIngestionStatus; 
        private String dataIngestionTemplateId; 
        private String dataIngestionTemplateName; 
        private String lang; 
        private String normalizationRuleId; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataIngestionTemplateRequest request) {
            super(request);
            this.dataIngestionStatus = request.dataIngestionStatus;
            this.dataIngestionTemplateId = request.dataIngestionTemplateId;
            this.dataIngestionTemplateName = request.dataIngestionTemplateName;
            this.lang = request.lang;
            this.normalizationRuleId = request.normalizationRuleId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * DataIngestionStatus.
         */
        public Builder dataIngestionStatus(String dataIngestionStatus) {
            this.putBodyParameter("DataIngestionStatus", dataIngestionStatus);
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }

        /**
         * DataIngestionTemplateId.
         */
        public Builder dataIngestionTemplateId(String dataIngestionTemplateId) {
            this.putBodyParameter("DataIngestionTemplateId", dataIngestionTemplateId);
            this.dataIngestionTemplateId = dataIngestionTemplateId;
            return this;
        }

        /**
         * DataIngestionTemplateName.
         */
        public Builder dataIngestionTemplateName(String dataIngestionTemplateName) {
            this.putBodyParameter("DataIngestionTemplateName", dataIngestionTemplateName);
            this.dataIngestionTemplateName = dataIngestionTemplateName;
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
         * NormalizationRuleId.
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
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
        public UpdateDataIngestionTemplateRequest build() {
            return new UpdateDataIngestionTemplateRequest(this);
        } 

    } 

}
