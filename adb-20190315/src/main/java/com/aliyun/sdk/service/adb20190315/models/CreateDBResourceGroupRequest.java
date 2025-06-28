// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link CreateDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDBResourceGroupRequest</p>
 */
public class CreateDBResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterMode")
    private String clusterMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterSizeResource")
    private String clusterSizeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineParams")
    private java.util.Map<String, ?> engineParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxClusterCount")
    private Integer maxClusterCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeResource")
    private String maxComputeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinClusterCount")
    private Integer minClusterCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinComputeResource")
    private String minComputeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNum")
    @com.aliyun.core.annotation.Validation(maximum = 4294967296D)
    private Integer nodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterMode = builder.clusterMode;
        this.clusterSizeResource = builder.clusterSizeResource;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.engineParams = builder.engineParams;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.maxClusterCount = builder.maxClusterCount;
        this.maxComputeResource = builder.maxComputeResource;
        this.minClusterCount = builder.minClusterCount;
        this.minComputeResource = builder.minComputeResource;
        this.nodeNum = builder.nodeNum;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterMode
     */
    public String getClusterMode() {
        return this.clusterMode;
    }

    /**
     * @return clusterSizeResource
     */
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineParams
     */
    public java.util.Map<String, ?> getEngineParams() {
        return this.engineParams;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return maxClusterCount
     */
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    /**
     * @return maxComputeResource
     */
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    /**
     * @return minClusterCount
     */
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    /**
     * @return minComputeResource
     */
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    /**
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateDBResourceGroupRequest, Builder> {
        private String clientToken; 
        private String clusterMode; 
        private String clusterSizeResource; 
        private String DBClusterId; 
        private String engine; 
        private java.util.Map<String, ?> engineParams; 
        private String groupName; 
        private String groupType; 
        private Integer maxClusterCount; 
        private String maxComputeResource; 
        private Integer minClusterCount; 
        private String minComputeResource; 
        private Integer nodeNum; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBResourceGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterMode = request.clusterMode;
            this.clusterSizeResource = request.clusterSizeResource;
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
            this.engineParams = request.engineParams;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.maxClusterCount = request.maxClusterCount;
            this.maxComputeResource = request.maxComputeResource;
            this.minClusterCount = request.minClusterCount;
            this.minComputeResource = request.minComputeResource;
            this.nodeNum = request.nodeNum;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The working mode of the resource group. Valid values:</p>
         * <ul>
         * <li><strong>Disable</strong> (default)</li>
         * <li><strong>AutoScale</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AutoScale</p>
         */
        public Builder clusterMode(String clusterMode) {
            this.putQueryParameter("ClusterMode", clusterMode);
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * <p>The resource specifications of a single compute cluster. Unit: ACU.</p>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        public Builder clusterSizeResource(String clusterSizeResource) {
            this.putQueryParameter("ClusterSizeResource", clusterSizeResource);
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1ub9grke1****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The engine of the resource group. Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB</strong> (default)</li>
         * <li><strong>SparkWarehouse</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The Spark application configuration parameters that can be applied to all Spark jobs executed in the resource group. If you want to configure parameters for a specific Spark job, you can specify values for the parameters in the code editor when you submit the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.adb.version&quot;:&quot;3.5&quot;}</p>
         */
        public Builder engineParams(java.util.Map<String, ?> engineParams) {
            String engineParamsShrink = shrink(engineParams, "EngineParams", "json");
            this.putQueryParameter("EngineParams", engineParamsShrink);
            this.engineParams = engineParams;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <ul>
         * <li>The name can be up to 255 characters in length.</li>
         * <li>The name must start with an uppercase letter or a digit.</li>
         * <li>The name can contain uppercase letters, digits, hyphens (-), and underscores (_).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The query execution mode. Valid values:</p>
         * <ul>
         * <li><strong>interactive</strong> (default)</li>
         * <li><strong>batch</strong></li>
         * <li><strong>job</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>interactive</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The maximum number of compute clusters that are allowed in the resource group. Maximum value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxClusterCount(Integer maxClusterCount) {
            this.putQueryParameter("MaxClusterCount", maxClusterCount);
            this.maxClusterCount = maxClusterCount;
            return this;
        }

        /**
         * <p>The maximum amount of reserved computing resources, which refers to the amount of resources that are not allocated in the cluster. Unit: ACU.</p>
         * <ul>
         * <li>When GroupType is set to interactive, set this parameter to a value in increments of 16ACU.</li>
         * <li>When GroupType is set to job, set this parameter to a value in increments of 8ACU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        public Builder maxComputeResource(String maxComputeResource) {
            this.putQueryParameter("MaxComputeResource", maxComputeResource);
            this.maxComputeResource = maxComputeResource;
            return this;
        }

        /**
         * <p>The minimum number of compute clusters that are required in the resource group. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minClusterCount(Integer minClusterCount) {
            this.putQueryParameter("MinClusterCount", minClusterCount);
            this.minClusterCount = minClusterCount;
            return this;
        }

        /**
         * <p>The minimum amount of reserved computing resources. Unit: AnalyticDB compute unit (ACU).</p>
         * <ul>
         * <li>When GroupType is set to interactive, set this parameter to 16ACU.</li>
         * <li>When GroupType is set to job, set this parameter to 0ACU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0ACU</p>
         */
        public Builder minComputeResource(String minComputeResource) {
            this.putQueryParameter("MinComputeResource", minComputeResource);
            this.minComputeResource = minComputeResource;
            return this;
        }

        /**
         * <p>The number of nodes. Default value: 0.</p>
         * <ul>
         * <li>Each node is configured with the resources of 16 cores and 64 GB memory.</li>
         * <li>Make sure that the amount of resources of the nodes (Number of nodes × 16 cores and 64 GB memory) is less than or equal to the amount of unused resources of the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeNum(Integer nodeNum) {
            this.putQueryParameter("NodeNum", nodeNum);
            this.nodeNum = nodeNum;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateDBResourceGroupRequest build() {
            return new CreateDBResourceGroupRequest(this);
        } 

    } 

}
