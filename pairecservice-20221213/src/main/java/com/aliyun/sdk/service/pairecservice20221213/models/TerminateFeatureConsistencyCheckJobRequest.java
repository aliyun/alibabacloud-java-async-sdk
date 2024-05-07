// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateFeatureConsistencyCheckJobRequest} extends {@link RequestModel}
 *
 * <p>TerminateFeatureConsistencyCheckJobRequest</p>
 */
public class TerminateFeatureConsistencyCheckJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private TerminateFeatureConsistencyCheckJobRequest(Builder builder) {
        super(builder);
        this.featureConsistencyCheckJobId = builder.featureConsistencyCheckJobId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateFeatureConsistencyCheckJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobId
     */
    public String getFeatureConsistencyCheckJobId() {
        return this.featureConsistencyCheckJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<TerminateFeatureConsistencyCheckJobRequest, Builder> {
        private String featureConsistencyCheckJobId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(TerminateFeatureConsistencyCheckJobRequest request) {
            super(request);
            this.featureConsistencyCheckJobId = request.featureConsistencyCheckJobId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * FeatureConsistencyCheckJobId.
         */
        public Builder featureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
            this.putPathParameter("FeatureConsistencyCheckJobId", featureConsistencyCheckJobId);
            this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public TerminateFeatureConsistencyCheckJobRequest build() {
            return new TerminateFeatureConsistencyCheckJobRequest(this);
        } 

    } 

}
