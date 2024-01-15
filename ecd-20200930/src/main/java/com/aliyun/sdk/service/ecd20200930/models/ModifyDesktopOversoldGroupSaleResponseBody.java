// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopOversoldGroupSaleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopOversoldGroupSaleResponseBody</p>
 */
public class ModifyDesktopOversoldGroupSaleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopOversoldGroupSaleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopOversoldGroupSaleResponseBody create() {
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

        public ModifyDesktopOversoldGroupSaleResponseBody build() {
            return new ModifyDesktopOversoldGroupSaleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("OversoldGroupId")
        private String oversoldGroupId;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
            this.oversoldGroupId = builder.oversoldGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return oversoldGroupId
         */
        public String getOversoldGroupId() {
            return this.oversoldGroupId;
        }

        public static final class Builder {
            private Long orderId; 
            private String oversoldGroupId; 

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OversoldGroupId.
             */
            public Builder oversoldGroupId(String oversoldGroupId) {
                this.oversoldGroupId = oversoldGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
