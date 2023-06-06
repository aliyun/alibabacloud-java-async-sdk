// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHistoricalAgentSkillGroupReportRequest} extends {@link RequestModel}
 *
 * <p>ListHistoricalAgentSkillGroupReportRequest</p>
 */
public class ListHistoricalAgentSkillGroupReportRequest extends Request {
    @Body
    @NameInMap("AgentIdList")
    private String agentIdList;

    @Query
    @NameInMap("EndTime")
    @Validation(maximum = 4133952000000D)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SkillGroupIdList")
    private String skillGroupIdList;

    @Query
    @NameInMap("StartTime")
    @Validation(maximum = 4133952000000D)
    private Long startTime;

    private ListHistoricalAgentSkillGroupReportRequest(Builder builder) {
        super(builder);
        this.agentIdList = builder.agentIdList;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupIdList = builder.skillGroupIdList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHistoricalAgentSkillGroupReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIdList
     */
    public String getAgentIdList() {
        return this.agentIdList;
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
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListHistoricalAgentSkillGroupReportRequest, Builder> {
        private String agentIdList; 
        private Long endTime; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupIdList; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListHistoricalAgentSkillGroupReportRequest request) {
            super(request);
            this.agentIdList = request.agentIdList;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillGroupIdList = request.skillGroupIdList;
            this.startTime = request.startTime;
        } 

        /**
         * AgentIdList.
         */
        public Builder agentIdList(String agentIdList) {
            this.putBodyParameter("AgentIdList", agentIdList);
            this.agentIdList = agentIdList;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
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
         * SkillGroupIdList.
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListHistoricalAgentSkillGroupReportRequest build() {
            return new ListHistoricalAgentSkillGroupReportRequest(this);
        } 

    } 

}
