// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceForModifyDesktopOversoldGroupSaleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceForModifyDesktopOversoldGroupSaleResponseBody</p>
 */
public class DescribePriceForModifyDesktopOversoldGroupSaleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePriceForModifyDesktopOversoldGroupSaleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceForModifyDesktopOversoldGroupSaleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePriceForModifyDesktopOversoldGroupSaleResponseBody build() {
            return new DescribePriceForModifyDesktopOversoldGroupSaleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Price")
        private String price;

        private Data(Builder builder) {
            this.price = builder.price;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        public static final class Builder {
            private String price; 

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
