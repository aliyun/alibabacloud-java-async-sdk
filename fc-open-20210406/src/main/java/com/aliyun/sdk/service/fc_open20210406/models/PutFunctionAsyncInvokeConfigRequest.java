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

    @Host
    @NameInMap("AccountID")
    private String accountID;

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
        this.accountID = builder.accountID;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcCodeChecksum = builder.xFcCodeChecksum;
        this.xFcDate = builder.xFcDate;
        this.xFcInvocationType = builder.xFcInvocationType;
        this.xFcLogType = builder.xFcLogType;
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
     * @return accountID
     */
    public String getAccountID() {
        return this.accountID;
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
        private String accountID; 
        private String xFcAccountId; 
        private String xFcCodeChecksum; 
        private String xFcDate; 
        private String xFcInvocationType; 
        private String xFcLogType; 
        private String xFcTraceId; 
        private DestinationConfig destinationConfig; 
        private Long maxAsyncEventAgeInSeconds; 
        private Long maxAsyncRetryAttempts; 
        private Boolean statefulInvocation; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(PutFunctionAsyncInvokeConfigRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.accountID = response.accountID;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcCodeChecksum = response.xFcCodeChecksum;
            this.xFcDate = response.xFcDate;
            this.xFcInvocationType = response.xFcInvocationType;
            this.xFcLogType = response.xFcLogType;
            this.xFcTraceId = response.xFcTraceId;
            this.destinationConfig = response.destinationConfig;
            this.maxAsyncEventAgeInSeconds = response.maxAsyncEventAgeInSeconds;
            this.maxAsyncRetryAttempts = response.maxAsyncRetryAttempts;
            this.statefulInvocation = response.statefulInvocation;
            this.qualifier = response.qualifier;
        } 

        /**
         * 服务名称
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 函数名称
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * AccountID.
         */
        public Builder accountID(String accountID) {
            this.putHostParameter("AccountID", accountID);
            this.accountID = accountID;
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
         * X-Fc-Code-Checksum.
         */
        public Builder xFcCodeChecksum(String xFcCodeChecksum) {
            this.putHeaderParameter("X-Fc-Code-Checksum", xFcCodeChecksum);
            this.xFcCodeChecksum = xFcCodeChecksum;
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
         * X-Fc-Invocation-Type.
         */
        public Builder xFcInvocationType(String xFcInvocationType) {
            this.putHeaderParameter("X-Fc-Invocation-Type", xFcInvocationType);
            this.xFcInvocationType = xFcInvocationType;
            return this;
        }

        /**
         * X-Fc-Log-Type.
         */
        public Builder xFcLogType(String xFcLogType) {
            this.putHeaderParameter("X-Fc-Log-Type", xFcLogType);
            this.xFcLogType = xFcLogType;
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
         * destinationConfig.
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.putBodyParameter("destinationConfig", destinationConfig);
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * 消息最大存活时长
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.putBodyParameter("maxAsyncEventAgeInSeconds", maxAsyncEventAgeInSeconds);
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * 异步调用失败后的最大重试次数
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.putBodyParameter("maxAsyncRetryAttempts", maxAsyncRetryAttempts);
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }

        /**
         * statefulInvocation.
         */
        public Builder statefulInvocation(Boolean statefulInvocation) {
            this.putBodyParameter("statefulInvocation", statefulInvocation);
            this.statefulInvocation = statefulInvocation;
            return this;
        }

        /**
         * 别名或版本
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
