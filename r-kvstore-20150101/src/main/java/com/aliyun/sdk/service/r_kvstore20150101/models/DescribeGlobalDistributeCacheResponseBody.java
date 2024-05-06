// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDistributeCacheResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDistributeCacheResponseBody</p>
 */
public class DescribeGlobalDistributeCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalDistributeCaches")
    private java.util.List < GlobalDistributeCaches> globalDistributeCaches;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeGlobalDistributeCacheResponseBody(Builder builder) {
        this.globalDistributeCaches = builder.globalDistributeCaches;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDistributeCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalDistributeCaches
     */
    public java.util.List < GlobalDistributeCaches> getGlobalDistributeCaches() {
        return this.globalDistributeCaches;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < GlobalDistributeCaches> globalDistributeCaches; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * Details of the distributed instance.
         */
        public Builder globalDistributeCaches(java.util.List < GlobalDistributeCaches> globalDistributeCaches) {
            this.globalDistributeCaches = globalDistributeCaches;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGlobalDistributeCacheResponseBody build() {
            return new DescribeGlobalDistributeCacheResponseBody(this);
        } 

    } 

    public static class SubInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private SubInstances(Builder builder) {
            this.globalInstanceId = builder.globalInstanceId;
            this.instanceClass = builder.instanceClass;
            this.instanceID = builder.instanceID;
            this.instanceStatus = builder.instanceStatus;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubInstances create() {
            return builder().build();
        }

        /**
         * @return globalInstanceId
         */
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String globalInstanceId; 
            private String instanceClass; 
            private String instanceID; 
            private String instanceStatus; 
            private String regionId; 

            /**
             * The ID of the distributed instance.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * The instance type of the child instance. For more information, see the following topics:
             * <p>
             * 
             * *   [Standard DRAM-based instances](~~145228~~)
             * *   [Cluster DRAM-based instances](~~150458~~)
             * *   [Read/write splitting DRAM-based instances](~~150459~~)
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * The ID of the child instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The state of the child instance. Valid values:
             * <p>
             * 
             * *   **Normal**: The instance is normal.
             * *   **Creating**: The instance is being created.
             * *   **Changing**: The configurations of the instance are being changed.
             * *   **Inactive**: The instance is disabled.
             * *   **Flushing**: The instance is being released.
             * *   **Released**: The instance is released.
             * *   **Transforming**: The billing method of the instance is changing.
             * *   **Unavailable**: The instance is suspended.
             * *   **Error**: The instance failed to be created.
             * *   **Migrating**: The instance is being migrated.
             * *   **BackupRecovering**: The instance is being restored from a backup.
             * *   **MinorVersionUpgrading**: The minor version of the instance is being updated.
             * *   **NetworkModifying**: The network type of the instance is being changed.
             * *   **SSLModifying**: The SSL certificate of the instance is being changed.
             * *   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains available during the upgrade.
             * 
             * >  For more information about instance states, see [Instance states and impacts](~~200740~~).
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SubInstances build() {
                return new SubInstances(this);
            } 

        } 

    }
    public static class GlobalDistributeCaches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubInstances")
        private java.util.List < SubInstances> subInstances;

        private GlobalDistributeCaches(Builder builder) {
            this.globalInstanceId = builder.globalInstanceId;
            this.status = builder.status;
            this.subInstances = builder.subInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalDistributeCaches create() {
            return builder().build();
        }

        /**
         * @return globalInstanceId
         */
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subInstances
         */
        public java.util.List < SubInstances> getSubInstances() {
            return this.subInstances;
        }

        public static final class Builder {
            private String globalInstanceId; 
            private String status; 
            private java.util.List < SubInstances> subInstances; 

            /**
             * The ID of the distributed instance.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * The state of the distributed instance. Valid values:
             * <p>
             * 
             * *   **Normal**: The instance is normal.
             * *   **Changing**: The configurations of the instance are being changed.
             * *   **Creating**: The instance is being created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Details of the child instances.
             */
            public Builder subInstances(java.util.List < SubInstances> subInstances) {
                this.subInstances = subInstances;
                return this;
            }

            public GlobalDistributeCaches build() {
                return new GlobalDistributeCaches(this);
            } 

        } 

    }
}
