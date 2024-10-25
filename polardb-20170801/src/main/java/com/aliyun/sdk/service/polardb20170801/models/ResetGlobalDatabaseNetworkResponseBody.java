// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResetGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>ResetGlobalDatabaseNetworkResponseBody</p>
 */
public class ResetGlobalDatabaseNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67F2E75F-AE67-4FB2-821F-A81237EACD15</p>
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
