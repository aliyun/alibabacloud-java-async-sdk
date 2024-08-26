// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerLockResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerLockResponseBody</p>
 */
public class ListServerLockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListServerLockResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerLockResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return nextPage
     */
    public Boolean getNextPage() {
        return this.nextPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePage
     */
    public Boolean getPrePage() {
        return this.prePage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private java.util.List < Data> data; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * The page number.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the current page is followed by a page.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates whether the current page is preceded by a page.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListServerLockResponseBody build() {
            return new ListServerLockResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainInstanceId")
        private String domainInstanceId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LockInstanceId")
        private String lockInstanceId;

        @com.aliyun.core.annotation.NameInMap("LockProductId")
        private String lockProductId;

        @com.aliyun.core.annotation.NameInMap("ServerLockStatus")
        private String serverLockStatus;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.domainInstanceId = builder.domainInstanceId;
            this.domainName = builder.domainName;
            this.expireDate = builder.expireDate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.lockInstanceId = builder.lockInstanceId;
            this.lockProductId = builder.lockProductId;
            this.serverLockStatus = builder.serverLockStatus;
            this.startDate = builder.startDate;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domainInstanceId
         */
        public String getDomainInstanceId() {
            return this.domainInstanceId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lockInstanceId
         */
        public String getLockInstanceId() {
            return this.lockInstanceId;
        }

        /**
         * @return lockProductId
         */
        public String getLockProductId() {
            return this.lockProductId;
        }

        /**
         * @return serverLockStatus
         */
        public String getServerLockStatus() {
            return this.serverLockStatus;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String domainInstanceId; 
            private String domainName; 
            private String expireDate; 
            private String gmtCreate; 
            private String gmtModified; 
            private String lockInstanceId; 
            private String lockProductId; 
            private String serverLockStatus; 
            private String startDate; 
            private String userId; 

            /**
             * The instance ID of the domain name.
             */
            public Builder domainInstanceId(String domainInstanceId) {
                this.domainInstanceId = domainInstanceId;
                return this;
            }

            /**
             * The domain name that has valid registry lock information.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the domain name was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The instance ID of the domain name for which the registry lock is enabled.
             */
            public Builder lockInstanceId(String lockInstanceId) {
                this.lockInstanceId = lockInstanceId;
                return this;
            }

            /**
             * The ID of the product to which the domain name with the registry lock enabled belongs.
             */
            public Builder lockProductId(String lockProductId) {
                this.lockProductId = lockProductId;
                return this;
            }

            /**
             * The status of the registry lock.
             */
            public Builder serverLockStatus(String serverLockStatus) {
                this.serverLockStatus = serverLockStatus;
                return this;
            }

            /**
             * The start time.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
