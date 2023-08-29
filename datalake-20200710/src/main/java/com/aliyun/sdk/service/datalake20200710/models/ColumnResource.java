// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ColumnResource} extends {@link TeaModel}
 *
 * <p>ColumnResource</p>
 */
public class ColumnResource extends TeaModel {
    @NameInMap("ColumnNames")
    private java.util.List < String > columnNames;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("TableName")
    private String tableName;

    private ColumnResource(Builder builder) {
        this.columnNames = builder.columnNames;
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnResource create() {
        return builder().build();
    }

    /**
     * @return columnNames
     */
    public java.util.List < String > getColumnNames() {
        return this.columnNames;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private java.util.List < String > columnNames; 
        private String databaseName; 
        private String tableName; 

        /**
         * ColumnNames.
         */
        public Builder columnNames(java.util.List < String > columnNames) {
            this.columnNames = columnNames;
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public ColumnResource build() {
            return new ColumnResource(this);
        } 

    } 

}
