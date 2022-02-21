// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterAuditLogCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterAuditLogCollectorResponseBody</p>
 */
public class ModifyDBClusterAuditLogCollectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBClusterAuditLogCollectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAuditLogCollectorResponseBody create() {
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

        public ModifyDBClusterAuditLogCollectorResponseBody build() {
            return new ModifyDBClusterAuditLogCollectorResponseBody(this);
        } 

    } 

}
