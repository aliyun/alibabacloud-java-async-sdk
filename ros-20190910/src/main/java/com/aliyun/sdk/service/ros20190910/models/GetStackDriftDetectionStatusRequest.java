// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the drift detection operation.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/155098.html">ListStackResourceDrifts</a> operation to obtain the ID of the drift detection operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7044f0d-6f2e-4128-a307-4524ef88****</p>
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.putQueryParameter("DriftDetectionId", driftDetectionId);
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * <p>The region ID of the stack to be detected for drift.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
