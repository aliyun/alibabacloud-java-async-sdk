// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEmgVulItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmgVulItemResponseBody</p>
 */
public class DescribeEmgVulItemResponseBody extends TeaModel {
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
         * The page number of the returned page. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The information about the urgent vulnerabilities.
         */
        public Builder groupedVulItems(java.util.List < GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: **10**.
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
         * The total number of the urgent vulnerabilities returned.
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
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("GmtLastCheck")
        private Long gmtLastCheck;

        @com.aliyun.core.annotation.NameInMap("GmtPublish")
        private Long gmtPublish;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PendingCount")
        private Integer pendingCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("RaspDefend")
        private Integer raspDefend;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GroupedVulItems(Builder builder) {
            this.aliasName = builder.aliasName;
            this.checkType = builder.checkType;
            this.gmtLastCheck = builder.gmtLastCheck;
            this.gmtPublish = builder.gmtPublish;
            this.name = builder.name;
            this.pendingCount = builder.pendingCount;
            this.progress = builder.progress;
            this.raspDefend = builder.raspDefend;
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
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
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
         * @return raspDefend
         */
        public Integer getRaspDefend() {
            return this.raspDefend;
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
            private Integer checkType; 
            private Long gmtLastCheck; 
            private Long gmtPublish; 
            private String name; 
            private Integer pendingCount; 
            private Integer progress; 
            private Integer raspDefend; 
            private Integer status; 
            private String type; 

            /**
             * The name of the urgent vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The check method.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * The timestamp when the urgent vulnerability was last detected. Unit: milliseconds.
             */
            public Builder gmtLastCheck(Long gmtLastCheck) {
                this.gmtLastCheck = gmtLastCheck;
                return this;
            }

            /**
             * The timestamp when the vulnerability was disclosed. Unit: milliseconds.
             */
            public Builder gmtPublish(Long gmtPublish) {
                this.gmtPublish = gmtPublish;
                return this;
            }

            /**
             * The name of the detection rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of unhandled urgent vulnerabilities.
             */
            public Builder pendingCount(Integer pendingCount) {
                this.pendingCount = pendingCount;
                return this;
            }

            /**
             * The progress of the urgent vulnerability detection task. Valid values: 0 to 100.
             * <p>
             * 
             * >  This parameter takes effect only when an urgent vulnerability is being detected.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Indicates whether the application protection feature is supported. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             * 
             * >  If this parameter is not returned, the application protection is not supported.
             */
            public Builder raspDefend(Integer raspDefend) {
                this.raspDefend = raspDefend;
                return this;
            }

            /**
             * The detection status of the urgent vulnerability. Valid values:
             * <p>
             * 
             * *   **10**: The urgent vulnerability is not detected.
             * *   **20**: The urgent vulnerability is being detected.
             * *   **30**: The urgent vulnerability detection is complete.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The method that is used to detect the urgent vulnerability. Valid values:
             * <p>
             * 
             * *   **python**: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.
             * *   **scan**: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.
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
