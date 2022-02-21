// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiscoveredResourceSummaryResponseBody</p>
 */
public class GetDiscoveredResourceSummaryResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceSummary")
    private DiscoveredResourceSummary discoveredResourceSummary;

    @NameInMap("RequestId")
    private String requestId;

    private GetDiscoveredResourceSummaryResponseBody(Builder builder) {
        this.discoveredResourceSummary = builder.discoveredResourceSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return discoveredResourceSummary
     */
    public DiscoveredResourceSummary getDiscoveredResourceSummary() {
        return this.discoveredResourceSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiscoveredResourceSummary discoveredResourceSummary; 
        private String requestId; 

        /**
         * DiscoveredResourceSummary.
         */
        public Builder discoveredResourceSummary(DiscoveredResourceSummary discoveredResourceSummary) {
            this.discoveredResourceSummary = discoveredResourceSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDiscoveredResourceSummaryResponseBody build() {
            return new GetDiscoveredResourceSummaryResponseBody(this);
        } 

    } 

    public static class DiscoveredResourceSummary extends TeaModel {
        @NameInMap("RegionCount")
        private Integer regionCount;

        @NameInMap("ResourceCount")
        private Integer resourceCount;

        @NameInMap("ResourceTypeCount")
        private Integer resourceTypeCount;

        private DiscoveredResourceSummary(Builder builder) {
            this.regionCount = builder.regionCount;
            this.resourceCount = builder.resourceCount;
            this.resourceTypeCount = builder.resourceTypeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveredResourceSummary create() {
            return builder().build();
        }

        /**
         * @return regionCount
         */
        public Integer getRegionCount() {
            return this.regionCount;
        }

        /**
         * @return resourceCount
         */
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceTypeCount
         */
        public Integer getResourceTypeCount() {
            return this.resourceTypeCount;
        }

        public static final class Builder {
            private Integer regionCount; 
            private Integer resourceCount; 
            private Integer resourceTypeCount; 

            /**
             * RegionCount.
             */
            public Builder regionCount(Integer regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(Integer resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * ResourceTypeCount.
             */
            public Builder resourceTypeCount(Integer resourceTypeCount) {
                this.resourceTypeCount = resourceTypeCount;
                return this;
            }

            public DiscoveredResourceSummary build() {
                return new DiscoveredResourceSummary(this);
            } 

        } 

    }
}
