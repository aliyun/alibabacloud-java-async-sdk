// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseTemplateRequest</p>
 */
public class ModifyDefenseTemplateRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    private ModifyDefenseTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseTemplateRequest, Builder> {
        private String description; 
        private String instanceId; 
        private Long templateId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ModifyDefenseTemplateRequest build() {
            return new ModifyDefenseTemplateRequest(this);
        } 

    } 

}
