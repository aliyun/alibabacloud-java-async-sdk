// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPfsSqlSampleRequest} extends {@link RequestModel}
 *
 * <p>GetPfsSqlSampleRequest</p>
 */
public class GetPfsSqlSampleRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("NodeId")
    private String nodeId;

    @Body
    @NameInMap("SqlId")
    private String sqlId;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    private GetPfsSqlSampleRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.sqlId = builder.sqlId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPfsSqlSampleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetPfsSqlSampleRequest, Builder> {
        private Long endTime; 
        private String instanceId; 
        private String nodeId; 
        private String sqlId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetPfsSqlSampleRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.sqlId = request.sqlId;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time. You can query the data of up to seven days within the last month.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The instance ID.
         * <p>
         * 
         * >  Only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters are supported.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  This parameter must be specified for ApsaraDB RDS for MySQL Cluster Edition instances and PolarDB for MySQL clusters.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The SQL ID.
         */
        public Builder sqlId(String sqlId) {
            this.putBodyParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetPfsSqlSampleRequest build() {
            return new GetPfsSqlSampleRequest(this);
        } 

    } 

}
