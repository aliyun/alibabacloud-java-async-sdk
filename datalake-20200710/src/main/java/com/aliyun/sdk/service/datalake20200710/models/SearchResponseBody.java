// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchResponseBody} extends {@link TeaModel}
 *
 * <p>SearchResponseBody</p>
 */
public class SearchResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DatabaseResult")
    private DatabaseResult databaseResult;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableResult")
    private TableResult tableResult;

    private SearchResponseBody(Builder builder) {
        this.code = builder.code;
        this.databaseResult = builder.databaseResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableResult = builder.tableResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return databaseResult
     */
    public DatabaseResult getDatabaseResult() {
        return this.databaseResult;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tableResult
     */
    public TableResult getTableResult() {
        return this.tableResult;
    }

    public static final class Builder {
        private String code; 
        private DatabaseResult databaseResult; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TableResult tableResult; 

        /**
         * 响应代码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 返回的db结果
         */
        public Builder databaseResult(DatabaseResult databaseResult) {
            this.databaseResult = databaseResult;
            return this;
        }

        /**
         * 响应消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 返回的table result
         */
        public Builder tableResult(TableResult tableResult) {
            this.tableResult = tableResult;
            return this;
        }

        public SearchResponseBody build() {
            return new SearchResponseBody(this);
        } 

    } 

    public static class Databases extends TeaModel {
        @NameInMap("Database")
        private Database database;

        @NameInMap("HighLightList")
        private java.util.List < HighLight > highLightList;

        private Databases(Builder builder) {
            this.database = builder.database;
            this.highLightList = builder.highLightList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public Database getDatabase() {
            return this.database;
        }

        /**
         * @return highLightList
         */
        public java.util.List < HighLight > getHighLightList() {
            return this.highLightList;
        }

        public static final class Builder {
            private Database database; 
            private java.util.List < HighLight > highLightList; 

            /**
             * 返回的Database
             */
            public Builder database(Database database) {
                this.database = database;
                return this;
            }

            /**
             * 返回高亮文本
             */
            public Builder highLightList(java.util.List < HighLight > highLightList) {
                this.highLightList = highLightList;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    public static class DatabaseResult extends TeaModel {
        @NameInMap("Databases")
        private java.util.List < Databases> databases;

        @NameInMap("TotalCount")
        private Long totalCount;

        private DatabaseResult(Builder builder) {
            this.databases = builder.databases;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseResult create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < Databases> getDatabases() {
            return this.databases;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Databases> databases; 
            private Long totalCount; 

            /**
             * 返回的DatabaseList
             */
            public Builder databases(java.util.List < Databases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * 满足匹配条件的总的Database个数
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DatabaseResult build() {
                return new DatabaseResult(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @NameInMap("HighLightList")
        private java.util.List < HighLight > highLightList;

        @NameInMap("Table")
        private Table table;

        private Tables(Builder builder) {
            this.highLightList = builder.highLightList;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return highLightList
         */
        public java.util.List < HighLight > getHighLightList() {
            return this.highLightList;
        }

        /**
         * @return table
         */
        public Table getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < HighLight > highLightList; 
            private Table table; 

            /**
             * 返回的高亮文本
             */
            public Builder highLightList(java.util.List < HighLight > highLightList) {
                this.highLightList = highLightList;
                return this;
            }

            /**
             * 返回的Table
             */
            public Builder table(Table table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class TableResult extends TeaModel {
        @NameInMap("Tables")
        private java.util.List < Tables> tables;

        @NameInMap("TotalCount")
        private Long totalCount;

        private TableResult(Builder builder) {
            this.tables = builder.tables;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableResult create() {
            return builder().build();
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Tables> tables; 
            private Long totalCount; 

            /**
             * 返回的TableList
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * 满足匹配条件的总的Table个数
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TableResult build() {
                return new TableResult(this);
            } 

        } 

    }
}
