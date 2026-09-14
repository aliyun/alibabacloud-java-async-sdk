// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeLensMonitorDisksRequest} extends {@link RequestModel}
 *
 * <p>DescribeLensMonitorDisksRequest</p>
 */
public class DescribeLensMonitorDisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIdPattern")
    private String diskIdPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIds")
    private java.util.List<String> diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LensTags")
    private java.util.List<String> lensTags;

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
        this.diskIdPattern = builder.diskIdPattern;
        this.diskIds = builder.diskIds;
        this.ecsInstanceId = builder.ecsInstanceId;
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
     * @return diskIdPattern
     */
    public String getDiskIdPattern() {
        return this.diskIdPattern;
    }

    /**
     * @return diskIds
     */
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    /**
     * @return lensTags
     */
    public java.util.List<String> getLensTags() {
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
        private String diskIdPattern; 
        private java.util.List<String> diskIds; 
        private String ecsInstanceId; 
        private java.util.List<String> lensTags; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLensMonitorDisksRequest request) {
            super(request);
            this.diskCategory = request.diskCategory;
            this.diskIdPattern = request.diskIdPattern;
            this.diskIds = request.diskIds;
            this.ecsInstanceId = request.ecsInstanceId;
            this.lensTags = request.lensTags;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cloud disk type. Valid values:</p>
         * <ul>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: Enterprise SSD (ESSD).</li>
         * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
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
         * <p>The regular expression pattern used for fuzzy match filtering of cloud disk IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cd40hxfu0v*</p>
         */
        public Builder diskIdPattern(String diskIdPattern) {
            this.putQueryParameter("DiskIdPattern", diskIdPattern);
            this.diskIdPattern = diskIdPattern;
            return this;
        }

        /**
         * <p>The list of cloud disk IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;d-1\&quot;, \&quot;d-2\&quot;]</p>
         */
        public Builder diskIds(java.util.List<String> diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * <p>The ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zedroc0yv8z19ubnyos</p>
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * <p>The list of cloud disk event tags, used to filter cloud disks that have experienced these event types within the last 24 hours. Valid values:</p>
         * <ul>
         * <li>NoSnapshot: data protection</li>
         * <li>BurstIOTriggered: burst I/O</li>
         * <li>CostOptimizationNeeded: cost optimization</li>
         * <li>DiskSpecNotMatchedWithInstance: instance and cloud disk specifications do not match</li>
         * <li>DiskIONo4kAligned: non-4K aligned read/write</li>
         * <li>DiskIOHang: I/O hang occurred on the cloud disk</li>
         * <li>InstanceIOPSExceedInstanceMaxLimit: instance IOPS reached the upper limit</li>
         * <li>InstanceBPSExceedInstanceMaxLimit: instance BPS reached the upper limit</li>
         * <li>DiskIOPSExceedInstanceMaxLimit: cloud disk IOPS reached the instance upper limit</li>
         * <li>DiskBPSExceedInstanceMaxLimit: cloud disk BPS reached the instance upper limit</li>
         * <li>DiskIOPSExceedDiskMaxLimit: cloud disk IOPS reached the disk upper limit</li>
         * <li>DiskBPSExceedDiskMaxLimit: cloud disk BPS reached the disk upper limit</li>
         * </ul>
         */
        public Builder lensTags(java.util.List<String> lensTags) {
            this.putQueryParameter("LensTags", lensTags);
            this.lensTags = lensTags;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for a paged query. Maximum value: 100.
         * Default value:</p>
         * <ul>
         * <li><p>The default value is 10.</p>
         * </li>
         * <li><p>If the specified value is greater than 100, the default value of 100 is used.</p>
         * </li>
         * </ul>
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
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
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
         * <p>The region ID. You can call DescribeRegions to query the list of regions supported by EBS Lens.</p>
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
