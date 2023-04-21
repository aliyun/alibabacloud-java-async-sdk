// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDesktopChargeTypeResponseBody</p>
 */
public class ModifyDesktopChargeTypeResponseBody extends TeaModel {
    @NameInMap("DesktopId")
    private java.util.List < String > desktopId;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
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

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
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
        private java.util.List < String > desktopId; 
        private String orderId; 
        private String requestId; 

        /**
         * The IDs of the desktop groups. If multiple cloud desktops are created at a time, multiple cloud desktop IDs are returned.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
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
