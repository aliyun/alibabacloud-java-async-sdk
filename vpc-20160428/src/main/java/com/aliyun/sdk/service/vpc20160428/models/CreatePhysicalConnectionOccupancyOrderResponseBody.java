// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreatePhysicalConnectionOccupancyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhysicalConnectionOccupancyOrderResponseBody</p>
 */
public class CreatePhysicalConnectionOccupancyOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePhysicalConnectionOccupancyOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhysicalConnectionOccupancyOrderResponseBody create() {
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

        private Builder(CreatePhysicalConnectionOccupancyOrderResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B9300FE-11E2-4E3B-949C-BED3B44DD26D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhysicalConnectionOccupancyOrderResponseBody build() {
            return new CreatePhysicalConnectionOccupancyOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePhysicalConnectionOccupancyOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePhysicalConnectionOccupancyOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
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
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String orderId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.orderId = model.orderId;
            } 

            /**
             * <p>The ID of the order that is placed.</p>
             * 
             * <strong>example:</strong>
             * <p>50187055895****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
