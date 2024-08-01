// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceNetworkTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceNetworkTypeResponseBody</p>
 */
public class ModifyDBInstanceNetworkTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceNetworkTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceNetworkTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBInstanceNetworkTypeResponseBody build() {
            return new ModifyDBInstanceNetworkTypeResponseBody(this);
        } 

    } 

}
