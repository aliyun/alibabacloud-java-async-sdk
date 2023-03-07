// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInvocationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListInvocationStatusResponseBody</p>
 */
public class ListInvocationStatusResponseBody extends TeaModel {
    @NameInMap("CommandId")
    private String commandId;

    @NameInMap("InvokeInstances")
    private InvokeInstances invokeInstances;

    @NameInMap("InvokeStatus")
    private String invokeStatus;

    @NameInMap("RequestId")
    private String requestId;

    private ListInvocationStatusResponseBody(Builder builder) {
        this.commandId = builder.commandId;
        this.invokeInstances = builder.invokeInstances;
        this.invokeStatus = builder.invokeStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvocationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return invokeInstances
     */
    public InvokeInstances getInvokeInstances() {
        return this.invokeInstances;
    }

    /**
     * @return invokeStatus
     */
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commandId; 
        private InvokeInstances invokeInstances; 
        private String invokeStatus; 
        private String requestId; 

        /**
         * The ID of the command.
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * The list of statuses. A list is returned for each node.
         */
        public Builder invokeInstances(InvokeInstances invokeInstances) {
            this.invokeInstances = invokeInstances;
            return this;
        }

        /**
         * The overall status of all nodes in the cluster. Valid values:
         * <p>
         * 
         * - Finished
         * - Running
         * - Failed
         * - Stopped
         */
        public Builder invokeStatus(String invokeStatus) {
            this.invokeStatus = invokeStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInvocationStatusResponseBody build() {
            return new ListInvocationStatusResponseBody(this);
        } 

    } 

    public static class InvokeInstance extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceInvokeStatus")
        private String instanceInvokeStatus;

        private InvokeInstance(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceInvokeStatus = builder.instanceInvokeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstance create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceInvokeStatus
         */
        public String getInstanceInvokeStatus() {
            return this.instanceInvokeStatus;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceInvokeStatus; 

            /**
             * The ID of the node.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   Finished
             * *   Running
             * *   Failed
             * *   Stopped
             */
            public Builder instanceInvokeStatus(String instanceInvokeStatus) {
                this.instanceInvokeStatus = instanceInvokeStatus;
                return this;
            }

            public InvokeInstance build() {
                return new InvokeInstance(this);
            } 

        } 

    }
    public static class InvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        private java.util.List < InvokeInstance> invokeInstance;

        private InvokeInstances(Builder builder) {
            this.invokeInstance = builder.invokeInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvokeInstances create() {
            return builder().build();
        }

        /**
         * @return invokeInstance
         */
        public java.util.List < InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List < InvokeInstance> invokeInstance; 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List < InvokeInstance> invokeInstance) {
                this.invokeInstance = invokeInstance;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
}
