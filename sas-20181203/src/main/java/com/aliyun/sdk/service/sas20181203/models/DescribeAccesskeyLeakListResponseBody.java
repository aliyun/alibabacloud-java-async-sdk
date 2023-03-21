// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccesskeyLeakListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccesskeyLeakListResponseBody</p>
 */
public class DescribeAccesskeyLeakListResponseBody extends TeaModel {
    @NameInMap("AccessKeyLeakList")
    private java.util.List < AccessKeyLeakList> accessKeyLeakList;

    @NameInMap("AkLeakCount")
    private Integer akLeakCount;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("GmtLast")
    private Long gmtLast;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < AccessKeyLeakList> getAccessKeyLeakList() {
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
        private java.util.List < AccessKeyLeakList> accessKeyLeakList; 
        private Integer akLeakCount; 
        private Integer currentPage; 
        private Long gmtLast; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * An array that consists of the details about AccessKey pair leaks.
         */
        public Builder accessKeyLeakList(java.util.List < AccessKeyLeakList> accessKeyLeakList) {
            this.accessKeyLeakList = accessKeyLeakList;
            return this;
        }

        /**
         * The number of AccessKey pair leaks that are unhandled.
         */
        public Builder akLeakCount(Integer akLeakCount) {
            this.akLeakCount = akLeakCount;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder gmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of AccessKey pair leaks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccesskeyLeakListResponseBody build() {
            return new DescribeAccesskeyLeakListResponseBody(this);
        } 

    } 

    public static class AccessKeyLeakList extends TeaModel {
        @NameInMap("AccesskeyId")
        private String accesskeyId;

        @NameInMap("AliUserName")
        private String aliUserName;

        @NameInMap("Asset")
        private String asset;

        @NameInMap("DealTime")
        private String dealTime;

        @NameInMap("DealType")
        private String dealType;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("UserType")
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
             * The ID of the AccessKey pair that is leaked.
             */
            public Builder accesskeyId(String accesskeyId) {
                this.accesskeyId = accesskeyId;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account that is affected.
             */
            public Builder aliUserName(String aliUserName) {
                this.aliUserName = aliUserName;
                return this;
            }

            /**
             * The platform to which the asset belongs. The value is fixed as **Cloud platform**.
             */
            public Builder asset(String asset) {
                this.asset = asset;
                return this;
            }

            /**
             * The time when the AccessKey pair leak is handled.
             */
            public Builder dealTime(String dealTime) {
                this.dealTime = dealTime;
                return this;
            }

            /**
             * The method to handle the AccessKey pair leak. Valid values:
             * <p>
             * 
             * *   **pending**: The AccessKey pair leak is unhandled.
             * *   **manual**: The AccessKey pair leak is manually handled.
             * *   **disable**: The AccessKey pair leak is disabled.
             * *   **add-whitelist**: The AccessKey pair leak is added to the whitelist.
             */
            public Builder dealType(String dealType) {
                this.dealType = dealType;
                return this;
            }

            /**
             * The time when the AccessKey pair leak is first detected. The value of this parameter is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The primary key ID of the database.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the AccessKey pair leak is handled. Valid values:
             * <p>
             * 
             * *   **pending**: unhandled
             * *   **dealed**: handled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the leak. The value is fixed as **AccessKey**.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL of the platform on which the AccessKey pair leak is detected.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The type of the account to which the leaked AccessKey pair belongs. Valid values:
             * <p>
             * 
             * *   **master**: Alibaba Cloud account
             * *   **ram**: RAM user
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
