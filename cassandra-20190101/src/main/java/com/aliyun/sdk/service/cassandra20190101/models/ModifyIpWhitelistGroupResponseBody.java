// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpWhitelistGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyIpWhitelistGroupResponseBody</p>
 */
public class ModifyIpWhitelistGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyIpWhitelistGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpWhitelistGroupResponseBody create() {
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

        public ModifyIpWhitelistGroupResponseBody build() {
            return new ModifyIpWhitelistGroupResponseBody(this);
        } 

    } 

}
