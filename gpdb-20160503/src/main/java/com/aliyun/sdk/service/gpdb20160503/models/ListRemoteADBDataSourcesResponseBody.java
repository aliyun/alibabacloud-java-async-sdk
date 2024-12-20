// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListRemoteADBDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemoteADBDataSourcesResponseBody</p>
 */
public class ListRemoteADBDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceItems")
    private DataSourceItems dataSourceItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private ListRemoteADBDataSourcesResponseBody(Builder builder) {
        this.dataSourceItems = builder.dataSourceItems;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemoteADBDataSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceItems
     */
    public DataSourceItems getDataSourceItems() {
        return this.dataSourceItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private DataSourceItems dataSourceItems; 
        private String requestId; 
        private Integer taskId; 

        /**
         * <p>Returns the successfully added data sharing service data.</p>
         */
        public Builder dataSourceItems(DataSourceItems dataSourceItems) {
            this.dataSourceItems = dataSourceItems;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e9d60eb1-e90d-4bc6-a470-c8b767460858</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90000</p>
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public ListRemoteADBDataSourcesResponseBody build() {
            return new ListRemoteADBDataSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRemoteADBDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemoteADBDataSourcesResponseBody</p>
     */
    public static class RemoteDataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LocalDatabase")
        private String localDatabase;

        @com.aliyun.core.annotation.NameInMap("LocalInstanceName")
        private String localInstanceName;

        @com.aliyun.core.annotation.NameInMap("ManagerUserName")
        private String managerUserName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemoteDatabase")
        private String remoteDatabase;

        @com.aliyun.core.annotation.NameInMap("RemoteInstanceName")
        private String remoteInstanceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private RemoteDataSources(Builder builder) {
            this.dataSourceName = builder.dataSourceName;
            this.description = builder.description;
            this.id = builder.id;
            this.localDatabase = builder.localDatabase;
            this.localInstanceName = builder.localInstanceName;
            this.managerUserName = builder.managerUserName;
            this.regionId = builder.regionId;
            this.remoteDatabase = builder.remoteDatabase;
            this.remoteInstanceName = builder.remoteInstanceName;
            this.status = builder.status;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteDataSources create() {
            return builder().build();
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return localDatabase
         */
        public String getLocalDatabase() {
            return this.localDatabase;
        }

        /**
         * @return localInstanceName
         */
        public String getLocalInstanceName() {
            return this.localInstanceName;
        }

        /**
         * @return managerUserName
         */
        public String getManagerUserName() {
            return this.managerUserName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remoteDatabase
         */
        public String getRemoteDatabase() {
            return this.remoteDatabase;
        }

        /**
         * @return remoteInstanceName
         */
        public String getRemoteInstanceName() {
            return this.remoteInstanceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dataSourceName; 
            private String description; 
            private Long id; 
            private String localDatabase; 
            private String localInstanceName; 
            private String managerUserName; 
            private String regionId; 
            private String remoteDatabase; 
            private String remoteInstanceName; 
            private String status; 
            private String userName; 

            /**
             * <p>Data source name</p>
             * 
             * <strong>example:</strong>
             * <p>db1_gptest1_to_db2_gp-test2</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Local database name</p>
             * 
             * <strong>example:</strong>
             * <p>db1</p>
             */
            public Builder localDatabase(String localDatabase) {
                this.localDatabase = localDatabase;
                return this;
            }

            /**
             * <p>Local instance name</p>
             * 
             * <strong>example:</strong>
             * <p>gp-test1</p>
             */
            public Builder localInstanceName(String localInstanceName) {
                this.localInstanceName = localInstanceName;
                return this;
            }

            /**
             * <p>Manager user name</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder managerUserName(String managerUserName) {
                this.managerUserName = managerUserName;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> API to view available region IDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Remote database name</p>
             * 
             * <strong>example:</strong>
             * <p>db2</p>
             */
            public Builder remoteDatabase(String remoteDatabase) {
                this.remoteDatabase = remoteDatabase;
                return this;
            }

            /**
             * <p>Remote instance name</p>
             * 
             * <strong>example:</strong>
             * <p>gp-test2</p>
             */
            public Builder remoteInstanceName(String remoteInstanceName) {
                this.remoteInstanceName = remoteInstanceName;
                return this;
            }

            /**
             * <p>Data source status</p>
             * 
             * <strong>example:</strong>
             * <p>creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>User name</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public RemoteDataSources build() {
                return new RemoteDataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRemoteADBDataSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemoteADBDataSourcesResponseBody</p>
     */
    public static class DataSourceItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RemoteDataSources")
        private java.util.List<RemoteDataSources> remoteDataSources;

        private DataSourceItems(Builder builder) {
            this.remoteDataSources = builder.remoteDataSources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceItems create() {
            return builder().build();
        }

        /**
         * @return remoteDataSources
         */
        public java.util.List<RemoteDataSources> getRemoteDataSources() {
            return this.remoteDataSources;
        }

        public static final class Builder {
            private java.util.List<RemoteDataSources> remoteDataSources; 

            /**
             * RemoteDataSources.
             */
            public Builder remoteDataSources(java.util.List<RemoteDataSources> remoteDataSources) {
                this.remoteDataSources = remoteDataSources;
                return this;
            }

            public DataSourceItems build() {
                return new DataSourceItems(this);
            } 

        } 

    }
}
