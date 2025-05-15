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
    @com.aliyun.core.annotation.NameInMap("PlanTemplateName")
    private String planTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private CreateExperimentPlanRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.externalParams = builder.externalParams;
        this.planTemplateName = builder.planTemplateName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.tag = builder.tag;
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
     * @return planTemplateName
     */
    public String getPlanTemplateName() {
        return this.planTemplateName;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private String planTemplateName; 
        private String resourceGroupId; 
        private Long resourceId; 
        private java.util.List<Tag> tag; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentPlanRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.externalParams = request.externalParams;
            this.planTemplateName = request.planTemplateName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.tag = request.tag;
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
         * <p>Plan Template Name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder planTemplateName(String planTemplateName) {
            this.putQueryParameter("PlanTemplateName", planTemplateName);
            this.planTemplateName = planTemplateName;
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
         * <p>This parameter is required.</p>
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
         * <p>Resource tags</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Template ID</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link CreateExperimentPlanRequest} extends {@link TeaModel}
     *
     * <p>CreateExperimentPlanRequest</p>
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
             * <p>Key</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Value</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
