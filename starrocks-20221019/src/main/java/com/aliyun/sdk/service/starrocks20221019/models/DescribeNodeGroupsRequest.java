// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeNodeGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeGroupsRequest</p>
 */
public class DescribeNodeGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentType")
    private String componentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeGroupIds")
    private java.util.List<String> nodeGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DescribeNodeGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.componentType = builder.componentType;
        this.instanceId = builder.instanceId;
        this.nodeGroupIds = builder.nodeGroupIds;
        this.nodeGroupName = builder.nodeGroupName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return componentType
     */
    public String getComponentType() {
        return this.componentType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeGroupIds
     */
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeNodeGroupsRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String componentType; 
        private String instanceId; 
        private java.util.List<String> nodeGroupIds; 
        private String nodeGroupName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.componentType = request.componentType;
            this.instanceId = request.instanceId;
            this.nodeGroupIds = request.nodeGroupIds;
            this.nodeGroupName = request.nodeGroupName;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * componentType.
         */
        public Builder componentType(String componentType) {
            this.putBodyParameter("componentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * nodeGroupIds.
         */
        public Builder nodeGroupIds(java.util.List<String> nodeGroupIds) {
            this.putBodyParameter("nodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * nodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.putBodyParameter("nodeGroupName", nodeGroupName);
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeNodeGroupsRequest build() {
            return new DescribeNodeGroupsRequest(this);
        } 

    } 

}
