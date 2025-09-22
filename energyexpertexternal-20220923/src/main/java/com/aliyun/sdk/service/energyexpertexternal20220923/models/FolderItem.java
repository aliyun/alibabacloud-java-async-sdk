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
 * {@link FolderItem} extends {@link TeaModel}
 *
 * <p>FolderItem</p>
 */
public class FolderItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentLevel")
    private Integer currentLevel;

    @com.aliyun.core.annotation.NameInMap("docCount")
    private Integer docCount;

    @com.aliyun.core.annotation.NameInMap("folderDefault")
    private Integer folderDefault;

    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("folderName")
    private String folderName;

    @com.aliyun.core.annotation.NameInMap("folderNum")
    private Integer folderNum;

    @com.aliyun.core.annotation.NameInMap("ossDomain")
    private String ossDomain;

    @com.aliyun.core.annotation.NameInMap("ossPath")
    private String ossPath;

    @com.aliyun.core.annotation.NameInMap("ossUpdateBy")
    private String ossUpdateBy;

    @com.aliyun.core.annotation.NameInMap("parentFolderId")
    private String parentFolderId;

    @com.aliyun.core.annotation.NameInMap("resourcePath")
    private String resourcePath;

    @com.aliyun.core.annotation.NameInMap("storageType")
    private Integer storageType;

    @com.aliyun.core.annotation.NameInMap("subFolderList")
    private java.util.List<FolderItem> subFolderList;

    @com.aliyun.core.annotation.NameInMap("syncParsingStatus")
    private Integer syncParsingStatus;

    @com.aliyun.core.annotation.NameInMap("syncStatus")
    private Integer syncStatus;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private FolderItem(Builder builder) {
        this.currentLevel = builder.currentLevel;
        this.docCount = builder.docCount;
        this.folderDefault = builder.folderDefault;
        this.folderId = builder.folderId;
        this.folderName = builder.folderName;
        this.folderNum = builder.folderNum;
        this.ossDomain = builder.ossDomain;
        this.ossPath = builder.ossPath;
        this.ossUpdateBy = builder.ossUpdateBy;
        this.parentFolderId = builder.parentFolderId;
        this.resourcePath = builder.resourcePath;
        this.storageType = builder.storageType;
        this.subFolderList = builder.subFolderList;
        this.syncParsingStatus = builder.syncParsingStatus;
        this.syncStatus = builder.syncStatus;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FolderItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentLevel
     */
    public Integer getCurrentLevel() {
        return this.currentLevel;
    }

    /**
     * @return docCount
     */
    public Integer getDocCount() {
        return this.docCount;
    }

    /**
     * @return folderDefault
     */
    public Integer getFolderDefault() {
        return this.folderDefault;
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
     * @return folderNum
     */
    public Integer getFolderNum() {
        return this.folderNum;
    }

    /**
     * @return ossDomain
     */
    public String getOssDomain() {
        return this.ossDomain;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
    }

    /**
     * @return ossUpdateBy
     */
    public String getOssUpdateBy() {
        return this.ossUpdateBy;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return resourcePath
     */
    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * @return storageType
     */
    public Integer getStorageType() {
        return this.storageType;
    }

    /**
     * @return subFolderList
     */
    public java.util.List<FolderItem> getSubFolderList() {
        return this.subFolderList;
    }

    /**
     * @return syncParsingStatus
     */
    public Integer getSyncParsingStatus() {
        return this.syncParsingStatus;
    }

    /**
     * @return syncStatus
     */
    public Integer getSyncStatus() {
        return this.syncStatus;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Integer currentLevel; 
        private Integer docCount; 
        private Integer folderDefault; 
        private String folderId; 
        private String folderName; 
        private Integer folderNum; 
        private String ossDomain; 
        private String ossPath; 
        private String ossUpdateBy; 
        private String parentFolderId; 
        private String resourcePath; 
        private Integer storageType; 
        private java.util.List<FolderItem> subFolderList; 
        private Integer syncParsingStatus; 
        private Integer syncStatus; 
        private Long taskId; 

        private Builder() {
        } 

        private Builder(FolderItem model) {
            this.currentLevel = model.currentLevel;
            this.docCount = model.docCount;
            this.folderDefault = model.folderDefault;
            this.folderId = model.folderId;
            this.folderName = model.folderName;
            this.folderNum = model.folderNum;
            this.ossDomain = model.ossDomain;
            this.ossPath = model.ossPath;
            this.ossUpdateBy = model.ossUpdateBy;
            this.parentFolderId = model.parentFolderId;
            this.resourcePath = model.resourcePath;
            this.storageType = model.storageType;
            this.subFolderList = model.subFolderList;
            this.syncParsingStatus = model.syncParsingStatus;
            this.syncStatus = model.syncStatus;
            this.taskId = model.taskId;
        } 

        /**
         * currentLevel.
         */
        public Builder currentLevel(Integer currentLevel) {
            this.currentLevel = currentLevel;
            return this;
        }

        /**
         * docCount.
         */
        public Builder docCount(Integer docCount) {
            this.docCount = docCount;
            return this;
        }

        /**
         * folderDefault.
         */
        public Builder folderDefault(Integer folderDefault) {
            this.folderDefault = folderDefault;
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
         * folderNum.
         */
        public Builder folderNum(Integer folderNum) {
            this.folderNum = folderNum;
            return this;
        }

        /**
         * ossDomain.
         */
        public Builder ossDomain(String ossDomain) {
            this.ossDomain = ossDomain;
            return this;
        }

        /**
         * ossPath.
         */
        public Builder ossPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }

        /**
         * ossUpdateBy.
         */
        public Builder ossUpdateBy(String ossUpdateBy) {
            this.ossUpdateBy = ossUpdateBy;
            return this;
        }

        /**
         * parentFolderId.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * resourcePath.
         */
        public Builder resourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        /**
         * storageType.
         */
        public Builder storageType(Integer storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * subFolderList.
         */
        public Builder subFolderList(java.util.List<FolderItem> subFolderList) {
            this.subFolderList = subFolderList;
            return this;
        }

        /**
         * syncParsingStatus.
         */
        public Builder syncParsingStatus(Integer syncParsingStatus) {
            this.syncParsingStatus = syncParsingStatus;
            return this;
        }

        /**
         * syncStatus.
         */
        public Builder syncStatus(Integer syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public FolderItem build() {
            return new FolderItem(this);
        } 

    } 

}
