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
 * {@link GetAutonomousNotifyEventsInRangeRequest} extends {@link RequestModel}
 *
 * <p>GetAutonomousNotifyEventsInRangeRequest</p>
 */
public class GetAutonomousNotifyEventsInRangeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventContext")
    private String eventContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinLevel")
    private String minLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageOffset")
    private String pageOffset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("__context")
    private String context;

    private GetAutonomousNotifyEventsInRangeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventContext = builder.eventContext;
        this.instanceId = builder.instanceId;
        this.level = builder.level;
        this.minLevel = builder.minLevel;
        this.nodeId = builder.nodeId;
        this.pageOffset = builder.pageOffset;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutonomousNotifyEventsInRangeRequest create() {
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
     * @return eventContext
     */
    public String getEventContext() {
        return this.eventContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return minLevel
     */
    public String getMinLevel() {
        return this.minLevel;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return pageOffset
     */
    public String getPageOffset() {
        return this.pageOffset;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<GetAutonomousNotifyEventsInRangeRequest, Builder> {
        private String endTime; 
        private String eventContext; 
        private String instanceId; 
        private String level; 
        private String minLevel; 
        private String nodeId; 
        private String pageOffset; 
        private String pageSize; 
        private String startTime; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(GetAutonomousNotifyEventsInRangeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventContext = request.eventContext;
            this.instanceId = request.instanceId;
            this.level = request.level;
            this.minLevel = request.minLevel;
            this.nodeId = request.nodeId;
            this.pageOffset = request.pageOffset;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.context = request.context;
        } 

        /**
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1568265711221</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder eventContext(String eventContext) {
            this.putQueryParameter("EventContext", eventContext);
            this.eventContext = eventContext;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-18ff4a195d****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The urgency level of the events. If you specify this parameter, the MinLevel parameter does not take effect. Valid values:</p>
         * <ul>
         * <li><strong>Notice</strong>: events for which the system sends notifications.</li>
         * <li><strong>Optimization</strong>: events that need to be optimized.</li>
         * <li><strong>Warn</strong>: events for which the system sends warnings.</li>
         * <li><strong>Critical</strong>: critical events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warn</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The minimum urgency level of the events. Valid values:</p>
         * <ul>
         * <li><strong>Notice</strong>: events for which the system sends notifications.</li>
         * <li><strong>Optimization</strong>: events that need to be optimized.</li>
         * <li><strong>Warn</strong>: events for which the system sends warnings.</li>
         * <li><strong>Critical</strong>: critical events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Notice</p>
         */
        public Builder minLevel(String minLevel) {
            this.putQueryParameter("MinLevel", minLevel);
            this.minLevel = minLevel;
            return this;
        }

        /**
         * <p>The ID of the node in a PolarDB for MySQL cluster. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the node ID returned by the DBNodeId response parameter.</p>
         * <blockquote>
         * <p> You must specify the node ID if your database instance is a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-x****-db-0</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The page number. The value must be a positive integer. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageOffset(String pageOffset) {
            this.putQueryParameter("PageOffset", pageOffset);
            this.pageOffset = pageOffset;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1568269711000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public GetAutonomousNotifyEventsInRangeRequest build() {
            return new GetAutonomousNotifyEventsInRangeRequest(this);
        } 

    } 

}
