// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ResourceDirectoryFolderNode} extends {@link TeaModel}
 *
 * <p>ResourceDirectoryFolderNode</p>
 */
public class ResourceDirectoryFolderNode extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List<ResourceDirectoryFolderNode> children;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("FolderName")
    private String folderName;

    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    private ResourceDirectoryFolderNode(Builder builder) {
        this.accountId = builder.accountId;
        this.children = builder.children;
        this.displayName = builder.displayName;
        this.folderId = builder.folderId;
        this.folderName = builder.folderName;
        this.parentFolderId = builder.parentFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceDirectoryFolderNode create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return children
     */
    public java.util.List<ResourceDirectoryFolderNode> getChildren() {
        return this.children;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public static final class Builder {
        private String accountId; 
        private java.util.List<ResourceDirectoryFolderNode> children; 
        private String displayName; 
        private String folderId; 
        private String folderName; 
        private String parentFolderId; 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(java.util.List<ResourceDirectoryFolderNode> children) {
            this.children = children;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * FolderName.
         */
        public Builder folderName(String folderName) {
            this.folderName = folderName;
            return this;
        }

        /**
         * ParentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }

        public ResourceDirectoryFolderNode build() {
            return new ResourceDirectoryFolderNode(this);
        } 

    } 

}
