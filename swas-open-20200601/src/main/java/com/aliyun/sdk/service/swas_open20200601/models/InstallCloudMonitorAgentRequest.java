// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCloudMonitorAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallCloudMonitorAgentRequest</p>
 */
public class InstallCloudMonitorAgentRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private InstallCloudMonitorAgentRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallCloudMonitorAgentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InstallCloudMonitorAgentRequest, Builder> {
        private String clientToken; 
        private Boolean force; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InstallCloudMonitorAgentRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InstallCloudMonitorAgentRequest build() {
            return new InstallCloudMonitorAgentRequest(this);
        } 

    } 

}
