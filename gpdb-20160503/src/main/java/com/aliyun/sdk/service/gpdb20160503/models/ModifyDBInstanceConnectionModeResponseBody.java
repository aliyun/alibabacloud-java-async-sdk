// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConnectionModeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceConnectionModeResponseBody</p>
 */
public class ModifyDBInstanceConnectionModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceConnectionModeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConnectionModeResponseBody create() {
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

        public ModifyDBInstanceConnectionModeResponseBody build() {
            return new ModifyDBInstanceConnectionModeResponseBody(this);
        } 

    } 

}
