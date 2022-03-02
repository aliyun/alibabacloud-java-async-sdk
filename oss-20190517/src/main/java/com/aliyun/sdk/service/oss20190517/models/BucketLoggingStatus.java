// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link BucketLoggingStatus} extends {@link TeaModel}
 *
 * <p>BucketLoggingStatus</p>
 */
public class BucketLoggingStatus extends TeaModel {
    @NameInMap("LoggingEnabled")
    @Validation(required = true)
    private LoggingEnabled loggingEnabled;

    private BucketLoggingStatus(Builder builder) {
        this.loggingEnabled = builder.loggingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BucketLoggingStatus create() {
        return builder().build();
    }

    /**
     * @return loggingEnabled
     */
    public LoggingEnabled getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public static final class Builder {
        private LoggingEnabled loggingEnabled; 

        /**
         * LoggingEnabled.
         */
        public Builder loggingEnabled(LoggingEnabled loggingEnabled) {
            this.loggingEnabled = loggingEnabled;
            return this;
        }

        public BucketLoggingStatus build() {
            return new BucketLoggingStatus(this);
        } 

    } 

}
