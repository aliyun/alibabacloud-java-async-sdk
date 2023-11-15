// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionRequest} extends {@link RequestModel}
 *
 * <p>GetRegionRequest</p>
 */
public class GetRegionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    private GetRegionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inputRegionId = builder.inputRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionRequest create() {
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
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public static final class Builder extends Request.Builder<GetRegionRequest, Builder> {
        private String regionId; 
        private String inputRegionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRegionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inputRegionId = request.inputRegionId;
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
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        @Override
        public GetRegionRequest build() {
            return new GetRegionRequest(this);
        } 

    } 

}
