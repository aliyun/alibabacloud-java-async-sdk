// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceSnapshotRequest</p>
 */
public class GetInstanceSnapshotRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    private GetInstanceSnapshotRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSnapshotRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceSnapshotRequest, Builder> {
        private String instanceId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceSnapshotRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * 实例Id
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 实例快照Id
         */
        public Builder snapshotId(String snapshotId) {
            this.putPathParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public GetInstanceSnapshotRequest build() {
            return new GetInstanceSnapshotRequest(this);
        } 

    } 

}
