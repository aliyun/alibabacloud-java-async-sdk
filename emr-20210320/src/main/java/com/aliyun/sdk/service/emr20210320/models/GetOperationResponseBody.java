// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOperationResponseBody model) {
            this.operation = model.operation;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The operation that was performed.</p>
         */
        public Builder operation(Operation operation) {
            this.operation = operation;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3896A</p>
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
