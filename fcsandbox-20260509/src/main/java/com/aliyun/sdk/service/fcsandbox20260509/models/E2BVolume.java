// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BVolume} extends {@link TeaModel}
 *
 * <p>E2BVolume</p>
 */
public class E2BVolume extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticBucketVolumeConfig")
    private AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("agenticFSVolumeConfig")
    private AgenticFSVolumeConfig agenticFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("mountConfig")
    private MountConfig mountConfig;

    @com.aliyun.core.annotation.NameInMap("ossVolumeConfig")
    private OSSVolumeConfig ossVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("storageClass")
    private String storageClass;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    @com.aliyun.core.annotation.NameInMap("volumeID")
    private String volumeID;

    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private E2BVolume(Builder builder) {
        this.agenticBucketVolumeConfig = builder.agenticBucketVolumeConfig;
        this.agenticFSVolumeConfig = builder.agenticFSVolumeConfig;
        this.createdAt = builder.createdAt;
        this.mountConfig = builder.mountConfig;
        this.ossVolumeConfig = builder.ossVolumeConfig;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.storageClass = builder.storageClass;
        this.teamID = builder.teamID;
        this.updatedAt = builder.updatedAt;
        this.userID = builder.userID;
        this.volumeID = builder.volumeID;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BVolume create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticBucketVolumeConfig
     */
    public AgenticBucketVolumeConfig getAgenticBucketVolumeConfig() {
        return this.agenticBucketVolumeConfig;
    }

    /**
     * @return agenticFSVolumeConfig
     */
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return mountConfig
     */
    public MountConfig getMountConfig() {
        return this.mountConfig;
    }

    /**
     * @return ossVolumeConfig
     */
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @return volumeID
     */
    public String getVolumeID() {
        return this.volumeID;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder {
        private AgenticBucketVolumeConfig agenticBucketVolumeConfig; 
        private AgenticFSVolumeConfig agenticFSVolumeConfig; 
        private String createdAt; 
        private MountConfig mountConfig; 
        private OSSVolumeConfig ossVolumeConfig; 
        private String resourceGroupID; 
        private String status; 
        private String statusReason; 
        private String storageClass; 
        private String teamID; 
        private String updatedAt; 
        private String userID; 
        private String volumeID; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(E2BVolume model) {
            this.agenticBucketVolumeConfig = model.agenticBucketVolumeConfig;
            this.agenticFSVolumeConfig = model.agenticFSVolumeConfig;
            this.createdAt = model.createdAt;
            this.mountConfig = model.mountConfig;
            this.ossVolumeConfig = model.ossVolumeConfig;
            this.resourceGroupID = model.resourceGroupID;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.storageClass = model.storageClass;
            this.teamID = model.teamID;
            this.updatedAt = model.updatedAt;
            this.userID = model.userID;
            this.volumeID = model.volumeID;
            this.volumeName = model.volumeName;
        } 

        /**
         * agenticBucketVolumeConfig.
         */
        public Builder agenticBucketVolumeConfig(AgenticBucketVolumeConfig agenticBucketVolumeConfig) {
            this.agenticBucketVolumeConfig = agenticBucketVolumeConfig;
            return this;
        }

        /**
         * <p>The AgenticFS configuration.</p>
         */
        public Builder agenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
            this.agenticFSVolumeConfig = agenticFSVolumeConfig;
            return this;
        }

        /**
         * <p>The time when the volume was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-10T11:05:55Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The mount configuration.</p>
         */
        public Builder mountConfig(MountConfig mountConfig) {
            this.mountConfig = mountConfig;
            return this;
        }

        /**
         * <p>The OSS configuration.</p>
         */
        public Builder ossVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
            this.ossVolumeConfig = ossVolumeConfig;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwxqyrgwabcd</p>
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>CREATING</li>
         * <li>AVAILABLE</li>
         * <li>ERROR</li>
         * <li>DELETING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The reason for the status.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>OSS</li>
         * <li>AGENTIC_FS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>88a4c762-b0ce-4661-9413-578b2309e60f</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The time when the volume was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-10T11:05:55Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>2190856988355929</p>
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        /**
         * <p>The unique identifier of the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>82c8c42e-cf7a-46d0-8b58-9024409c1579</p>
         */
        public Builder volumeID(String volumeID) {
            this.volumeID = volumeID;
            return this;
        }

        /**
         * <p>The name, which is unique within the team.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
         */
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public E2BVolume build() {
            return new E2BVolume(this);
        } 

    } 

    /**
     * 
     * {@link E2BVolume} extends {@link TeaModel}
     *
     * <p>E2BVolume</p>
     */
    public static class VpcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private VpcConfig(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VpcConfig model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The list of vSwitches.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze4l2vyhej6a6dwapm4q</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link E2BVolume} extends {@link TeaModel}
     *
     * <p>E2BVolume</p>
     */
    public static class MountConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("vpcConfig")
        private VpcConfig vpcConfig;

        private MountConfig(Builder builder) {
            this.role = builder.role;
            this.vpcConfig = builder.vpcConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountConfig create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return vpcConfig
         */
        public VpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public static final class Builder {
            private String role; 
            private VpcConfig vpcConfig; 

            private Builder() {
            } 

            private Builder(MountConfig model) {
                this.role = model.role;
                this.vpcConfig = model.vpcConfig;
            } 

            /**
             * <p>The RAM role that the user grants to the sandboxed container. After this role is set, the sandboxed container assumes the role to generate temporary access credentials. You can use the temporary access credentials of this role to mount storage in the sandboxed container, such as OSS and AgenticFS.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1673427197867277:role/aliyunfcdefaultrole</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             */
            public Builder vpcConfig(VpcConfig vpcConfig) {
                this.vpcConfig = vpcConfig;
                return this;
            }

            public MountConfig build() {
                return new MountConfig(this);
            } 

        } 

    }
}
