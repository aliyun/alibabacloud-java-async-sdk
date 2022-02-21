// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceCountsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiscoveredResourceCountsResponseBody</p>
 */
public class GetDiscoveredResourceCountsResponseBody extends TeaModel {
    @NameInMap("GroupedResourceCounts")
    private GroupedResourceCounts groupedResourceCounts;

    @NameInMap("RequestId")
    private String requestId;

    private GetDiscoveredResourceCountsResponseBody(Builder builder) {
        this.groupedResourceCounts = builder.groupedResourceCounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceCountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedResourceCounts
     */
    public GroupedResourceCounts getGroupedResourceCounts() {
        return this.groupedResourceCounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupedResourceCounts groupedResourceCounts; 
        private String requestId; 

        /**
         * GroupedResourceCounts.
         */
        public Builder groupedResourceCounts(GroupedResourceCounts groupedResourceCounts) {
            this.groupedResourceCounts = groupedResourceCounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDiscoveredResourceCountsResponseBody build() {
            return new GetDiscoveredResourceCountsResponseBody(this);
        } 

    } 

    public static class GroupedResourceCountList extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("ResourceCount")
        private Long resourceCount;

        private GroupedResourceCountList(Builder builder) {
            this.groupName = builder.groupName;
            this.resourceCount = builder.resourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedResourceCountList create() {
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

        public static final class Builder {
            private String groupName; 
            private Long resourceCount; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ResourceCount.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            public GroupedResourceCountList build() {
                return new GroupedResourceCountList(this);
            } 

        } 

    }
    public static class GroupedResourceCounts extends TeaModel {
        @NameInMap("GroupByKey")
        private String groupByKey;

        @NameInMap("GroupedResourceCountList")
        private java.util.List < GroupedResourceCountList> groupedResourceCountList;

        private GroupedResourceCounts(Builder builder) {
            this.groupByKey = builder.groupByKey;
            this.groupedResourceCountList = builder.groupedResourceCountList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedResourceCounts create() {
            return builder().build();
        }

        /**
         * @return groupByKey
         */
        public String getGroupByKey() {
            return this.groupByKey;
        }

        /**
         * @return groupedResourceCountList
         */
        public java.util.List < GroupedResourceCountList> getGroupedResourceCountList() {
            return this.groupedResourceCountList;
        }

        public static final class Builder {
            private String groupByKey; 
            private java.util.List < GroupedResourceCountList> groupedResourceCountList; 

            /**
             * GroupByKey.
             */
            public Builder groupByKey(String groupByKey) {
                this.groupByKey = groupByKey;
                return this;
            }

            /**
             * GroupedResourceCountList.
             */
            public Builder groupedResourceCountList(java.util.List < GroupedResourceCountList> groupedResourceCountList) {
                this.groupedResourceCountList = groupedResourceCountList;
                return this;
            }

            public GroupedResourceCounts build() {
                return new GroupedResourceCounts(this);
            } 

        } 

    }
}
