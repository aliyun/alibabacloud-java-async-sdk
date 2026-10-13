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
 * {@link AgenticResourceOwner} extends {@link TeaModel}
 *
 * <p>AgenticResourceOwner</p>
 */
public class AgenticResourceOwner extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogAlias")
    private String catalogAlias;

    @com.aliyun.core.annotation.NameInMap("CatalogDataSourceType")
    private String catalogDataSourceType;

    @com.aliyun.core.annotation.NameInMap("CatalogEnvType")
    private String catalogEnvType;

    @com.aliyun.core.annotation.NameInMap("CatalogHost")
    private String catalogHost;

    @com.aliyun.core.annotation.NameInMap("CatalogPort")
    private String catalogPort;

    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.NameInMap("DataSourceUuid")
    private String dataSourceUuid;

    @com.aliyun.core.annotation.NameInMap("DatabaseQualifiedName")
    private String databaseQualifiedName;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("GrantBy")
    private String grantBy;

    @com.aliyun.core.annotation.NameInMap("GrantFrom")
    private String grantFrom;

    @com.aliyun.core.annotation.NameInMap("OwnerPrincipalId")
    private String ownerPrincipalId;

    @com.aliyun.core.annotation.NameInMap("OwnerPrincipalType")
    private String ownerPrincipalType;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private AgenticResourceOwner(Builder builder) {
        this.catalogAlias = builder.catalogAlias;
        this.catalogDataSourceType = builder.catalogDataSourceType;
        this.catalogEnvType = builder.catalogEnvType;
        this.catalogHost = builder.catalogHost;
        this.catalogPort = builder.catalogPort;
        this.catalogUuid = builder.catalogUuid;
        this.dataSourceUuid = builder.dataSourceUuid;
        this.databaseQualifiedName = builder.databaseQualifiedName;
        this.databaseUuid = builder.databaseUuid;
        this.grantBy = builder.grantBy;
        this.grantFrom = builder.grantFrom;
        this.ownerPrincipalId = builder.ownerPrincipalId;
        this.ownerPrincipalType = builder.ownerPrincipalType;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticResourceOwner create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogAlias
     */
    public String getCatalogAlias() {
        return this.catalogAlias;
    }

    /**
     * @return catalogDataSourceType
     */
    public String getCatalogDataSourceType() {
        return this.catalogDataSourceType;
    }

    /**
     * @return catalogEnvType
     */
    public String getCatalogEnvType() {
        return this.catalogEnvType;
    }

    /**
     * @return catalogHost
     */
    public String getCatalogHost() {
        return this.catalogHost;
    }

    /**
     * @return catalogPort
     */
    public String getCatalogPort() {
        return this.catalogPort;
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return dataSourceUuid
     */
    public String getDataSourceUuid() {
        return this.dataSourceUuid;
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
     * @return grantBy
     */
    public String getGrantBy() {
        return this.grantBy;
    }

    /**
     * @return grantFrom
     */
    public String getGrantFrom() {
        return this.grantFrom;
    }

    /**
     * @return ownerPrincipalId
     */
    public String getOwnerPrincipalId() {
        return this.ownerPrincipalId;
    }

    /**
     * @return ownerPrincipalType
     */
    public String getOwnerPrincipalType() {
        return this.ownerPrincipalType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String catalogAlias; 
        private String catalogDataSourceType; 
        private String catalogEnvType; 
        private String catalogHost; 
        private String catalogPort; 
        private String catalogUuid; 
        private String dataSourceUuid; 
        private String databaseQualifiedName; 
        private String databaseUuid; 
        private String grantBy; 
        private String grantFrom; 
        private String ownerPrincipalId; 
        private String ownerPrincipalType; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(AgenticResourceOwner model) {
            this.catalogAlias = model.catalogAlias;
            this.catalogDataSourceType = model.catalogDataSourceType;
            this.catalogEnvType = model.catalogEnvType;
            this.catalogHost = model.catalogHost;
            this.catalogPort = model.catalogPort;
            this.catalogUuid = model.catalogUuid;
            this.dataSourceUuid = model.dataSourceUuid;
            this.databaseQualifiedName = model.databaseQualifiedName;
            this.databaseUuid = model.databaseUuid;
            this.grantBy = model.grantBy;
            this.grantFrom = model.grantFrom;
            this.ownerPrincipalId = model.ownerPrincipalId;
            this.ownerPrincipalType = model.ownerPrincipalType;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>The instance alias. This display property comes from the catalog to which the resource belongs and is used only for frontend display to align with the data permission list. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>Production database</p>
         */
        public Builder catalogAlias(String catalogAlias) {
            this.catalogAlias = catalogAlias;
            return this;
        }

        /**
         * <p>The instance data source type, used only for frontend display. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder catalogDataSourceType(String catalogDataSourceType) {
            this.catalogDataSourceType = catalogDataSourceType;
            return this;
        }

        /**
         * <p>The instance environment type, used only for frontend display. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder catalogEnvType(String catalogEnvType) {
            this.catalogEnvType = catalogEnvType;
            return this;
        }

        /**
         * <p>The instance host, used only for frontend display. Built-in sample data sources are masked as ******. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxxxxxx.mysql.rds.aliyuncs.com</p>
         */
        public Builder catalogHost(String catalogHost) {
            this.catalogHost = catalogHost;
            return this;
        }

        /**
         * <p>The instance port, used only for frontend display. Built-in sample data sources are masked as ******. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder catalogPort(String catalogPort) {
            this.catalogPort = catalogPort;
            return this;
        }

        /**
         * <p>The UUID of the catalog to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-5d9fbt8wW4AnGZNddXg4f</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The UUID of the instance data source to which the resource belongs. It is used only for frontend display and instance locating. Non-sensitive connection information is not masked. It is populated only in the My Assets or Managed Resources query scenarios and is null in other scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>dsc-HZ-3f2b9a7c1d</p>
         */
        public Builder dataSourceUuid(String dataSourceUuid) {
            this.dataSourceUuid = dataSourceUuid;
            return this;
        }

        /**
         * <p>The fully qualified name of the database. It has a value only when ResourceType is DATABASE and is populated by the downstream service, which facilitates direct frontend display. For MySQL, it is the database name itself. For PostgreSQL or SQL Server, it is in the format of DatabaseName.SchemaName.</p>
         * 
         * <strong>example:</strong>
         * <p>finance.public</p>
         */
        public Builder databaseQualifiedName(String databaseQualifiedName) {
            this.databaseQualifiedName = databaseQualifiedName;
            return this;
        }

        /**
         * <p>The UUID of the database. It has a value only when ResourceType is DATABASE.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-vXR1ezNGjiDjiV13Gos1N</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The principal ID of the operator who registered the ownership relationship. The downstream service does not return this field in the My Assets query scenario, and the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_6ieggks7zuy6gpfdmgzsjdso</p>
         */
        public Builder grantBy(String grantBy) {
            this.grantBy = grantBy;
            return this;
        }

        /**
         * <p>The source channel of the ownership. CONSOLE indicates manual registration in the console. Other values indicate that the ownership is written by the built-in system. The downstream service does not return this field in the My Assets query scenario, and the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSOLE</p>
         */
        public Builder grantFrom(String grantFrom) {
            this.grantFrom = grantFrom;
            return this;
        }

        /**
         * <p>The principal ID of the owner. This is the internal principal ID of the gateway with a usr_ or agt_ prefix, not the Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_wlwp5a7uruanebg5bbdqqf5n</p>
         */
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }

        /**
         * <p>The principal type of the owner. Valid values:</p>
         * <ul>
         * <li>USER: Human user.</li>
         * <li>AGENT: Managed agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder ownerPrincipalType(String ownerPrincipalType) {
            this.ownerPrincipalType = ownerPrincipalType;
            return this;
        }

        /**
         * <p>The ownership level. Valid values:</p>
         * <ul>
         * <li>INSTANCE: Instance-level ownership. The coordinate includes only CatalogUuid.</li>
         * <li>DATABASE: Database-level ownership. The coordinate includes CatalogUuid and DatabaseUuid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public AgenticResourceOwner build() {
            return new AgenticResourceOwner(this);
        } 

    } 

}
