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
 * {@link ListFeatureViewOnlineFeaturesRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureViewOnlineFeaturesRequest</p>
 */
public class ListFeatureViewOnlineFeaturesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureViewId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JoinIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> joinIds;

    private ListFeatureViewOnlineFeaturesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.featureViewId = builder.featureViewId;
        this.config = builder.config;
        this.joinIds = builder.joinIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewOnlineFeaturesRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return joinIds
     */
    public java.util.List<String> getJoinIds() {
        return this.joinIds;
    }

    public static final class Builder extends Request.Builder<ListFeatureViewOnlineFeaturesRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String featureViewId; 
        private String config; 
        private java.util.List<String> joinIds; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureViewOnlineFeaturesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.featureViewId = request.featureViewId;
            this.config = request.config;
            this.joinIds = request.joinIds;
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
         * <p>1</p>
         */
        public Builder featureViewId(String featureViewId) {
            this.putPathParameter("FeatureViewId", featureViewId);
            this.featureViewId = featureViewId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder joinIds(java.util.List<String> joinIds) {
            String joinIdsShrink = shrink(joinIds, "JoinIds", "json");
            this.putQueryParameter("JoinIds", joinIdsShrink);
            this.joinIds = joinIds;
            return this;
        }

        @Override
        public ListFeatureViewOnlineFeaturesRequest build() {
            return new ListFeatureViewOnlineFeaturesRequest(this);
        } 

    } 

}
