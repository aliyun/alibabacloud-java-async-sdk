// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDataFlowAutoRefreshResponseBody} extends {@link TeaModel}
 *
 * <p>CancelDataFlowAutoRefreshResponseBody</p>
 */
public class CancelDataFlowAutoRefreshResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelDataFlowAutoRefreshResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDataFlowAutoRefreshResponseBody create() {
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

        public CancelDataFlowAutoRefreshResponseBody build() {
            return new CancelDataFlowAutoRefreshResponseBody(this);
        } 

    } 

}
