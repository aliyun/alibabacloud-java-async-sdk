// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotReposByInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotReposByInstanceIdRequest</p>
 */
public class ListSnapshotReposByInstanceIdRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ListSnapshotReposByInstanceIdRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotReposByInstanceIdRequest create() {
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

    public static final class Builder extends Request.Builder<ListSnapshotReposByInstanceIdRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotReposByInstanceIdRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListSnapshotReposByInstanceIdRequest build() {
            return new ListSnapshotReposByInstanceIdRequest(this);
        } 

    } 

}
