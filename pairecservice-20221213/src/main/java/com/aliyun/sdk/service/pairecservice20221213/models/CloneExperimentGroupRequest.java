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
 * {@link CloneExperimentGroupRequest} extends {@link RequestModel}
 *
 * <p>CloneExperimentGroupRequest</p>
 */
public class CloneExperimentGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentGroupId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerId;

    private CloneExperimentGroupRequest(Builder builder) {
        super(builder);
        this.experimentGroupId = builder.experimentGroupId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String environment; 
        private String instanceId; 
        private String layerId; 

        private Builder() {
            super();
        } 

        private Builder(CloneExperimentGroupRequest request) {
            super(request);
            this.experimentGroupId = request.experimentGroupId;
            this.regionId = request.regionId;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.layerId = request.layerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putPathParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-abcdefg1234</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
