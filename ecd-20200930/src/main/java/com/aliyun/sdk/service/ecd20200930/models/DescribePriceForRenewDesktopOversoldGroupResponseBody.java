// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribePriceForRenewDesktopOversoldGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePriceForRenewDesktopOversoldGroupResponseBody</p>
 */
public class DescribePriceForRenewDesktopOversoldGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePriceForRenewDesktopOversoldGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceForRenewDesktopOversoldGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePriceForRenewDesktopOversoldGroupResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

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

        public DescribePriceForRenewDesktopOversoldGroupResponseBody build() {
            return new DescribePriceForRenewDesktopOversoldGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePriceForRenewDesktopOversoldGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePriceForRenewDesktopOversoldGroupResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.price = model.price;
            } 

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
