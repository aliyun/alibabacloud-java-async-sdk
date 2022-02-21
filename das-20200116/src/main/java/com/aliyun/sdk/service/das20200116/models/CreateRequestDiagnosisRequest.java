// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRequestDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateRequestDiagnosisRequest</p>
 */
public class CreateRequestDiagnosisRequest extends Request {
    @Query
    @NameInMap("Database")
    private String database;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("Sql")
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

        private Builder(CreateRequestDiagnosisRequest response) {
            super(response);
            this.database = response.database;
            this.instanceId = response.instanceId;
            this.nodeId = response.nodeId;
            this.sql = response.sql;
        } 

        /**
         * Database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Sql.
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
