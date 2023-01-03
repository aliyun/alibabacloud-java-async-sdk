// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVccRequest} extends {@link RequestModel}
 *
 * <p>UpdateVccRequest</p>
 */
public class UpdateVccRequest extends Request {
    @Body
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Body
    @NameInMap("OrderId")
    private String orderId;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("VccId")
    private String vccId;

    @Body
    @NameInMap("VccName")
    private String vccName;

    private UpdateVccRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.vccId = builder.vccId;
        this.vccName = builder.vccName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVccRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vccName
     */
    public String getVccName() {
        return this.vccName;
    }

    public static final class Builder extends Request.Builder<UpdateVccRequest, Builder> {
        private Integer bandwidth; 
        private String orderId; 
        private String regionId; 
        private String vccId; 
        private String vccName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVccRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.orderId = request.orderId;
            this.regionId = request.regionId;
            this.vccId = request.vccId;
            this.vccName = request.vccName;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VccId.
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * VccName.
         */
        public Builder vccName(String vccName) {
            this.putBodyParameter("VccName", vccName);
            this.vccName = vccName;
            return this;
        }

        @Override
        public UpdateVccRequest build() {
            return new UpdateVccRequest(this);
        } 

    } 

}
