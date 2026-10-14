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
 * {@link PauseC2paBucketSignTaskRequest} extends {@link RequestModel}
 *
 * <p>PauseC2paBucketSignTaskRequest</p>
 */
public class PauseC2paBucketSignTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private PauseC2paBucketSignTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseC2paBucketSignTaskRequest create() {
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

    public static final class Builder extends Request.Builder<PauseC2paBucketSignTaskRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(PauseC2paBucketSignTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The bucket parent task ID returned by CreateC2paBucketSignTask.</p>
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
        public PauseC2paBucketSignTaskRequest build() {
            return new PauseC2paBucketSignTaskRequest(this);
        } 

    } 

}
