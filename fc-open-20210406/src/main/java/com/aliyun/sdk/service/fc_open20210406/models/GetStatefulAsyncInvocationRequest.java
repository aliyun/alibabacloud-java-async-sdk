// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStatefulAsyncInvocationRequest} extends {@link RequestModel}
 *
 * <p>GetStatefulAsyncInvocationRequest</p>
 */
public class GetStatefulAsyncInvocationRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("invocationId")
    @Validation(required = true)
    private String invocationId;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Code-Checksum")
    private String xFcCodeChecksum;

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
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private GetStatefulAsyncInvocationRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.invocationId = builder.invocationId;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
        this.xFcTraceId = builder.xFcTraceId;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStatefulAsyncInvocationRequest create() {
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
     * @return invocationId
     */
    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcCodeChecksum
     */
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
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
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<GetStatefulAsyncInvocationRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String invocationId; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcTraceId; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(GetStatefulAsyncInvocationRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.functionName = request.functionName;
            this.invocationId = request.invocationId;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcCodeChecksum = request.xFcCodeChecksum;
            this.xFcDate = request.xFcDate;
            this.xFcInvocationType = request.xFcInvocationType;
            this.xFcLogType = request.xFcLogType;
            this.xFcTraceId = request.xFcTraceId;
            this.qualifier = request.qualifier;
        } 

        /**
         * The name of service to which the asynchronous tasks belong.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The name of function to which the asynchronous task belongs.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The ID of the asynchronous task.
         * <p>
         * 
         * >  If you use an SDK to invoke a function, we recommend that you specify a business-related ID to facilitate subsequent operations. For example, a video processing function can use video file names as invocation IDs. This way, you can easily check whether a video is successfully processed or terminated before it is processed. The ID must start with a letter or an underscore (\_) and can contain letters, digits (0-9), underscores (\_), and hyphens (-). The ID can be up to 128 characters in length. If you do not specify the ID of an asynchronous invocation, Function Compute automatically generates an ID.
         */
        public Builder invocationId(String invocationId) {
            this.putPathParameter("invocationId", invocationId);
            this.invocationId = invocationId;
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
         * The CRC-64 value of the function code package. This value is used to check data integrity. The value is automatically calculated by a tool.
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
            return this;
        }

        /**
         * The time when the function is invoked. The value is in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The method used to invoke the function. Valid values:
         * <p>
         * 
         * *   **Sync**: synchronous invocation mode
         * *   **Async**: asynchronous invocation mode
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * The method used to return logs. Default value: None. Valid values:
         * <p>
         * 
         * *   **Tail**: returns the last 4 KB of logs that are generated for the current request.
         * *   **None**: does not return logs for the request.
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        /**
         * The trace ID of the request for Function Compute API.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The version or alias of the service to which the asynchronous task belongs.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public GetStatefulAsyncInvocationRequest build() {
            return new GetStatefulAsyncInvocationRequest(this);
        } 

    } 

}
