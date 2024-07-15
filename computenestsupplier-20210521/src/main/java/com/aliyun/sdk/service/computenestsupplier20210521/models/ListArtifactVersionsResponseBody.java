// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactVersionsResponseBody</p>
 */
public class ListArtifactVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Artifacts")
    private java.util.List < Artifacts> artifacts;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The version information about the deployment package.
         */
        public Builder artifacts(java.util.List < Artifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("ArtifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("ArtifactProperty")
        private String artifactProperty;

        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
        private String artifactVersion;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageDelivery")
        private java.util.Map < String, String > imageDelivery;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ResultFile")
        private String resultFile;

        @com.aliyun.core.annotation.NameInMap("SecurityAuditResult")
        private String securityAuditResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
        private String supportRegionIds;

        @com.aliyun.core.annotation.NameInMap("VersionName")
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
             * The ID of the deployment package.
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * The properties of the deployment package.
             */
            public Builder artifactProperty(String artifactProperty) {
                this.artifactProperty = artifactProperty;
                return this;
            }

            /**
             * The type of the deployment package.
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * The version of the deployment package.
             */
            public Builder artifactVersion(String artifactVersion) {
                this.artifactVersion = artifactVersion;
                return this;
            }

            /**
             * The time when the certificate was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the deployment package was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The distribution result of the image.
             */
            public Builder imageDelivery(java.util.Map < String, String > imageDelivery) {
                this.imageDelivery = imageDelivery;
                return this;
            }

            /**
             * The distribution progress of the deployment package.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The result file of the security scan.
             */
            public Builder resultFile(String resultFile) {
                this.resultFile = resultFile;
                return this;
            }

            /**
             * The result of the security scan. Valid values:
             * <p>
             * 
             * *   Normal: No risks exist on the deployment package.
             * *   AtRisk: Risks exist on the deployment package.
             * *   Processing: The deployment package is being scanned.
             */
            public Builder securityAuditResult(String securityAuditResult) {
                this.securityAuditResult = securityAuditResult;
                return this;
            }

            /**
             * The status of the deployment package. Valid values:
             * <p>
             * 
             * *   Created: The deployment package is created.
             * *   Scanning: The deployment package is being scanned.
             * *   ScanFailed: The deployment package failed to be scanned.
             * *   Delivering: The deployment package is being distributed.
             * *   Available: The deployment package is available.
             * *   Deleted: The deployment package is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the region that supports the deployment package.
             */
            public Builder supportRegionIds(String supportRegionIds) {
                this.supportRegionIds = supportRegionIds;
                return this;
            }

            /**
             * The version name of the deployment package.
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
