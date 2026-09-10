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
 * {@link CreateVolumeInput} extends {@link TeaModel}
 *
 * <p>CreateVolumeInput</p>
 */
public class CreateVolumeInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agenticBucketVolumeConfig")
    private AgenticBucketVolumeConfig agenticBucketVolumeConfig;

    @com.aliyun.core.annotation.NameInMap("agenticFSVolumeConfig")
    private AgenticFSVolumeConfig agenticFSVolumeConfig;

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
        private MountConfig mountConfig; 
        private OSSVolumeConfig ossVolumeConfig; 
        private String teamID; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(CreateVolumeInput model) {
            this.agenticBucketVolumeConfig = model.agenticBucketVolumeConfig;
            this.agenticFSVolumeConfig = model.agenticFSVolumeConfig;
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
         * <p>The AgenticFS configuration.</p>
         */
        public Builder agenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
            this.agenticFSVolumeConfig = agenticFSVolumeConfig;
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
         * <p>The unique identifier of the team.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The name, which must be unique within the team.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace</p>
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
             * <p>sg-xxxxxxx</p>
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
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbq8hbepimf6lr7uyqub</p>
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
             * <p>The RAM role that the user grants to the cloud sandbox. After this role is set, the cloud sandbox assumes the role to generate temporary access credentials. You can use the temporary access credentials of this role to mount storage in the cloud sandbox, such as OSS and AgenticFS.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1338904783509062:role/aliyunfcdefaultrole</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The VPC configuration.</p>
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
