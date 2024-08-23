// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteStatementRequest} extends {@link RequestModel}
 *
 * <p>ExecuteStatementRequest</p>
 */
public class ExecuteStatementRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunType")
    private String runType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sql")
    private String sql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sqls")
    private java.util.List < String > sqls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatementName")
    private String statementName;

    private ExecuteStatementRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.ownerId = builder.ownerId;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.runType = builder.runType;
        this.secretArn = builder.secretArn;
        this.sql = builder.sql;
        this.sqls = builder.sqls;
        this.statementName = builder.statementName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteStatementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parameters
     */
    public java.util.List < ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return runType
     */
    public String getRunType() {
        return this.runType;
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
     * @return statementName
     */
    public String getStatementName() {
        return this.statementName;
    }

    public static final class Builder extends Request.Builder<ExecuteStatementRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private Long ownerId; 
        private java.util.List < ? > parameters; 
        private String regionId; 
        private String runType; 
        private String secretArn; 
        private String sql; 
        private java.util.List < String > sqls; 
        private String statementName; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteStatementRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.ownerId = request.ownerId;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.runType = request.runType;
            this.secretArn = request.secretArn;
            this.sql = request.sql;
            this.sqls = request.sqls;
            this.statementName = request.statementName;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The configuration parameters.
         */
        public Builder parameters(java.util.List < ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The execution type. Valid values:
         * <p>
         * 
         * *   synchronous
         * *   asynchronous (not supported)
         */
        public Builder runType(String runType) {
            this.putQueryParameter("RunType", runType);
            this.runType = runType;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the access credential for the created Data API account. You can call the CreateSecret operation to create an access credential.
         * <p>
         * 
         * >  To call the ExecuteStatement operation as a Resource Access Management (RAM) user, the RAM user must have the permissions to call the UseSecret or GetSecretValue operation on the ARN of the access credential.
         */
        public Builder secretArn(String secretArn) {
            this.putQueryParameter("SecretArn", secretArn);
            this.secretArn = secretArn;
            return this;
        }

        /**
         * The SQL statements that you want to execute.
         */
        public Builder sql(String sql) {
            this.putBodyParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        /**
         * The SQL statements.
         */
        public Builder sqls(java.util.List < String > sqls) {
            String sqlsShrink = shrink(sqls, "Sqls", "json");
            this.putBodyParameter("Sqls", sqlsShrink);
            this.sqls = sqls;
            return this;
        }

        /**
         * The name of the set of SQL statements that you want to execute. This parameter takes effect when the RunType parameter is set to asynchronous.
         */
        public Builder statementName(String statementName) {
            this.putQueryParameter("StatementName", statementName);
            this.statementName = statementName;
            return this;
        }

        @Override
        public ExecuteStatementRequest build() {
            return new ExecuteStatementRequest(this);
        } 

    } 

}
