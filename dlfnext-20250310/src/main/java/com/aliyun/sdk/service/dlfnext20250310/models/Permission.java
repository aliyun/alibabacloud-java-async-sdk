// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link Permission} extends {@link TeaModel}
 *
 * <p>Permission</p>
 */
public class Permission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("access")
    private String access;

    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("principal")
    private String principal;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    private Permission(Builder builder) {
        this.access = builder.access;
        this.database = builder.database;
        this.principal = builder.principal;
        this.resourceType = builder.resourceType;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Permission create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return access
     */
    public String getAccess() {
        return this.access;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return principal
     */
    public String getPrincipal() {
        return this.principal;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder {
        private String access; 
        private String database; 
        private String principal; 
        private String resourceType; 
        private String table; 

        private Builder() {
        } 

        private Builder(Permission model) {
            this.access = model.access;
            this.database = model.database;
            this.principal = model.principal;
            this.resourceType = model.resourceType;
            this.table = model.table;
        } 

        /**
         * access.
         */
        public Builder access(String access) {
            this.access = access;
            return this;
        }

        /**
         * database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * principal.
         */
        public Builder principal(String principal) {
            this.principal = principal;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.table = table;
            return this;
        }

        public Permission build() {
            return new Permission(this);
        } 

    } 

}
