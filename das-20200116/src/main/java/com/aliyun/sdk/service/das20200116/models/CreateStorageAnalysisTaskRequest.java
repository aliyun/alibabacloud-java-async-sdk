// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateStorageAnalysisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageAnalysisTaskRequest</p>
 */
public class CreateStorageAnalysisTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
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
         * <p>The database name. If you specify a database, the operation analyzes the storage usage of the specified database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb01</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID. For ApsaraDB for MongoDB instances, you can use this parameter to specify a node for storage analysis. You can call the <a href="https://help.aliyun.com/document_detail/123802.html">DescribeRoleZoneInfo</a> operation to query the information about nodes of an ApsaraDB for MongoDB instance.</p>
         * <ul>
         * <li>If you set this parameter to a value in the <strong>InsName</strong> format, such as <code>d-bp1872fa24d5****</code>, you can call this operation to analyze the hidden node that corresponds to the node ID.</li>
         * <li>If you set this parameter to a value in the <code>InsName#RoleId</code> format, such as <code>d-bp1872fa24d5****#299****5</code>, you can call this operation to analyze the specified node.</li>
         * </ul>
         * <blockquote>
         * <p> If you run a storage analysis task on an ApsaraDB for MongoDB replica set instance and you do not specify this parameter, only the hidden node of the instance is analyzed by default. If you run a storage analysis task on an ApsaraDB for MongoDB sharded cluster instance, we recommend that you set this parameter to specify a node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23302528</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The table name. If you specify a table in the specified database, the operation analyzes the storage usage of the specified table. If you specify a table, you must also specify the database to which the table belongs by using <strong>DbName</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
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
