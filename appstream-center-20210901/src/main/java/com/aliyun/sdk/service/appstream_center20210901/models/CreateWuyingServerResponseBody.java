// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link CreateWuyingServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWuyingServerResponseBody</p>
 */
public class CreateWuyingServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateWuyingServerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWuyingServerResponseBody create() {
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

        private Builder(CreateWuyingServerResponseBody model) {
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

        public CreateWuyingServerResponseBody build() {
            return new CreateWuyingServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWuyingServerResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWuyingServerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("WuyingServerIdList")
        private java.util.List<String> wuyingServerIdList;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
            this.wuyingServerIdList = builder.wuyingServerIdList;
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

        /**
         * @return wuyingServerIdList
         */
        public java.util.List<String> getWuyingServerIdList() {
            return this.wuyingServerIdList;
        }

        public static final class Builder {
            private String orderId; 
            private java.util.List<String> wuyingServerIdList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.orderId = model.orderId;
                this.wuyingServerIdList = model.wuyingServerIdList;
            } 

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * WuyingServerIdList.
             */
            public Builder wuyingServerIdList(java.util.List<String> wuyingServerIdList) {
                this.wuyingServerIdList = wuyingServerIdList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
