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
 * {@link ViewSmartAccessGatewayOspfRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ViewSmartAccessGatewayOspfRouteResponseBody</p>
 */
public class ViewSmartAccessGatewayOspfRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AreaId")
    private Integer areaId;

    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    private String authenticationType;

    @com.aliyun.core.annotation.NameInMap("DeadTime")
    private Integer deadTime;

    @com.aliyun.core.annotation.NameInMap("HelloTime")
    private Integer helloTime;

    @com.aliyun.core.annotation.NameInMap("Md5Key")
    private String md5Key;

    @com.aliyun.core.annotation.NameInMap("Md5KeyId")
    private Integer md5KeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouterId")
    private String routerId;

    @com.aliyun.core.annotation.NameInMap("TaskStates")
    private java.util.List<TaskStates> taskStates;

    private ViewSmartAccessGatewayOspfRouteResponseBody(Builder builder) {
        this.areaId = builder.areaId;
        this.authenticationType = builder.authenticationType;
        this.deadTime = builder.deadTime;
        this.helloTime = builder.helloTime;
        this.md5Key = builder.md5Key;
        this.md5KeyId = builder.md5KeyId;
        this.requestId = builder.requestId;
        this.routerId = builder.routerId;
        this.taskStates = builder.taskStates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSmartAccessGatewayOspfRouteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaId
     */
    public Integer getAreaId() {
        return this.areaId;
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return deadTime
     */
    public Integer getDeadTime() {
        return this.deadTime;
    }

    /**
     * @return helloTime
     */
    public Integer getHelloTime() {
        return this.helloTime;
    }

    /**
     * @return md5Key
     */
    public String getMd5Key() {
        return this.md5Key;
    }

    /**
     * @return md5KeyId
     */
    public Integer getMd5KeyId() {
        return this.md5KeyId;
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
        private Integer areaId; 
        private String authenticationType; 
        private Integer deadTime; 
        private Integer helloTime; 
        private String md5Key; 
        private Integer md5KeyId; 
        private String requestId; 
        private String routerId; 
        private java.util.List<TaskStates> taskStates; 

        private Builder() {
        } 

        private Builder(ViewSmartAccessGatewayOspfRouteResponseBody model) {
            this.areaId = model.areaId;
            this.authenticationType = model.authenticationType;
            this.deadTime = model.deadTime;
            this.helloTime = model.helloTime;
            this.md5Key = model.md5Key;
            this.md5KeyId = model.md5KeyId;
            this.requestId = model.requestId;
            this.routerId = model.routerId;
            this.taskStates = model.taskStates;
        } 

        /**
         * <p>The ID of the OSPF area.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder areaId(Integer areaId) {
            this.areaId = areaId;
            return this;
        }

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: Authentication is disabled.</li>
         * <li><strong>CLEARTEXT</strong>: Plaintext authentication is used.</li>
         * <li><strong>MD5</strong>: MD5 authentication is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>The timeout period of connections between OSPF peers. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder deadTime(Integer deadTime) {
            this.deadTime = deadTime;
            return this;
        }

        /**
         * <p>The time interval at which Hello packets are sent. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder helloTime(Integer helloTime) {
            this.helloTime = helloTime;
            return this;
        }

        /**
         * <p>The MD5 key value.</p>
         * 
         * <strong>example:</strong>
         * <p>123****</p>
         */
        public Builder md5Key(String md5Key) {
            this.md5Key = md5Key;
            return this;
        }

        /**
         * <p>The ID of the MD5 key.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder md5KeyId(Integer md5KeyId) {
            this.md5KeyId = md5KeyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AA1AE941-84A9-5F83-A955-C8DAF31C2CB8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the router that has OSPF enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1.XX.XX.1</p>
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

        public ViewSmartAccessGatewayOspfRouteResponseBody build() {
            return new ViewSmartAccessGatewayOspfRouteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ViewSmartAccessGatewayOspfRouteResponseBody} extends {@link TeaModel}
     *
     * <p>ViewSmartAccessGatewayOspfRouteResponseBody</p>
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
             * <p>1586843621000</p>
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
