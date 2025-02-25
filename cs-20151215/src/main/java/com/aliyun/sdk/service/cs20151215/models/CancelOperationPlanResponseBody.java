// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelOperationPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CancelOperationPlanResponseBody</p>
 */
public class CancelOperationPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private CancelOperationPlanResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOperationPlanResponseBody create() {
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
         * <p>db82195b-75a8-40e5-9be4-16f1829dc624</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelOperationPlanResponseBody build() {
            return new CancelOperationPlanResponseBody(this);
        } 

    } 

}
