// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillSparkLogAnalyzeTaskRequest} extends {@link RequestModel}
 *
 * <p>KillSparkLogAnalyzeTaskRequest</p>
 */
public class KillSparkLogAnalyzeTaskRequest extends Request {
    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private KillSparkLogAnalyzeTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillSparkLogAnalyzeTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<KillSparkLogAnalyzeTaskRequest, Builder> {
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(KillSparkLogAnalyzeTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the Spark log analysis task. You can call the ListSparkLogAnalyzeTasks operation to query the IDs and states of all analysis tasks in the current cluster.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public KillSparkLogAnalyzeTaskRequest build() {
            return new KillSparkLogAnalyzeTaskRequest(this);
        } 

    } 

}
