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
         * <p>The cluster ID.</p>
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
         * <p>The container search field. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: container instance ID</li>
         * <li><strong>clusterId</strong>: cluster ID</li>
         * <li><strong>regionId</strong>: container region</li>
         * <li><strong>clusterName</strong>: cluster name</li>
         * <li><strong>image</strong>: image name</li>
         * <li><strong>imageRepoName</strong>: image repository name</li>
         * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
         * <li><strong>imageRepoTag</strong>: image repository tag</li>
         * <li><strong>imageDigest</strong>: image digest</li>
         * <li><strong>clusterType</strong>: cluster type</li>
         * <li><strong>hostIp</strong>: public IP address</li>
         * <li><strong>pod</strong>: pod</li>
         * <li><strong>podIp</strong>: pod IP address</li>
         * <li><strong>containerId</strong>: container ID</li>
         * <li><strong>vulStatus</strong>: whether the container has vulnerabilities</li>
         * <li><strong>alarmStatus</strong>: whether the container has security alerts</li>
         * <li><strong>riskStatus</strong>: whether the container has risks</li>
         * <li><strong>riskLevel</strong>: container risk level</li>
         * <li><strong>containerScope</strong>: container type.</li>
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
         * <p>The value of the container search field.</p>
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
         * <p>The image digest.</p>
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
         * <p>The image repository name.</p>
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
         * <p>The image repository namespace.</p>
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
         * <p>The image tag.</p>
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
         * <p>The IP address of the access source.</p>
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
