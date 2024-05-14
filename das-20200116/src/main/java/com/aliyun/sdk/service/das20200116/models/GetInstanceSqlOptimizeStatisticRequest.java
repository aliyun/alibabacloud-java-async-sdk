// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Specifies whether to filter instances for which DAS Enterprise Edition is enabled. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * >  If you set this parameter to **true**, only database instances for which DAS Enterprise Edition is disabled are queried. If you set this parameter to **false**, all database instances are queried.
         */
        public Builder filterEnable(String filterEnable) {
            this.putQueryParameter("FilterEnable", filterEnable);
            this.filterEnable = filterEnable;
            return this;
        }

        /**
         * The database instance ID.
         * <p>
         * 
         * >  The database instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.
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
         * >  For ApsaraDB RDS for MySQL Cluster Edition instances or PolarDB for MySQL clusters, you must specify the node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The duration threshold for automatic SQL optimization events. After this parameter is specified, the system collects statistics on automatic SQL optimization events whose duration does not exceed the specified threshold.
         * <p>
         * 
         * >  This parameter is a reserved parameter and does not take effect.
         */
        public Builder threshold(String threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * Specifies whether to merge automatic SQL optimization events. Valid values:
         * <p>
         * 
         * *   **true**: merges automatic SQL optimization events.
         * *   **false**: does not merge automatic SQL optimization events.
         * 
         * >  This parameter is a reserved parameter and does not take effect.
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
