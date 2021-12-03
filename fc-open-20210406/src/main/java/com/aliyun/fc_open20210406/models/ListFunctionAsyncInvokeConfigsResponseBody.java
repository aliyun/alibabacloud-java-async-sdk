// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>异步配置列表</p>
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>下次查询token</p>
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

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
