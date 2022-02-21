// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentStatesRequest} extends {@link RequestModel}
 *
 * <p>ListAgentStatesRequest</p>
 */
public class ListAgentStatesRequest extends Request {
    @Query
    @NameInMap("AgentIds")
    private String agentIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

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
    @NameInMap("State")
    private String state;

    private ListAgentStatesRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupId = builder.skillGroupId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentStatesRequest create() {
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
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListAgentStatesRequest, Builder> {
        private String agentIds; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupId; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentStatesRequest response) {
            super(response);
            this.agentIds = response.agentIds;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.skillGroupId = response.skillGroupId;
            this.state = response.state;
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
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListAgentStatesRequest build() {
            return new ListAgentStatesRequest(this);
        } 

    } 

}
