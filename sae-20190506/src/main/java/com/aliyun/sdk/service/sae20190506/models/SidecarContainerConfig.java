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
 * {@link SidecarContainerConfig} extends {@link TeaModel}
 *
 * <p>SidecarContainerConfig</p>
 */
public class SidecarContainerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("CommandArgs")
    private String commandArgs;

    @com.aliyun.core.annotation.NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("EmptyDirDesc")
    private String emptyDirDesc;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private String envs;

    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("Liveness")
    private String liveness;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PostStart")
    private String postStart;

    @com.aliyun.core.annotation.NameInMap("PreStop")
    private String preStop;

    @com.aliyun.core.annotation.NameInMap("Readiness")
    private String readiness;

    @com.aliyun.core.annotation.NameInMap("SecretMountDesc")
    private String secretMountDesc;

    private SidecarContainerConfig(Builder builder) {
        this.acrInstanceId = builder.acrInstanceId;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.cpu = builder.cpu;
        this.emptyDirDesc = builder.emptyDirDesc;
        this.envs = builder.envs;
        this.imageUrl = builder.imageUrl;
        this.liveness = builder.liveness;
        this.memory = builder.memory;
        this.name = builder.name;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.readiness = builder.readiness;
        this.secretMountDesc = builder.secretMountDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SidecarContainerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
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
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
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
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return postStart
     */
    public String getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return readiness
     */
    public String getReadiness() {
        return this.readiness;
    }

    /**
     * @return secretMountDesc
     */
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    public static final class Builder {
        private String acrInstanceId; 
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private Integer cpu; 
        private String emptyDirDesc; 
        private String envs; 
        private String imageUrl; 
        private String liveness; 
        private Integer memory; 
        private String name; 
        private String postStart; 
        private String preStop; 
        private String readiness; 
        private String secretMountDesc; 

        private Builder() {
        } 

        private Builder(SidecarContainerConfig model) {
            this.acrInstanceId = model.acrInstanceId;
            this.command = model.command;
            this.commandArgs = model.commandArgs;
            this.configMapMountDesc = model.configMapMountDesc;
            this.cpu = model.cpu;
            this.emptyDirDesc = model.emptyDirDesc;
            this.envs = model.envs;
            this.imageUrl = model.imageUrl;
            this.liveness = model.liveness;
            this.memory = model.memory;
            this.name = model.name;
            this.postStart = model.postStart;
            this.preStop = model.preStop;
            this.readiness = model.readiness;
            this.secretMountDesc = model.secretMountDesc;
        } 

        /**
         * <p>The ID of the Container Registry ACR Enterprise instance. This parameter is required when ImageUrl is a Container Registry Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * <p>The image startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>python</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>The image startup command arguments.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        public Builder commandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * <p>The ConfigMap mount description.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * <p>Cpu</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The EmptyDir description.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
         */
        public Builder emptyDirDesc(String emptyDirDesc) {
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }

        /**
         * <p>The container environment variable parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
         */
        public Builder envs(String envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The liveness probe configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
         */
        public Builder liveness(String liveness) {
            this.liveness = liveness;
            return this;
        }

        /**
         * <p>Memory</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The PostStart configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
         */
        public Builder postStart(String postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * <p>The PreStop configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
         */
        public Builder preStop(String preStop) {
            this.preStop = preStop;
            return this;
        }

        /**
         * <p>The readiness probe configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
         */
        public Builder readiness(String readiness) {
            this.readiness = readiness;
            return this;
        }

        /**
         * <p>The Secret mount description.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;secretId&quot;:10,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
         */
        public Builder secretMountDesc(String secretMountDesc) {
            this.secretMountDesc = secretMountDesc;
            return this;
        }

        public SidecarContainerConfig build() {
            return new SidecarContainerConfig(this);
        } 

    } 

}
