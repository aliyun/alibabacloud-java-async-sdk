// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutFunctionAsyncInvokeConfigRequest} extends {@link RequestModel}
 *
 * <p>PutFunctionAsyncInvokeConfigRequest</p>
 */
public class PutFunctionAsyncInvokeConfigRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

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

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private DestinationConfig destinationConfig; 
        private Long maxAsyncEventAgeInSeconds; 
        private Long maxAsyncRetryAttempts; 
        private Boolean statefulInvocation; 
        private String qualifier; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>destinationConfig.</p>
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.putBodyParameter("destinationConfig", destinationConfig);
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * <p>消息最大存活时长</p>
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.putBodyParameter("maxAsyncEventAgeInSeconds", maxAsyncEventAgeInSeconds);
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * <p>异步调用失败后的最大重试次数</p>
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.putBodyParameter("maxAsyncRetryAttempts", maxAsyncRetryAttempts);
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }

        /**
         * <p>statefulInvocation.</p>
         */
        public Builder statefulInvocation(Boolean statefulInvocation) {
            this.putBodyParameter("statefulInvocation", statefulInvocation);
            this.statefulInvocation = statefulInvocation;
            return this;
        }

        /**
         * <p>别名或版本</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        public PutFunctionAsyncInvokeConfigRequest build() {
            return new PutFunctionAsyncInvokeConfigRequest(this);
        } 

    } 

}
