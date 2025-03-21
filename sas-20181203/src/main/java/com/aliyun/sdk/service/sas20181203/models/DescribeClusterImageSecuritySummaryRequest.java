// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c3aaf6c8085f84791882eef200cd2****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The key of the condition that is used to query containers. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the instance ID of the container</li>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * <li><strong>regionId</strong>: the region ID of the container</li>
         * <li><strong>clusterName</strong>: the name of the cluster</li>
         * <li><strong>image</strong>: the name of the image</li>
         * <li><strong>imageRepoName</strong>: the name of the image repository</li>
         * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
         * <li><strong>imageRepoTag</strong>: the tag that is added to the image repository</li>
         * <li><strong>imageDigest</strong>: the digest of the image</li>
         * <li><strong>clusterType</strong>: the type of the cluster</li>
         * <li><strong>hostIp</strong>: the public IP address</li>
         * <li><strong>pod</strong>: the pod</li>
         * <li><strong>podIp</strong>: the IP address of the pod</li>
         * <li><strong>containerId</strong>: the ID of the container</li>
         * <li><strong>vulStatus</strong>: whether vulnerabilities are detected on the container</li>
         * <li><strong>alarmStatus</strong>: whether alerts are generated for the container</li>
         * <li><strong>riskStatus</strong>: whether risks are detected on the container</li>
         * <li><strong>riskLevel</strong>: the risk level of the container</li>
         * <li><strong>containerScope</strong>: the type of the container</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clusterId</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the condition that is used to query containers.</p>
         * 
         * <strong>example:</strong>
         * <p>c2ac28b2d0c734df29a21d29f18ac****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The digest of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>402902de6480a020b9f29e7105e77b8a218bc1cccbc3935d3b38c8ea9ba2****</p>
         */
        public Builder imageDigest(String imageDigest) {
            this.putQueryParameter("ImageDigest", imageDigest);
            this.imageDigest = imageDigest;
            return this;
        }

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>repo</p>
         */
        public Builder imageRepoName(String imageRepoName) {
            this.putQueryParameter("ImageRepoName", imageRepoName);
            this.imageRepoName = imageRepoName;
            return this;
        }

        /**
         * <p>The namespace of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>namespace</p>
         */
        public Builder imageRepoNamespace(String imageRepoNamespace) {
            this.putQueryParameter("ImageRepoNamespace", imageRepoNamespace);
            this.imageRepoNamespace = imageRepoNamespace;
            return this;
        }

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>3.54.0.1</p>
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
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>60.190.XXX.XXX</p>
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
