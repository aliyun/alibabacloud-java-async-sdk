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
 * {@link Sandbox} extends {@link TeaModel}
 *
 * <p>Sandbox</p>
 */
public class Sandbox extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("endedAt")
    private String endedAt;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("sandboxArn")
    private String sandboxArn;

    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTTLInSeconds")
    private Integer sandboxIdleTTLInSeconds;

    @com.aliyun.core.annotation.NameInMap("sandboxIdleTimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 1)
    private Integer sandboxIdleTimeoutSeconds;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    private Sandbox(Builder builder) {
        this.createdAt = builder.createdAt;
        this.endedAt = builder.endedAt;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.metadata = builder.metadata;
        this.sandboxArn = builder.sandboxArn;
        this.sandboxId = builder.sandboxId;
        this.sandboxIdleTTLInSeconds = builder.sandboxIdleTTLInSeconds;
        this.sandboxIdleTimeoutSeconds = builder.sandboxIdleTimeoutSeconds;
        this.status = builder.status;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Sandbox create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return endedAt
     */
    public String getEndedAt() {
        return this.endedAt;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return sandboxArn
     */
    public String getSandboxArn() {
        return this.sandboxArn;
    }

    /**
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
    }

    /**
     * @return sandboxIdleTTLInSeconds
     */
    public Integer getSandboxIdleTTLInSeconds() {
        return this.sandboxIdleTTLInSeconds;
    }

    /**
     * @return sandboxIdleTimeoutSeconds
     */
    public Integer getSandboxIdleTimeoutSeconds() {
        return this.sandboxIdleTimeoutSeconds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder {
        private String createdAt; 
        private String endedAt; 
        private String lastUpdatedAt; 
        private java.util.Map<String, ?> metadata; 
        private String sandboxArn; 
        private String sandboxId; 
        private Integer sandboxIdleTTLInSeconds; 
        private Integer sandboxIdleTimeoutSeconds; 
        private String status; 
        private String templateId; 
        private String templateName; 

        private Builder() {
        } 

        private Builder(Sandbox model) {
            this.createdAt = model.createdAt;
            this.endedAt = model.endedAt;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.metadata = model.metadata;
            this.sandboxArn = model.sandboxArn;
            this.sandboxId = model.sandboxId;
            this.sandboxIdleTTLInSeconds = model.sandboxIdleTTLInSeconds;
            this.sandboxIdleTimeoutSeconds = model.sandboxIdleTimeoutSeconds;
            this.status = model.status;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
        } 

        /**
         * <p>沙箱创建时间</p>
         * <p>This parameter is required.</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * endedAt.
         */
        public Builder endedAt(String endedAt) {
            this.endedAt = endedAt;
            return this;
        }

        /**
         * <p>最后更新时间</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * sandboxArn.
         */
        public Builder sandboxArn(String sandboxArn) {
            this.sandboxArn = sandboxArn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }

        /**
         * sandboxIdleTTLInSeconds.
         */
        public Builder sandboxIdleTTLInSeconds(Integer sandboxIdleTTLInSeconds) {
            this.sandboxIdleTTLInSeconds = sandboxIdleTTLInSeconds;
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
         * <p>This parameter is required.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public Sandbox build() {
            return new Sandbox(this);
        } 

    } 

}
