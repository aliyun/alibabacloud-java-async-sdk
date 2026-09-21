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
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

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
        this.catalogUuid = builder.catalogUuid;
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
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
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
        private String catalogUuid; 
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
            this.catalogUuid = model.catalogUuid;
            this.databaseQualifiedName = model.databaseQualifiedName;
            this.databaseUuid = model.databaseUuid;
            this.grantBy = model.grantBy;
            this.grantFrom = model.grantFrom;
            this.ownerPrincipalId = model.ownerPrincipalId;
            this.ownerPrincipalType = model.ownerPrincipalType;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>The UUID of the Catalog to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-5d9fbt8wW4AnGZNddXg4f</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The qualified name of the database. This field has a value only when ResourceType is DATABASE and the downstream backfills the value. This field is provided for direct display on the frontend. For MySQL, this is the database name itself. For PostgreSQL or SQL Server, this is in the format of DatabaseName.SchemaName.</p>
         * 
         * <strong>example:</strong>
         * <p>finance.public</p>
         */
        public Builder databaseQualifiedName(String databaseQualifiedName) {
            this.databaseQualifiedName = databaseQualifiedName;
            return this;
        }

        /**
         * <p>The UUID of the database. This field has a value only when ResourceType is DATABASE.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-vXR1ezNGjiDjiV13Gos1N</p>
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }

        /**
         * <p>The principal ID of the operator who registered this ownership relationship. In the &quot;My Assets&quot; scenario, the downstream does not return this field, and the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_6ieggks7zuy6gpfdmgzsjdso</p>
         */
        public Builder grantBy(String grantBy) {
            this.grantBy = grantBy;
            return this;
        }

        /**
         * <p>The source channel of the ownership. Valid values:</p>
         * <ul>
         * <li>CONSOLE: Manually registered in the console.</li>
         * <li>Other values: Written by the system built-in ownership mechanism.</li>
         * </ul>
         * <p>In the &quot;My Assets&quot; scenario, the downstream does not return this field, and the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSOLE</p>
         */
        public Builder grantFrom(String grantFrom) {
            this.grantFrom = grantFrom;
            return this;
        }

        /**
         * <p>The Owner principal ID. This is a gateway internal principal ID with the usr_ or agt_ prefix, not an Alibaba Cloud UID.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_wlwp5a7uruanebg5bbdqqf5n</p>
         */
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }

        /**
         * <p>The Owner principal type. Valid values:</p>
         * <ul>
         * <li>USER: Human user.</li>
         * <li>AGENT: Managed Agent.</li>
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
         * <li>INSTANCE: Instance-level ownership. The coordinate contains only CatalogUuid.</li>
         * <li>DATABASE: Database-level ownership. The coordinate contains CatalogUuid + DatabaseUuid.</li>
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
