// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAcrossCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAcrossCatalogResponseBody</p>
 */
public class SearchAcrossCatalogResponseBody extends TeaModel {
    @NameInMap("CatalogResult")
    private CatalogResult catalogResult;

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

    private SearchAcrossCatalogResponseBody(Builder builder) {
        this.catalogResult = builder.catalogResult;
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

    public static SearchAcrossCatalogResponseBody create() {
        return builder().build();
    }

    /**
     * @return catalogResult
     */
    public CatalogResult getCatalogResult() {
        return this.catalogResult;
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
        private CatalogResult catalogResult; 
        private String code; 
        private DatabaseResult databaseResult; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TableResult tableResult; 

        /**
         * 返回的Catalog result
         */
        public Builder catalogResult(CatalogResult catalogResult) {
            this.catalogResult = catalogResult;
            return this;
        }

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

        public SearchAcrossCatalogResponseBody build() {
            return new SearchAcrossCatalogResponseBody(this);
        } 

    } 

    public static class Catalogs extends TeaModel {
        @NameInMap("Catalog")
        private Catalog catalog;

        @NameInMap("HighLightList")
        private java.util.List < HighLight > highLightList;

        private Catalogs(Builder builder) {
            this.catalog = builder.catalog;
            this.highLightList = builder.highLightList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Catalogs create() {
            return builder().build();
        }

        /**
         * @return catalog
         */
        public Catalog getCatalog() {
            return this.catalog;
        }

        /**
         * @return highLightList
         */
        public java.util.List < HighLight > getHighLightList() {
            return this.highLightList;
        }

        public static final class Builder {
            private Catalog catalog; 
            private java.util.List < HighLight > highLightList; 

            /**
             * Catalog.
             */
            public Builder catalog(Catalog catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * HighLightList.
             */
            public Builder highLightList(java.util.List < HighLight > highLightList) {
                this.highLightList = highLightList;
                return this;
            }

            public Catalogs build() {
                return new Catalogs(this);
            } 

        } 

    }
    public static class CatalogResult extends TeaModel {
        @NameInMap("Catalogs")
        private java.util.List < Catalogs> catalogs;

        @NameInMap("TotalCount")
        private Long totalCount;

        private CatalogResult(Builder builder) {
            this.catalogs = builder.catalogs;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CatalogResult create() {
            return builder().build();
        }

        /**
         * @return catalogs
         */
        public java.util.List < Catalogs> getCatalogs() {
            return this.catalogs;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Catalogs> catalogs; 
            private Long totalCount; 

            /**
             * Catalogs.
             */
            public Builder catalogs(java.util.List < Catalogs> catalogs) {
                this.catalogs = catalogs;
                return this;
            }

            /**
             * 满足匹配条件的总的Catalog个数
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CatalogResult build() {
                return new CatalogResult(this);
            } 

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
