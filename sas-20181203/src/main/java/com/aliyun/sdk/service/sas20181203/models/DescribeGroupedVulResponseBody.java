// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGroupedVulResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedVulResponseBody</p>
 */
public class DescribeGroupedVulResponseBody extends TeaModel {
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The information about the vulnerability.</p>
         */
        public Builder groupedVulItems(java.util.List < GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9BFA6D78-07EA-5C0A-9358-E4434573507B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGroupedVulResponseBody build() {
            return new DescribeGroupedVulResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupedVulResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedVulResponseBody</p>
     */
    public static class GroupedVulItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("AsapCount")
        private Integer asapCount;

        @com.aliyun.core.annotation.NameInMap("GmtLast")
        private Long gmtLast;

        @com.aliyun.core.annotation.NameInMap("HandledCount")
        private Integer handledCount;

        @com.aliyun.core.annotation.NameInMap("LaterCount")
        private Integer laterCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NntfCount")
        private Integer nntfCount;

        @com.aliyun.core.annotation.NameInMap("RaspDefend")
        private Integer raspDefend;

        @com.aliyun.core.annotation.NameInMap("Related")
        private String related;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("TotalFixCount")
        private Long totalFixCount;

        @com.aliyun.core.annotation.NameInMap("Type")
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
            this.related = builder.related;
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
         * @return related
         */
        public String getRelated() {
            return this.related;
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
            private String related; 
            private String tags; 
            private Long totalFixCount; 
            private String type; 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2017:0184-Important: mysql security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that have the <strong>high</strong> priority.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1639371446000</p>
             */
            public Builder gmtLast(Long gmtLast) {
                this.gmtLast = gmtLast;
                return this;
            }

            /**
             * <p>The number of handled vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder handledCount(Integer handledCount) {
                this.handledCount = handledCount;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that have the <strong>medium</strong> priority.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20170184</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that have the <strong>low</strong> priority.</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * <p>Indicates whether the application protection feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not supported</li>
             * <li><strong>1</strong>: supported</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is not returned, the application protection feature is not supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder raspDefend(Integer raspDefend) {
                this.raspDefend = raspDefend;
                return this;
            }

            /**
             * <p>The IDs of the common vulnerabilities and exposures (CVEs) that are related to the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2023-24881,CVE-2023-24898</p>
             */
            public Builder related(String related) {
                this.related = related;
                return this;
            }

            /**
             * <p>The tag of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>Restart required</strong></li>
             * <li><strong>Remote utilization</strong></li>
             * <li><strong>EXP exists</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Elevation of Privilege</strong></li>
             * <li><strong>Code Execution</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Code Execution</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total number of fixed vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalFixCount(Long totalFixCount) {
                this.totalFixCount = totalFixCount;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability</li>
             * <li><strong>sys</strong>: Windows system vulnerability</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability</li>
             * <li><strong>app</strong>: application vulnerability</li>
             * <li><strong>emg</strong>: urgent vulnerability</li>
             * <li><strong>sca</strong>: vulnerability that is detected by software component analysis</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
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
