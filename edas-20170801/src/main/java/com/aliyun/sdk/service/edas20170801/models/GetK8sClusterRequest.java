// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetK8sClusterRequest} extends {@link RequestModel}
 *
 * <p>GetK8sClusterRequest</p>
 */
public class GetK8sClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(maximum = 9999)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 9999, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubClusterType")
    private String subClusterType;

    private GetK8sClusterRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.regionTag = builder.regionTag;
        this.subClusterType = builder.subClusterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public Integer getClusterType() {
        return this.clusterType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionTag
     */
    public String getRegionTag() {
        return this.regionTag;
    }

    /**
     * @return subClusterType
     */
    public String getSubClusterType() {
        return this.subClusterType;
    }

    public static final class Builder extends Request.Builder<GetK8sClusterRequest, Builder> {
        private Integer clusterType; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String regionTag; 
        private String subClusterType; 

        private Builder() {
            super();
        } 

        private Builder(GetK8sClusterRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.regionTag = request.regionTag;
            this.subClusterType = request.subClusterType;
        } 

        /**
         * <p>The type of the Kubernetes cluster. Valid values:</p>
         * <ul>
         * <li>5: ACK cluster</li>
         * <li>7: self-managed Kubernetes cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionTag(String regionTag) {
            this.putQueryParameter("RegionTag", regionTag);
            this.regionTag = regionTag;
            return this;
        }

        /**
         * <p>The subtype of the cluster. Valid values:</p>
         * <ul>
         * <li>Ask: Serverless Kubernetes cluster</li>
         * <li>ManagedKubernetes: ACK cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ask</p>
         */
        public Builder subClusterType(String subClusterType) {
            this.putQueryParameter("SubClusterType", subClusterType);
            this.subClusterType = subClusterType;
            return this;
        }

        @Override
        public GetK8sClusterRequest build() {
            return new GetK8sClusterRequest(this);
        } 

    } 

}
