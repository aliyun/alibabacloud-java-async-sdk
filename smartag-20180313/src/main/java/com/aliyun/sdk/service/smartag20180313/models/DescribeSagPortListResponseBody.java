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
 * {@link DescribeSagPortListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagPortListResponseBody</p>
 */
public class DescribeSagPortListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ports")
    private java.util.List<Ports> ports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagPortListResponseBody(Builder builder) {
        this.ports = builder.ports;
        this.requestId = builder.requestId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagPortListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ports
     */
    public java.util.List<Ports> getPorts() {
        return this.ports;
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
        private java.util.List<Ports> ports; 
        private String requestId; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(DescribeSagPortListResponseBody model) {
            this.ports = model.ports;
            this.requestId = model.requestId;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The list of the port information.</p>
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE6642D4-21EB-4168-9BF9-F217953F9892</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagPortListResponseBody build() {
            return new DescribeSagPortListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagPortListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagPortListResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Ports(Builder builder) {
            this.mac = builder.mac;
            this.portName = builder.portName;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String mac; 
            private String portName; 
            private String role; 
            private String status; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.mac = model.mac;
                this.portName = model.portName;
                this.role = model.role;
                this.status = model.status;
            } 

            /**
             * <p>The Mac address of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>c4:00:ad:a2:f5:****</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>The name of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>Port role:</p>
             * <ul>
             * <li><strong>NONE</strong>: No role is assigned to the port.</li>
             * <li><strong>WAN</strong>: The port is used as a WAN port. The WAN port supports a Dynamic Host Configuration Protocol (DHCP) client, PPPoE, or a static IP address to access the Internet.</li>
             * <li><strong>LAN</strong>: The port is used as a LAN port. The LAN port supports a DHCP server or a static IP address to connect to a local terminal or switch.</li>
             * <li><strong>ECC</strong>: The port is used as a leased line port to connect to a leased line.</li>
             * <li><strong>MGT</strong>: The port is used as the management port.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NONE</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Port states:</p>
             * <ul>
             * <li><strong>Up</strong>: The port is enabled.</li>
             * <li><strong>Down</strong>: The port is disabled.</li>
             * <li><strong>Unavailable</strong>: The SAG device is disconnected from Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Down</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagPortListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagPortListResponseBody</p>
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
             * <p>1586762479000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code. 200 indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. Successful indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Asynchronous task states:</p>
             * <ul>
             * <li><strong>Initialized</strong>: The query task is initialized.</li>
             * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. When the SAG device is connected to Alibaba Cloud, Alibaba Cloud continues to assign the query task to the SAG device.</li>
             * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
             * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
             * <li><strong>VersionNotSupport</strong>: not supported by the current version of the SAG device.</li>
             * <li><strong>BuildRequestError</strong>: not supported by the control and management center in the cloud.</li>
             * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. When the SAG device is connected to Alibaba Cloud, Alibaba Cloud does not assign the query task to the SAG device.</li>
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
