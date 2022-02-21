// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstanceAllocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstanceAllocationsResponseBody</p>
 */
public class DescribeReservedInstanceAllocationsResponseBody extends TeaModel {
    @NameInMap("Allocations")
    private Allocations allocations;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeReservedInstanceAllocationsResponseBody(Builder builder) {
        this.allocations = builder.allocations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstanceAllocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return allocations
     */
    public Allocations getAllocations() {
        return this.allocations;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Allocations allocations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Allocations.
         */
        public Builder allocations(Allocations allocations) {
            this.allocations = allocations;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeReservedInstanceAllocationsResponseBody build() {
            return new DescribeReservedInstanceAllocationsResponseBody(this);
        } 

    } 

    public static class Allocation extends TeaModel {
        @NameInMap("BeAllocatedAccountId")
        private String beAllocatedAccountId;

        @NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @NameInMap("ResourceOwnerId")
        private String resourceOwnerId;

        private Allocation(Builder builder) {
            this.beAllocatedAccountId = builder.beAllocatedAccountId;
            this.reservedInstanceId = builder.reservedInstanceId;
            this.resourceOwnerId = builder.resourceOwnerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Allocation create() {
            return builder().build();
        }

        /**
         * @return beAllocatedAccountId
         */
        public String getBeAllocatedAccountId() {
            return this.beAllocatedAccountId;
        }

        /**
         * @return reservedInstanceId
         */
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        /**
         * @return resourceOwnerId
         */
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public static final class Builder {
            private String beAllocatedAccountId; 
            private String reservedInstanceId; 
            private String resourceOwnerId; 

            /**
             * BeAllocatedAccountId.
             */
            public Builder beAllocatedAccountId(String beAllocatedAccountId) {
                this.beAllocatedAccountId = beAllocatedAccountId;
                return this;
            }

            /**
             * ReservedInstanceId.
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * ResourceOwnerId.
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            public Allocation build() {
                return new Allocation(this);
            } 

        } 

    }
    public static class Allocations extends TeaModel {
        @NameInMap("Allocation")
        private java.util.List < Allocation> allocation;

        private Allocations(Builder builder) {
            this.allocation = builder.allocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Allocations create() {
            return builder().build();
        }

        /**
         * @return allocation
         */
        public java.util.List < Allocation> getAllocation() {
            return this.allocation;
        }

        public static final class Builder {
            private java.util.List < Allocation> allocation; 

            /**
             * Allocation.
             */
            public Builder allocation(java.util.List < Allocation> allocation) {
                this.allocation = allocation;
                return this;
            }

            public Allocations build() {
                return new Allocations(this);
            } 

        } 

    }
}
