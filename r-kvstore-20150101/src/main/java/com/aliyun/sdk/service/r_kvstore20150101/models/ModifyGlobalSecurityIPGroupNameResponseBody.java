// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalSecurityIPGroupNameResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyGlobalSecurityIPGroupNameResponseBody</p>
 */
public class ModifyGlobalSecurityIPGroupNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyGlobalSecurityIPGroupNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGlobalSecurityIPGroupNameResponseBody create() {
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

        public ModifyGlobalSecurityIPGroupNameResponseBody build() {
            return new ModifyGlobalSecurityIPGroupNameResponseBody(this);
        } 

    } 

}
