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
 * {@link DescribeSagRouteProtocolBgpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagRouteProtocolBgpResponseBody</p>
 */
public class DescribeSagRouteProtocolBgpResponseBody extends TeaModel {
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

    private DescribeSagRouteProtocolBgpResponseBody(Builder builder) {
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

    public static DescribeSagRouteProtocolBgpResponseBody create() {
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

        private Builder(DescribeSagRouteProtocolBgpResponseBody model) {
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
         * <p>The keepalive interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder keepAlive(Integer keepAlive) {
            this.keepAlive = keepAlive;
            return this;
        }

        /**
         * <p>The autonomous system (AS) number of the Smart Access Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        public Builder localAs(Integer localAs) {
            this.localAs = localAs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2F39E4FE-B45C-47FF-9921-95780486F52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The BGP router ID.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder routerId(String routerId) {
            this.routerId = routerId;
            return this;
        }

        /**
         * <p>The status of the query task.</p>
         */
        public Builder taskStates(java.util.List<TaskStates> taskStates) {
            this.taskStates = taskStates;
            return this;
        }

        public DescribeSagRouteProtocolBgpResponseBody build() {
            return new DescribeSagRouteProtocolBgpResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagRouteProtocolBgpResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagRouteProtocolBgpResponseBody</p>
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
             * <p>The timestamp when the query task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1586765938000</p>
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
             * <p>The error message. Successful indicates that the query task succeeded.</p>
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
             * <li><strong>Succeed</strong>: The query task succeeded.</li>
             * <li><strong>Processing</strong>: The query task is being delivered.</li>
             * <li><strong>VersionNotSupport</strong>: The current version of the Smart Access Gateway device does not support this feature.</li>
             * <li><strong>BuildRequestError</strong>: The management and control system does not support the operation.</li>
             * <li><strong>HardwareError</strong>: The query task failed to be delivered due to a device error.</li>
             * <li><strong>TaskNotExist</strong>: The query task does not exist.</li>
             * <li><strong>OfflineNotConfiged</strong>: The Smart Access Gateway device is offline and the query task is not delivered. The task will not be delivered after the device comes online.</li>
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
