// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AgenticTableColumn} extends {@link TeaModel}
 *
 * <p>AgenticTableColumn</p>
 */
public class AgenticTableColumn extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("ColumnType")
    private String columnType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineMeta")
    private AgenticTableColumnEngineMeta engineMeta;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    private AgenticTableColumn(Builder builder) {
        this.columnName = builder.columnName;
        this.columnType = builder.columnType;
        this.description = builder.description;
        this.engineMeta = builder.engineMeta;
        this.position = builder.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticTableColumn create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return columnType
     */
    public String getColumnType() {
        return this.columnType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return engineMeta
     */
    public AgenticTableColumnEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return this.position;
    }

    public static final class Builder {
        private String columnName; 
        private String columnType; 
        private String description; 
        private AgenticTableColumnEngineMeta engineMeta; 
        private Integer position; 

        private Builder() {
        } 

        private Builder(AgenticTableColumn model) {
            this.columnName = model.columnName;
            this.columnType = model.columnType;
            this.description = model.description;
            this.engineMeta = model.engineMeta;
            this.position = model.position;
        } 

        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The column type, which is the native type definition of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        public Builder columnType(String columnType) {
            this.columnType = columnType;
            return this;
        }

        /**
         * <p>The column description.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary key ID</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The engine metadata of the column.</p>
         */
        public Builder engineMeta(AgenticTableColumnEngineMeta engineMeta) {
            this.engineMeta = engineMeta;
            return this;
        }

        /**
         * <p>The position of the column in the table, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        public AgenticTableColumn build() {
            return new AgenticTableColumn(this);
        } 

    } 

}
