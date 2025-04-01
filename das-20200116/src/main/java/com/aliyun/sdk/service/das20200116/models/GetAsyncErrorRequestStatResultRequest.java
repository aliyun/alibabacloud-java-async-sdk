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
 * {@link GetAsyncErrorRequestStatResultRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncErrorRequestStatResultRequest</p>
 */
public class GetAsyncErrorRequestStatResultRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SqlIdList")
    private String sqlIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    private Long start;

    private GetAsyncErrorRequestStatResultRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.sqlIdList = builder.sqlIdList;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestStatResultRequest create() {
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
     * @return sqlIdList
     */
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetAsyncErrorRequestStatResultRequest, Builder> {
        private String dbName; 
        private Long end; 
        private String instanceId; 
        private String nodeId; 
        private String sqlIdList; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncErrorRequestStatResultRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.sqlIdList = request.sqlIdList;
            this.start = request.start;
        } 

        /**
         * <p>The name of the database.</p>
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
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time. The interval between the start time and the end time cannot exceed 24 hours.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1642566830000</p>
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> This parameter must be specified for PolarDB for MySQL instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp179lg03445l****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The ID of the SQL template. Separate multiple SQL IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/410746.html">GetAsyncErrorRequestListByCode</a> operation to query the ID of the SQL query for which MySQL error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ad78a4e7d3ce81590c9dc2d5f4bc****,0f92feacd92c048b06a16617a633****</p>
         */
        public Builder sqlIdList(String sqlIdList) {
            this.putQueryParameter("SqlIdList", sqlIdList);
            this.sqlIdList = sqlIdList;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The beginning of the time range to query must be within the storage duration of the database instance and can be up to 90 days earlier than the current time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1642556990714</p>
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetAsyncErrorRequestStatResultRequest build() {
            return new GetAsyncErrorRequestStatResultRequest(this);
        } 

    } 

}
