// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDoctorHiveTablesRequest} extends {@link RequestModel}
 *
 * <p>ListDoctorHiveTablesRequest</p>
 */
public class ListDoctorHiveTablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableNames")
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The basis on which you want to sort the query results. Valid values:</p>
         * <ul>
         * <li>partitionNum: the number of partitions.</li>
         * <li>totalFileCount: the total number of files.</li>
         * <li>largeFileCount: the number of large files. Large files are those with a size greater than 1 GB.</li>
         * <li>mediumFileCount: the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
         * <li>smallFileCount: the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
         * <li>tinyFileCount: the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
         * <li>emptyFileCount: the number of empty files. Empty files are those with a size of 0 MB.</li>
         * <li>largeFileRatio: the proportion of large files. Large files are those with a size greater than 1 GB.</li>
         * <li>mediumFileRatio: the proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
         * <li>smallFileRatio: the proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
         * <li>tinyFileRatio: the proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
         * <li>emptyFileRatio: the proportion of empty files. Empty files are those with a size of 0 MB.</li>
         * <li>hotDataSize: the amount of hot data. Hot data refers to data that is accessed in previous seven days.</li>
         * <li>WarmDataSize: the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
         * <li>coldDataSize: the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
         * <li>freezeDataSize: the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
         * <li>totalDataSize: the total amount of data.</li>
         * <li>hotDataRatio: the proportion of hot data. Hot data refers to data that is accessed in previous seven days.</li>
         * <li>WarmDataRatio: the proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
         * <li>coldDataRatio: the proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
         * <li>freezeDataRatio: the proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
         * <li>totalFileDayGrowthCount: the daily increment of the total number of files.</li>
         * <li>largeFileDayGrowthCount: the daily increment of the number of large files. Large files are those with a size greater than 1 GB.</li>
         * <li>mediumFileDayGrowthCount: the daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
         * <li>smallFileDayGrowthCount: the daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
         * <li>tinyFileDayGrowthCount: the daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
         * <li>emptyFileDayGrowthCount: the daily increment of the number of empty files. Empty files are those with a size of 0 MB.</li>
         * <li>hotDataDayGrowthSize: the daily increment of the amount of hot data. Hot data refers to data that is accessed in previous seven days.</li>
         * <li>warmDataDayGrowthSize: the daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
         * <li>coldDataDayGrowthSize: the daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
         * <li>freezeDataDayGrowthSize: the daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
         * <li>totalDataDayGrowthSize: the daily increment of the amount of total data.</li>
         * <li>totalFileCountDayGrowthRatio: the day-to-day growth rate of the total number of files.</li>
         * <li>largeFileCountDayGrowthRatio: the day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.</li>
         * <li>mediumFileCountDayGrowthRatio: the day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.</li>
         * <li>smallFileCountDayGrowthRatio: the day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.</li>
         * <li>tinyFileCountDayGrowthRatio: the day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.</li>
         * <li>emptyFileCountDayGrowthRatio: the day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.</li>
         * <li>hotDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in previous seven days.</li>
         * <li>warmDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in previous 30 days.</li>
         * <li>coldDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in previous 90 days.</li>
         * <li>freezeDataSizeDayGrowthRatio: the day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.</li>
         * <li>totalDataSizeDayGrowthRatio: the day-to-day growth rate of the total amount of data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>totalFileCount</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order in which you want to sort the query results. Valid value:</p>
         * <ul>
         * <li>ASC: in ascending order</li>
         * <li>DESC: in descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The table names, which are used to filter the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
