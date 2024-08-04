// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StatementData} extends {@link TeaModel}
 *
 * <p>StatementData</p>
 */
public class StatementData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < String > parameters;

    @com.aliyun.core.annotation.NameInMap("SecretArn")
    private String secretArn;

    @com.aliyun.core.annotation.NameInMap("Sql")
    private String sql;

    @com.aliyun.core.annotation.NameInMap("Sqls")
    private java.util.List < String > sqls;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    private StatementData(Builder builder) {
        this.createdAt = builder.createdAt;
        this.database = builder.database;
        this.id = builder.id;
        this.parameters = builder.parameters;
        this.secretArn = builder.secretArn;
        this.sql = builder.sql;
        this.sqls = builder.sqls;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatementData create() {
        return builder().build();
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return parameters
     */
    public java.util.List < String > getParameters() {
        return this.parameters;
    }

    /**
     * @return secretArn
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return sqls
     */
    public java.util.List < String > getSqls() {
        return this.sqls;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String createdAt; 
        private String database; 
        private String id; 
        private java.util.List < String > parameters; 
        private String secretArn; 
        private String sql; 
        private java.util.List < String > sqls; 
        private String status; 
        private String updatedAt; 

        /**
         * CreatedAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List < String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * SecretArn.
         */
        public Builder secretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        /**
         * Sql.
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        /**
         * Sqls.
         */
        public Builder sqls(java.util.List < String > sqls) {
            this.sqls = sqls;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public StatementData build() {
            return new StatementData(this);
        } 

    } 

}
