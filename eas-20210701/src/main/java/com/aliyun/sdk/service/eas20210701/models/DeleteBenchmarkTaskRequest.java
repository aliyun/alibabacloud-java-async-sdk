// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBenchmarkTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteBenchmarkTaskRequest</p>
 */
public class DeleteBenchmarkTaskRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("TaskName")
    @Validation(required = true)
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
         * The ID of the region where the stress testing task is performed.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the stress testing task. For more information about how to query the name of a stress testing task, see [ListBenchmarkTask](~~432976~~).
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
