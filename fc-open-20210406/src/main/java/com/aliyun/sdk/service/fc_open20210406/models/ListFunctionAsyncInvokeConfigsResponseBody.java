// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionAsyncInvokeConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionAsyncInvokeConfigsResponseBody</p>
 */
public class ListFunctionAsyncInvokeConfigsResponseBody extends TeaModel {
    @NameInMap("configs")
    private java.util.List < Configs> configs;

    @NameInMap("nextToken")
    private String nextToken;

    private ListFunctionAsyncInvokeConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionAsyncInvokeConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Configs> configs; 
        private String nextToken; 

        /**
         * The list of asynchronous invocation configurations.
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * The token used to obtain more results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListFunctionAsyncInvokeConfigsResponseBody build() {
            return new ListFunctionAsyncInvokeConfigsResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
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

        private Configs(Builder builder) {
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

        public static Configs create() {
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
             * The time when the application was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The configuration structure of the destination for the asynchronous invocation. If you have not configured this parameter, this parameter is null.
             */
            public Builder destinationConfig(DestinationConfig destinationConfig) {
                this.destinationConfig = destinationConfig;
                return this;
            }

            /**
             * The function name.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The time when the configuration was last modified.
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * The maximum validity period of messages. If you have not configured this parameter, this parameter is null.
             */
            public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
                this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
                return this;
            }

            /**
             * The maximum number of retries allowed after an asynchronous invocation fails. If you have not configured this parameter, this parameter is null.
             */
            public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
                this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
                return this;
            }

            /**
             * The version or alias of the service.
             */
            public Builder qualifier(String qualifier) {
                this.qualifier = qualifier;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * Specifies whether to enable the asynchronous task feature.
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * If you have not configured this parameter, this parameter is null.
             */
            public Builder statefulInvocation(Boolean statefulInvocation) {
                this.statefulInvocation = statefulInvocation;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
