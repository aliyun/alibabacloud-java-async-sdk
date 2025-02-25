// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUIProxyAccountPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyUIProxyAccountPasswordResponseBody</p>
 */
public class ModifyUIProxyAccountPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyUIProxyAccountPasswordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUIProxyAccountPasswordResponseBody create() {
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

        public ModifyUIProxyAccountPasswordResponseBody build() {
            return new ModifyUIProxyAccountPasswordResponseBody(this);
        } 

    } 

}
