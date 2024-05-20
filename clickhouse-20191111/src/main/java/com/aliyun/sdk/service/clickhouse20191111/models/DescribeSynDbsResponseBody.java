// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about data synchronization between the ApsaraDB for ClickHouse cluster and an ApsaraDB RDS for MySQL instance.
         */
        public Builder synDbs(java.util.List < SynDbs> synDbs) {
            this.synDbs = synDbs;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSynDbsResponseBody build() {
            return new DescribeSynDbsResponseBody(this);
        } 

    } 

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
             * *   When the value **true** is returned for the **SynStatus** parameter, the system does not return the ErrorMsg parameter.
             * <p>
             * *   When the value **false** is returned for the **SynStatus** parameter, the system returns for the ErrorMsg parameter the cause why the data synchronization failed.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The ID of the ApsaraDB RDS for MySQL instance.
             */
            public Builder rdsId(String rdsId) {
                this.rdsId = rdsId;
                return this;
            }

            /**
             * The database account that is used to log on to the ApsaraDB RDS for MySQL instance.
             */
            public Builder rdsUserName(String rdsUserName) {
                this.rdsUserName = rdsUserName;
                return this;
            }

            /**
             * The internal endpoint of the ApsaraDB RDS for MySQL instance.
             */
            public Builder rdsVpcUrl(String rdsVpcUrl) {
                this.rdsVpcUrl = rdsVpcUrl;
                return this;
            }

            /**
             * The name of the database in the ApsaraDB RDS for MySQL instance.
             */
            public Builder synDb(String synDb) {
                this.synDb = synDb;
                return this;
            }

            /**
             * Indicates whether the data synchronization succeeded. Valid values:
             * <p>
             * 
             * *   **true**: The data synchronization succeeded.
             * *   **false**: The data synchronization failed.
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
