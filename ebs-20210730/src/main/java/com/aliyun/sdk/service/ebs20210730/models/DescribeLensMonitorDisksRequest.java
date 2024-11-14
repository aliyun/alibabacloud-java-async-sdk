// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>cloud</li>
         * <li>cloud_efficiency</li>
         * <li>cloud_ssd</li>
         * <li>cloud_essd</li>
         * <li>cloud_auto</li>
         * <li>cloud_essd_entry</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The list of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;d-1&quot;, &quot;d-2&quot;]</p>
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * <p>Event tags of the disk, which are used to filter the disks on which the events associated with the specified tags occurred in the previous 24 hours. Valid values:</p>
         * <ul>
         * <li>NoSnapshot: specifies the event that is triggered because no snapshot is created for the disk to protect data on the disk.</li>
         * <li>BurstIOTriggered: specifies the event that is triggered when a burst I/O operation is performed on the disk.</li>
         * <li>CostOptimizationNeeded: specifies the event that is triggered when cost optimization is required.</li>
         * <li>DiskSpecNotMatchedWithInstance: specifies the event that is triggered if the disk specifications do not match the instance to which the disk is attached.</li>
         * <li>DiskIONo4kAligned: specifies the event that is triggered if the physical and logical sectors involved in a read or write operation are not 4K aligned.</li>
         * <li>DiskIOHang: specifies the event that is triggered when an I/O hang occurs on the disk.</li>
         * <li>InstanceIOPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of IOPS on the instance reaches the upper limit.</li>
         * <li>InstanceBPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of BPS on the instance reaches the upper limit.</li>
         * <li>DiskIOPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of IOPS on the disk reaches the upper limit of the instance.</li>
         * <li>DiskBPSExceedInstanceMaxLimit: specifies the event that is triggered when the number of BPS on the disk reaches the upper limit of the instance.</li>
         * <li>DiskIOPSExceedDiskMaxLimit: specifies the event that is triggered when the number of IOPS on the disk reaches the upper limit of the disk.</li>
         * <li>DiskBPSExceedDiskMaxLimit: specifies the event that is triggered when the number of BPS on the disk reaches the upper limit of the disk.</li>
         * <li>DiskSlowIOTriggerred: specifies the event that is triggered when the I/O speed on the disk is slow.</li>
         * </ul>
         */
        public Builder lensTags(java.util.List < String > lensTags) {
            this.putQueryParameter("LensTags", lensTags);
            this.lensTags = lensTags;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to start the next query to retrieve more results.</p>
         * <blockquote>
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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

        @Override
        public DescribeLensMonitorDisksRequest build() {
            return new DescribeLensMonitorDisksRequest(this);
        } 

    } 

}
