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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

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
        this.tags = builder.tags;
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

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
        private java.util.List<Tags> tags; 

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
            this.tags = request.tags;
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-718fb04c7112****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The page number for paging. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The compute group type. Valid values:</p>
         * <ul>
         * <li>FE</li>
         * <li>BE</li>
         * <li>CN</li>
         * <li>OBSERVER</li>
         * <li>AGENT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FE</p>
         */
        public Builder componentType(String componentType) {
            this.putBodyParameter("componentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The instance ID. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of compute group IDs to query.</p>
         */
        public Builder nodeGroupIds(java.util.List<String> nodeGroupIds) {
            this.putBodyParameter("nodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * <p>The compute group name.</p>
         * 
         * <strong>example:</strong>
         * <p>ng_1</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.putBodyParameter("nodeGroupName", nodeGroupName);
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>The compute group status. Valid values:</p>
         * <ul>
         * <li>UNPAID: Unpaid.</li>
         * <li>PAID: Paid.</li>
         * <li>CREATING_FAILED: Creation failed.</li>
         * <li>CREATING: Being created.</li>
         * <li>RUNNING: Running.</li>
         * <li>MODIFYING_CONFIG: Configuration being modified.</li>
         * <li>MODIFYING_TIMEZONE: Time zone being modified.</li>
         * <li>ELASTIC_SCALING_OUT: Elastic scale-out in progress.</li>
         * <li>ELASTIC_SCALING_IN: Elastic scale-in in progress.</li>
         * <li>SCALING_OUT: Scale-out in progress.</li>
         * <li>RESTARTING: Restarting.</li>
         * <li>SCALING_IN: Scale-in in progress.</li>
         * <li>SCALING_UP: Scaling up.</li>
         * <li>SCALING_DOWN: Scaling down.</li>
         * <li>UPGRADING: Upgrading.</li>
         * <li>ENABLE_PUBLIC_NETWORK: Enabling public network access.</li>
         * <li>DISABLE_PUBLIC_NETWORK: Disabling public network access.</li>
         * <li>SWITCH_AZ: Switching zone.</li>
         * <li>DISABLE: Disabled.</li>
         * <li>DELETING: Being deleted.</li>
         * <li>DELETED: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public DescribeNodeGroupsRequest build() {
            return new DescribeNodeGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeGroupsRequest} extends {@link TeaModel}
     *
     * <p>DescribeNodeGroupsRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
