// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeDataPushResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataPushResultRequest</p>
 */
public class DescribeDataPushResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataNames")
    private String dataNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataVersions")
    private String dataVersions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDate")
    private String maxDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDate")
    private String minDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private String regionIds;

    private DescribeDataPushResultRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataNames = builder.dataNames;
        this.dataVersions = builder.dataVersions;
        this.maxDate = builder.maxDate;
        this.minDate = builder.minDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionIds = builder.regionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataPushResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return dataNames
     */
    public String getDataNames() {
        return this.dataNames;
    }

    /**
     * @return dataVersions
     */
    public String getDataVersions() {
        return this.dataVersions;
    }

    /**
     * @return maxDate
     */
    public String getMaxDate() {
        return this.maxDate;
    }

    /**
     * @return minDate
     */
    public String getMinDate() {
        return this.minDate;
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
     * @return regionIds
     */
    public String getRegionIds() {
        return this.regionIds;
    }

    public static final class Builder extends Request.Builder<DescribeDataPushResultRequest, Builder> {
        private String appId; 
        private String dataNames; 
        private String dataVersions; 
        private String maxDate; 
        private String minDate; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataPushResultRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataNames = request.dataNames;
            this.dataVersions = request.dataVersions;
            this.maxDate = request.maxDate;
            this.minDate = request.minDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionIds = request.regionIds;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e76f8985-7965-41fc-925b-9648bb6bf650</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the data file. Separate multiple names with commas (,). By default, all data files are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>159828628258496/mirror_file/game-2553efe7-7bf8-40fb-a6e7-09c9c00a992a.tar</p>
         */
        public Builder dataNames(String dataNames) {
            this.putQueryParameter("DataNames", dataNames);
            this.dataNames = dataNames;
            return this;
        }

        /**
         * <p>The version number of the data file. Separate multiple numbers with commas (,). By default, all versions of data files are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>90396</p>
         */
        public Builder dataVersions(String dataVersions) {
            this.putQueryParameter("DataVersions", dataVersions);
            this.dataVersions = dataVersions;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-20</p>
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-15</p>
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. This parameter is optional if you want to return the push status of all data files.</p>
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
         * <p>The number of entries per page. This parameter is optional if you want to return the push status of all data files.</p>
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
         * <p>The IDs of ENS nodes. Separate multiple IDs with commas (,). By default, all ENS nodes are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wuhan-telecom_unicom_cmcc-2,cn-jiaozuo-2</p>
         */
        public Builder regionIds(String regionIds) {
            this.putQueryParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        @Override
        public DescribeDataPushResultRequest build() {
            return new DescribeDataPushResultRequest(this);
        } 

    } 

}
