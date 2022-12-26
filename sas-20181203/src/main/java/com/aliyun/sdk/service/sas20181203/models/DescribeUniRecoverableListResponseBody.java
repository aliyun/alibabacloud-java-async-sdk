// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniRecoverableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniRecoverableListResponseBody</p>
 */
public class DescribeUniRecoverableListResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Database")
    private String database;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RecoverableInfoList")
    private java.util.List < RecoverableInfoList> recoverableInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeUniRecoverableListResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.database = builder.database;
        this.pageSize = builder.pageSize;
        this.recoverableInfoList = builder.recoverableInfoList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniRecoverableListResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return recoverableInfoList
     */
    public java.util.List < RecoverableInfoList> getRecoverableInfoList() {
        return this.recoverableInfoList;
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
        private Integer count; 
        private Integer currentPage; 
        private String database; 
        private Integer pageSize; 
        private java.util.List < RecoverableInfoList> recoverableInfoList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.database = database;
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
         * RecoverableInfoList.
         */
        public Builder recoverableInfoList(java.util.List < RecoverableInfoList> recoverableInfoList) {
            this.recoverableInfoList = recoverableInfoList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUniRecoverableListResponseBody build() {
            return new DescribeUniRecoverableListResponseBody(this);
        } 

    } 

    public static class RecoverableInfoList extends TeaModel {
        @NameInMap("FirstTime")
        private Long firstTime;

        @NameInMap("LastTime")
        private Long lastTime;

        @NameInMap("ResetScn")
        private String resetScn;

        @NameInMap("ResetTime")
        private Long resetTime;

        @NameInMap("RestoreInfo")
        private String restoreInfo;

        private RecoverableInfoList(Builder builder) {
            this.firstTime = builder.firstTime;
            this.lastTime = builder.lastTime;
            this.resetScn = builder.resetScn;
            this.resetTime = builder.resetTime;
            this.restoreInfo = builder.restoreInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecoverableInfoList create() {
            return builder().build();
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return resetScn
         */
        public String getResetScn() {
            return this.resetScn;
        }

        /**
         * @return resetTime
         */
        public Long getResetTime() {
            return this.resetTime;
        }

        /**
         * @return restoreInfo
         */
        public String getRestoreInfo() {
            return this.restoreInfo;
        }

        public static final class Builder {
            private Long firstTime; 
            private Long lastTime; 
            private String resetScn; 
            private Long resetTime; 
            private String restoreInfo; 

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * LastTime.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * ResetScn.
             */
            public Builder resetScn(String resetScn) {
                this.resetScn = resetScn;
                return this;
            }

            /**
             * ResetTime.
             */
            public Builder resetTime(Long resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * RestoreInfo.
             */
            public Builder restoreInfo(String restoreInfo) {
                this.restoreInfo = restoreInfo;
                return this;
            }

            public RecoverableInfoList build() {
                return new RecoverableInfoList(this);
            } 

        } 

    }
}
