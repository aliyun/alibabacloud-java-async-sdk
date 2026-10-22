// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterAttributeResponseBody</p>
 */
public class DescribeAIDBClusterAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiNodeType")
    private String aiNodeType;

    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("CurrentCapacity")
    private Long currentCapacity;

    @com.aliyun.core.annotation.NameInMap("CustomOssPath")
    private String customOssPath;

    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
    private String DBClusterStatus;

    @com.aliyun.core.annotation.NameInMap("DBInstanceStatusDesc")
    private String DBInstanceStatusDesc;

    @com.aliyun.core.annotation.NameInMap("DBNodes")
    private java.util.List<DBNodes> DBNodes;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("DedicatedHostModel")
    private Boolean dedicatedHostModel;

    @com.aliyun.core.annotation.NameInMap("EcsSecurityGroupId")
    private String ecsSecurityGroupId;

    @com.aliyun.core.annotation.NameInMap("EndpointList")
    private java.util.List<EndpointList> endpointList;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("InferenceEngine")
    private String inferenceEngine;

    @com.aliyun.core.annotation.NameInMap("InternalIp")
    private String internalIp;

    @com.aliyun.core.annotation.NameInMap("KVCacheInstanceId")
    private String KVCacheInstanceId;

    @com.aliyun.core.annotation.NameInMap("KubeClusterId")
    private String kubeClusterId;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MaxQPM")
    private String maxQPM;

    @com.aliyun.core.annotation.NameInMap("MaxTPM")
    private String maxTPM;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelSpaceName")
    private String modelSpaceName;

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PreviousCustomOssPath")
    private String previousCustomOssPath;

    @com.aliyun.core.annotation.NameInMap("PublicIp")
    private String publicIp;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunType")
    private String runType;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("TimeSlicesInfo")
    private TimeSlicesInfo timeSlicesInfo;

    @com.aliyun.core.annotation.NameInMap("TimeSlicesType")
    private String timeSlicesType;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VnodeKubernetesConfig")
    private VnodeKubernetesConfig vnodeKubernetesConfig;

    @com.aliyun.core.annotation.NameInMap("Volumes")
    private java.util.List<Volumes> volumes;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private String zoneIds;

    private DescribeAIDBClusterAttributeResponseBody(Builder builder) {
        this.aiNodeType = builder.aiNodeType;
        this.apiKey = builder.apiKey;
        this.command = builder.command;
        this.creationTime = builder.creationTime;
        this.currentCapacity = builder.currentCapacity;
        this.customOssPath = builder.customOssPath;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterStatus = builder.DBClusterStatus;
        this.DBInstanceStatusDesc = builder.DBInstanceStatusDesc;
        this.DBNodes = builder.DBNodes;
        this.DBVersion = builder.DBVersion;
        this.dedicatedHostModel = builder.dedicatedHostModel;
        this.ecsSecurityGroupId = builder.ecsSecurityGroupId;
        this.endpointList = builder.endpointList;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.gatewayId = builder.gatewayId;
        this.inferenceEngine = builder.inferenceEngine;
        this.internalIp = builder.internalIp;
        this.KVCacheInstanceId = builder.KVCacheInstanceId;
        this.kubeClusterId = builder.kubeClusterId;
        this.lockMode = builder.lockMode;
        this.maxQPM = builder.maxQPM;
        this.maxTPM = builder.maxTPM;
        this.modelName = builder.modelName;
        this.modelSpaceName = builder.modelSpaceName;
        this.modelType = builder.modelType;
        this.payType = builder.payType;
        this.previousCustomOssPath = builder.previousCustomOssPath;
        this.publicIp = builder.publicIp;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.runType = builder.runType;
        this.storageType = builder.storageType;
        this.timeSlicesInfo = builder.timeSlicesInfo;
        this.timeSlicesType = builder.timeSlicesType;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.vnodeKubernetesConfig = builder.vnodeKubernetesConfig;
        this.volumes = builder.volumes;
        this.zoneId = builder.zoneId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiNodeType
     */
    public String getAiNodeType() {
        return this.aiNodeType;
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return currentCapacity
     */
    public Long getCurrentCapacity() {
        return this.currentCapacity;
    }

    /**
     * @return customOssPath
     */
    public String getCustomOssPath() {
        return this.customOssPath;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBClusterStatus
     */
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    /**
     * @return DBInstanceStatusDesc
     */
    public String getDBInstanceStatusDesc() {
        return this.DBInstanceStatusDesc;
    }

    /**
     * @return DBNodes
     */
    public java.util.List<DBNodes> getDBNodes() {
        return this.DBNodes;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return dedicatedHostModel
     */
    public Boolean getDedicatedHostModel() {
        return this.dedicatedHostModel;
    }

    /**
     * @return ecsSecurityGroupId
     */
    public String getEcsSecurityGroupId() {
        return this.ecsSecurityGroupId;
    }

    /**
     * @return endpointList
     */
    public java.util.List<EndpointList> getEndpointList() {
        return this.endpointList;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return inferenceEngine
     */
    public String getInferenceEngine() {
        return this.inferenceEngine;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return KVCacheInstanceId
     */
    public String getKVCacheInstanceId() {
        return this.KVCacheInstanceId;
    }

    /**
     * @return kubeClusterId
     */
    public String getKubeClusterId() {
        return this.kubeClusterId;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return maxQPM
     */
    public String getMaxQPM() {
        return this.maxQPM;
    }

    /**
     * @return maxTPM
     */
    public String getMaxTPM() {
        return this.maxTPM;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelSpaceName
     */
    public String getModelSpaceName() {
        return this.modelSpaceName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return previousCustomOssPath
     */
    public String getPreviousCustomOssPath() {
        return this.previousCustomOssPath;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runType
     */
    public String getRunType() {
        return this.runType;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return timeSlicesInfo
     */
    public TimeSlicesInfo getTimeSlicesInfo() {
        return this.timeSlicesInfo;
    }

    /**
     * @return timeSlicesType
     */
    public String getTimeSlicesType() {
        return this.timeSlicesType;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vnodeKubernetesConfig
     */
    public VnodeKubernetesConfig getVnodeKubernetesConfig() {
        return this.vnodeKubernetesConfig;
    }

    /**
     * @return volumes
     */
    public java.util.List<Volumes> getVolumes() {
        return this.volumes;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneIds
     */
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder {
        private String aiNodeType; 
        private String apiKey; 
        private String command; 
        private String creationTime; 
        private Long currentCapacity; 
        private String customOssPath; 
        private String DBClusterDescription; 
        private String DBClusterId; 
        private String DBClusterStatus; 
        private String DBInstanceStatusDesc; 
        private java.util.List<DBNodes> DBNodes; 
        private String DBVersion; 
        private Boolean dedicatedHostModel; 
        private String ecsSecurityGroupId; 
        private java.util.List<EndpointList> endpointList; 
        private String expireTime; 
        private Boolean expired; 
        private String gatewayId; 
        private String inferenceEngine; 
        private String internalIp; 
        private String KVCacheInstanceId; 
        private String kubeClusterId; 
        private String lockMode; 
        private String maxQPM; 
        private String maxTPM; 
        private String modelName; 
        private String modelSpaceName; 
        private String modelType; 
        private String payType; 
        private String previousCustomOssPath; 
        private String publicIp; 
        private String regionId; 
        private String requestId; 
        private String runType; 
        private String storageType; 
        private TimeSlicesInfo timeSlicesInfo; 
        private String timeSlicesType; 
        private String VPCId; 
        private String vSwitchId; 
        private VnodeKubernetesConfig vnodeKubernetesConfig; 
        private java.util.List<Volumes> volumes; 
        private String zoneId; 
        private String zoneIds; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterAttributeResponseBody model) {
            this.aiNodeType = model.aiNodeType;
            this.apiKey = model.apiKey;
            this.command = model.command;
            this.creationTime = model.creationTime;
            this.currentCapacity = model.currentCapacity;
            this.customOssPath = model.customOssPath;
            this.DBClusterDescription = model.DBClusterDescription;
            this.DBClusterId = model.DBClusterId;
            this.DBClusterStatus = model.DBClusterStatus;
            this.DBInstanceStatusDesc = model.DBInstanceStatusDesc;
            this.DBNodes = model.DBNodes;
            this.DBVersion = model.DBVersion;
            this.dedicatedHostModel = model.dedicatedHostModel;
            this.ecsSecurityGroupId = model.ecsSecurityGroupId;
            this.endpointList = model.endpointList;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.gatewayId = model.gatewayId;
            this.inferenceEngine = model.inferenceEngine;
            this.internalIp = model.internalIp;
            this.KVCacheInstanceId = model.KVCacheInstanceId;
            this.kubeClusterId = model.kubeClusterId;
            this.lockMode = model.lockMode;
            this.maxQPM = model.maxQPM;
            this.maxTPM = model.maxTPM;
            this.modelName = model.modelName;
            this.modelSpaceName = model.modelSpaceName;
            this.modelType = model.modelType;
            this.payType = model.payType;
            this.previousCustomOssPath = model.previousCustomOssPath;
            this.publicIp = model.publicIp;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.runType = model.runType;
            this.storageType = model.storageType;
            this.timeSlicesInfo = model.timeSlicesInfo;
            this.timeSlicesType = model.timeSlicesType;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.vnodeKubernetesConfig = model.vnodeKubernetesConfig;
            this.volumes = model.volumes;
            this.zoneId = model.zoneId;
            this.zoneIds = model.zoneIds;
        } 

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>vnode: ACK-managed node.</li>
         * <li>container: container that supports logon.</li>
         * <li>maas: model service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vnode</p>
         */
        public Builder aiNodeType(String aiNodeType) {
            this.aiNodeType = aiNodeType;
            return this;
        }

        /**
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>x********</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>The startup command currently used by the model service.</p>
         * 
         * <strong>example:</strong>
         * <p>python -m vllm.entrypoints.openai.api_server</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * <p>The time when the cluster was created.</p>
         * <p>The time follows the ISO 8601 standard in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The current measured model capacity of the instance. The abstract capacity unit is 1000, which is equivalent to one L20N card.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder currentCapacity(Long currentCapacity) {
            this.currentCapacity = currentCapacity;
            return this;
        }

        /**
         * <p>The custom Object Storage Service (OSS) path of the model currently used by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>/my-model-bucket/models/qwen3</p>
         */
        public Builder customOssPath(String customOssPath) {
            this.customOssPath = customOssPath;
            return this;
        }

        /**
         * <p>The description of the cluster. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The status of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The cluster is being created.</li>
         * <li><strong>Running</strong>: The cluster is running.</li>
         * <li><strong>Deleting</strong>: The cluster is being released.</li>
         * <li><strong>DBNodeCreating</strong>: Nodes are being added.</li>
         * <li><strong>DBNodeDeleting</strong>: Nodes are being deleted.</li>
         * <li><strong>ClassChanging</strong>: The node specifications are being changed. </li>
         * <li><strong>Deleted</strong>: The cluster is released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * <p>The database instance status description. A value of ACTIVATION indicates that the database instance is running.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        public Builder DBInstanceStatusDesc(String DBInstanceStatusDesc) {
            this.DBInstanceStatusDesc = DBInstanceStatusDesc;
            return this;
        }

        /**
         * <p>The details of the node information.</p>
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * <p>The cluster version. Valid values:</p>
         * <p><strong>1.0</strong></p>
         * <p><strong>2.0</strong></p>
         * <p><strong>3.0</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>Specifies whether the dedicated host mode is used.</p>
         */
        public Builder dedicatedHostModel(Boolean dedicatedHostModel) {
            this.dedicatedHostModel = dedicatedHostModel;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxx</p>
         */
        public Builder ecsSecurityGroupId(String ecsSecurityGroupId) {
            this.ecsSecurityGroupId = ecsSecurityGroupId;
            return this;
        }

        /**
         * <p>The list of network endpoint addresses of the instance.</p>
         */
        public Builder endpointList(java.util.List<EndpointList> endpointList) {
            this.endpointList = endpointList;
            return this;
        }

        /**
         * <p>The expiration time of the cluster.</p>
         * <blockquote>
         * <p>A specific value is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription). For clusters whose billing method is <strong>Postpaid</strong> (pay-as-you-go), an empty value is returned.</p>
         * </blockquote>
         * <p>The time follows the ISO 8601 standard in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T16:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>The ID of the AI gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-2ze24rr575j5b18cg</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The model inference engine.</p>
         * 
         * <strong>example:</strong>
         * <p>sglang</p>
         */
        public Builder inferenceEngine(String inferenceEngine) {
            this.inferenceEngine = inferenceEngine;
            return this;
        }

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.<em>.</em>.72</p>
         */
        public Builder internalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }

        /**
         * <p>The KVCache instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pkv-xxxxx</p>
         */
        public Builder KVCacheInstanceId(String KVCacheInstanceId) {
            this.KVCacheInstanceId = KVCacheInstanceId;
            return this;
        }

        /**
         * <p>The ACK cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder kubeClusterId(String kubeClusterId) {
            this.kubeClusterId = kubeClusterId;
            return this;
        }

        /**
         * <p>The lock mode of the instance. A value of <strong>lock</strong> indicates that the instance has expired or has an overdue payment.</p>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The maximum number of requests per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxQPM(String maxQPM) {
            this.maxQPM = maxQPM;
            return this;
        }

        /**
         * <p>The maximum number of tokens allowed per minute.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder maxTPM(String maxTPM) {
            this.maxTPM = maxTPM;
            return this;
        }

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-Embedding-8B</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The name of the workspace to which the model belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-model-space</p>
         */
        public Builder modelSpaceName(String modelSpaceName) {
            this.modelSpaceName = modelSpaceName;
            return this;
        }

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go</li>
         * <li><strong>Prepaid</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The custom model OSS path before the last change.</p>
         * 
         * <strong>example:</strong>
         * <p>/my-model-bucket/models/qwen2</p>
         */
        public Builder previousCustomOssPath(String previousCustomOssPath) {
            this.previousCustomOssPath = previousCustomOssPath;
            return this;
        }

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>8.xxx.xxx.xxx</p>
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The architecture type. Valid values:</p>
         * <ul>
         * <li>container: AI container</li>
         * <li>ainode: AI node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>container</p>
         */
        public Builder runType(String runType) {
            this.runType = runType;
            return this;
        }

        /**
         * <p>The storage type. Valid values for Enterprise Edition:</p>
         * <ul>
         * <li><strong>PSL5</strong></li>
         * <li><strong>PSL4</strong></li>
         * </ul>
         * <p>Valid values for Standard Edition:</p>
         * <ul>
         * <li><strong>ESSDPL0</strong></li>
         * <li><strong>ESSDPL1</strong></li>
         * <li><strong>ESSDPL2</strong></li>
         * <li><strong>ESSDPL3</strong></li>
         * <li><strong>ESSDAUTOPL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>essdpl1</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The time slice configuration for pay-as-you-go billing.</p>
         */
        public Builder timeSlicesInfo(TimeSlicesInfo timeSlicesInfo) {
            this.timeSlicesInfo = timeSlicesInfo;
            return this;
        }

        /**
         * <p>The cycle type of the time slice configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        public Builder timeSlicesType(String timeSlicesType) {
            this.timeSlicesType = timeSlicesType;
            return this;
        }

        /**
         * <p>The VPC ID specified for zone switching.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <p>If VPCId is specified, VSwitchId is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The Kubernetes configuration of the virtual node.</p>
         */
        public Builder vnodeKubernetesConfig(VnodeKubernetesConfig vnodeKubernetesConfig) {
            this.vnodeKubernetesConfig = vnodeKubernetesConfig;
            return this;
        }

        /**
         * <p>The list of data cloud disks.</p>
         */
        public Builder volumes(java.util.List<Volumes> volumes) {
            this.volumes = volumes;
            return this;
        }

        /**
         * <p>The zone ID of the PolarDB cluster node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The zone IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i,cn-hangzhou-g</p>
         */
        public Builder zoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public DescribeAIDBClusterAttributeResponseBody build() {
            return new DescribeAIDBClusterAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class ChildVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SizeGB")
        private String sizeGB;

        @com.aliyun.core.annotation.NameInMap("StorageCategory")
        private String storageCategory;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private ChildVolumes(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.sizeGB = builder.sizeGB;
            this.storageCategory = builder.storageCategory;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildVolumes create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sizeGB
         */
        public String getSizeGB() {
            return this.sizeGB;
        }

        /**
         * @return storageCategory
         */
        public String getStorageCategory() {
            return this.storageCategory;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 
            private String sizeGB; 
            private String storageCategory; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(ChildVolumes model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.sizeGB = model.sizeGB;
                this.storageCategory = model.storageCategory;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The actual mount path.</p>
             * 
             * <strong>example:</strong>
             * <p>/tmp/CrowdStrike</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The disk name.</p>
             * 
             * <strong>example:</strong>
             * <p>jueming</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder sizeGB(String sizeGB) {
                this.sizeGB = sizeGB;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>PolarFs</p>
             */
            public Builder storageCategory(String storageCategory) {
                this.storageCategory = storageCategory;
                return this;
            }

            /**
             * <p>The storage category.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public ChildVolumes build() {
                return new ChildVolumes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class SupportedApis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("GenerationMode")
        private String generationMode;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private SupportedApis(Builder builder) {
            this.apiName = builder.apiName;
            this.generationMode = builder.generationMode;
            this.path = builder.path;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedApis create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return generationMode
         */
        public String getGenerationMode() {
            return this.generationMode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String apiName; 
            private String generationMode; 
            private String path; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(SupportedApis model) {
                this.apiName = model.apiName;
                this.generationMode = model.generationMode;
                this.path = model.path;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The name of the API supported by the database node.</p>
             * 
             * <strong>example:</strong>
             * <p>Completions</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The generation mode of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>stream</p>
             */
            public Builder generationMode(String generationMode) {
                this.generationMode = generationMode;
                return this;
            }

            /**
             * <p>The path of the supported API.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The protocol type of the supported API.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public SupportedApis build() {
                return new SupportedApis(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildVolumes")
        private java.util.List<ChildVolumes> childVolumes;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeDescription")
        private String DBNodeDescription;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("LinkIP")
        private String linkIP;

        @com.aliyun.core.annotation.NameInMap("LogIndex")
        private String logIndex;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelSpaceName")
        private String modelSpaceName;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("SupportedApis")
        private java.util.List<SupportedApis> supportedApis;

        @com.aliyun.core.annotation.NameInMap("VNodeId")
        private String vNodeId;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNodes(Builder builder) {
            this.childVolumes = builder.childVolumes;
            this.command = builder.command;
            this.cpuCores = builder.cpuCores;
            this.creationTime = builder.creationTime;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeDescription = builder.DBNodeDescription;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.GPU = builder.GPU;
            this.linkIP = builder.linkIP;
            this.logIndex = builder.logIndex;
            this.memorySize = builder.memorySize;
            this.modelName = builder.modelName;
            this.modelSpaceName = builder.modelSpaceName;
            this.publicIp = builder.publicIp;
            this.supportedApis = builder.supportedApis;
            this.vNodeId = builder.vNodeId;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return childVolumes
         */
        public java.util.List<ChildVolumes> getChildVolumes() {
            return this.childVolumes;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeDescription
         */
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return DBNodeStatus
         */
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return linkIP
         */
        public String getLinkIP() {
            return this.linkIP;
        }

        /**
         * @return logIndex
         */
        public String getLogIndex() {
            return this.logIndex;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelSpaceName
         */
        public String getModelSpaceName() {
            return this.modelSpaceName;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return supportedApis
         */
        public java.util.List<SupportedApis> getSupportedApis() {
            return this.supportedApis;
        }

        /**
         * @return vNodeId
         */
        public String getVNodeId() {
            return this.vNodeId;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<ChildVolumes> childVolumes; 
            private String command; 
            private String cpuCores; 
            private String creationTime; 
            private String DBNodeClass; 
            private String DBNodeDescription; 
            private String DBNodeId; 
            private String DBNodeStatus; 
            private String GPU; 
            private String linkIP; 
            private String logIndex; 
            private String memorySize; 
            private String modelName; 
            private String modelSpaceName; 
            private String publicIp; 
            private java.util.List<SupportedApis> supportedApis; 
            private String vNodeId; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.childVolumes = model.childVolumes;
                this.command = model.command;
                this.cpuCores = model.cpuCores;
                this.creationTime = model.creationTime;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeDescription = model.DBNodeDescription;
                this.DBNodeId = model.DBNodeId;
                this.DBNodeStatus = model.DBNodeStatus;
                this.GPU = model.GPU;
                this.linkIP = model.linkIP;
                this.logIndex = model.logIndex;
                this.memorySize = model.memorySize;
                this.modelName = model.modelName;
                this.modelSpaceName = model.modelSpaceName;
                this.publicIp = model.publicIp;
                this.supportedApis = model.supportedApis;
                this.vNodeId = model.vNodeId;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The list of data cloud disks.</p>
             */
            public Builder childVolumes(java.util.List<ChildVolumes> childVolumes) {
                this.childVolumes = childVolumes;
                return this;
            }

            /**
             * <p>The startup command currently used by the model. If no record exists, an empty string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>python -m vllm.entrypoints.openai.api_server</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The number of CPU cores of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The time when the node was created.</p>
             * <p>The time follows the ISO 8601 standard in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-14T05:58:42Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The cluster specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.pg.g8.8xlarge.gu30</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The description of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBNodeDescription(String DBNodeDescription) {
                this.DBNodeDescription = DBNodeDescription;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-****************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The node is being created. </li>
             * <li><strong>Running</strong>: The node is running. </li>
             * <li><strong>Deleting</strong>: The node is being deleted.  </li>
             * <li><strong>Rebooting</strong>: The node is being restarted.  </li>
             * <li><strong>DBNodeCreating</strong>: Nodes are being added.  </li>
             * <li><strong>DBNodeDeleting</strong>: Nodes are being deleted. </li>
             * <li><strong>ClassChanging</strong>: The node specifications are being changed.  </li>
             * <li><strong>MinorVersionUpgrading</strong>: The minor version is being upgraded.</li>
             * <li><strong>Maintaining</strong>: The instance is being maintained.  </li>
             * <li><strong>Switching</strong>: A switchover is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.*.*12</p>
             */
            public Builder linkIP(String linkIP) {
                this.linkIP = linkIP;
                return this;
            }

            /**
             * <p>The log indexing of the worker node.</p>
             * 
             * <strong>example:</strong>
             * <p>worker-0</p>
             */
            public Builder logIndex(String logIndex) {
                this.logIndex = logIndex;
                return this;
            }

            /**
             * <p>The memory size of the node. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3-Embedding-8B</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The name of the workspace to which the model belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>my-model-space</p>
             */
            public Builder modelSpaceName(String modelSpaceName) {
                this.modelSpaceName = modelSpaceName;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>101.101.101.101</p>
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * <p>The supported APIs.</p>
             */
            public Builder supportedApis(java.util.List<SupportedApis> supportedApis) {
                this.supportedApis = supportedApis;
                return this;
            }

            /**
             * <p>The ID of the Kubernetes virtual node.</p>
             * 
             * <strong>example:</strong>
             * <p>vn-***************</p>
             */
            public Builder vNodeId(String vNodeId) {
                this.vNodeId = vNodeId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-*******************</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-*********************</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-d</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class NetInfoItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private NetInfoItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.netType = builder.netType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItems create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String netType; 
            private String port; 

            private Builder() {
            } 

            private Builder(NetInfoItems model) {
                this.connectionString = model.connectionString;
                this.netType = model.netType;
                this.port = model.port;
            } 

            /**
             * <p>The database connection address.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-**********.rwlb.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The network type of the connection string. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: Public network address.</li>
             * <li><strong>Private</strong>: Private network address.</li>
             * <li><strong>Inner</strong>: Private network address (classic network).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public NetInfoItems build() {
                return new NetInfoItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class EndpointList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetInfoItems")
        private java.util.List<NetInfoItems> netInfoItems;

        private EndpointList(Builder builder) {
            this.netInfoItems = builder.netInfoItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointList create() {
            return builder().build();
        }

        /**
         * @return netInfoItems
         */
        public java.util.List<NetInfoItems> getNetInfoItems() {
            return this.netInfoItems;
        }

        public static final class Builder {
            private java.util.List<NetInfoItems> netInfoItems; 

            private Builder() {
            } 

            private Builder(EndpointList model) {
                this.netInfoItems = model.netInfoItems;
            } 

            /**
             * <p>The list of network information of the instance.</p>
             */
            public Builder netInfoItems(java.util.List<NetInfoItems> netInfoItems) {
                this.netInfoItems = netInfoItems;
                return this;
            }

            public EndpointList build() {
                return new EndpointList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class TimeSlices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        private TimeSlices(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSlices create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 

            private Builder() {
            } 

            private Builder(TimeSlices model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
            } 

            /**
             * <p>The start time of the time slice, in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The end time of the time slice, in the HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>18:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public TimeSlices build() {
                return new TimeSlices(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class TimeSlicesInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeSlices")
        private java.util.List<TimeSlices> timeSlices;

        private TimeSlicesInfo(Builder builder) {
            this.timeSlices = builder.timeSlices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSlicesInfo create() {
            return builder().build();
        }

        /**
         * @return timeSlices
         */
        public java.util.List<TimeSlices> getTimeSlices() {
            return this.timeSlices;
        }

        public static final class Builder {
            private java.util.List<TimeSlices> timeSlices; 

            private Builder() {
            } 

            private Builder(TimeSlicesInfo model) {
                this.timeSlices = model.timeSlices;
            } 

            /**
             * <p>The list of time slices for pay-as-you-go billing.</p>
             */
            public Builder timeSlices(java.util.List<TimeSlices> timeSlices) {
                this.timeSlices = timeSlices;
                return this;
            }

            public TimeSlicesInfo build() {
                return new TimeSlicesInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the node label.</p>
             * 
             * <strong>example:</strong>
             * <p>environment</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the node label.</p>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class Taints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Taints(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taints create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
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
            private String effect; 
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Taints model) {
                this.effect = model.effect;
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The scheduling effect of the node taint.</p>
             * 
             * <strong>example:</strong>
             * <p>NoSchedule</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The key of the node taint.</p>
             * 
             * <strong>example:</strong>
             * <p>dedicated</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the node taint.</p>
             * 
             * <strong>example:</strong>
             * <p>groupName</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taints build() {
                return new Taints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class VnodeKubernetesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Taints")
        private java.util.List<Taints> taints;

        private VnodeKubernetesConfig(Builder builder) {
            this.labels = builder.labels;
            this.taints = builder.taints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VnodeKubernetesConfig create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return taints
         */
        public java.util.List<Taints> getTaints() {
            return this.taints;
        }

        public static final class Builder {
            private java.util.List<Labels> labels; 
            private java.util.List<Taints> taints; 

            private Builder() {
            } 

            private Builder(VnodeKubernetesConfig model) {
                this.labels = model.labels;
                this.taints = model.taints;
            } 

            /**
             * <p>The list of Kubernetes node labels.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The list of Kubernetes node taints.</p>
             */
            public Builder taints(java.util.List<Taints> taints) {
                this.taints = taints;
                return this;
            }

            public VnodeKubernetesConfig build() {
                return new VnodeKubernetesConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterAttributeResponseBody</p>
     */
    public static class Volumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SizeGB")
        private String sizeGB;

        @com.aliyun.core.annotation.NameInMap("StorageCategory")
        private String storageCategory;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Volumes(Builder builder) {
            this.mountPath = builder.mountPath;
            this.name = builder.name;
            this.sizeGB = builder.sizeGB;
            this.storageCategory = builder.storageCategory;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Volumes create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sizeGB
         */
        public String getSizeGB() {
            return this.sizeGB;
        }

        /**
         * @return storageCategory
         */
        public String getStorageCategory() {
            return this.storageCategory;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String mountPath; 
            private String name; 
            private String sizeGB; 
            private String storageCategory; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Volumes model) {
                this.mountPath = model.mountPath;
                this.name = model.name;
                this.sizeGB = model.sizeGB;
                this.storageCategory = model.storageCategory;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The mount path in the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/var/run/secrets/kubernetes.io/serviceaccount</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The disk name.</p>
             * 
             * <strong>example:</strong>
             * <p>jueming</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The storage size.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder sizeGB(String sizeGB) {
                this.sizeGB = sizeGB;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder storageCategory(String storageCategory) {
                this.storageCategory = storageCategory;
                return this;
            }

            /**
             * <p>The storage category.</p>
             * 
             * <strong>example:</strong>
             * <p>PolarFs</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Volumes build() {
                return new Volumes(this);
            } 

        } 

    }
}
