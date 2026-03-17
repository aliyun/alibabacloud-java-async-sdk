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
 * {@link DescribeSagGlobalRouteProtocolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagGlobalRouteProtocolResponseBody</p>
 */
public class DescribeSagGlobalRouteProtocolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteProtocol")
    private String routeProtocol;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private DescribeSagGlobalRouteProtocolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeProtocol = builder.routeProtocol;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagGlobalRouteProtocolResponseBody create() {
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
     * @return routeProtocol
     */
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    /**
     * @return taskStates
     */
    public java.util.List<TaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static final class Builder {
        private String requestId; 
        private String routeProtocol; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(DescribeSagGlobalRouteProtocolResponseBody model) {
            this.requestId = model.requestId;
            this.routeProtocol = model.routeProtocol;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3712F0B2-721E-4FBF-BBEF-888E3BFE0A20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The routing protocol. Valid values:</p>
         * <ul>
         * <li><strong>STATIC</strong>: static routing</li>
         * <li><strong>OSPF</strong>: Open Shortest Path First protocol (OSPF)</li>
         * <li><strong>BGP</strong>: Border Gateway Protocol (BGP)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        public Builder routeProtocol(String routeProtocol) {
            this.routeProtocol = routeProtocol;
            return this;
        }

        /**
         * <p>The state of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagGlobalRouteProtocolResponseBody build() {
            return new DescribeSagGlobalRouteProtocolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagGlobalRouteProtocolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagGlobalRouteProtocolResponseBody</p>
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
             * <p>The timestamp that indicates the time when the query task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1586855592000</p>
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
