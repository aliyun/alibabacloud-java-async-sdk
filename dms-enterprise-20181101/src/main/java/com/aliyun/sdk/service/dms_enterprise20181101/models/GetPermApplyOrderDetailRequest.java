// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermApplyOrderDetailRequest} extends {@link RequestModel}
 *
 * <p>GetPermApplyOrderDetailRequest</p>
 */
public class GetPermApplyOrderDetailRequest extends Request {
    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetPermApplyOrderDetailRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermApplyOrderDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetPermApplyOrderDetailRequest, Builder> {
        private Long orderId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetPermApplyOrderDetailRequest response) {
            super(response);
            this.orderId = response.orderId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
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

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetPermApplyOrderDetailRequest build() {
            return new GetPermApplyOrderDetailRequest(this);
        } 

    } 

}
