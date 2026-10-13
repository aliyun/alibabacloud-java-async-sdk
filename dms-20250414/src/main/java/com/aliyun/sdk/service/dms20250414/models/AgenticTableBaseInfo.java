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
 * {@link AgenticTableBaseInfo} extends {@link TeaModel}
 *
 * <p>AgenticTableBaseInfo</p>
 */
public class AgenticTableBaseInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.NameInMap("DatabaseQualifiedName")
    private String databaseQualifiedName;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EngineMeta")
    private AgenticTableEngineMeta engineMeta;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    private AgenticTableBaseInfo(Builder builder) {
        this.catalogType = builder.catalogType;
        this.databaseQualifiedName = builder.databaseQualifiedName;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.engineMeta = builder.engineMeta;
        this.name = builder.name;
        this.qualifiedName = builder.qualifiedName;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticTableBaseInfo create() {
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
     * @return databaseQualifiedName
     */
    public String getDatabaseQualifiedName() {
        return this.databaseQualifiedName;
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
    public AgenticTableEngineMeta getEngineMeta() {
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

    public static final class Builder {
        private String catalogType; 
        private String databaseQualifiedName; 
        private String databaseUuid; 
        private String description; 
        private AgenticTableEngineMeta engineMeta; 
        private String name; 
        private String qualifiedName; 
        private String tableType; 

        private Builder() {
        } 

        private Builder(AgenticTableBaseInfo model) {
            this.catalogType = model.catalogType;
            this.databaseQualifiedName = model.databaseQualifiedName;
            this.databaseUuid = model.databaseUuid;
            this.description = model.description;
            this.engineMeta = model.engineMeta;
            this.name = model.name;
            this.qualifiedName = model.qualifiedName;
            this.tableType = model.tableType;
        } 

        /**
         * <p>The type of the catalog to which the table belongs. Valid values:</p>
         * <ul>
         * <li><strong>JDBC</strong>: relational database catalog</li>
         * <li><strong>DataLake</strong>: data lake catalog</li>
         * <li><strong>Dataset</strong>: knowledge base catalog</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JDBC</p>
         */
        public Builder catalogType(String catalogType) {
            this.catalogType = catalogType;
            return this;
        }

        /**
         * <p>The fully qualified name of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>order_db</p>
         */
        public Builder databaseQualifiedName(String databaseQualifiedName) {
            this.databaseQualifiedName = databaseQualifiedName;
            return this;
        }

        /**
         * <p>The UUID of the database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The description of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>Order table</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The engine metadata of the table.</p>
         */
        public Builder engineMeta(AgenticTableEngineMeta engineMeta) {
            this.engineMeta = engineMeta;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The fully qualified name of the table. You can use this name as the TableQualifiedName parameter for GetAgenticTableColumn and GetAgenticTableIndex. For SQL Server, the format is schema name.table name.</p>
         * 
         * <strong>example:</strong>
         * <p>orders</p>
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * <p>The table type. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: regular table</li>
         * <li><strong>VIEW</strong>: view</li>
         * <li><strong>FOREIGN</strong>: foreign table</li>
         * <li><strong>SYNONYM</strong>: synonym, supported only for Oracle data sources</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        public AgenticTableBaseInfo build() {
            return new AgenticTableBaseInfo(this);
        } 

    } 

}
