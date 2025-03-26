// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateVccRequest} extends {@link RequestModel}
 *
 * <p>UpdateVccRequest</p>
 */
public class UpdateVccRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccName")
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
         * <p>The peak bandwidth of the Lingjun connection instance. Unit: Mbit/s. Valid values: 1000 to 400000</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The ID of the order placed on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>20006627643</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * <p>The name of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-heyuan-backup</p>
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
