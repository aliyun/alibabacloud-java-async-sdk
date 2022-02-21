// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutonomousNotifyEventsInRangeRequest} extends {@link RequestModel}
 *
 * <p>GetAutonomousNotifyEventsInRangeRequest</p>
 */
public class GetAutonomousNotifyEventsInRangeRequest extends Request {
    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("EventContext")
    private String eventContext;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("MinLevel")
    private String minLevel;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("PageOffset")
    private String pageOffset;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("__context")
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

        private Builder(GetAutonomousNotifyEventsInRangeRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.eventContext = response.eventContext;
            this.instanceId = response.instanceId;
            this.level = response.level;
            this.minLevel = response.minLevel;
            this.nodeId = response.nodeId;
            this.pageOffset = response.pageOffset;
            this.pageSize = response.pageSize;
            this.startTime = response.startTime;
            this.context = response.context;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EventContext.
         */
        public Builder eventContext(String eventContext) {
            this.putQueryParameter("EventContext", eventContext);
            this.eventContext = eventContext;
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
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * MinLevel.
         */
        public Builder minLevel(String minLevel) {
            this.putQueryParameter("MinLevel", minLevel);
            this.minLevel = minLevel;
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
         * PageOffset.
         */
        public Builder pageOffset(String pageOffset) {
            this.putQueryParameter("PageOffset", pageOffset);
            this.pageOffset = pageOffset;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * __context.
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
