// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AIMasterMessage} extends {@link TeaModel}
 *
 * <p>AIMasterMessage</p>
 */
public class AIMasterMessage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extended")
    private String extended;

    @com.aliyun.core.annotation.NameInMap("JobRestartCount")
    private Integer jobRestartCount;

    @com.aliyun.core.annotation.NameInMap("MessageContent")
    private String messageContent;

    @com.aliyun.core.annotation.NameInMap("MessageEvent")
    private String messageEvent;

    @com.aliyun.core.annotation.NameInMap("MessageVersion")
    private Integer messageVersion;

    @com.aliyun.core.annotation.NameInMap("RestartType")
    private String restartType;

    private AIMasterMessage(Builder builder) {
        this.extended = builder.extended;
        this.jobRestartCount = builder.jobRestartCount;
        this.messageContent = builder.messageContent;
        this.messageEvent = builder.messageEvent;
        this.messageVersion = builder.messageVersion;
        this.restartType = builder.restartType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIMasterMessage create() {
        return builder().build();
    }

    /**
     * @return extended
     */
    public String getExtended() {
        return this.extended;
    }

    /**
     * @return jobRestartCount
     */
    public Integer getJobRestartCount() {
        return this.jobRestartCount;
    }

    /**
     * @return messageContent
     */
    public String getMessageContent() {
        return this.messageContent;
    }

    /**
     * @return messageEvent
     */
    public String getMessageEvent() {
        return this.messageEvent;
    }

    /**
     * @return messageVersion
     */
    public Integer getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * @return restartType
     */
    public String getRestartType() {
        return this.restartType;
    }

    public static final class Builder {
        private String extended; 
        private Integer jobRestartCount; 
        private String messageContent; 
        private String messageEvent; 
        private Integer messageVersion; 
        private String restartType; 

        /**
         * Extended.
         */
        public Builder extended(String extended) {
            this.extended = extended;
            return this;
        }

        /**
         * JobRestartCount.
         */
        public Builder jobRestartCount(Integer jobRestartCount) {
            this.jobRestartCount = jobRestartCount;
            return this;
        }

        /**
         * MessageContent.
         */
        public Builder messageContent(String messageContent) {
            this.messageContent = messageContent;
            return this;
        }

        /**
         * MessageEvent.
         */
        public Builder messageEvent(String messageEvent) {
            this.messageEvent = messageEvent;
            return this;
        }

        /**
         * MessageVersion.
         */
        public Builder messageVersion(Integer messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }

        /**
         * RestartType.
         */
        public Builder restartType(String restartType) {
            this.restartType = restartType;
            return this;
        }

        public AIMasterMessage build() {
            return new AIMasterMessage(this);
        } 

    } 

}
