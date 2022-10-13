// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeOnBaselineRequest} extends {@link RequestModel}
 *
 * <p>GetNodeOnBaselineRequest</p>
 */
public class GetNodeOnBaselineRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BaselineId")
    @Validation(required = true)
    private Long baselineId;

    private GetNodeOnBaselineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineId = builder.baselineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeOnBaselineRequest create() {
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
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    public static final class Builder extends Request.Builder<GetNodeOnBaselineRequest, Builder> {
        private String regionId; 
        private Long baselineId; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeOnBaselineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineId = request.baselineId;
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
         * BaselineId.
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        @Override
        public GetNodeOnBaselineRequest build() {
            return new GetNodeOnBaselineRequest(this);
        } 

    } 

}
