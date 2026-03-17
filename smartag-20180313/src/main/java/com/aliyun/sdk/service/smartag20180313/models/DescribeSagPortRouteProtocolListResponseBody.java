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
 * {@link DescribeSagPortRouteProtocolListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagPortRouteProtocolListResponseBody</p>
 */
public class DescribeSagPortRouteProtocolListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ports")
    private java.util.List<Ports> ports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagPortRouteProtocolListResponseBody(Builder builder) {
        this.ports = builder.ports;
        this.requestId = builder.requestId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagPortRouteProtocolListResponseBody create() {
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

        private Builder(DescribeSagPortRouteProtocolListResponseBody model) {
            this.ports = model.ports;
            this.requestId = model.requestId;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>An array that consists of the details of the port.</p>
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
         * <p>The details about the status of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagPortRouteProtocolListResponseBody build() {
            return new DescribeSagPortRouteProtocolListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagPortRouteProtocolListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagPortRouteProtocolListResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NeighborIp")
        private String neighborIp;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("RemoteAs")
        private String remoteAs;

        @com.aliyun.core.annotation.NameInMap("RemoteIp")
        private String remoteIp;

        @com.aliyun.core.annotation.NameInMap("RouteProtocol")
        private String routeProtocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Vlan")
        private String vlan;

        private Ports(Builder builder) {
            this.neighborIp = builder.neighborIp;
            this.portName = builder.portName;
            this.remoteAs = builder.remoteAs;
            this.remoteIp = builder.remoteIp;
            this.routeProtocol = builder.routeProtocol;
            this.status = builder.status;
            this.vlan = builder.vlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return neighborIp
         */
        public String getNeighborIp() {
            return this.neighborIp;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return remoteAs
         */
        public String getRemoteAs() {
            return this.remoteAs;
        }

        /**
         * @return remoteIp
         */
        public String getRemoteIp() {
            return this.remoteIp;
        }

        /**
         * @return routeProtocol
         */
        public String getRouteProtocol() {
            return this.routeProtocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vlan
         */
        public String getVlan() {
            return this.vlan;
        }

        public static final class Builder {
            private String neighborIp; 
            private String portName; 
            private String remoteAs; 
            private String remoteIp; 
            private String routeProtocol; 
            private String status; 
            private String vlan; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.neighborIp = model.neighborIp;
                this.portName = model.portName;
                this.remoteAs = model.remoteAs;
                this.remoteIp = model.remoteIp;
                this.routeProtocol = model.routeProtocol;
                this.status = model.status;
                this.vlan = model.vlan;
            } 

            /**
             * <p>The IP address of the neighbor device.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder neighborIp(String neighborIp) {
                this.neighborIp = neighborIp;
                return this;
            }

            /**
             * <p>The name of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>The number of the autonomous system (AS) to which the SAG device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder remoteAs(String remoteAs) {
                this.remoteAs = remoteAs;
                return this;
            }

            /**
             * <p>The IP address of the peer device.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder remoteIp(String remoteIp) {
                this.remoteIp = remoteIp;
                return this;
            }

            /**
             * <p>The routing protocol. Valid values:</p>
             * <ul>
             * <li><strong>STATIC</strong>: static routing protocol</li>
             * <li><strong>OSPF</strong>: Open Shortest Path First protocol (OSPF)</li>
             * <li><strong>BGP</strong>: Border Gateway Protocol (BGP)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder routeProtocol(String routeProtocol) {
                this.routeProtocol = routeProtocol;
                return this;
            }

            /**
             * <p>The status of the port. Valid values:</p>
             * <ul>
             * <li><strong>UP</strong>: The port was enabled.</li>
             * <li><strong>DOWN</strong>: The port was disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UP</p>
             */
            public Builder status(String status) {
                this.status = status;
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

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagPortRouteProtocolListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagPortRouteProtocolListResponseBody</p>
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
             * <p>1586843621000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code returned. A value of 200 indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned. A value of Successful indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The status of the query task. Valid values:</p>
             * <ul>
             * <li><strong>Initialized</strong>: The query task is initialized.</li>
             * <li><strong>Offline</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. After the SAG device is connected to Alibaba Cloud, Alibaba Cloud assigns the query task to the SAG device.</li>
             * <li><strong>Succeed</strong>: Alibaba Cloud has assigned the query task to the SAG device.</li>
             * <li><strong>Processing</strong>: Alibaba Cloud is assigning the query task to the SAG device.</li>
             * <li><strong>VersionNotSupport</strong>: The query task is not supported by the current version of the SAG device.</li>
             * <li><strong>BuildRequestError</strong>: The query task is not supported by the controller of the SAG device.</li>
             * <li><strong>HardwareError</strong>: Alibaba Cloud failed to assign the query task to the SAG device because the SAG device is faulty.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The SAG device is disconnected from Alibaba Cloud and Alibaba Cloud has not assigned the query task to the SAG device. Alibaba Cloud does not assign the query task to the SAG device even after the SAG device is connected to Alibaba Cloud.</li>
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
