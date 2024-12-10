// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
    private java.util.List < SyncJobs> syncJobs;

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
    public java.util.List < SyncJobs> getSyncJobs() {
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
        private java.util.List < SyncJobs> syncJobs; 
        private Integer totalCount; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(Integer DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SyncJobs.
         */
        public Builder syncJobs(java.util.List < SyncJobs> syncJobs) {
            this.syncJobs = syncJobs;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SourceDBClusterDescription.
             */
            public Builder sourceDBClusterDescription(String sourceDBClusterDescription) {
                this.sourceDBClusterDescription = sourceDBClusterDescription;
                return this;
            }

            /**
             * SourceDBClusterId.
             */
            public Builder sourceDBClusterId(String sourceDBClusterId) {
                this.sourceDBClusterId = sourceDBClusterId;
                return this;
            }

            /**
             * SourceDBType.
             */
            public Builder sourceDBType(String sourceDBType) {
                this.sourceDBType = sourceDBType;
                return this;
            }

            /**
             * SourceStorageSize.
             */
            public Builder sourceStorageSize(Integer sourceStorageSize) {
                this.sourceStorageSize = sourceStorageSize;
                return this;
            }

            /**
             * SourceTableNumber.
             */
            public Builder sourceTableNumber(Integer sourceTableNumber) {
                this.sourceTableNumber = sourceTableNumber;
                return this;
            }

            /**
             * SyncPlatform.
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
