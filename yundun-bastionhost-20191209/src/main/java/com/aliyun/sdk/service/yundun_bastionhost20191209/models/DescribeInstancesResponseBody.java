// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInstancesResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of the bastion hosts returned.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>61D36C55-AAFC-4678-8FAD-34FEF9E7182E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of bastion hosts that are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandWidth")
        private Long bandWidth;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
        private String internetEndpoint;

        @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("Legacy")
        private Boolean legacy;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("PlanCode")
        private String planCode;

        @com.aliyun.core.annotation.NameInMap("PublicNetworkAccess")
        private Boolean publicNetworkAccess;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SlaveVswitchId")
        private String slaveVswitchId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Instances(Builder builder) {
            this.bandWidth = builder.bandWidth;
            this.description = builder.description;
            this.expireTime = builder.expireTime;
            this.imageVersion = builder.imageVersion;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.internetEndpoint = builder.internetEndpoint;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.legacy = builder.legacy;
            this.licenseCode = builder.licenseCode;
            this.planCode = builder.planCode;
            this.publicNetworkAccess = builder.publicNetworkAccess;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.slaveVswitchId = builder.slaveVswitchId;
            this.startTime = builder.startTime;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return bandWidth
         */
        public Long getBandWidth() {
            return this.bandWidth;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return internetEndpoint
         */
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        /**
         * @return intranetEndpoint
         */
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return legacy
         */
        public Boolean getLegacy() {
            return this.legacy;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
        }

        /**
         * @return planCode
         */
        public String getPlanCode() {
            return this.planCode;
        }

        /**
         * @return publicNetworkAccess
         */
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return slaveVswitchId
         */
        public String getSlaveVswitchId() {
            return this.slaveVswitchId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
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
            private Long bandWidth; 
            private String description; 
            private Long expireTime; 
            private String imageVersion; 
            private String instanceId; 
            private String instanceStatus; 
            private String internetEndpoint; 
            private String intranetEndpoint; 
            private Boolean legacy; 
            private String licenseCode; 
            private String planCode; 
            private Boolean publicNetworkAccess; 
            private String regionId; 
            private String resourceGroupId; 
            private String slaveVswitchId; 
            private Long startTime; 
            private String vpcId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.bandWidth = model.bandWidth;
                this.description = model.description;
                this.expireTime = model.expireTime;
                this.imageVersion = model.imageVersion;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.internetEndpoint = model.internetEndpoint;
                this.intranetEndpoint = model.intranetEndpoint;
                this.legacy = model.legacy;
                this.licenseCode = model.licenseCode;
                this.planCode = model.planCode;
                this.publicNetworkAccess = model.publicNetworkAccess;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.slaveVswitchId = model.slaveVswitchId;
                this.startTime = model.startTime;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * BandWidth.
             */
            public Builder bandWidth(Long bandWidth) {
                this.bandWidth = bandWidth;
                return this;
            }

            /**
             * <p>The remarks of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>Test API</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The timestamp when the bastion host expires. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1578326400000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The image version of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>3.0.0</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>The bastion host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost-cn-78v1gh****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the bastion host. Valid values:</p>
             * <ul>
             * <li><strong>PENDING</strong>: The bastion host is not initialized.</li>
             * <li><strong>CREATING</strong>: The bastion host is being created.</li>
             * <li><strong>RUNNING</strong>: The bastion host is running.</li>
             * <li><strong>EXPIRED</strong>: The bastion host expired.</li>
             * <li><strong>CREATE_FAILED</strong>: The bastion host fails to be created.</li>
             * <li><strong>UPGRADING</strong>: The configurations of the bastion host are being changed.</li>
             * <li><strong>UPGRADE_FAILED</strong>: The configurations of the bastion host fail to be changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The public O&amp;M address of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>drawvxalwb-public.bastionhost.aliyuncs.com</p>
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * <p>The private O&amp;M address of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>drawvxalwb.bastionhost.aliyuncs.com</p>
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * <p>Indicates whether the bastion host runs an earlier version. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The bastion host runs V2 or V3.1.</li>
             * <li><strong>false</strong>: The bastion host runs V3.2.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * <p>The license code of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>bhah_ent_50_asset</p>
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * <p>The edition of the bastion host. Valid values:</p>
             * <ul>
             * <li><strong>cloudbastion</strong>: Basic Edition.</li>
             * <li><strong>cloudbastion_ha</strong>: Enterprise Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloudbastion_ha</p>
             */
            public Builder planCode(String planCode) {
                this.planCode = planCode;
                return this;
            }

            /**
             * <p>Indicates whether the bastion host can be accessed from the Internet. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicNetworkAccess(Boolean publicNetworkAccess) {
                this.publicNetworkAccess = publicNetworkAccess;
                return this;
            }

            /**
             * <p>The region ID of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the bastion host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>g-acfm26ougi****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SlaveVswitchId.
             */
            public Builder slaveVswitchId(String slaveVswitchId) {
                this.slaveVswitchId = slaveVswitchId;
                return this;
            }

            /**
             * <p>The timestamp when the bastion host is purchased or renewed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1577681345000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the bastion host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1c85tzgqu1bf5b****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the bastion host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1xfwzzfti0kjbf****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
