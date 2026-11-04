// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryAppInstanceGroupReportListRequest} extends {@link RequestModel}
 *
 * <p>QueryAppInstanceGroupReportListRequest</p>
 */
public class QueryAppInstanceGroupReportListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
    private String appInstanceGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatDate")
    private String statDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<String> status;

    private QueryAppInstanceGroupReportListRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.bizRegionId = builder.bizRegionId;
        this.endDate = builder.endDate;
        this.endUserId = builder.endUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
        this.statDate = builder.statDate;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppInstanceGroupReportListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return statDate
     */
    public String getStatDate() {
        return this.statDate;
    }

    /**
     * @return status
     */
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryAppInstanceGroupReportListRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceGroupName; 
        private String bizRegionId; 
        private String endDate; 
        private String endUserId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String startDate; 
        private String statDate; 
        private java.util.List<String> status; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppInstanceGroupReportListRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.bizRegionId = request.bizRegionId;
            this.endDate = request.endDate;
            this.endUserId = request.endUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
            this.statDate = request.statDate;
            this.status = request.status;
        } 

        /**
         * <p>The filter condition for the delivery group ID, which matches the exact ID. If this parameter is not passed, the results are not filtered by ID. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The filter condition for the delivery group name, which supports inclusion matching. If this parameter is not passed, the results are not filtered by name.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D workstation</p>
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * <p>The business region ID of the delivery group. You can call <a href="~~ListRegions~~">ListRegions</a> to obtain the ID. If this parameter is not passed, the results are not filtered by business region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The end date of the statistical period, in the <code>yyyyMMdd</code> format. This parameter must be passed in pairs with <code>StartDate</code> and cannot be earlier than the start date. The string itself does not carry a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>20260930</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The ID of the end user, which is used to filter delivery groups based on the current valid authorization relationship. Before calling this operation, make sure that the user has at least one valid authorization. If no valid authorization exists, the current version does not narrow down the results based on this parameter. If this parameter is not passed, the results are not filtered by user.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The page number to query. Explicitly pass a value starting from <code>1</code>. If this parameter is not passed, the service processes the request as the first page, but the response may return <code>0</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. If this parameter is not passed, the default value is 200. The current operation does not have an additional upper limit per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID for OpenAPI access, which is used for request authentication and routing. To filter business data by region, use <code>BizRegionId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start date of the statistical period, in the <code>yyyyMMdd</code> format. This parameter must be passed in pairs with <code>EndDate</code>, and the interval includes the start and end dates. The string itself does not carry a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>20260901</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The statistical date for a single day, in the <code>yyyyMMdd</code> format. If this parameter is passed along with <code>StartDate</code> and <code>EndDate</code>, the results must meet both the single-day and interval conditions. The string itself does not carry a time zone and is interpreted as a natural date in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>20260901</p>
         */
        public Builder statDate(String statDate) {
            this.putBodyParameter("StatDate", statDate);
            this.statDate = statDate;
            return this;
        }

        /**
         * <p>The list of delivery group statuses. Multiple values have an OR relationship. Unrecognized values do not participate in filtering. If all values are unrecognized, it is equivalent to not filtering by status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>DEPLOYING</code>: Deploying.</li>
         * <li><code>DEPLOYED</code>: Deployed but not published.</li>
         * <li><code>PUBLISHED</code>: Published and available for service based on the current configuration.</li>
         * <li><code>STOPPING</code>: Stopping.</li>
         * <li><code>STOPPED</code>: Stopped.</li>
         * <li><code>MAINTAINING</code>: Maintaining.</li>
         * <li><code>FAILED</code>: Deployment or operation failed.</li>
         * <li><code>MAINTAIN_FAILED</code>: Maintenance failed.</li>
         * <li><code>DELETING</code>: Deleting.</li>
         * <li><code>DELETED</code>: Deleted.</li>
         * </ul>
         */
        public Builder status(java.util.List<String> status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryAppInstanceGroupReportListRequest build() {
            return new QueryAppInstanceGroupReportListRequest(this);
        } 

    } 

}
