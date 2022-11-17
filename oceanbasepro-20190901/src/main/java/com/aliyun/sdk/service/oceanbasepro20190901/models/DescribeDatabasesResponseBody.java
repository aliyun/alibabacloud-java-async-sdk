// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabasesResponseBody</p>
 */
public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    private java.util.List < Databases> databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public java.util.List < Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Databases> databases; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * 租户中的数据库列表。
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户中的数据库总数。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabasesResponseBody build() {
            return new DescribeDatabasesResponseBody(this);
        } 

    } 

    public static class Tables extends TeaModel {
        @NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * 数据库表名
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("Role")
        private String role;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserType")
        private String userType;

        private Users(Builder builder) {
            this.role = builder.role;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String role; 
            private String userName; 
            private String userType; 

            /**
             * 账号赋予该库的角色权限。 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 账号名称。
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * 账号类型。 - Admin：超级账户 - Normal：普通账户
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("Collation")
        private String collation;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataSize")
        private Double dataSize;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("RequiredSize")
        private Double requiredSize;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tables")
        private java.util.List < Tables> tables;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("Users")
        private java.util.List < Users> users;

        private Databases(Builder builder) {
            this.collation = builder.collation;
            this.createTime = builder.createTime;
            this.dataSize = builder.dataSize;
            this.databaseName = builder.databaseName;
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.encoding = builder.encoding;
            this.requiredSize = builder.requiredSize;
            this.status = builder.status;
            this.tables = builder.tables;
            this.tenantId = builder.tenantId;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return collation
         */
        public String getCollation() {
            return this.collation;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSize
         */
        public Double getDataSize() {
            return this.dataSize;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return requiredSize
         */
        public Double getRequiredSize() {
            return this.requiredSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return users
         */
        public java.util.List < Users> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String collation; 
            private String createTime; 
            private Double dataSize; 
            private String databaseName; 
            private String dbType; 
            private String description; 
            private String encoding; 
            private Double requiredSize; 
            private String status; 
            private java.util.List < Tables> tables; 
            private String tenantId; 
            private java.util.List < Users> users; 

            /**
             * 字符序
             */
            public Builder collation(String collation) {
                this.collation = collation;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 实际数据大小单位（GB）
             */
            public Builder dataSize(Double dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * 数据库名称。
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * 数据库类型
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * 数据库的描述信息。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 数据库的编码。目前支持utf8mb4、gbk等编码。
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * 所需容量 单位（GB）
             */
            public Builder requiredSize(Double requiredSize) {
                this.requiredSize = requiredSize;
                return this;
            }

            /**
             * 数据库的状态。 - ONLINE: 运行中 - DELETING: 删除中
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 数据库表信息
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * 租户ID。
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * 对该数据库赋权的账号信息。
             */
            public Builder users(java.util.List < Users> users) {
                this.users = users;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
