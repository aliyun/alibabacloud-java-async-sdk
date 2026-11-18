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
 * {@link PublicUpdateTemplateRuntimeConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateRuntimeConfig</p>
 */
public class PublicUpdateTemplateRuntimeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("internetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private PublicUpdateTemplateLogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("sandboxConfig")
    private PublicUpdateTemplateSandboxConfig sandboxConfig;

    @com.aliyun.core.annotation.NameInMap("vpcBindings")
    private java.util.List<String> vpcBindings;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private PublicUpdateTemplateVPCConfig vpcConfig;

    private PublicUpdateTemplateRuntimeConfig(Builder builder) {
        this.cpu = builder.cpu;
        this.diskSize = builder.diskSize;
        this.internetAccess = builder.internetAccess;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.sandboxConfig = builder.sandboxConfig;
        this.vpcBindings = builder.vpcBindings;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateRuntimeConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return internetAccess
     */
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    /**
     * @return logConfig
     */
    public PublicUpdateTemplateLogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return sandboxConfig
     */
    public PublicUpdateTemplateSandboxConfig getSandboxConfig() {
        return this.sandboxConfig;
    }

    /**
     * @return vpcBindings
     */
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

    /**
     * @return vpcConfig
     */
    public PublicUpdateTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private Float cpu; 
        private Integer diskSize; 
        private Boolean internetAccess; 
        private PublicUpdateTemplateLogConfig logConfig; 
        private Integer memorySize; 
        private PublicUpdateTemplateSandboxConfig sandboxConfig; 
        private java.util.List<String> vpcBindings; 
        private PublicUpdateTemplateVPCConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateRuntimeConfig model) {
            this.cpu = model.cpu;
            this.diskSize = model.diskSize;
            this.internetAccess = model.internetAccess;
            this.logConfig = model.logConfig;
            this.memorySize = model.memorySize;
            this.sandboxConfig = model.sandboxConfig;
            this.vpcBindings = model.vpcBindings;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * <p>The number of vCPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The system cloud disk size in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Specifies whether the sandbox is allowed to access the Internet.</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>The log configuration.</p>
         */
        public Builder logConfig(PublicUpdateTemplateLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The memory size in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * <p>The sandbox configuration.</p>
         */
        public Builder sandboxConfig(PublicUpdateTemplateSandboxConfig sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }

        /**
         * <p>If omitted or set to null, the original list is retained. A non-empty array replaces the entire allowed set. An explicit empty array [] clears the inbound VPC restrictions for the new version. This field is independent of vpcConfig. An empty request body {}, an empty runtimeConfig, or a runtimeConfig that contains only vpcBindings: null returns a 400 error and does not clear the bindings. The actual JSON received by the server prevails. An empty array omitted by the SDK cannot clear the list.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
         */
        public Builder vpcBindings(java.util.List<String> vpcBindings) {
            this.vpcBindings = vpcBindings;
            return this;
        }

        /**
         * <p>The VPC network configuration.</p>
         */
        public Builder vpcConfig(PublicUpdateTemplateVPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public PublicUpdateTemplateRuntimeConfig build() {
            return new PublicUpdateTemplateRuntimeConfig(this);
        } 

    } 

}
