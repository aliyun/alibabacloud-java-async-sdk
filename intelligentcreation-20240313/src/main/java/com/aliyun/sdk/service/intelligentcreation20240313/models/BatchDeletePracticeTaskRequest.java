// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchDeletePracticeTaskRequest} extends {@link RequestModel}
 *
 * <p>BatchDeletePracticeTaskRequest</p>
 */
public class BatchDeletePracticeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("idempotentId")
    private String idempotentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskIds")
    private java.util.List<String> taskIds;

    private BatchDeletePracticeTaskRequest(Builder builder) {
        super(builder);
        this.idempotentId = builder.idempotentId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeletePracticeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<BatchDeletePracticeTaskRequest, Builder> {
        private String idempotentId; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeletePracticeTaskRequest request) {
            super(request);
            this.idempotentId = request.idempotentId;
            this.taskIds = request.taskIds;
        } 

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.putQueryParameter("idempotentId", idempotentId);
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * taskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            String taskIdsShrink = shrink(taskIds, "taskIds", "simple");
            this.putQueryParameter("taskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public BatchDeletePracticeTaskRequest build() {
            return new BatchDeletePracticeTaskRequest(this);
        } 

    } 

}
