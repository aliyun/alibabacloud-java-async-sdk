// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListNodePoolComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListNodePoolComponentsRequest</p>
 */
public class ListNodePoolComponentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("image_id")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("image_type")
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_types")
    private java.util.List<String> instanceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("max_results")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("next_token")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    private String nodepoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodepool_type")
    private String nodepoolType;

    private ListNodePoolComponentsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.imageId = builder.imageId;
        this.imageType = builder.imageType;
        this.instanceTypes = builder.instanceTypes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodepoolId = builder.nodepoolId;
        this.nodepoolType = builder.nodepoolType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePoolComponentsRequest create() {
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
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return nodepoolType
     */
    public String getNodepoolType() {
        return this.nodepoolType;
    }

    public static final class Builder extends Request.Builder<ListNodePoolComponentsRequest, Builder> {
        private String clusterId; 
        private String imageId; 
        private String imageType; 
        private java.util.List<String> instanceTypes; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodepoolId; 
        private String nodepoolType; 

        private Builder() {
            super();
        } 

        private Builder(ListNodePoolComponentsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.imageId = request.imageId;
            this.imageType = request.imageType;
            this.instanceTypes = request.instanceTypes;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodepoolId = request.nodepoolId;
            this.nodepoolType = request.nodepoolType;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c846d7d529e34****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The image ID of the node pool. Either this parameter or image_type is required if nodepool_id is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_container_optimized_alibase_20250629.vhd</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("image_id", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image type of the node pool. Either this parameter or image_id is required if nodepool_id is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunLinux3</p>
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("image_type", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * <p>The instance types of the node pool. This parameter is required if nodepool_id is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs.c6.xlarge&quot;]</p>
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            String instanceTypesShrink = shrink(instanceTypes, "instance_types", "json");
            this.putQueryParameter("instance_types", instanceTypesShrink);
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("max_results", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>5c0a1c0f91c14c6****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("next_token", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The node pool ID. If you specify a node pool ID, the system queries the list of components available for the node pool and ignores other parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>np1855b102ac434f5990d87b77a****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putQueryParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>The node pool type. This parameter is required if nodepool_id is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>ess</p>
         */
        public Builder nodepoolType(String nodepoolType) {
            this.putQueryParameter("nodepool_type", nodepoolType);
            this.nodepoolType = nodepoolType;
            return this;
        }

        @Override
        public ListNodePoolComponentsRequest build() {
            return new ListNodePoolComponentsRequest(this);
        } 

    } 

}
