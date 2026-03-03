// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Row} extends {@link TeaModel}
 *
 * <p>Row</p>
 */
public class Row extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Column> columns;

    private Row(Builder builder) {
        this.columns = builder.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Row create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<Column> getColumns() {
        return this.columns;
    }

    public static final class Builder {
        private java.util.List<Column> columns; 

        private Builder() {
        } 

        private Builder(Row model) {
            this.columns = model.columns;
        } 

        /**
         * Columns.
         */
        public Builder columns(java.util.List<Column> columns) {
            this.columns = columns;
            return this;
        }

        public Row build() {
            return new Row(this);
        } 

    } 

}
