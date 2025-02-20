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
 * {@link LineageTable} extends {@link TeaModel}
 *
 * <p>LineageTable</p>
 */
public class LineageTable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<LineageColumn> columns;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map<String, ?> properties;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("with")
    private java.util.Map<String, ?> with;

    private LineageTable(Builder builder) {
        this.columns = builder.columns;
        this.id = builder.id;
        this.properties = builder.properties;
        this.tableName = builder.tableName;
        this.with = builder.with;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LineageTable create() {
        return builder().build();
    }

    /**
     * @return columns
     */
    public java.util.List<LineageColumn> getColumns() {
        return this.columns;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return with
     */
    public java.util.Map<String, ?> getWith() {
        return this.with;
    }

    public static final class Builder {
        private java.util.List<LineageColumn> columns; 
        private String id; 
        private java.util.Map<String, ?> properties; 
        private String tableName; 
        private java.util.Map<String, ?> with; 

        /**
         * columns.
         */
        public Builder columns(java.util.List<LineageColumn> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * properties.
         */
        public Builder properties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * with.
         */
        public Builder with(java.util.Map<String, ?> with) {
            this.with = with;
            return this;
        }

        public LineageTable build() {
            return new LineageTable(this);
        } 

    } 

}
