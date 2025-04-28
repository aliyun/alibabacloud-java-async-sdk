// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSyncJobListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncJobListResponseBody</p>
 */
public class DescribeSyncJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private Integer DBClusterId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SyncJobs")
    private java.util.List<SyncJobs> syncJobs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSyncJobListResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.syncJobs = builder.syncJobs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncJobListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public Integer getDBClusterId() {
        return this.DBClusterId;
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
     * @return syncJobs
     */
    public java.util.List<SyncJobs> getSyncJobs() {
        return this.syncJobs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer DBClusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SyncJobs> syncJobs; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSyncJobListResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.syncJobs = model.syncJobs;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-j6c22lubl8d9l3989</p>
         */
        public Builder DBClusterId(Integer DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

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
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>482B8BAE-6EC0-5C0E-B2AF-FD42A3FC5B67</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried synchronization jobs.</p>
         */
        public Builder syncJobs(java.util.List<SyncJobs> syncJobs) {
            this.syncJobs = syncJobs;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSyncJobListResponseBody build() {
            return new DescribeSyncJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSyncJobListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSyncJobListResponseBody</p>
     */
    public static class SyncJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SourceDBClusterDescription")
        private String sourceDBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("SourceDBClusterId")
        private String sourceDBClusterId;

        @com.aliyun.core.annotation.NameInMap("SourceDBType")
        private String sourceDBType;

        @com.aliyun.core.annotation.NameInMap("SourceStorageSize")
        private Integer sourceStorageSize;

        @com.aliyun.core.annotation.NameInMap("SourceTableNumber")
        private Integer sourceTableNumber;

        @com.aliyun.core.annotation.NameInMap("SyncPlatform")
        private String syncPlatform;

        private SyncJobs(Builder builder) {
            this.jobId = builder.jobId;
            this.regionId = builder.regionId;
            this.sourceDBClusterDescription = builder.sourceDBClusterDescription;
            this.sourceDBClusterId = builder.sourceDBClusterId;
            this.sourceDBType = builder.sourceDBType;
            this.sourceStorageSize = builder.sourceStorageSize;
            this.sourceTableNumber = builder.sourceTableNumber;
            this.syncPlatform = builder.syncPlatform;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncJobs create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceDBClusterDescription
         */
        public String getSourceDBClusterDescription() {
            return this.sourceDBClusterDescription;
        }

        /**
         * @return sourceDBClusterId
         */
        public String getSourceDBClusterId() {
            return this.sourceDBClusterId;
        }

        /**
         * @return sourceDBType
         */
        public String getSourceDBType() {
            return this.sourceDBType;
        }

        /**
         * @return sourceStorageSize
         */
        public Integer getSourceStorageSize() {
            return this.sourceStorageSize;
        }

        /**
         * @return sourceTableNumber
         */
        public Integer getSourceTableNumber() {
            return this.sourceTableNumber;
        }

        /**
         * @return syncPlatform
         */
        public String getSyncPlatform() {
            return this.syncPlatform;
        }

        public static final class Builder {
            private String jobId; 
            private String regionId; 
            private String sourceDBClusterDescription; 
            private String sourceDBClusterId; 
            private String sourceDBType; 
            private Integer sourceStorageSize; 
            private Integer sourceTableNumber; 
            private String syncPlatform; 

            private Builder() {
            } 

            private Builder(SyncJobs model) {
                this.jobId = model.jobId;
                this.regionId = model.regionId;
                this.sourceDBClusterDescription = model.sourceDBClusterDescription;
                this.sourceDBClusterId = model.sourceDBClusterId;
                this.sourceDBType = model.sourceDBType;
                this.sourceStorageSize = model.sourceStorageSize;
                this.sourceTableNumber = model.sourceTableNumber;
                this.syncPlatform = model.syncPlatform;
            } 

            /**
             * <p>The ID of the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>dts-xxxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The description of the source instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sourceDBClusterDescription(String sourceDBClusterDescription) {
                this.sourceDBClusterDescription = sourceDBClusterDescription;
                return this;
            }

            /**
             * <p>The ID of the source cluster. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query backup set IDs.</p>
             * <blockquote>
             * <p> If you want to restore the data of an ApsaraDB for ClickHouse cluster, this parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pc-t4n766v2llx852n81</p>
             */
            public Builder sourceDBClusterId(String sourceDBClusterId) {
                this.sourceDBClusterId = sourceDBClusterId;
                return this;
            }

            /**
             * <p>The database type of the source instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb</p>
             */
            public Builder sourceDBType(String sourceDBType) {
                this.sourceDBType = sourceDBType;
                return this;
            }

            /**
             * <p>The storage size of the source instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sourceStorageSize(Integer sourceStorageSize) {
                this.sourceStorageSize = sourceStorageSize;
                return this;
            }

            /**
             * <p>The number of tables in the source instance or cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sourceTableNumber(Integer sourceTableNumber) {
                this.sourceTableNumber = sourceTableNumber;
                return this;
            }

            /**
             * <p>The synchronization platform.</p>
             * 
             * <strong>example:</strong>
             * <p>ADB-CDC</p>
             */
            public Builder syncPlatform(String syncPlatform) {
                this.syncPlatform = syncPlatform;
                return this;
            }

            public SyncJobs build() {
                return new SyncJobs(this);
            } 

        } 

    }
}
