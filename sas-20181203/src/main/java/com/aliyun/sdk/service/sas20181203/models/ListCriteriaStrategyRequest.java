// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCriteriaStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListCriteriaStrategyRequest</p>
 */
public class ListCriteriaStrategyRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ImageName")
    private String imageName;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("StrategyName")
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
         * The cluster ID.
         * <p>
         * 
         * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the image.
         * <p>
         * 
         * >  You can call the [GetOpaClusterImageList](~~GetOpaClusterImageList~~) operation to query the names of images.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The tag that is added to the container.
         * <p>
         * 
         * >  You can call the [GetOpaClusterLabelList](~~GetOpaClusterLabelList~~) operation to query the tags that are added to containers.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * The namespace of the cluster.
         * <p>
         * 
         * >  You can call the [GetOpaClusterNamespaceList](~~GetOpaClusterNamespaceList~~) operation to query the namespaces of clusters.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The name of the rule.
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
