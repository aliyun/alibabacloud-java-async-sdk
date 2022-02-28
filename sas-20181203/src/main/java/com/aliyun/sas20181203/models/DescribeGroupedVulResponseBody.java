// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedVulResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedVulResponseBody</p>
 */
public class DescribeGroupedVulResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("GroupedVulItems")
    private java.util.List < GroupedVulItems> groupedVulItems;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGroupedVulResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.groupedVulItems = builder.groupedVulItems;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedVulResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return groupedVulItems
     */
    public java.util.List < GroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
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
        private Integer currentPage; 
        private java.util.List < GroupedVulItems> groupedVulItems; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * GroupedVulItems.
         */
        public Builder groupedVulItems(java.util.List < GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
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

        public DescribeGroupedVulResponseBody build() {
            return new DescribeGroupedVulResponseBody(this);
        } 

    } 

    public static class GroupedVulItems extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("AsapCount")
        private Integer asapCount;

        @NameInMap("GmtLast")
        private Long gmtLast;

        @NameInMap("HandledCount")
        private Integer handledCount;

        @NameInMap("LaterCount")
        private Integer laterCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("NntfCount")
        private Integer nntfCount;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("TotalFixCount")
        private Long totalFixCount;

        @NameInMap("Type")
        private String type;

        private GroupedVulItems(Builder builder) {
            this.aliasName = builder.aliasName;
            this.asapCount = builder.asapCount;
            this.gmtLast = builder.gmtLast;
            this.handledCount = builder.handledCount;
            this.laterCount = builder.laterCount;
            this.name = builder.name;
            this.nntfCount = builder.nntfCount;
            this.tags = builder.tags;
            this.totalFixCount = builder.totalFixCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedVulItems create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return asapCount
         */
        public Integer getAsapCount() {
            return this.asapCount;
        }

        /**
         * @return gmtLast
         */
        public Long getGmtLast() {
            return this.gmtLast;
        }

        /**
         * @return handledCount
         */
        public Integer getHandledCount() {
            return this.handledCount;
        }

        /**
         * @return laterCount
         */
        public Integer getLaterCount() {
            return this.laterCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nntfCount
         */
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return totalFixCount
         */
        public Long getTotalFixCount() {
            return this.totalFixCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private Integer asapCount; 
            private Long gmtLast; 
            private Integer handledCount; 
            private Integer laterCount; 
            private String name; 
            private Integer nntfCount; 
            private String tags; 
            private Long totalFixCount; 
            private String type; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * AsapCount.
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * GmtLast.
             */
            public Builder gmtLast(Long gmtLast) {
                this.gmtLast = gmtLast;
                return this;
            }

            /**
             * HandledCount.
             */
            public Builder handledCount(Integer handledCount) {
                this.handledCount = handledCount;
                return this;
            }

            /**
             * LaterCount.
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NntfCount.
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TotalFixCount.
             */
            public Builder totalFixCount(Long totalFixCount) {
                this.totalFixCount = totalFixCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GroupedVulItems build() {
                return new GroupedVulItems(this);
            } 

        } 

    }
}
