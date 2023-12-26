// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetFileSystemRequest} extends {@link RequestModel}
 *
 * <p>ResetFileSystemRequest</p>
 */
public class ResetFileSystemRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    private ResetFileSystemRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetFileSystemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<ResetFileSystemRequest, Builder> {
        private String fileSystemId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(ResetFileSystemRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * The ID of the advanced Extreme NAS file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The snapshot ID.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public ResetFileSystemRequest build() {
            return new ResetFileSystemRequest(this);
        } 

    } 

}
