// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataPushResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataPushResultRequest</p>
 */
public class DescribeDataPushResultRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DataNames")
    private String dataNames;

    @Query
    @NameInMap("DataVersions")
    private String dataVersions;

    @Query
    @NameInMap("MaxDate")
    private String maxDate;

    @Query
    @NameInMap("MinDate")
    private String minDate;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionIds")
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
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the data file. Separate multiple names with commas (,). By default, all data files are queried.
         */
        public Builder dataNames(String dataNames) {
            this.putQueryParameter("DataNames", dataNames);
            this.dataNames = dataNames;
            return this;
        }

        /**
         * The version number of the data file. Separate multiple numbers with commas (,). By default, all versions of data files are queried.
         */
        public Builder dataVersions(String dataVersions) {
            this.putQueryParameter("DataVersions", dataVersions);
            this.dataVersions = dataVersions;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.
         */
        public Builder maxDate(String maxDate) {
            this.putQueryParameter("MaxDate", maxDate);
            this.maxDate = maxDate;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.
         */
        public Builder minDate(String minDate) {
            this.putQueryParameter("MinDate", minDate);
            this.minDate = minDate;
            return this;
        }

        /**
         * The page number. Pages start from page 1. This parameter is optional if you want to return the push status of all data files.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. This parameter is optional if you want to return the push status of all data files.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The IDs of ENS nodes. Separate multiple IDs with commas (,). By default, all ENS nodes are queried.
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
