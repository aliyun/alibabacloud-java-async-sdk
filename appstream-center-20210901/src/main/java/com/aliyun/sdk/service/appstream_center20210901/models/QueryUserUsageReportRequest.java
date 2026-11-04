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
 * {@link QueryUserUsageReportRequest} extends {@link RequestModel}
 *
 * <p>QueryUserUsageReportRequest</p>
 */
public class QueryUserUsageReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
    private String connectionStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private QueryUserUsageReportRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.bizRegionId = builder.bizRegionId;
        this.connectionStatus = builder.connectionStatus;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startDate = builder.startDate;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserUsageReportRequest create() {
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryUserUsageReportRequest, Builder> {
        private String appInstanceGroupId; 
        private String bizRegionId; 
        private String connectionStatus; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String startDate; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserUsageReportRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.bizRegionId = request.bizRegionId;
            this.connectionStatus = request.connectionStatus;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startDate = request.startDate;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the app instance group, which is used to filter data for a specified app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If you do not specify this parameter, data is not filtered by app instance group.</p>
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
         * <p>The ID of the business region, which is used to filter report data. You can call the <a href="~~ListRegions~~">ListRegions</a> operation to obtain the ID.</p>
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
         * <p>The filter condition for the user connection status. The value is not case-sensitive. An unrecognized value is equivalent to not filtering by connection status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Connected: At least one currently connected session exists.</li>
         * <li>Disconnected: The session binding is retained, but no currently connected session exists.</li>
         * <li>Unbound: No session binding exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        public Builder connectionStatus(String connectionStatus) {
            this.putBodyParameter("ConnectionStatus", connectionStatus);
            this.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * <p>The end time of the statistics. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The value cannot be earlier than StartDate. The server converts the time to the <code>yyyyMMdd</code> format and calculates statistics based on a closed interval of natural days. The hours, minutes, and seconds are not involved in day-level filtering. The time span cannot exceed 60 months. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-02 00:00:00</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The page number. We recommend that you explicitly specify a value starting from <code>1</code>. If you do not specify this parameter, the server processes the request as the first page, but the response may return <code>0</code>.</p>
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
         * <p>The number of entries per page. Default value: 200. If the value is greater than 1,500, it is processed as 1,500.</p>
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
         * <p>The product type. <strong>Required</strong>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudApp: WUYING Cloud App.</li>
         * <li>CloudBrowser: Cloud Browser.</li>
         * <li>WuyingServer: Enterprise Edition workstation.</li>
         * <li>WuyingWorkstation: Personal Edition container workstation.</li>
         * <li>WuyingWorkstationTeam: Team Edition container workstation.</li>
         * <li>WuyingWorkstationBusiness: Dedicated Edition container workstation.</li>
         * <li>AndroidCloud: Cloud Phone.</li>
         * <li>AIAgent: AgentBay (AI agent).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The start time of the statistics. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The server converts the time to the <code>yyyyMMdd</code> format and calculates statistics based on a closed interval of natural days. The hours, minutes, and seconds are not involved in day-level filtering. The time span cannot exceed 60 months. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 00:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The ID of the end user, which is used to precisely filter users. If you do not specify this parameter, data is not filtered by user.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryUserUsageReportRequest build() {
            return new QueryUserUsageReportRequest(this);
        } 

    } 

}
