// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link PullTaskResponseBody} extends {@link TeaModel}
 *
 * <p>PullTaskResponseBody</p>
 */
public class PullTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PullTaskResponseBody(Builder builder) {
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PullTaskResponseBody model) {
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpStatusCode = model.httpStatusCode;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>allowRetry</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>appName</p>
         * 
         * <strong>example:</strong>
         * <p>voldemort-aliyun-com</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>dynamicCode</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>dynamicMessage</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>errorCode</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>errorMsg</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>httpStatusCode</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>9831C9A6-3423-52C2-B0E5-5AE01D92C097</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>success</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PullTaskResponseBody build() {
            return new PullTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PullTaskResponseBody} extends {@link TeaModel}
     *
     * <p>PullTaskResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OutTaskId")
        private String outTaskId;

        @com.aliyun.core.annotation.NameInMap("PrincipalKey")
        private String principalKey;

        @com.aliyun.core.annotation.NameInMap("TaskData")
        private String taskData;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Module(Builder builder) {
            this.bizCode = builder.bizCode;
            this.orderId = builder.orderId;
            this.outTaskId = builder.outTaskId;
            this.principalKey = builder.principalKey;
            this.taskData = builder.taskData;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return outTaskId
         */
        public String getOutTaskId() {
            return this.outTaskId;
        }

        /**
         * @return principalKey
         */
        public String getPrincipalKey() {
            return this.principalKey;
        }

        /**
         * @return taskData
         */
        public String getTaskData() {
            return this.taskData;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String bizCode; 
            private String orderId; 
            private String outTaskId; 
            private String principalKey; 
            private String taskData; 
            private String taskId; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.bizCode = model.bizCode;
                this.orderId = model.orderId;
                this.outTaskId = model.outTaskId;
                this.principalKey = model.principalKey;
                this.taskData = model.taskData;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
            } 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OutTaskId.
             */
            public Builder outTaskId(String outTaskId) {
                this.outTaskId = outTaskId;
                return this;
            }

            /**
             * PrincipalKey.
             */
            public Builder principalKey(String principalKey) {
                this.principalKey = principalKey;
                return this;
            }

            /**
             * TaskData.
             */
            public Builder taskData(String taskData) {
                this.taskData = taskData;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
