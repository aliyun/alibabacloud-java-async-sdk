// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChatItem} extends {@link TeaModel}
 *
 * <p>ChatItem</p>
 */
public class ChatItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("answer")
    private String answer;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("folderName")
    private String folderName;

    @com.aliyun.core.annotation.NameInMap("question")
    private String question;

    @com.aliyun.core.annotation.NameInMap("refDocList")
    private java.util.List<ChatRefDocItem> refDocList;

    private ChatItem(Builder builder) {
        this.answer = builder.answer;
        this.createTime = builder.createTime;
        this.folderId = builder.folderId;
        this.folderName = builder.folderName;
        this.question = builder.question;
        this.refDocList = builder.refDocList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return refDocList
     */
    public java.util.List<ChatRefDocItem> getRefDocList() {
        return this.refDocList;
    }

    public static final class Builder {
        private String answer; 
        private Long createTime; 
        private String folderId; 
        private String folderName; 
        private String question; 
        private java.util.List<ChatRefDocItem> refDocList; 

        private Builder() {
        } 

        private Builder(ChatItem model) {
            this.answer = model.answer;
            this.createTime = model.createTime;
            this.folderId = model.folderId;
            this.folderName = model.folderName;
            this.question = model.question;
            this.refDocList = model.refDocList;
        } 

        /**
         * answer.
         */
        public Builder answer(String answer) {
            this.answer = answer;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * folderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * folderName.
         */
        public Builder folderName(String folderName) {
            this.folderName = folderName;
            return this;
        }

        /**
         * question.
         */
        public Builder question(String question) {
            this.question = question;
            return this;
        }

        /**
         * refDocList.
         */
        public Builder refDocList(java.util.List<ChatRefDocItem> refDocList) {
            this.refDocList = refDocList;
            return this;
        }

        public ChatItem build() {
            return new ChatItem(this);
        } 

    } 

}
