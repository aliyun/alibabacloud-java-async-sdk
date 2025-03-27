// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListLoadBalancerRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLoadBalancerRegionsResponseBody</p>
 */
public class ListLoadBalancerRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<Regions> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListLoadBalancerRegionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regions = builder.regions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancerRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Regions> regions; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListLoadBalancerRegionsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regions = model.regions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Number of records per page</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>List of region information</p>
         */
        public Builder regions(java.util.List<Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>81A5E222-24BF-17EF-9E80-A68D9B8F363D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListLoadBalancerRegionsResponseBody build() {
            return new ListLoadBalancerRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLoadBalancerRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancerRegionsResponseBody</p>
     */
    public static class SubRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubRegionCnName")
        private String subRegionCnName;

        @com.aliyun.core.annotation.NameInMap("SubRegionCode")
        private String subRegionCode;

        @com.aliyun.core.annotation.NameInMap("SubRegionEnName")
        private String subRegionEnName;

        private SubRegions(Builder builder) {
            this.subRegionCnName = builder.subRegionCnName;
            this.subRegionCode = builder.subRegionCode;
            this.subRegionEnName = builder.subRegionEnName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubRegions create() {
            return builder().build();
        }

        /**
         * @return subRegionCnName
         */
        public String getSubRegionCnName() {
            return this.subRegionCnName;
        }

        /**
         * @return subRegionCode
         */
        public String getSubRegionCode() {
            return this.subRegionCode;
        }

        /**
         * @return subRegionEnName
         */
        public String getSubRegionEnName() {
            return this.subRegionEnName;
        }

        public static final class Builder {
            private String subRegionCnName; 
            private String subRegionCode; 
            private String subRegionEnName; 

            private Builder() {
            } 

            private Builder(SubRegions model) {
                this.subRegionCnName = model.subRegionCnName;
                this.subRegionCode = model.subRegionCode;
                this.subRegionEnName = model.subRegionEnName;
            } 

            /**
             * <p>Secondary region Chinese full name</p>
             * 
             * <strong>example:</strong>
             * <p>印度尼西亚</p>
             */
            public Builder subRegionCnName(String subRegionCnName) {
                this.subRegionCnName = subRegionCnName;
                return this;
            }

            /**
             * <p>Secondary region code</p>
             * 
             * <strong>example:</strong>
             * <p>ID</p>
             */
            public Builder subRegionCode(String subRegionCode) {
                this.subRegionCode = subRegionCode;
                return this;
            }

            /**
             * <p>Secondary region English full name</p>
             * 
             * <strong>example:</strong>
             * <p>Indonesia</p>
             */
            public Builder subRegionEnName(String subRegionEnName) {
                this.subRegionEnName = subRegionEnName;
                return this;
            }

            public SubRegions build() {
                return new SubRegions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLoadBalancerRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancerRegionsResponseBody</p>
     */
    public static class Regions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionCnName")
        private String regionCnName;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("RegionEnName")
        private String regionEnName;

        @com.aliyun.core.annotation.NameInMap("SubRegions")
        private java.util.List<SubRegions> subRegions;

        private Regions(Builder builder) {
            this.regionCnName = builder.regionCnName;
            this.regionCode = builder.regionCode;
            this.regionEnName = builder.regionEnName;
            this.subRegions = builder.subRegions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return regionCnName
         */
        public String getRegionCnName() {
            return this.regionCnName;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return regionEnName
         */
        public String getRegionEnName() {
            return this.regionEnName;
        }

        /**
         * @return subRegions
         */
        public java.util.List<SubRegions> getSubRegions() {
            return this.subRegions;
        }

        public static final class Builder {
            private String regionCnName; 
            private String regionCode; 
            private String regionEnName; 
            private java.util.List<SubRegions> subRegions; 

            private Builder() {
            } 

            private Builder(Regions model) {
                this.regionCnName = model.regionCnName;
                this.regionCode = model.regionCode;
                this.regionEnName = model.regionEnName;
                this.subRegions = model.subRegions;
            } 

            /**
             * <p>Primary region Chinese full name</p>
             * 
             * <strong>example:</strong>
             * <p>东南亚</p>
             */
            public Builder regionCnName(String regionCnName) {
                this.regionCnName = regionCnName;
                return this;
            }

            /**
             * <p>Primary region code</p>
             * 
             * <strong>example:</strong>
             * <p>SEAS</p>
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * <p>Primary region English full name</p>
             * 
             * <strong>example:</strong>
             * <p>South East Asia</p>
             */
            public Builder regionEnName(String regionEnName) {
                this.regionEnName = regionEnName;
                return this;
            }

            /**
             * <p>List of secondary region information</p>
             */
            public Builder subRegions(java.util.List<SubRegions> subRegions) {
                this.subRegions = subRegions;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
