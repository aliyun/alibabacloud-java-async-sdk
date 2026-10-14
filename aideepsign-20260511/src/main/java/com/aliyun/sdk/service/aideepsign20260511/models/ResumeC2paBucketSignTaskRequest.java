// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link ResumeC2paBucketSignTaskRequest} extends {@link RequestModel}
 *
 * <p>ResumeC2paBucketSignTaskRequest</p>
 */
public class ResumeC2paBucketSignTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private ResumeC2paBucketSignTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeC2paBucketSignTaskRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeC2paBucketSignTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeC2paBucketSignTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The Bucket parent task ID returned by CreateC2paBucketSignTask.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>047b8305-9572-4eed-b7fb-8588b989b6e5</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ResumeC2paBucketSignTaskRequest build() {
            return new ResumeC2paBucketSignTaskRequest(this);
        } 

    } 

}
