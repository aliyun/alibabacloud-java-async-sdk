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
 * {@link ModifyDesktopChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopChargeTypeResponseBody</p>
 */
public class ModifyDesktopChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDesktopChargeTypeResponseBody(Builder builder) {
        this.desktopId = builder.desktopId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopChargeTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> desktopId; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyDesktopChargeTypeResponseBody model) {
            this.desktopId = model.desktopId;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the cloud computers.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDesktopChargeTypeResponseBody build() {
            return new ModifyDesktopChargeTypeResponseBody(this);
        } 

    } 

}
