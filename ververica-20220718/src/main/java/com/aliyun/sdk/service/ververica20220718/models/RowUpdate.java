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
 * {@link RowUpdate} extends {@link TeaModel}
 *
 * <p>RowUpdate</p>
 */
public class RowUpdate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("row")
    private Row row;

    @com.aliyun.core.annotation.NameInMap("rowKind")
    private String rowKind;

    private RowUpdate(Builder builder) {
        this.row = builder.row;
        this.rowKind = builder.rowKind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RowUpdate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return row
     */
    public Row getRow() {
        return this.row;
    }

    /**
     * @return rowKind
     */
    public String getRowKind() {
        return this.rowKind;
    }

    public static final class Builder {
        private Row row; 
        private String rowKind; 

        private Builder() {
        } 

        private Builder(RowUpdate model) {
            this.row = model.row;
            this.rowKind = model.rowKind;
        } 

        /**
         * row.
         */
        public Builder row(Row row) {
            this.row = row;
            return this;
        }

        /**
         * rowKind.
         */
        public Builder rowKind(String rowKind) {
            this.rowKind = rowKind;
            return this;
        }

        public RowUpdate build() {
            return new RowUpdate(this);
        } 

    } 

}
