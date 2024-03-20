// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexVersionResponseBody</p>
 */
public class GetIndexVersionResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
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
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of cluster details
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetIndexVersionResponseBody build() {
            return new GetIndexVersionResponseBody(this);
        } 

    } 

    public static class IndexVersions extends TeaModel {
        @NameInMap("buildDeployId")
        private String buildDeployId;

        @NameInMap("currentVersion")
        private Long currentVersion;

        @NameInMap("indexName")
        private String indexName;

        @NameInMap("versions")
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
             * The ID of the index deployed in offline mode
             */
            public Builder buildDeployId(String buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * currentVersion.
             */
            public Builder currentVersion(Long currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The name of the index table
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * The version of the index
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
    public static class Result extends TeaModel {
        @NameInMap("cluster")
        private String cluster;

        @NameInMap("indexVersions")
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
             * The name of the cluster
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The time when the cluster was updated
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
