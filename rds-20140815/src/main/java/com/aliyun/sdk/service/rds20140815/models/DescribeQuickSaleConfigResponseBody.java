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
         * Product code.
         */
        public Builder commodity(String commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * Return data.
         */
        public Builder items(java.util.Map < String, ? > items) {
            this.items = items;
            return this;
        }

        /**
         * Id of the request
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
