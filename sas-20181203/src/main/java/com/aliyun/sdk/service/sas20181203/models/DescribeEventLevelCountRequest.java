// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventLevelCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventLevelCountRequest</p>
 */
public class DescribeEventLevelCountRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ContainerIds")
    private String containerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private DescribeEventLevelCountRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.containerIds = builder.containerIds;
        this.from = builder.from;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventLevelCountRequest create() {
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
     * @return containerIds
     */
    public String getContainerIds() {
        return this.containerIds;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<DescribeEventLevelCountRequest, Builder> {
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private String containerIds; 
        private String from; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventLevelCountRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.containerIds = request.containerIds;
            this.from = request.from;
            this.targetType = request.targetType;
        } 

        /**
         * The ID of the container cluster.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The key of the condition that is used to query alert events on containers. Valid values:
         * <p>
         * 
         * *   **instanceId**: the ID of the asset
         * *   **appName**: the name of the application
         * *   **clusterId**: the ID of the cluster
         * *   **regionId**: the ID of the region
         * *   **nodeName**: the name of the node
         * *   **namespace**: the namespace
         * *   **clusterName**: the name of the cluster
         * *   **image**: the name of the image
         * *   **imageRepoName**: the name of the image repository
         * *   **imageRepoNamespace**: the namespace to which the image repository belongs
         * *   **imageRepoTag**: the tag that is added to the image
         * *   **imageDigest**: the digest of the image
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The value of the condition that is used to query alert events on containers. If you specify multiple values, separate them with commas (,).
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The ID of the container.
         */
        public Builder containerIds(String containerIds) {
            this.putQueryParameter("ContainerIds", containerIds);
            this.containerIds = containerIds;
            return this;
        }

        /**
         * The ID of the request source. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The type of the query condition. Valid values:
         * <p>
         * 
         * *   **containerId**: the ID of the container
         * *   **uuid**: the UUID of the asset
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public DescribeEventLevelCountRequest build() {
            return new DescribeEventLevelCountRequest(this);
        } 

    } 

}
