// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MnsTopicTriggerConfig} extends {@link TeaModel}
 *
 * <p>MnsTopicTriggerConfig</p>
 */
public class MnsTopicTriggerConfig extends TeaModel {
    @NameInMap("filterTag")
    private String filterTag;

    @NameInMap("notifyContentFormat")
    private String notifyContentFormat;

    @NameInMap("notifyStrategy")
    private String notifyStrategy;

    private MnsTopicTriggerConfig(Builder builder) {
        this.filterTag = builder.filterTag;
        this.notifyContentFormat = builder.notifyContentFormat;
        this.notifyStrategy = builder.notifyStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MnsTopicTriggerConfig create() {
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

        public MnsTopicTriggerConfig build() {
            return new MnsTopicTriggerConfig(this);
        } 

    } 

}
