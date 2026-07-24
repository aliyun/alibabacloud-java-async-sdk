// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateAICloudPhoneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAICloudPhoneResponseBody</p>
 */
public class CreateAICloudPhoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAICloudPhoneResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICloudPhoneResponseBody create() {
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

        private Builder(CreateAICloudPhoneResponseBody model) {
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
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>9A51B1DF-96FF-3BCC-B08C-783161D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAICloudPhoneResponseBody build() {
            return new CreateAICloudPhoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAICloudPhoneResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAICloudPhoneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("PackageIds")
        private java.util.List<String> packageIds;

        private Data(Builder builder) {
            this.orderId = builder.orderId;
            this.packageIds = builder.packageIds;
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
         * @return packageIds
         */
        public java.util.List<String> getPackageIds() {
            return this.packageIds;
        }

        public static final class Builder {
            private Long orderId; 
            private java.util.List<String> packageIds; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.orderId = model.orderId;
                this.packageIds = model.packageIds;
            } 

            /**
             * <p>订单ID</p>
             * 
             * <strong>example:</strong>
             * <p>20230930123456</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>套餐包ID列表</p>
             */
            public Builder packageIds(java.util.List<String> packageIds) {
                this.packageIds = packageIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
