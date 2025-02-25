// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateDrdsInstanceResponseBody build() {
            return new CreateDrdsInstanceResponseBody(this);
        } 

    } 

    public static class DrdsInstanceIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
        private java.util.List < String > drdsInstanceId;

        private DrdsInstanceIdList(Builder builder) {
            this.drdsInstanceId = builder.drdsInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DrdsInstanceIdList create() {
            return builder().build();
        }

        /**
         * @return drdsInstanceId
         */
        public java.util.List < String > getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > drdsInstanceId; 

            /**
             * DrdsInstanceId.
             */
            public Builder drdsInstanceId(java.util.List < String > drdsInstanceId) {
                this.drdsInstanceId = drdsInstanceId;
                return this;
            }

            public DrdsInstanceIdList build() {
                return new DrdsInstanceIdList(this);
            } 

        } 

    }
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
             * DrdsInstanceIdList.
             */
            public Builder drdsInstanceIdList(DrdsInstanceIdList drdsInstanceIdList) {
                this.drdsInstanceIdList = drdsInstanceIdList;
                return this;
            }

            /**
             * OrderId.
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
