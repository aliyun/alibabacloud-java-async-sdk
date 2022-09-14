// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserPasswordsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyUserPasswordsResponseBody</p>
 */
public class ModifyUserPasswordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyUserPasswordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserPasswordsResponseBody create() {
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

        public ModifyUserPasswordsResponseBody build() {
            return new ModifyUserPasswordsResponseBody(this);
        } 

    } 

}
