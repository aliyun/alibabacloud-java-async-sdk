// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link DeleteFeatureEntityRequest} extends {@link RequestModel}
 *
 * <p>DeleteFeatureEntityRequest</p>
 */
public class DeleteFeatureEntityRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureEntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureEntityId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteFeatureEntityRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureEntityId = builder.featureEntityId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFeatureEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return featureEntityId
     */
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteFeatureEntityRequest, Builder> {
        private String instanceId; 
        private String featureEntityId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFeatureEntityRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureEntityId = request.featureEntityId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder featureEntityId(String featureEntityId) {
            this.putPathParameter("FeatureEntityId", featureEntityId);
            this.featureEntityId = featureEntityId;
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

        @Override
        public DeleteFeatureEntityRequest build() {
            return new DeleteFeatureEntityRequest(this);
        } 

    } 

}
