// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link BucketLoggingStatus} extends {@link TeaModel}
 *
 * <p>BucketLoggingStatus</p>
 */
public class BucketLoggingStatus extends TeaModel {
    @NameInMap("LoggingEnabled")
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
         * <p>LoggingEnabled.</p>
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
