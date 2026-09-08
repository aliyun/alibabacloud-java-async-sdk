// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListAgentSummaryReportsSinceMidnightRequest} extends {@link RequestModel}
 *
 * <p>ListAgentSummaryReportsSinceMidnightRequest</p>
 */
public class ListAgentSummaryReportsSinceMidnightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIds")
    private String agentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    private ListAgentSummaryReportsSinceMidnightRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSummaryReportsSinceMidnightRequest create() {
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

    public static final class Builder extends Request.Builder<ListAgentSummaryReportsSinceMidnightRequest, Builder> {
        private String agentIds; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentSummaryReportsSinceMidnightRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * <p>Filter by a list of agent IDs, with up to 100 IDs.</p>
         * <blockquote>
         * <p>If the agent ID list is not empty, the system directly queries based on the provided agent ID list. In this case, the pageSize and pageNumber parameters are invalid, and the data is returned directly. For example, if the request parameter is pageNumber = 3, the response parameter will also be pageNumber = 3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;agent1@ccc-test&quot;, &quot;agent2@ccc-test&quot;]</p>
         */
        public Builder agentIds(String agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page number, ranging from 1 to 100. Optional. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, ranging from 1 to 100. Optional. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filter by skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public ListAgentSummaryReportsSinceMidnightRequest build() {
            return new ListAgentSummaryReportsSinceMidnightRequest(this);
        } 

    } 

}
