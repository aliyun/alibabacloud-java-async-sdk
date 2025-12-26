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
 * {@link Snapshot} extends {@link TeaModel}
 *
 * <p>Snapshot</p>
 */
public class Snapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("CreationType")
    private String creationType;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.NameInMap("SnapshotResourceId")
    private String snapshotResourceId;

    @com.aliyun.core.annotation.NameInMap("SnapshotResourceType")
    private String snapshotResourceType;

    @com.aliyun.core.annotation.NameInMap("SnapshotStoragePath")
    private String snapshotStoragePath;

    @com.aliyun.core.annotation.NameInMap("SnapshotUrl")
    private String snapshotUrl;

    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Snapshot(Builder builder) {
        this.accessibility = builder.accessibility;
        this.creationType = builder.creationType;
        this.creator = builder.creator;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.snapshotId = builder.snapshotId;
        this.snapshotName = builder.snapshotName;
        this.snapshotResourceId = builder.snapshotResourceId;
        this.snapshotResourceType = builder.snapshotResourceType;
        this.snapshotStoragePath = builder.snapshotStoragePath;
        this.snapshotUrl = builder.snapshotUrl;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Snapshot create() {
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
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String snapshotId; 
        private String snapshotName; 
        private String snapshotResourceId; 
        private String snapshotResourceType; 
        private String snapshotStoragePath; 
        private String snapshotUrl; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Snapshot model) {
            this.accessibility = model.accessibility;
            this.creationType = model.creationType;
            this.creator = model.creator;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.snapshotId = model.snapshotId;
            this.snapshotName = model.snapshotName;
            this.snapshotResourceId = model.snapshotResourceId;
            this.snapshotResourceType = model.snapshotResourceType;
            this.snapshotStoragePath = model.snapshotStoragePath;
            this.snapshotUrl = model.snapshotUrl;
            this.workDir = model.workDir;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * CreationType.
         */
        public Builder creationType(String creationType) {
            this.creationType = creationType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
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
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * SnapshotName.
         */
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * SnapshotResourceId.
         */
        public Builder snapshotResourceId(String snapshotResourceId) {
            this.snapshotResourceId = snapshotResourceId;
            return this;
        }

        /**
         * SnapshotResourceType.
         */
        public Builder snapshotResourceType(String snapshotResourceType) {
            this.snapshotResourceType = snapshotResourceType;
            return this;
        }

        /**
         * SnapshotStoragePath.
         */
        public Builder snapshotStoragePath(String snapshotStoragePath) {
            this.snapshotStoragePath = snapshotStoragePath;
            return this;
        }

        /**
         * SnapshotUrl.
         */
        public Builder snapshotUrl(String snapshotUrl) {
            this.snapshotUrl = snapshotUrl;
            return this;
        }

        /**
         * WorkDir.
         */
        public Builder workDir(String workDir) {
            this.workDir = workDir;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Snapshot build() {
            return new Snapshot(this);
        } 

    } 

}
