// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Log4jLogger} extends {@link TeaModel}
 *
 * <p>Log4jLogger</p>
 */
public class Log4jLogger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("loggerLevel")
    private String loggerLevel;

    @com.aliyun.core.annotation.NameInMap("loggerName")
    private String loggerName;

    private Log4jLogger(Builder builder) {
        this.loggerLevel = builder.loggerLevel;
        this.loggerName = builder.loggerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Log4jLogger create() {
        return builder().build();
    }

    /**
     * @return loggerLevel
     */
    public String getLoggerLevel() {
        return this.loggerLevel;
    }

    /**
     * @return loggerName
     */
    public String getLoggerName() {
        return this.loggerName;
    }

    public static final class Builder {
        private String loggerLevel; 
        private String loggerName; 

        /**
         * loggerLevel.
         */
        public Builder loggerLevel(String loggerLevel) {
            this.loggerLevel = loggerLevel;
            return this;
        }

        /**
         * loggerName.
         */
        public Builder loggerName(String loggerName) {
            this.loggerName = loggerName;
            return this;
        }

        public Log4jLogger build() {
            return new Log4jLogger(this);
        } 

    } 

}
