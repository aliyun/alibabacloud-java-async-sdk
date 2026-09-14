// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDataQualityScanRunsRequest} extends {@link RequestModel}
 *
 * <p>ListDataQualityScanRunsRequest</p>
 */
public class ListDataQualityScanRunsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeFrom")
    private Long createTimeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeTo")
    private Long createTimeTo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataQualityScanId")
    private Long dataQualityScanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.Map<String, ?> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDataQualityScanRunsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createTimeFrom = builder.createTimeFrom;
        this.createTimeTo = builder.createTimeTo;
        this.dataQualityScanId = builder.dataQualityScanId;
        this.filter = builder.filter;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityScanRunsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createTimeFrom
     */
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    /**
     * @return createTimeTo
     */
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    /**
     * @return dataQualityScanId
     */
    public Long getDataQualityScanId() {
        return this.dataQualityScanId;
    }

    /**
     * @return filter
     */
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDataQualityScanRunsRequest, Builder> {
        private String regionId; 
        private Long createTimeFrom; 
        private Long createTimeTo; 
        private Long dataQualityScanId; 
        private java.util.Map<String, ?> filter; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDataQualityScanRunsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createTimeFrom = request.createTimeFrom;
            this.createTimeTo = request.createTimeTo;
            this.dataQualityScanId = request.dataQualityScanId;
            this.filter = request.filter;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The earliest start time of a data quality scan run to include in the results. Specify the time as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder createTimeFrom(Long createTimeFrom) {
            this.putQueryParameter("CreateTimeFrom", createTimeFrom);
            this.createTimeFrom = createTimeFrom;
            return this;
        }

        /**
         * <p>The latest start time of a data quality scan run to include in the results. Specify the time as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder createTimeTo(Long createTimeTo) {
            this.putQueryParameter("CreateTimeTo", createTimeTo);
            this.createTimeTo = createTimeTo;
            return this;
        }

        /**
         * <p>The ID of the data quality scan.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder dataQualityScanId(Long dataQualityScanId) {
            this.putQueryParameter("DataQualityScanId", dataQualityScanId);
            this.dataQualityScanId = dataQualityScanId;
            return this;
        }

        /**
         * <p>An object with advanced filter conditions. The following parameters are supported:</p>
         * <ul>
         * <li><p><code>TaskInstanceId</code>: The ID of the task instance.</p>
         * </li>
         * <li><p><code>RunNumber</code>: The run number of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;TaskInstanceId&quot;: &quot;111&quot;,
         *     &quot;RunNumber&quot;: &quot;1&quot;
         * }</p>
         */
        public Builder filter(java.util.Map<String, ?> filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The page number to return. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Default value: 10.</p>
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
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The sort field and order for the results. The format is <code>FieldName Order</code>. The default order is ascending (Asc). Supported fields:</p>
         * <ul>
         * <li><p>CreateTime (Desc/Asc)</p>
         * </li>
         * <li><p>Id (Desc/Asc)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The status of the data quality scan run. Valid values:</p>
         * <ul>
         * <li><p>Pass</p>
         * </li>
         * <li><p>Running</p>
         * </li>
         * <li><p>Error</p>
         * </li>
         * <li><p>Fail</p>
         * </li>
         * <li><p>Warn</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDataQualityScanRunsRequest build() {
            return new ListDataQualityScanRunsRequest(this);
        } 

    } 

}
