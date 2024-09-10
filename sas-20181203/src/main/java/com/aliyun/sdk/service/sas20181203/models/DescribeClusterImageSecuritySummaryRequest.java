// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterImageSecuritySummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterImageSecuritySummaryRequest</p>
 */
public class DescribeClusterImageSecuritySummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
    private String containerFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageDigest")
    private String imageDigest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRepoName")
    private String imageRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageRepoNamespace")
    private String imageRepoNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageTag")
    private String imageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeClusterImageSecuritySummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.imageDigest = builder.imageDigest;
        this.imageRepoName = builder.imageRepoName;
        this.imageRepoNamespace = builder.imageRepoNamespace;
        this.imageTag = builder.imageTag;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterImageSecuritySummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    /**
     * @return imageDigest
     */
    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * @return imageRepoName
     */
    public String getImageRepoName() {
        return this.imageRepoName;
    }

    /**
     * @return imageRepoNamespace
     */
    public String getImageRepoNamespace() {
        return this.imageRepoNamespace;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeClusterImageSecuritySummaryRequest, Builder> {
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private String imageDigest; 
        private String imageRepoName; 
        private String imageRepoNamespace; 
        private String imageTag; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterImageSecuritySummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.imageDigest = request.imageDigest;
            this.imageRepoName = request.imageRepoName;
            this.imageRepoNamespace = request.imageRepoNamespace;
            this.imageTag = request.imageTag;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The key of the condition that is used to query containers. Valid values:
         * <p>
         * 
         * *   **instanceId**: the instance ID of the container
         * *   **clusterId**: the ID of the cluster
         * *   **regionId**: the region ID of the container
         * *   **clusterName**: the name of the cluster
         * *   **image**: the name of the image
         * *   **imageRepoName**: the name of the image repository
         * *   **imageRepoNamespace**: the namespace to which the image repository belongs
         * *   **imageRepoTag**: the tag that is added to the image repository
         * *   **imageDigest**: the digest of the image
         * *   **clusterType**: the type of the cluster
         * *   **hostIp**: the public IP address
         * *   **pod**: the pod
         * *   **podIp**: the IP address of the pod
         * *   **containerId**: the ID of the container
         * *   **vulStatus**: whether vulnerabilities are detected on the container
         * *   **alarmStatus**: whether alerts are generated for the container
         * *   **riskStatus**: whether risks are detected on the container
         * *   **riskLevel**: the risk level of the container
         * *   **containerScope**: the type of the container
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The value of the condition that is used to query containers.
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The digest of the image.
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * The name of the image repository.
         */
        public Builder imageRepoName(String imageRepoName) {
            this.putQueryParameter("ImageRepoName", imageRepoName);
            this.imageRepoName = imageRepoName;
            return this;
        }

        /**
         * The namespace of the image repository.
         */
        public Builder imageRepoNamespace(String imageRepoNamespace) {
            this.putQueryParameter("ImageRepoNamespace", imageRepoNamespace);
            this.imageRepoNamespace = imageRepoNamespace;
            return this;
        }

        /**
         * The tag of the image.
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The source IP address.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeClusterImageSecuritySummaryRequest build() {
            return new DescribeClusterImageSecuritySummaryRequest(this);
        } 

    } 

}
