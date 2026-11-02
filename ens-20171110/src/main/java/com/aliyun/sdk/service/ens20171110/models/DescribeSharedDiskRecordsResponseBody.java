// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSharedDiskRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSharedDiskRecordsResponseBody</p>
 */
public class DescribeSharedDiskRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SharedDisks")
    private java.util.List<SharedDisks> sharedDisks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSharedDiskRecordsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sharedDisks = builder.sharedDisks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSharedDiskRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sharedDisks
     */
    public java.util.List<SharedDisks> getSharedDisks() {
        return this.sharedDisks;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<SharedDisks> sharedDisks; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSharedDiskRecordsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sharedDisks = model.sharedDisks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68B85217-03B8-5141-9216-EA4D7C496B9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of shared disk billing records.</p>
         */
        public Builder sharedDisks(java.util.List<SharedDisks> sharedDisks) {
            this.sharedDisks = sharedDisks;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSharedDiskRecordsResponseBody build() {
            return new DescribeSharedDiskRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSharedDiskRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSharedDiskRecordsResponseBody</p>
     */
    public static class SharedDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Long diskSize;

        @com.aliyun.core.annotation.NameInMap("LastDetachInstanceId")
        private String lastDetachInstanceId;

        @com.aliyun.core.annotation.NameInMap("LastDetachTime")
        private String lastDetachTime;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private Long performanceLevel;

        @com.aliyun.core.annotation.NameInMap("RecycleTime")
        private String recycleTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SdgId")
        private String sdgId;

        private SharedDisks(Builder builder) {
            this.creationTime = builder.creationTime;
            this.diskId = builder.diskId;
            this.diskSize = builder.diskSize;
            this.lastDetachInstanceId = builder.lastDetachInstanceId;
            this.lastDetachTime = builder.lastDetachTime;
            this.namespace = builder.namespace;
            this.performanceLevel = builder.performanceLevel;
            this.recycleTime = builder.recycleTime;
            this.regionId = builder.regionId;
            this.sdgId = builder.sdgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedDisks create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskSize
         */
        public Long getDiskSize() {
            return this.diskSize;
        }

        /**
         * @return lastDetachInstanceId
         */
        public String getLastDetachInstanceId() {
            return this.lastDetachInstanceId;
        }

        /**
         * @return lastDetachTime
         */
        public String getLastDetachTime() {
            return this.lastDetachTime;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return performanceLevel
         */
        public Long getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return recycleTime
         */
        public String getRecycleTime() {
            return this.recycleTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sdgId
         */
        public String getSdgId() {
            return this.sdgId;
        }

        public static final class Builder {
            private String creationTime; 
            private String diskId; 
            private Long diskSize; 
            private String lastDetachInstanceId; 
            private String lastDetachTime; 
            private String namespace; 
            private Long performanceLevel; 
            private String recycleTime; 
            private String regionId; 
            private String sdgId; 

            private Builder() {
            } 

            private Builder(SharedDisks model) {
                this.creationTime = model.creationTime;
                this.diskId = model.diskId;
                this.diskSize = model.diskSize;
                this.lastDetachInstanceId = model.lastDetachInstanceId;
                this.lastDetachTime = model.lastDetachTime;
                this.namespace = model.namespace;
                this.performanceLevel = model.performanceLevel;
                this.recycleTime = model.recycleTime;
                this.regionId = model.regionId;
                this.sdgId = model.sdgId;
            } 

            /**
             * <p>The creation time of the shared disk.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-01 10:00:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The shared disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-57kvvpuj1rk2ghumlgs6</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The disk size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder diskSize(Long diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The instance from which the shared disk was last detached.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder lastDetachInstanceId(String lastDetachInstanceId) {
                this.lastDetachInstanceId = lastDetachInstanceId;
                return this;
            }

            /**
             * <p>The time when the shared disk was last detached.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-14 18:00:00</p>
             */
            public Builder lastDetachTime(String lastDetachTime) {
                this.lastDetachTime = lastDetachTime;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The SDG sharing ratio parameter, which supports cloud disks with different maximum sharing ratios.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder performanceLevel(Long performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The recycle time of the shared disk.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-15 14:30:00</p>
             */
            public Builder recycleTime(String recycleTime) {
                this.recycleTime = recycleTime;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The SDG ID of the shared disk.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-fqehhfdjv</p>
             */
            public Builder sdgId(String sdgId) {
                this.sdgId = sdgId;
                return this;
            }

            public SharedDisks build() {
                return new SharedDisks(this);
            } 

        } 

    }
}
