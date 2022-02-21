// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDeletionProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>EnableDeletionProtectionResponseBody</p>
 */
public class EnableDeletionProtectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableDeletionProtectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableDeletionProtectionResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableDeletionProtectionResponseBody build() {
            return new EnableDeletionProtectionResponseBody(this);
        } 

    } 

}
