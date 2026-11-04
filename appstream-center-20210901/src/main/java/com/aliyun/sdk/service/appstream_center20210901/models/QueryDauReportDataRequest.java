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
 * {@link QueryDauReportDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDauReportDataRequest</p>
 */
public class QueryDauReportDataRequest extends Request {
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

    private QueryDauReportDataRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.bizRegionId = builder.bizRegionId;
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDauReportDataRequest create() {
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

    public static final class Builder extends Request.Builder<QueryDauReportDataRequest, Builder> {
        private String appInstanceGroupId; 
        private String bizRegionId; 
        private String endDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryDauReportDataRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.bizRegionId = request.bizRegionId;
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The ID of the app instance group. This parameter is used to filter data for a specific app instance group. You can call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the ID. If this parameter is not specified, data is not filtered by app instance group.</p>
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
         * <p>The ID of the business region. This parameter is used to filter report data. You can call the <a href="~~ListRegions~~">ListRegions</a> operation to obtain the ID.</p>
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
         * <p>The end time of the statistical period. This parameter is <strong>required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The value cannot be earlier than StartDate. The service extracts the calendar day in the <code>yyyy-MM-dd</code> format. The string does not contain time zone information and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-30 23:59:59</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The page number. Explicitly specify a value starting from <code>1</code>. If this parameter is not specified, the service returns the first page, but the response may return <code>0</code> for the page number.</p>
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
         * <p>The number of entries per page. Default value: 200. If the specified value is greater than 1,500, the value 1,500 is used.</p>
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
         * <p>The product type. This parameter is optional. If this parameter is not specified or is unrecognized, the query defaults to <code>CloudApp</code>. Valid values:</p>
         * <ul>
         * <li><code>CloudApp</code>: Wuying cloud application.</li>
         * <li><code>CloudBrowser</code>: Cloud browser.</li>
         * <li><code>WuyingServer</code>: Enterprise edition workstation.</li>
         * <li><code>WuyingWorkstation</code>: Personal edition Linggou container workstation.</li>
         * <li><code>WuyingWorkstationTeam</code>: Team edition Linggou container workstation.</li>
         * <li><code>WuyingWorkstationBusiness</code>: Dedicated edition Linggou container workstation.</li>
         * <li><code>AndroidCloud</code>: Cloud phone.</li>
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
         * <p>The start time of the statistical period. This parameter is <strong>required</strong>. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The service extracts the calendar day in the <code>yyyy-MM-dd</code> format. The date range is inclusive and cannot exceed 180 days. The string does not contain time zone information and is interpreted in the Asia/Shanghai (UTC+8) time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 00:00:00</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryDauReportDataRequest build() {
            return new QueryDauReportDataRequest(this);
        } 

    } 

}
