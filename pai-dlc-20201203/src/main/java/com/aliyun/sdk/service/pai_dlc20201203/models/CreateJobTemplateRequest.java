// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CreateJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateJobTemplateRequest</p>
 */
public class CreateJobTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Constraints")
    private java.util.Map<String, ?> constraints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String workspaceId;

    private CreateJobTemplateRequest(Builder builder) {
        super(builder);
        this.constraints = builder.constraints;
        this.content = builder.content;
        this.description = builder.description;
        this.metadata = builder.metadata;
        this.templateName = builder.templateName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return constraints
     */
    public java.util.Map<String, ?> getConstraints() {
        return this.constraints;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateJobTemplateRequest, Builder> {
        private java.util.Map<String, ?> constraints; 
        private String content; 
        private String description; 
        private java.util.Map<String, ?> metadata; 
        private String templateName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobTemplateRequest request) {
            super(request);
            this.constraints = request.constraints;
            this.content = request.content;
            this.description = request.description;
            this.metadata = request.metadata;
            this.templateName = request.templateName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>字段约束规则。Key 为 JSONPath 表达式，Value 为约束类型：locked（锁定不可覆盖）、overridable（可覆盖）、required（必填）。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;JobSpecs[0].Image&quot;:&quot;locked&quot;,&quot;UserCommand&quot;:&quot;locked&quot;,&quot;JobType&quot;:&quot;locked&quot;}</p>
         */
        public Builder constraints(java.util.Map<String, ?> constraints) {
            this.putBodyParameter("Constraints", constraints);
            this.constraints = constraints;
            return this;
        }

        /**
         * <p>任务模板的配置内容，包含作业配置参数，以 JSON 格式传入。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;WorkspaceId&quot;:&quot;15****05&quot;,&quot;JobType&quot;:&quot;PyTorchJob&quot;,&quot;UserCommand&quot;:&quot;echo hello&quot;,&quot;JobSpecs&quot;:[{&quot;Type&quot;:&quot;Worker&quot;,&quot;PodCount&quot;:1,&quot;Image&quot;:&quot;dsw-registry-vpc.cn-hangzhou.cr.aliyuncs.com/pai/pytorch:2.8.0-gpu-py313-cu129-ubuntu22.04-3995b779-1764361782&quot;,&quot;EcsSpec&quot;:&quot;ecs.gn7i-c8g1.2xlarge&quot;}],&quot;ResourceType&quot;:&quot;ECS&quot;,&quot;_ResourcePaymentType&quot;:&quot;PostPaid&quot;,&quot;CredentialConfig&quot;:{&quot;EnableCredentialInject&quot;:false},&quot;Accessibility&quot;:&quot;PRIVATE&quot;,&quot;Settings&quot;:{&quot;JobReservedMinutes&quot;:0,&quot;Tags&quot;:{}}}</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>用户自定义的键值对元数据，用于存储模板的附加信息。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.putBodyParameter("Metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-template-example-1778047****</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>工作空间 ID。如何获取工作空间 ID，请参见 ListWorkspaces。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15****05</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateJobTemplateRequest build() {
            return new CreateJobTemplateRequest(this);
        } 

    } 

}
