// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RestoreDBInstanceResponseBody</p>
 */
public class RestoreDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RestoreDBInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreDBInstanceResponseBody create() {
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

        public RestoreDBInstanceResponseBody build() {
            return new RestoreDBInstanceResponseBody(this);
        } 

    } 

}
