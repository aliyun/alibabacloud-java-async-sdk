// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQuickSaleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuickSaleConfigResponseBody</p>
 */
public class DescribeQuickSaleConfigResponseBody extends TeaModel {
    @NameInMap("Commodity")
    private String commodity;

    @NameInMap("Items")
    private java.util.Map < String, ? > items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeQuickSaleConfigResponseBody(Builder builder) {
        this.commodity = builder.commodity;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuickSaleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return commodity
     */
    public String getCommodity() {
        return this.commodity;
    }

    /**
     * @return items
     */
    public java.util.Map < String, ? > getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commodity; 
        private java.util.Map < String, ? > items; 
        private String requestId; 

        /**
         * The product code. Valid values:
         * <p>
         * 
         * *   rds: The instance is a subscription instance.
         * *   bards: The instance is a pay-as-you-go instance.
         */
        public Builder commodity(String commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * The configuration details of the product.
         */
        public Builder items(java.util.Map < String, ? > items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeQuickSaleConfigResponseBody build() {
            return new DescribeQuickSaleConfigResponseBody(this);
        } 

    } 

}
