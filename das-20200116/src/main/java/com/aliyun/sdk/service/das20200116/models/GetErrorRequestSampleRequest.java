// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetErrorRequestSampleRequest} extends {@link RequestModel}
 *
 * <p>GetErrorRequestSampleRequest</p>
 */
public class GetErrorRequestSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("End")
    private Long end;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    private String sqlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    private Long start;

    private GetErrorRequestSampleRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.sqlId = builder.sqlId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetErrorRequestSampleRequest create() {
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
     * @return end
     */
    public Long getEnd() {
        return this.end;
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
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetErrorRequestSampleRequest, Builder> {
        private String dbName; 
        private Long end; 
        private String instanceId; 
        private String nodeId; 
        private String sqlId; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetErrorRequestSampleRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.sqlId = request.sqlId;
            this.start = request.start;
        } 

        /**
         * The name of the database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. The interval cannot exceed 24 hours.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
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
         * >  You must specify the node ID if your database instance is a PolarDB for MySQL cluster.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The SQL query ID. You can call the [GetAsyncErrorRequestListByCode](~~410746~~) operation to query the ID of the SQL query for which MySQL error code is returned.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The start time must be within the storage duration of the SQL Explorer feature of the database instance, and can be up to 90 days earlier than the current time.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetErrorRequestSampleRequest build() {
            return new GetErrorRequestSampleRequest(this);
        } 

    } 

}
