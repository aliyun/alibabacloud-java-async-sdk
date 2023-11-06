// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceCountsGroupByResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceCountsGroupByResourceTypeResponseBody</p>
 */
public class GetAggregateResourceCountsGroupByResourceTypeResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceCountsSummary")
    private java.util.List < DiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    @NameInMap("RequestId")
    private String requestId;

    private GetAggregateResourceCountsGroupByResourceTypeResponseBody(Builder builder) {
        this.discoveredResourceCountsSummary = builder.discoveredResourceCountsSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceCountsGroupByResourceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return discoveredResourceCountsSummary
     */
    public java.util.List < DiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DiscoveredResourceCountsSummary> discoveredResourceCountsSummary; 
        private String requestId; 

        /**
         * The resource type by which the statistics are collected.
         */
        public Builder discoveredResourceCountsSummary(java.util.List < DiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
            this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateResourceCountsGroupByResourceTypeResponseBody build() {
            return new GetAggregateResourceCountsGroupByResourceTypeResponseBody(this);
        } 

    } 

    public static class DiscoveredResourceCountsSummary extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ResourceCount")
        private Long resourceCount;

        @NameInMap("ResourceType")
        private String resourceType;

        private DiscoveredResourceCountsSummary(Builder builder) {
            this.groupName = builder.groupName;
            this.resourceCount = builder.resourceCount;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveredResourceCountsSummary create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return resourceCount
         */
        public Long getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String groupName; 
            private Long resourceCount; 
            private String resourceType; 

            /**
             * This parameter is expired. The resource type by which statistics are collected.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The total number of resources in the region.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * The resource type by which statistics are collected.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public DiscoveredResourceCountsSummary build() {
                return new DiscoveredResourceCountsSummary(this);
            } 

        } 

    }
}
