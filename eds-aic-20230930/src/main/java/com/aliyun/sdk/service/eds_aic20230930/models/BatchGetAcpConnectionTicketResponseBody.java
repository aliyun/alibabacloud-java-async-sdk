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
 * {@link BatchGetAcpConnectionTicketResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetAcpConnectionTicketResponseBody</p>
 */
public class BatchGetAcpConnectionTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceConnectionModels")
    private java.util.List<InstanceConnectionModels> instanceConnectionModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetAcpConnectionTicketResponseBody(Builder builder) {
        this.instanceConnectionModels = builder.instanceConnectionModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetAcpConnectionTicketResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceConnectionModels
     */
    public java.util.List<InstanceConnectionModels> getInstanceConnectionModels() {
        return this.instanceConnectionModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceConnectionModels> instanceConnectionModels; 
        private String requestId; 

        /**
         * InstanceConnectionModels.
         */
        public Builder instanceConnectionModels(java.util.List<InstanceConnectionModels> instanceConnectionModels) {
            this.instanceConnectionModels = instanceConnectionModels;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetAcpConnectionTicketResponseBody build() {
            return new BatchGetAcpConnectionTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetAcpConnectionTicketResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetAcpConnectionTicketResponseBody</p>
     */
    public static class InstanceConnectionModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("Ticket")
        private String ticket;

        private InstanceConnectionModels(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.instanceId = builder.instanceId;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.ticket = builder.ticket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConnectionModels create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
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

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return ticket
         */
        public String getTicket() {
            return this.ticket;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String instanceId; 
            private String taskId; 
            private String taskStatus; 
            private String ticket; 

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

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

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * Ticket.
             */
            public Builder ticket(String ticket) {
                this.ticket = ticket;
                return this;
            }

            public InstanceConnectionModels build() {
                return new InstanceConnectionModels(this);
            } 

        } 

    }
}
