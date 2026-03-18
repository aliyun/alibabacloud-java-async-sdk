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
         * chatData.
         */
        public Builder chatData(String chatData) {
            this.chatData = chatData;
            return this;
        }

        /**
         * deleteTag.
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * messageCount.
         */
        public Builder messageCount(Integer messageCount) {
            this.messageCount = messageCount;
            return this;
        }

        /**
         * modelIds.
         */
        public Builder modelIds(String modelIds) {
            this.modelIds = modelIds;
            return this;
        }

        /**
         * title.
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
