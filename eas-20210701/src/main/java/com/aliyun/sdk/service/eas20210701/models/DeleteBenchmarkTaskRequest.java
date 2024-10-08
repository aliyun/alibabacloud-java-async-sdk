// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteBenchmarkTaskRequest</p>
 */
public class DeleteBenchmarkTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    private DeleteBenchmarkTaskRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBenchmarkTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DeleteBenchmarkTaskRequest, Builder> {
        private String clusterId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBenchmarkTaskRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The ID of the region where the stress testing task is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the stress testing task. For more information about how to query the name of a stress testing task, see <a href="~~432976~~">ListBenchmarkTask</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>benchmark-larec-test-2b11</p>
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DeleteBenchmarkTaskRequest build() {
            return new DeleteBenchmarkTaskRequest(this);
        } 

    } 

}
