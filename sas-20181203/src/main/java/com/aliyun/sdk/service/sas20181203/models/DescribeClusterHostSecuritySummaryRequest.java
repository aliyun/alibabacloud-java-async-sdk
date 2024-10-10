// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterHostSecuritySummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterHostSecuritySummaryRequest</p>
 */
public class DescribeClusterHostSecuritySummaryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private DescribeClusterHostSecuritySummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterHostSecuritySummaryRequest create() {
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

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<DescribeClusterHostSecuritySummaryRequest, Builder> {
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterHostSecuritySummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the container cluster.</p>
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
         * <li><strong>instanceId</strong>: the instance ID</li>
         * <li><strong>appName</strong>: the name of the application</li>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * <li><strong>regionId</strong>: the region ID</li>
         * <li><strong>nodeName</strong>: the name of the node</li>
         * <li><strong>namespace</strong>: the namespace</li>
         * <li><strong>clusterName</strong>: the name of the cluster</li>
         * <li><strong>image</strong>: the name of the image</li>
         * <li><strong>imageRepoName</strong>: the name of the image repository</li>
         * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
         * <li><strong>imageRepoTag</strong>: the tag that is added to the image repository</li>
         * <li><strong>imageDigest</strong>: the digest of the image</li>
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
         * <p>c1fdb5fd8d42e425d88fd73eec7be****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
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
         * <p>222.71.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the query. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong></li>
         * <li><strong>uuid</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public DescribeClusterHostSecuritySummaryRequest build() {
            return new DescribeClusterHostSecuritySummaryRequest(this);
        } 

    } 

}
