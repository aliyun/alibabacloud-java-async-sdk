// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFabricChaincodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteFabricChaincodeRequest</p>
 */
public class DeleteFabricChaincodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChaincodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chaincodeId;

    private DeleteFabricChaincodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeId = builder.chaincodeId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public static final class Builder extends Request.Builder<DeleteFabricChaincodeRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFabricChaincodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeId = request.chaincodeId;
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
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.putBodyParameter("ChaincodeId", chaincodeId);
            this.chaincodeId = chaincodeId;
            return this;
        }

        @Override
        public DeleteFabricChaincodeRequest build() {
            return new DeleteFabricChaincodeRequest(this);
        } 

    } 

}
