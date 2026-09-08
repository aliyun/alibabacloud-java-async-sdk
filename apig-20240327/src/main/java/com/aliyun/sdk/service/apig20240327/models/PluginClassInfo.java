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
         * <p>The plugin class alias.</p>
         * 
         * <strong>example:</strong>
         * <p>AI安全护栏</p>
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * <p>The configuration example (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;checkRequest&quot;:true}</p>
         */
        public Builder configExample(String configExample) {
            this.configExample = configExample;
            return this;
        }

        /**
         * <p>The plugin class description.</p>
         * 
         * <strong>example:</strong>
         * <p>AI请求内容安全检测插件</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The execution priority.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder executePriority(Integer executePriority) {
            this.executePriority = executePriority;
            return this;
        }

        /**
         * <p>The execution stage.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTHN</p>
         */
        public Builder executeStage(String executeStage) {
            this.executeStage = executeStage;
            return this;
        }

        /**
         * <p>The Wasm image name.</p>
         * 
         * <strong>example:</strong>
         * <p>higress-registry.tencentcloudcr.com/ai-security-guard</p>
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>Indicates whether the plugin is a built-in plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder innerPlugin(Boolean innerPlugin) {
            this.innerPlugin = innerPlugin;
            return this;
        }

        /**
         * <p>The plugin running mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Wasm</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The plugin class name.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-security-guard</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The plugin class ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cls-xxx</p>
         */
        public Builder pluginClassId(String pluginClassId) {
            this.pluginClassId = pluginClassId;
            return this;
        }

        /**
         * <p>The plugin source.</p>
         * 
         * <strong>example:</strong>
         * <p>HigressOfficial</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The minimum supported gateway DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.1.11</p>
         */
        public Builder supportedMinGatewayVersion(String supportedMinGatewayVersion) {
            this.supportedMinGatewayVersion = supportedMinGatewayVersion;
            return this;
        }

        /**
         * <p>The plugin type category.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The plugin version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>初始版本</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The Wasm programming language.</p>
         * 
         * <strong>example:</strong>
         * <p>Rust</p>
         */
        public Builder wasmLanguage(String wasmLanguage) {
            this.wasmLanguage = wasmLanguage;
            return this;
        }

        /**
         * <p>The Wasm file download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://...</p>
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
