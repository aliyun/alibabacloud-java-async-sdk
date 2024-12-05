// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetIndexVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexVersionResponseBody</p>
 */
public class GetIndexVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetIndexVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The clusters.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetIndexVersionResponseBody build() {
            return new GetIndexVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIndexVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexVersionResponseBody</p>
     */
    public static class IndexVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buildDeployId")
        private String buildDeployId;

        @com.aliyun.core.annotation.NameInMap("currentVersion")
        private Long currentVersion;

        @com.aliyun.core.annotation.NameInMap("indexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("versions")
        private java.util.List < Long > versions;

        private IndexVersions(Builder builder) {
            this.buildDeployId = builder.buildDeployId;
            this.currentVersion = builder.currentVersion;
            this.indexName = builder.indexName;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexVersions create() {
            return builder().build();
        }

        /**
         * @return buildDeployId
         */
        public String getBuildDeployId() {
            return this.buildDeployId;
        }

        /**
         * @return currentVersion
         */
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return versions
         */
        public java.util.List < Long > getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String buildDeployId; 
            private Long currentVersion; 
            private String indexName; 
            private java.util.List < Long > versions; 

            /**
             * <p>The ID of the offline deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
             */
            public Builder buildDeployId(String buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * <p>The current online version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentVersion(Long currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The name of the index table.</p>
             * 
             * <strong>example:</strong>
             * <p>table4</p>
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * <p>The index versions.</p>
             */
            public Builder versions(java.util.List < Long > versions) {
                this.versions = versions;
                return this;
            }

            public IndexVersions build() {
                return new IndexVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIndexVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexVersionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("indexVersions")
        private java.util.List < IndexVersions> indexVersions;

        private Result(Builder builder) {
            this.cluster = builder.cluster;
            this.indexVersions = builder.indexVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return indexVersions
         */
        public java.util.List < IndexVersions> getIndexVersions() {
            return this.indexVersions;
        }

        public static final class Builder {
            private String cluster; 
            private java.util.List < IndexVersions> indexVersions; 

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>ayoss-cn-zhangjiakou-b</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The index versions.</p>
             */
            public Builder indexVersions(java.util.List < IndexVersions> indexVersions) {
                this.indexVersions = indexVersions;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
