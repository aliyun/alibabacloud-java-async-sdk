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
         * <p>The status of data ingestion. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder dataIngestionStatus(String dataIngestionStatus) {
            this.putBodyParameter("DataIngestionStatus", dataIngestionStatus);
            this.dataIngestionStatus = dataIngestionStatus;
            return this;
        }

        /**
         * <p>The ID of the data ingestion template.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_ingestion_173326*******</p>
         */
        public Builder dataIngestionTemplateId(String dataIngestionTemplateId) {
            this.putBodyParameter("DataIngestionTemplateId", dataIngestionTemplateId);
            this.dataIngestionTemplateId = dataIngestionTemplateId;
            return this;
        }

        /**
         * <p>The name of the data source template.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_ingestion_173326*******</p>
         */
        public Builder dataIngestionTemplateName(String dataIngestionTemplateName) {
            this.putBodyParameter("DataIngestionTemplateName", dataIngestionTemplateName);
            this.dataIngestionTemplateName = dataIngestionTemplateName;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
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
         * <p>The ID of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_actiontrail_event_rule</p>
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * <p>The region where the Data Management center for threat analysis is located. Select a region for the management center based on the region of your asset. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: The asset is in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: The asset is outside China.</p>
         * </li>
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
         * <p>The user ID of the member. This parameter is used by an administrator to switch to the perspective of the member.</p>
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
        public UpdateDataIngestionTemplateRequest build() {
            return new UpdateDataIngestionTemplateRequest(this);
        } 

    } 

}
