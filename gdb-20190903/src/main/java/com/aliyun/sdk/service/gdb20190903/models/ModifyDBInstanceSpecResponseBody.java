// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceSpecResponseBody</p>
 */
public class ModifyDBInstanceSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceSpecResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSpecResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDBInstanceSpecResponseBody build() {
            return new ModifyDBInstanceSpecResponseBody(this);
        } 

    } 

}
