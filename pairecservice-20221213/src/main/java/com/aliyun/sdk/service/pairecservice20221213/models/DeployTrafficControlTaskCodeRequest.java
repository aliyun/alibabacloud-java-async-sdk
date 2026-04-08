// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link DeployTrafficControlTaskCodeRequest} extends {@link RequestModel}
 *
 * <p>DeployTrafficControlTaskCodeRequest</p>
 */
public class DeployTrafficControlTaskCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetryDeploy")
    private Boolean retryDeploy;

    private DeployTrafficControlTaskCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.retryDeploy = builder.retryDeploy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployTrafficControlTaskCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return retryDeploy
     */
    public Boolean getRetryDeploy() {
        return this.retryDeploy;
    }

    public static final class Builder extends Request.Builder<DeployTrafficControlTaskCodeRequest, Builder> {
        private String regionId; 
        private String trafficControlTaskId; 
        private String environment; 
        private String instanceId; 
        private Boolean retryDeploy; 

        private Builder() {
            super();
        } 

        private Builder(DeployTrafficControlTaskCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.trafficControlTaskId = request.trafficControlTaskId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.retryDeploy = request.retryDeploy;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TrafficControlTaskId.
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.putPathParameter("TrafficControlTaskId", trafficControlTaskId);
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RetryDeploy.
         */
        public Builder retryDeploy(Boolean retryDeploy) {
            this.putBodyParameter("RetryDeploy", retryDeploy);
            this.retryDeploy = retryDeploy;
            return this;
        }

        @Override
        public DeployTrafficControlTaskCodeRequest build() {
            return new DeployTrafficControlTaskCodeRequest(this);
        } 

    } 

}
