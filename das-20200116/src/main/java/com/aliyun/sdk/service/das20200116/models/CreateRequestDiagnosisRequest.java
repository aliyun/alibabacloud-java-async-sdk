// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRequestDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateRequestDiagnosisRequest</p>
 */
public class CreateRequestDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private CreateRequestDiagnosisRequest(Builder builder) {
        super(builder);
        this.database = builder.database;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRequestDiagnosisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
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
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<CreateRequestDiagnosisRequest, Builder> {
        private String database; 
        private String instanceId; 
        private String nodeId; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(CreateRequestDiagnosisRequest request) {
            super(request);
            this.database = request.database;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.sql = request.sql;
        } 

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>das</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-0iwhhl8gx0ld6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter must be specified for PolarDB for MySQL, PolarDB for PostgreSQL (Compatible with Oracle), and ApsaraDB for MongoDB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>202****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The SQL statement that you want to diagnose.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test where name = &quot;mockUser&quot;</p>
         */
        public Builder sql(String sql) {
            this.putQueryParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public CreateRequestDiagnosisRequest build() {
            return new CreateRequestDiagnosisRequest(this);
        } 

    } 

}
