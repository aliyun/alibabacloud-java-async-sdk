// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListInstanceResourceTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResourceTablesResponseBody</p>
 */
public class ListInstanceResourceTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<Tables> tables;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListInstanceResourceTablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tables = builder.tables;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourceTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tables
     */
    public java.util.List<Tables> getTables() {
        return this.tables;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tables> tables; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListInstanceResourceTablesResponseBody model) {
            this.requestId = model.requestId;
            this.tables = model.tables;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>01D22D08-BA20-5F35-8302-99115F288220</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceResourceTablesResponseBody build() {
            return new ListInstanceResourceTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResourceTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResourceTablesResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
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

            private Builder() {
            } 

            private Builder(Tables model) {
                this.tableName = model.tableName;
            } 

            /**
             * TableName.
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
}
