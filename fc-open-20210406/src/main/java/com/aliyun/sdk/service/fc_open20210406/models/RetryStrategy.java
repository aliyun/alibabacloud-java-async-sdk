// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryStrategy} extends {@link TeaModel}
 *
 * <p>RetryStrategy</p>
 */
public class RetryStrategy extends TeaModel {
    @NameInMap("MaximumEventAgeInSeconds")
    private Long maximumEventAgeInSeconds;

    @NameInMap("MaximumRetryAttempts")
    private Long maximumRetryAttempts;

    @NameInMap("PushRetryStrategy")
    private String pushRetryStrategy;

    private RetryStrategy(Builder builder) {
        this.maximumEventAgeInSeconds = builder.maximumEventAgeInSeconds;
        this.maximumRetryAttempts = builder.maximumRetryAttempts;
        this.pushRetryStrategy = builder.pushRetryStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryStrategy create() {
        return builder().build();
    }

    /**
     * @return maximumEventAgeInSeconds
     */
    public Long getMaximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds;
    }

    /**
     * @return maximumRetryAttempts
     */
    public Long getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * @return pushRetryStrategy
     */
    public String getPushRetryStrategy() {
        return this.pushRetryStrategy;
    }

    public static final class Builder {
        private Long maximumEventAgeInSeconds; 
        private Long maximumRetryAttempts; 
        private String pushRetryStrategy; 

        /**
         * MaximumEventAgeInSeconds.
         */
        public Builder maximumEventAgeInSeconds(Long maximumEventAgeInSeconds) {
            this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
            return this;
        }

        /**
         * MaximumRetryAttempts.
         */
        public Builder maximumRetryAttempts(Long maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * PushRetryStrategy.
         */
        public Builder pushRetryStrategy(String pushRetryStrategy) {
            this.pushRetryStrategy = pushRetryStrategy;
            return this;
        }

        public RetryStrategy build() {
            return new RetryStrategy(this);
        } 

    } 

}
