// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAsyncInvokeConfigInput} extends {@link TeaModel}
 *
 * <p>PutAsyncInvokeConfigInput</p>
 */
public class PutAsyncInvokeConfigInput extends TeaModel {
    @NameInMap("asyncTask")
    private Boolean asyncTask;

    @NameInMap("destinationConfig")
    private DestinationConfig destinationConfig;

    @NameInMap("maxAsyncEventAgeInSeconds")
    private Long maxAsyncEventAgeInSeconds;

    @NameInMap("maxAsyncRetryAttempts")
    private Long maxAsyncRetryAttempts;

    private PutAsyncInvokeConfigInput(Builder builder) {
        this.asyncTask = builder.asyncTask;
        this.destinationConfig = builder.destinationConfig;
        this.maxAsyncEventAgeInSeconds = builder.maxAsyncEventAgeInSeconds;
        this.maxAsyncRetryAttempts = builder.maxAsyncRetryAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAsyncInvokeConfigInput create() {
        return builder().build();
    }

    /**
     * @return asyncTask
     */
    public Boolean getAsyncTask() {
        return this.asyncTask;
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

    public static final class Builder {
        private Boolean asyncTask; 
        private DestinationConfig destinationConfig; 
        private Long maxAsyncEventAgeInSeconds; 
        private Long maxAsyncRetryAttempts; 

        /**
         * asyncTask.
         */
        public Builder asyncTask(Boolean asyncTask) {
            this.asyncTask = asyncTask;
            return this;
        }

        /**
         * destinationConfig.
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * maxAsyncEventAgeInSeconds.
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * maxAsyncRetryAttempts.
         */
        public Builder maxAsyncRetryAttempts(Long maxAsyncRetryAttempts) {
            this.maxAsyncRetryAttempts = maxAsyncRetryAttempts;
            return this;
        }

        public PutAsyncInvokeConfigInput build() {
            return new PutAsyncInvokeConfigInput(this);
        } 

    } 

}
