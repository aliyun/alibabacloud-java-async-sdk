// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetStackDriftDetectionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetStackDriftDetectionStatusRequest</p>
 */
public class GetStackDriftDetectionStatusRequest extends Request {
    @Query
    @NameInMap("DriftDetectionId")
    private String driftDetectionId;

    @Query
    @NameInMap("RegionId")
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

    public static final class Builder extends Request.Builder {
        private String driftDetectionId; 
        private String regionId; 

        /**
         * <p>DriftDetectionId.</p>
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.putQueryParameter("DriftDetectionId", driftDetectionId);
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public GetStackDriftDetectionStatusRequest build() {
            return new GetStackDriftDetectionStatusRequest(this);
        } 

    } 

}
