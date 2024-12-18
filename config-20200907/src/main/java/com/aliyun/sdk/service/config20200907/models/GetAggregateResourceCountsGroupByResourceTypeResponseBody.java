// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateResourceCountsGroupByResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceCountsGroupByResourceTypeResponseBody</p>
 */
public class GetAggregateResourceCountsGroupByResourceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiscoveredResourceCountsSummary")
    private java.util.List<DiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<DiscoveredResourceCountsSummary> getDiscoveredResourceCountsSummary() {
        return this.discoveredResourceCountsSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DiscoveredResourceCountsSummary> discoveredResourceCountsSummary; 
        private String requestId; 

        /**
         * <p>The resource type by which the statistics are collected.</p>
         */
        public Builder discoveredResourceCountsSummary(java.util.List<DiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
            this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99114B22-1EFF-47DF-B906-1CCE82FF9D60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateResourceCountsGroupByResourceTypeResponseBody build() {
            return new GetAggregateResourceCountsGroupByResourceTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateResourceCountsGroupByResourceTypeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceCountsGroupByResourceTypeResponseBody</p>
     */
    public static class DiscoveredResourceCountsSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Long resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
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
             * <p>This parameter is expired. The resource type by which statistics are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::RAM::Role</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The total number of resources in the region.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * <p>The resource type by which statistics are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::RAM::Role</p>
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
