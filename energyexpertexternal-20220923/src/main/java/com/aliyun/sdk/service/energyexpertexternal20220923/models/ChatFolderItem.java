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
 * {@link ChatFolderItem} extends {@link TeaModel}
 *
 * <p>ChatFolderItem</p>
 */
public class ChatFolderItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("folderName")
    private String folderName;

    @com.aliyun.core.annotation.NameInMap("subFolders")
    private java.util.List<ChatItem> subFolders;

    private ChatFolderItem(Builder builder) {
        this.folderId = builder.folderId;
        this.folderName = builder.folderName;
        this.subFolders = builder.subFolders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatFolderItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return subFolders
     */
    public java.util.List<ChatItem> getSubFolders() {
        return this.subFolders;
    }

    public static final class Builder {
        private String folderId; 
        private String folderName; 
        private java.util.List<ChatItem> subFolders; 

        private Builder() {
        } 

        private Builder(ChatFolderItem model) {
            this.folderId = model.folderId;
            this.folderName = model.folderName;
            this.subFolders = model.subFolders;
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
         * subFolders.
         */
        public Builder subFolders(java.util.List<ChatItem> subFolders) {
            this.subFolders = subFolders;
            return this;
        }

        public ChatFolderItem build() {
            return new ChatFolderItem(this);
        } 

    } 

}
