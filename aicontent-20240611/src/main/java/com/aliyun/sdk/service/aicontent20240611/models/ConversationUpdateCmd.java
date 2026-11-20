// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ConversationUpdateCmd} extends {@link TeaModel}
 *
 * <p>ConversationUpdateCmd</p>
 */
public class ConversationUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chatData")
    private String chatData;

    @com.aliyun.core.annotation.NameInMap("messageCount")
    private Integer messageCount;

    @com.aliyun.core.annotation.NameInMap("modelIds")
    private String modelIds;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private ConversationUpdateCmd(Builder builder) {
        this.chatData = builder.chatData;
        this.messageCount = builder.messageCount;
        this.modelIds = builder.modelIds;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConversationUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatData
     */
    public String getChatData() {
        return this.chatData;
    }

    /**
     * @return messageCount
     */
    public Integer getMessageCount() {
        return this.messageCount;
    }

    /**
     * @return modelIds
     */
    public String getModelIds() {
        return this.modelIds;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String chatData; 
        private Integer messageCount; 
        private String modelIds; 
        private String title; 

        private Builder() {
        } 

        private Builder(ConversationUpdateCmd model) {
            this.chatData = model.chatData;
            this.messageCount = model.messageCount;
            this.modelIds = model.modelIds;
            this.title = model.title;
        } 

        /**
         * <p>The conversation data in JSON format, containing message records for each model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;messages&quot;:[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;Hello&quot;}]}</p>
         */
        public Builder chatData(String chatData) {
            this.chatData = chatData;
            return this;
        }

        /**
         * <p>The number of messages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder messageCount(Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        /**
         * <p>The list of model IDs as a JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3]</p>
         */
        public Builder modelIds(String modelIds) {
            this.modelIds = modelIds;
            return this;
        }

        /**
         * <p>The conversation title.</p>
         * 
         * <strong>example:</strong>
         * <p>My conversation</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public ConversationUpdateCmd build() {
            return new ConversationUpdateCmd(this);
        } 

    } 

}
