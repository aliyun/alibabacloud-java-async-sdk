// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstanceCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceCategoriesResponseBody</p>
 */
public class DescribeReservedInstanceCategoriesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReservedInstanceCategories")
    private ReservedInstanceCategories reservedInstanceCategories;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeReservedInstanceCategoriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.reservedInstanceCategories = builder.reservedInstanceCategories;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstanceCategoriesResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reservedInstanceCategories
     */
    public ReservedInstanceCategories getReservedInstanceCategories() {
        return this.reservedInstanceCategories;
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
        private String requestId; 
        private ReservedInstanceCategories reservedInstanceCategories; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReservedInstanceCategories.
         */
        public Builder reservedInstanceCategories(ReservedInstanceCategories reservedInstanceCategories) {
            this.reservedInstanceCategories = reservedInstanceCategories;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeReservedInstanceCategoriesResponseBody build() {
            return new DescribeReservedInstanceCategoriesResponseBody(this);
        } 

    } 

    public static class ReservedInstanceCategory extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("ZoneId")
        private String zoneId;

        private ReservedInstanceCategory(Builder builder) {
            this.amount = builder.amount;
            this.instanceAmount = builder.instanceAmount;
            this.instanceType = builder.instanceType;
            this.platform = builder.platform;
            this.regionId = builder.regionId;
            this.scope = builder.scope;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstanceCategory create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer instanceAmount; 
            private String instanceType; 
            private String platform; 
            private String regionId; 
            private String scope; 
            private String zoneId; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * InstanceAmount.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ReservedInstanceCategory build() {
                return new ReservedInstanceCategory(this);
            } 

        } 

    }
    public static class ReservedInstanceCategories extends TeaModel {
        @NameInMap("ReservedInstanceCategory")
        private java.util.List < ReservedInstanceCategory> reservedInstanceCategory;

        private ReservedInstanceCategories(Builder builder) {
            this.reservedInstanceCategory = builder.reservedInstanceCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstanceCategories create() {
            return builder().build();
        }

        /**
         * @return reservedInstanceCategory
         */
        public java.util.List < ReservedInstanceCategory> getReservedInstanceCategory() {
            return this.reservedInstanceCategory;
        }

        public static final class Builder {
            private java.util.List < ReservedInstanceCategory> reservedInstanceCategory; 

            /**
             * ReservedInstanceCategory.
             */
            public Builder reservedInstanceCategory(java.util.List < ReservedInstanceCategory> reservedInstanceCategory) {
                this.reservedInstanceCategory = reservedInstanceCategory;
                return this;
            }

            public ReservedInstanceCategories build() {
                return new ReservedInstanceCategories(this);
            } 

        } 

    }
}
