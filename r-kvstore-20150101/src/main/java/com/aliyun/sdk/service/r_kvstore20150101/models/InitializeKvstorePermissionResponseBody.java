// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeKvstorePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>InitializeKvstorePermissionResponseBody</p>
 */
public class InitializeKvstorePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private InitializeKvstorePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeKvstorePermissionResponseBody create() {
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

        public InitializeKvstorePermissionResponseBody build() {
            return new InitializeKvstorePermissionResponseBody(this);
        } 

    } 

}
