// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreatePluginClassRequest} extends {@link RequestModel}
 *
 * <p>CreatePluginClassRequest</p>
 */
public class CreatePluginClassRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executePriority")
    private Integer executePriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executeStage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executeStage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("supportedMinGatewayVersion")
    private String supportedMinGatewayVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wasmLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wasmLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wasmUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wasmUrl;

    private CreatePluginClassRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.description = builder.description;
        this.executePriority = builder.executePriority;
        this.executeStage = builder.executeStage;
        this.name = builder.name;
        this.supportedMinGatewayVersion = builder.supportedMinGatewayVersion;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
        this.wasmLanguage = builder.wasmLanguage;
        this.wasmUrl = builder.wasmUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executePriority
     */
    public Integer getExecutePriority() {
        return this.executePriority;
    }

    /**
     * @return executeStage
     */
    public String getExecuteStage() {
        return this.executeStage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return supportedMinGatewayVersion
     */
    public String getSupportedMinGatewayVersion() {
        return this.supportedMinGatewayVersion;
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
     * @return wasmLanguage
     */
    public String getWasmLanguage() {
        return this.wasmLanguage;
    }

    /**
     * @return wasmUrl
     */
    public String getWasmUrl() {
        return this.wasmUrl;
    }

    public static final class Builder extends Request.Builder<CreatePluginClassRequest, Builder> {
        private String alias; 
        private String description; 
        private Integer executePriority; 
        private String executeStage; 
        private String name; 
        private String supportedMinGatewayVersion; 
        private String version; 
        private String versionDescription; 
        private String wasmLanguage; 
        private String wasmUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreatePluginClassRequest request) {
            super(request);
            this.alias = request.alias;
            this.description = request.description;
            this.executePriority = request.executePriority;
            this.executeStage = request.executeStage;
            this.name = request.name;
            this.supportedMinGatewayVersion = request.supportedMinGatewayVersion;
            this.version = request.version;
            this.versionDescription = request.versionDescription;
            this.wasmLanguage = request.wasmLanguage;
            this.wasmUrl = request.wasmUrl;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * executePriority.
         */
        public Builder executePriority(Integer executePriority) {
            this.putBodyParameter("executePriority", executePriority);
            this.executePriority = executePriority;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder executeStage(String executeStage) {
            this.putBodyParameter("executeStage", executeStage);
            this.executeStage = executeStage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * supportedMinGatewayVersion.
         */
        public Builder supportedMinGatewayVersion(String supportedMinGatewayVersion) {
            this.putBodyParameter("supportedMinGatewayVersion", supportedMinGatewayVersion);
            this.supportedMinGatewayVersion = supportedMinGatewayVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("versionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder wasmLanguage(String wasmLanguage) {
            this.putBodyParameter("wasmLanguage", wasmLanguage);
            this.wasmLanguage = wasmLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder wasmUrl(String wasmUrl) {
            this.putBodyParameter("wasmUrl", wasmUrl);
            this.wasmUrl = wasmUrl;
            return this;
        }

        @Override
        public CreatePluginClassRequest build() {
            return new CreatePluginClassRequest(this);
        } 

    } 

}
