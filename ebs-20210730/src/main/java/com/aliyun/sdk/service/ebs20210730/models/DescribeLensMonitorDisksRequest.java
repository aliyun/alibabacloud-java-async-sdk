// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLensMonitorDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeLensMonitorDisksRequest</p>
 */
public class DescribeLensMonitorDisksRequest extends Request {
    @Query
    @NameInMap("DiskCategory")
    private String diskCategory;

    @Query
    @NameInMap("DiskIds")
    private java.util.List < String > diskIds;

    @Query
    @NameInMap("LensTags")
    private java.util.List < String > lensTags;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeLensMonitorDisksRequest(Builder builder) {
        super(builder);
        this.diskCategory = builder.diskCategory;
        this.diskIds = builder.diskIds;
        this.lensTags = builder.lensTags;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLensMonitorDisksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskIds
     */
    public java.util.List < String > getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return lensTags
     */
    public java.util.List < String > getLensTags() {
        return this.lensTags;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLensMonitorDisksRequest, Builder> {
        private String diskCategory; 
        private java.util.List < String > diskIds; 
        private java.util.List < String > lensTags; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLensMonitorDisksRequest request) {
            super(request);
            this.diskCategory = request.diskCategory;
            this.diskIds = request.diskIds;
            this.lensTags = request.lensTags;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * The type of the disk. Valid values:
         * <p>
         * - cloud
         * - cloud_efficiency
         * - cloud_ssd
         * - cloud_essd
         * - cloud_auto
         * - cloud_essd_entry
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * The list of disks.
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * Lens event tag list to filter cloud disks that have experienced these event types within 24 hours. Valid values:
         * <p>
         * 
         * - NoSnapshot
         * - BurstIOTriggered
         * - CostOptimizationNeeded
         * - DiskSpecNotMatchedWithInstance
         * - DiskIONo4kAligned
         * - DiskIOHang
         * - InstanceIOPSExceedInstanceMaxLimit
         * - InstanceBPSExceedInstanceMaxLimit
         * - DiskIOPSExceedInstanceMaxLimit
         * - DiskBPSExceedInstanceMaxLimit
         * - DiskIOPSExceedDiskMaxLimit
         * - DiskBPSExceedDiskMaxLimit
         * - DiskSlowIOTriggerred
         */
        public Builder lensTags(java.util.List < String > lensTags) {
            this.putQueryParameter("LensTags", lensTags);
            this.lensTags = lensTags;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token used to start the next query to retrieve more results.
         * <p>
         * 
         * >  This parameter is not required in the first query. If not all results are returned in one query, you can pass in the NextToken value returned in the previous query to perform the query again.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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

        @Override
        public DescribeLensMonitorDisksRequest build() {
            return new DescribeLensMonitorDisksRequest(this);
        } 

    } 

}
