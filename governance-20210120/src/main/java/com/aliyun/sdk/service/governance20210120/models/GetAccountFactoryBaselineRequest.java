// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountFactoryBaselineRequest} extends {@link RequestModel}
 *
 * <p>GetAccountFactoryBaselineRequest</p>
 */
public class GetAccountFactoryBaselineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetAccountFactoryBaselineRequest(Builder builder) {
        super(builder);
        this.baselineId = builder.baselineId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountFactoryBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAccountFactoryBaselineRequest, Builder> {
        private String baselineId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountFactoryBaselineRequest request) {
            super(request);
            this.baselineId = request.baselineId;
            this.regionId = request.regionId;
        } 

        /**
         * The baseline ID.
         */
        public Builder baselineId(String baselineId) {
            this.putQueryParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetAccountFactoryBaselineRequest build() {
            return new GetAccountFactoryBaselineRequest(this);
        } 

    } 

}
