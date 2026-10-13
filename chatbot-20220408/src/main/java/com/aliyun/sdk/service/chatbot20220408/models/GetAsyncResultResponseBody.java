// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link GetAsyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncResultResponseBody</p>
 */
public class GetAsyncResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetAsyncResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetAsyncResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The execution result data of the customer service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;message&quot;:&quot;Execution completed&quot;}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F79E7305-5314-5069-A701-9591AD051902</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution status.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Value</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Success</td>
         * <td>The task is executed.</td>
         * </tr>
         * <tr>
         * <td>Runninig</td>
         * <td>The task is being executed.</td>
         * </tr>
         * <tr>
         * <td>Fail</td>
         * <td>The task failed to be executed.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetAsyncResultResponseBody build() {
            return new GetAsyncResultResponseBody(this);
        } 

    } 

}
