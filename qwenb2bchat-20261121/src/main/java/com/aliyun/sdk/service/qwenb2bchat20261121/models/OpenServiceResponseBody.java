// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bchat20261121.models;

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
 * {@link OpenServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenServiceResponseBody</p>
 */
public class OpenServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("error")
    private Error error;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("spInstanceId")
    private String spInstanceId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private OpenServiceResponseBody(Builder builder) {
        this.error = builder.error;
        this.orderId = builder.orderId;
        this.spInstanceId = builder.spInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return error
     */
    public Error getError() {
        return this.error;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return spInstanceId
     */
    public String getSpInstanceId() {
        return this.spInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Error error; 
        private String orderId; 
        private String spInstanceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(OpenServiceResponseBody model) {
            this.error = model.error;
            this.orderId = model.orderId;
            this.spInstanceId = model.spInstanceId;
            this.status = model.status;
        } 

        /**
         * <p>网关拒绝或处理失败时返回。成功响应没有此对象；平台在抵达业务网关前产生的错误遵循 OpenAPI 公共错误结构。</p>
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * <p>OPENING 或 ACTIVE 时返回的订单号；其他状态省略，无默认值。</p>
         * 
         * <strong>example:</strong>
         * <p>order-example-001</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>ACTIVE 时返回的 SP 实例 ID；其他状态省略，无默认值。</p>
         * 
         * <strong>example:</strong>
         * <p>sp-example-001</p>
         */
        public Builder spInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }

        /**
         * <p>正常响应必填。TEST_OK：接口验证通过，未发起实际开通；OPENING：已取得订单号，开通仍在处理中；ACTIVE：服务已开通，并返回订单号和实例 ID；ORDER_UNKNOWN：本次开通结果暂不能确认，不表示必定失败；REJECTED：本次因可用额度不足明确拒绝且未返回订单。HTTP 200 不等于已开通。</p>
         * 
         * <strong>example:</strong>
         * <p>TEST_OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public OpenServiceResponseBody build() {
            return new OpenServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OpenServiceResponseBody} extends {@link TeaModel}
     *
     * <p>OpenServiceResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        @com.aliyun.core.annotation.NameInMap("request_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String requestId;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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

        public static final class Builder {
            private String code; 
            private String message; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
                this.requestId = model.requestId;
            } 

            /**
             * <p>错误码列表见接口说明。请求校验、鉴权、授权、配额及开通处理错误都使用此位置。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>INVALID_REQUEST</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>对应错误的可读说明，不应依赖固定文案判断。开通处理错误可能返回 service activation failed。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>invalid request</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>用于排查错误；通常对应 X-Request-Id。客户关联号缺失或非法时可返回服务端诊断号，不是订单号。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>open-service-001</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
}
