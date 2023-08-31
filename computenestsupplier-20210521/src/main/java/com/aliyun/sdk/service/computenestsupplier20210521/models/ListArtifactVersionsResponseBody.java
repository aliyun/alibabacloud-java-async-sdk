// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactVersionsResponseBody</p>
 */
public class ListArtifactVersionsResponseBody extends TeaModel {
    @NameInMap("Artifacts")
    private java.util.List < Artifacts> artifacts;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListArtifactVersionsResponseBody(Builder builder) {
        this.artifacts = builder.artifacts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactVersionsResponseBody create() {
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
    public Integer getMaxResults() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Artifacts> artifacts; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

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
        public Builder maxResults(Integer maxResults) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactVersionsResponseBody build() {
            return new ListArtifactVersionsResponseBody(this);
        } 

    } 

    public static class Artifacts extends TeaModel {
        @NameInMap("ArtifactId")
        private String artifactId;

        @NameInMap("ArtifactProperty")
        private String artifactProperty;

        @NameInMap("ArtifactType")
        private String artifactType;

        @NameInMap("ArtifactVersion")
        private String artifactVersion;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("ImageDelivery")
        private java.util.Map < String, String > imageDelivery;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("ResultFile")
        private String resultFile;

        @NameInMap("SecurityAuditResult")
        private String securityAuditResult;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupportRegionIds")
        private String supportRegionIds;

        @NameInMap("VersionName")
        private String versionName;

        private Artifacts(Builder builder) {
            this.artifactId = builder.artifactId;
            this.artifactProperty = builder.artifactProperty;
            this.artifactType = builder.artifactType;
            this.artifactVersion = builder.artifactVersion;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageDelivery = builder.imageDelivery;
            this.progress = builder.progress;
            this.resultFile = builder.resultFile;
            this.securityAuditResult = builder.securityAuditResult;
            this.status = builder.status;
            this.supportRegionIds = builder.supportRegionIds;
            this.versionName = builder.versionName;
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
         * @return artifactProperty
         */
        public String getArtifactProperty() {
            return this.artifactProperty;
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return artifactVersion
         */
        public String getArtifactVersion() {
            return this.artifactVersion;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageDelivery
         */
        public java.util.Map < String, String > getImageDelivery() {
            return this.imageDelivery;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return resultFile
         */
        public String getResultFile() {
            return this.resultFile;
        }

        /**
         * @return securityAuditResult
         */
        public String getSecurityAuditResult() {
            return this.securityAuditResult;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportRegionIds
         */
        public String getSupportRegionIds() {
            return this.supportRegionIds;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String artifactId; 
            private String artifactProperty; 
            private String artifactType; 
            private String artifactVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.Map < String, String > imageDelivery; 
            private String progress; 
            private String resultFile; 
            private String securityAuditResult; 
            private String status; 
            private String supportRegionIds; 
            private String versionName; 

            /**
             * ArtifactId.
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * ArtifactProperty.
             */
            public Builder artifactProperty(String artifactProperty) {
                this.artifactProperty = artifactProperty;
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
             * ArtifactVersion.
             */
            public Builder artifactVersion(String artifactVersion) {
                this.artifactVersion = artifactVersion;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * ImageDelivery.
             */
            public Builder imageDelivery(java.util.Map < String, String > imageDelivery) {
                this.imageDelivery = imageDelivery;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * ResultFile.
             */
            public Builder resultFile(String resultFile) {
                this.resultFile = resultFile;
                return this;
            }

            /**
             * SecurityAuditResult.
             */
            public Builder securityAuditResult(String securityAuditResult) {
                this.securityAuditResult = securityAuditResult;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupportRegionIds.
             */
            public Builder supportRegionIds(String supportRegionIds) {
                this.supportRegionIds = supportRegionIds;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
}
