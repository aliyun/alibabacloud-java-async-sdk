// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobGroupExportTaskProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobGroupExportTaskProgressRequest</p>
 */
public class DescribeJobGroupExportTaskProgressRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DescribeJobGroupExportTaskProgressRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobGroupExportTaskProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeJobGroupExportTaskProgressRequest, Builder> {
        private String instanceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobGroupExportTaskProgressRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeJobGroupExportTaskProgressRequest build() {
            return new DescribeJobGroupExportTaskProgressRequest(this);
        } 

    } 

}
