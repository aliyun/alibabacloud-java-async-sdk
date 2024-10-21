// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether the current page is preceded by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListServerLockResponseBody build() {
            return new ListServerLockResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServerLockResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerLockResponseBody</p>
     */
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
             * <p>The instance ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>S20190N1DAI4****</p>
             */
            public Builder domainInstanceId(String domainInstanceId) {
                this.domainInstanceId = domainInstanceId;
                return this;
            }

            /**
             * <p>The domain name that has valid registry lock information.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2030-07-10 17:37:36</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-19 16:38:07</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the domain name was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-19 16:40:38</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The instance ID of the domain name for which the registry lock is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>S2021591IQ28****</p>
             */
            public Builder lockInstanceId(String lockInstanceId) {
                this.lockInstanceId = lockInstanceId;
                return this;
            }

            /**
             * <p>The ID of the product to which the domain name with the registry lock enabled belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1807**</p>
             */
            public Builder lockProductId(String lockProductId) {
                this.lockProductId = lockProductId;
                return this;
            }

            /**
             * <p>The status of the registry lock.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder serverLockStatus(String serverLockStatus) {
                this.serverLockStatus = serverLockStatus;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-10 17:37:36</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>121000000****</p>
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
