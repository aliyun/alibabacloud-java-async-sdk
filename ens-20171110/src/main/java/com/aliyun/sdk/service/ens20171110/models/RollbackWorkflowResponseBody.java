// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>RollbackWorkflowResponseBody</p>
 */
public class RollbackWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RollbackWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackWorkflowResponseBody create() {
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

        public RollbackWorkflowResponseBody build() {
            return new RollbackWorkflowResponseBody(this);
        } 

    } 

}
