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
    @com.aliyun.core.annotation.NameInMap("MultiAccountActionType")
    private Integer multiAccountActionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

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
        this.multiAccountActionType = builder.multiAccountActionType;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return multiAccountActionType
     */
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Integer multiAccountActionType; 
        private Long resourceDirectoryAccountId; 
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
            this.multiAccountActionType = request.multiAccountActionType;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the container cluster that you want to query.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c7e3c5b420a7947c2933303144688****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The container search field. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: instance ID</li>
         * <li><strong>appName</strong>: application name</li>
         * <li><strong>clusterId</strong>: cluster ID</li>
         * <li><strong>regionId</strong>: region</li>
         * <li><strong>nodeName</strong>: node name</li>
         * <li><strong>namespace</strong>: namespace</li>
         * <li><strong>clusterName</strong>: cluster name</li>
         * <li><strong>image</strong>: image name</li>
         * <li><strong>imageRepoName</strong>: image repository name</li>
         * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
         * <li><strong>imageRepoTag</strong>: image tag</li>
         * <li><strong>imageDigest</strong>: image digest</li>
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
         * <p>The value of the field that you want to query. Separate multiple values with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>c951761046a9c4afe92be0a7b5bexxxxx</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The container IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx30389a10c28f6d38f2398f0dcexxxxxxx922b9e8290dc7c3019d4a8,48b87f2c0662e334820f436cb9133f1ae4e053d39b6fad42xxxxxxxxxx</p>
         */
        public Builder containerIds(String containerIds) {
            this.putQueryParameter("ContainerIds", containerIds);
            this.containerIds = containerIds;
            return this;
        }

        /**
         * <p>The source identifier of the request. Set this parameter to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The multi-account query type. Default value: <strong>0</strong>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Query data of the current account.</li>
         * <li><strong>1</strong>: Query data of all accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder multiAccountActionType(Integer multiAccountActionType) {
            this.putQueryParameter("MultiAccountActionType", multiAccountActionType);
            this.multiAccountActionType = multiAccountActionType;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The query type. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong>: container ID</li>
         * <li><strong>uuid</strong>: asset ID</li>
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
        public DescribeEventLevelCountRequest build() {
            return new DescribeEventLevelCountRequest(this);
        } 

    } 

}
