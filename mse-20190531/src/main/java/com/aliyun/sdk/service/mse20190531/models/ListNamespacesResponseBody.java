// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespacesResponseBody</p>
 */
public class ListNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNamespacesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNamespacesResponseBody build() {
            return new ListNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Integer appCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Describe")
        private String describe;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Long instanceCount;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Result(Builder builder) {
            this.appCount = builder.appCount;
            this.createTime = builder.createTime;
            this.describe = builder.describe;
            this.instanceCount = builder.instanceCount;
            this.namespace = builder.namespace;
            this.region = builder.region;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appCount
         */
        public Integer getAppCount() {
            return this.appCount;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return describe
         */
        public String getDescribe() {
            return this.describe;
        }

        /**
         * @return instanceCount
         */
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer appCount; 
            private Long createTime; 
            private String describe; 
            private Long instanceCount; 
            private String namespace; 
            private String region; 
            private java.util.Map<String, ?> tags; 
            private Long updateTime; 
            private String userId; 
            private Integer version; 

            /**
             * AppCount.
             */
            public Builder appCount(Integer appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Describe.
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Integer appCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Describe")
        private String describe;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Long instanceCount;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Results(Builder builder) {
            this.appCount = builder.appCount;
            this.createTime = builder.createTime;
            this.describe = builder.describe;
            this.instanceCount = builder.instanceCount;
            this.namespace = builder.namespace;
            this.region = builder.region;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return appCount
         */
        public Integer getAppCount() {
            return this.appCount;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return describe
         */
        public String getDescribe() {
            return this.describe;
        }

        /**
         * @return instanceCount
         */
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer appCount; 
            private Long createTime; 
            private String describe; 
            private Long instanceCount; 
            private String namespace; 
            private String region; 
            private Long updateTime; 
            private String userId; 
            private Integer version; 

            /**
             * AppCount.
             */
            public Builder appCount(Integer appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Describe.
             */
            public Builder describe(String describe) {
                this.describe = describe;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.results = builder.results;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private java.util.List<Results> results; 
            private Integer totalSize; 

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
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
