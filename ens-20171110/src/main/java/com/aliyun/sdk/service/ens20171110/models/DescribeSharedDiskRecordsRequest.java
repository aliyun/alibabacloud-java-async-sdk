// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSharedDiskRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSharedDiskRecordsRequest</p>
 */
public class DescribeSharedDiskRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskIds")
    private java.util.List<String> diskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List<String> namespaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdgIds")
    private java.util.List<String> sdgIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeSharedDiskRecordsRequest(Builder builder) {
        super(builder);
        this.diskIds = builder.diskIds;
        this.endTime = builder.endTime;
        this.namespaces = builder.namespaces;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionIds = builder.regionIds;
        this.sdgIds = builder.sdgIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSharedDiskRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskIds
     */
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return namespaces
     */
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
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
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return sdgIds
     */
    public java.util.List<String> getSdgIds() {
        return this.sdgIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeSharedDiskRecordsRequest, Builder> {
        private java.util.List<String> diskIds; 
        private String endTime; 
        private java.util.List<String> namespaces; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> regionIds; 
        private java.util.List<String> sdgIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSharedDiskRecordsRequest request) {
            super(request);
            this.diskIds = request.diskIds;
            this.endTime = request.endTime;
            this.namespaces = request.namespaces;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionIds = request.regionIds;
            this.sdgIds = request.sdgIds;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The list of shared disk IDs.</p>
         */
        public Builder diskIds(java.util.List<String> diskIds) {
            String diskIdsShrink = shrink(diskIds, "DiskIds", "json");
            this.putQueryParameter("DiskIds", diskIdsShrink);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * <p>The billing end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-30T08:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The list of namespaces.</p>
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The page number used for paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of region IDs.</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The list of SDG IDs.</p>
         */
        public Builder sdgIds(java.util.List<String> sdgIds) {
            String sdgIdsShrink = shrink(sdgIds, "SdgIds", "json");
            this.putQueryParameter("SdgIds", sdgIdsShrink);
            this.sdgIds = sdgIds;
            return this;
        }

        /**
         * <p>The billing start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-21T10:22:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeSharedDiskRecordsRequest build() {
            return new DescribeSharedDiskRecordsRequest(this);
        } 

    } 

}
