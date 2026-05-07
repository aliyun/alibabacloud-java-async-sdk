// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CreateJobTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJobTemplateResponseBody</p>
 */
public class CreateJobTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultVersion")
    private Integer defaultVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateJobTemplateResponseBody(Builder builder) {
        this.defaultVersion = builder.defaultVersion;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
        this.version = builder.version;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultVersion
     */
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private Integer defaultVersion; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifyTime; 
        private java.util.Map<String, ?> metadata; 
        private String requestId; 
        private String templateId; 
        private String templateName; 
        private String tenantId; 
        private String userId; 
        private Integer version; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(CreateJobTemplateResponseBody model) {
            this.defaultVersion = model.defaultVersion;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
            this.version = model.version;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * DefaultVersion.
         */
        public Builder defaultVersion(Integer defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-31T02:18:09Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-12T14:36:00Z</p>
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>本次请求的 ID，用于诊断和答疑。</p>
         * 
         * <strong>example:</strong>
         * <p>8762921A-911C-515F-A3A4-*********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>此次调用创建的模板 ID。</p>
         * 
         * <strong>example:</strong>
         * <p>tplmceolmf2****</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateJobTemplateResponseBody build() {
            return new CreateJobTemplateResponseBody(this);
        } 

    } 

}
