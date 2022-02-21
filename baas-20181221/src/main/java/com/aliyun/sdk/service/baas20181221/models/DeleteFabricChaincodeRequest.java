// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFabricChaincodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteFabricChaincodeRequest</p>
 */
public class DeleteFabricChaincodeRequest extends Request {
    @Body
    @NameInMap("ChaincodeId")
    @Validation(required = true)
    private String chaincodeId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteFabricChaincodeRequest(Builder builder) {
        super(builder);
        this.chaincodeId = builder.chaincodeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFabricChaincodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteFabricChaincodeRequest, Builder> {
        private String chaincodeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFabricChaincodeRequest response) {
            super(response);
            this.chaincodeId = response.chaincodeId;
            this.regionId = response.regionId;
        } 

        /**
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.putBodyParameter("ChaincodeId", chaincodeId);
            this.chaincodeId = chaincodeId;
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
        public DeleteFabricChaincodeRequest build() {
            return new DeleteFabricChaincodeRequest(this);
        } 

    } 

}
