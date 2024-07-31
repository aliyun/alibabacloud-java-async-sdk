// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCloudMonitorAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallCloudMonitorAgentRequest</p>
 */
public class InstallCloudMonitorAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to forcibly install the CloudMonitor agent. Valid values:
         * <p>
         * 
         * *   true (default value): forcibly installs the CloudMonitor agent.
         * *   false: does not forcibly install the CloudMonitor agent.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
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
