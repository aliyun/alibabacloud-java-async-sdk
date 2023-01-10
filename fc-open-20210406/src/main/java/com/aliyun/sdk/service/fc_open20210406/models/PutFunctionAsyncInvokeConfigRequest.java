// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutFunctionAsyncInvokeConfigRequest} extends {@link RequestModel}
 *
 * <p>PutFunctionAsyncInvokeConfigRequest</p>
 */
public class PutFunctionAsyncInvokeConfigRequest extends Request {
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
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("destinationConfig")
    private DestinationConfig destinationConfig;

    @Body
    @NameInMap("maxAsyncEventAgeInSeconds")
    private Long maxAsyncEventAgeInSeconds;

    @Body
    @NameInMap("maxAsyncRetryAttempts")
    private Long maxAsyncRetryAttempts;

    @Body
    @NameInMap("statefulInvocation")
    private Boolean statefulInvocation;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private PutFunctionAsyncInvokeConfigRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.destinationConfig = builder.destinationConfig;
        this.maxAsyncEventAgeInSeconds = builder.maxAsyncEventAgeInSeconds;
        this.maxAsyncRetryAttempts = builder.maxAsyncRetryAttempts;
        this.statefulInvocation = builder.statefulInvocation;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutFunctionAsyncInvokeConfigRequest create() {
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
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return destinationConfig
     */
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * @return maxAsyncEventAgeInSeconds
     */
    public Long getMaxAsyncEventAgeInSeconds() {
        return this.maxAsyncEventAgeInSeconds;
    }

    /**
     * @return maxAsyncRetryAttempts
     */
    public Long getMaxAsyncRetryAttempts() {
        return this.maxAsyncRetryAttempts;
    }

    /**
     * @return statefulInvocation
     */
    public Boolean getStatefulInvocation() {
        return this.statefulInvocation;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<PutFunctionAsyncInvokeConfigRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private DestinationConfig destinationConfig; 
        private Long maxAsyncEventAgeInSeconds; 
        private Long maxAsyncRetryAttempts; 
        private Boolean statefulInvocation; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(PutFunctionAsyncInvokeConfigRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.functionName = request.functionName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.destinationConfig = request.destinationConfig;
            this.maxAsyncEventAgeInSeconds = request.maxAsyncEventAgeInSeconds;
            this.maxAsyncRetryAttempts = request.maxAsyncRetryAttempts;
            this.statefulInvocation = request.statefulInvocation;
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
         * The time when Function Compute API is called. Specify the time in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The trace ID of the invocation request of Function Compute.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The configuration structure of the destination for asynchronous invocation.
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.putBodyParameter("destinationConfig", destinationConfig);
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * The maximum validity period of messages. Valid values: 1 to 2592000. Unit: seconds.
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.putBodyParameter("maxAsyncEventAgeInSeconds", maxAsyncEventAgeInSeconds);
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * The maximum number of retries allowed after an asynchronous invocation fails. Default value: 3. Valid values: 0 to 8.
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.putBodyParameter("maxAsyncRetryAttempts", maxAsyncRetryAttempts);
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }

        /**
         * Specifies whether to enable the asynchronous task feature. 
         * <p>
         * 
         * - **true**: enables the asynchronous task feature. 
         * - **false**: does not enable the asynchronous task feature.
         */
        public Builder statefulInvocation(Boolean statefulInvocation) {
            this.putBodyParameter("statefulInvocation", statefulInvocation);
            this.statefulInvocation = statefulInvocation;
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
        public PutFunctionAsyncInvokeConfigRequest build() {
            return new PutFunctionAsyncInvokeConfigRequest(this);
        } 

    } 

}
