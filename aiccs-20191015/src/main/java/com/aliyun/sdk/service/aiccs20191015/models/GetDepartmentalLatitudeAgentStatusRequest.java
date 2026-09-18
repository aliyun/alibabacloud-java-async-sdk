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
 * {@link GetDepartmentalLatitudeAgentStatusRequest} extends {@link RequestModel}
 *
 * <p>GetDepartmentalLatitudeAgentStatusRequest</p>
 */
public class GetDepartmentalLatitudeAgentStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepIds")
    private java.util.List<Long> depIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistDepartmentGrouping")
    private Boolean existDepartmentGrouping;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    private GetDepartmentalLatitudeAgentStatusRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.depIds = builder.depIds;
        this.endDate = builder.endDate;
        this.existDepartmentGrouping = builder.existDepartmentGrouping;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDepartmentalLatitudeAgentStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetDepartmentalLatitudeAgentStatusRequest, Builder> {
        private Long currentPage; 
        private java.util.List<Long> depIds; 
        private Long endDate; 
        private Boolean existDepartmentGrouping; 
        private String instanceId; 
        private Long pageSize; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetDepartmentalLatitudeAgentStatusRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.depIds = request.depIds;
            this.endDate = request.endDate;
            this.existDepartmentGrouping = request.existDepartmentGrouping;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * <p>Current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>List of department IDs.</p>
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
         * <p>Indicates whether to query by department grouping. Valid values:</p>
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
         * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>Page size. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Start date UNIX timestamp. Unit: milliseconds.</p>
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
        public GetDepartmentalLatitudeAgentStatusRequest build() {
            return new GetDepartmentalLatitudeAgentStatusRequest(this);
        } 

    } 

}
