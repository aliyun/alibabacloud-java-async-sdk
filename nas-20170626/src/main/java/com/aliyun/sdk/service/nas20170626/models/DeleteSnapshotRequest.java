// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DeleteSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotRequest</p>
 */
public class DeleteSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    private DeleteSnapshotRequest(Builder builder) {
        super(builder);
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotRequest, Builder> {
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotRequest request) {
            super(request);
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>The snapshot ID. After you successfully create a snapshot for an Advanced Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createsnapshot">CreateSnapshot</a>, call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describesnapshots">DescribeSnapshots</a> (with FileSystemType set to extreme) to query the snapshot list and obtain the snapshot ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-extreme-snapsho****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public DeleteSnapshotRequest build() {
            return new DeleteSnapshotRequest(this);
        } 

    } 

}
