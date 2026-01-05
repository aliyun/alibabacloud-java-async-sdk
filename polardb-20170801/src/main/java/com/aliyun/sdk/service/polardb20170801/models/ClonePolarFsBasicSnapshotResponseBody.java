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
 * {@link ClonePolarFsBasicSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>ClonePolarFsBasicSnapshotResponseBody</p>
 */
public class ClonePolarFsBasicSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourcePath")
    private String sourcePath;

    @com.aliyun.core.annotation.NameInMap("TargetPath")
    private String targetPath;

    private ClonePolarFsBasicSnapshotResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.requestId = builder.requestId;
        this.sourcePath = builder.sourcePath;
        this.targetPath = builder.targetPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClonePolarFsBasicSnapshotResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String DBClusterId; 
        private String polarFsInstanceId; 
        private String requestId; 
        private String sourcePath; 
        private String targetPath; 

        private Builder() {
        } 

        private Builder(ClonePolarFsBasicSnapshotResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.requestId = model.requestId;
            this.sourcePath = model.sourcePath;
            this.targetPath = model.targetPath;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourcePath.
         */
        public Builder sourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * TargetPath.
         */
        public Builder targetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }

        public ClonePolarFsBasicSnapshotResponseBody build() {
            return new ClonePolarFsBasicSnapshotResponseBody(this);
        } 

    } 

}
