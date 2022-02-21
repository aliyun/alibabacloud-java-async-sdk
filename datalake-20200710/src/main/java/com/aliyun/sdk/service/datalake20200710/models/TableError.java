// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableError} extends {@link TeaModel}
 *
 * <p>TableError</p>
 */
public class TableError extends TeaModel {
    @NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @NameInMap("TableName")
    private String tableName;

    private TableError(Builder builder) {
        this.errorDetail = builder.errorDetail;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableError create() {
        return builder().build();
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private ErrorDetail errorDetail; 
        private String tableName; 

        /**
         * ErrorDetail.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableError build() {
            return new TableError(this);
        } 

    } 

}
