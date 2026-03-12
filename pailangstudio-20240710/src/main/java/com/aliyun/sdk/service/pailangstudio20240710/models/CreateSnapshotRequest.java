// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link CreateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotRequest</p>
 */
public class CreateSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreationType")
    private String creationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotResourceId")
    private String snapshotResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotResourceType")
    private String snapshotResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceStoragePath")
    private String sourceStoragePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.creationType = builder.creationType;
        this.description = builder.description;
        this.snapshotName = builder.snapshotName;
        this.snapshotResourceId = builder.snapshotResourceId;
        this.snapshotResourceType = builder.snapshotResourceType;
        this.sourceStoragePath = builder.sourceStoragePath;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotRequest create() {
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
     * @return creationType
     */
    public String getCreationType() {
        return this.creationType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return snapshotResourceId
     */
    public String getSnapshotResourceId() {
        return this.snapshotResourceId;
    }

    /**
     * @return snapshotResourceType
     */
    public String getSnapshotResourceType() {
        return this.snapshotResourceType;
    }

    /**
     * @return sourceStoragePath
     */
    public String getSourceStoragePath() {
        return this.sourceStoragePath;
    }

    /**
     * @return workDir
     */
    public String getWorkDir() {
        return this.workDir;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String accessibility; 
        private String creationType; 
        private String description; 
        private String snapshotName; 
        private String snapshotResourceId; 
        private String snapshotResourceType; 
        private String sourceStoragePath; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.creationType = request.creationType;
            this.description = request.description;
            this.snapshotName = request.snapshotName;
            this.snapshotResourceId = request.snapshotResourceId;
            this.snapshotResourceType = request.snapshotResourceType;
            this.sourceStoragePath = request.sourceStoragePath;
            this.workDir = request.workDir;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * CreationType.
         */
        public Builder creationType(String creationType) {
            this.putBodyParameter("CreationType", creationType);
            this.creationType = creationType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * SnapshotName.
         */
        public Builder snapshotName(String snapshotName) {
            this.putBodyParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * SnapshotResourceId.
         */
        public Builder snapshotResourceId(String snapshotResourceId) {
            this.putBodyParameter("SnapshotResourceId", snapshotResourceId);
            this.snapshotResourceId = snapshotResourceId;
            return this;
        }

        /**
         * SnapshotResourceType.
         */
        public Builder snapshotResourceType(String snapshotResourceType) {
            this.putBodyParameter("SnapshotResourceType", snapshotResourceType);
            this.snapshotResourceType = snapshotResourceType;
            return this;
        }

        /**
         * SourceStoragePath.
         */
        public Builder sourceStoragePath(String sourceStoragePath) {
            this.putBodyParameter("SourceStoragePath", sourceStoragePath);
            this.sourceStoragePath = sourceStoragePath;
            return this;
        }

        /**
         * WorkDir.
         */
        public Builder workDir(String workDir) {
            this.putBodyParameter("WorkDir", workDir);
            this.workDir = workDir;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

}
