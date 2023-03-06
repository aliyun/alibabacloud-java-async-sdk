// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGeographicRegionMembershipResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGeographicRegionMembershipResponseBody</p>
 */
public class DescribeGeographicRegionMembershipResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionIds")
    private RegionIds regionIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The list of regions.
         */
        public Builder regionIds(RegionIds regionIds) {
            this.regionIds = regionIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGeographicRegionMembershipResponseBody build() {
            return new DescribeGeographicRegionMembershipResponseBody(this);
        } 

    } 

    public static class RegionId extends TeaModel {
        @NameInMap("RegionId")
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
             * The ID of the region.
             * <p>
             * 
             * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
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
    public static class RegionIds extends TeaModel {
        @NameInMap("RegionId")
        private java.util.List < RegionId> regionId;

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
        public java.util.List < RegionId> getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < RegionId> regionId; 

            /**
             * The ID of the region.
             * <p>
             * 
             * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
             */
            public Builder regionId(java.util.List < RegionId> regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionIds build() {
                return new RegionIds(this);
            } 

        } 

    }
}
