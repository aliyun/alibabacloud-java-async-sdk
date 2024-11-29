// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAsyncErrorRequestStatByCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncErrorRequestStatByCodeRequest</p>
 */
public class GetAsyncErrorRequestStatByCodeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Start")
    private Long start;

    private GetAsyncErrorRequestStatByCodeRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestStatByCodeRequest create() {
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
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetAsyncErrorRequestStatByCodeRequest, Builder> {
        private String dbName; 
        private Long end; 
        private String instanceId; 
        private String nodeId; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncErrorRequestStatByCodeRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.end = request.end;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.start = request.start;
        } 

        /**
         * <p>The name of a database.</p>
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
         * <p> This parameter must be specified for PolarDB for MySQL clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-wz9s658475e58****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The start time must be within the storage duration of the SQL Explorer feature of the database instance and can be up to 90 days earlier than the current time.</p>
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
        public GetAsyncErrorRequestStatByCodeRequest build() {
            return new GetAsyncErrorRequestStatByCodeRequest(this);
        } 

    } 

}
