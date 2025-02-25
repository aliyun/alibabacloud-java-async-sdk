// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link CreateExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentPlanRequest</p>
 */
public class CreateExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalParams")
    private java.util.Map<String, ?> externalParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private Long resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private CreateExperimentPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.externalParams = builder.externalParams;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return externalParams
     */
    public java.util.Map<String, ?> getExternalParams() {
        return this.externalParams;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public Long getResourceId() {
        return this.resourceId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateExperimentPlanRequest, Builder> {
        private String regionId; 
        private java.util.Map<String, ?> externalParams; 
        private String resourceGroupId; 
        private Long resourceId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.externalParams = request.externalParams;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.templateId = request.templateId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Additional parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder externalParams(java.util.Map<String, ?> externalParams) {
            String externalParamsShrink = shrink(externalParams, "ExternalParams", "json");
            this.putQueryParameter("ExternalParams", externalParamsShrink);
            this.externalParams = externalParams;
            return this;
        }

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzij65sf2rr5i</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>189</p>
         */
        public Builder resourceId(Long resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Template ID</p>
         * 
         * <strong>example:</strong>
         * <p>349623</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateExperimentPlanRequest build() {
            return new CreateExperimentPlanRequest(this);
        } 

    } 

}
