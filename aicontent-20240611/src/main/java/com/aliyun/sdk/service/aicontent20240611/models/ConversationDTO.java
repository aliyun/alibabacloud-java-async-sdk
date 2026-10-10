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
 * {@link ConversationDTO} extends {@link TeaModel}
 *
 * <p>ConversationDTO</p>
 */
public class ConversationDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chatData")
    private String chatData;

    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private Integer deleteTag;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("messageCount")
    private Integer messageCount;

    @com.aliyun.core.annotation.NameInMap("modelIds")
    private String modelIds;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private ConversationDTO(Builder builder) {
        this.chatData = builder.chatData;
        this.deleteTag = builder.deleteTag;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.messageCount = builder.messageCount;
        this.modelIds = builder.modelIds;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConversationDTO create() {
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
     * @return deleteTag
     */
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
        private Integer deleteTag; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Integer messageCount; 
        private String modelIds; 
        private String title; 

        private Builder() {
        } 

        private Builder(ConversationDTO model) {
            this.chatData = model.chatData;
            this.deleteTag = model.deleteTag;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.messageCount = model.messageCount;
            this.modelIds = model.modelIds;
            this.title = model.title;
        } 

        /**
         * <p>A JSON-formatted string that represents the complete state of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder chatData(String chatData) {
            this.chatData = chatData;
            return this;
        }

        /**
         * <p>The status of the conversation, where 0 means enabled and any non-zero value means disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * <p>The creation time of the conversation, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The modification time of the conversation, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The ID of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The total number of messages in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder messageCount(Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        /**
         * <p>A JSON-formatted string that contains an array of model IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3]</p>
         */
        public Builder modelIds(String modelIds) {
            this.modelIds = modelIds;
            return this;
        }

        /**
         * <p>The title of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>我的对话</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public ConversationDTO build() {
            return new ConversationDTO(this);
        } 

    } 

}
