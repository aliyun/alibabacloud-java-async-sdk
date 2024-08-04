// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableRequest} extends {@link RequestModel}
 *
 * <p>DescribeTableRequest</p>
 */
public class DescribeTableRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Table")
    @com.aliyun.core.annotation.Validation(required = true)
    private String table;

    private DescribeTableRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.database = builder.database;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.schema = builder.schema;
        this.secretArn = builder.secretArn;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return secretArn
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder extends Request.Builder<DescribeTableRequest, Builder> {
        private String DBInstanceId; 
        private String database; 
        private Long ownerId; 
        private String regionId; 
        private String schema; 
        private String secretArn; 
        private String table; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTableRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.database = request.database;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.schema = request.schema;
            this.secretArn = request.secretArn;
            this.table = request.table;
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
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the schema to which the table belongs.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the access credential for the created Data API account. You can call the CreateSecret operation to create an access credential.
         * <p>
         * 
         * >  To call the DescribeTable operation as a Resource Access Management (RAM) user, the RAM user must have the permissions to call the UseSecret or GetSecretValue operation on the ARN of the access credential.
         */
        public Builder secretArn(String secretArn) {
            this.putQueryParameter("SecretArn", secretArn);
            this.secretArn = secretArn;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder table(String table) {
            this.putQueryParameter("Table", table);
            this.table = table;
            return this;
        }

        @Override
        public DescribeTableRequest build() {
            return new DescribeTableRequest(this);
        } 

    } 

}
