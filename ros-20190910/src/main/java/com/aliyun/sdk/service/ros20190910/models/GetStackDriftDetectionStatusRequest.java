// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackDriftDetectionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetStackDriftDetectionStatusRequest</p>
 */
public class GetStackDriftDetectionStatusRequest extends Request {
    @Query
    @NameInMap("DriftDetectionId")
    @Validation(required = true)
    private String driftDetectionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetStackDriftDetectionStatusRequest(Builder builder) {
        super(builder);
        this.driftDetectionId = builder.driftDetectionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackDriftDetectionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driftDetectionId
     */
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetStackDriftDetectionStatusRequest, Builder> {
        private String driftDetectionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackDriftDetectionStatusRequest request) {
            super(request);
            this.driftDetectionId = request.driftDetectionId;
            this.regionId = request.regionId;
        } 

        /**
         * DriftDetectionId.
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.putQueryParameter("DriftDetectionId", driftDetectionId);
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetStackDriftDetectionStatusRequest build() {
            return new GetStackDriftDetectionStatusRequest(this);
        } 

    } 

}
