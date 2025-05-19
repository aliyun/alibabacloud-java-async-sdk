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
 * {@link GetFeatureConsistencyCheckJobConfigRequest} extends {@link RequestModel}
 *
 * <p>GetFeatureConsistencyCheckJobConfigRequest</p>
 */
public class GetFeatureConsistencyCheckJobConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetFeatureConsistencyCheckJobConfigRequest(Builder builder) {
        super(builder);
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeatureConsistencyCheckJobConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
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

    public static final class Builder extends Request.Builder<GetFeatureConsistencyCheckJobConfigRequest, Builder> {
        private String featureConsistencyCheckJobConfigId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetFeatureConsistencyCheckJobConfigRequest request) {
            super(request);
            this.featureConsistencyCheckJobConfigId = request.featureConsistencyCheckJobConfigId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.putPathParameter("FeatureConsistencyCheckJobConfigId", featureConsistencyCheckJobConfigId);
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
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
         * <p>pairec-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetFeatureConsistencyCheckJobConfigRequest build() {
            return new GetFeatureConsistencyCheckJobConfigRequest(this);
        } 

    } 

}
