// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateTaskAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTaskAsyncResponseBody</p>
 */
public class UpdateTaskAsyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateTaskAsyncResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskAsyncResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateTaskAsyncResponseBody model) {
            this.operationId = model.operationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The operation ID, used to retrieve the result of the asynchronous node update. You can obtain this value from the <code>UpdateTaskAsync</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The unique ID of this request. If an error occurs, you can use this ID to troubleshoot the issue.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateTaskAsyncResponseBody build() {
            return new UpdateTaskAsyncResponseBody(this);
        } 

    } 

}
