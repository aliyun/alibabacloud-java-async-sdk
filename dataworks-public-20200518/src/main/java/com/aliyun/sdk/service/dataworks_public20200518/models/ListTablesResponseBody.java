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
             * DataSourceQualifiedName.
             */
            public Builder dataSourceQualifiedName(String dataSourceQualifiedName) {
                this.dataSourceQualifiedName = dataSourceQualifiedName;
                return this;
            }

            /**
             * DataSourceUniqueId.
             */
            public Builder dataSourceUniqueId(String dataSourceUniqueId) {
                this.dataSourceUniqueId = dataSourceUniqueId;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * TableName.
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
             * EntityContent.
             */
            public Builder entityContent(EntityContent entityContent) {
                this.entityContent = entityContent;
                return this;
            }

            /**
             * EntityQualifiedName.
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
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TableEntityList.
             */
            public Builder tableEntityList(java.util.List<TableEntityList> tableEntityList) {
                this.tableEntityList = tableEntityList;
                return this;
            }

            /**
             * Total.
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
