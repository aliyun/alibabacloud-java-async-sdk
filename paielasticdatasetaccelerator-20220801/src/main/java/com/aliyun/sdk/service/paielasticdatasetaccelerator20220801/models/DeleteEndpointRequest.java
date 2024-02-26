// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteEndpointRequest</p>
 */
public class DeleteEndpointRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    private DeleteEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointId = builder.endpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEndpointRequest create() {
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
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    public static final class Builder extends Request.Builder<DeleteEndpointRequest, Builder> {
        private String regionId; 
        private String endpointId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointId = request.endpointId;
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
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putPathParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        @Override
        public DeleteEndpointRequest build() {
            return new DeleteEndpointRequest(this);
        } 

    } 

}
