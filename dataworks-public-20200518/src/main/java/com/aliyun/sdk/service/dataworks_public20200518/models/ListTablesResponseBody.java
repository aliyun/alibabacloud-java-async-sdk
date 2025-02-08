// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E25887B7-579C-54A5-9C4F-83A0DE367DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class EntityContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceQualifiedName")
        private String dataSourceQualifiedName;

        @com.aliyun.core.annotation.NameInMap("DataSourceUniqueId")
        private String dataSourceUniqueId;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private EntityContent(Builder builder) {
            this.dataSourceQualifiedName = builder.dataSourceQualifiedName;
            this.dataSourceUniqueId = builder.dataSourceUniqueId;
            this.databaseName = builder.databaseName;
            this.instanceId = builder.instanceId;
            this.projectName = builder.projectName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityContent create() {
            return builder().build();
        }

        /**
         * @return dataSourceQualifiedName
         */
        public String getDataSourceQualifiedName() {
            return this.dataSourceQualifiedName;
        }

        /**
         * @return dataSourceUniqueId
         */
        public String getDataSourceUniqueId() {
            return this.dataSourceUniqueId;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String dataSourceQualifiedName; 
            private String dataSourceUniqueId; 
            private String databaseName; 
            private String instanceId; 
            private String projectName; 
            private String tableName; 

            /**
             * <p>The unique identifier of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>accountId:cn-shanghai:odps:project</p>
             */
            public Builder dataSourceQualifiedName(String dataSourceQualifiedName) {
                this.dataSourceQualifiedName = dataSourceQualifiedName;
                return this;
            }

            /**
             * <p>The unique ID of the data source identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>e70f92239d491057f6a2563b545bdaf8cc6b537d9dc55ec84c55f7cfefg</p>
             */
            public Builder dataSourceUniqueId(String dataSourceUniqueId) {
                this.dataSourceUniqueId = dataSourceUniqueId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The ID of the data source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6rn0123</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ODPS project.</p>
             * 
             * <strong>example:</strong>
             * <p>project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public EntityContent build() {
                return new EntityContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class TableEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityContent")
        private EntityContent entityContent;

        @com.aliyun.core.annotation.NameInMap("EntityQualifiedName")
        private String entityQualifiedName;

        private TableEntityList(Builder builder) {
            this.entityContent = builder.entityContent;
            this.entityQualifiedName = builder.entityQualifiedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableEntityList create() {
            return builder().build();
        }

        /**
         * @return entityContent
         */
        public EntityContent getEntityContent() {
            return this.entityContent;
        }

        /**
         * @return entityQualifiedName
         */
        public String getEntityQualifiedName() {
            return this.entityQualifiedName;
        }

        public static final class Builder {
            private EntityContent entityContent; 
            private String entityQualifiedName; 

            /**
             * <p>Table entity information.</p>
             */
            public Builder entityContent(EntityContent entityContent) {
                this.entityContent = entityContent;
                return this;
            }

            /**
             * <p>The unique identifier of the table entity.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute-table.project.table</p>
             */
            public Builder entityQualifiedName(String entityQualifiedName) {
                this.entityQualifiedName = entityQualifiedName;
                return this;
            }

            public TableEntityList build() {
                return new TableEntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TableEntityList")
        private java.util.List<TableEntityList> tableEntityList;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.tableEntityList = builder.tableEntityList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return tableEntityList
         */
        public java.util.List<TableEntityList> getTableEntityList() {
            return this.tableEntityList;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String nextToken; 
            private java.util.List<TableEntityList> tableEntityList; 
            private Long total; 

            /**
             * <p>Pagination information, which specifies the starting point of the next read.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAVY3rYiv9VoUJQSiCitgjgSwg+byk0FIjirFkm4zfM4G0xYwM/FQvOhgrTHsCPIZ5yqXYu2NG6qRCRC52HvwbOA=</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>Entity array.</p>
             */
            public Builder tableEntityList(java.util.List<TableEntityList> tableEntityList) {
                this.tableEntityList = tableEntityList;
                return this;
            }

            /**
             * <p>The total number.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
