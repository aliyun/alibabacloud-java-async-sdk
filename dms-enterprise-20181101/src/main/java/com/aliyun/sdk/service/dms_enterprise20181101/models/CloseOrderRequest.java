// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseOrderRequest} extends {@link RequestModel}
 *
 * <p>CloseOrderRequest</p>
 */
public class CloseOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CloseReason")
    @Validation(required = true)
    private String closeReason;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private CloseOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.closeReason = builder.closeReason;
        this.orderId = builder.orderId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseOrderRequest create() {
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
     * @return closeReason
     */
    public String getCloseReason() {
        return this.closeReason;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CloseOrderRequest, Builder> {
        private String regionId; 
        private String closeReason; 
        private Long orderId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CloseOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.closeReason = request.closeReason;
            this.orderId = request.orderId;
            this.tid = request.tid;
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
         * CloseReason.
         */
        public Builder closeReason(String closeReason) {
            this.putQueryParameter("CloseReason", closeReason);
            this.closeReason = closeReason;
            return this;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CloseOrderRequest build() {
            return new CloseOrderRequest(this);
        } 

    } 

}
