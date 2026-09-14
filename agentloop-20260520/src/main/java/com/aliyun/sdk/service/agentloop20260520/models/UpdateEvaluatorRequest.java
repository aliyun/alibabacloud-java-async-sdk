// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateEvaluatorRequest} extends {@link RequestModel}
 *
 * <p>UpdateEvaluatorRequest</p>
 */
public class UpdateEvaluatorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("annotations")
    private java.util.List<String> annotations;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateEvaluatorRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.name = builder.name;
        this.annotations = builder.annotations;
        this.config = builder.config;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.properties = builder.properties;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEvaluatorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return annotations
     */
    public java.util.List<String> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateEvaluatorRequest, Builder> {
        private String agentSpace; 
        private String name; 
        private java.util.List<String> annotations; 
        private java.util.Map<String, ?> config; 
        private String description; 
        private String displayName; 
        private java.util.Map<String, ?> properties; 
        private String version; 
        private String versionDescription; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEvaluatorRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.name = request.name;
            this.annotations = request.annotations;
            this.config = request.config;
            this.description = request.description;
            this.displayName = request.displayName;
            this.properties = request.properties;
            this.version = request.version;
            this.versionDescription = request.versionDescription;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The evaluator name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of annotation marks.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;__en&quot;]</p>
         */
        public Builder annotations(java.util.List<String> annotations) {
            this.putBodyParameter("annotations", annotations);
            this.annotations = annotations;
            return this;
        }

        /**
         * <p>The new version configuration. This parameter is typically required when <code>version</code> is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;prompt&quot;:&quot;请更严格地评估任务完成度&quot;}</p>
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The evaluator description.</p>
         * 
         * <strong>example:</strong>
         * <p>判断 Agent 是否完成用户任务</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>链路任务完成度</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The evaluator properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.putBodyParameter("properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The new version number. If specified, a new version is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>优化评分说明</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("versionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateEvaluatorRequest build() {
            return new UpdateEvaluatorRequest(this);
        } 

    } 

}
