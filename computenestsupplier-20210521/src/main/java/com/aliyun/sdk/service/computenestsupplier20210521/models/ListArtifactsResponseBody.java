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
 * {@link ListArtifactsResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactsResponseBody</p>
 */
public class ListArtifactsResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListArtifactsResponseBody model) {
            this.artifacts = model.artifacts;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about deployment packages.</p>
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

        public ListArtifactsResponseBody build() {
            return new ListArtifactsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListArtifactsResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactsResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactBuildProperty")
        private String artifactBuildProperty;

        @com.aliyun.core.annotation.NameInMap("ArtifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MaxVersion")
        private String maxVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Artifacts(Builder builder) {
            this.artifactBuildProperty = builder.artifactBuildProperty;
            this.artifactId = builder.artifactId;
            this.artifactType = builder.artifactType;
            this.description = builder.description;
            this.gmtModified = builder.gmtModified;
            this.maxVersion = builder.maxVersion;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String artifactBuildProperty; 
            private String artifactId; 
            private String artifactType; 
            private String description; 
            private String gmtModified; 
            private String maxVersion; 
            private String name; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.artifactBuildProperty = model.artifactBuildProperty;
                this.artifactId = model.artifactId;
                this.artifactType = model.artifactType;
                this.description = model.description;
                this.gmtModified = model.gmtModified;
                this.maxVersion = model.maxVersion;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The build properties of the artifact, utilized for hosting and building the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;CodeRepo&quot;:{&quot;Owner&quot;:&quot;wenle&quot;,&quot;Platform&quot;:&quot;github&quot;,&quot;Branch&quot;:&quot;main&quot;,&quot;RepoName&quot;:&quot;aliyun-computenest/java-springboot-demo&quot;}}</p>
             */
            public Builder artifactBuildProperty(String artifactBuildProperty) {
                this.artifactBuildProperty = artifactBuildProperty;
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
             * <p>The description of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>The latest version of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxVersion(String maxVersion) {
                this.maxVersion = maxVersion;
                return this;
            }

            /**
             * <p>The name of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek25rexxxxxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
}
