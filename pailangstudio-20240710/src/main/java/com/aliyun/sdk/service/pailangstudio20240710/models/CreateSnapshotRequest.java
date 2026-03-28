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
         * <p>Workspace visibility. Valid values:</p>
         * <ul>
         * <li>PRIVATE: Visible only to you and administrators in this workspace.</li>
         * <li>PUBLIC: Visible to everyone in this workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Snapshot creation type. Valid values:</p>
         * <ul>
         * <li>ManualCreated: manual creation</li>
         * <li>DeploymentAutoCreated: automatic creation by service deployment</li>
         * <li>EvaluationAutoCreated: automatic creation by evaluation job</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManualCreated</p>
         */
        public Builder creationType(String creationType) {
            this.putBodyParameter("CreationType", creationType);
            this.creationType = creationType;
            return this;
        }

        /**
         * <p>Description of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Snapshot name. Requirements:</p>
         * <ul>
         * <li>Can contain only letters, digits, and underscores (_)</li>
         * <li>Must start with a letter</li>
         * <li>Length must be 1 to 256 characters</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>snapshot01</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.putBodyParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * <p>Snapshot resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-asfg******123</p>
         */
        public Builder snapshotResourceId(String snapshotResourceId) {
            this.putBodyParameter("SnapshotResourceId", snapshotResourceId);
            this.snapshotResourceId = snapshotResourceId;
            return this;
        }

        /**
         * <p>Snapshot resource type. Valid values:</p>
         * <ul>
         * <li>Flow: pipeline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Flow</p>
         */
        public Builder snapshotResourceType(String snapshotResourceType) {
            this.putBodyParameter("SnapshotResourceType", snapshotResourceType);
            this.snapshotResourceType = snapshotResourceType;
            return this;
        }

        /**
         * <p>Create a snapshot from source files under the specified OSS folder.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-hangzhou.aliyuncs.com/path/to/snapshot/source</p>
         */
        public Builder sourceStoragePath(String sourceStoragePath) {
            this.putBodyParameter("SourceStoragePath", sourceStoragePath);
            this.sourceStoragePath = sourceStoragePath;
            return this;
        }

        /**
         * <p>OSS working directory for storing the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-hangzhou.aliyuncs.com/workdir</p>
         */
        public Builder workDir(String workDir) {
            this.putBodyParameter("WorkDir", workDir);
            this.workDir = workDir;
            return this;
        }

        /**
         * <p>Workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>174***</p>
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
