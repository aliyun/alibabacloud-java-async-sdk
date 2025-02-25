// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentRequest</p>
 */
public class GetExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetExperimentRequest, Builder> {
        private String experimentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.regionId = request.regionId;
        } 

        /**
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
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
        public GetExperimentRequest build() {
            return new GetExperimentRequest(this);
        } 

    } 

}
