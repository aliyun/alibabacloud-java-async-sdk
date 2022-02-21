// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecyclePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecyclePoliciesResponseBody</p>
 */
public class DescribeLifecyclePoliciesResponseBody extends TeaModel {
    @NameInMap("LifecyclePolicies")
    private java.util.List < LifecyclePolicies> lifecyclePolicies;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLifecyclePoliciesResponseBody(Builder builder) {
        this.lifecyclePolicies = builder.lifecyclePolicies;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLifecyclePoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return lifecyclePolicies
     */
    public java.util.List < LifecyclePolicies> getLifecyclePolicies() {
        return this.lifecyclePolicies;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < LifecyclePolicies> lifecyclePolicies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * LifecyclePolicies.
         */
        public Builder lifecyclePolicies(java.util.List < LifecyclePolicies> lifecyclePolicies) {
            this.lifecyclePolicies = lifecyclePolicies;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecyclePoliciesResponseBody build() {
            return new DescribeLifecyclePoliciesResponseBody(this);
        } 

    } 

    public static class LifecyclePolicies extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("LifecyclePolicyName")
        private String lifecyclePolicyName;

        @NameInMap("LifecycleRuleName")
        private String lifecycleRuleName;

        @NameInMap("Path")
        private String path;

        @NameInMap("Paths")
        private java.util.List < String > paths;

        @NameInMap("StorageType")
        private String storageType;

        private LifecyclePolicies(Builder builder) {
            this.createTime = builder.createTime;
            this.fileSystemId = builder.fileSystemId;
            this.lifecyclePolicyName = builder.lifecyclePolicyName;
            this.lifecycleRuleName = builder.lifecycleRuleName;
            this.path = builder.path;
            this.paths = builder.paths;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LifecyclePolicies create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return lifecyclePolicyName
         */
        public String getLifecyclePolicyName() {
            return this.lifecyclePolicyName;
        }

        /**
         * @return lifecycleRuleName
         */
        public String getLifecycleRuleName() {
            return this.lifecycleRuleName;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return paths
         */
        public java.util.List < String > getPaths() {
            return this.paths;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String createTime; 
            private String fileSystemId; 
            private String lifecyclePolicyName; 
            private String lifecycleRuleName; 
            private String path; 
            private java.util.List < String > paths; 
            private String storageType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * LifecyclePolicyName.
             */
            public Builder lifecyclePolicyName(String lifecyclePolicyName) {
                this.lifecyclePolicyName = lifecyclePolicyName;
                return this;
            }

            /**
             * LifecycleRuleName.
             */
            public Builder lifecycleRuleName(String lifecycleRuleName) {
                this.lifecycleRuleName = lifecycleRuleName;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public LifecyclePolicies build() {
                return new LifecyclePolicies(this);
            } 

        } 

    }
}
