// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyDiskChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDiskChargeTypeResponseBody</p>
 */
public class ModifyDiskChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDiskChargeTypeResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskChargeTypeResponseBody create() {
        return builder().build();
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
        private String orderId; 
        private String requestId; 

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDiskChargeTypeResponseBody build() {
            return new ModifyDiskChargeTypeResponseBody(this);
        } 

    } 

}
