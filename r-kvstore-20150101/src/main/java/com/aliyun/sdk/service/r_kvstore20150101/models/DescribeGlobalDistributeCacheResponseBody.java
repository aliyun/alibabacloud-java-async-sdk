// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeGlobalDistributeCacheResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDistributeCacheResponseBody</p>
 */
public class DescribeGlobalDistributeCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalDistributeCaches")
    private java.util.List<GlobalDistributeCaches> globalDistributeCaches;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return globalDistributeCaches
     */
    public java.util.List<GlobalDistributeCaches> getGlobalDistributeCaches() {
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
        private java.util.List<GlobalDistributeCaches> globalDistributeCaches; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeGlobalDistributeCacheResponseBody model) {
            this.globalDistributeCaches = model.globalDistributeCaches;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of distributed instances.</p>
         */
        public Builder globalDistributeCaches(java.util.List<GlobalDistributeCaches> globalDistributeCaches) {
            this.globalDistributeCaches = globalDistributeCaches;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F3F44BE3-5419-4B61-9BAC-E66E295A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
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

            private Builder() {
            } 

            private Builder(SubInstances model) {
                this.globalInstanceId = model.globalInstanceId;
                this.instanceClass = model.instanceClass;
                this.instanceID = model.instanceID;
                this.instanceStatus = model.instanceStatus;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The instance ID of the distributed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gr-bp14rkqrhac****</p>
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * <p>The instance type of the child instance. For more information, see:</p>
             * <ul>
             * <li><a href="https://help.aliyun.com/document_detail/145228.html">Standard memory-optimized instance types</a>.</li>
             * <li><a href="https://help.aliyun.com/document_detail/150458.html">Cluster memory-optimized instance types</a>.</li>
             * <li><a href="https://help.aliyun.com/document_detail/150459.html">Read/write splitting memory-optimized instance types</a>.</li>
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
             * <p>The instance ID of the child instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****</p>
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * <p>The instance status of the child instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is in a normal state.</li>
             * <li><strong>Creating</strong>: The instance is being created.</li>
             * <li><strong>Changing</strong>: The instance is being modified.</li>
             * <li><strong>Inactive</strong>: The instance is disabled.</li>
             * <li><strong>Flushing</strong>: The instance is being purged.</li>
             * <li><strong>Released</strong>: The instance is released.</li>
             * <li><strong>Transforming</strong>: The instance is being transformed.</li>
             * <li><strong>Unavailable</strong>: The service is stopped.</li>
             * <li><strong>Error</strong>: The instance failed to be created.</li>
             * <li><strong>Migrating</strong>: The instance is being migrated.</li>
             * <li><strong>BackupRecovering</strong>: The instance is recovering from a backup.</li>
             * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being upgraded.</li>
             * <li><strong>NetworkModifying</strong>: The network of the instance is being modified.</li>
             * <li><strong>SSLModifying</strong>: The SSL certificate of the instance is being modified.</li>
             * <li><strong>MajorVersionUpgrading</strong>: A major engine version upgrade is in progress. The instance remains accessible.</li>
             * </ul>
             * <blockquote>
             * <p>For more information about instance statuses and their impacts, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance statuses and impacts</a>.</p>
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
             * <p>The region ID.</p>
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
        private java.util.List<SubInstances> subInstances;

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
        public java.util.List<SubInstances> getSubInstances() {
            return this.subInstances;
        }

        public static final class Builder {
            private String globalInstanceId; 
            private String status; 
            private java.util.List<SubInstances> subInstances; 

            private Builder() {
            } 

            private Builder(GlobalDistributeCaches model) {
                this.globalInstanceId = model.globalInstanceId;
                this.status = model.status;
                this.subInstances = model.subInstances;
            } 

            /**
             * <p>The instance ID of the distributed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gr-bp14rkqrhac****</p>
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * <p>The instance status of the distributed instance. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: The instance is running.</li>
             * <li><strong>Changing</strong>: The instance is being modified.</li>
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
             * <p>The list of child instances.</p>
             */
            public Builder subInstances(java.util.List<SubInstances> subInstances) {
                this.subInstances = subInstances;
                return this;
            }

            public GlobalDistributeCaches build() {
                return new GlobalDistributeCaches(this);
            } 

        } 

    }
}
