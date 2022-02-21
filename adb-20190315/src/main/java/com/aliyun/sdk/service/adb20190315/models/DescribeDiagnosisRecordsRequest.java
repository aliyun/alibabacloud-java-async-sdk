// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosisRecordsRequest</p>
 */
public class DescribeDiagnosisRecordsRequest extends Request {
    @Query
    @NameInMap("ClientIp")
    private String clientIp;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Database")
    private String database;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MaxPeakMemory")
    private Long maxPeakMemory;

    @Query
    @NameInMap("MaxScanSize")
    private Long maxScanSize;

    @Query
    @NameInMap("MinPeakMemory")
    private Long minPeakMemory;

    @Query
    @NameInMap("MinScanSize")
    private Long minScanSize;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PatternId")
    private Long patternId;

    @Query
    @NameInMap("QueryCondition")
    @Validation(required = true)
    private String queryCondition;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroup")
    private String resourceGroup;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("UserName")
    private String userName;

    private DescribeDiagnosisRecordsRequest(Builder builder) {
        super(builder);
        this.clientIp = builder.clientIp;
        this.DBClusterId = builder.DBClusterId;
        this.database = builder.database;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.maxPeakMemory = builder.maxPeakMemory;
        this.maxScanSize = builder.maxScanSize;
        this.minPeakMemory = builder.minPeakMemory;
        this.minScanSize = builder.minScanSize;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.patternId = builder.patternId;
        this.queryCondition = builder.queryCondition;
        this.regionId = builder.regionId;
        this.resourceGroup = builder.resourceGroup;
        this.startTime = builder.startTime;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxPeakMemory
     */
    public Long getMaxPeakMemory() {
        return this.maxPeakMemory;
    }

    /**
     * @return maxScanSize
     */
    public Long getMaxScanSize() {
        return this.maxScanSize;
    }

    /**
     * @return minPeakMemory
     */
    public Long getMinPeakMemory() {
        return this.minPeakMemory;
    }

    /**
     * @return minScanSize
     */
    public Long getMinScanSize() {
        return this.minScanSize;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return patternId
     */
    public Long getPatternId() {
        return this.patternId;
    }

    /**
     * @return queryCondition
     */
    public String getQueryCondition() {
        return this.queryCondition;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosisRecordsRequest, Builder> {
        private String clientIp; 
        private String DBClusterId; 
        private String database; 
        private String endTime; 
        private String keyword; 
        private String lang; 
        private Long maxPeakMemory; 
        private Long maxScanSize; 
        private Long minPeakMemory; 
        private Long minScanSize; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long patternId; 
        private String queryCondition; 
        private String regionId; 
        private String resourceGroup; 
        private String startTime; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosisRecordsRequest response) {
            super(response);
            this.clientIp = response.clientIp;
            this.DBClusterId = response.DBClusterId;
            this.database = response.database;
            this.endTime = response.endTime;
            this.keyword = response.keyword;
            this.lang = response.lang;
            this.maxPeakMemory = response.maxPeakMemory;
            this.maxScanSize = response.maxScanSize;
            this.minPeakMemory = response.minPeakMemory;
            this.minScanSize = response.minScanSize;
            this.order = response.order;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.patternId = response.patternId;
            this.queryCondition = response.queryCondition;
            this.regionId = response.regionId;
            this.resourceGroup = response.resourceGroup;
            this.startTime = response.startTime;
            this.userName = response.userName;
        } 

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxPeakMemory.
         */
        public Builder maxPeakMemory(Long maxPeakMemory) {
            this.putQueryParameter("MaxPeakMemory", maxPeakMemory);
            this.maxPeakMemory = maxPeakMemory;
            return this;
        }

        /**
         * MaxScanSize.
         */
        public Builder maxScanSize(Long maxScanSize) {
            this.putQueryParameter("MaxScanSize", maxScanSize);
            this.maxScanSize = maxScanSize;
            return this;
        }

        /**
         * MinPeakMemory.
         */
        public Builder minPeakMemory(Long minPeakMemory) {
            this.putQueryParameter("MinPeakMemory", minPeakMemory);
            this.minPeakMemory = minPeakMemory;
            return this;
        }

        /**
         * MinScanSize.
         */
        public Builder minScanSize(Long minScanSize) {
            this.putQueryParameter("MinScanSize", minScanSize);
            this.minScanSize = minScanSize;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PatternId.
         */
        public Builder patternId(Long patternId) {
            this.putQueryParameter("PatternId", patternId);
            this.patternId = patternId;
            return this;
        }

        /**
         * QueryCondition.
         */
        public Builder queryCondition(String queryCondition) {
            this.putQueryParameter("QueryCondition", queryCondition);
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroup.
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putQueryParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DescribeDiagnosisRecordsRequest build() {
            return new DescribeDiagnosisRecordsRequest(this);
        } 

    } 

}
