// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Details of the distributed instance.</p>
         */
        public Builder globalDistributeCaches(java.util.List < GlobalDistributeCaches> globalDistributeCaches) {
            this.globalDistributeCaches = globalDistributeCaches;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F3F44BE3-5419-4B61-9BAC-E66E295A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGlobalDistributeCacheResponseBody build() {
            return new DescribeGlobalDistributeCacheResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalDistributeCacheResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDistributeCacheResponseBody</p>
     */
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
             * <p>The ID of the distributed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gr-bp14rkqrhac****</p>
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * <p>The instance type of the child instance. For more information, see the following topics:</p>
             * <ul>
             * <li><a href="https://help.aliyun.com/document_detail/145228.html">Standard DRAM-based instances</a></li>
             * <li><a href="https://help.aliyun.com/document_detail/150458.html">Cluster DRAM-based instances</a></li>
             * <li><a href="https://help.aliyun.com/document_detail/150459.html">Read/write splitting DRAM-based instances</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>redis.amber.logic.sharding.2g.2db.0rodb.6proxy.multithread</p>
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * <p>The ID of the child instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The state of the child instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is normal.</li>
             * <li><strong>Creating</strong>: The instance is being created.</li>
             * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
             * <li><strong>Inactive</strong>: The instance is disabled.</li>
             * <li><strong>Flushing</strong>: The instance is being released.</li>
             * <li><strong>Released</strong>: The instance is released.</li>
             * <li><strong>Transforming</strong>: The billing method of the instance is changing.</li>
             * <li><strong>Unavailable</strong>: The instance is suspended.</li>
             * <li><strong>Error</strong>: The instance failed to be created.</li>
             * <li><strong>Migrating</strong>: The instance is being migrated.</li>
             * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
             * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
             * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
             * <li><strong>SSLModifying</strong>: The SSL certificate of the instance is being changed.</li>
             * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains available during the upgrade.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about instance states, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance states and impacts</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeGlobalDistributeCacheResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDistributeCacheResponseBody</p>
     */
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
             * <p>The ID of the distributed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gr-bp14rkqrhac****</p>
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * <p>The state of the distributed instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is normal.</li>
             * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
             * <li><strong>Creating</strong>: The instance is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Details of the child instances.</p>
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
