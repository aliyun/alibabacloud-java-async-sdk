// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneFeatureConsistencyCheckJobConfigRequest} extends {@link RequestModel}
 *
 * <p>CloneFeatureConsistencyCheckJobConfigRequest</p>
 */
public class CloneFeatureConsistencyCheckJobConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SourceFeatureConsistencyCheckJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceFeatureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CloneFeatureConsistencyCheckJobConfigRequest(Builder builder) {
        super(builder);
        this.sourceFeatureConsistencyCheckJobConfigId = builder.sourceFeatureConsistencyCheckJobConfigId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneFeatureConsistencyCheckJobConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceFeatureConsistencyCheckJobConfigId
     */
    public String getSourceFeatureConsistencyCheckJobConfigId() {
        return this.sourceFeatureConsistencyCheckJobConfigId;
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

    public static final class Builder extends Request.Builder<CloneFeatureConsistencyCheckJobConfigRequest, Builder> {
        private String sourceFeatureConsistencyCheckJobConfigId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CloneFeatureConsistencyCheckJobConfigRequest request) {
            super(request);
            this.sourceFeatureConsistencyCheckJobConfigId = request.sourceFeatureConsistencyCheckJobConfigId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * SourceFeatureConsistencyCheckJobConfigId.
         */
        public Builder sourceFeatureConsistencyCheckJobConfigId(String sourceFeatureConsistencyCheckJobConfigId) {
            this.putPathParameter("SourceFeatureConsistencyCheckJobConfigId", sourceFeatureConsistencyCheckJobConfigId);
            this.sourceFeatureConsistencyCheckJobConfigId = sourceFeatureConsistencyCheckJobConfigId;
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
        public CloneFeatureConsistencyCheckJobConfigRequest build() {
            return new CloneFeatureConsistencyCheckJobConfigRequest(this);
        } 

    } 

}
