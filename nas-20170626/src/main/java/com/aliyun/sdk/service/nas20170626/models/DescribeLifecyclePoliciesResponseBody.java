// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeLifecyclePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLifecyclePoliciesResponseBody</p>
 */
public class DescribeLifecyclePoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LifecyclePolicies")
    private java.util.List<LifecyclePolicies> lifecyclePolicies;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lifecyclePolicies
     */
    public java.util.List<LifecyclePolicies> getLifecyclePolicies() {
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
        private java.util.List<LifecyclePolicies> lifecyclePolicies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLifecyclePoliciesResponseBody model) {
            this.lifecyclePolicies = model.lifecyclePolicies;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried lifecycle policies.</p>
         */
        public Builder lifecyclePolicies(java.util.List<LifecyclePolicies> lifecyclePolicies) {
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
    public static class RetrieveRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private RetrieveRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetrieveRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(RetrieveRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * <p>Attribute of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>RetrieveType</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>Threshold for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public RetrieveRules build() {
                return new RetrieveRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLifecyclePoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLifecyclePoliciesResponseBody</p>
     */
    public static class TransitRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private TransitRules(Builder builder) {
            this.attribute = builder.attribute;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRules create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String attribute; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(TransitRules model) {
                this.attribute = model.attribute;
                this.threshold = model.threshold;
            } 

            /**
             * <p>Attribute of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Atime</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>Threshold for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public TransitRules build() {
                return new TransitRules(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("LifecyclePolicyId")
        private String lifecyclePolicyId;

        @com.aliyun.core.annotation.NameInMap("LifecyclePolicyName")
        private String lifecyclePolicyName;

        @com.aliyun.core.annotation.NameInMap("LifecyclePolicyType")
        private String lifecyclePolicyType;

        @com.aliyun.core.annotation.NameInMap("LifecycleRuleName")
        private String lifecycleRuleName;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("RetrieveRules")
        private java.util.List<RetrieveRules> retrieveRules;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("TransitRules")
        private java.util.List<TransitRules> transitRules;

        private LifecyclePolicies(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemId = builder.fileSystemId;
            this.lifecyclePolicyId = builder.lifecyclePolicyId;
            this.lifecyclePolicyName = builder.lifecyclePolicyName;
            this.lifecyclePolicyType = builder.lifecyclePolicyType;
            this.lifecycleRuleName = builder.lifecycleRuleName;
            this.path = builder.path;
            this.paths = builder.paths;
            this.retrieveRules = builder.retrieveRules;
            this.storageType = builder.storageType;
            this.transitRules = builder.transitRules;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return lifecyclePolicyId
         */
        public String getLifecyclePolicyId() {
            return this.lifecyclePolicyId;
        }

        /**
         * @return lifecyclePolicyName
         */
        public String getLifecyclePolicyName() {
            return this.lifecyclePolicyName;
        }

        /**
         * @return lifecyclePolicyType
         */
        public String getLifecyclePolicyType() {
            return this.lifecyclePolicyType;
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
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return retrieveRules
         */
        public java.util.List<RetrieveRules> getRetrieveRules() {
            return this.retrieveRules;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return transitRules
         */
        public java.util.List<TransitRules> getTransitRules() {
            return this.transitRules;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String fileSystemId; 
            private String lifecyclePolicyId; 
            private String lifecyclePolicyName; 
            private String lifecyclePolicyType; 
            private String lifecycleRuleName; 
            private String path; 
            private java.util.List<String> paths; 
            private java.util.List<RetrieveRules> retrieveRules; 
            private String storageType; 
            private java.util.List<TransitRules> transitRules; 

            private Builder() {
            } 

            private Builder(LifecyclePolicies model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.fileSystemId = model.fileSystemId;
                this.lifecyclePolicyId = model.lifecyclePolicyId;
                this.lifecyclePolicyName = model.lifecyclePolicyName;
                this.lifecyclePolicyType = model.lifecyclePolicyType;
                this.lifecycleRuleName = model.lifecycleRuleName;
                this.path = model.path;
                this.paths = model.paths;
                this.retrieveRules = model.retrieveRules;
                this.storageType = model.storageType;
                this.transitRules = model.transitRules;
            } 

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
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The ID of the lifecycle policy.</p>
             * 
             * <strong>example:</strong>
             * <p>lc-xxx</p>
             */
            public Builder lifecyclePolicyId(String lifecyclePolicyId) {
                this.lifecyclePolicyId = lifecyclePolicyId;
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
             * <p>The type of the lifecycle policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder lifecyclePolicyType(String lifecyclePolicyType) {
                this.lifecyclePolicyType = lifecyclePolicyType;
                return this;
            }

            /**
             * <p>The management rule that is associated with the lifecycle policy.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DEFAULT_ATIME_14: Files that are not accessed in the last 14 days.</li>
             * <li>DEFAULT_ATIME_30: Files that are not accessed in the last 30 days.</li>
             * <li>DEFAULT_ATIME_60: Files that are not accessed in the last 60 days.</li>
             * <li>DEFAULT_ATIME_90: Files that are not accessed in the last 90 days.</li>
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
             * <p>The absolute paths of directories with which the lifecycle policy is associated.</p>
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * <p>File data retrieval rules.</p>
             */
            public Builder retrieveRules(java.util.List<RetrieveRules> retrieveRules) {
                this.retrieveRules = retrieveRules;
                return this;
            }

            /**
             * <p>The storage class.</p>
             * <ul>
             * <li>InfrequentAccess: the IA storage class.</li>
             * <li>Archive: the Archive storage class.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InfrequentAccess</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>Data transition rules.</p>
             */
            public Builder transitRules(java.util.List<TransitRules> transitRules) {
                this.transitRules = transitRules;
                return this;
            }

            public LifecyclePolicies build() {
                return new LifecyclePolicies(this);
            } 

        } 

    }
}
