// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeGeographicRegionMembershipResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGeographicRegionMembershipResponseBody</p>
 */
public class DescribeGeographicRegionMembershipResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private RegionIds regionIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGeographicRegionMembershipResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionIds = builder.regionIds;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGeographicRegionMembershipResponseBody create() {
        return builder().build();
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
    public RegionIds getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private RegionIds regionIds; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of regions.</p>
         */
        public Builder regionIds(RegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC9EB0C9-60AF-4A09-A36C-608F70130274</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGeographicRegionMembershipResponseBody build() {
            return new DescribeGeographicRegionMembershipResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGeographicRegionMembershipResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGeographicRegionMembershipResponseBody</p>
     */
    public static class RegionId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private RegionId(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionId create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String regionId; 

            /**
             * <p>The ID of the region.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionId build() {
                return new RegionId(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGeographicRegionMembershipResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGeographicRegionMembershipResponseBody</p>
     */
    public static class RegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private java.util.List<RegionId> regionId;

        private RegionIds(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionIds create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public java.util.List<RegionId> getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List<RegionId> regionId; 

            /**
             * <p>The ID of the region.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1</p>
             */
            public Builder regionId(java.util.List<RegionId> regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
}
