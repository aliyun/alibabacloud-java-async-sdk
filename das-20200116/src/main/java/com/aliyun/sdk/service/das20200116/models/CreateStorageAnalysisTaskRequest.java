// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageAnalysisTaskRequest</p>
 */
public class CreateStorageAnalysisTaskRequest extends Request {
    @Query
    @NameInMap("DbName")
    private String dbName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private CreateStorageAnalysisTaskRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageAnalysisTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<CreateStorageAnalysisTaskRequest, Builder> {
        private String dbName; 
        private String instanceId; 
        private String nodeId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CreateStorageAnalysisTaskRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.tableName = request.tableName;
        } 

        /**
         * The database name. If you specify a database, the operation analyzes the storage usage of the specified database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  This parameter is reserved.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The table name. If you specify a table in the specified database, the operation analyzes the storage usage of the specified table. If you specify a table, you must also specify the database to which the table belongs by using **DbName**.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public CreateStorageAnalysisTaskRequest build() {
            return new CreateStorageAnalysisTaskRequest(this);
        } 

    } 

}
