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
 * {@link ViewSmartAccessGatewayBgpRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ViewSmartAccessGatewayBgpRouteResponseBody</p>
 */
public class ViewSmartAccessGatewayBgpRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HoldTime")
    private Integer holdTime;

    @com.aliyun.core.annotation.NameInMap("KeepAlive")
    private Integer keepAlive;

    @com.aliyun.core.annotation.NameInMap("LocalAs")
    private Integer localAs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouterId")
    private String routerId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private ViewSmartAccessGatewayBgpRouteResponseBody(Builder builder) {
        this.holdTime = builder.holdTime;
        this.keepAlive = builder.keepAlive;
        this.localAs = builder.localAs;
        this.requestId = builder.requestId;
        this.routerId = builder.routerId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSmartAccessGatewayBgpRouteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return holdTime
     */
    public Integer getHoldTime() {
        return this.holdTime;
    }

    /**
     * @return keepAlive
     */
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    /**
     * @return localAs
     */
    public Integer getLocalAs() {
        return this.localAs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routerId
     */
    public String getRouterId() {
        return this.routerId;
    }

    /**
     * @return taskStates
     */
    public java.util.List<TaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static final class Builder {
        private Integer holdTime; 
        private Integer keepAlive; 
        private Integer localAs; 
        private String requestId; 
        private String routerId; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(ViewSmartAccessGatewayBgpRouteResponseBody model) {
            this.holdTime = model.holdTime;
            this.keepAlive = model.keepAlive;
            this.localAs = model.localAs;
            this.requestId = model.requestId;
            this.routerId = model.routerId;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The hold time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder holdTime(Integer holdTime) {
            this.holdTime = holdTime;
            return this;
        }

        /**
         * <p>The time interval at which keep-alive packets are sent. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder keepAlive(Integer keepAlive) {
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * <p>The autonomous system number (ASN) to which the SAG device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder localAs(Integer localAs) {
            this.localAs = localAs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F1FEABC0-F7B7-53EA-83EE-AA470ABACE60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the BGP router.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder routerId(String routerId) {
            this.routerId = routerId;
            return this;
        }

        /**
         * <p>The status of the task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public ViewSmartAccessGatewayBgpRouteResponseBody build() {
            return new ViewSmartAccessGatewayBgpRouteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ViewSmartAccessGatewayBgpRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ViewSmartAccessGatewayBgpRouteResponseBody</p>
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
             * <p>The timestamp when the task was created. Unit: milliseconds.</p>
             * <p>The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1586855592000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error code. A value of 200 indicates that the task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. A value of Successful indicates that the task is successful.</p>
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
