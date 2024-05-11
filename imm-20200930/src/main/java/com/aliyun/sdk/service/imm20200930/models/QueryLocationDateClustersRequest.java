// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLocationDateClustersRequest} extends {@link RequestModel}
 *
 * <p>QueryLocationDateClustersRequest</p>
 */
public class QueryLocationDateClustersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private Address address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeRange")
    private TimeRange createTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private String customLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationDateClusterEndTimeRange")
    private TimeRange locationDateClusterEndTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationDateClusterLevels")
    private java.util.List < String > locationDateClusterLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationDateClusterStartTimeRange")
    private TimeRange locationDateClusterStartTimeRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateTimeRange")
    private TimeRange updateTimeRange;

    private QueryLocationDateClustersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.address = builder.address;
        this.createTimeRange = builder.createTimeRange;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.locationDateClusterEndTimeRange = builder.locationDateClusterEndTimeRange;
        this.locationDateClusterLevels = builder.locationDateClusterLevels;
        this.locationDateClusterStartTimeRange = builder.locationDateClusterStartTimeRange;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.objectId = builder.objectId;
        this.order = builder.order;
        this.projectName = builder.projectName;
        this.sort = builder.sort;
        this.title = builder.title;
        this.updateTimeRange = builder.updateTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLocationDateClustersRequest create() {
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
     * @return address
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * @return createTimeRange
     */
    public TimeRange getCreateTimeRange() {
        return this.createTimeRange;
    }

    /**
     * @return customLabels
     */
    public String getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return locationDateClusterEndTimeRange
     */
    public TimeRange getLocationDateClusterEndTimeRange() {
        return this.locationDateClusterEndTimeRange;
    }

    /**
     * @return locationDateClusterLevels
     */
    public java.util.List < String > getLocationDateClusterLevels() {
        return this.locationDateClusterLevels;
    }

    /**
     * @return locationDateClusterStartTimeRange
     */
    public TimeRange getLocationDateClusterStartTimeRange() {
        return this.locationDateClusterStartTimeRange;
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
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTimeRange
     */
    public TimeRange getUpdateTimeRange() {
        return this.updateTimeRange;
    }

    public static final class Builder extends Request.Builder<QueryLocationDateClustersRequest, Builder> {
        private String regionId; 
        private Address address; 
        private TimeRange createTimeRange; 
        private String customLabels; 
        private String datasetName; 
        private TimeRange locationDateClusterEndTimeRange; 
        private java.util.List < String > locationDateClusterLevels; 
        private TimeRange locationDateClusterStartTimeRange; 
        private Integer maxResults; 
        private String nextToken; 
        private String objectId; 
        private String order; 
        private String projectName; 
        private String sort; 
        private String title; 
        private TimeRange updateTimeRange; 

        private Builder() {
            super();
        } 

        private Builder(QueryLocationDateClustersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.address = request.address;
            this.createTimeRange = request.createTimeRange;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.locationDateClusterEndTimeRange = request.locationDateClusterEndTimeRange;
            this.locationDateClusterLevels = request.locationDateClusterLevels;
            this.locationDateClusterStartTimeRange = request.locationDateClusterStartTimeRange;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.objectId = request.objectId;
            this.order = request.order;
            this.projectName = request.projectName;
            this.sort = request.sort;
            this.title = request.title;
            this.updateTimeRange = request.updateTimeRange;
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
         * Address.
         */
        public Builder address(Address address) {
            String addressShrink = shrink(address, "Address", "json");
            this.putQueryParameter("Address", addressShrink);
            this.address = address;
            return this;
        }

        /**
         * CreateTimeRange.
         */
        public Builder createTimeRange(TimeRange createTimeRange) {
            String createTimeRangeShrink = shrink(createTimeRange, "CreateTimeRange", "json");
            this.putQueryParameter("CreateTimeRange", createTimeRangeShrink);
            this.createTimeRange = createTimeRange;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(String customLabels) {
            this.putQueryParameter("CustomLabels", customLabels);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * LocationDateClusterEndTimeRange.
         */
        public Builder locationDateClusterEndTimeRange(TimeRange locationDateClusterEndTimeRange) {
            String locationDateClusterEndTimeRangeShrink = shrink(locationDateClusterEndTimeRange, "LocationDateClusterEndTimeRange", "json");
            this.putQueryParameter("LocationDateClusterEndTimeRange", locationDateClusterEndTimeRangeShrink);
            this.locationDateClusterEndTimeRange = locationDateClusterEndTimeRange;
            return this;
        }

        /**
         * LocationDateClusterLevels.
         */
        public Builder locationDateClusterLevels(java.util.List < String > locationDateClusterLevels) {
            String locationDateClusterLevelsShrink = shrink(locationDateClusterLevels, "LocationDateClusterLevels", "json");
            this.putQueryParameter("LocationDateClusterLevels", locationDateClusterLevelsShrink);
            this.locationDateClusterLevels = locationDateClusterLevels;
            return this;
        }

        /**
         * LocationDateClusterStartTimeRange.
         */
        public Builder locationDateClusterStartTimeRange(TimeRange locationDateClusterStartTimeRange) {
            String locationDateClusterStartTimeRangeShrink = shrink(locationDateClusterStartTimeRange, "LocationDateClusterStartTimeRange", "json");
            this.putQueryParameter("LocationDateClusterStartTimeRange", locationDateClusterStartTimeRangeShrink);
            this.locationDateClusterStartTimeRange = locationDateClusterStartTimeRange;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
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
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UpdateTimeRange.
         */
        public Builder updateTimeRange(TimeRange updateTimeRange) {
            String updateTimeRangeShrink = shrink(updateTimeRange, "UpdateTimeRange", "json");
            this.putQueryParameter("UpdateTimeRange", updateTimeRangeShrink);
            this.updateTimeRange = updateTimeRange;
            return this;
        }

        @Override
        public QueryLocationDateClustersRequest build() {
            return new QueryLocationDateClustersRequest(this);
        } 

    } 

}
