// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBackupPolicyResponseBody</p>
 */
public class ModifyBackupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyBackupPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyResponseBody create() {
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

        public ModifyBackupPolicyResponseBody build() {
            return new ModifyBackupPolicyResponseBody(this);
        } 

    } 

}
