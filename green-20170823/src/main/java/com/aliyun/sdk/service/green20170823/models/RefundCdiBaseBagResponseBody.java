// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundCdiBaseBagResponseBody} extends {@link TeaModel}
 *
 * <p>RefundCdiBaseBagResponseBody</p>
 */
public class RefundCdiBaseBagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RefundCdiBaseBagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundCdiBaseBagResponseBody create() {
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

        public RefundCdiBaseBagResponseBody build() {
            return new RefundCdiBaseBagResponseBody(this);
        } 

    } 

}
