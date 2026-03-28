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
 * {@link GetSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotResponseBody</p>
 */
public class GetSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("CreationType")
    private String creationType;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.NameInMap("SnapshotResourceId")
    private String snapshotResourceId;

    @com.aliyun.core.annotation.NameInMap("SnapshotResourceType")
    private String snapshotResourceType;

    @com.aliyun.core.annotation.NameInMap("SnapshotStatus")
    private String snapshotStatus;

    @com.aliyun.core.annotation.NameInMap("SnapshotStoragePath")
    private String snapshotStoragePath;

    @com.aliyun.core.annotation.NameInMap("SnapshotUrl")
    private String snapshotUrl;

    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetSnapshotResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.creationType = builder.creationType;
        this.creator = builder.creator;
        this.description = builder.description;
        this.errorMessage = builder.errorMessage;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.requestId = builder.requestId;
        this.snapshotId = builder.snapshotId;
        this.snapshotName = builder.snapshotName;
        this.snapshotResourceId = builder.snapshotResourceId;
        this.snapshotResourceType = builder.snapshotResourceType;
        this.snapshotStatus = builder.snapshotStatus;
        this.snapshotStoragePath = builder.snapshotStoragePath;
        this.snapshotUrl = builder.snapshotUrl;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotResponseBody create() {
        return builder().build();
    }

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
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
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
     * @return snapshotStatus
     */
    public String getSnapshotStatus() {
        return this.snapshotStatus;
    }

    /**
     * @return snapshotStoragePath
     */
    public String getSnapshotStoragePath() {
        return this.snapshotStoragePath;
    }

    /**
     * @return snapshotUrl
     */
    public String getSnapshotUrl() {
        return this.snapshotUrl;
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

    public static final class Builder {
        private String accessibility; 
        private String creationType; 
        private String creator; 
        private String description; 
        private String errorMessage; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String requestId; 
        private String snapshotId; 
        private String snapshotName; 
        private String snapshotResourceId; 
        private String snapshotResourceType; 
        private String snapshotStatus; 
        private String snapshotStoragePath; 
        private String snapshotUrl; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetSnapshotResponseBody model) {
            this.accessibility = model.accessibility;
            this.creationType = model.creationType;
            this.creator = model.creator;
            this.description = model.description;
            this.errorMessage = model.errorMessage;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.requestId = model.requestId;
            this.snapshotId = model.snapshotId;
            this.snapshotName = model.snapshotName;
            this.snapshotResourceId = model.snapshotResourceId;
            this.snapshotResourceType = model.snapshotResourceType;
            this.snapshotStatus = model.snapshotStatus;
            this.snapshotStoragePath = model.snapshotStoragePath;
            this.snapshotUrl = model.snapshotUrl;
            this.workDir = model.workDir;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>Workspace visibility. Possible values are:</p>
         * <ul>
         * <li>PRIVATE: In this workspace, visible only to you and administrators.</li>
         * <li>PUBLIC: In this workspace, visible to everyone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Snapshot creation type. Valid values:</p>
         * <ul>
         * <li>ManualCreated: Manually created</li>
         * <li>DeploymentAutoCreated: Automatically created by service deployment</li>
         * <li>EvaluationAutoCreated: Automatically created by evaluation job</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManualCreated</p>
         */
        public Builder creationType(String creationType) {
            this.creationType = creationType;
            return this;
        }

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2680******4103</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>Snapshot description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-24T07:33:53Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Updated At.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-24T08:58:35Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>snap-asfg******123</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>Snapshot name.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot01</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * <p>Snapshot resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-asfg******1234</p>
         */
        public Builder snapshotResourceId(String snapshotResourceId) {
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
            this.snapshotResourceType = snapshotResourceType;
            return this;
        }

        /**
         * SnapshotStatus.
         */
        public Builder snapshotStatus(String snapshotStatus) {
            this.snapshotStatus = snapshotStatus;
            return this;
        }

        /**
         * <p>OSS path where the snapshot source file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-hangzhou.aliyuncs.com/workdir/snapshot/snap-1234/src</p>
         */
        public Builder snapshotStoragePath(String snapshotStoragePath) {
            this.snapshotStoragePath = snapshotStoragePath;
            return this;
        }

        /**
         * <p>Snapshot download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://path/to/snapshot/zipfile">https://path/to/snapshot/zipfile</a></p>
         */
        public Builder snapshotUrl(String snapshotUrl) {
            this.snapshotUrl = snapshotUrl;
            return this;
        }

        /**
         * <p>The OSS working directory where the snapshot is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-hangzhou-internal.aliyuncs.com/workdir/</p>
         */
        public Builder workDir(String workDir) {
            this.workDir = workDir;
            return this;
        }

        /**
         * <p>Workspace ID. For information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>478**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetSnapshotResponseBody build() {
            return new GetSnapshotResponseBody(this);
        } 

    } 

}
