// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeGlobalDesktopRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGlobalDesktopRecordsRequest</p>
 */
public class DescribeGlobalDesktopRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopName")
    private String desktopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopStatusList")
    private java.util.List<String> desktopStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeDesktopStatusList")
    private java.util.List<String> excludeDesktopStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubPayType")
    private String subPayType;

    private DescribeGlobalDesktopRecordsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.desktopName = builder.desktopName;
        this.desktopStatusList = builder.desktopStatusList;
        this.desktopType = builder.desktopType;
        this.endTime = builder.endTime;
        this.endUserId = builder.endUserId;
        this.excludeDesktopStatusList = builder.excludeDesktopStatusList;
        this.officeSiteId = builder.officeSiteId;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scope = builder.scope;
        this.sortType = builder.sortType;
        this.startTime = builder.startTime;
        this.subPayType = builder.subPayType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDesktopRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopName
     */
    public String getDesktopName() {
        return this.desktopName;
    }

    /**
     * @return desktopStatusList
     */
    public java.util.List<String> getDesktopStatusList() {
        return this.desktopStatusList;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return excludeDesktopStatusList
     */
    public java.util.List<String> getExcludeDesktopStatusList() {
        return this.excludeDesktopStatusList;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subPayType
     */
    public String getSubPayType() {
        return this.subPayType;
    }

    public static final class Builder extends Request.Builder<DescribeGlobalDesktopRecordsRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String desktopName; 
        private java.util.List<String> desktopStatusList; 
        private String desktopType; 
        private String endTime; 
        private String endUserId; 
        private java.util.List<String> excludeDesktopStatusList; 
        private String officeSiteId; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String scope; 
        private String sortType; 
        private String startTime; 
        private String subPayType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGlobalDesktopRecordsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.desktopName = request.desktopName;
            this.desktopStatusList = request.desktopStatusList;
            this.desktopType = request.desktopType;
            this.endTime = request.endTime;
            this.endUserId = request.endUserId;
            this.excludeDesktopStatusList = request.excludeDesktopStatusList;
            this.officeSiteId = request.officeSiteId;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.scope = request.scope;
            this.sortType = request.sortType;
            this.startTime = request.startTime;
            this.subPayType = request.subPayType;
        } 

        /**
         * <p>The cloud computer IDs. You can specify 1 to 100 office network IDs.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The name of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        public Builder desktopName(String desktopName) {
            this.putQueryParameter("DesktopName", desktopName);
            this.desktopName = desktopName;
            return this;
        }

        /**
         * DesktopStatusList.
         */
        public Builder desktopStatusList(java.util.List<String> desktopStatusList) {
            this.putQueryParameter("DesktopStatusList", desktopStatusList);
            this.desktopStatusList = desktopStatusList;
            return this;
        }

        /**
         * <p>The cloud computer type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the IDs of the specifications supported by the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.2c4g</p>
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * <p>The end time. The interval between the start time and end time can be up to 30 days. Supported formats:</p>
         * <ul>
         * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T06:56:45Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUser</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * ExcludeDesktopStatusList.
         */
        public Builder excludeDesktopStatusList(java.util.List<String> excludeDesktopStatusList) {
            this.putQueryParameter("ExcludeDesktopStatusList", excludeDesktopStatusList);
            this.excludeDesktopStatusList = excludeDesktopStatusList;
            return this;
        }

        /**
         * <p>The office network IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The sorting field. If this parameter is not provided, results are sorted by creation time in descending order. Valid values:</p>
         * <ul>
         * <li>uptime: indicates that the cloud computers are sorted by startup duration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uptime</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number of the current page.<br>Default value: 1</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
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
         * <p>The region ID.</p>
         * <ul>
         * <li>China (Shanghai)</li>
         * <li>Singapore</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-3mtuc28rx95lx****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The query range. This parameter is empty by default. Optional values are:</p>
         * <ul>
         * <li>ADVANCED: indicates that statistics such as the connection duration are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ADVANCED</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The sorting method. Default value: ascending. Valid value:</p>
         * <ul>
         * <li>Asc: ascending order</li>
         * <li>Desc: descending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * <p>The start time. Supported formats:</p>
         * <ul>
         * <li>Format: YYYY-MM-DDThh:mm:ssZ.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2022-03-23T04:10:21Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The way to purchase cloud computers. Valid values:</p>
         * <ul>
         * <li>prePaid: The monthly purchase is unlimited.</li>
         * <li>postPaid: pay-as-you-go</li>
         * <li>monthPackage: monthly duration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monthPackage</p>
         */
        public Builder subPayType(String subPayType) {
            this.putQueryParameter("SubPayType", subPayType);
            this.subPayType = subPayType;
            return this;
        }

        @Override
        public DescribeGlobalDesktopRecordsRequest build() {
            return new DescribeGlobalDesktopRecordsRequest(this);
        } 

    } 

}
