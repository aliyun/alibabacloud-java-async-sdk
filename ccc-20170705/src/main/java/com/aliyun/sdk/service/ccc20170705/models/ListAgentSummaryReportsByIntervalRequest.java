// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentSummaryReportsByIntervalRequest} extends {@link RequestModel}
 *
 * <p>ListAgentSummaryReportsByIntervalRequest</p>
 */
public class ListAgentSummaryReportsByIntervalRequest extends Request {
    @Query
    @NameInMap("AgentIds")
    private String agentIds;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Interval")
    private String interval;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SkillGroupId")
    private String skillGroupId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private ListAgentSummaryReportsByIntervalRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupId = builder.skillGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSummaryReportsByIntervalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIds
     */
    public String getAgentIds() {
        return this.agentIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAgentSummaryReportsByIntervalRequest, Builder> {
        private String agentIds; 
        private String endTime; 
        private String instanceId; 
        private String interval; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentSummaryReportsByIntervalRequest response) {
            super(response);
            this.agentIds = response.agentIds;
            this.endTime = response.endTime;
            this.instanceId = response.instanceId;
            this.interval = response.interval;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.skillGroupId = response.skillGroupId;
            this.startTime = response.startTime;
        } 

        /**
         * AgentIds.
         */
        public Builder agentIds(String agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
            this.agentIds = agentIds;
            return this;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
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

        @Override
        public ListAgentSummaryReportsByIntervalRequest build() {
            return new ListAgentSummaryReportsByIntervalRequest(this);
        } 

    } 

}
