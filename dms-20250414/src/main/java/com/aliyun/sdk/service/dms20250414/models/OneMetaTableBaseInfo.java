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
 * {@link OneMetaTableBaseInfo} extends {@link TeaModel}
 *
 * <p>OneMetaTableBaseInfo</p>
 */
public class OneMetaTableBaseInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineMeta")
    private OneMetaTableEngineMeta engineMeta;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("TableUuid")
    private String tableUuid;

    private OneMetaTableBaseInfo(Builder builder) {
        this.catalogType = builder.catalogType;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.engineMeta = builder.engineMeta;
        this.name = builder.name;
        this.qualifiedName = builder.qualifiedName;
        this.tableType = builder.tableType;
        this.tableUuid = builder.tableUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaTableBaseInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogType
     */
    public String getCatalogType() {
        return this.catalogType;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
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
    public OneMetaTableEngineMeta getEngineMeta() {
        return this.engineMeta;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return tableUuid
     */
    public String getTableUuid() {
        return this.tableUuid;
    }

    public static final class Builder {
        private String catalogType; 
        private String databaseUuid; 
        private String description; 
        private OneMetaTableEngineMeta engineMeta; 
        private String name; 
        private String qualifiedName; 
        private String tableType; 
        private String tableUuid; 

        private Builder() {
        } 

        private Builder(OneMetaTableBaseInfo model) {
            this.catalogType = model.catalogType;
            this.databaseUuid = model.databaseUuid;
            this.description = model.description;
            this.engineMeta = model.engineMeta;
            this.name = model.name;
            this.qualifiedName = model.qualifiedName;
            this.tableType = model.tableType;
            this.tableUuid = model.tableUuid;
        } 

        /**
         * CatalogType.
         */
        public Builder catalogType(String catalogType) {
            this.catalogType = catalogType;
            return this;
        }

        /**
         * DatabaseUuid.
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
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
        public Builder engineMeta(OneMetaTableEngineMeta engineMeta) {
            this.engineMeta = engineMeta;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * TableType.
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * TableUuid.
         */
        public Builder tableUuid(String tableUuid) {
            this.tableUuid = tableUuid;
            return this;
        }

        public OneMetaTableBaseInfo build() {
            return new OneMetaTableBaseInfo(this);
        } 

    } 

}
