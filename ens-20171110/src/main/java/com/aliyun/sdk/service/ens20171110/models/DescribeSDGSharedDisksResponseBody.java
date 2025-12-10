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
 * {@link DescribeSDGSharedDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSDGSharedDisksResponseBody</p>
 */
public class DescribeSDGSharedDisksResponseBody extends TeaModel {
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

    private DescribeSDGSharedDisksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sharedDisks = builder.sharedDisks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGSharedDisksResponseBody create() {
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

        private Builder(DescribeSDGSharedDisksResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sharedDisks = model.sharedDisks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Current page number when paging</p>
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
         * <p>xxxsxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Shared disk list</p>
         */
        public Builder sharedDisks(java.util.List<SharedDisks> sharedDisks) {
            this.sharedDisks = sharedDisks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSDGSharedDisksResponseBody build() {
            return new DescribeSDGSharedDisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSDGSharedDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGSharedDisksResponseBody</p>
     */
    public static class SharedDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SdgId")
        private String sdgId;

        @com.aliyun.core.annotation.NameInMap("SharedNum")
        private Integer sharedNum;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SharedDisks(Builder builder) {
            this.creationTime = builder.creationTime;
            this.diskId = builder.diskId;
            this.diskType = builder.diskType;
            this.namespace = builder.namespace;
            this.regionId = builder.regionId;
            this.sdgId = builder.sdgId;
            this.sharedNum = builder.sharedNum;
            this.status = builder.status;
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
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
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

        /**
         * @return sharedNum
         */
        public Integer getSharedNum() {
            return this.sharedNum;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String diskId; 
            private String diskType; 
            private String namespace; 
            private String regionId; 
            private String sdgId; 
            private Integer sharedNum; 
            private String status; 

            private Builder() {
            } 

            private Builder(SharedDisks model) {
                this.creationTime = model.creationTime;
                this.diskId = model.diskId;
                this.diskType = model.diskType;
                this.namespace = model.namespace;
                this.regionId = model.regionId;
                this.sdgId = model.sdgId;
                this.sharedNum = model.sharedNum;
                this.status = model.status;
            } 

            /**
             * <p>The time when the shared disk was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-09T15:13:21+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>shared disk id</p>
             * 
             * <strong>example:</strong>
             * <p>d-57kvvpuj1rk2ghumlgs6</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>Shared disk type</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The namespace of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>SdgId of the shared disk</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-fqehhfdjv</p>
             */
            public Builder sdgId(String sdgId) {
                this.sdgId = sdgId;
                return this;
            }

            /**
             * <p>Number of shared mounts</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sharedNum(Integer sharedNum) {
                this.sharedNum = sharedNum;
                return this;
            }

            /**
             * <p>Shared disk status</p>
             * 
             * <strong>example:</strong>
             * <p>avaliable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SharedDisks build() {
                return new SharedDisks(this);
            } 

        } 

    }
}
