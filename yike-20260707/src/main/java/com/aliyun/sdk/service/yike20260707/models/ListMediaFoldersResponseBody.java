// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link ListMediaFoldersResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaFoldersResponseBody</p>
 */
public class ListMediaFoldersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FolderList")
    private java.util.List<FolderList> folderList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMediaFoldersResponseBody(Builder builder) {
        this.folderList = builder.folderList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaFoldersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderList
     */
    public java.util.List<FolderList> getFolderList() {
        return this.folderList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FolderList> folderList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMediaFoldersResponseBody model) {
            this.folderList = model.folderList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of folders.</p>
         */
        public Builder folderList(java.util.List<FolderList> folderList) {
            this.folderList = folderList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4B6524F7-*****-A55F-B7DEA1EC628A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaFoldersResponseBody build() {
            return new ListMediaFoldersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaFoldersResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaFoldersResponseBody</p>
     */
    public static class FolderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("FolderName")
        private String folderName;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ProductionId")
        private String productionId;

        private FolderList(Builder builder) {
            this.createTime = builder.createTime;
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
            this.isDefault = builder.isDefault;
            this.modifiedTime = builder.modifiedTime;
            this.productionId = builder.productionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FolderList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
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
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return productionId
         */
        public String getProductionId() {
            return this.productionId;
        }

        public static final class Builder {
            private String createTime; 
            private String folderId; 
            private String folderName; 
            private Boolean isDefault; 
            private String modifiedTime; 
            private String productionId; 

            private Builder() {
            } 

            private Builder(FolderList model) {
                this.createTime = model.createTime;
                this.folderId = model.folderId;
                this.folderName = model.folderName;
                this.isDefault = model.isDefault;
                this.modifiedTime = model.modifiedTime;
                this.productionId = model.productionId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The folder ID. The ID of the default folder is fixed to <code>fd_{ProductionId}_default</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>fd_pd_1585***_default</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The folder name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default folder</p>
             */
            public Builder folderName(String folderName) {
                this.folderName = folderName;
                return this;
            }

            /**
             * <p>Indicates whether the folder is the default folder. Each project has exactly one default folder.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the project to which the folder belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pd_1585***</p>
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            public FolderList build() {
                return new FolderList(this);
            } 

        } 

    }
}
