// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListInvocationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListInvocationStatusResponseBody</p>
 */
public class ListInvocationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.NameInMap("InvokeInstances")
    private InvokeInstances invokeInstances;

    @com.aliyun.core.annotation.NameInMap("InvokeStatus")
    private String invokeStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListInvocationStatusResponseBody model) {
            this.commandId = model.commandId;
            this.invokeInstances = model.invokeInstances;
            this.invokeStatus = model.invokeStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-hz01v8x80o3****</p>
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>An array of execution statuses. An entry is returned for each node.</p>
         */
        public Builder invokeInstances(InvokeInstances invokeInstances) {
            this.invokeInstances = invokeInstances;
            return this;
        }

        /**
         * <p>The status of the command. Valid values:</p>
         * <ul>
         * <li>Finished: The execution of the command finished.</li>
         * <li>Running: The command is being executed.</li>
         * <li>Failed: The command failed to be executed.</li>
         * <li>Stopped: The execution of the command stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder invokeStatus(String invokeStatus) {
            this.invokeStatus = invokeStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInvocationStatusResponseBody build() {
            return new ListInvocationStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInvocationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListInvocationStatusResponseBody</p>
     */
    public static class InvokeInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceInvokeStatus")
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

            private Builder() {
            } 

            private Builder(InvokeInstance model) {
                this.instanceId = model.instanceId;
                this.instanceInvokeStatus = model.instanceInvokeStatus;
            } 

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6abz34m2714bp4****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li>Finished: The running of the node finished.</li>
             * <li>Running: The node is running.</li>
             * <li>Failed: The node failed to run.</li>
             * <li>Stopped: The running of the node stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link ListInvocationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListInvocationStatusResponseBody</p>
     */
    public static class InvokeInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvokeInstance")
        private java.util.List<InvokeInstance> invokeInstance;

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
        public java.util.List<InvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

        public static final class Builder {
            private java.util.List<InvokeInstance> invokeInstance; 

            private Builder() {
            } 

            private Builder(InvokeInstances model) {
                this.invokeInstance = model.invokeInstance;
            } 

            /**
             * InvokeInstance.
             */
            public Builder invokeInstance(java.util.List<InvokeInstance> invokeInstance) {
                this.invokeInstance = invokeInstance;
                return this;
            }

            public InvokeInstances build() {
                return new InvokeInstances(this);
            } 

        } 

    }
}
