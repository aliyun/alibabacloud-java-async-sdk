// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageSharePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyImageSharePermissionResponseBody</p>
 */
public class ModifyImageSharePermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyImageSharePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageSharePermissionResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyImageSharePermissionResponseBody build() {
            return new ModifyImageSharePermissionResponseBody(this);
        } 

    } 

}
