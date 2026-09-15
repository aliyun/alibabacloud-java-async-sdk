// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link InnerCreateSandboxInput} extends {@link TeaModel}
 *
 * <p>InnerCreateSandboxInput</p>
 */
public class InnerCreateSandboxInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowInternetAccess")
    private Boolean allowInternetAccess;

    @com.aliyun.core.annotation.NameInMap("autoPause")
    private Boolean autoPause;

    @com.aliyun.core.annotation.NameInMap("autoResume")
    private Boolean autoResume;

    @com.aliyun.core.annotation.NameInMap("envVars")
    private java.util.Map<String, String> envVars;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, String> metadata;

    @com.aliyun.core.annotation.NameInMap("network")
    private E2BNetwork network;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private InnerSandboxRuntimeConfig runtime;

    @com.aliyun.core.annotation.NameInMap("secure")
    private Boolean secure;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    @com.aliyun.core.annotation.NameInMap("timeout")
    private Integer timeout;

    @com.aliyun.core.annotation.NameInMap("volumeMounts")
    private InnerCreateSandboxVolumeMounts volumeMounts;

    private InnerCreateSandboxInput(Builder builder) {
        this.allowInternetAccess = builder.allowInternetAccess;
        this.autoPause = builder.autoPause;
        this.autoResume = builder.autoResume;
        this.envVars = builder.envVars;
        this.metadata = builder.metadata;
        this.network = builder.network;
        this.runtime = builder.runtime;
        this.secure = builder.secure;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
        this.timeout = builder.timeout;
        this.volumeMounts = builder.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InnerCreateSandboxInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowInternetAccess
     */
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    /**
     * @return autoPause
     */
    public Boolean getAutoPause() {
        return this.autoPause;
    }

    /**
     * @return autoResume
     */
    public Boolean getAutoResume() {
        return this.autoResume;
    }

    /**
     * @return envVars
     */
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * @return network
     */
    public E2BNetwork getNetwork() {
        return this.network;
    }

    /**
     * @return runtime
     */
    public InnerSandboxRuntimeConfig getRuntime() {
        return this.runtime;
    }

    /**
     * @return secure
     */
    public Boolean getSecure() {
        return this.secure;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return volumeMounts
     */
    public InnerCreateSandboxVolumeMounts getVolumeMounts() {
        return this.volumeMounts;
    }

    public static final class Builder {
        private Boolean allowInternetAccess; 
        private Boolean autoPause; 
        private Boolean autoResume; 
        private java.util.Map<String, String> envVars; 
        private java.util.Map<String, String> metadata; 
        private E2BNetwork network; 
        private InnerSandboxRuntimeConfig runtime; 
        private Boolean secure; 
        private String teamID; 
        private String templateID; 
        private Integer timeout; 
        private InnerCreateSandboxVolumeMounts volumeMounts; 

        private Builder() {
        } 

        private Builder(InnerCreateSandboxInput model) {
            this.allowInternetAccess = model.allowInternetAccess;
            this.autoPause = model.autoPause;
            this.autoResume = model.autoResume;
            this.envVars = model.envVars;
            this.metadata = model.metadata;
            this.network = model.network;
            this.runtime = model.runtime;
            this.secure = model.secure;
            this.teamID = model.teamID;
            this.templateID = model.templateID;
            this.timeout = model.timeout;
            this.volumeMounts = model.volumeMounts;
        } 

        /**
         * allowInternetAccess.
         */
        public Builder allowInternetAccess(Boolean allowInternetAccess) {
            this.allowInternetAccess = allowInternetAccess;
            return this;
        }

        /**
         * autoPause.
         */
        public Builder autoPause(Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }

        /**
         * autoResume.
         */
        public Builder autoResume(Boolean autoResume) {
            this.autoResume = autoResume;
            return this;
        }

        /**
         * envVars.
         */
        public Builder envVars(java.util.Map<String, String> envVars) {
            this.envVars = envVars;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * network.
         */
        public Builder network(E2BNetwork network) {
            this.network = network;
            return this;
        }

        /**
         * runtime.
         */
        public Builder runtime(InnerSandboxRuntimeConfig runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * secure.
         */
        public Builder secure(Boolean secure) {
            this.secure = secure;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * templateID.
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        /**
         * timeout.
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * volumeMounts.
         */
        public Builder volumeMounts(InnerCreateSandboxVolumeMounts volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public InnerCreateSandboxInput build() {
            return new InnerCreateSandboxInput(this);
        } 

    } 

}
