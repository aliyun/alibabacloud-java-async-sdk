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
 * {@link DescribeAccesskeyLeakListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccesskeyLeakListResponseBody</p>
 */
public class DescribeAccesskeyLeakListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyLeakList")
    private java.util.List<AccessKeyLeakList> accessKeyLeakList;

    @com.aliyun.core.annotation.NameInMap("AkLeakCount")
    private Integer akLeakCount;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("GmtLast")
    private Long gmtLast;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccesskeyLeakListResponseBody(Builder builder) {
        this.accessKeyLeakList = builder.accessKeyLeakList;
        this.akLeakCount = builder.akLeakCount;
        this.currentPage = builder.currentPage;
        this.gmtLast = builder.gmtLast;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccesskeyLeakListResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKeyLeakList
     */
    public java.util.List<AccessKeyLeakList> getAccessKeyLeakList() {
        return this.accessKeyLeakList;
    }

    /**
     * @return akLeakCount
     */
    public Integer getAkLeakCount() {
        return this.akLeakCount;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return gmtLast
     */
    public Long getGmtLast() {
        return this.gmtLast;
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
        private java.util.List<AccessKeyLeakList> accessKeyLeakList; 
        private Integer akLeakCount; 
        private Integer currentPage; 
        private Long gmtLast; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array that consists of the details about AccessKey pair leaks.</p>
         */
        public Builder accessKeyLeakList(java.util.List<AccessKeyLeakList> accessKeyLeakList) {
            this.accessKeyLeakList = accessKeyLeakList;
            return this;
        }

        /**
         * <p>The number of AccessKey pair leaks that are unhandled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder akLeakCount(Integer akLeakCount) {
            this.akLeakCount = akLeakCount;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1612357897000</p>
         */
        public Builder gmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B37C9052-A73E-4707-A024-9247702852BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of AccessKey pair leaks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccesskeyLeakListResponseBody build() {
            return new DescribeAccesskeyLeakListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccesskeyLeakListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccesskeyLeakListResponseBody</p>
     */
    public static class AccessKeyLeakList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccesskeyId")
        private String accesskeyId;

        @com.aliyun.core.annotation.NameInMap("AliUserName")
        private String aliUserName;

        @com.aliyun.core.annotation.NameInMap("Asset")
        private String asset;

        @com.aliyun.core.annotation.NameInMap("DealTime")
        private String dealTime;

        @com.aliyun.core.annotation.NameInMap("DealType")
        private String dealType;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private AccessKeyLeakList(Builder builder) {
            this.accesskeyId = builder.accesskeyId;
            this.aliUserName = builder.aliUserName;
            this.asset = builder.asset;
            this.dealTime = builder.dealTime;
            this.dealType = builder.dealType;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.status = builder.status;
            this.type = builder.type;
            this.url = builder.url;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessKeyLeakList create() {
            return builder().build();
        }

        /**
         * @return accesskeyId
         */
        public String getAccesskeyId() {
            return this.accesskeyId;
        }

        /**
         * @return aliUserName
         */
        public String getAliUserName() {
            return this.aliUserName;
        }

        /**
         * @return asset
         */
        public String getAsset() {
            return this.asset;
        }

        /**
         * @return dealTime
         */
        public String getDealTime() {
            return this.dealTime;
        }

        /**
         * @return dealType
         */
        public String getDealType() {
            return this.dealType;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String accesskeyId; 
            private String aliUserName; 
            private String asset; 
            private String dealTime; 
            private String dealType; 
            private Long gmtModified; 
            private Long id; 
            private String status; 
            private String type; 
            private String url; 
            private String userType; 

            /**
             * <p>The ID of the AccessKey pair that is leaked.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI4Fytv7ALKzkNVBV6****</p>
             */
            public Builder accesskeyId(String accesskeyId) {
                this.accesskeyId = accesskeyId;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account that is affected.</p>
             * 
             * <strong>example:</strong>
             * <p>testAccountName</p>
             */
            public Builder aliUserName(String aliUserName) {
                this.aliUserName = aliUserName;
                return this;
            }

            /**
             * <p>The platform to which the asset belongs. The value is fixed as <strong>Cloud platform</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud platform</p>
             */
            public Builder asset(String asset) {
                this.asset = asset;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair leak is handled.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-03 21:23:38</p>
             */
            public Builder dealTime(String dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * <p>The method to handle the AccessKey pair leak. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong>: The AccessKey pair leak is unhandled.</li>
             * <li><strong>manual</strong>: The AccessKey pair leak is manually handled.</li>
             * <li><strong>disable</strong>: The AccessKey pair leak is disabled.</li>
             * <li><strong>add-whitelist</strong>: The AccessKey pair leak is added to the whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder dealType(String dealType) {
                this.dealType = dealType;
                return this;
            }

            /**
             * <p>The time when the AccessKey pair leak is first detected. The value of this parameter is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1612357897000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The primary key ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>389357</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the AccessKey pair leak is handled. Valid values:</p>
             * <ul>
             * <li><strong>pending</strong>: unhandled</li>
             * <li><strong>dealed</strong>: handled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the leak. The value is fixed as <strong>AccessKey</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the platform on which the AccessKey pair leak is detected.</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The type of the account to which the leaked AccessKey pair belongs. Valid values:</p>
             * <ul>
             * <li><strong>master</strong>: Alibaba Cloud account</li>
             * <li><strong>ram</strong>: RAM user</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public AccessKeyLeakList build() {
                return new AccessKeyLeakList(this);
            } 

        } 

    }
}
