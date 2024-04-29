// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageGroupedVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageGroupedVulListResponseBody</p>
 */
public class DescribeImageGroupedVulListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("GroupedVulItems")
    private java.util.List < GroupedVulItems> groupedVulItems;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageGroupedVulListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.groupedVulItems = builder.groupedVulItems;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageGroupedVulListResponseBody create() {
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
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * An array that consists of the image vulnerabilities.
         */
        public Builder groupedVulItems(java.util.List < GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of image system vulnerabilities.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageGroupedVulListResponseBody build() {
            return new DescribeImageGroupedVulListResponseBody(this);
        } 

    } 

    public static class GroupedVulItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("AsapCount")
        private Integer asapCount;

        @com.aliyun.core.annotation.NameInMap("CanFix")
        private String canFix;

        @com.aliyun.core.annotation.NameInMap("GmtLast")
        private Long gmtLast;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("LaterCount")
        private Integer laterCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NntfCount")
        private Integer nntfCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GroupedVulItems(Builder builder) {
            this.aliasName = builder.aliasName;
            this.asapCount = builder.asapCount;
            this.canFix = builder.canFix;
            this.gmtLast = builder.gmtLast;
            this.lastScanTime = builder.lastScanTime;
            this.laterCount = builder.laterCount;
            this.name = builder.name;
            this.nntfCount = builder.nntfCount;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return canFix
         */
        public String getCanFix() {
            return this.canFix;
        }

        /**
         * @return gmtLast
         */
        public Long getGmtLast() {
            return this.gmtLast;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
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
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
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
            private String canFix; 
            private Long gmtLast; 
            private Long lastScanTime; 
            private Integer laterCount; 
            private String name; 
            private Integer nntfCount; 
            private Integer status; 
            private String tags; 
            private String type; 

            /**
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The number of vulnerabilities that have the high priority.
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * Indicates whether the vulnerability can be fixed in the Security Center console. Valid values:
             * <p>
             * 
             * *   **yes**
             * *   **no**
             */
            public Builder canFix(String canFix) {
                this.canFix = canFix;
                return this;
            }

            /**
             * The timestamp when the first scan was performed. Unit: milliseconds.
             */
            public Builder gmtLast(Long gmtLast) {
                this.gmtLast = gmtLast;
                return this;
            }

            /**
             * The timestamp when the last scan was performed. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * The number of vulnerabilities that have the medium priority.
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of vulnerabilities that have the low priority.
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * The status of the vulnerability. Valid values:
             * <p>
             * 
             * *   **0**: unhandled
             * *   **1**: handled
             * *   **2**: verifying
             * *   **3**: added to the whitelist
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The tag of the vulnerability. Valid values:
             * <p>
             * 
             * *   Restart required
             * *   Remote exploitation
             * *   Exploit exists
             * *   Exploitable
             * *   Privilege escalation
             * *   Code execution
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: image system vulnerability
             * *   **sca**: image application vulnerability
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
