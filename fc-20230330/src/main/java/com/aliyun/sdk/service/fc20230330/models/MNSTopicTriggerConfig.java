// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * filterTag.
         */
        public Builder filterTag(String filterTag) {
            this.filterTag = filterTag;
            return this;
        }

        /**
         * notifyContentFormat.
         */
        public Builder notifyContentFormat(String notifyContentFormat) {
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }

        /**
         * notifyStrategy.
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
