// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CreateVolumeInput} extends {@link TeaModel}
 *
 * <p>CreateVolumeInput</p>
 */
public class CreateVolumeInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticBucketVolumeConfig")
    private AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("agenticFSVolumeConfig")
    private AgenticFSVolumeConfig agenticFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("juiceFSVolumeConfig")
    private JuiceFSVolumeConfig juiceFSVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("mountConfig")
    private MountConfig mountConfig;

    @com.aliyun.core.annotation.NameInMap("ossVolumeConfig")
    private OSSVolumeConfig ossVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private CreateVolumeInput(Builder builder) {
        this.agenticBucketVolumeConfig = builder.agenticBucketVolumeConfig;
        this.agenticFSVolumeConfig = builder.agenticFSVolumeConfig;
        this.juiceFSVolumeConfig = builder.juiceFSVolumeConfig;
        this.mountConfig = builder.mountConfig;
        this.ossVolumeConfig = builder.ossVolumeConfig;
        this.teamID = builder.teamID;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVolumeInput create() {
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
     * @return juiceFSVolumeConfig
     */
    public JuiceFSVolumeConfig getJuiceFSVolumeConfig() {
        return this.juiceFSVolumeConfig;
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
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
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
        private JuiceFSVolumeConfig juiceFSVolumeConfig; 
        private MountConfig mountConfig; 
        private OSSVolumeConfig ossVolumeConfig; 
        private String teamID; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(CreateVolumeInput model) {
            this.agenticBucketVolumeConfig = model.agenticBucketVolumeConfig;
            this.agenticFSVolumeConfig = model.agenticFSVolumeConfig;
            this.juiceFSVolumeConfig = model.juiceFSVolumeConfig;
            this.mountConfig = model.mountConfig;
            this.ossVolumeConfig = model.ossVolumeConfig;
            this.teamID = model.teamID;
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
         * agenticFSVolumeConfig.
         */
        public Builder agenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
            this.agenticFSVolumeConfig = agenticFSVolumeConfig;
            return this;
        }

        /**
         * juiceFSVolumeConfig.
         */
        public Builder juiceFSVolumeConfig(JuiceFSVolumeConfig juiceFSVolumeConfig) {
            this.juiceFSVolumeConfig = juiceFSVolumeConfig;
            return this;
        }

        /**
         * mountConfig.
         */
        public Builder mountConfig(MountConfig mountConfig) {
            this.mountConfig = mountConfig;
            return this;
        }

        /**
         * ossVolumeConfig.
         */
        public Builder ossVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
            this.ossVolumeConfig = ossVolumeConfig;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * volumeName.
         */
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public CreateVolumeInput build() {
            return new CreateVolumeInput(this);
        } 

    } 

    /**
     * 
     * {@link CreateVolumeInput} extends {@link TeaModel}
     *
     * <p>CreateVolumeInput</p>
     */
    public static class AgenticFSVolumeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupID")
        private Integer groupID;

        @com.aliyun.core.annotation.NameInMap("serverAddr")
        private String serverAddr;

        @com.aliyun.core.annotation.NameInMap("userID")
        private Integer userID;

        private AgenticFSVolumeConfig(Builder builder) {
            this.groupID = builder.groupID;
            this.serverAddr = builder.serverAddr;
            this.userID = builder.userID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgenticFSVolumeConfig create() {
            return builder().build();
        }

        /**
         * @return groupID
         */
        public Integer getGroupID() {
            return this.groupID;
        }

        /**
         * @return serverAddr
         */
        public String getServerAddr() {
            return this.serverAddr;
        }

        /**
         * @return userID
         */
        public Integer getUserID() {
            return this.userID;
        }

        public static final class Builder {
            private Integer groupID; 
            private String serverAddr; 
            private Integer userID; 

            private Builder() {
            } 

            private Builder(AgenticFSVolumeConfig model) {
                this.groupID = model.groupID;
                this.serverAddr = model.serverAddr;
                this.userID = model.userID;
            } 

            /**
             * groupID.
             */
            public Builder groupID(Integer groupID) {
                this.groupID = groupID;
                return this;
            }

            /**
             * serverAddr.
             */
            public Builder serverAddr(String serverAddr) {
                this.serverAddr = serverAddr;
                return this;
            }

            /**
             * userID.
             */
            public Builder userID(Integer userID) {
                this.userID = userID;
                return this;
            }

            public AgenticFSVolumeConfig build() {
                return new AgenticFSVolumeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVolumeInput} extends {@link TeaModel}
     *
     * <p>CreateVolumeInput</p>
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
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * vSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * vpcId.
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
     * {@link CreateVolumeInput} extends {@link TeaModel}
     *
     * <p>CreateVolumeInput</p>
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
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * vpcConfig.
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
