// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeBenchmarkTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBenchmarkTaskResponseBody</p>
 */
public class DescribeBenchmarkTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAgent")
    private Long availableAgent;

    @com.aliyun.core.annotation.NameInMap("CallerUid")
    private String callerUid;

    @com.aliyun.core.annotation.NameInMap("DesiredAgent")
    private Long desiredAgent;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ParentUid")
    private String parentUid;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private DescribeBenchmarkTaskResponseBody(Builder builder) {
        this.availableAgent = builder.availableAgent;
        this.callerUid = builder.callerUid;
        this.desiredAgent = builder.desiredAgent;
        this.endpoint = builder.endpoint;
        this.message = builder.message;
        this.parentUid = builder.parentUid;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBenchmarkTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableAgent
     */
    public Long getAvailableAgent() {
        return this.availableAgent;
    }

    /**
     * @return callerUid
     */
    public String getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return desiredAgent
     */
    public Long getDesiredAgent() {
        return this.desiredAgent;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private Long availableAgent; 
        private String callerUid; 
        private Long desiredAgent; 
        private String endpoint; 
        private String message; 
        private String parentUid; 
        private String reason; 
        private String requestId; 
        private String serviceName; 
        private String status; 
        private String taskId; 
        private String taskName; 
        private String token; 

        private Builder() {
        } 

        private Builder(DescribeBenchmarkTaskResponseBody model) {
            this.availableAgent = model.availableAgent;
            this.callerUid = model.callerUid;
            this.desiredAgent = model.desiredAgent;
            this.endpoint = model.endpoint;
            this.message = model.message;
            this.parentUid = model.parentUid;
            this.reason = model.reason;
            this.requestId = model.requestId;
            this.serviceName = model.serviceName;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.token = model.token;
        } 

        /**
         * <p>The number of instances that you can test.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder availableAgent(Long availableAgent) {
            this.availableAgent = availableAgent;
            return this;
        }

        /**
         * <p>The ID of the operation caller.</p>
         * 
         * <strong>example:</strong>
         * <p>1640133467****</p>
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * <p>The number of instances that you want to test.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder desiredAgent(Long desiredAgent) {
            this.desiredAgent = desiredAgent;
            return this;
        }

        /**
         * <p>The endpoint of the service gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>192342311234.pai-eas.cn-chengdu.aliyuncs.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Benchmar task is Running</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used to call the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1029728669****</p>
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * <p>The event or reason that causes the current state of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the service that you want to test.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The state of the stress testing task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Creating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Starting</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DeleteFailed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Running</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Stopping</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Error</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Updating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Deleting</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CreateFailed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-b-gv4y86u****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The name of the stress testing task.</p>
         * 
         * <strong>example:</strong>
         * <p>benchmark-larec-test-ae70</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The token for authentication when a stress testing task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>6062787a-9301****</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public DescribeBenchmarkTaskResponseBody build() {
            return new DescribeBenchmarkTaskResponseBody(this);
        } 

    } 

}
