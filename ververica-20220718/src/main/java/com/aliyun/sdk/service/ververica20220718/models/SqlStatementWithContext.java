// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SqlStatementWithContext} extends {@link TeaModel}
 *
 * <p>SqlStatementWithContext</p>
 */
public class SqlStatementWithContext extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("additionalDependencies")
    private java.util.List < String > additionalDependencies;

    @com.aliyun.core.annotation.NameInMap("batchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean batchMode;

    @com.aliyun.core.annotation.NameInMap("catalog")
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("flinkConfiguration")
    private java.util.Map < String, ? > flinkConfiguration;

    @com.aliyun.core.annotation.NameInMap("statement")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statement;

    @com.aliyun.core.annotation.NameInMap("versionName")
    private String versionName;

    private SqlStatementWithContext(Builder builder) {
        this.additionalDependencies = builder.additionalDependencies;
        this.batchMode = builder.batchMode;
        this.catalog = builder.catalog;
        this.database = builder.database;
        this.flinkConfiguration = builder.flinkConfiguration;
        this.statement = builder.statement;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlStatementWithContext create() {
        return builder().build();
    }

    /**
     * @return additionalDependencies
     */
    public java.util.List < String > getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    /**
     * @return batchMode
     */
    public Boolean getBatchMode() {
        return this.batchMode;
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return flinkConfiguration
     */
    public java.util.Map < String, ? > getFlinkConfiguration() {
        return this.flinkConfiguration;
    }

    /**
     * @return statement
     */
    public String getStatement() {
        return this.statement;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private java.util.List < String > additionalDependencies; 
        private Boolean batchMode; 
        private String catalog; 
        private String database; 
        private java.util.Map < String, ? > flinkConfiguration; 
        private String statement; 
        private String versionName; 

        /**
         * additionalDependencies.
         */
        public Builder additionalDependencies(java.util.List < String > additionalDependencies) {
            this.additionalDependencies = additionalDependencies;
            return this;
        }

        /**
         * batchMode.
         */
        public Builder batchMode(Boolean batchMode) {
            this.batchMode = batchMode;
            return this;
        }

        /**
         * catalog.
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
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
         * flinkConfiguration.
         */
        public Builder flinkConfiguration(java.util.Map < String, ? > flinkConfiguration) {
            this.flinkConfiguration = flinkConfiguration;
            return this;
        }

        /**
         * statement.
         */
        public Builder statement(String statement) {
            this.statement = statement;
            return this;
        }

        /**
         * versionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public SqlStatementWithContext build() {
            return new SqlStatementWithContext(this);
        } 

    } 

}
