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
 * {@link GetAggregateResourceCountsGroupByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceCountsGroupByRegionResponseBody</p>
 */
public class GetAggregateResourceCountsGroupByRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiscoveredResourceCountsSummary")
    private java.util.List<DiscoveredResourceCountsSummary> discoveredResourceCountsSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAggregateResourceCountsGroupByRegionResponseBody(Builder builder) {
        this.discoveredResourceCountsSummary = builder.discoveredResourceCountsSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceCountsGroupByRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAggregateResourceCountsGroupByRegionResponseBody model) {
            this.discoveredResourceCountsSummary = model.discoveredResourceCountsSummary;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the region by which statistics are collected.</p>
         */
        public Builder discoveredResourceCountsSummary(java.util.List<DiscoveredResourceCountsSummary> discoveredResourceCountsSummary) {
            this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>399BD94C-D20C-4D27-88D4-89E8D75C0595</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAggregateResourceCountsGroupByRegionResponseBody build() {
            return new GetAggregateResourceCountsGroupByRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateResourceCountsGroupByRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceCountsGroupByRegionResponseBody</p>
     */
    public static class DiscoveredResourceCountsSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Long resourceCount;

        private DiscoveredResourceCountsSummary(Builder builder) {
            this.groupName = builder.groupName;
            this.region = builder.region;
            this.resourceCount = builder.resourceCount;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCount
         */
        public Long getResourceCount() {
            return this.resourceCount;
        }

        public static final class Builder {
            private String groupName; 
            private String region; 
            private Long resourceCount; 

            private Builder() {
            } 

            private Builder(DiscoveredResourceCountsSummary model) {
                this.groupName = model.groupName;
                this.region = model.region;
                this.resourceCount = model.resourceCount;
            } 

            /**
             * <p>The dimension by which statistics are collected.</p>
             * <blockquote>
             * <p> In most cases, the <code>Region</code> parameter is returned instead of the GroupName parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The ID of the region by which statistics are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The total number of resources in the region.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            public DiscoveredResourceCountsSummary build() {
                return new DiscoveredResourceCountsSummary(this);
            } 

        } 

    }
}
