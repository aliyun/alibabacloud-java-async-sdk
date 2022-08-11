// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaselineConfigRequest} extends {@link RequestModel}
 *
 * <p>GetBaselineConfigRequest</p>
 */
public class GetBaselineConfigRequest extends Request {
    @Body
    @NameInMap("BaselineId")
    @Validation(required = true)
    private Long baselineId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetBaselineConfigRequest(Builder builder) {
        super(builder);
        this.baselineId = builder.baselineId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetBaselineConfigRequest, Builder> {
        private Long baselineId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetBaselineConfigRequest request) {
            super(request);
            this.baselineId = request.baselineId;
            this.regionId = request.regionId;
        } 

        /**
         * BaselineId.
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
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
        public GetBaselineConfigRequest build() {
            return new GetBaselineConfigRequest(this);
        } 

    } 

}
