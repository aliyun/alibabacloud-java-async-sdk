// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeCustomAgentMonitorMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomAgentMonitorMetricsRequest</p>
 */
public class DescribeCustomAgentMonitorMetricsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAgentId")
    private String customAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private DescribeCustomAgentMonitorMetricsRequest(Builder builder) {
        super(builder);
        this.customAgentId = builder.customAgentId;
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.queryType = builder.queryType;
        this.startTime = builder.startTime;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomAgentMonitorMetricsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customAgentId
     */
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomAgentMonitorMetricsRequest, Builder> {
        private String customAgentId; 
        private Long endTime; 
        private String granularity; 
        private String queryType; 
        private Long startTime; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomAgentMonitorMetricsRequest request) {
            super(request);
            this.customAgentId = request.customAgentId;
            this.endTime = request.endTime;
            this.granularity = request.granularity;
            this.queryType = request.queryType;
            this.startTime = request.startTime;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The custom agent ID.</p>
         * <ul>
         * <li>Required only when QueryType is set to CustomAgent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ca-a9fd******0lnq4g6c</p>
         */
        public Builder customAgentId(String customAgentId) {
            this.putQueryParameter("CustomAgentId", customAgentId);
            this.customAgentId = customAgentId;
            return this;
        }

        /**
         * <p>The end time of the statistical period (epoch millis).</p>
         * <ul>
         * <li>Note: The maximum time range is 3 months.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1756742400000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The aggregation granularity. Valid values:</p>
         * <ul>
         * <li>DAY: daily. The maximum supported time range is 3 months.</li>
         * <li>HOUR: hourly. The maximum supported time range is 72 hours.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>The statistical scope. Default value: All. Valid values:</p>
         * <ul>
         * <li>Default: default DataAgent sessions.</li>
         * <li>CustomAgent: specified custom agent sessions.</li>
         * <li>All: all sessions in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The start time of the statistical period (epoch millis).</p>
         * <ul>
         * <li>Note: The maximum time range is 3 months.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1756656000000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99fad******qg6c0l4nlacu</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DescribeCustomAgentMonitorMetricsRequest build() {
            return new DescribeCustomAgentMonitorMetricsRequest(this);
        } 

    } 

}
