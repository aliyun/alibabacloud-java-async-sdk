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
 * {@link QueryDatasetListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDatasetListResponseBody</p>
 */
public class QueryDatasetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDatasetListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetListResponseBody create() {
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

        private Builder(QueryDatasetListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The keyword used to search for the dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Test dataset</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Whether to recursively wrap the dataset in the subdirectory. Valid values:</p>
         * <ul>
         * <li>true: returns datasets in all recursive subdirectories in the directoryId directory.</li>
         * <li>false: Only datasets in the directory specified by directoryId are returned, excluding subdirectories.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDatasetListResponseBody build() {
            return new QueryDatasetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDatasetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetListResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("DsName")
        private String dsName;

        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        private DataSource(Builder builder) {
            this.dsId = builder.dsId;
            this.dsName = builder.dsName;
            this.dsType = builder.dsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return dsName
         */
        public String getDsName() {
            return this.dsName;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        public static final class Builder {
            private String dsId; 
            private String dsName; 
            private String dsType; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.dsId = model.dsId;
                this.dsName = model.dsName;
                this.dsType = model.dsType;
            } 

            /**
             * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
             * 
             * <strong>example:</strong>
             * <p>261b252d-c3c3-498a-a0a7-5d1ec6cd****</p>
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>The time when the scaling group was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the training dataset.</p>
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            /**
             * <p>The user ID of the dataset owner in the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDatasetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetListResponseBody</p>
     */
    public static class Directory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PathId")
        private String pathId;

        @com.aliyun.core.annotation.NameInMap("PathName")
        private String pathName;

        private Directory(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.pathId = builder.pathId;
            this.pathName = builder.pathName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pathId
         */
        public String getPathId() {
            return this.pathId;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String pathId; 
            private String pathName; 

            private Builder() {
            } 

            private Builder(Directory model) {
                this.id = model.id;
                this.name = model.name;
                this.pathId = model.pathId;
                this.pathName = model.pathName;
            } 

            /**
             * <p>The ID of the directory path.</p>
             * 
             * <strong>example:</strong>
             * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>Information about the directory where the dataset is located</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>Test a data source</p>
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDatasetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private Directory directory;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("OpenOfflineAcceleration")
        private Boolean openOfflineAcceleration;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("RowLevel")
        private Boolean rowLevel;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSource = builder.dataSource;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.description = builder.description;
            this.directory = builder.directory;
            this.modifyTime = builder.modifyTime;
            this.openOfflineAcceleration = builder.openOfflineAcceleration;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.rowLevel = builder.rowLevel;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public Directory getDirectory() {
            return this.directory;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return openOfflineAcceleration
         */
        public Boolean getOpenOfflineAcceleration() {
            return this.openOfflineAcceleration;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return rowLevel
         */
        public Boolean getRowLevel() {
            return this.rowLevel;
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
            private String createTime; 
            private DataSource dataSource; 
            private String datasetId; 
            private String datasetName; 
            private String description; 
            private Directory directory; 
            private String modifyTime; 
            private Boolean openOfflineAcceleration; 
            private String ownerId; 
            private String ownerName; 
            private Boolean rowLevel; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.dataSource = model.dataSource;
                this.datasetId = model.datasetId;
                this.datasetName = model.datasetName;
                this.description = model.description;
                this.directory = model.directory;
                this.modifyTime = model.modifyTime;
                this.openOfflineAcceleration = model.openOfflineAcceleration;
                this.ownerId = model.ownerId;
                this.ownerName = model.ownerName;
                this.rowLevel = model.rowLevel;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>The details of the dataset list.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-02 10:36:05</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Test Space</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>5820f58c-c734-4d8a-baf1-7979af4f****</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>Tom</p>
             * 
             * <strong>example:</strong>
             * <p>company_sales_record_copy12</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>The number of rows per page set when the interface is requested.</p>
             * 
             * <strong>example:</strong>
             * <p>The total number of rows in the table.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The information about the data source to which the dataset belongs.</p>
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The nickname of the dataset owner.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-02 10:36:05</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * OpenOfflineAcceleration.
             */
            public Builder openOfflineAcceleration(Boolean openOfflineAcceleration) {
                this.openOfflineAcceleration = openOfflineAcceleration;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>136516262323****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Whether to enable row-level permissions. Valid values:</p>
             * <ul>
             * <li>true: The VIP Netty channel is enabled.</li>
             * <li>false: The incremental log backup feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>The ID of the workspace.</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder rowLevel(Boolean rowLevel) {
                this.rowLevel = rowLevel;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>95296e95-ca89-4c7d-8af9-dedf0ad06adf</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The description of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>Test dataset</p>
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
     * {@link QueryDatasetListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetListResponseBody</p>
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
             * <p>Returns the pagination results of the dataset list. The detailed information of the dataset list is stored in the response parameter Data.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The number of rows per page in a paged query.</p>
             * <ul>
             * <li>Default value: 10.</li>
             * <li>Maximum value: 1,000.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>Current page number for dataset list:</p>
             * <ul>
             * <li>Pages start from page 1.</li>
             * <li>Default value: 1.</li>
             * </ul>
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
