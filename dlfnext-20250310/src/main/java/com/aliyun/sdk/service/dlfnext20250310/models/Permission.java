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

    @com.aliyun.core.annotation.NameInMap("columns")
    private Columns columns;

    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("function")
    private String function;

    @com.aliyun.core.annotation.NameInMap("principal")
    private String principal;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("rowFilter")
    private RowFilter rowFilter;

    @com.aliyun.core.annotation.NameInMap("table")
    private String table;

    @com.aliyun.core.annotation.NameInMap("view")
    private String view;

    private Permission(Builder builder) {
        this.access = builder.access;
        this.columns = builder.columns;
        this.database = builder.database;
        this.expireTime = builder.expireTime;
        this.function = builder.function;
        this.principal = builder.principal;
        this.resourceType = builder.resourceType;
        this.rowFilter = builder.rowFilter;
        this.table = builder.table;
        this.view = builder.view;
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
     * @return columns
     */
    public Columns getColumns() {
        return this.columns;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return function
     */
    public String getFunction() {
        return this.function;
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
     * @return rowFilter
     */
    public RowFilter getRowFilter() {
        return this.rowFilter;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return view
     */
    public String getView() {
        return this.view;
    }

    public static final class Builder {
        private String access; 
        private Columns columns; 
        private String database; 
        private String expireTime; 
        private String function; 
        private String principal; 
        private String resourceType; 
        private RowFilter rowFilter; 
        private String table; 
        private String view; 

        private Builder() {
        } 

        private Builder(Permission model) {
            this.access = model.access;
            this.columns = model.columns;
            this.database = model.database;
            this.expireTime = model.expireTime;
            this.function = model.function;
            this.principal = model.principal;
            this.resourceType = model.resourceType;
            this.rowFilter = model.rowFilter;
            this.table = model.table;
            this.view = model.view;
        } 

        /**
         * access.
         */
        public Builder access(String access) {
            this.access = access;
            return this;
        }

        /**
         * columns.
         */
        public Builder columns(Columns columns) {
            this.columns = columns;
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
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * function.
         */
        public Builder function(String function) {
            this.function = function;
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
         * rowFilter.
         */
        public Builder rowFilter(RowFilter rowFilter) {
            this.rowFilter = rowFilter;
            return this;
        }

        /**
         * table.
         */
        public Builder table(String table) {
            this.table = table;
            return this;
        }

        /**
         * view.
         */
        public Builder view(String view) {
            this.view = view;
            return this;
        }

        public Permission build() {
            return new Permission(this);
        } 

    } 

    /**
     * 
     * {@link Permission} extends {@link TeaModel}
     *
     * <p>Permission</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columnNames")
        private java.util.List<String> columnNames;

        @com.aliyun.core.annotation.NameInMap("excludedColumnNames")
        private java.util.List<String> excludedColumnNames;

        private Columns(Builder builder) {
            this.columnNames = builder.columnNames;
            this.excludedColumnNames = builder.excludedColumnNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnNames
         */
        public java.util.List<String> getColumnNames() {
            return this.columnNames;
        }

        /**
         * @return excludedColumnNames
         */
        public java.util.List<String> getExcludedColumnNames() {
            return this.excludedColumnNames;
        }

        public static final class Builder {
            private java.util.List<String> columnNames; 
            private java.util.List<String> excludedColumnNames; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.columnNames = model.columnNames;
                this.excludedColumnNames = model.excludedColumnNames;
            } 

            /**
             * columnNames.
             */
            public Builder columnNames(java.util.List<String> columnNames) {
                this.columnNames = columnNames;
                return this;
            }

            /**
             * excludedColumnNames.
             */
            public Builder excludedColumnNames(java.util.List<String> excludedColumnNames) {
                this.excludedColumnNames = excludedColumnNames;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
}
