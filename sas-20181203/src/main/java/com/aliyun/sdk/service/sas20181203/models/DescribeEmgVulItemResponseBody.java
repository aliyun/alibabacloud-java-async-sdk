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
 * {@link DescribeEmgVulItemResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmgVulItemResponseBody</p>
 */
public class DescribeEmgVulItemResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEmgVulItemResponseBody model) {
            this.currentPage = model.currentPage;
            this.groupedVulItems = model.groupedVulItems;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The information about the urgent vulnerabilities.</p>
         */
        public Builder groupedVulItems(java.util.List<GroupedVulItems> groupedVulItems) {
            this.groupedVulItems = groupedVulItems;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BC1868ED-A0E1-4D1C-BF7E-10DC0C34B3C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the urgent vulnerabilities returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEmgVulItemResponseBody build() {
            return new DescribeEmgVulItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEmgVulItemResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmgVulItemResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(GroupedVulItems model) {
                this.aliasName = model.aliasName;
                this.checkType = model.checkType;
                this.gmtLastCheck = model.gmtLastCheck;
                this.gmtPublish = model.gmtPublish;
                this.name = model.name;
                this.pendingCount = model.pendingCount;
                this.progress = model.progress;
                this.raspDefend = model.raspDefend;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The name of the urgent vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>Changjietong T + SetupAccount/Upload.aspx file Upload vulnerability (CNVD-2022-60632)</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The check method.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * <p>The timestamp when the urgent vulnerability was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1619286031000</p>
             */
            public Builder gmtLastCheck(Long gmtLastCheck) {
                this.gmtLastCheck = gmtLastCheck;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was disclosed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1618887687000</p>
             */
            public Builder gmtPublish(Long gmtPublish) {
                this.gmtPublish = gmtPublish;
                return this;
            }

            /**
             * <p>The name of the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>scan:AVD-2021-179344</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of unhandled urgent vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pendingCount(Integer pendingCount) {
                this.pendingCount = pendingCount;
                return this;
            }

            /**
             * <p>The progress of the urgent vulnerability detection task. Valid values: 0 to 100.</p>
             * <blockquote>
             * <p> This parameter takes effect only when an urgent vulnerability is being detected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Indicates whether the application protection feature is supported. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * <blockquote>
             * <p> If this parameter is not returned, the application protection is not supported.</p>
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
             * <p>The detection status of the urgent vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>10</strong>: The urgent vulnerability is not detected.</li>
             * <li><strong>20</strong>: The urgent vulnerability is being detected.</li>
             * <li><strong>30</strong>: The urgent vulnerability detection is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The method that is used to detect the urgent vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>python</strong>: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.</li>
             * <li><strong>scan</strong>: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>scan</p>
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
