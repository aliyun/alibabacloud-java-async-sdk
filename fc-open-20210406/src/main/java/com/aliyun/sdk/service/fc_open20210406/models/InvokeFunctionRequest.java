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
        private String xFcStatefulAsyncInvocationId; 
        private String xFcTraceId; 
        private byte[] body; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(InvokeFunctionRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcDate = response.xFcDate;
            this.xFcInvocationType = response.xFcInvocationType;
            this.xFcLogType = response.xFcLogType;
            this.xFcStatefulAsyncInvocationId = response.xFcStatefulAsyncInvocationId;
            this.xFcTraceId = response.xFcTraceId;
            this.body = response.body;
            this.qualifier = response.qualifier;
        } 

        /**
         * service名称
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * function名称
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
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
         * 调用方式:Sync或者Async，默认值：Sync
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * 请求返回日志类型, Tail 为返回函数日志最后 4KB 数据，None 或空值则返回不带有日志，默认为 None
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
            return this;
        }

        /**
         * X-Fc-Stateful-Async-Invocation-Id.
         */
        public Builder xFcStatefulAsyncInvocationId(String xFcStatefulAsyncInvocationId) {
            this.putHeaderParameter("X-Fc-Stateful-Async-Invocation-Id", xFcStatefulAsyncInvocationId);
            this.xFcStatefulAsyncInvocationId = xFcStatefulAsyncInvocationId;
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
         * 事件（event），binary type。函数计算服务将event传递给用户function来处理
         */
        public Builder body(byte[] body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * service版本, 可以是versionId或者aliasName
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
