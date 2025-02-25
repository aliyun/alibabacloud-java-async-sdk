// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListArtifactVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactVersionsResponseBody</p>
 */
public class ListArtifactVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Artifacts")
    private java.util.List<Artifacts> artifacts;

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
    public java.util.List<Artifacts> getArtifacts() {
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
        private java.util.List<Artifacts> artifacts; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The version information about the deployment package.</p>
         */
        public Builder artifacts(java.util.List<Artifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbfVwapgMwCN1wYzPVzLbItEdB0uWSY7AGnM3qCgm/YnjuEfwSnMwiMkcUoI0hRQzE=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46577928-3162-15A6-9084-69820EB9xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListArtifactVersionsResponseBody build() {
            return new ListArtifactVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactVersionsResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactBuildProperty")
        private String artifactBuildProperty;

        @com.aliyun.core.annotation.NameInMap("ArtifactBuildType")
        private String artifactBuildType;

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
        private java.util.Map<String, String> imageDelivery;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ResultFile")
        private String resultFile;

        @com.aliyun.core.annotation.NameInMap("SecurityAuditResult")
        private String securityAuditResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDetail")
        private String statusDetail;

        @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
        private String supportRegionIds;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private Artifacts(Builder builder) {
            this.artifactBuildProperty = builder.artifactBuildProperty;
            this.artifactBuildType = builder.artifactBuildType;
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
            this.statusDetail = builder.statusDetail;
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
         * @return artifactBuildProperty
         */
        public String getArtifactBuildProperty() {
            return this.artifactBuildProperty;
        }

        /**
         * @return artifactBuildType
         */
        public String getArtifactBuildType() {
            return this.artifactBuildType;
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
        public java.util.Map<String, String> getImageDelivery() {
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
         * @return statusDetail
         */
        public String getStatusDetail() {
            return this.statusDetail;
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
            private String artifactBuildProperty; 
            private String artifactBuildType; 
            private String artifactId; 
            private String artifactProperty; 
            private String artifactType; 
            private String artifactVersion; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.Map<String, String> imageDelivery; 
            private String progress; 
            private String resultFile; 
            private String securityAuditResult; 
            private String status; 
            private String statusDetail; 
            private String supportRegionIds; 
            private String versionName; 

            /**
             * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;RegionId&quot;:&quot;xxx&quot;, &quot;SourceImageId&quot;:&quot;xxx&quot;, &quot;&quot;:&quot;xxx&quot;, &quot;CommandType&quot;:&quot;xxx&quot;, &quot;CommandContent&quot;:&quot;xxx&quot;}&quot;</p>
             */
            public Builder artifactBuildProperty(String artifactBuildProperty) {
                this.artifactBuildProperty = artifactBuildProperty;
                return this;
            }

            /**
             * <p>The type of the deployment package to be built.</p>
             * 
             * <strong>example:</strong>
             * <p>Dockerfile</p>
             */
            public Builder artifactBuildType(String artifactBuildType) {
                this.artifactBuildType = artifactBuildType;
                return this;
            }

            /**
             * <p>The ID of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>artifact-eea08d1e2d3a43aexxxx</p>
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * <p>The properties of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;CommodityCode&quot;:&quot;cmjj0005xxxx&quot;,&quot;CommodityVersion&quot;:&quot;V2022xxxx&quot;}</p>
             */
            public Builder artifactProperty(String artifactProperty) {
                this.artifactProperty = artifactProperty;
                return this;
            }

            /**
             * <p>The type of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsImage</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The version of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder artifactVersion(String artifactVersion) {
                this.artifactVersion = artifactVersion;
                return this;
            }

            /**
             * <p>The time when the certificate was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-20T02:19:53Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the deployment package was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-20T02:19:55Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The distribution result of the image.</p>
             */
            public Builder imageDelivery(java.util.Map<String, String> imageDelivery) {
                this.imageDelivery = imageDelivery;
                return this;
            }

            /**
             * <p>The distribution progress of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The result file of the security scan.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://compute-nest-security-audit-bucket-ap-southeast-1.oss-ap-southeast-1.aliyuncs.com/51416747xxxx/xxxx">https://compute-nest-security-audit-bucket-ap-southeast-1.oss-ap-southeast-1.aliyuncs.com/51416747xxxx/xxxx</a></p>
             */
            public Builder resultFile(String resultFile) {
                this.resultFile = resultFile;
                return this;
            }

            /**
             * <p>The result of the security scan. Valid values:</p>
             * <ul>
             * <li>Normal: No risks exist on the deployment package.</li>
             * <li>AtRisk: Risks exist on the deployment package.</li>
             * <li>Processing: The deployment package is being scanned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder securityAuditResult(String securityAuditResult) {
                this.securityAuditResult = securityAuditResult;
                return this;
            }

            /**
             * <p>The status of the deployment package. Valid values:</p>
             * <ul>
             * <li>Created: The deployment package is created.</li>
             * <li>Scanning: The deployment package is being scanned.</li>
             * <li>ScanFailed: The deployment package failed to be scanned.</li>
             * <li>Delivering: The deployment package is being distributed.</li>
             * <li>Available: The deployment package is available.</li>
             * <li>Deleted: The deployment package is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The description of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;/usr/local/share/aliyun-assist/work/script/t-hz04zm90y6og0sg.sh: line 1: pip: command not found&quot;</p>
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * <p>The ID of the region that supports the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *                     &quot;cn-beijing&quot;,
             *                     &quot;cn-hangzhou&quot;,
             *                     &quot;cn-shanghai&quot;
             *                 ]</p>
             */
            public Builder supportRegionIds(String supportRegionIds) {
                this.supportRegionIds = supportRegionIds;
                return this;
            }

            /**
             * <p>The version name of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
