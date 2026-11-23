// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261121.models;

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
    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("spInstanceId")
    private String spInstanceId;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private OpenServiceResponseBody(Builder builder) {
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
        private String orderId; 
        private String spInstanceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(OpenServiceResponseBody model) {
            this.orderId = model.orderId;
            this.spInstanceId = model.spInstanceId;
            this.status = model.status;
        } 

        /**
         * <p>关联本次开通申请的订单 ID，存在时返回。</p>
         * 
         * <strong>example:</strong>
         * <p>2000000000000001</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>服务已开通时返回的实例标识。</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder spInstanceId(String spInstanceId) {
            this.spInstanceId = spInstanceId;
            return this;
        }

        /**
         * <p>TEST_OK 表示仅验证调用成功。OPENING 表示开通处理中。ACTIVE 表示已开通。ORDER_UNKNOWN 表示暂时无法确认开通结果。REJECTED 表示开通请求未获通过。</p>
         * <p>This parameter is required.</p>
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

}
