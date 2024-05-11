// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentVersionRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentVersionRequest</p>
 */
public class GetExperimentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentVersionId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetExperimentVersionRequest(Builder builder) {
        super(builder);
        this.experimentVersionId = builder.experimentVersionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetExperimentVersionRequest, Builder> {
        private String experimentVersionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentVersionRequest request) {
            super(request);
            this.experimentVersionId = request.experimentVersionId;
            this.regionId = request.regionId;
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

        @Override
        public GetExperimentVersionRequest build() {
            return new GetExperimentVersionRequest(this);
        } 

    } 

}
