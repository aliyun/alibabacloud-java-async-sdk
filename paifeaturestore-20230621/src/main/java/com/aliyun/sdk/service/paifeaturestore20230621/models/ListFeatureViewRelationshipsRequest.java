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
 * {@link ListFeatureViewRelationshipsRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureViewRelationshipsRequest</p>
 */
public class ListFeatureViewRelationshipsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureViewId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListFeatureViewRelationshipsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewRelationshipsRequest create() {
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
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListFeatureViewRelationshipsRequest, Builder> {
        private String instanceId; 
        private String featureViewId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureViewRelationshipsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
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
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
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
        public ListFeatureViewRelationshipsRequest build() {
            return new ListFeatureViewRelationshipsRequest(this);
        } 

    } 

}
