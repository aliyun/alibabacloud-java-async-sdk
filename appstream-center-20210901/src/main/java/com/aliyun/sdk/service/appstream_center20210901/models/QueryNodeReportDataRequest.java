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
 * {@link QueryNodeReportDataRequest} extends {@link RequestModel}
 *
 * <p>QueryNodeReportDataRequest</p>
 */
public class QueryNodeReportDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

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
    @com.aliyun.core.annotation.NameInMap("StatDateType")
    private String statDateType;

    private QueryNodeReportDataRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.bizRegionId = builder.bizRegionId;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startDate = builder.startDate;
        this.statDateType = builder.statDateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNodeReportDataRequest create() {
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
     * @return statDateType
     */
    public String getStatDateType() {
        return this.statDateType;
    }

    public static final class Builder extends Request.Builder<QueryNodeReportDataRequest, Builder> {
        private String appInstanceGroupId; 
        private String bizRegionId; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String startDate; 
        private String statDateType; 

        private Builder() {
            super();
        } 

        private Builder(QueryNodeReportDataRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.bizRegionId = request.bizRegionId;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startDate = request.startDate;
            this.statDateType = request.statDateType;
        } 

        /**
         * <p>The ID of the app instance group, which is used to filter data for a specific app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If you do not specify this parameter, data is not filtered by app instance group.</p>
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
         * <p>The end time of the statistics. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The end time cannot be earlier than <code>StartDate</code>. The query span must meet the limit corresponding to <code>StatDateType</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
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
         * <p>The page number to query. We recommend that you explicitly specify a value starting from <code>1</code>. If you do not specify this parameter, the service processes the request as the first page, but the response may return <code>0</code>.</p>
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
         * <p>The number of entries per page. If you do not specify this parameter, the default value is 200. If the specified value is greater than 1,500, it is processed as 1,500.</p>
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
         * <p>The product type. Optional. If you do not specify this parameter, data is queried based on the Wuying Cloud App criteria.</p>
         * <p>Specify the value in the exact case as shown below. Data that cannot be matched is not returned.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>CloudApp</code>: Wuying Cloud App.</li>
         * <li><code>CloudBrowser</code>: Cloud Browser.</li>
         * <li><code>WuyingServer</code>: Enterprise Edition workstation.</li>
         * <li><code>WuyingWorkstation</code>: Personal Edition Linggou container workstation.</li>
         * <li><code>WuyingWorkstationTeam</code>: Linggou Team Edition container workstation.</li>
         * <li><code>WuyingWorkstationBusiness</code>: Linggou Dedicated Edition container workstation.</li>
         * <li><code>AndroidCloud</code>: Cloud Phone.</li>
         * <li><code>AIAgent</code>: AgentBay (AI agent).</li>
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
         * <p>The start time of the statistics. <strong>Required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The <code>1d</code> granularity calculates statistics by date, while other granularities are accurate to the minute. The query includes both the start and end boundaries. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
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
         * <p>The statistical granularity. <strong>Required</strong>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>1m</code>: aggregates data by 1 minute. The maximum query span is 1 day.</li>
         * <li><code>30m</code>: aggregates data by 30 minutes. The maximum query span is 1 day.</li>
         * <li><code>6h</code>: aggregates data by 6 hours. The maximum query span is 15 days.</li>
         * <li><code>1d</code>: aggregates data by day. The maximum query span is 180 days.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1d</p>
         */
        public Builder statDateType(String statDateType) {
            this.putBodyParameter("StatDateType", statDateType);
            this.statDateType = statDateType;
            return this;
        }

        @Override
        public QueryNodeReportDataRequest build() {
            return new QueryNodeReportDataRequest(this);
        } 

    } 

}
