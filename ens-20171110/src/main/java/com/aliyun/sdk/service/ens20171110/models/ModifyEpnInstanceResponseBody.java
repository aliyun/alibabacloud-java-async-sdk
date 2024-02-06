// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEpnInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyEpnInstanceResponseBody</p>
 */
public class ModifyEpnInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyEpnInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEpnInstanceResponseBody create() {
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

        public ModifyEpnInstanceResponseBody build() {
            return new ModifyEpnInstanceResponseBody(this);
        } 

    } 

}
