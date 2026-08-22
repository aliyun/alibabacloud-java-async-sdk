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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
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
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
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
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CompatibleVersion.
             */
            public Builder compatibleVersion(String compatibleVersion) {
                this.compatibleVersion = compatibleVersion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
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
             * CoordinatorNodeCount.
             */
            public Builder coordinatorNodeCount(Integer coordinatorNodeCount) {
                this.coordinatorNodeCount = coordinatorNodeCount;
                return this;
            }

            /**
             * CoordinatorNodeCpu.
             */
            public Builder coordinatorNodeCpu(Integer coordinatorNodeCpu) {
                this.coordinatorNodeCpu = coordinatorNodeCpu;
                return this;
            }

            /**
             * CoordinatorNodeEnabled.
             */
            public Builder coordinatorNodeEnabled(Boolean coordinatorNodeEnabled) {
                this.coordinatorNodeEnabled = coordinatorNodeEnabled;
                return this;
            }

            /**
             * CoordinatorNodeMemoryGB.
             */
            public Builder coordinatorNodeMemoryGB(Integer coordinatorNodeMemoryGB) {
                this.coordinatorNodeMemoryGB = coordinatorNodeMemoryGB;
                return this;
            }

            /**
             * DataNodeCount.
             */
            public Builder dataNodeCount(Integer dataNodeCount) {
                this.dataNodeCount = dataNodeCount;
                return this;
            }

            /**
             * DataNodeCpu.
             */
            public Builder dataNodeCpu(Integer dataNodeCpu) {
                this.dataNodeCpu = dataNodeCpu;
                return this;
            }

            /**
             * DataNodeMemoryGB.
             */
            public Builder dataNodeMemoryGB(Integer dataNodeMemoryGB) {
                this.dataNodeMemoryGB = dataNodeMemoryGB;
                return this;
            }

            /**
             * MasterNodeCount.
             */
            public Builder masterNodeCount(Integer masterNodeCount) {
                this.masterNodeCount = masterNodeCount;
                return this;
            }

            /**
             * MasterNodeCpu.
             */
            public Builder masterNodeCpu(Integer masterNodeCpu) {
                this.masterNodeCpu = masterNodeCpu;
                return this;
            }

            /**
             * MasterNodeEnabled.
             */
            public Builder masterNodeEnabled(Boolean masterNodeEnabled) {
                this.masterNodeEnabled = masterNodeEnabled;
                return this;
            }

            /**
             * MasterNodeMemoryGB.
             */
            public Builder masterNodeMemoryGB(Integer masterNodeMemoryGB) {
                this.masterNodeMemoryGB = masterNodeMemoryGB;
                return this;
            }

            /**
             * ReplicaCount.
             */
            public Builder replicaCount(Integer replicaCount) {
                this.replicaCount = replicaCount;
                return this;
            }

            /**
             * StorageSizeGB.
             */
            public Builder storageSizeGB(Integer storageSizeGB) {
                this.storageSizeGB = storageSizeGB;
                return this;
            }

            /**
             * StorageType.
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
             * Instance.
             */
            public Builder instance(Instance instance) {
                this.instance = instance;
                return this;
            }

            /**
             * Spec.
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
