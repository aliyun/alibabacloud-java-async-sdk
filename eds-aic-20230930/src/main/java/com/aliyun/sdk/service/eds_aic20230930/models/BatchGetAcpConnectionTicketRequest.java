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
    @com.aliyun.core.annotation.NameInMap("ConnectionMode")
    private String connectionMode;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ports")
    private java.util.List<String> ports;

    private BatchGetAcpConnectionTicketRequest(Builder builder) {
        super(builder);
        this.connectionMode = builder.connectionMode;
        this.endUserId = builder.endUserId;
        this.instanceGroupId = builder.instanceGroupId;
        this.instanceIds = builder.instanceIds;
        this.instanceTasks = builder.instanceTasks;
        this.ports = builder.ports;
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
     * @return connectionMode
     */
    public String getConnectionMode() {
        return this.connectionMode;
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

    /**
     * @return ports
     */
    public java.util.List<String> getPorts() {
        return this.ports;
    }

    public static final class Builder extends Request.Builder<BatchGetAcpConnectionTicketRequest, Builder> {
        private String connectionMode; 
        private String endUserId; 
        private String instanceGroupId; 
        private java.util.List<String> instanceIds; 
        private java.util.List<InstanceTasks> instanceTasks; 
        private java.util.List<String> ports; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetAcpConnectionTicketRequest request) {
            super(request);
            this.connectionMode = request.connectionMode;
            this.endUserId = request.endUserId;
            this.instanceGroupId = request.instanceGroupId;
            this.instanceIds = request.instanceIds;
            this.instanceTasks = request.instanceTasks;
            this.ports = request.ports;
        } 

        /**
         * <p>The connection mode.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder connectionMode(String connectionMode) {
            this.putQueryParameter("ConnectionMode", connectionMode);
            this.connectionMode = connectionMode;
            return this;
        }

        /**
         * <p>The ID of the assigned user. If you do not specify this parameter, the system user assigned in the background is used to obtain the ticket.</p>
         * <p>&lt;props=&quot;china&quot;&gt;
         * The usage of this parameter varies based on the Cloud Phone edition and the instance streaming mode:</p>
         * <ul>
         * <li>Cloud Phone Instance Edition or Cloud Phone Matrix Edition (preemptive mode): You can obtain a <code>Ticket</code> only by using the same <code>EnduserId</code>.</li>
         * <li>Cloud Phone Matrix Edition (collaborative mode): You can pass different <code>EnduserId</code> values to obtain <code>Ticket</code> values and stream for different users (up to 5) at the same time. You can pass only one <code>EnduserId</code> at a time.</li>
         * </ul>
         * <blockquote>
         * <p>You can define the instance streaming mode by using the <code>StreamMode</code> parameter of the <code>ModifyCloudPhoneNode</code> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The instance group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-25nt4kk9whjh****</p>
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * <p>The list of Cloud Phone instance IDs. You can specify 1 to 100 IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The instance connection tasks. This parameter is used to query whether the ticket retrieval task is completed.</p>
         */
        public Builder instanceTasks(java.util.List<InstanceTasks> instanceTasks) {
            this.putQueryParameter("InstanceTasks", instanceTasks);
            this.instanceTasks = instanceTasks;
            return this;
        }

        /**
         * <p>The list of custom connection ports.</p>
         */
        public Builder ports(java.util.List<String> ports) {
            this.putQueryParameter("Ports", ports);
            this.ports = ports;
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

            private Builder() {
            } 

            private Builder(InstanceTasks model) {
                this.instanceId = model.instanceId;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-fkuit0cmyfvzz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou@c9f5c2e8-f5c4-4b01-8602-000cae94****</p>
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
