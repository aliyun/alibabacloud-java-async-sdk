// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushAllExperimentVersionRequest} extends {@link RequestModel}
 *
 * <p>PushAllExperimentVersionRequest</p>
 */
public class PushAllExperimentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentVersionId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureName;

    private PushAllExperimentVersionRequest(Builder builder) {
        super(builder);
        this.experimentVersionId = builder.experimentVersionId;
        this.regionId = builder.regionId;
        this.featureName = builder.featureName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushAllExperimentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentVersionId
     */
    public String getExperimentVersionId() {
        return this.experimentVersionId;
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

    public static final class Builder extends Request.Builder<PushAllExperimentVersionRequest, Builder> {
        private String experimentVersionId; 
        private String regionId; 
        private String featureName; 

        private Builder() {
            super();
        } 

        private Builder(PushAllExperimentVersionRequest request) {
            super(request);
            this.experimentVersionId = request.experimentVersionId;
            this.regionId = request.regionId;
            this.featureName = request.featureName;
        } 

        /**
         * ExperimentVersionId.
         */
        public Builder experimentVersionId(String experimentVersionId) {
            this.putPathParameter("ExperimentVersionId", experimentVersionId);
            this.experimentVersionId = experimentVersionId;
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
            this.putBodyParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
        }

        @Override
        public PushAllExperimentVersionRequest build() {
            return new PushAllExperimentVersionRequest(this);
        } 

    } 

}
