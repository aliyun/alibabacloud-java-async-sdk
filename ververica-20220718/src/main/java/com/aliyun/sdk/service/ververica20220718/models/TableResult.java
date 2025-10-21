// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link TableResult} extends {@link TeaModel}
 *
 * <p>TableResult</p>
 */
public class TableResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("rowUpdates")
    private java.util.List<RowUpdate> rowUpdates;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    private TableResult(Builder builder) {
        this.rowUpdates = builder.rowUpdates;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rowUpdates
     */
    public java.util.List<RowUpdate> getRowUpdates() {
        return this.rowUpdates;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private java.util.List<RowUpdate> rowUpdates; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(TableResult model) {
            this.rowUpdates = model.rowUpdates;
            this.tableName = model.tableName;
        } 

        /**
         * rowUpdates.
         */
        public Builder rowUpdates(java.util.List<RowUpdate> rowUpdates) {
            this.rowUpdates = rowUpdates;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableResult build() {
            return new TableResult(this);
        } 

    } 

}
