// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScaleStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteScaleStrategyRequest</p>
 */
public class DeleteScaleStrategyRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScaleStrategyId")
    @Validation(required = true)
    private String scaleStrategyId;

    private DeleteScaleStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.scaleStrategyId = builder.scaleStrategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScaleStrategyRequest create() {
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
     * @return scaleStrategyId
     */
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public static final class Builder extends Request.Builder<DeleteScaleStrategyRequest, Builder> {
        private String regionId; 
        private String scaleStrategyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScaleStrategyRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.scaleStrategyId = response.scaleStrategyId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScaleStrategyId.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        @Override
        public DeleteScaleStrategyRequest build() {
            return new DeleteScaleStrategyRequest(this);
        } 

    } 

}
