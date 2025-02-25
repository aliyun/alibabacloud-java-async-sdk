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
    private java.util.List<RecoverableInfoList> recoverableInfoList;

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
    public java.util.List<RecoverableInfoList> getRecoverableInfoList() {
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
        private java.util.List<RecoverableInfoList> recoverableInfoList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>msdb</p>
         */
        public Builder database(String database) {
            this.database = database;
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
         * <p>An array that consists of the backup snapshots.</p>
         */
        public Builder recoverableInfoList(java.util.List<RecoverableInfoList> recoverableInfoList) {
            this.recoverableInfoList = recoverableInfoList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D0760****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeUniRecoverableListResponseBody build() {
            return new DescribeUniRecoverableListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUniRecoverableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUniRecoverableListResponseBody</p>
     */
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
             * <p>The timestamp of the first backup. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671468180000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The timestamp of the last backup. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671468180000</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The identifier of the point in time for restoration in the backup version that is used. The database is an Oracle database.</p>
             * 
             * <strong>example:</strong>
             * <p>4529940.0</p>
             */
            public Builder resetScn(String resetScn) {
                this.resetScn = resetScn;
                return this;
            }

            /**
             * <p>The point in time for restoration in the backup version that is used. The database is an Oracle database.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-30 08:04:36</p>
             */
            public Builder resetTime(Long resetTime) {
                this.resetTime = resetTime;
                return this;
            }

            /**
             * <p>The information about the database. This parameter is available when the database is a Microsoft SQL Server (MSSQL) database. The value is a JSON string. Valid values:</p>
             * <ul>
             * <li><strong>name</strong>: the name of the database</li>
             * <li><strong>files</strong>: the path to the database files</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;files&quot;: {
             *             &quot;qtc&quot;: &quot;F:\database\qtc.mdf&quot;,
             *             &quot;qtc_log&quot;: &quot;F:\database\qtc_0.ldf&quot;
             *       },
             *       &quot;name&quot;: &quot;qtc&quot;
             * }</p>
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
