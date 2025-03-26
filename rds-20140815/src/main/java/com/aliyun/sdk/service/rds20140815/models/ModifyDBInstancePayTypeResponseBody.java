// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBInstancePayTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstancePayTypeResponseBody</p>
 */
public class ModifyDBInstancePayTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    private ModifyDBInstancePayTypeResponseBody(Builder builder) {
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstancePayTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    public static final class Builder {
        private Long orderId; 

        private Builder() {
        } 

        private Builder(ModifyDBInstancePayTypeResponseBody model) {
            this.orderId = model.orderId;
        } 

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100789370230206</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        public ModifyDBInstancePayTypeResponseBody build() {
            return new ModifyDBInstancePayTypeResponseBody(this);
        } 

    } 

}
