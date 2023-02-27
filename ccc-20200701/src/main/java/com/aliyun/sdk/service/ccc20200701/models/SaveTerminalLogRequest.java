// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTerminalLogRequest} extends {@link RequestModel}
 *
 * <p>SaveTerminalLogRequest</p>
 */
public class SaveTerminalLogRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("DataType")
    @Validation(required = true, maximum = 100)
    private Integer dataType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("MethodName")
    private String methodName;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("UniqueRequestId")
    @Validation(required = true)
    private String uniqueRequestId;

    private SaveTerminalLogRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.callId = builder.callId;
        this.content = builder.content;
        this.dataType = builder.dataType;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.methodName = builder.methodName;
        this.status = builder.status;
        this.uniqueRequestId = builder.uniqueRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTerminalLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataType
     */
    public Integer getDataType() {
        return this.dataType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return methodName
     */
    public String getMethodName() {
        return this.methodName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uniqueRequestId
     */
    public String getUniqueRequestId() {
        return this.uniqueRequestId;
    }

    public static final class Builder extends Request.Builder<SaveTerminalLogRequest, Builder> {
        private String appName; 
        private String callId; 
        private String content; 
        private Integer dataType; 
        private String instanceId; 
        private String jobId; 
        private String methodName; 
        private String status; 
        private String uniqueRequestId; 

        private Builder() {
            super();
        } 

        private Builder(SaveTerminalLogRequest request) {
            super(request);
            this.appName = request.appName;
            this.callId = request.callId;
            this.content = request.content;
            this.dataType = request.dataType;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.methodName = request.methodName;
            this.status = request.status;
            this.uniqueRequestId = request.uniqueRequestId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(Integer dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MethodName.
         */
        public Builder methodName(String methodName) {
            this.putQueryParameter("MethodName", methodName);
            this.methodName = methodName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UniqueRequestId.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            this.putQueryParameter("UniqueRequestId", uniqueRequestId);
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        @Override
        public SaveTerminalLogRequest build() {
            return new SaveTerminalLogRequest(this);
        } 

    } 

}
