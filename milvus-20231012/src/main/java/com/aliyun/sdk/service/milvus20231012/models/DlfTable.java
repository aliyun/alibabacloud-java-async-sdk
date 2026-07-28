// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link DlfTable} extends {@link TeaModel}
 *
 * <p>DlfTable</p>
 */
public class DlfTable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("tableFormat")
    private String tableFormat;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("tableType")
    private String tableType;

    private DlfTable(Builder builder) {
        this.description = builder.description;
        this.location = builder.location;
        this.tableFormat = builder.tableFormat;
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DlfTable create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return tableFormat
     */
    public String getTableFormat() {
        return this.tableFormat;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    public static final class Builder {
        private String description; 
        private String location; 
        private String tableFormat; 
        private String tableName; 
        private String tableType; 

        private Builder() {
        } 

        private Builder(DlfTable model) {
            this.description = model.description;
            this.location = model.location;
            this.tableFormat = model.tableFormat;
            this.tableName = model.tableName;
            this.tableType = model.tableType;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * tableFormat.
         */
        public Builder tableFormat(String tableFormat) {
            this.tableFormat = tableFormat;
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
         * tableType.
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        public DlfTable build() {
            return new DlfTable(this);
        } 

    } 

}
