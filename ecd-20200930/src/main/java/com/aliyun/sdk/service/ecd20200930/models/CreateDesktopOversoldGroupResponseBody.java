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
 * {@link CreateDesktopOversoldGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDesktopOversoldGroupResponseBody</p>
 */
public class CreateDesktopOversoldGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDesktopOversoldGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopOversoldGroupResponseBody create() {
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

        public CreateDesktopOversoldGroupResponseBody build() {
            return new CreateDesktopOversoldGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDesktopOversoldGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDesktopOversoldGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
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
