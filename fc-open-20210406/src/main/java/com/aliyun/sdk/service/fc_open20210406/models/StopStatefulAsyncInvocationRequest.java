// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStatefulAsyncInvocationRequest} extends {@link RequestModel}
 *
 * <p>StopStatefulAsyncInvocationRequest</p>
 */
public class StopStatefulAsyncInvocationRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Path
    @NameInMap("invocationId")
    private String invocationId;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private StopStatefulAsyncInvocationRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.invocationId = builder.invocationId;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopStatefulAsyncInvocationRequest create() {
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<StopStatefulAsyncInvocationRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String invocationId; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(StopStatefulAsyncInvocationRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.invocationId = response.invocationId;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcDate = response.xFcDate;
            this.xFcTraceId = response.xFcTraceId;
            this.qualifier = response.qualifier;
        } 

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * invocationId.
         */
        public Builder invocationId(String invocationId) {
            this.putPathParameter("invocationId", invocationId);
            this.invocationId = invocationId;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public StopStatefulAsyncInvocationRequest build() {
            return new StopStatefulAsyncInvocationRequest(this);
        } 

    } 

}
