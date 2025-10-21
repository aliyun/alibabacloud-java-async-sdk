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
 * {@link Row} extends {@link TeaModel}
 *
 * <p>Row</p>
 */
public class Row extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cells")
    private java.util.List<Cell> cells;

    private Row(Builder builder) {
        this.cells = builder.cells;
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
     * @return cells
     */
    public java.util.List<Cell> getCells() {
        return this.cells;
    }

    public static final class Builder {
        private java.util.List<Cell> cells; 

        private Builder() {
        } 

        private Builder(Row model) {
            this.cells = model.cells;
        } 

        /**
         * cells.
         */
        public Builder cells(java.util.List<Cell> cells) {
            this.cells = cells;
            return this;
        }

        public Row build() {
            return new Row(this);
        } 

    } 

}
