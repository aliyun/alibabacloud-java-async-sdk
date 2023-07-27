// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAllPrivilegesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountAllPrivilegesResponseBody</p>
 */
public class DescribeAccountAllPrivilegesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Details of the permissions.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccountAllPrivilegesResponseBody build() {
            return new DescribeAccountAllPrivilegesResponseBody(this);
        } 

    } 

    public static class PrivilegeObject extends TeaModel {
        @NameInMap("Column")
        private String column;

        @NameInMap("Database")
        private String database;

        @NameInMap("Description")
        private String description;

        @NameInMap("Table")
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
             * The name of the column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The description of the permission object.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the table.
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
    public static class Result extends TeaModel {
        @NameInMap("PrivilegeObject")
        private PrivilegeObject privilegeObject;

        @NameInMap("PrivilegeType")
        private String privilegeType;

        @NameInMap("Privileges")
        private java.util.List < String > privileges;

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
        public java.util.List < String > getPrivileges() {
            return this.privileges;
        }

        public static final class Builder {
            private PrivilegeObject privilegeObject; 
            private String privilegeType; 
            private java.util.List < String > privileges; 

            /**
             * The objects on which the permission takes effect, including databases, tables, and columns. If Global is returned for the PrivilegeType parameter, an empty string is returned for this parameter.
             */
            public Builder privilegeObject(PrivilegeObject privilegeObject) {
                this.privilegeObject = privilegeObject;
                return this;
            }

            /**
             * The permission level of the database account. You can call the `DescribeEnabledPrivileges` operation to query the permission level of the database account.
             */
            public Builder privilegeType(String privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            /**
             * The name of the permission, which is the same as the permission name returned by the `DescribeEnabledPrivileges` operation.
             */
            public Builder privileges(java.util.List < String > privileges) {
                this.privileges = privileges;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Marker")
        private String marker;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("Truncated")
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
        public java.util.List < Result> getResult() {
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
            private java.util.List < Result> result; 
            private Boolean truncated; 

            /**
             * Indicates the position where the results are truncated. When a value of `true` is returned for the `Truncated` parameter, this parameter is present and contains the value to use for the Marker parameter in a subsequent call.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * The permissions.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Indicates whether the results are truncated. If the results are truncated, a value of `true` is returned. In this case, you must call this operation again to obtain all the results until a value of `false` is returned for this parameter.
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
