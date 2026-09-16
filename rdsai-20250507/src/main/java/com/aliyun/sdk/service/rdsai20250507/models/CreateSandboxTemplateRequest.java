// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateSandboxTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSandboxTemplateRequest</p>
 */
public class CreateSandboxTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCpu")
    private String defaultCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultMemory")
    private String defaultMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Long replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private CreateSandboxTemplateRequest(Builder builder) {
        super(builder);
        this.defaultCpu = builder.defaultCpu;
        this.defaultMemory = builder.defaultMemory;
        this.description = builder.description;
        this.image = builder.image;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.replicas = builder.replicas;
        this.tags = builder.tags;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSandboxTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultCpu
     */
    public String getDefaultCpu() {
        return this.defaultCpu;
    }

    /**
     * @return defaultMemory
     */
    public String getDefaultMemory() {
        return this.defaultMemory;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicas
     */
    public Long getReplicas() {
        return this.replicas;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateSandboxTemplateRequest, Builder> {
        private String defaultCpu; 
        private String defaultMemory; 
        private String description; 
        private String image; 
        private String instanceName; 
        private String regionId; 
        private Long replicas; 
        private java.util.Map<String, String> tags; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSandboxTemplateRequest request) {
            super(request);
            this.defaultCpu = request.defaultCpu;
            this.defaultMemory = request.defaultMemory;
            this.description = request.description;
            this.image = request.image;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.replicas = request.replicas;
            this.tags = request.tags;
            this.templateName = request.templateName;
        } 

        /**
         * <p>The number of CPUs for sandboxes created by using this template. Valid values: 1 to 4.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultCpu(String defaultCpu) {
            this.putQueryParameter("DefaultCpu", defaultCpu);
            this.defaultCpu = defaultCpu;
            return this;
        }

        /**
         * <p>The memory size for sandboxes created by using this template. Unit: Gi. Valid values: 1Gi to 8Gi.</p>
         * 
         * <strong>example:</strong>
         * <p>1Gi</p>
         */
        public Builder defaultMemory(String defaultMemory) {
            this.putQueryParameter("DefaultMemory", defaultMemory);
            this.defaultMemory = defaultMemory;
            return this;
        }

        /**
         * <p>The description of the sandbox template. The description must be unique within the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>code-interpreter</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.putQueryParameter("Image", image);
            this.image = image;
            return this;
        }

        /**
         * <p>The instance ID of the AI application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of prewarmed sandboxes. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder replicas(Long replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map<String, String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The name of the sandbox template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-interpreter</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateSandboxTemplateRequest build() {
            return new CreateSandboxTemplateRequest(this);
        } 

    } 

}
