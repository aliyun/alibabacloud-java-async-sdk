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
 * {@link CreateTemplateRuntimeConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateRuntimeConfig</p>
 */
public class CreateTemplateRuntimeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("internetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private CreateTemplateLogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("sandboxConfig")
    private CreateTemplateSandboxConfig sandboxConfig;

    @com.aliyun.core.annotation.NameInMap("vpcBindings")
    private java.util.List<String> vpcBindings;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private CreateTemplateVPCConfig vpcConfig;

    private CreateTemplateRuntimeConfig(Builder builder) {
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

    public static CreateTemplateRuntimeConfig create() {
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
    public CreateTemplateLogConfig getLogConfig() {
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
    public CreateTemplateSandboxConfig getSandboxConfig() {
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
    public CreateTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private Float cpu; 
        private Integer diskSize; 
        private Boolean internetAccess; 
        private CreateTemplateLogConfig logConfig; 
        private Integer memorySize; 
        private CreateTemplateSandboxConfig sandboxConfig; 
        private java.util.List<String> vpcBindings; 
        private CreateTemplateVPCConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(CreateTemplateRuntimeConfig model) {
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
         * <p>The CPU specifications of the sandbox instance, in cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The disk specifications of the sandbox instance, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Specifies whether the sandbox instance is allowed to access the Internet.</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>The log delivery configuration of the sandbox instance.</p>
         */
        public Builder logConfig(CreateTemplateLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The memory specifications of the sandbox instance, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * <p>The image and startup configuration of the sandbox instance.</p>
         */
        public Builder sandboxConfig(CreateTemplateSandboxConfig sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }

        /**
         * <p>A non-empty array configures the set of source VPCs that are allowed to access the sandbox data endpoint. Omitting the field, setting it to null, or providing an empty array indicates that no inbound bindings are configured. This configuration is independent of the egress network vpcConfig and does not modify the API key source policy. A null value is treated as omitted to maintain compatibility with SDK requests where the field is not set. You can update or clear the list by calling UpdateTemplate. The changes take effect after a new version is successfully built, and existing sandboxes continue to use the original configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
         */
        public Builder vpcBindings(java.util.List<String> vpcBindings) {
            this.vpcBindings = vpcBindings;
            return this;
        }

        /**
         * <p>The VPC configuration of the sandbox instance.</p>
         */
        public Builder vpcConfig(CreateTemplateVPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public CreateTemplateRuntimeConfig build() {
            return new CreateTemplateRuntimeConfig(this);
        } 

    } 

}
