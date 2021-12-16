// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketLoggingResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketLoggingResponseBody</p>
 */
public class GetBucketLoggingResponseBody extends TeaModel {
    @ParentIgnore("BucketLoggingStatus")
    @NameInMap("LoggingEnabled")
    private LoggingEnabled loggingEnabled;


    private GetBucketLoggingResponseBody(Builder builder) {
        this.loggingEnabled = builder.loggingEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketLoggingResponseBody create() {
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

        public GetBucketLoggingResponseBody build() {
            return new GetBucketLoggingResponseBody(this);
        } 

    } 

}
