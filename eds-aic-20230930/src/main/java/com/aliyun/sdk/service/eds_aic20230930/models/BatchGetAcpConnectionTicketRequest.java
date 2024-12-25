// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link BatchGetAcpConnectionTicketRequest} extends {@link RequestModel}
 *
 * <p>BatchGetAcpConnectionTicketRequest</p>
 */
public class BatchGetAcpConnectionTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTasks")
    private java.util.List<InstanceTasks> instanceTasks;

    private BatchGetAcpConnectionTicketRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.instanceGroupId = builder.instanceGroupId;
        this.instanceIds = builder.instanceIds;
        this.instanceTasks = builder.instanceTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetAcpConnectionTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceTasks
     */
    public java.util.List<InstanceTasks> getInstanceTasks() {
        return this.instanceTasks;
    }

    public static final class Builder extends Request.Builder<BatchGetAcpConnectionTicketRequest, Builder> {
        private String endUserId; 
        private String instanceGroupId; 
        private java.util.List<String> instanceIds; 
        private java.util.List<InstanceTasks> instanceTasks; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetAcpConnectionTicketRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.instanceGroupId = request.instanceGroupId;
            this.instanceIds = request.instanceIds;
            this.instanceTasks = request.instanceTasks;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * InstanceGroupId.
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InstanceTasks.
         */
        public Builder instanceTasks(java.util.List<InstanceTasks> instanceTasks) {
            this.putQueryParameter("InstanceTasks", instanceTasks);
            this.instanceTasks = instanceTasks;
            return this;
        }

        @Override
        public BatchGetAcpConnectionTicketRequest build() {
            return new BatchGetAcpConnectionTicketRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetAcpConnectionTicketRequest} extends {@link TeaModel}
     *
     * <p>BatchGetAcpConnectionTicketRequest</p>
     */
    public static class InstanceTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private InstanceTasks(Builder builder) {
            this.instanceId = builder.instanceId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTasks create() {
            return builder().build();
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

        public static final class Builder {
            private String instanceId; 
            private String taskId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public InstanceTasks build() {
                return new InstanceTasks(this);
            } 

        } 

    }
}
