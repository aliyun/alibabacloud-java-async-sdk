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
 * {@link ModifyRemoteADBDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRemoteADBDataSourceResponseBody</p>
 */
public class ModifyRemoteADBDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceItem")
    private DataSourceItem dataSourceItem;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Integer taskId;

    private ModifyRemoteADBDataSourceResponseBody(Builder builder) {
        this.dataSourceItem = builder.dataSourceItem;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRemoteADBDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceItem
     */
    public DataSourceItem getDataSourceItem() {
        return this.dataSourceItem;
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
        private DataSourceItem dataSourceItem; 
        private String requestId; 
        private Integer taskId; 

        /**
         * <p>Returns the successfully modified data sharing service data.</p>
         */
        public Builder dataSourceItem(DataSourceItem dataSourceItem) {
            this.dataSourceItem = dataSourceItem;
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

        public ModifyRemoteADBDataSourceResponseBody build() {
            return new ModifyRemoteADBDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyRemoteADBDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyRemoteADBDataSourceResponseBody</p>
     */
    public static class DataSourceItem extends TeaModel {
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

        private DataSourceItem(Builder builder) {
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

        public static DataSourceItem create() {
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
             * <p>Data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>db1_gptest1_to_db2_gp-test2</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>Description information.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>ID</p>
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
             * <p>test</p>
             */
            public Builder managerUserName(String managerUserName) {
                this.managerUserName = managerUserName;
                return this;
            }

            /**
             * <p>Region ID where the instance is located.</p>
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

            public DataSourceItem build() {
                return new DataSourceItem(this);
            } 

        } 

    }
}
