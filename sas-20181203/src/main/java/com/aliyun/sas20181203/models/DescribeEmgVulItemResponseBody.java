// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeEmgVulItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmgVulItemResponseBody</p>
 */
public class DescribeEmgVulItemResponseBody extends TeaModel {
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


    private DescribeEmgVulItemResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.groupedVulItems = builder.groupedVulItems;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmgVulItemResponseBody create() {
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
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>GroupedVulItems.</p>
         */
        public Builder groupedVulItems(java.util.List < GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEmgVulItemResponseBody build() {
            return new DescribeEmgVulItemResponseBody(this);
        } 

    } 

    public static class GroupedVulItems extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("GmtLastCheck")
        private Long gmtLastCheck;

        @NameInMap("GmtPublish")
        private Long gmtPublish;

        @NameInMap("Name")
        private String name;

        @NameInMap("PendingCount")
        private Integer pendingCount;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private String type;


        private GroupedVulItems(Builder builder) {
            this.aliasName = builder.aliasName;
            this.gmtLastCheck = builder.gmtLastCheck;
            this.gmtPublish = builder.gmtPublish;
            this.name = builder.name;
            this.pendingCount = builder.pendingCount;
            this.progress = builder.progress;
            this.status = builder.status;
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
         * @return gmtLastCheck
         */
        public Long getGmtLastCheck() {
            return this.gmtLastCheck;
        }

        /**
         * @return gmtPublish
         */
        public Long getGmtPublish() {
            return this.gmtPublish;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pendingCount
         */
        public Integer getPendingCount() {
            return this.pendingCount;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private Long gmtLastCheck; 
            private Long gmtPublish; 
            private String name; 
            private Integer pendingCount; 
            private Integer progress; 
            private Integer status; 
            private String type; 

            /**
             * <p>AliasName.</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>GmtLastCheck.</p>
             */
            public Builder gmtLastCheck(Long gmtLastCheck) {
                this.gmtLastCheck = gmtLastCheck;
                return this;
            }

            /**
             * <p>GmtPublish.</p>
             */
            public Builder gmtPublish(Long gmtPublish) {
                this.gmtPublish = gmtPublish;
                return this;
            }

            /**
             * <p>Name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>PendingCount.</p>
             */
            public Builder pendingCount(Integer pendingCount) {
                this.pendingCount = pendingCount;
                return this;
            }

            /**
             * <p>Progress.</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Type.</p>
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
