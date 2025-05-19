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
 * {@link QuerySampleConsistencyJobDifferenceRequest} extends {@link RequestModel}
 *
 * <p>QuerySampleConsistencyJobDifferenceRequest</p>
 */
public class QuerySampleConsistencyJobDifferenceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SampleConsistencyJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleConsistencyJobId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    private String featureName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private String featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private QuerySampleConsistencyJobDifferenceRequest(Builder builder) {
        super(builder);
        this.sampleConsistencyJobId = builder.sampleConsistencyJobId;
        this.regionId = builder.regionId;
        this.featureName = builder.featureName;
        this.featureType = builder.featureType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySampleConsistencyJobDifferenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sampleConsistencyJobId
     */
    public String getSampleConsistencyJobId() {
        return this.sampleConsistencyJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * @return featureType
     */
    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<QuerySampleConsistencyJobDifferenceRequest, Builder> {
        private String sampleConsistencyJobId; 
        private String regionId; 
        private String featureName; 
        private String featureType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySampleConsistencyJobDifferenceRequest request) {
            super(request);
            this.sampleConsistencyJobId = request.sampleConsistencyJobId;
            this.regionId = request.regionId;
            this.featureName = request.featureName;
            this.featureType = request.featureType;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sampleConsistencyJobId(String sampleConsistencyJobId) {
            this.putPathParameter("SampleConsistencyJobId", sampleConsistencyJobId);
            this.sampleConsistencyJobId = sampleConsistencyJobId;
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
         * FeatureName.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        /**
         * FeatureType.
         */
        public Builder featureType(String featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public QuerySampleConsistencyJobDifferenceRequest build() {
            return new QuerySampleConsistencyJobDifferenceRequest(this);
        } 

    } 

}
