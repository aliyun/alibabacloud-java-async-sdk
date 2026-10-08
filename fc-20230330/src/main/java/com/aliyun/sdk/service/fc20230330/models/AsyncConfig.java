// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AsyncConfig} extends {@link TeaModel}
 *
 * <p>AsyncConfig</p>
 */
public class AsyncConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("asyncTask")
    private Boolean asyncTask;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("destinationConfig")
    private DestinationConfig destinationConfig;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("maxAsyncEventAgeInSeconds")
    private Long maxAsyncEventAgeInSeconds;

    @com.aliyun.core.annotation.NameInMap("maxAsyncRetryAttempts")
    private Long maxAsyncRetryAttempts;

    private AsyncConfig(Builder builder) {
        this.asyncTask = builder.asyncTask;
        this.createdTime = builder.createdTime;
        this.destinationConfig = builder.destinationConfig;
        this.functionArn = builder.functionArn;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.maxAsyncEventAgeInSeconds = builder.maxAsyncEventAgeInSeconds;
        this.maxAsyncRetryAttempts = builder.maxAsyncRetryAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTask
     */
    public Boolean getAsyncTask() {
        return this.asyncTask;
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
     * @return functionArn
     */
    public String getFunctionArn() {
        return this.functionArn;
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

    public static final class Builder {
        private Boolean asyncTask; 
        private String createdTime; 
        private DestinationConfig destinationConfig; 
        private String functionArn; 
        private String lastModifiedTime; 
        private Long maxAsyncEventAgeInSeconds; 
        private Long maxAsyncRetryAttempts; 

        private Builder() {
        } 

        private Builder(AsyncConfig model) {
            this.asyncTask = model.asyncTask;
            this.createdTime = model.createdTime;
            this.destinationConfig = model.destinationConfig;
            this.functionArn = model.functionArn;
            this.lastModifiedTime = model.lastModifiedTime;
            this.maxAsyncEventAgeInSeconds = model.maxAsyncEventAgeInSeconds;
            this.maxAsyncRetryAttempts = model.maxAsyncRetryAttempts;
        } 

        /**
         * <p>Specifies whether to enable the asynchronous task feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder asyncTask(Boolean asyncTask) {
            this.asyncTask = asyncTask;
            return this;
        }

        /**
         * <p>The time when the asynchronous invocation configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z07:00</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The destination configuration.</p>
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:1234/functions/my-func</p>
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * <p>The time when the asynchronous invocation was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2006-01-02T15:04:05Z07:00</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The maximum time to live (TTL) value of an event.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * <p>The number of times when an asynchronous invocation is retried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }

        public AsyncConfig build() {
            return new AsyncConfig(this);
        } 

    } 

}
