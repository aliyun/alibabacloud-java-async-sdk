// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeOpenSearchInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenSearchInfoResponseBody</p>
 */
public class DescribeOpenSearchInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenSearchInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenSearchInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOpenSearchInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the access denial.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned result set.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>173CA69A-3513-591D-8A09-C1EA37CBE2D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenSearchInfoResponseBody build() {
            return new DescribeOpenSearchInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOpenSearchInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchInfoResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The authorization action.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The identity used for authorization in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The ID of the owner of the authorization principal.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The type of the authorization principal.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The diagnostic information.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The type of access denial.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchInfoResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CompatibleVersion")
        private String compatibleVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Instance(Builder builder) {
            this.chargeType = builder.chargeType;
            this.compatibleVersion = builder.compatibleVersion;
            this.createTime = builder.createTime;
            this.deployMode = builder.deployMode;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.netType = builder.netType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return compatibleVersion
         */
        public String getCompatibleVersion() {
            return this.compatibleVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String chargeType; 
            private String compatibleVersion; 
            private String createTime; 
            private String deployMode; 
            private String engineVersion; 
            private String expireTime; 
            private String instanceId; 
            private String instanceName; 
            private String netType; 
            private String regionId; 
            private String status; 
            private String updateTime; 
            private String vpcId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.chargeType = model.chargeType;
                this.compatibleVersion = model.compatibleVersion;
                this.createTime = model.createTime;
                this.deployMode = model.deployMode;
                this.engineVersion = model.engineVersion;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.netType = model.netType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
             * <li><strong>PREPAY</strong>: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The OpenSearch compatible version.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder compatibleVersion(String compatibleVersion) {
                this.compatibleVersion = compatibleVersion;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-17T02:00:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The deployment mode. Valid values:</p>
             * <ul>
             * <li>multiple: multi-zone deployment</li>
             * <li>single: single-zone deployment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The DPI engine version. Default value: 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>anchashi</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-27T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-spsil01pww4hfz-mem</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-bjr76v5uw7z4f5fs-cdc</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The network type of the connection string. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: public endpoint</li>
             * <li><strong>Private</strong>: private endpoint</li>
             * <li><strong>Inner</strong>: private endpoint (classic network)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last task update time in UNIX timestamp format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-02T16:01:51Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) where the access endpoint resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze99u5upo8zxyf5dlfl5</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID. This parameter is required when you create a DRDS instance of the VPC network type.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zes4ojp6ygziyvq3vhd2</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchInfoResponseBody</p>
     */
    public static class Spec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoordinatorNodeCount")
        private Integer coordinatorNodeCount;

        @com.aliyun.core.annotation.NameInMap("CoordinatorNodeCpu")
        private Integer coordinatorNodeCpu;

        @com.aliyun.core.annotation.NameInMap("CoordinatorNodeEnabled")
        private Boolean coordinatorNodeEnabled;

        @com.aliyun.core.annotation.NameInMap("CoordinatorNodeMemoryGB")
        private Integer coordinatorNodeMemoryGB;

        @com.aliyun.core.annotation.NameInMap("DataNodeCount")
        private Integer dataNodeCount;

        @com.aliyun.core.annotation.NameInMap("DataNodeCpu")
        private Integer dataNodeCpu;

        @com.aliyun.core.annotation.NameInMap("DataNodeMemoryGB")
        private Integer dataNodeMemoryGB;

        @com.aliyun.core.annotation.NameInMap("MasterNodeCount")
        private Integer masterNodeCount;

        @com.aliyun.core.annotation.NameInMap("MasterNodeCpu")
        private Integer masterNodeCpu;

        @com.aliyun.core.annotation.NameInMap("MasterNodeEnabled")
        private Boolean masterNodeEnabled;

        @com.aliyun.core.annotation.NameInMap("MasterNodeMemoryGB")
        private Integer masterNodeMemoryGB;

        @com.aliyun.core.annotation.NameInMap("ReplicaCount")
        private Integer replicaCount;

        @com.aliyun.core.annotation.NameInMap("StorageSizeGB")
        private Integer storageSizeGB;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Spec(Builder builder) {
            this.coordinatorNodeCount = builder.coordinatorNodeCount;
            this.coordinatorNodeCpu = builder.coordinatorNodeCpu;
            this.coordinatorNodeEnabled = builder.coordinatorNodeEnabled;
            this.coordinatorNodeMemoryGB = builder.coordinatorNodeMemoryGB;
            this.dataNodeCount = builder.dataNodeCount;
            this.dataNodeCpu = builder.dataNodeCpu;
            this.dataNodeMemoryGB = builder.dataNodeMemoryGB;
            this.masterNodeCount = builder.masterNodeCount;
            this.masterNodeCpu = builder.masterNodeCpu;
            this.masterNodeEnabled = builder.masterNodeEnabled;
            this.masterNodeMemoryGB = builder.masterNodeMemoryGB;
            this.replicaCount = builder.replicaCount;
            this.storageSizeGB = builder.storageSizeGB;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return coordinatorNodeCount
         */
        public Integer getCoordinatorNodeCount() {
            return this.coordinatorNodeCount;
        }

        /**
         * @return coordinatorNodeCpu
         */
        public Integer getCoordinatorNodeCpu() {
            return this.coordinatorNodeCpu;
        }

        /**
         * @return coordinatorNodeEnabled
         */
        public Boolean getCoordinatorNodeEnabled() {
            return this.coordinatorNodeEnabled;
        }

        /**
         * @return coordinatorNodeMemoryGB
         */
        public Integer getCoordinatorNodeMemoryGB() {
            return this.coordinatorNodeMemoryGB;
        }

        /**
         * @return dataNodeCount
         */
        public Integer getDataNodeCount() {
            return this.dataNodeCount;
        }

        /**
         * @return dataNodeCpu
         */
        public Integer getDataNodeCpu() {
            return this.dataNodeCpu;
        }

        /**
         * @return dataNodeMemoryGB
         */
        public Integer getDataNodeMemoryGB() {
            return this.dataNodeMemoryGB;
        }

        /**
         * @return masterNodeCount
         */
        public Integer getMasterNodeCount() {
            return this.masterNodeCount;
        }

        /**
         * @return masterNodeCpu
         */
        public Integer getMasterNodeCpu() {
            return this.masterNodeCpu;
        }

        /**
         * @return masterNodeEnabled
         */
        public Boolean getMasterNodeEnabled() {
            return this.masterNodeEnabled;
        }

        /**
         * @return masterNodeMemoryGB
         */
        public Integer getMasterNodeMemoryGB() {
            return this.masterNodeMemoryGB;
        }

        /**
         * @return replicaCount
         */
        public Integer getReplicaCount() {
            return this.replicaCount;
        }

        /**
         * @return storageSizeGB
         */
        public Integer getStorageSizeGB() {
            return this.storageSizeGB;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private Integer coordinatorNodeCount; 
            private Integer coordinatorNodeCpu; 
            private Boolean coordinatorNodeEnabled; 
            private Integer coordinatorNodeMemoryGB; 
            private Integer dataNodeCount; 
            private Integer dataNodeCpu; 
            private Integer dataNodeMemoryGB; 
            private Integer masterNodeCount; 
            private Integer masterNodeCpu; 
            private Boolean masterNodeEnabled; 
            private Integer masterNodeMemoryGB; 
            private Integer replicaCount; 
            private Integer storageSizeGB; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Spec model) {
                this.coordinatorNodeCount = model.coordinatorNodeCount;
                this.coordinatorNodeCpu = model.coordinatorNodeCpu;
                this.coordinatorNodeEnabled = model.coordinatorNodeEnabled;
                this.coordinatorNodeMemoryGB = model.coordinatorNodeMemoryGB;
                this.dataNodeCount = model.dataNodeCount;
                this.dataNodeCpu = model.dataNodeCpu;
                this.dataNodeMemoryGB = model.dataNodeMemoryGB;
                this.masterNodeCount = model.masterNodeCount;
                this.masterNodeCpu = model.masterNodeCpu;
                this.masterNodeEnabled = model.masterNodeEnabled;
                this.masterNodeMemoryGB = model.masterNodeMemoryGB;
                this.replicaCount = model.replicaCount;
                this.storageSizeGB = model.storageSizeGB;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The number of coordinator nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder coordinatorNodeCount(Integer coordinatorNodeCount) {
                this.coordinatorNodeCount = coordinatorNodeCount;
                return this;
            }

            /**
             * <p>The number of CPU cores per coordinator node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder coordinatorNodeCpu(Integer coordinatorNodeCpu) {
                this.coordinatorNodeCpu = coordinatorNodeCpu;
                return this;
            }

            /**
             * <p>Indicates whether the coordinator node is enabled.</p>
             */
            public Builder coordinatorNodeEnabled(Boolean coordinatorNodeEnabled) {
                this.coordinatorNodeEnabled = coordinatorNodeEnabled;
                return this;
            }

            /**
             * <p>The memory size per coordinator node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder coordinatorNodeMemoryGB(Integer coordinatorNodeMemoryGB) {
                this.coordinatorNodeMemoryGB = coordinatorNodeMemoryGB;
                return this;
            }

            /**
             * <p>The number of data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dataNodeCount(Integer dataNodeCount) {
                this.dataNodeCount = dataNodeCount;
                return this;
            }

            /**
             * <p>The number of CPU cores per data node.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder dataNodeCpu(Integer dataNodeCpu) {
                this.dataNodeCpu = dataNodeCpu;
                return this;
            }

            /**
             * <p>The memory size per data node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder dataNodeMemoryGB(Integer dataNodeMemoryGB) {
                this.dataNodeMemoryGB = dataNodeMemoryGB;
                return this;
            }

            /**
             * <p>The master node type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: single-node master</li>
             * <li><strong>2</strong>: cluster-edition master</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder masterNodeCount(Integer masterNodeCount) {
                this.masterNodeCount = masterNodeCount;
                return this;
            }

            /**
             * <p>The number of CPU cores per dedicated master node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder masterNodeCpu(Integer masterNodeCpu) {
                this.masterNodeCpu = masterNodeCpu;
                return this;
            }

            /**
             * <p>Indicates whether the dedicated master node is enabled.</p>
             */
            public Builder masterNodeEnabled(Boolean masterNodeEnabled) {
                this.masterNodeEnabled = masterNodeEnabled;
                return this;
            }

            /**
             * <p>The memory size per dedicated master node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder masterNodeMemoryGB(Integer masterNodeMemoryGB) {
                this.masterNodeMemoryGB = masterNodeMemoryGB;
                return this;
            }

            /**
             * <p>The number of secondary nodes in the primary zone.</p>
             * <blockquote>
             * <p>The <strong>ReplicaCount</strong> and <strong>SlaveReplicaCount</strong> parameters apply only to cloud-native instances. If the instance uses a cluster architecture, these parameters indicate the number of secondary nodes per shard in the primary and secondary zones.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder replicaCount(Integer replicaCount) {
                this.replicaCount = replicaCount;
                return this;
            }

            /**
             * <p>The storage space per data node, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder storageSizeGB(Integer storageSizeGB) {
                this.storageSizeGB = storageSizeGB;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_auto</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOpenSearchInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOpenSearchInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private Instance instance;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Spec spec;

        private Data(Builder builder) {
            this.instance = builder.instance;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public Instance getInstance() {
            return this.instance;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Instance instance; 
            private Spec spec; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instance = model.instance;
                this.spec = model.spec;
            } 

            /**
             * <p>The instance information.</p>
             */
            public Builder instance(Instance instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>The specifications.</p>
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
