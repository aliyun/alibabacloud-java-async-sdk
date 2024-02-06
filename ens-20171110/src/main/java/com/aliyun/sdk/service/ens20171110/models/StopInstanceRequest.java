// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopInstanceRequest</p>
 */
public class StopInstanceRequest extends Request {
    @Query
    @NameInMap("ForceStop")
    private String forceStop;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private StopInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<StopInstanceRequest, Builder> {
        private String forceStop; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StopInstanceRequest request) {
            super(request);
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
        } 

        /**
         * Specifies whether to forcibly stop the servers.
         * <p>
         * 
         * *   **true**: forcibly stops the instance.
         * *   **false**: normally stops the servers. This is the default value.
         */
        public Builder forceStop(String forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * The ID of the instance that you want to stop. You can specify only one instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StopInstanceRequest build() {
            return new StopInstanceRequest(this);
        } 

    } 

}
