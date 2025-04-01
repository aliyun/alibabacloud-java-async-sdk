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
 * {@link GetInstanceSqlOptimizeStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceSqlOptimizeStatisticRequest</p>
 */
public class GetInstanceSqlOptimizeStatisticRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterEnable")
    private String filterEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private String threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseMerging")
    private String useMerging;

    private GetInstanceSqlOptimizeStatisticRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.filterEnable = builder.filterEnable;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.startTime = builder.startTime;
        this.threshold = builder.threshold;
        this.useMerging = builder.useMerging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSqlOptimizeStatisticRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filterEnable
     */
    public String getFilterEnable() {
        return this.filterEnable;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return threshold
     */
    public String getThreshold() {
        return this.threshold;
    }

    /**
     * @return useMerging
     */
    public String getUseMerging() {
        return this.useMerging;
    }

    public static final class Builder extends Request.Builder<GetInstanceSqlOptimizeStatisticRequest, Builder> {
        private String endTime; 
        private String filterEnable; 
        private String instanceId; 
        private String nodeId; 
        private String startTime; 
        private String threshold; 
        private String useMerging; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceSqlOptimizeStatisticRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.filterEnable = request.filterEnable;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.startTime = request.startTime;
            this.threshold = request.threshold;
            this.useMerging = request.useMerging;
        } 

        /**
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1662518540764</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to filter instances for which DAS Enterprise Edition is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to <strong>true</strong>, only database instances for which DAS Enterprise Edition is disabled are queried. If you set this parameter to <strong>false</strong>, all database instances are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder filterEnable(String filterEnable) {
            this.putQueryParameter("FilterEnable", filterEnable);
            this.filterEnable = filterEnable;
            return this;
        }

        /**
         * <p>The database instance ID.</p>
         * <blockquote>
         * <p> The database instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-wz90h9560rvdz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> For ApsaraDB RDS for MySQL Cluster Edition instances or PolarDB for MySQL clusters, you must specify the node ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-bp12v7243x012****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1661308902060</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The duration threshold for automatic SQL optimization events. After this parameter is specified, the system collects statistics on automatic SQL optimization events whose duration does not exceed the specified threshold.</p>
         * <blockquote>
         * <p> This parameter is a reserved parameter and does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>Specifies whether to merge automatic SQL optimization events. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: merges automatic SQL optimization events.</li>
         * <li><strong>false</strong>: does not merge automatic SQL optimization events.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is a reserved parameter and does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useMerging(String useMerging) {
            this.putQueryParameter("UseMerging", useMerging);
            this.useMerging = useMerging;
            return this;
        }

        @Override
        public GetInstanceSqlOptimizeStatisticRequest build() {
            return new GetInstanceSqlOptimizeStatisticRequest(this);
        } 

    } 

}
