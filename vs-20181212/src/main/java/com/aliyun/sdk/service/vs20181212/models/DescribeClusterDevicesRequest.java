// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterDevicesRequest</p>
 */
public class DescribeClusterDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeNodeName")
    private String edgeNodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Specification")
    private String specification;

    private DescribeClusterDevicesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.edgeNodeName = builder.edgeNodeName;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.specification = builder.specification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterDevicesRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return edgeNodeName
     */
    public String getEdgeNodeName() {
        return this.edgeNodeName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return specification
     */
    public String getSpecification() {
        return this.specification;
    }

    public static final class Builder extends Request.Builder<DescribeClusterDevicesRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String edgeNodeName; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 
        private String platform; 
        private String specification; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterDevicesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.edgeNodeName = request.edgeNodeName;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
            this.specification = request.specification;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EdgeNodeName.
         */
        public Builder edgeNodeName(String edgeNodeName) {
            this.putQueryParameter("EdgeNodeName", edgeNodeName);
            this.edgeNodeName = edgeNodeName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * Specification.
         */
        public Builder specification(String specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        @Override
        public DescribeClusterDevicesRequest build() {
            return new DescribeClusterDevicesRequest(this);
        } 

    } 

}
