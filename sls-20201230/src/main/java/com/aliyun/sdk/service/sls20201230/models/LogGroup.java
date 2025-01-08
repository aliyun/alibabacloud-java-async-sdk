// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link LogGroup} extends {@link TeaModel}
 *
 * <p>LogGroup</p>
 */
public class LogGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<LogItem> logItems;

    @com.aliyun.core.annotation.NameInMap("LogTags")
    private java.util.List<LogTag> logTags;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    private LogGroup(Builder builder) {
        this.logItems = builder.logItems;
        this.logTags = builder.logTags;
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
     * @return logItems
     */
    public java.util.List<LogItem> getLogItems() {
        return this.logItems;
    }

    /**
     * @return logTags
     */
    public java.util.List<LogTag> getLogTags() {
        return this.logTags;
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
        private java.util.List<LogItem> logItems; 
        private java.util.List<LogTag> logTags; 
        private String source; 
        private String topic; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder logItems(java.util.List<LogItem> logItems) {
            this.logItems = logItems;
            return this;
        }

        /**
         * LogTags.
         */
        public Builder logTags(java.util.List<LogTag> logTags) {
            this.logTags = logTags;
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
