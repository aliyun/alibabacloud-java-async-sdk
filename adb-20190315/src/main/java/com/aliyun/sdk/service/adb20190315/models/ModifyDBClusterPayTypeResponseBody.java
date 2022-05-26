// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterPayTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterPayTypeResponseBody</p>
 */
public class ModifyDBClusterPayTypeResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBClusterPayTypeResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.orderId = builder.orderId;
        this.payType = builder.payType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterPayTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String orderId; 
        private String payType; 
        private String requestId; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBClusterPayTypeResponseBody build() {
            return new ModifyDBClusterPayTypeResponseBody(this);
        } 

    } 

}
