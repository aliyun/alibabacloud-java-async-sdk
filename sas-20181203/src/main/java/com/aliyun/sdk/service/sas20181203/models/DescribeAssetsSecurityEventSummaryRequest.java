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
         * <p>The ID of the container cluster that you want to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
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
         * <p>clusterName</p>
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
         * <p>The IP address of the access source.</p>
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
