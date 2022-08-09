// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebootInstanceRequest</p>
 */
public class RebootInstanceRequest extends Request {
    @Query
    @NameInMap("ForceStop")
    private String forceStop;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private RebootInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceStop
     */
    public String getForceStop() {
        return this.forceStop;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<RebootInstanceRequest, Builder> {
        private String forceStop; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RebootInstanceRequest request) {
            super(request);
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
        } 

        /**
         * ForceStop.
         */
        public Builder forceStop(String forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public RebootInstanceRequest build() {
            return new RebootInstanceRequest(this);
        } 

    } 

}
