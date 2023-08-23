// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserIPSWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyUserIPSWhitelistResponseBody</p>
 */
public class ModifyUserIPSWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyUserIPSWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserIPSWhitelistResponseBody create() {
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

        public ModifyUserIPSWhitelistResponseBody build() {
            return new ModifyUserIPSWhitelistResponseBody(this);
        } 

    } 

}
