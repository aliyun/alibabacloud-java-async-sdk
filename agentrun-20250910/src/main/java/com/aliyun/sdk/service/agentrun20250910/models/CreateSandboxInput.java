// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateSandboxInput} extends {@link TeaModel}
 *
 * <p>CreateSandboxInput</p>
 */
public class CreateSandboxInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nasConfig")
    private NASConfig nasConfig;

    @com.aliyun.core.annotation.NameInMap("ossMountConfig")
    private OSSMountConfig ossMountConfig;

    @com.aliyun.core.annotation.NameInMap("sandboxId")
    private String sandboxId;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTimeoutInSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 21600)
    private Integer sandboxIdleTimeoutInSeconds;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTimeoutSeconds")
    @Deprecated
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 1)
    private Integer sandboxIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private CreateSandboxInput(Builder builder) {
        this.nasConfig = builder.nasConfig;
        this.ossMountConfig = builder.ossMountConfig;
        this.sandboxId = builder.sandboxId;
        this.sandboxIdleTimeoutInSeconds = builder.sandboxIdleTimeoutInSeconds;
        this.sandboxIdleTimeoutSeconds = builder.sandboxIdleTimeoutSeconds;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSandboxInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nasConfig
     */
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    /**
     * @return ossMountConfig
     */
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
    }

    /**
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
    }

    /**
     * @return sandboxIdleTimeoutInSeconds
     */
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    /**
     * @return sandboxIdleTimeoutSeconds
     */
    public Integer getSandboxIdleTimeoutSeconds() {
        return this.sandboxIdleTimeoutSeconds;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder {
        private NASConfig nasConfig; 
        private OSSMountConfig ossMountConfig; 
        private String sandboxId; 
        private Integer sandboxIdleTimeoutInSeconds; 
        private Integer sandboxIdleTimeoutSeconds; 
        private String templateName; 

        private Builder() {
        } 

        private Builder(CreateSandboxInput model) {
            this.nasConfig = model.nasConfig;
            this.ossMountConfig = model.ossMountConfig;
            this.sandboxId = model.sandboxId;
            this.sandboxIdleTimeoutInSeconds = model.sandboxIdleTimeoutInSeconds;
            this.sandboxIdleTimeoutSeconds = model.sandboxIdleTimeoutSeconds;
            this.templateName = model.templateName;
        } 

        /**
         * nasConfig.
         */
        public Builder nasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }

        /**
         * ossMountConfig.
         */
        public Builder ossMountConfig(OSSMountConfig ossMountConfig) {
            this.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * sandboxId.
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }

        /**
         * sandboxIdleTimeoutInSeconds.
         */
        public Builder sandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
            this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
            return this;
        }

        /**
         * <p>沙箱空闲超时时间（秒）</p>
         */
        public Builder sandboxIdleTimeoutSeconds(Integer sandboxIdleTimeoutSeconds) {
            this.sandboxIdleTimeoutSeconds = sandboxIdleTimeoutSeconds;
            return this;
        }

        /**
         * <p>模板名称（系统内部通过 templateName 查询 template_id）</p>
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public CreateSandboxInput build() {
            return new CreateSandboxInput(this);
        } 

    } 

}
