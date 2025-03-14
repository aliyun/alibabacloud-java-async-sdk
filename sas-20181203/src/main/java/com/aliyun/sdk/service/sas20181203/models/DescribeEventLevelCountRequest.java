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
            this.targetType = request.targetType;
        } 

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
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
         * <p>The key of the condition that is used to query alert events on containers. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the asset</li>
         * <li><strong>appName</strong>: the name of the application</li>
         * <li><strong>clusterId</strong>: the ID of the cluster</li>
         * <li><strong>regionId</strong>: the ID of the region</li>
         * <li><strong>nodeName</strong>: the name of the node</li>
         * <li><strong>namespace</strong>: the namespace</li>
         * <li><strong>clusterName</strong>: the name of the cluster</li>
         * <li><strong>image</strong>: the name of the image</li>
         * <li><strong>imageRepoName</strong>: the name of the image repository</li>
         * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
         * <li><strong>imageRepoTag</strong>: the tag that is added to the image</li>
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
         * <p>The value of the condition that is used to query alert events on containers. If you specify multiple values, separate them with commas (,).</p>
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
         * <p>The ID of the container.</p>
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
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
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
         * <p>The type of the accounts that you want to query. Default value: <strong>0</strong>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the current account.</li>
         * <li><strong>1</strong>: all accounts.</li>
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
         * <p>The type of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong>: the ID of the container</li>
         * <li><strong>uuid</strong>: the UUID of the asset</li>
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
