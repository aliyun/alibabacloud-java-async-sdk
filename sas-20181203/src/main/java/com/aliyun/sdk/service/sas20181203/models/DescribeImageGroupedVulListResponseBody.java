// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageGroupedVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageGroupedVulListResponseBody</p>
 */
public class DescribeImageGroupedVulListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("GroupedVulItems")
    private java.util.List<GroupedVulItems> groupedVulItems;

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
    public java.util.List<GroupedVulItems> getGroupedVulItems() {
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
        private java.util.List<GroupedVulItems> groupedVulItems; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>An array that consists of the image vulnerabilities.</p>
         */
        public Builder groupedVulItems(java.util.List<GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
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
         * <p>5E244439-UJND-8BF7-26F36E21B9AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of image system vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageGroupedVulListResponseBody build() {
            return new DescribeImageGroupedVulListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageGroupedVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageGroupedVulListResponseBody</p>
     */
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
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2017:3075-Important: wget security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that have the high priority.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability can be fixed in the Security Center console. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
             */
            public Builder canFix(String canFix) {
                this.canFix = canFix;
                return this;
            }

            /**
             * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1611201274000</p>
             */
            public Builder gmtLast(Long gmtLast) {
                this.gmtLast = gmtLast;
                return this;
            }

            /**
             * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1611201274000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that have the medium priority.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>debian:9:CVE-2019-3858</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that have the low priority.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * <p>The status of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>1</strong>: handled</li>
             * <li><strong>2</strong>: verifying</li>
             * <li><strong>3</strong>: added to the whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the vulnerability. Valid values:</p>
             * <ul>
             * <li>Restart required</li>
             * <li>Remote exploitation</li>
             * <li>Exploit exists</li>
             * <li>Exploitable</li>
             * <li>Privilege escalation</li>
             * <li>Code execution</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EXP exists</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: image system vulnerability</li>
             * <li><strong>sca</strong>: image application vulnerability</li>
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
