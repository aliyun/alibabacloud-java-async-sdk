// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindEndpointRequest} extends {@link RequestModel}
 *
 * <p>UnbindEndpointRequest</p>
 */
public class UnbindEndpointRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Path
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Path
    @NameInMap("SlotId")
    @Validation(required = true)
    private String slotId;

    private UnbindEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endpointId = builder.endpointId;
        this.slotId = builder.slotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindEndpointRequest create() {
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

    /**
     * @return slotId
     */
    public String getSlotId() {
        return this.slotId;
    }

    public static final class Builder extends Request.Builder<UnbindEndpointRequest, Builder> {
        private String regionId; 
        private String endpointId; 
        private String slotId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endpointId = request.endpointId;
            this.slotId = request.slotId;
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

        /**
         * SlotId.
         */
        public Builder slotId(String slotId) {
            this.putPathParameter("SlotId", slotId);
            this.slotId = slotId;
            return this;
        }

        @Override
        public UnbindEndpointRequest build() {
            return new UnbindEndpointRequest(this);
        } 

    } 

}
