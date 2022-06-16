// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderFreeFlowProductStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderFreeFlowProductStatusResponseBody</p>
 */
public class GetOrderFreeFlowProductStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetOrderFreeFlowProductStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderFreeFlowProductStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rt
     */
    public Long getRt() {
        return this.rt;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOrderFreeFlowProductStatusResponseBody build() {
            return new GetOrderFreeFlowProductStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CustomerFlowOrderId")
        private String customerFlowOrderId;

        @NameInMap("CustomerFlowRequestId")
        private String customerFlowRequestId;

        @NameInMap("Error")
        private String error;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.customerFlowOrderId = builder.customerFlowOrderId;
            this.customerFlowRequestId = builder.customerFlowRequestId;
            this.error = builder.error;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerFlowOrderId
         */
        public String getCustomerFlowOrderId() {
            return this.customerFlowOrderId;
        }

        /**
         * @return customerFlowRequestId
         */
        public String getCustomerFlowRequestId() {
            return this.customerFlowRequestId;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String customerFlowOrderId; 
            private String customerFlowRequestId; 
            private String error; 
            private String status; 

            /**
             * C端免流订单ID
             */
            public Builder customerFlowOrderId(String customerFlowOrderId) {
                this.customerFlowOrderId = customerFlowOrderId;
                return this;
            }

            /**
             * CustomerFlowRequestId.
             */
            public Builder customerFlowRequestId(String customerFlowRequestId) {
                this.customerFlowRequestId = customerFlowRequestId;
                return this;
            }

            /**
             * status为fail时，描述fail的具体原因
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * 执行中ordering、成功success、失败fail
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
