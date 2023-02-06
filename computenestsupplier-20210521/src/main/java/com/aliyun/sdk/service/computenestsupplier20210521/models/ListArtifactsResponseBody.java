// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactsResponseBody</p>
 */
public class ListArtifactsResponseBody extends TeaModel {
    @NameInMap("Artifacts")
    private java.util.List < Artifacts> artifacts;

    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListArtifactsResponseBody(Builder builder) {
        this.artifacts = builder.artifacts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactsResponseBody create() {
        return builder().build();
    }

    /**
     * @return artifacts
     */
    public java.util.List < Artifacts> getArtifacts() {
        return this.artifacts;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Artifacts> artifacts; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * Artifacts.
         */
        public Builder artifacts(java.util.List < Artifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactsResponseBody build() {
            return new ListArtifactsResponseBody(this);
        } 

    } 

    public static class Artifacts extends TeaModel {
        @NameInMap("ArtifactId")
        private String artifactId;

        @NameInMap("ArtifactType")
        private String artifactType;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("MaxVersion")
        private String maxVersion;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        private Artifacts(Builder builder) {
            this.artifactId = builder.artifactId;
            this.artifactType = builder.artifactType;
            this.description = builder.description;
            this.gmtModified = builder.gmtModified;
            this.maxVersion = builder.maxVersion;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return maxVersion
         */
        public String getMaxVersion() {
            return this.maxVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String artifactId; 
            private String artifactType; 
            private String description; 
            private String gmtModified; 
            private String maxVersion; 
            private String name; 
            private String status; 

            /**
             * ArtifactId.
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * ArtifactType.
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * MaxVersion.
             */
            public Builder maxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
}
