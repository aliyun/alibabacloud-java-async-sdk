// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
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
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of the queried bastion hosts.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of bastion hosts that are queried.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InternetEndpoint")
        private String internetEndpoint;

        @NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @NameInMap("Legacy")
        private Boolean legacy;

        @NameInMap("LicenseCode")
        private String licenseCode;

        @NameInMap("PlanCode")
        private String planCode;

        @NameInMap("PublicNetworkAccess")
        private Boolean publicNetworkAccess;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private Instances(Builder builder) {
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
            private Long startTime; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * The description of the bastion host.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The timestamp when the bastion host expires. Unit: milliseconds.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The image version of the bastion host.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * The ID of the bastion host.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The state of the bastion host. Valid values:
             * <p>
             * 
             * *   **PENDING**: The bastion host is not initialized.
             * *   **CREATING**: The bastion host is being created.
             * *   **RUNNING**: The bastion host is running.
             * *   **EXPIRED**: The bastion host expired.
             * *   **CREATE_FAILED**: The bastion host fails to be created.
             * *   **UPGRADING**: The configurations of the bastion host are being changed.
             * *   **UPGRADE_FAILED**: The configurations of the bastion host fail to be changed.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The public O\&M address of the bastion host.
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * The private O\&M address of the bastion host.
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * Indicates whether the bastion host runs an earlier version. Valid values:
             * <p>
             * 
             * *   **true**: indicates that the bastion host runs V2 or V3.1.
             * *   **false**:indicates that the bastion host runs V3.2.
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * The license code of the bastion host.
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * The edition of the bastion host. Valid values:
             * <p>
             * 
             * *   **cloudbastion**: Basic
             * *   **cloudbastion_ha**: Enterprise
             */
            public Builder planCode(String planCode) {
                this.planCode = planCode;
                return this;
            }

            /**
             * Indicates whether the bastion host can be accessed from the Internet. Valid values:
             * <p>
             * 
             * *   **true**: The bastion host can be accessed from the Internet.
             * *   **false**: The bastion host cannot be accessed from the Internet.
             */
            public Builder publicNetworkAccess(Boolean publicNetworkAccess) {
                this.publicNetworkAccess = publicNetworkAccess;
                return this;
            }

            /**
             * The region ID of the bastion host.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the bastion host belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The timestamp when the bastion host is purchased or renewed. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the bastion host belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch to which the bastion host belongs.
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
