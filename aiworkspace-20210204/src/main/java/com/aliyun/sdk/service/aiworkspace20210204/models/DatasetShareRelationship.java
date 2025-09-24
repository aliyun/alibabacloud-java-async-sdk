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
            this.isSecureMode = model.isSecureMode;
            this.sharedAt = model.sharedAt;
            this.sourceTenantId = model.sourceTenantId;
            this.sourceWorkspaceId = model.sourceWorkspaceId;
            this.status = model.status;
            this.tenantId = model.tenantId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * AllowedMountAccessLevels.
         */
        public Builder allowedMountAccessLevels(java.util.List<String> allowedMountAccessLevels) {
            this.allowedMountAccessLevels = allowedMountAccessLevels;
            return this;
        }

        /**
         * ExpiresAt.
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * IsSecureMode.
         */
        public Builder isSecureMode(Boolean isSecureMode) {
            this.isSecureMode = isSecureMode;
            return this;
        }

        /**
         * SharedAt.
         */
        public Builder sharedAt(String sharedAt) {
            this.sharedAt = sharedAt;
            return this;
        }

        /**
         * SourceTenantId.
         */
        public Builder sourceTenantId(String sourceTenantId) {
            this.sourceTenantId = sourceTenantId;
            return this;
        }

        /**
         * SourceWorkspaceId.
         */
        public Builder sourceWorkspaceId(String sourceWorkspaceId) {
            this.sourceWorkspaceId = sourceWorkspaceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * WorkspaceId.
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
