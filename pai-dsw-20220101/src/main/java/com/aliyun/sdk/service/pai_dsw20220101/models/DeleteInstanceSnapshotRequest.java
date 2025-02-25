// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link DeleteInstanceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceSnapshotRequest</p>
 */
public class DeleteInstanceSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    private DeleteInstanceSnapshotRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceSnapshotRequest, Builder> {
        private String instanceId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceSnapshotRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>snp-05cexxxxxxxxx</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putPathParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public DeleteInstanceSnapshotRequest build() {
            return new DeleteInstanceSnapshotRequest(this);
        } 

    } 

}
