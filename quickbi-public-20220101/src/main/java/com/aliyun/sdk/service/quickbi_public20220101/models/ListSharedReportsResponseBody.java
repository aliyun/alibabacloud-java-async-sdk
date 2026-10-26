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
 * {@link ListSharedReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSharedReportsResponseBody</p>
 */
public class ListSharedReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSharedReportsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedReportsResponseBody create() {
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

        private Builder(ListSharedReportsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The query results are returned.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
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

        public ListSharedReportsResponseBody build() {
            return new ListSharedReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSharedReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSharedReportsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Favorite")
        private Boolean favorite;

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
             * <p>Queries whether the user has collected the work.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder favorite(Boolean favorite) {
                this.favorite = favorite;
                return this;
            }

            /**
             * <p>The timestamp when the work was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1640088615000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the work was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1644373980000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The query user has the editing rights of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasEditAuth(Boolean hasEditAuth) {
                this.hasEditAuth = hasEditAuth;
                return this;
            }

            /**
             * <p>The query user has the permission to view the work.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasViewAuth(Boolean hasViewAuth) {
                this.hasViewAuth = hasViewAuth;
                return this;
            }

            /**
             * <p>The name of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>Test report</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account name of the work owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test account</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The UserID of the work owner.</p>
             * 
             * <strong>example:</strong>
             * <p>1365*****238860</p>
             */
            public Builder ownerNum(String ownerNum) {
                this.ownerNum = ownerNum;
                return this;
            }

            /**
             * <p>The publication status of the work. Valid values:</p>
             * <ul>
             * <li>0: unpublished</li>
             * <li>1: published</li>
             * <li>2: modified and saved but not published.</li>
             * <li>3: unpublished</li>
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
             * <p>The ID of the work.</p>
             * 
             * <strong>example:</strong>
             * <p>977c7698-<strong><strong>-</strong></strong>-****-44b7304d20fc</p>
             */
            public Builder treeId(String treeId) {
                this.treeId = treeId;
                return this;
            }

            /**
             * <p>The type of the work. Valid values:</p>
             * <ul>
             * <li>DATAPRODUCT: BI portal</li>
             * <li>PAGE: Dashboard</li>
             * <li>REPORT: workbook</li>
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
             * <p>gfidm145-<strong><strong>-</strong></strong>-9426-8f93be23****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The name of the workspace to which the work belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Workspace</p>
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
     * {@link ListSharedReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSharedReportsResponseBody</p>
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
             * <p>The list of queried works.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of rows per page set when the interface is requested.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
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
