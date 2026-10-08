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
 * {@link PutAsyncInvokeConfigInput} extends {@link TeaModel}
 *
 * <p>PutAsyncInvokeConfigInput</p>
 */
public class PutAsyncInvokeConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("asyncTask")
    private Boolean asyncTask;

    @com.aliyun.core.annotation.NameInMap("destinationConfig")
    private DestinationConfig destinationConfig;

    @com.aliyun.core.annotation.NameInMap("maxAsyncEventAgeInSeconds")
    private Long maxAsyncEventAgeInSeconds;

    @com.aliyun.core.annotation.NameInMap("maxAsyncRetryAttempts")
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

        private Builder() {
        } 

        private Builder(PutAsyncInvokeConfigInput model) {
            this.asyncTask = model.asyncTask;
            this.destinationConfig = model.destinationConfig;
            this.maxAsyncEventAgeInSeconds = model.maxAsyncEventAgeInSeconds;
            this.maxAsyncRetryAttempts = model.maxAsyncRetryAttempts;
        } 

        /**
         * <p>Optional. Specify whether to enable the asynchronous task feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder asyncTask(Boolean asyncTask) {
            this.asyncTask = asyncTask;
            return this;
        }

        /**
         * <p>Optional. The struct of the destination of asynchronous invocations.</p>
         */
        public Builder destinationConfig(DestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * <p>Optional. The maximum validity period of a message. Valid values: [1,604800]. Default value: 86400. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder maxAsyncEventAgeInSeconds(Long maxAsyncEventAgeInSeconds) {
            this.maxAsyncEventAgeInSeconds = maxAsyncEventAgeInSeconds;
            return this;
        }

        /**
         * <p>Optional. The maximum number of retries if an asynchronous invocation fails. Valid values: [0,8]. If you do not configure this parameter, the default number of retries is 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
