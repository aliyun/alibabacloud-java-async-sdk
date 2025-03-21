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
 * {@link ListCriteriaStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListCriteriaStrategyRequest</p>
 */
public class ListCriteriaStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    private ListCriteriaStrategyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.imageName = builder.imageName;
        this.label = builder.label;
        this.namespace = builder.namespace;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCriteriaStrategyRequest create() {
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
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<ListCriteriaStrategyRequest, Builder> {
        private String clusterId; 
        private String imageName; 
        private String label; 
        private String namespace; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(ListCriteriaStrategyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.imageName = request.imageName;
            this.label = request.label;
            this.namespace = request.namespace;
            this.strategyName = request.strategyName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the image.</p>
         * <blockquote>
         * <p> You can call the <a href="~~GetOpaClusterImageList~~">GetOpaClusterImageList</a> operation to query the names of images.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testImage</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The tag that is added to the container.</p>
         * <blockquote>
         * <p> You can call the <a href="~~GetOpaClusterLabelList~~">GetOpaClusterLabelList</a> operation to query the tags that are added to containers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testlabel</p>
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The namespace of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="~~GetOpaClusterNamespaceList~~">GetOpaClusterNamespaceList</a> operation to query the namespaces of clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public ListCriteriaStrategyRequest build() {
            return new ListCriteriaStrategyRequest(this);
        } 

    } 

}
