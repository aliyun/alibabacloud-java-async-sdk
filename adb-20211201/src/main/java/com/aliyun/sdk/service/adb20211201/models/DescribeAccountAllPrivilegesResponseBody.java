// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAccountAllPrivilegesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAllPrivilegesResponseBody</p>
 */
public class DescribeAccountAllPrivilegesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccountAllPrivilegesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAllPrivilegesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAccountAllPrivilegesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details of the permissions.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3BB185E9-BB54-1727-B876-13243E4C0EB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountAllPrivilegesResponseBody build() {
            return new DescribeAccountAllPrivilegesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountAllPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAllPrivilegesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PrivilegeObject model) {
                this.column = model.column;
                this.database = model.database;
                this.description = model.description;
                this.table = model.table;
            } 

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>tdb1</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The description of the permission object.</p>
             * 
             * <strong>example:</strong>
             * <p>id of table</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>table1</p>
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
     * {@link DescribeAccountAllPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAllPrivilegesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivilegeObject")
        private PrivilegeObject privilegeObject;

        @com.aliyun.core.annotation.NameInMap("PrivilegeType")
        private String privilegeType;

        @com.aliyun.core.annotation.NameInMap("Privileges")
        private java.util.List<String> privileges;

        private Result(Builder builder) {
            this.privilegeObject = builder.privilegeObject;
            this.privilegeType = builder.privilegeType;
            this.privileges = builder.privileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
        public java.util.List<String> getPrivileges() {
            return this.privileges;
        }

        public static final class Builder {
            private PrivilegeObject privilegeObject; 
            private String privilegeType; 
            private java.util.List<String> privileges; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.privilegeObject = model.privilegeObject;
                this.privilegeType = model.privilegeType;
                this.privileges = model.privileges;
            } 

            /**
             * <p>The objects on which the permission takes effect, including databases, tables, and columns. If Global is returned for the PrivilegeType parameter, an empty string is returned for this parameter.</p>
             */
            public Builder privilegeObject(PrivilegeObject privilegeObject) {
                this.privilegeObject = privilegeObject;
                return this;
            }

            /**
             * <p>The permission level of the database account. You can call the <code>DescribeEnabledPrivileges</code> operation to query the permission level of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>Global</p>
             */
            public Builder privilegeType(String privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            /**
             * <p>The name of the permission, which is the same as the permission name returned by the <code>DescribeEnabledPrivileges</code> operation.</p>
             */
            public Builder privileges(java.util.List<String> privileges) {
                this.privileges = privileges;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountAllPrivilegesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountAllPrivilegesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Truncated")
        private Boolean truncated;

        private Data(Builder builder) {
            this.marker = builder.marker;
            this.result = builder.result;
            this.truncated = builder.truncated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return truncated
         */
        public Boolean getTruncated() {
            return this.truncated;
        }

        public static final class Builder {
            private String marker; 
            private java.util.List<Result> result; 
            private Boolean truncated; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.marker = model.marker;
                this.result = model.result;
                this.truncated = model.truncated;
            } 

            /**
             * <p>Indicates the position where the results are truncated. When a value of <code>true</code> is returned for the <code>Truncated</code> parameter, this parameter is present and contains the value to use for the Marker parameter in a subsequent call.</p>
             * 
             * <strong>example:</strong>
             * <p>0573e74fd1ccb01739993a691e876074db6e1b6ad79f54115f0e98528432ba6a523cfec5780ade5189299cc3396f6ff7</p>
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * <p>The permissions.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Indicates whether the results are truncated. If the results are truncated, a value of <code>true</code> is returned. In this case, you must call this operation again to obtain all the results until a value of <code>false</code> is returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder truncated(Boolean truncated) {
                this.truncated = truncated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
