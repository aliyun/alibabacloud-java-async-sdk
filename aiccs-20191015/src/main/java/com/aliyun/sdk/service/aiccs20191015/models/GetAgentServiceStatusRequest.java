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
 * {@link GetAgentServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAgentServiceStatusRequest</p>
 */
public class GetAgentServiceStatusRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ExistAgentGrouping")
    private Boolean existAgentGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistDepartmentGrouping")
    private Boolean existDepartmentGrouping;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeLatitudeType")
    private String timeLatitudeType;

    private GetAgentServiceStatusRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.existAgentGrouping = builder.existAgentGrouping;
        this.existDepartmentGrouping = builder.existDepartmentGrouping;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.timeLatitudeType = builder.timeLatitudeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentServiceStatusRequest create() {
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
     * @return existAgentGrouping
     */
    public Boolean getExistAgentGrouping() {
        return this.existAgentGrouping;
    }

    /**
     * @return existDepartmentGrouping
     */
    public Boolean getExistDepartmentGrouping() {
        return this.existDepartmentGrouping;
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

    /**
     * @return timeLatitudeType
     */
    public String getTimeLatitudeType() {
        return this.timeLatitudeType;
    }

    public static final class Builder extends Request.Builder<GetAgentServiceStatusRequest, Builder> {
        private java.util.List<Long> agentIds; 
        private Integer currentPage; 
        private java.util.List<Long> depIds; 
        private Long endDate; 
        private Boolean existAgentGrouping; 
        private Boolean existDepartmentGrouping; 
        private String instanceId; 
        private Integer pageSize; 
        private Long startDate; 
        private String timeLatitudeType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentServiceStatusRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.endDate = request.endDate;
            this.existAgentGrouping = request.existAgentGrouping;
            this.existDepartmentGrouping = request.existDepartmentGrouping;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.timeLatitudeType = request.timeLatitudeType;
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
         * <p>End UNIX timestamp. Unit: milliseconds.</p>
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
         * <p>Whether to query by agent group. Default Value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder existAgentGrouping(Boolean existAgentGrouping) {
            this.putQueryParameter("ExistAgentGrouping", existAgentGrouping);
            this.existAgentGrouping = existAgentGrouping;
            return this;
        }

        /**
         * <p>Whether to query by department group. Default Value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder existDepartmentGrouping(Boolean existDepartmentGrouping) {
            this.putQueryParameter("ExistDepartmentGrouping", existDepartmentGrouping);
            this.existDepartmentGrouping = existDepartmentGrouping;
            return this;
        }

        /**
         * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>The start UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615083365000</p>
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The time latitude type. Valid values:  </p>
         * <ul>
         * <li><strong>minute</strong>: Minute  </li>
         * <li><strong>hour</strong>: Hour  </li>
         * <li><strong>day</strong>: Day</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>minute</p>
         */
        public Builder timeLatitudeType(String timeLatitudeType) {
            this.putQueryParameter("TimeLatitudeType", timeLatitudeType);
            this.timeLatitudeType = timeLatitudeType;
            return this;
        }

        @Override
        public GetAgentServiceStatusRequest build() {
            return new GetAgentServiceStatusRequest(this);
        } 

    } 

}
