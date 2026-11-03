// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link InitContainerConfig} extends {@link TeaModel}
 *
 * <p>InitContainerConfig</p>
 */
public class InitContainerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
    private String emptyDirDesc;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SecretMountDesc")
    private String secretMountDesc;

    private InitContainerConfig(Builder builder) {
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.emptyDirDesc = builder.emptyDirDesc;
        this.envs = builder.envs;
        this.imageUrl = builder.imageUrl;
        this.name = builder.name;
        this.secretMountDesc = builder.secretMountDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitContainerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public String getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMapMountDesc
     */
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    /**
     * @return emptyDirDesc
     */
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return secretMountDesc
     */
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    public static final class Builder {
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private String emptyDirDesc; 
        private String envs; 
        private String imageUrl; 
        private String name; 
        private String secretMountDesc; 

        private Builder() {
        } 

        private Builder(InitContainerConfig model) {
            this.command = model.command;
            this.commandArgs = model.commandArgs;
            this.configMapMountDesc = model.configMapMountDesc;
            this.emptyDirDesc = model.emptyDirDesc;
            this.envs = model.envs;
            this.imageUrl = model.imageUrl;
            this.name = model.name;
            this.secretMountDesc = model.secretMountDesc;
        } 

        /**
         * <p>Start command for the image.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>Arguments for the image start command.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;-c\&quot;,\&quot;/bin/bash /home/admin/bin/start.sh\&quot;]</p>
         */
        public Builder commandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * <p>ConfigMap mount description.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * <p>EmptyDir mount description.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
         */
        public Builder emptyDirDesc(String emptyDirDesc) {
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }

        /**
         * <p>Environment variable parameters for the container.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
         */
        public Builder envs(String envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The address of the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>Container name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * SecretMountDesc.
         */
        public Builder secretMountDesc(String secretMountDesc) {
            this.secretMountDesc = secretMountDesc;
            return this;
        }

        public InitContainerConfig build() {
            return new InitContainerConfig(this);
        } 

    } 

}
