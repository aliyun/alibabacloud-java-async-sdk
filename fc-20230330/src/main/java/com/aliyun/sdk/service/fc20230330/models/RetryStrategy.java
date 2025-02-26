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
 * {@link RetryStrategy} extends {@link TeaModel}
 *
 * <p>RetryStrategy</p>
 */
public class RetryStrategy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PushRetryStrategy")
    private String pushRetryStrategy;

    private RetryStrategy(Builder builder) {
        this.pushRetryStrategy = builder.pushRetryStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryStrategy create() {
        return builder().build();
    }

    /**
     * @return pushRetryStrategy
     */
    public String getPushRetryStrategy() {
        return this.pushRetryStrategy;
    }

    public static final class Builder {
        private String pushRetryStrategy; 

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
