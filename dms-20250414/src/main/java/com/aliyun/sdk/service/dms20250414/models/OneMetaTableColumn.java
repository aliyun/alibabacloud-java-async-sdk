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
 * {@link OneMetaTableColumn} extends {@link TeaModel}
 *
 * <p>OneMetaTableColumn</p>
 */
public class OneMetaTableColumn extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("ColumnType")
    private String columnType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineMeta")
    private OneMetaTableColumnEngineMeta engineMeta;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    private OneMetaTableColumn(Builder builder) {
        this.columnName = builder.columnName;
        this.columnType = builder.columnType;
        this.description = builder.description;
        this.engineMeta = builder.engineMeta;
        this.position = builder.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaTableColumn create() {
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
    public OneMetaTableColumnEngineMeta getEngineMeta() {
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
        private OneMetaTableColumnEngineMeta engineMeta; 
        private Integer position; 

        private Builder() {
        } 

        private Builder(OneMetaTableColumn model) {
            this.columnName = model.columnName;
            this.columnType = model.columnType;
            this.description = model.description;
            this.engineMeta = model.engineMeta;
            this.position = model.position;
        } 

        /**
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * ColumnType.
         */
        public Builder columnType(String columnType) {
            this.columnType = columnType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EngineMeta.
         */
        public Builder engineMeta(OneMetaTableColumnEngineMeta engineMeta) {
            this.engineMeta = engineMeta;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        public OneMetaTableColumn build() {
            return new OneMetaTableColumn(this);
        } 

    } 

}
