// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterAccessWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterAccessWhitelistResponseBody</p>
 */
public class ModifyDBClusterAccessWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDBClusterAccessWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAccessWhitelistResponseBody create() {
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

        public ModifyDBClusterAccessWhitelistResponseBody build() {
            return new ModifyDBClusterAccessWhitelistResponseBody(this);
        } 

    } 

}
