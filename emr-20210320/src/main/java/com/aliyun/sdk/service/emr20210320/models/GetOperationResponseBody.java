// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperationResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationResponseBody</p>
 */
public class GetOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Operation")
    private Operation operation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOperationResponseBody(Builder builder) {
        this.operation = builder.operation;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationResponseBody create() {
        return builder().build();
    }

    /**
     * @return operation
     */
    public Operation getOperation() {
        return this.operation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Operation operation; 
        private String requestId; 

        /**
         * The operation that is performed.
         */
        public Builder operation(Operation operation) {
            this.operation = operation;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOperationResponseBody build() {
            return new GetOperationResponseBody(this);
        } 

    } 

}
