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
 * {@link DescribeAssetsSecurityEventSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetsSecurityEventSummaryRequest</p>
 */
public class DescribeAssetsSecurityEventSummaryRequest extends Request {
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

    private DescribeAssetsSecurityEventSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetsSecurityEventSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAssetsSecurityEventSummaryRequest, Builder> {
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetsSecurityEventSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The ID of the cluster to which the container belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cc58f827d893f4d7fb3e34b5d4395****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The key of the condition that is used to query on containers. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the container instance</li>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * <li><strong>regionId</strong>: the region ID of the container</li>
         * <li><strong>clusterName</strong>: the name of the cluster</li>
         * <li><strong>image</strong>: the name of the image</li>
         * <li><strong>imageRepoName</strong>: the name of the image repository</li>
         * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
         * <li><strong>imageRepoTag</strong>: the tag that is added to the image repository</li>
         * <li><strong>imageDigest</strong>: the digest of the image</li>
         * <li><strong>ClusterType</strong>: the type of the cluster</li>
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
         * <p>clusterName</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the condition that is used to query on containers.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom-operator</p>
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
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>113.108.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeAssetsSecurityEventSummaryRequest build() {
            return new DescribeAssetsSecurityEventSummaryRequest(this);
        } 

    } 

}
