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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BatchGetAcpConnectionTicketResponseBody model) {
            this.instanceConnectionModels = model.instanceConnectionModels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The results of the instance connection tasks.</p>
         */
        public Builder instanceConnectionModels(java.util.List<InstanceConnectionModels> instanceConnectionModels) {
            this.instanceConnectionModels = instanceConnectionModels;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            private Builder() {
            } 

            private Builder(InstanceConnectionModels model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.instanceId = model.instanceId;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.ticket = model.ticket;
            } 

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-1uzb6heg797z3****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The ID of the cloud phone instance.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-ajxvwo1u0hqvd****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou@c9f5c2e8-f5c4-4b01-8602-000cae94****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The state of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The ticket used to connect to the cloud phone instance.</p>
             * 
             * <strong>example:</strong>
             * <p>piVE58_AdmVSVW7SEW3<em>AE5</em>p8mmO5gvItsNOmv4S_f_cNpoU_BOTwChTBoNM1ZJeedfK9zxYnbN5hossqIZCr6t7SGxRigm2Cb4fGaCdBZWIzmgdHq6sXXZQg4KFWufyvpeV<em>0</em>Cm58slMT1tJw3****</p>
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
