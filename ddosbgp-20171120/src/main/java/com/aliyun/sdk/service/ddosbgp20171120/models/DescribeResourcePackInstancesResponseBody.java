// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackInstancesResponseBody</p>
 */
public class DescribeResourcePackInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourcePacks")
    private java.util.List < ResourcePacks> resourcePacks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeResourcePackInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePacks = builder.resourcePacks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePacks
     */
    public java.util.List < ResourcePacks> getResourcePacks() {
        return this.resourcePacks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourcePacks> resourcePacks; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourcePacks.
         */
        public Builder resourcePacks(java.util.List < ResourcePacks> resourcePacks) {
            this.resourcePacks = resourcePacks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeResourcePackInstancesResponseBody build() {
            return new DescribeResourcePackInstancesResponseBody(this);
        } 

    } 

    public static class ResourcePacks extends TeaModel {
        @NameInMap("CurrCapacity")
        private Long currCapacity;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("InitCapacity")
        private Long initCapacity;

        @NameInMap("ResourcePackId")
        private String resourcePackId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private ResourcePacks(Builder builder) {
            this.currCapacity = builder.currCapacity;
            this.endTime = builder.endTime;
            this.initCapacity = builder.initCapacity;
            this.resourcePackId = builder.resourcePackId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePacks create() {
            return builder().build();
        }

        /**
         * @return currCapacity
         */
        public Long getCurrCapacity() {
            return this.currCapacity;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return initCapacity
         */
        public Long getInitCapacity() {
            return this.initCapacity;
        }

        /**
         * @return resourcePackId
         */
        public String getResourcePackId() {
            return this.resourcePackId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long currCapacity; 
            private Long endTime; 
            private Long initCapacity; 
            private String resourcePackId; 
            private Long startTime; 
            private String status; 

            /**
             * CurrCapacity.
             */
            public Builder currCapacity(Long currCapacity) {
                this.currCapacity = currCapacity;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InitCapacity.
             */
            public Builder initCapacity(Long initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * ResourcePackId.
             */
            public Builder resourcePackId(String resourcePackId) {
                this.resourcePackId = resourcePackId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourcePacks build() {
                return new ResourcePacks(this);
            } 

        } 

    }
}
