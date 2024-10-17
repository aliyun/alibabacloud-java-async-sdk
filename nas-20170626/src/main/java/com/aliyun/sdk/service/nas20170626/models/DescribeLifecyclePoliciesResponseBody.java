// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLifecyclePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecyclePoliciesResponseBody</p>
 */
public class DescribeLifecyclePoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicies")
    private java.util.List < LifecyclePolicies> lifecyclePolicies;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The queried lifecycle policies.</p>
         */
        public Builder lifecyclePolicies(java.util.List < LifecyclePolicies> lifecyclePolicies) {
            this.lifecyclePolicies = lifecyclePolicies;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of lifecycle policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLifecyclePoliciesResponseBody build() {
            return new DescribeLifecyclePoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLifecyclePoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecyclePoliciesResponseBody</p>
     */
    public static class LifecyclePolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
        private String lifecyclePolicyName;

        @com.aliyun.core.annotation.NameInMap("LifecycleRuleName")
        private String lifecycleRuleName;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List < String > paths;

        @com.aliyun.core.annotation.NameInMap("StorageType")
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
             * <p>The time when the lifecycle policy was created.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30T10:08:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>31a8e4****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The name of the lifecycle policy.</p>
             * 
             * <strong>example:</strong>
             * <p>lifecyclepolicy_01</p>
             */
            public Builder lifecyclePolicyName(String lifecyclePolicyName) {
                this.lifecyclePolicyName = lifecyclePolicyName;
                return this;
            }

            /**
             * <p>The management rule that is associated with the lifecycle policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DEFAULT_ATIME_14: Files that are not accessed in the last 14 days are dumped to the IA storage medium.</li>
             * <li>DEFAULT_ATIME_30: Files that are not accessed in the last 30 days are dumped to the IA storage medium.</li>
             * <li>DEFAULT_ATIME_60: Files that are not accessed in the last 60 days are dumped to the IA storage medium.</li>
             * <li>DEFAULT_ATIME_90: Files that are not accessed in the last 90 days are dumped to the IA storage medium.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_ATIME_14</p>
             */
            public Builder lifecycleRuleName(String lifecycleRuleName) {
                this.lifecycleRuleName = lifecycleRuleName;
                return this;
            }

            /**
             * <p>The absolute path of a directory with which the lifecycle policy is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>/pathway/to/folder</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The absolute paths to multiple directories associated with the lifecycle policy.</p>
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>The storage type of the data that is dumped to the IA storage medium.</p>
             * <p>Default value: InfrequentAccess (IA).</p>
             * 
             * <strong>example:</strong>
             * <p>InfrequentAccess</p>
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
