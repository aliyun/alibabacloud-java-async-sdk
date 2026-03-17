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
 * {@link ViewSmartAccessGatewayPortRouteProtocolResponseBody} extends {@link TeaModel}
 *
 * <p>ViewSmartAccessGatewayPortRouteProtocolResponseBody</p>
 */
public class ViewSmartAccessGatewayPortRouteProtocolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ports")
    private java.util.List<Ports> ports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private ViewSmartAccessGatewayPortRouteProtocolResponseBody(Builder builder) {
        this.ports = builder.ports;
        this.requestId = builder.requestId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSmartAccessGatewayPortRouteProtocolResponseBody create() {
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

        private Builder(ViewSmartAccessGatewayPortRouteProtocolResponseBody model) {
            this.ports = model.ports;
            this.requestId = model.requestId;
            this.taskStates = model.taskStates;
        } 

        /**
         * Ports.
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.ports = ports;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskStates.
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public ViewSmartAccessGatewayPortRouteProtocolResponseBody build() {
            return new ViewSmartAccessGatewayPortRouteProtocolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ViewSmartAccessGatewayPortRouteProtocolResponseBody} extends {@link TeaModel}
     *
     * <p>ViewSmartAccessGatewayPortRouteProtocolResponseBody</p>
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
             * NeighborIp.
             */
            public Builder neighborIp(String neighborIp) {
                this.neighborIp = neighborIp;
                return this;
            }

            /**
             * PortName.
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * RemoteAs.
             */
            public Builder remoteAs(String remoteAs) {
                this.remoteAs = remoteAs;
                return this;
            }

            /**
             * RemoteIp.
             */
            public Builder remoteIp(String remoteIp) {
                this.remoteIp = remoteIp;
                return this;
            }

            /**
             * RouteProtocol.
             */
            public Builder routeProtocol(String routeProtocol) {
                this.routeProtocol = routeProtocol;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Vlan.
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
     * {@link ViewSmartAccessGatewayPortRouteProtocolResponseBody} extends {@link TeaModel}
     *
     * <p>ViewSmartAccessGatewayPortRouteProtocolResponseBody</p>
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * State.
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
