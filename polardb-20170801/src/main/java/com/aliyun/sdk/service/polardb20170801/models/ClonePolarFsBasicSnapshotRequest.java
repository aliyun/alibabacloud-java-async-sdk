// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ClonePolarFsBasicSnapshotRequest} extends {@link RequestModel}
 *
 * <p>ClonePolarFsBasicSnapshotRequest</p>
 */
public class ClonePolarFsBasicSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePath")
    private String sourcePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPath")
    private String targetPath;

    private ClonePolarFsBasicSnapshotRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.sourcePath = builder.sourcePath;
        this.targetPath = builder.targetPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClonePolarFsBasicSnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return sourcePath
     */
    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * @return targetPath
     */
    public String getTargetPath() {
        return this.targetPath;
    }

    public static final class Builder extends Request.Builder<ClonePolarFsBasicSnapshotRequest, Builder> {
        private String DBClusterId; 
        private String polarFsInstanceId; 
        private String sourcePath; 
        private String targetPath; 

        private Builder() {
            super();
        } 

        private Builder(ClonePolarFsBasicSnapshotRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.polarFsInstanceId = request.polarFsInstanceId;
            this.sourcePath = request.sourcePath;
            this.targetPath = request.targetPath;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * SourcePath.
         */
        public Builder sourcePath(String sourcePath) {
            this.putQueryParameter("SourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * TargetPath.
         */
        public Builder targetPath(String targetPath) {
            this.putQueryParameter("TargetPath", targetPath);
            this.targetPath = targetPath;
            return this;
        }

        @Override
        public ClonePolarFsBasicSnapshotRequest build() {
            return new ClonePolarFsBasicSnapshotRequest(this);
        } 

    } 

}
