// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDiskRequest} extends {@link RequestModel}
 *
 * <p>ResetDiskRequest</p>
 */
public class ResetDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    private ResetDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<ResetDiskRequest, Builder> {
        private String diskId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(ResetDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * The ID of the disk that you want to roll back.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the snapshot that you want to use to roll back the disk.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public ResetDiskRequest build() {
            return new ResetDiskRequest(this);
        } 

    } 

}
