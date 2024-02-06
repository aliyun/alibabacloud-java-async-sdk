// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePrePaidInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleasePrePaidInstanceRequest</p>
 */
public class ReleasePrePaidInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ReleasePrePaidInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePrePaidInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<ReleasePrePaidInstanceRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePrePaidInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the instance to be deleted. You can specify only one instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ReleasePrePaidInstanceRequest build() {
            return new ReleasePrePaidInstanceRequest(this);
        } 

    } 

}
