// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetFunctionAsyncInvokeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionAsyncInvokeConfigResponseBody</p>
 */
public class GetFunctionAsyncInvokeConfigResponseBody extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("destinationConfig")
    private DestinationConfig destinationConfig;

    @NameInMap("function")
    private String function;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("maxAsyncEventAgeInSeconds")
    private Long maxAsyncEventAgeInSeconds;

    @NameInMap("maxAsyncRetryAttempts")
    private Long maxAsyncRetryAttempts;

    @NameInMap("qualifier")
    private String qualifier;

    @NameInMap("service")
    private String service;

    @NameInMap("statefulInvocation")
    private Boolean statefulInvocation;


    private GetFunctionAsyncInvokeConfigResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.destinationConfig = builder.destinationConfig;
        this.function = builder.function;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.maxAsyncEventAgeInSeconds = builder.maxAsyncEventAgeInSeconds;
        this.maxAsyncRetryAttempts = builder.maxAsyncRetryAttempts;
        this.qualifier = builder.qualifier;
        this.service = builder.service;
        this.statefulInvocation = builder.statefulInvocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionAsyncInvokeConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return destinationConfig
     */
    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * @return function
     */
    public String getFunction() {
        return this.function;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    /**
     * @return statefulInvocation
     */
    public Boolean getStatefulInvocation() {
        return this.statefulInvocation;
    }

    public static final class Builder {
        private String createdTime; 
        private DestinationConfig destinationConfig; 
        private String function; 
        private String lastModifiedTime; 
        private Long maxAsyncEventAgeInSeconds; 
        private Long maxAsyncRetryAttempts; 
        private String qualifier; 
        private String service; 
        private Boolean statefulInvocation; 

        /**
         * <p>创建时间</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>destinationConfig.</p>
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder function(String function) {
            this.function = function;
            return this;
        }

        /**
         * <p>最后更改时间</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>消息最大存活时长</p>
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * <p>异步调用失败后的最大重试次数</p>
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }

        /**
         * <p>限定符</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>服务名称</p>
         */
        public Builder service(String service) {
            this.service = service;
            return this;
        }

        /**
         * <p>statefulInvocation.</p>
         */
        public Builder statefulInvocation(Boolean statefulInvocation) {
            this.statefulInvocation = statefulInvocation;
            return this;
        }

        public GetFunctionAsyncInvokeConfigResponseBody build() {
            return new GetFunctionAsyncInvokeConfigResponseBody(this);
        } 

    } 

}
