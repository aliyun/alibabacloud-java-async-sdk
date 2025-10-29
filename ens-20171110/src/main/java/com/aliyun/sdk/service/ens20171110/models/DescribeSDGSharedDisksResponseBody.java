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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * SharedDisks.
         */
        public Builder sharedDisks(java.util.List<SharedDisks> sharedDisks) {
            this.sharedDisks = sharedDisks;
            return this;
        }

        /**
         * TotalCount.
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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
             * SdgId.
             */
            public Builder sdgId(String sdgId) {
                this.sdgId = sdgId;
                return this;
            }

            /**
             * SharedNum.
             */
            public Builder sharedNum(Integer sharedNum) {
                this.sharedNum = sharedNum;
                return this;
            }

            /**
             * Status.
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
