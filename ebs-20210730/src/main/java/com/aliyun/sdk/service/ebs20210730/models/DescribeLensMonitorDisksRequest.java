// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLensMonitorDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeLensMonitorDisksRequest</p>
 */
public class DescribeLensMonitorDisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIds")
    private java.util.List < String > diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LensTags")
    private java.util.List < String > lensTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * Event tags of the disk, which are used to filter the disks on which the events associated with the specified tags occurred in the previous 24 hours. Valid values:
         * <p>
         * 
         * *   NoSnapshot: specifies the event that is triggered because no snapshot is created for the disk to protect data on the disk.
         * *   BurstIOTriggered: specifies the event that is triggered when a burst I/O operation is performed on the disk.
         * *   CostOptimizationNeeded: specifies the event that is triggered when cost optimization is required.
         * *   DiskSpecNotMatchedWithInstance: specifies the event that is triggered if the disk specifications do not match the instance to which the disk is attached.
         * *   DiskIONo4kAligned: specifies the event that is triggered if the physical and logical sectors involved in a read or write operation are not 4K aligned.
         * *   DiskIOHang: specifies the event that is triggered when an I/O hang occurs on the disk.
         * *   InstanceIOPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of IOPS on the instance reaches the upper limit.
         * *   InstanceBPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of BPS on the instance reaches the upper limit.
         * *   DiskIOPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of IOPS on the disk reaches the upper limit of the instance.
         * *   DiskBPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of BPS on the disk reaches the upper limit of the instance.
         * *   DiskIOPSExceedDiskMaxLimit: specifies the event that is triggered when the number of IOPS on the disk reaches the upper limit of the disk.
         * *   DiskBPSExceedDiskMaxLimit: specifies the event that is triggered when the number of BPS on the disk reaches the upper limit of the disk.
         * *   DiskSlowIOTriggerred: specifies the event that is triggered when the I/O speed on the disk is slow.
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
         * >The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.
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
