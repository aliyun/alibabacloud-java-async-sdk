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
 * {@link PluginClassInfo} extends {@link TeaModel}
 *
 * <p>PluginClassInfo</p>
 */
public class PluginClassInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("configExample")
    private String configExample;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("executePriority")
    private Integer executePriority;

    @com.aliyun.core.annotation.NameInMap("executeStage")
    private String executeStage;

    @com.aliyun.core.annotation.NameInMap("imageName")
    private String imageName;

    @com.aliyun.core.annotation.NameInMap("innerPlugin")
    private Boolean innerPlugin;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("pluginClassId")
    private String pluginClassId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("supportedMinGatewayVersion")
    private String supportedMinGatewayVersion;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("versionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.NameInMap("wasmLanguage")
    private String wasmLanguage;

    @com.aliyun.core.annotation.NameInMap("wasmUrl")
    private String wasmUrl;

    private PluginClassInfo(Builder builder) {
        this.alias = builder.alias;
        this.configExample = builder.configExample;
        this.description = builder.description;
        this.executePriority = builder.executePriority;
        this.executeStage = builder.executeStage;
        this.imageName = builder.imageName;
        this.innerPlugin = builder.innerPlugin;
        this.mode = builder.mode;
        this.name = builder.name;
        this.pluginClassId = builder.pluginClassId;
        this.source = builder.source;
        this.supportedMinGatewayVersion = builder.supportedMinGatewayVersion;
        this.type = builder.type;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
        this.wasmLanguage = builder.wasmLanguage;
        this.wasmUrl = builder.wasmUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PluginClassInfo create() {
        return builder().build();
    }

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
     * @return configExample
     */
    public String getConfigExample() {
        return this.configExample;
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return innerPlugin
     */
    public Boolean getInnerPlugin() {
        return this.innerPlugin;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pluginClassId
     */
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return supportedMinGatewayVersion
     */
    public String getSupportedMinGatewayVersion() {
        return this.supportedMinGatewayVersion;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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

    public static final class Builder {
        private String alias; 
        private String configExample; 
        private String description; 
        private Integer executePriority; 
        private String executeStage; 
        private String imageName; 
        private Boolean innerPlugin; 
        private String mode; 
        private String name; 
        private String pluginClassId; 
        private String source; 
        private String supportedMinGatewayVersion; 
        private String type; 
        private String version; 
        private String versionDescription; 
        private String wasmLanguage; 
        private String wasmUrl; 

        private Builder() {
        } 

        private Builder(PluginClassInfo model) {
            this.alias = model.alias;
            this.configExample = model.configExample;
            this.description = model.description;
            this.executePriority = model.executePriority;
            this.executeStage = model.executeStage;
            this.imageName = model.imageName;
            this.innerPlugin = model.innerPlugin;
            this.mode = model.mode;
            this.name = model.name;
            this.pluginClassId = model.pluginClassId;
            this.source = model.source;
            this.supportedMinGatewayVersion = model.supportedMinGatewayVersion;
            this.type = model.type;
            this.version = model.version;
            this.versionDescription = model.versionDescription;
            this.wasmLanguage = model.wasmLanguage;
            this.wasmUrl = model.wasmUrl;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * configExample.
         */
        public Builder configExample(String configExample) {
            this.configExample = configExample;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * executePriority.
         */
        public Builder executePriority(Integer executePriority) {
            this.executePriority = executePriority;
            return this;
        }

        /**
         * executeStage.
         */
        public Builder executeStage(String executeStage) {
            this.executeStage = executeStage;
            return this;
        }

        /**
         * imageName.
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * innerPlugin.
         */
        public Builder innerPlugin(Boolean innerPlugin) {
            this.innerPlugin = innerPlugin;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * pluginClassId.
         */
        public Builder pluginClassId(String pluginClassId) {
            this.pluginClassId = pluginClassId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * supportedMinGatewayVersion.
         */
        public Builder supportedMinGatewayVersion(String supportedMinGatewayVersion) {
            this.supportedMinGatewayVersion = supportedMinGatewayVersion;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * versionDescription.
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * wasmLanguage.
         */
        public Builder wasmLanguage(String wasmLanguage) {
            this.wasmLanguage = wasmLanguage;
            return this;
        }

        /**
         * wasmUrl.
         */
        public Builder wasmUrl(String wasmUrl) {
            this.wasmUrl = wasmUrl;
            return this;
        }

        public PluginClassInfo build() {
            return new PluginClassInfo(this);
        } 

    } 

}
