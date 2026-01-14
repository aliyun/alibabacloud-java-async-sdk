// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link CreateBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBandwidthPackageResponseBody</p>
 */
public class CreateBandwidthPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateBandwidthPackageResponseBody model) {
            this.bandwidthPackageId = model.bandwidthPackageId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * <p>If bills are not automatically paid, you must go to the Order Center to complete the payments.</p>
         * <p>This parameter is returned only if ChargeType is set to PREPAY. If AutoPay is set to false, you must go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Order Center</a> to complete the payment.</p>
         * 
         * <strong>example:</strong>
         * <p>208257****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4B6DBBB0-2D01-4C6A-A384-4129266E6B78</p>
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
