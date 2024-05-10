// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackDriftDetectionStatusRequest} extends {@link RequestModel}
 *
 * <p>GetStackDriftDetectionStatusRequest</p>
 */
public class GetStackDriftDetectionStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriftDetectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driftDetectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the drift detection operation.
         * <p>
         * 
         * You can call the [ListStackResourceDrifts](~~155098~~) operation to obtain the ID of the drift detection operation.
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.putQueryParameter("DriftDetectionId", driftDetectionId);
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * The region ID of the stack to be detected for drift.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
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
