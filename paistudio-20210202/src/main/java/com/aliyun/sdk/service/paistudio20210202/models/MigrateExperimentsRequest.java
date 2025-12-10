// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link MigrateExperimentsRequest} extends {@link RequestModel}
 *
 * <p>MigrateExperimentsRequest</p>
 */
public class MigrateExperimentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestFolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destFolderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOwner")
    private Boolean isOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceExpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceExpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateIfExists")
    private Boolean updateIfExists;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private MigrateExperimentsRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.destFolderId = builder.destFolderId;
        this.isOwner = builder.isOwner;
        this.sourceExpId = builder.sourceExpId;
        this.updateIfExists = builder.updateIfExists;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateExperimentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return destFolderId
     */
    public String getDestFolderId() {
        return this.destFolderId;
    }

    /**
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return this.isOwner;
    }

    /**
     * @return sourceExpId
     */
    public Long getSourceExpId() {
        return this.sourceExpId;
    }

    /**
     * @return updateIfExists
     */
    public Boolean getUpdateIfExists() {
        return this.updateIfExists;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<MigrateExperimentsRequest, Builder> {
        private String accessibility; 
        private String destFolderId; 
        private Boolean isOwner; 
        private Long sourceExpId; 
        private Boolean updateIfExists; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateExperimentsRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.destFolderId = request.destFolderId;
            this.isOwner = request.isOwner;
            this.sourceExpId = request.sourceExpId;
            this.updateIfExists = request.updateIfExists;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>folder-12321313</p>
         */
        public Builder destFolderId(String destFolderId) {
            this.putQueryParameter("DestFolderId", destFolderId);
            this.destFolderId = destFolderId;
            return this;
        }

        /**
         * IsOwner.
         */
        public Builder isOwner(Boolean isOwner) {
            this.putQueryParameter("IsOwner", isOwner);
            this.isOwner = isOwner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder sourceExpId(Long sourceExpId) {
            this.putQueryParameter("SourceExpId", sourceExpId);
            this.sourceExpId = sourceExpId;
            return this;
        }

        /**
         * UpdateIfExists.
         */
        public Builder updateIfExists(Boolean updateIfExists) {
            this.putQueryParameter("UpdateIfExists", updateIfExists);
            this.updateIfExists = updateIfExists;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public MigrateExperimentsRequest build() {
            return new MigrateExperimentsRequest(this);
        } 

    } 

}
