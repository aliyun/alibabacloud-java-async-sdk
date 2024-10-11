// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAccountPrivilegesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountPrivilegesResponseBody</p>
 */
public class DescribeAccountPrivilegesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAccountPrivilegesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountPrivilegesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>Details of the permissions.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DA32480A-E3E5-1BE7-BA98-724551DC04C8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccountPrivilegesResponseBody build() {
            return new DescribeAccountPrivilegesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountPrivilegesResponseBody</p>
     */
    public static class PrivilegeObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        private PrivilegeObject(Builder builder) {
            this.column = builder.column;
            this.database = builder.database;
            this.description = builder.description;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivilegeObject create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String column; 
            private String database; 
            private String description; 
            private String table; 

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>db1</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The description of the permission object.</p>
             * 
             * <strong>example:</strong>
             * <p>a test column</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>tabl1</p>
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public PrivilegeObject build() {
                return new PrivilegeObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountPrivilegesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivilegeObject")
        private PrivilegeObject privilegeObject;

        @com.aliyun.core.annotation.NameInMap("PrivilegeType")
        private String privilegeType;

        @com.aliyun.core.annotation.NameInMap("Privileges")
        private java.util.List < String > privileges;

        private Data(Builder builder) {
            this.privilegeObject = builder.privilegeObject;
            this.privilegeType = builder.privilegeType;
            this.privileges = builder.privileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return privilegeObject
         */
        public PrivilegeObject getPrivilegeObject() {
            return this.privilegeObject;
        }

        /**
         * @return privilegeType
         */
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        /**
         * @return privileges
         */
        public java.util.List < String > getPrivileges() {
            return this.privileges;
        }

        public static final class Builder {
            private PrivilegeObject privilegeObject; 
            private String privilegeType; 
            private java.util.List < String > privileges; 

            /**
             * <p>The objects on which the permission takes effect, including databases, tables, columns, and additional descriptions.</p>
             */
            public Builder privilegeObject(PrivilegeObject privilegeObject) {
                this.privilegeObject = privilegeObject;
                return this;
            }

            /**
             * <p>The permission level of the permission. Valid values: <code>Global</code>, <code>Database</code>, <code>Table</code>, and <code>Column</code>. You can call the <code>DescribeEnabledPrivileges</code> parameter to query the permission level of a specific permission.</p>
             * 
             * <strong>example:</strong>
             * <p>Column</p>
             */
            public Builder privilegeType(String privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            /**
             * <p>The name of the permission. You can call the <code>DescribeEnabledPrivileges</code> operation to query the name of the permission.</p>
             */
            public Builder privileges(java.util.List < String > privileges) {
                this.privileges = privileges;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
