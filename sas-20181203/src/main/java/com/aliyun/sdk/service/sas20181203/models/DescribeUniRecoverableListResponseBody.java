// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniRecoverableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUniRecoverableListResponseBody</p>
 */
public class DescribeUniRecoverableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RecoverableInfoList")
    private java.util.List < RecoverableInfoList> recoverableInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The number of entries returned on the current page.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * The name of the database.
         */
        public Builder database(String database) {
            this.database = database;
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
         * An array that consists of the backup snapshots.
         */
        public Builder recoverableInfoList(java.util.List < RecoverableInfoList> recoverableInfoList) {
            this.recoverableInfoList = recoverableInfoList;
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
         * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("ResetScn")
        private String resetScn;

        @com.aliyun.core.annotation.NameInMap("ResetTime")
        private Long resetTime;

        @com.aliyun.core.annotation.NameInMap("RestoreInfo")
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
             * The timestamp of the first backup. Unit: milliseconds.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * The timestamp of the last backup. Unit: milliseconds.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The identifier of the point in time for restoration in the backup version that is used. The database is an Oracle database.
             */
            public Builder resetScn(String resetScn) {
                this.resetScn = resetScn;
                return this;
            }

            /**
             * The point in time for restoration in the backup version that is used. The database is an Oracle database.
             */
            public Builder resetTime(Long resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * The information about the database. This parameter is available when the database is a Microsoft SQL Server (MSSQL) database. The value is a JSON string. Valid values:
             * <p>
             * 
             * *   **name**: the name of the database
             * *   **files**: the path to the database files
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
