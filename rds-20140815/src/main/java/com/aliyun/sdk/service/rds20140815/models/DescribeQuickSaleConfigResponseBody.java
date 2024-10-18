// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeQuickSaleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuickSaleConfigResponseBody</p>
 */
public class DescribeQuickSaleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private String commodity;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.Map < String, ? > items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The product code. Valid values:</p>
         * <ul>
         * <li>rds: The instance is a subscription instance.</li>
         * <li>bards: The instance is a pay-as-you-go instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder commodity(String commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>The configuration details of the product.</p>
         */
        public Builder items(java.util.Map < String, ? > items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5DFFE9EC-3369-5937-A4E2-507C0C86A4C6</p>
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
