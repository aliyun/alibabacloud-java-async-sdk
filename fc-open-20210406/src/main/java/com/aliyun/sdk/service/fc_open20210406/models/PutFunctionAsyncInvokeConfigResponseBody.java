// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutFunctionAsyncInvokeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>PutFunctionAsyncInvokeConfigResponseBody</p>
 */
public class PutFunctionAsyncInvokeConfigResponseBody extends TeaModel {
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

    private PutFunctionAsyncInvokeConfigResponseBody(Builder builder) {
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

    public static PutFunctionAsyncInvokeConfigResponseBody create() {
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
         * Sat, 14 Jul 2017 07:02:38 GMT
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The trace ID of the invocation request of Function Compute.
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * The name of the function.
         */
        public Builder function(String function) {
            this.function = function;
            return this;
        }

        /**
         * The configuration structure of the destination for asynchronous invocation.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * Specifies whether to enable the asynchronous task feature. 
         * <p>
         * 
         * - **true**: enables the asynchronous task feature. 
         * - **false**: does not enable the asynchronous task feature.
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
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
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * Creates or modifies an asynchronous invocation configuration for a function.
         */
        public Builder service(String service) {
            this.service = service;
            return this;
        }

        /**
         * Jianyi
         */
        public Builder statefulInvocation(Boolean statefulInvocation) {
            this.statefulInvocation = statefulInvocation;
            return this;
        }

        public PutFunctionAsyncInvokeConfigResponseBody build() {
            return new PutFunctionAsyncInvokeConfigResponseBody(this);
        } 

    } 

}
