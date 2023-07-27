// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkLogAnalyzeTaskRequest} extends {@link RequestModel}
 *
 * <p>GetSparkLogAnalyzeTaskRequest</p>
 */
public class GetSparkLogAnalyzeTaskRequest extends Request {
    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private GetSparkLogAnalyzeTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkLogAnalyzeTaskRequest create() {
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

    public static final class Builder extends Request.Builder<GetSparkLogAnalyzeTaskRequest, Builder> {
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkLogAnalyzeTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * The ID of the Spark log analysis task. You can call the ListSparkLogAnalyzeTasks operation to query the IDs of all Spark log analysis tasks that are submitted in the current cluster.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetSparkLogAnalyzeTaskRequest build() {
            return new GetSparkLogAnalyzeTaskRequest(this);
        } 

    } 

}
