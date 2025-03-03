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
 * {@link CreateFeatureConsistencyCheckJobRequest} extends {@link RequestModel}
 *
 * <p>CreateFeatureConsistencyCheckJobRequest</p>
 */
public class CreateFeatureConsistencyCheckJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SamplingDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer samplingDuration;

    private CreateFeatureConsistencyCheckJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.environment = builder.environment;
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.instanceId = builder.instanceId;
        this.samplingDuration = builder.samplingDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureConsistencyCheckJobRequest create() {
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
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return samplingDuration
     */
    public Integer getSamplingDuration() {
        return this.samplingDuration;
    }

    public static final class Builder extends Request.Builder<CreateFeatureConsistencyCheckJobRequest, Builder> {
        private String regionId; 
        private String environment; 
        private String featureConsistencyCheckJobConfigId; 
        private String instanceId; 
        private Integer samplingDuration; 

        private Builder() {
            super();
        } 

        private Builder(CreateFeatureConsistencyCheckJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.environment = request.environment;
            this.featureConsistencyCheckJobConfigId = request.featureConsistencyCheckJobConfigId;
            this.instanceId = request.instanceId;
            this.samplingDuration = request.samplingDuration;
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
         * <p>Pre</p>
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
         * <p>3</p>
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.putBodyParameter("FeatureConsistencyCheckJobConfigId", featureConsistencyCheckJobConfigId);
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-********</p>
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
         * <p>10</p>
         */
        public Builder samplingDuration(Integer samplingDuration) {
            this.putBodyParameter("SamplingDuration", samplingDuration);
            this.samplingDuration = samplingDuration;
            return this;
        }

        @Override
        public CreateFeatureConsistencyCheckJobRequest build() {
            return new CreateFeatureConsistencyCheckJobRequest(this);
        } 

    } 

}
