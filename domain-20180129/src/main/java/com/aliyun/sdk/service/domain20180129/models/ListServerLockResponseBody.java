// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerLockResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerLockResponseBody</p>
 */
public class ListServerLockResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("NextPage")
    private Boolean nextPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePage")
    private Boolean prePage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
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
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * NextPage.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PrePage.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
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
        @NameInMap("DomainInstanceId")
        private String domainInstanceId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("LockInstanceId")
        private String lockInstanceId;

        @NameInMap("LockProductId")
        private String lockProductId;

        @NameInMap("ServerLockStatus")
        private String serverLockStatus;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("UserId")
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
             * DomainInstanceId.
             */
            public Builder domainInstanceId(String domainInstanceId) {
                this.domainInstanceId = domainInstanceId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * LockInstanceId.
             */
            public Builder lockInstanceId(String lockInstanceId) {
                this.lockInstanceId = lockInstanceId;
                return this;
            }

            /**
             * LockProductId.
             */
            public Builder lockProductId(String lockProductId) {
                this.lockProductId = lockProductId;
                return this;
            }

            /**
             * ServerLockStatus.
             */
            public Builder serverLockStatus(String serverLockStatus) {
                this.serverLockStatus = serverLockStatus;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * UserId.
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
