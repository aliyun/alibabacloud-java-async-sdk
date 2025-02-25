// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureConsistencyCheckJobScoreReportsRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureConsistencyCheckJobScoreReportsRequest</p>
 */
public class ListFeatureConsistencyCheckJobScoreReportsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeRequestIds")
    private java.util.List < String > excludeRequestIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private ListFeatureConsistencyCheckJobScoreReportsRequest(Builder builder) {
        super(builder);
        this.featureConsistencyCheckJobId = builder.featureConsistencyCheckJobId;
        this.regionId = builder.regionId;
        this.excludeRequestIds = builder.excludeRequestIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureConsistencyCheckJobScoreReportsRequest create() {
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
     * @return excludeRequestIds
     */
    public java.util.List < String > getExcludeRequestIds() {
        return this.excludeRequestIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListFeatureConsistencyCheckJobScoreReportsRequest, Builder> {
        private String featureConsistencyCheckJobId; 
        private String regionId; 
        private java.util.List < String > excludeRequestIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureConsistencyCheckJobScoreReportsRequest request) {
            super(request);
            this.featureConsistencyCheckJobId = request.featureConsistencyCheckJobId;
            this.regionId = request.regionId;
            this.excludeRequestIds = request.excludeRequestIds;
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
         * ExcludeRequestIds.
         */
        public Builder excludeRequestIds(java.util.List < String > excludeRequestIds) {
            String excludeRequestIdsShrink = shrink(excludeRequestIds, "ExcludeRequestIds", "json");
            this.putQueryParameter("ExcludeRequestIds", excludeRequestIdsShrink);
            this.excludeRequestIds = excludeRequestIds;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListFeatureConsistencyCheckJobScoreReportsRequest build() {
            return new ListFeatureConsistencyCheckJobScoreReportsRequest(this);
        } 

    } 

}
