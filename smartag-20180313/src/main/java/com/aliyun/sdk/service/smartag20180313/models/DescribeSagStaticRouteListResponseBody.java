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
 * {@link DescribeSagStaticRouteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagStaticRouteListResponseBody</p>
 */
public class DescribeSagStaticRouteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StaticRoutes")
    private java.util.List<StaticRoutes> staticRoutes;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagStaticRouteListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.staticRoutes = builder.staticRoutes;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagStaticRouteListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return staticRoutes
     */
    public java.util.List<StaticRoutes> getStaticRoutes() {
        return this.staticRoutes;
    }

    /**
     * @return taskStates
     */
    public java.util.List<TaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StaticRoutes> staticRoutes; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(DescribeSagStaticRouteListResponseBody model) {
            this.requestId = model.requestId;
            this.staticRoutes = model.staticRoutes;
            this.taskStates = model.taskStates;
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
         * <p>The information about the static route.</p>
         */
        public Builder staticRoutes(java.util.List<StaticRoutes> staticRoutes) {
            this.staticRoutes = staticRoutes;
            return this;
        }

        /**
         * <p>The state of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagStaticRouteListResponseBody build() {
            return new DescribeSagStaticRouteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagStaticRouteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagStaticRouteListResponseBody</p>
     */
    public static class StaticRoutes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("Vlan")
        private String vlan;

        private StaticRoutes(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHop = builder.nextHop;
            this.portName = builder.portName;
            this.vlan = builder.vlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticRoutes create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return vlan
         */
        public String getVlan() {
            return this.vlan;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHop; 
            private String portName; 
            private String vlan; 

            private Builder() {
            } 

            private Builder(StaticRoutes model) {
                this.destinationCidr = model.destinationCidr;
                this.nextHop = model.nextHop;
                this.portName = model.portName;
                this.vlan = model.vlan;
            } 

            /**
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.0/24</p>
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
                return this;
            }

            /**
             * <p>The next hop.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The name of the port.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>The VLAN ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vlan(String vlan) {
                this.vlan = vlan;
                return this;
            }

            public StaticRoutes build() {
                return new StaticRoutes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagStaticRouteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagStaticRouteListResponseBody</p>
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
             * <p>1586857309000</p>
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
             * <p>The error message. A value of Successful indicates that the query task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The state of the query task. Valid values:</p>
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
