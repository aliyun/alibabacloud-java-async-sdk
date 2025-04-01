// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link RdAccountFolderDTO} extends {@link TeaModel}
 *
 * <p>RdAccountFolderDTO</p>
 */
public class RdAccountFolderDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountCount")
    private Integer accountCount;

    @com.aliyun.core.annotation.NameInMap("AccountList")
    private java.util.List<RdAccountDTO> accountList;

    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("FolderList")
    private java.util.List<RdAccountFolderDTO> folderList;

    @com.aliyun.core.annotation.NameInMap("FolderName")
    private String folderName;

    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
    private String resourceDirectoryId;

    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryPath")
    private String resourceDirectoryPath;

    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryPathName")
    private String resourceDirectoryPathName;

    @com.aliyun.core.annotation.NameInMap("SelectedCount")
    private Integer selectedCount;

    private RdAccountFolderDTO(Builder builder) {
        this.accountCount = builder.accountCount;
        this.accountList = builder.accountList;
        this.folderId = builder.folderId;
        this.folderList = builder.folderList;
        this.folderName = builder.folderName;
        this.resourceDirectoryId = builder.resourceDirectoryId;
        this.resourceDirectoryPath = builder.resourceDirectoryPath;
        this.resourceDirectoryPathName = builder.resourceDirectoryPathName;
        this.selectedCount = builder.selectedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RdAccountFolderDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountCount
     */
    public Integer getAccountCount() {
        return this.accountCount;
    }

    /**
     * @return accountList
     */
    public java.util.List<RdAccountDTO> getAccountList() {
        return this.accountList;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return folderList
     */
    public java.util.List<RdAccountFolderDTO> getFolderList() {
        return this.folderList;
    }

    /**
     * @return folderName
     */
    public String getFolderName() {
        return this.folderName;
    }

    /**
     * @return resourceDirectoryId
     */
    public String getResourceDirectoryId() {
        return this.resourceDirectoryId;
    }

    /**
     * @return resourceDirectoryPath
     */
    public String getResourceDirectoryPath() {
        return this.resourceDirectoryPath;
    }

    /**
     * @return resourceDirectoryPathName
     */
    public String getResourceDirectoryPathName() {
        return this.resourceDirectoryPathName;
    }

    /**
     * @return selectedCount
     */
    public Integer getSelectedCount() {
        return this.selectedCount;
    }

    public static final class Builder {
        private Integer accountCount; 
        private java.util.List<RdAccountDTO> accountList; 
        private String folderId; 
        private java.util.List<RdAccountFolderDTO> folderList; 
        private String folderName; 
        private String resourceDirectoryId; 
        private String resourceDirectoryPath; 
        private String resourceDirectoryPathName; 
        private Integer selectedCount; 

        private Builder() {
        } 

        private Builder(RdAccountFolderDTO model) {
            this.accountCount = model.accountCount;
            this.accountList = model.accountList;
            this.folderId = model.folderId;
            this.folderList = model.folderList;
            this.folderName = model.folderName;
            this.resourceDirectoryId = model.resourceDirectoryId;
            this.resourceDirectoryPath = model.resourceDirectoryPath;
            this.resourceDirectoryPathName = model.resourceDirectoryPathName;
            this.selectedCount = model.selectedCount;
        } 

        /**
         * AccountCount.
         */
        public Builder accountCount(Integer accountCount) {
            this.accountCount = accountCount;
            return this;
        }

        /**
         * AccountList.
         */
        public Builder accountList(java.util.List<RdAccountDTO> accountList) {
            this.accountList = accountList;
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
         * FolderList.
         */
        public Builder folderList(java.util.List<RdAccountFolderDTO> folderList) {
            this.folderList = folderList;
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
         * ResourceDirectoryId.
         */
        public Builder resourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }

        /**
         * ResourceDirectoryPath.
         */
        public Builder resourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }

        /**
         * ResourceDirectoryPathName.
         */
        public Builder resourceDirectoryPathName(String resourceDirectoryPathName) {
            this.resourceDirectoryPathName = resourceDirectoryPathName;
            return this;
        }

        /**
         * SelectedCount.
         */
        public Builder selectedCount(Integer selectedCount) {
            this.selectedCount = selectedCount;
            return this;
        }

        public RdAccountFolderDTO build() {
            return new RdAccountFolderDTO(this);
        } 

    } 

}
