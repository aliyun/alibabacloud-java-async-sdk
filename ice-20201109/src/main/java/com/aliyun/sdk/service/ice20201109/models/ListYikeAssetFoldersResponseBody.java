// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListYikeAssetFoldersResponseBody} extends {@link TeaModel}
 *
 * <p>ListYikeAssetFoldersResponseBody</p>
 */
public class ListYikeAssetFoldersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FolderList")
    private java.util.List<FolderList> folderList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListYikeAssetFoldersResponseBody(Builder builder) {
        this.folderList = builder.folderList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYikeAssetFoldersResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<FolderList> folderList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListYikeAssetFoldersResponseBody model) {
            this.folderList = model.folderList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * FolderList.
         */
        public Builder folderList(java.util.List<FolderList> folderList) {
            this.folderList = folderList;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListYikeAssetFoldersResponseBody build() {
            return new ListYikeAssetFoldersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListYikeAssetFoldersResponseBody} extends {@link TeaModel}
     *
     * <p>ListYikeAssetFoldersResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ProductionId")
        private String productionId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private FolderList(Builder builder) {
            this.createTime = builder.createTime;
            this.folderId = builder.folderId;
            this.folderName = builder.folderName;
            this.isDefault = builder.isDefault;
            this.productionId = builder.productionId;
            this.workspaceId = builder.workspaceId;
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
         * @return productionId
         */
        public String getProductionId() {
            return this.productionId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String createTime; 
            private String folderId; 
            private String folderName; 
            private Boolean isDefault; 
            private String productionId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(FolderList model) {
                this.createTime = model.createTime;
                this.folderId = model.folderId;
                this.folderName = model.folderName;
                this.isDefault = model.isDefault;
                this.productionId = model.productionId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ProductionId.
             */
            public Builder productionId(String productionId) {
                this.productionId = productionId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public FolderList build() {
                return new FolderList(this);
            } 

        } 

    }
}
