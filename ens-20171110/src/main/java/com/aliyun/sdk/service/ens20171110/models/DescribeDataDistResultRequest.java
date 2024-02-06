// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataDistResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataDistResultRequest</p>
 */
public class DescribeDataDistResultRequest extends Request {
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
    @NameInMap("EnsRegionIds")
    private java.util.List < String > ensRegionIds;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

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

    private DescribeDataDistResultRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataNames = builder.dataNames;
        this.dataVersions = builder.dataVersions;
        this.ensRegionIds = builder.ensRegionIds;
        this.instanceIds = builder.instanceIds;
        this.maxDate = builder.maxDate;
        this.minDate = builder.minDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataDistResultRequest create() {
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
     * @return ensRegionIds
     */
    public java.util.List < String > getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
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

    public static final class Builder extends Request.Builder<DescribeDataDistResultRequest, Builder> {
        private String appId; 
        private String dataNames; 
        private String dataVersions; 
        private java.util.List < String > ensRegionIds; 
        private String instanceIds; 
        private String maxDate; 
        private String minDate; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataDistResultRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataNames = request.dataNames;
            this.dataVersions = request.dataVersions;
            this.ensRegionIds = request.ensRegionIds;
            this.instanceIds = request.instanceIds;
            this.maxDate = request.maxDate;
            this.minDate = request.minDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * The IDs of the ENS nodes.
         */
        public Builder ensRegionIds(java.util.List < String > ensRegionIds) {
            String ensRegionIdsShrink = shrink(ensRegionIds, "EnsRegionIds", "json");
            this.putQueryParameter("EnsRegionIds", ensRegionIdsShrink);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * The IDs of ENS instances. Separate multiple IDs with commas (,). By default, all instances are queried.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
         * The page number. Pages start from page 1. This parameter is optional if you want to return the distribution status of all data files.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. This parameter is optional if you want to return the distribution status of all data files.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeDataDistResultRequest build() {
            return new DescribeDataDistResultRequest(this);
        } 

    } 

}
