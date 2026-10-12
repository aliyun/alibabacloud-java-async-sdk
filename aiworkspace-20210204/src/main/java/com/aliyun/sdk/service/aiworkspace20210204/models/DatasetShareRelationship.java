// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DatasetShareRelationship} extends {@link TeaModel}
 *
 * <p>DatasetShareRelationship</p>
 */
public class DatasetShareRelationship extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowedMountAccessLevels")
    private java.util.List<String> allowedMountAccessLevels;

    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private String expiresAt;

    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("IsSecureMode")
    private Boolean isSecureMode;

    @com.aliyun.core.annotation.NameInMap("SharedAt")
    private String sharedAt;

    @com.aliyun.core.annotation.NameInMap("SourceTenantId")
    private String sourceTenantId;

    @com.aliyun.core.annotation.NameInMap("SourceWorkspaceId")
    private String sourceWorkspaceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DatasetShareRelationship(Builder builder) {
        this.allowedMountAccessLevels = builder.allowedMountAccessLevels;
        this.expiresAt = builder.expiresAt;
        this.extra = builder.extra;
        this.isSecureMode = builder.isSecureMode;
        this.sharedAt = builder.sharedAt;
        this.sourceTenantId = builder.sourceTenantId;
        this.sourceWorkspaceId = builder.sourceWorkspaceId;
        this.status = builder.status;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetShareRelationship create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedMountAccessLevels
     */
    public java.util.List<String> getAllowedMountAccessLevels() {
        return this.allowedMountAccessLevels;
    }

    /**
     * @return expiresAt
     */
    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return isSecureMode
     */
    public Boolean getIsSecureMode() {
        return this.isSecureMode;
    }

    /**
     * @return sharedAt
     */
    public String getSharedAt() {
        return this.sharedAt;
    }

    /**
     * @return sourceTenantId
     */
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    /**
     * @return sourceWorkspaceId
     */
    public String getSourceWorkspaceId() {
        return this.sourceWorkspaceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private java.util.List<String> allowedMountAccessLevels; 
        private String expiresAt; 
        private String extra; 
        private Boolean isSecureMode; 
        private String sharedAt; 
        private String sourceTenantId; 
        private String sourceWorkspaceId; 
        private String status; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(DatasetShareRelationship model) {
            this.allowedMountAccessLevels = model.allowedMountAccessLevels;
            this.expiresAt = model.expiresAt;
            this.extra = model.extra;
            this.isSecureMode = model.isSecureMode;
            this.sharedAt = model.sharedAt;
            this.sourceTenantId = model.sourceTenantId;
            this.sourceWorkspaceId = model.sourceWorkspaceId;
            this.status = model.status;
            this.tenantId = model.tenantId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The allowed permissions for the shared dataset. When a user accesses the shared dataset, their permissions are limited to this list. The default value is \<code>[&quot;RO&quot;]\\</code>.</p>
         * <ul>
         * <li><p>RO: Read-only permission. The recipient can only read the dataset.</p>
         * </li>
         * <li><p>RW: Read and write permission. The recipient can read and modify the dataset.</p>
         * </li>
         * </ul>
         */
        public Builder allowedMountAccessLevels(java.util.List<String> allowedMountAccessLevels) {
            this.allowedMountAccessLevels = allowedMountAccessLevels;
            return this;
        }

        /**
         * <p>The expiration time. The time is in ISO 8601 format.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the sharing relationship never expires.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T12:23:58Z</p>
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>Additional configurations for the sharing relationship. This parameter is a JSON string.</p>
         * <ul>
         * <li><p>AllowExportModel: Specifies whether to allow the export of trained models.</p>
         * </li>
         * <li><p>AllowAccessDLCWebTerminal: Specifies whether to allow users to log on to the container in a DLC task.</p>
         * </li>
         * <li><p>AllowAccessDLCFullLog: Specifies whether to allow access to the full task logs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AllowExportModel&quot;:false,&quot;AllowAccessDLCWebTerminal&quot;:false,&quot;AllowAccessDLCFullLog&quot;:false}</p>
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        /**
         * <p>Specifies whether to enable security protection for the shared dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSecureMode(Boolean isSecureMode) {
            this.isSecureMode = isSecureMode;
            return this;
        }

        /**
         * <p>The time when the dataset was shared. The time is in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-27T12:23:58Z</p>
         */
        public Builder sharedAt(String sharedAt) {
            this.sharedAt = sharedAt;
            return this;
        }

        /**
         * <p>The ID of the tenant that owns the source dataset. The user who shares the dataset must be a workspace administrator or the root account.</p>
         * 
         * <strong>example:</strong>
         * <p>148***************115</p>
         */
        public Builder sourceTenantId(String sourceTenantId) {
            this.sourceTenantId = sourceTenantId;
            return this;
        }

        /**
         * <p>The ID of the workspace that contains the source dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>33**19</p>
         */
        public Builder sourceWorkspaceId(String sourceWorkspaceId) {
            this.sourceWorkspaceId = sourceWorkspaceId;
            return this;
        }

        /**
         * <p>The status of the sharing relationship.</p>
         * <ul>
         * <li><p>ACTIVE: The sharing relationship is active. Complete dataset information is displayed only in this state.</p>
         * </li>
         * <li><p>EXPIRED: The sharing relationship has expired.</p>
         * </li>
         * <li><p>REVOKED: The sharing relationship was revoked by the sharer.</p>
         * </li>
         * <li><p>INVALID: The sharing relationship is invalid. This can happen if the source dataset is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the target tenant. This must be a root account ID.</p>
         * <blockquote>
         * <p>This parameter is required when you set a sharing relationship.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>153***************249</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the target workspace. This ID must be different from the source workspace ID.</p>
         * <blockquote>
         * <p>This parameter is required when you set a sharing relationship.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>42**2</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DatasetShareRelationship build() {
            return new DatasetShareRelationship(this);
        } 

    } 

}
