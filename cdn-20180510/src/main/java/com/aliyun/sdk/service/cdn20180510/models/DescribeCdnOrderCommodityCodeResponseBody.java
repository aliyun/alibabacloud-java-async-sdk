// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnOrderCommodityCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnOrderCommodityCodeResponseBody</p>
 */
public class DescribeCdnOrderCommodityCodeResponseBody extends TeaModel {
    @NameInMap("OrderCommodityCode")
    private String orderCommodityCode;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnOrderCommodityCodeResponseBody(Builder builder) {
        this.orderCommodityCode = builder.orderCommodityCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnOrderCommodityCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderCommodityCode
     */
    public String getOrderCommodityCode() {
        return this.orderCommodityCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderCommodityCode; 
        private String requestId; 

        /**
         * The commodity code that includes the organization unit.
         */
        public Builder orderCommodityCode(String orderCommodityCode) {
            this.orderCommodityCode = orderCommodityCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnOrderCommodityCodeResponseBody build() {
            return new DescribeCdnOrderCommodityCodeResponseBody(this);
        } 

    } 

}
