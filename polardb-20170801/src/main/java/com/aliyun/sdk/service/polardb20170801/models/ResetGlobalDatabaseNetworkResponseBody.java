// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>ResetGlobalDatabaseNetworkResponseBody</p>
 */
public class ResetGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResetGlobalDatabaseNetworkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetGlobalDatabaseNetworkResponseBody create() {
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

        public ResetGlobalDatabaseNetworkResponseBody build() {
            return new ResetGlobalDatabaseNetworkResponseBody(this);
        } 

    } 

}
