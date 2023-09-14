// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IncreaseNodesResponseBody} extends {@link TeaModel}
 *
 * <p>IncreaseNodesResponseBody</p>
 */
public class IncreaseNodesResponseBody extends TeaModel {
    @NameInMap("OperationId")
    private String operationId;

    @NameInMap("RequestId")
    private String requestId;

    private IncreaseNodesResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String operationId; 
        private String requestId; 

        /**
         * The ID of the operation.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public IncreaseNodesResponseBody build() {
            return new IncreaseNodesResponseBody(this);
        } 

    } 

}
