// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceCountsGroupByResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiscoveredResourceCountsGroupByResourceTypeResponseBody</p>
 */
public class GetDiscoveredResourceCountsGroupByResourceTypeResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceCountsSummary")
    private java.util.List < DiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    @NameInMap("RequestId")
    private String requestId;

    private GetDiscoveredResourceCountsGroupByResourceTypeResponseBody(Builder builder) {
        this.discoveredResourceCountsSummary = builder.discoveredResourceCountsSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceCountsGroupByResourceTypeResponseBody create() {
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
         * The statistics on the resources.
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

        public GetDiscoveredResourceCountsGroupByResourceTypeResponseBody build() {
            return new GetDiscoveredResourceCountsGroupByResourceTypeResponseBody(this);
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
             * The resource type by which the statistics are collected.
             * <p>
             * 
             * > We recommend that you use the `ResourceType` parameter.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The total number of resources.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * The resource type by which the statistics are collected.
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
