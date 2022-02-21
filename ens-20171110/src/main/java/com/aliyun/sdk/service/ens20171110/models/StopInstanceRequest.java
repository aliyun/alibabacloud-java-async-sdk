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

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private StopInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
        this.version = builder.version;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<StopInstanceRequest, Builder> {
        private String forceStop; 
        private String instanceId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(StopInstanceRequest response) {
            super(response);
            this.forceStop = response.forceStop;
            this.instanceId = response.instanceId;
            this.version = response.version;
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

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public StopInstanceRequest build() {
            return new StopInstanceRequest(this);
        } 

    } 

}
