// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListFavoriteReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFavoriteReportsResponseBody</p>
 */
public class ListFavoriteReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListFavoriteReportsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFavoriteReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListFavoriteReportsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the query result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListFavoriteReportsResponseBody build() {
            return new ListFavoriteReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFavoriteReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFavoriteReportsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Favorite")
        private Boolean favorite;

        @com.aliyun.core.annotation.NameInMap("FavoriteDate")
        private String favoriteDate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HasEditAuth")
        private Boolean hasEditAuth;

        @com.aliyun.core.annotation.NameInMap("HasViewAuth")
        private Boolean hasViewAuth;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerNum")
        private String ownerNum;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private Integer publishStatus;

        @com.aliyun.core.annotation.NameInMap("TreeId")
        private String treeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.favorite = builder.favorite;
            this.favoriteDate = builder.favoriteDate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasEditAuth = builder.hasEditAuth;
            this.hasViewAuth = builder.hasViewAuth;
            this.name = builder.name;
            this.ownerName = builder.ownerName;
            this.ownerNum = builder.ownerNum;
            this.publishStatus = builder.publishStatus;
            this.treeId = builder.treeId;
            this.type = builder.type;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return favorite
         */
        public Boolean getFavorite() {
            return this.favorite;
        }

        /**
         * @return favoriteDate
         */
        public String getFavoriteDate() {
            return this.favoriteDate;
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
         * @return hasEditAuth
         */
        public Boolean getHasEditAuth() {
            return this.hasEditAuth;
        }

        /**
         * @return hasViewAuth
         */
        public Boolean getHasViewAuth() {
            return this.hasViewAuth;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerNum
         */
        public String getOwnerNum() {
            return this.ownerNum;
        }

        /**
         * @return publishStatus
         */
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return treeId
         */
        public String getTreeId() {
            return this.treeId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private Boolean favorite; 
            private String favoriteDate; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean hasEditAuth; 
            private Boolean hasViewAuth; 
            private String name; 
            private String ownerName; 
            private String ownerNum; 
            private Integer publishStatus; 
            private String treeId; 
            private String type; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.favorite = model.favorite;
                this.favoriteDate = model.favoriteDate;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hasEditAuth = model.hasEditAuth;
                this.hasViewAuth = model.hasViewAuth;
                this.name = model.name;
                this.ownerName = model.ownerName;
                this.ownerNum = model.ownerNum;
                this.publishStatus = model.publishStatus;
                this.treeId = model.treeId;
                this.type = model.type;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>Indicates whether the user has favorited the work.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder favorite(Boolean favorite) {
                this.favorite = favorite;
                return this;
            }

            /**
             * <p>The timestamp when the work was favorited.</p>
             * 
             * <strong>example:</strong>
             * <p>1640088615000</p>
             */
            public Builder favoriteDate(String favoriteDate) {
                this.favoriteDate = favoriteDate;
                return this;
            }

            /**
             * <p>Timestamp of the work creation.</p>
             * 
             * <strong>example:</strong>
             * <p>1640088615000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Timestamp of the work modification.</p>
             * 
             * <strong>example:</strong>
             * <p>1640595729000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the user has edit permission for the work.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasEditAuth(Boolean hasEditAuth) {
                this.hasEditAuth = hasEditAuth;
                return this;
            }

            /**
             * <p>Check if the user has the permission to view the work.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasViewAuth(Boolean hasViewAuth) {
                this.hasViewAuth = hasViewAuth;
                return this;
            }

            /**
             * <p>Name of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Alibaba Cloud account name of the work owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>UserID of the work owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1365*****238860</p>
             */
            public Builder ownerNum(String ownerNum) {
                this.ownerNum = ownerNum;
                return this;
            }

            /**
             * <p>Publication status of the work. Value range:</p>
             * <ul>
             * <li>0: Not published</li>
             * <li>1: Published</li>
             * <li>2: Saved with modifications, not published</li>
             * <li>3: Offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publishStatus(Integer publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>Work ID.</p>
             * 
             * <strong>example:</strong>
             * <p>977c7698-<strong><strong>-</strong></strong>-****-44b7304d20fc</p>
             */
            public Builder treeId(String treeId) {
                this.treeId = treeId;
                return this;
            }

            /**
             * <p>Type of the work. Value range:</p>
             * <ul>
             * <li>DATAPRODUCT: Data Portal</li>
             * <li>PAGE: Dashboard</li>
             * <li>REPORT: Spreadsheet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PAGE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the work belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>523793cb-<strong><strong>-</strong></strong>-****-aa71c65ffa39</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace to which the work belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFavoriteReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFavoriteReportsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>List of works queried.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Number of rows per page set when requesting the interface.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
