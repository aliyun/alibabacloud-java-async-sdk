// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshProxyLevelResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshProxyLevelResponseBody</p>
 */
public class RefreshProxyLevelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RefreshProxyLevelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshProxyLevelResponseBody create() {
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

        public RefreshProxyLevelResponseBody build() {
            return new RefreshProxyLevelResponseBody(this);
        } 

    } 

}
