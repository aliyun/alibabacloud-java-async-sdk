// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBandwidthPackageResponseBody</p>
 */
public class CreateBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBandwidthPackageResponseBody(Builder builder) {
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBandwidthPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bandwidthPackageId; 
        private String orderId; 
        private String requestId; 

        /**
         * The ID of the bandwidth plan.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The order ID.
         * <p>
         * 
         * If bills are not automatically paid, you must go to the Order Center to complete the payments.
         * 
         * This parameter is returned only if ChargeType is set to PREPAY. If AutoPay is set to false, you must go to the [Order Center](https://usercenter2-intl.aliyun.com/order/list) to complete the payment.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBandwidthPackageResponseBody build() {
            return new CreateBandwidthPackageResponseBody(this);
        } 

    } 

}
