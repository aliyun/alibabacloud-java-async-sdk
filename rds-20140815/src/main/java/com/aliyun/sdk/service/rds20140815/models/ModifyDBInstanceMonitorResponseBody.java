// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceMonitorResponseBody</p>
 */
public class ModifyDBInstanceMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceMonitorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceMonitorResponseBody create() {
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

        public ModifyDBInstanceMonitorResponseBody build() {
            return new ModifyDBInstanceMonitorResponseBody(this);
        } 

    } 

}
