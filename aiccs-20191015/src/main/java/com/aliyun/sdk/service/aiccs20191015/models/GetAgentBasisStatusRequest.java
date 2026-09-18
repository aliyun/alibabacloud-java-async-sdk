// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetAgentBasisStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAgentBasisStatusRequest</p>
 */
public class GetAgentBasisStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIds")
    private java.util.List<Long> agentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepIds")
    private java.util.List<Long> depIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    private GetAgentBasisStatusRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentBasisStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIds
     */
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return depIds
     */
    public java.util.List<Long> getDepIds() {
        return this.depIds;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetAgentBasisStatusRequest, Builder> {
        private java.util.List<Long> agentIds; 
        private Integer currentPage; 
        private java.util.List<Long> depIds; 
        private Long endDate; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentBasisStatusRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * <p>A list of agent IDs.</p>
         */
        public Builder agentIds(java.util.List<Long> agentIds) {
            String agentIdsShrink = shrink(agentIds, "AgentIds", "simple");
            this.putQueryParameter("AgentIds", agentIdsShrink);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>A list of department IDs.</p>
         */
        public Builder depIds(java.util.List<Long> depIds) {
            String depIdsShrink = shrink(depIds, "DepIds", "simple");
            this.putQueryParameter("DepIds", depIdsShrink);
            this.depIds = depIds;
            return this;
        }

        /**
         * <p>End Datetime UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1617761765000</p>
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it in the <strong>Instance Management</strong> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The UNIX timestamp of the start date. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615083365000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetAgentBasisStatusRequest build() {
            return new GetAgentBasisStatusRequest(this);
        } 

    } 

}
