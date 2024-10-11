// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSynDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynDbsResponseBody</p>
 */
public class DescribeSynDbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SynDbs")
    private java.util.List < SynDbs> synDbs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSynDbsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.synDbs = builder.synDbs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynDbsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return synDbs
     */
    public java.util.List < SynDbs> getSynDbs() {
        return this.synDbs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SynDbs> synDbs; 
        private Integer totalCount; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7655F5F9-1313-5ABA-8516-F6EB79605A5F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about data synchronization between the ApsaraDB for ClickHouse cluster and an ApsaraDB RDS for MySQL instance.</p>
         */
        public Builder synDbs(java.util.List < SynDbs> synDbs) {
            this.synDbs = synDbs;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSynDbsResponseBody build() {
            return new DescribeSynDbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSynDbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSynDbsResponseBody</p>
     */
    public static class SynDbs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("RdsId")
        private String rdsId;

        @com.aliyun.core.annotation.NameInMap("RdsUserName")
        private String rdsUserName;

        @com.aliyun.core.annotation.NameInMap("RdsVpcUrl")
        private String rdsVpcUrl;

        @com.aliyun.core.annotation.NameInMap("SynDb")
        private String synDb;

        @com.aliyun.core.annotation.NameInMap("SynStatus")
        private Boolean synStatus;

        private SynDbs(Builder builder) {
            this.errorMsg = builder.errorMsg;
            this.rdsId = builder.rdsId;
            this.rdsUserName = builder.rdsUserName;
            this.rdsVpcUrl = builder.rdsVpcUrl;
            this.synDb = builder.synDb;
            this.synStatus = builder.synStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynDbs create() {
            return builder().build();
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return rdsId
         */
        public String getRdsId() {
            return this.rdsId;
        }

        /**
         * @return rdsUserName
         */
        public String getRdsUserName() {
            return this.rdsUserName;
        }

        /**
         * @return rdsVpcUrl
         */
        public String getRdsVpcUrl() {
            return this.rdsVpcUrl;
        }

        /**
         * @return synDb
         */
        public String getSynDb() {
            return this.synDb;
        }

        /**
         * @return synStatus
         */
        public Boolean getSynStatus() {
            return this.synStatus;
        }

        public static final class Builder {
            private String errorMsg; 
            private String rdsId; 
            private String rdsUserName; 
            private String rdsVpcUrl; 
            private String synDb; 
            private Boolean synStatus; 

            /**
             * <ul>
             * <li>When the value <strong>true</strong> is returned for the <strong>SynStatus</strong> parameter, the system does not return the ErrorMsg parameter.</li>
             * <li>When the value <strong>false</strong> is returned for the <strong>SynStatus</strong> parameter, the system returns for the ErrorMsg parameter the cause why the data synchronization failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ClickHouse exception, code: 49, host: 100.100.118.132, port: 49670; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The ID of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-wz9d11qg1j0h4****</p>
             */
            public Builder rdsId(String rdsId) {
                this.rdsId = rdsId;
                return this;
            }

            /**
             * <p>The database account that is used to log on to the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rdsUserName(String rdsUserName) {
                this.rdsUserName = rdsUserName;
                return this;
            }

            /**
             * <p>The internal endpoint of the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp16t9h3999xb0a711****.mysql.rds.aliyuncs.com:3306</p>
             */
            public Builder rdsVpcUrl(String rdsVpcUrl) {
                this.rdsVpcUrl = rdsVpcUrl;
                return this;
            }

            /**
             * <p>The name of the database in the ApsaraDB RDS for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder synDb(String synDb) {
                this.synDb = synDb;
                return this;
            }

            /**
             * <p>Indicates whether the data synchronization succeeded. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The data synchronization succeeded.</li>
             * <li><strong>false</strong>: The data synchronization failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder synStatus(Boolean synStatus) {
                this.synStatus = synStatus;
                return this;
            }

            public SynDbs build() {
                return new SynDbs(this);
            } 

        } 

    }
}
