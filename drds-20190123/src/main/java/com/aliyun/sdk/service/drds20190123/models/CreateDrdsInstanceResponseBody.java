// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link CreateDrdsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDrdsInstanceResponseBody</p>
 */
public class CreateDrdsInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateDrdsInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDrdsInstanceResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates the details of the result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D99D4644-A70D-49A3-B8B4-767ACC50SE2R</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDrdsInstanceResponseBody build() {
            return new CreateDrdsInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDrdsInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDrdsInstanceResponseBody</p>
     */
    public static class DrdsInstanceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("drdsInstanceIdList")
        private java.util.List<String> drdsInstanceIdList;

        private DrdsInstanceIdList(Builder builder) {
            this.drdsInstanceIdList = builder.drdsInstanceIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrdsInstanceIdList create() {
            return builder().build();
        }

        /**
         * @return drdsInstanceIdList
         */
        public java.util.List<String> getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

        public static final class Builder {
            private java.util.List<String> drdsInstanceIdList; 

            /**
             * drdsInstanceIdList.
             */
            public Builder drdsInstanceIdList(java.util.List<String> drdsInstanceIdList) {
                this.drdsInstanceIdList = drdsInstanceIdList;
                return this;
            }

            public DrdsInstanceIdList build() {
                return new DrdsInstanceIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDrdsInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDrdsInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrdsInstanceIdList")
        private DrdsInstanceIdList drdsInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        private Data(Builder builder) {
            this.drdsInstanceIdList = builder.drdsInstanceIdList;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return drdsInstanceIdList
         */
        public DrdsInstanceIdList getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private DrdsInstanceIdList drdsInstanceIdList; 
            private Long orderId; 

            /**
             * <p>Indicates the ID of the instance.</p>
             */
            public Builder drdsInstanceIdList(DrdsInstanceIdList drdsInstanceIdList) {
                this.drdsInstanceIdList = drdsInstanceIdList;
                return this;
            }

            /**
             * <p>Indicates the ID of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>111111111111111</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
