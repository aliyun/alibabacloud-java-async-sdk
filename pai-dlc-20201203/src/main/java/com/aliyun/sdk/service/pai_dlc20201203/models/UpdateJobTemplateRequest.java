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
 * {@link UpdateJobTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobTemplateRequest</p>
 */
public class UpdateJobTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Constraints")
    private java.util.Map<String, ?> constraints;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SetAsDefault")
    private Boolean setAsDefault;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private UpdateJobTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
        this.constraints = builder.constraints;
        this.content = builder.content;
        this.description = builder.description;
        this.metadata = builder.metadata;
        this.setAsDefault = builder.setAsDefault;
        this.templateName = builder.templateName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
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
     * @return setAsDefault
     */
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpdateJobTemplateRequest, Builder> {
        private String templateId; 
        private java.util.Map<String, ?> constraints; 
        private String content; 
        private String description; 
        private java.util.Map<String, ?> metadata; 
        private Boolean setAsDefault; 
        private String templateName; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
            this.constraints = request.constraints;
            this.content = request.content;
            this.description = request.description;
            this.metadata = request.metadata;
            this.setAsDefault = request.setAsDefault;
            this.templateName = request.templateName;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tplmceolmf2****</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>字段约束规则。Key 为 JSONPath 表达式，Value 为约束类型：locked（锁定不可覆盖）、overridable（可覆盖）、required（必填）。需与 Content 同时提供，不允许单独更新。</p>
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
         * <p>任务模板的配置内容，支持 CreateJob 接口的所有参数字段，以 JSON 格式传入。提供时会创建新版本。</p>
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
         * <p>当创建了新版本时，是否将新版本设为默认版本。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder setAsDefault(Boolean setAsDefault) {
            this.putBodyParameter("SetAsDefault", setAsDefault);
            this.setAsDefault = setAsDefault;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Integer version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateJobTemplateRequest build() {
            return new UpdateJobTemplateRequest(this);
        } 

    } 

}
