// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorHiveTablesRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorHiveTablesRequest</p>
 */
public class ListDoctorHiveTablesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DateTime")
    @Validation(required = true)
    private String dateTime;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TableNames")
    private java.util.List < String > tableNames;

    private ListDoctorHiveTablesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dateTime = builder.dateTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorHiveTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableNames
     */
    public java.util.List < String > getTableNames() {
        return this.tableNames;
    }

    public static final class Builder extends Request.Builder<ListDoctorHiveTablesRequest, Builder> {
        private String clusterId; 
        private String dateTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String orderType; 
        private String regionId; 
        private java.util.List < String > tableNames; 

        private Builder() {
            super();
        } 

        private Builder(ListDoctorHiveTablesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dateTime = request.dateTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
            this.tableNames = request.tableNames;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * The maximum number of entries to return on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The basis on which you want to sort the query results. Valid values:
         * <p>
         * 
         * *   partitionNum: the number of partitions.
         * *   totalFileCount: the total number of files.
         * *   largeFileCount: the number of large files. Large files are those with a size greater than 1 GB.
         * *   mediumFileCount: the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
         * *   smallFileCount: the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
         * *   tinyFileCount: the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
         * *   emptyFileCount: the number of empty files. Empty files are those with a size of 0 MB.
         * *   largeFileRatio: the proportion of large files. Large files are those with a size greater than 1 GB.
         * *   mediumFileRatio: the proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
         * *   smallFileRatio: the proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
         * *   tinyFileRatio: the proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
         * *   emptyFileRatio: the proportion of empty files. Empty files are those with a size of 0 MB.
         * *   hotDataSize: the amount of hot data. Hot data refers to data that is accessed in previous seven days.
         * *   WarmDataSize: the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.
         * *   coldDataSize: the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.
         * *   freezeDataSize: the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
         * *   totalDataSize: the total amount of data.
         * *   hotDataRatio: the proportion of hot data. Hot data refers to data that is accessed in previous seven days.
         * *   WarmDataRatio: the proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.
         * *   coldDataRatio: the proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.
         * *   freezeDataRatio: the proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
         * *   totalFileDayGrowthCount: the daily increment of the total number of files.
         * *   largeFileDayGrowthCount: the daily increment of the number of large files. Large files are those with a size greater than 1 GB.
         * *   mediumFileDayGrowthCount: the daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
         * *   smallFileDayGrowthCount: the daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
         * *   tinyFileDayGrowthCount: the daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
         * *   emptyFileDayGrowthCount: the daily increment of the number of empty files. Empty files are those with a size of 0 MB.
         * *   hotDataDayGrowthSize: the daily increment of the amount of hot data. Hot data refers to data that is accessed in previous seven days.
         * *   warmDataDayGrowthSize: the daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.
         * *   coldDataDayGrowthSize: the daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.
         * *   freezeDataDayGrowthSize: the daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
         * *   totalDataDayGrowthSize: the daily increment of the amount of total data.
         * *   totalFileCountDayGrowthRatio: the day-to-day growth rate of the total number of files.
         * *   largeFileCountDayGrowthRatio: the day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.
         * *   mediumFileCountDayGrowthRatio: the day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
         * *   smallFileCountDayGrowthRatio: the day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
         * *   tinyFileCountDayGrowthRatio: the day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
         * *   emptyFileCountDayGrowthRatio: the day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.
         * *   hotDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in previous seven days.
         * *   warmDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.
         * *   coldDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.
         * *   freezeDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
         * *   totalDataSizeDayGrowthRatio: the day-to-day growth rate of the total amount of data.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The order in which you want to sort the query results. Valid value:
         * <p>
         * 
         * *   ASC: in ascending order
         * *   DESC: in descending order
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The table names, which are used to filter the query results.
         */
        public Builder tableNames(java.util.List < String > tableNames) {
            this.putQueryParameter("TableNames", tableNames);
            this.tableNames = tableNames;
            return this;
        }

        @Override
        public ListDoctorHiveTablesRequest build() {
            return new ListDoctorHiveTablesRequest(this);
        } 

    } 

}
