// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeQueryExplainRequest} extends {@link RequestModel}
 *
 * <p>DescribeQueryExplainRequest</p>
 */
public class DescribeQueryExplainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    private DescribeQueryExplainRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.schema = builder.schema;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryExplainRequest create() {
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
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<DescribeQueryExplainRequest, Builder> {
        private String dbName; 
        private String instanceId; 
        private String nodeId; 
        private String schema; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQueryExplainRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.schema = request.schema;
            this.sql = request.sql;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.putBodyParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test where name = &quot;mockUser&quot;</p>
         */
        public Builder sql(String sql) {
            this.putBodyParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public DescribeQueryExplainRequest build() {
            return new DescribeQueryExplainRequest(this);
        } 

    } 

}
