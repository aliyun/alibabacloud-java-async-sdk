// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicAcceleratorRequest} extends {@link RequestModel}
 *
 * <p>DeleteBasicAcceleratorRequest</p>
 */
public class DeleteBasicAcceleratorRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteBasicAcceleratorRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicAcceleratorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteBasicAcceleratorRequest, Builder> {
        private String acceleratorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBasicAcceleratorRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.regionId = response.regionId;
        } 

        /**
         * 全球加速实例Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteBasicAcceleratorRequest build() {
            return new DeleteBasicAcceleratorRequest(this);
        } 

    } 

}
