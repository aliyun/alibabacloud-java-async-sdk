// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneExperimentGroupRequest} extends {@link RequestModel}
 *
 * <p>CloneExperimentGroupRequest</p>
 */
public class CloneExperimentGroupRequest extends Request {
    @Path
    @NameInMap("ExperimentGroupId")
    @Validation(required = true)
    private String experimentGroupId;

    @Body
    @NameInMap("Environment")
    @Validation(required = true)
    private String environment;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("LayerId")
    @Validation(required = true)
    private String layerId;

    private CloneExperimentGroupRequest(Builder builder) {
        super(builder);
        this.experimentGroupId = builder.experimentGroupId;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.layerId = builder.layerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneExperimentGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
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
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    public static final class Builder extends Request.Builder<CloneExperimentGroupRequest, Builder> {
        private String experimentGroupId; 
        private String environment; 
        private String instanceId; 
        private String layerId; 

        private Builder() {
            super();
        } 

        private Builder(CloneExperimentGroupRequest request) {
            super(request);
            this.experimentGroupId = request.experimentGroupId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.layerId = request.layerId;
        } 

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putPathParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
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
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.putBodyParameter("LayerId", layerId);
            this.layerId = layerId;
            return this;
        }

        @Override
        public CloneExperimentGroupRequest build() {
            return new CloneExperimentGroupRequest(this);
        } 

    } 

}
