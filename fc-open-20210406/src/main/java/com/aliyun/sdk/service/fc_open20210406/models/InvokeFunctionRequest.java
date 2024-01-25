// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeFunctionRequest} extends {@link RequestModel}
 *
 * <p>InvokeFunctionRequest</p>
 */
public class InvokeFunctionRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Invocation-Type")
    private String xFcInvocationType;

    @Header
    @NameInMap("X-Fc-Log-Type")
    private String xFcLogType;

    @Header
    @NameInMap("X-Fc-Stateful-Async-Invocation-Enable")
    private String xFcStatefulAsyncInvocationEnable;

    @Header
    @NameInMap("X-Fc-Stateful-Async-Invocation-Id")
    private String xFcStatefulAsyncInvocationId;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("body")
    private byte[] body;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private InvokeFunctionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
        this.xFcStatefulAsyncInvocationEnable = builder.xFcStatefulAsyncInvocationEnable;
        this.xFcStatefulAsyncInvocationId = builder.xFcStatefulAsyncInvocationId;
        this.xFcTraceId = builder.xFcTraceId;
        this.body = builder.body;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcInvocationType
     */
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    /**
     * @return xFcLogType
     */
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    /**
     * @return xFcStatefulAsyncInvocationEnable
     */
    public String getXFcStatefulAsyncInvocationEnable() {
        return this.xFcStatefulAsyncInvocationEnable;
    }

    /**
     * @return xFcStatefulAsyncInvocationId
     */
    public String getXFcStatefulAsyncInvocationId() {
        return this.xFcStatefulAsyncInvocationId;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return body
     */
    public byte[] getBody() {
        return this.body;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<InvokeFunctionRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcStatefulAsyncInvocationEnable; 
        private String xFcStatefulAsyncInvocationId; 
        private String xFcTraceId; 
        private byte[] body; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(InvokeFunctionRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.functionName = request.functionName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcInvocationType = request.xFcInvocationType;
            this.xFcLogType = request.xFcLogType;
            this.xFcStatefulAsyncInvocationEnable = request.xFcStatefulAsyncInvocationEnable;
            this.xFcStatefulAsyncInvocationId = request.xFcStatefulAsyncInvocationId;
            this.xFcTraceId = request.xFcTraceId;
            this.body = request.body;
            this.qualifier = request.qualifier;
        } 

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The name of the function.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the function is invoked. The format is **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The invocation method. Valid values:
         * <p>
         * 
         * *   **Sync**: synchronous invocations
         * *   **Async**: asynchronous invocations
         * 
         * Default value: Sync
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * The method used to return logs. Valid values:
         * <p>
         * 
         * *   **Tail**: returns the last 4 KB of logs that are generated for the current request.
         * *   **None**: No logs are returned for the current request. Default value: None.
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        /**
         * Specifies whether to enable the asynchronous task mode for requests. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > This parameter takes effect only for asynchronous invocations. It does not take effect for synchronous invocations.
         */
        public Builder xFcStatefulAsyncInvocationEnable(String xFcStatefulAsyncInvocationEnable) {
            this.putHeaderParameter("X-Fc-Stateful-Async-Invocation-Enable", xFcStatefulAsyncInvocationEnable);
            this.xFcStatefulAsyncInvocationEnable = xFcStatefulAsyncInvocationEnable;
            return this;
        }

        /**
         * The ID of the asynchronous task. You must enable the asynchronous task feature in advance.
         * <p>
         * 
         * > When you use an SDK to invoke a function, we recommend that you specify a business-related ID to facilitate subsequent operations. For example, you can use the video name as the invocation ID for a video-processing function. This way, you can use the ID to check whether the video is processed or terminate the processing of the video. The ID must start with a letter or an underscore (\_) and can contain letters, digits, underscores (\_), and hyphens (-). The ID can be up to 128 characters in length. If you do not specify the ID of the asynchronous invocation, Function Compute automatically generates an ID.
         */
        public Builder xFcStatefulAsyncInvocationId(String xFcStatefulAsyncInvocationId) {
            this.putHeaderParameter("X-Fc-Stateful-Async-Invocation-Id", xFcStatefulAsyncInvocationId);
            this.xFcStatefulAsyncInvocationId = xFcStatefulAsyncInvocationId;
            return this;
        }

        /**
         * The trace ID of the request for Function Compute API. The value is the same as that of the **requestId** parameter in the response.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The event to be processed by the function. Set this parameter to a binary string. Function Compute passes the event to the function for processing.
         */
        public Builder body(byte[] body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The version or alias of the service.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public InvokeFunctionRequest build() {
            return new InvokeFunctionRequest(this);
        } 

    } 

}
