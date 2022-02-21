// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchRDSTablesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchRDSTablesResponseBody</p>
 */
public class SearchRDSTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schemas")
    private java.util.List < Schemas> schemas;

    private SearchRDSTablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchRDSTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemas
     */
    public java.util.List < Schemas> getSchemas() {
        return this.schemas;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Schemas> schemas; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Schemas.
         */
        public Builder schemas(java.util.List < Schemas> schemas) {
            this.schemas = schemas;
            return this;
        }

        public SearchRDSTablesResponseBody build() {
            return new SearchRDSTablesResponseBody(this);
        } 

    } 

    public static class Schemas extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Tables")
        private java.util.List < String > tables;

        private Schemas(Builder builder) {
            this.dbName = builder.dbName;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return tables
         */
        public java.util.List < String > getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String dbName; 
            private java.util.List < String > tables; 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List < String > tables) {
                this.tables = tables;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
}
