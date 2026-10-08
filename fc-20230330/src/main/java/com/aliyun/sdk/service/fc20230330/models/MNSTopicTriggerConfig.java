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
 * {@link MNSTopicTriggerConfig} extends {@link TeaModel}
 *
 * <p>MNSTopicTriggerConfig</p>
 */
public class MNSTopicTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filterTag")
    private String filterTag;

    @com.aliyun.core.annotation.NameInMap("notifyContentFormat")
    private String notifyContentFormat;

    @com.aliyun.core.annotation.NameInMap("notifyStrategy")
    private String notifyStrategy;

    private MNSTopicTriggerConfig(Builder builder) {
        this.filterTag = builder.filterTag;
        this.notifyContentFormat = builder.notifyContentFormat;
        this.notifyStrategy = builder.notifyStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MNSTopicTriggerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterTag
     */
    public String getFilterTag() {
        return this.filterTag;
    }

    /**
     * @return notifyContentFormat
     */
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    /**
     * @return notifyStrategy
     */
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public static final class Builder {
        private String filterTag; 
        private String notifyContentFormat; 
        private String notifyStrategy; 

        private Builder() {
        } 

        private Builder(MNSTopicTriggerConfig model) {
            this.filterTag = model.filterTag;
            this.notifyContentFormat = model.notifyContentFormat;
            this.notifyStrategy = model.notifyStrategy;
        } 

        /**
         * <p>The filtering tag. Function execution is triggered only when a message that contains the specified filter tag is received.</p>
         * 
         * <strong>example:</strong>
         * <p>serverless</p>
         */
        public Builder filterTag(String filterTag) {
            this.filterTag = filterTag;
            return this;
        }

        /**
         * <p>The format of the event content. The following two formats are supported:</p>
         * <ul>
         * <li><strong>JSON</strong></li>
         * <li><strong>STREAM</strong></li>
         * </ul>
         * <blockquote>
         * <p> The default format is STREAM.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder notifyContentFormat(String notifyContentFormat) {
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }

        /**
         * <p>The retry policy.</p>
         * <ul>
         * <li><strong>BACKOFF_RETRY</strong>: a backoff retry policy. A total of 3 retries are made. The interval between 2 retries is a random value between 10 and 20 seconds. This is the default value.</li>
         * <li><strong>EXPONENTIAL_DECAY_RETRY</strong>: an exponential decay retry policy. A total of 176 retries are made, with the interval of each retry increases exponentially to 512 seconds, and the total retry period is 1 day. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. For example, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512... 512. The number of 512s is 167.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        public MNSTopicTriggerConfig build() {
            return new MNSTopicTriggerConfig(this);
        } 

    } 

}
