// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link QueryAsyncTaskResultRequest} extends {@link RequestModel}
 *
 * <p>QueryAsyncTaskResultRequest</p>
 */
public class QueryAsyncTaskResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private QueryAsyncTaskResultRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAsyncTaskResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryAsyncTaskResultRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAsyncTaskResultRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the asynchronous task. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b67f6089-085a-9402-93c6-bac0561b3a06</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryAsyncTaskResultRequest build() {
            return new QueryAsyncTaskResultRequest(this);
        } 

    } 

}
