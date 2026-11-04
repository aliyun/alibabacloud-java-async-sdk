// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagExpressConnectInterfaceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagExpressConnectInterfaceListResponseBody</p>
 */
public class DescribeSagExpressConnectInterfaceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Interfaces")
    private java.util.List<Interfaces> interfaces;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagExpressConnectInterfaceListResponseBody(Builder builder) {
        this.interfaces = builder.interfaces;
        this.requestId = builder.requestId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagExpressConnectInterfaceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return interfaces
     */
    public java.util.List<Interfaces> getInterfaces() {
        return this.interfaces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStates
     */
    public java.util.List<TaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static final class Builder {
        private java.util.List<Interfaces> interfaces; 
        private String requestId; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(DescribeSagExpressConnectInterfaceListResponseBody model) {
            this.interfaces = model.interfaces;
            this.requestId = model.requestId;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The list of interface information.</p>
         */
        public Builder interfaces(java.util.List<Interfaces> interfaces) {
            this.interfaces = interfaces;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2718F7A6-EA67-41EF-BA39-E9F4A0F5D306</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagExpressConnectInterfaceListResponseBody build() {
            return new DescribeSagExpressConnectInterfaceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagExpressConnectInterfaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagExpressConnectInterfaceListResponseBody</p>
     */
    public static class Interfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mask")
        private String mask;

        @com.aliyun.core.annotation.NameInMap("Vlan")
        private String vlan;

        private Interfaces(Builder builder) {
            this.ip = builder.ip;
            this.mask = builder.mask;
            this.vlan = builder.vlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Interfaces create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return vlan
         */
        public String getVlan() {
            return this.vlan;
        }

        public static final class Builder {
            private String ip; 
            private String mask; 
            private String vlan; 

            private Builder() {
            } 

            private Builder(Interfaces model) {
                this.ip = model.ip;
                this.mask = model.mask;
                this.vlan = model.vlan;
            } 

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The subnet mask.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.0</p>
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * <p>The VLAN ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder vlan(String vlan) {
                this.vlan = vlan;
                return this;
            }

            public Interfaces build() {
                return new Interfaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagExpressConnectInterfaceListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagExpressConnectInterfaceListResponseBody</p>
     */
    public static class TaskStates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private TaskStates(Builder builder) {
            this.createTime = builder.createTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String createTime; 
            private String errorCode; 
            private String errorMessage; 
            private String state; 

            private Builder() {
            } 

            private Builder(TaskStates model) {
                this.createTime = model.createTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.state = model.state;
            } 

            /**
             * <p>The time when the query task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1586835287000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code. 200 indicates that the query task succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. &quot;Successful&quot; indicates that the query task succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The status of the asynchronous task. Valid values:</p>
             * <ul>
             * <li><strong>Initialized</strong>: The query task is initialized.</li>
             * <li><strong>Offline</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will be delivered after the device comes online.</li>
             * <li><strong>Succeed</strong>: The query task is delivered.</li>
             * <li><strong>Processing</strong>: The query task is being delivered.</li>
             * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this operation.</li>
             * <li><strong>BuildRequestError</strong>: The China Cloud Management Platform does not support this operation.</li>
             * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered even after the device comes online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public TaskStates build() {
                return new TaskStates(this);
            } 

        } 

    }
}
