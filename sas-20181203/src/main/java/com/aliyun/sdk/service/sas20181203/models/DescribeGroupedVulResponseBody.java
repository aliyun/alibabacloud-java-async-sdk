// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder groupedVulItems(java.util.List < GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * The tag that is used to search for the vulnerabilities. Valid values:
         * <p>
         * 
         * *   Restart required
         * *   Remote exploitation
         * *   Exploit exists
         * *   Exploitable
         * *   Privilege escalation
         * *   Code execution
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the asset group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The types of the vulnerabilities.
         * <p>
         * 
         * > This parameter is valid only for application vulnerabilities and vulnerabilities that are detected based on software component analysis.
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

        @NameInMap("RaspDefend")
        private Integer raspDefend;

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
            this.raspDefend = builder.raspDefend;
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
         * @return raspDefend
         */
        public Integer getRaspDefend() {
            return this.raspDefend;
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
            private Integer raspDefend; 
            private String tags; 
            private Long totalFixCount; 
            private String type; 

            /**
             * The number of handled vulnerabilities.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The tag that is added to the vulnerability. Valid values:
             * <p>
             * 
             * *   Restart required
             * *   Remote exploitation
             * *   Exploit exists
             * *   Exploitable
             * *   Privilege escalation
             * *   Code execution
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * An array that consists of the details about the vulnerability.
             */
            public Builder gmtLast(Long gmtLast) {
                this.gmtLast = gmtLast;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder handledCount(Integer handledCount) {
                this.handledCount = handledCount;
                return this;
            }

            /**
             * The number of vulnerabilities that have the **low** priority.
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * The timestamp when the vulnerability was last detected. Unit: milliseconds.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10.
             */
            public Builder raspDefend(Integer raspDefend) {
                this.raspDefend = raspDefend;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   **cve**: Linux software vulnerability
             * *   **sys**: Windows system vulnerability
             * *   **cms**: Web-CMS vulnerability
             * *   **app**: application vulnerability
             * *   **emg**: urgent vulnerability
             * *   **sca**: vulnerability that is detected based on software component analysis
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * gmtLast
             */
            public Builder totalFixCount(Long totalFixCount) {
                this.totalFixCount = totalFixCount;
                return this;
            }

            /**
             * The page number of the returned page.
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
