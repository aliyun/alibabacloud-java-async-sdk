// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link UpdateModelTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelTemplateRequest</p>
 */
public class UpdateModelTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefScope")
    private String refScope;

    private UpdateModelTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.description = builder.description;
        this.modelTemplateId = builder.modelTemplateId;
        this.name = builder.name;
        this.refScope = builder.refScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return refScope
     */
    public String getRefScope() {
        return this.refScope;
    }

    public static final class Builder extends Request.Builder<UpdateModelTemplateRequest, Builder> {
        private String config; 
        private String description; 
        private String modelTemplateId; 
        private String name; 
        private String refScope; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.description = request.description;
            this.modelTemplateId = request.modelTemplateId;
            this.name = request.name;
            this.refScope = request.refScope;
        } 

        /**
         * <p>The model group configuration JSON object. You can use this field to modify the default model. The configuration format varies depending on the agent provider (AgentProvider):</p>
         * <ul>
         * <li><p><strong>OpenClaw / AgenticComputer scenarios:</strong>
         * Set the default model by using the <code>defaults.model.primary</code> field in the format of <code>provider name/model code</code>.</p>
         * </li>
         * <li><p><strong>HermesAgent scenario:</strong>
         * Specify the provider name by using <code>model.provider</code> and the model code by using <code>model.default</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>:</p>
         * <ul>
         * <li>When you modify the default model, the system verifies whether the specified provider and model code already exist in the model group.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw：
         * {&quot;defaults&quot;:{&quot;model&quot;:{&quot;primary&quot;:&quot;bailian/qwen3.5-plus&quot;}}}</p>
         * <p>HermesAgent：
         * {&quot;model&quot;:{&quot;provider&quot;:&quot;bailian&quot;,&quot;default&quot;:&quot;qwen3.5-plus&quot;}}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The template group description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test model group</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The model group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.putQueryParameter("ModelTemplateId", modelTemplateId);
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * <p>The template group name.</p>
         * 
         * <strong>example:</strong>
         * <p>model-template-001</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The authorization scope. This parameter is optional and can be modified only for Common model groups. Valid values: ALL_USER and USER_MIXED.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_USER</p>
         */
        public Builder refScope(String refScope) {
            this.putQueryParameter("RefScope", refScope);
            this.refScope = refScope;
            return this;
        }

        @Override
        public UpdateModelTemplateRequest build() {
            return new UpdateModelTemplateRequest(this);
        } 

    } 

}
