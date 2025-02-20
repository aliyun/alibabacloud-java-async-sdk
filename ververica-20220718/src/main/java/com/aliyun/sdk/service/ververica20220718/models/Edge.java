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
 * {@link Edge} extends {@link TeaModel}
 *
 * <p>Edge</p>
 */
public class Edge extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columnLineage")
    private java.util.List<Relation> columnLineage;

    @com.aliyun.core.annotation.NameInMap("tableLineage")
    private java.util.List<Relation> tableLineage;

    private Edge(Builder builder) {
        this.columnLineage = builder.columnLineage;
        this.tableLineage = builder.tableLineage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Edge create() {
        return builder().build();
    }

    /**
     * @return columnLineage
     */
    public java.util.List<Relation> getColumnLineage() {
        return this.columnLineage;
    }

    /**
     * @return tableLineage
     */
    public java.util.List<Relation> getTableLineage() {
        return this.tableLineage;
    }

    public static final class Builder {
        private java.util.List<Relation> columnLineage; 
        private java.util.List<Relation> tableLineage; 

        /**
         * columnLineage.
         */
        public Builder columnLineage(java.util.List<Relation> columnLineage) {
            this.columnLineage = columnLineage;
            return this;
        }

        /**
         * tableLineage.
         */
        public Builder tableLineage(java.util.List<Relation> tableLineage) {
            this.tableLineage = tableLineage;
            return this;
        }

        public Edge build() {
            return new Edge(this);
        } 

    } 

}
