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
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    private String sandboxId;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 1)
    private Integer sandboxIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private CreateSandboxInput(Builder builder) {
        this.sandboxId = builder.sandboxId;
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
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
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
        private String sandboxId; 
        private Integer sandboxIdleTimeoutSeconds; 
        private String templateName; 

        private Builder() {
        } 

        private Builder(CreateSandboxInput model) {
            this.sandboxId = model.sandboxId;
            this.sandboxIdleTimeoutSeconds = model.sandboxIdleTimeoutSeconds;
            this.templateName = model.templateName;
        } 

        /**
         * sandboxId.
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
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
