// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link PublicTemplateRuntimeConfig} extends {@link TeaModel}
 *
 * <p>PublicTemplateRuntimeConfig</p>
 */
public class PublicTemplateRuntimeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("diskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.NameInMap("internetAccess")
    private Boolean internetAccess;

    @com.aliyun.core.annotation.NameInMap("logConfig")
    private PublicTemplateLogConfig logConfig;

    @com.aliyun.core.annotation.NameInMap("memorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.NameInMap("sandboxConfig")
    private PublicTemplateSandboxConfig sandboxConfig;

    @com.aliyun.core.annotation.NameInMap("vpcConfig")
    private PublicTemplateVPCConfig vpcConfig;

    private PublicTemplateRuntimeConfig(Builder builder) {
        this.cpu = builder.cpu;
        this.diskSize = builder.diskSize;
        this.internetAccess = builder.internetAccess;
        this.logConfig = builder.logConfig;
        this.memorySize = builder.memorySize;
        this.sandboxConfig = builder.sandboxConfig;
        this.vpcConfig = builder.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateRuntimeConfig create() {
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
    public PublicTemplateLogConfig getLogConfig() {
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
    public PublicTemplateSandboxConfig getSandboxConfig() {
        return this.sandboxConfig;
    }

    /**
     * @return vpcConfig
     */
    public PublicTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static final class Builder {
        private Float cpu; 
        private Integer diskSize; 
        private Boolean internetAccess; 
        private PublicTemplateLogConfig logConfig; 
        private Integer memorySize; 
        private PublicTemplateSandboxConfig sandboxConfig; 
        private PublicTemplateVPCConfig vpcConfig; 

        private Builder() {
        } 

        private Builder(PublicTemplateRuntimeConfig model) {
            this.cpu = model.cpu;
            this.diskSize = model.diskSize;
            this.internetAccess = model.internetAccess;
            this.logConfig = model.logConfig;
            this.memorySize = model.memorySize;
            this.sandboxConfig = model.sandboxConfig;
            this.vpcConfig = model.vpcConfig;
        } 

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The disk size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Specifies whether to allow access to the Internet.</p>
         */
        public Builder internetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }

        /**
         * <p>The log configuration.</p>
         */
        public Builder logConfig(PublicTemplateLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        /**
         * <p>The memory size. Unit: MB.</p>
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
        public Builder sandboxConfig(PublicTemplateSandboxConfig sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }

        /**
         * <p>The VPC configuration.</p>
         */
        public Builder vpcConfig(PublicTemplateVPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public PublicTemplateRuntimeConfig build() {
            return new PublicTemplateRuntimeConfig(this);
        } 

    } 

}
