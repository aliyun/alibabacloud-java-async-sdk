// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link LogGroup} extends {@link TeaModel}
 *
 * <p>LogGroup</p>
 */
public class LogGroup extends TeaModel {
    @NameInMap("LogTags")
    @Validation(required = true)
    private java.util.List < LogTag > logTags;

    @NameInMap("Logs")
    @Validation(required = true)
    private java.util.List < LogItem > logs;

    @NameInMap("Source")
    private String source;

    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private LogGroup(Builder builder) {
        this.logTags = builder.logTags;
        this.logs = builder.logs;
        this.source = builder.source;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogGroup create() {
        return builder().build();
    }

    /**
     * @return logTags
     */
    public java.util.List < LogTag > getLogTags() {
        return this.logTags;
    }

    /**
     * @return logs
     */
    public java.util.List < LogItem > getLogs() {
        return this.logs;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder {
        private java.util.List < LogTag > logTags; 
        private java.util.List < LogItem > logs; 
        private String source; 
        private String topic; 

        /**
         * LogTags.
         */
        public Builder logTags(java.util.List < LogTag > logTags) {
            this.logTags = logTags;
            return this;
        }

        /**
         * Logs.
         */
        public Builder logs(java.util.List < LogItem > logs) {
            this.logs = logs;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public LogGroup build() {
            return new LogGroup(this);
        } 

    } 

}
