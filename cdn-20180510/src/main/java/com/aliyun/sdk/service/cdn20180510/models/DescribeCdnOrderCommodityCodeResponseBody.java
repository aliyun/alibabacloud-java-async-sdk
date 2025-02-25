// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnOrderCommodityCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnOrderCommodityCodeResponseBody</p>
 */
public class DescribeCdnOrderCommodityCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderCommodityCode")
    private String orderCommodityCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The commodity code that includes the organization unit.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder orderCommodityCode(String orderCommodityCode) {
            this.orderCommodityCode = orderCommodityCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BFFCDFAD-DACC-484E-9BE6-0AF3B3A0DD23</p>
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
