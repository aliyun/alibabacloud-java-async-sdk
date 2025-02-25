// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link DescribeSupportedRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportedRegionsResponseBody</p>
 */
public class DescribeSupportedRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeSupportedRegionsResponseBody(Builder builder) {
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportedRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regions
     */
    public java.util.List<Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer pageIndex; 
        private Integer pageSize; 
        private java.util.List<Regions> regions; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private Integer totalPage; 

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSupportedRegionsResponseBody build() {
            return new DescribeSupportedRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSupportedRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSupportedRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        private Regions(Builder builder) {
            this.description = builder.description;
            this.extra = builder.extra;
            this.region = builder.region;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String description; 
            private String extra; 
            private String region; 
            private String regionName; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
