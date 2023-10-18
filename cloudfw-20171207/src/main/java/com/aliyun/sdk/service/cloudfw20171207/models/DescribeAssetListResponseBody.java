// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetListResponseBody</p>
 */
public class DescribeAssetListResponseBody extends TeaModel {
    @NameInMap("Assets")
    private java.util.List < Assets> assets;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAssetListResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetListResponseBody create() {
        return builder().build();
    }

    /**
     * @return assets
     */
    public java.util.List < Assets> getAssets() {
        return this.assets;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Assets> assets; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details about the assets that are protected by Cloud Firewall.
         */
        public Builder assets(java.util.List < Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the assets that are protected by Cloud Firewall.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAssetListResponseBody build() {
            return new DescribeAssetListResponseBody(this);
        } 

    } 

    public static class Assets extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("BindInstanceId")
        private String bindInstanceId;

        @NameInMap("BindInstanceName")
        private String bindInstanceName;

        @NameInMap("CreateTimeStamp")
        private String createTimeStamp;

        @NameInMap("InternetAddress")
        private String internetAddress;

        @NameInMap("IntranetAddress")
        private String intranetAddress;

        @NameInMap("IpVersion")
        private Integer ipVersion;

        @NameInMap("MemberUid")
        private Long memberUid;

        @NameInMap("Name")
        private String name;

        @NameInMap("NewResourceTag")
        private String newResourceTag;

        @NameInMap("Note")
        private String note;

        @NameInMap("ProtectStatus")
        private String protectStatus;

        @NameInMap("RegionID")
        private String regionID;

        @NameInMap("RegionStatus")
        private String regionStatus;

        @NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SgStatus")
        private String sgStatus;

        @NameInMap("SgStatusTime")
        private Long sgStatusTime;

        @NameInMap("SyncStatus")
        private String syncStatus;

        @NameInMap("Type")
        private String type;

        private Assets(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bindInstanceId = builder.bindInstanceId;
            this.bindInstanceName = builder.bindInstanceName;
            this.createTimeStamp = builder.createTimeStamp;
            this.internetAddress = builder.internetAddress;
            this.intranetAddress = builder.intranetAddress;
            this.ipVersion = builder.ipVersion;
            this.memberUid = builder.memberUid;
            this.name = builder.name;
            this.newResourceTag = builder.newResourceTag;
            this.note = builder.note;
            this.protectStatus = builder.protectStatus;
            this.regionID = builder.regionID;
            this.regionStatus = builder.regionStatus;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceType = builder.resourceType;
            this.riskLevel = builder.riskLevel;
            this.sgStatus = builder.sgStatus;
            this.sgStatusTime = builder.sgStatusTime;
            this.syncStatus = builder.syncStatus;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bindInstanceId
         */
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        /**
         * @return bindInstanceName
         */
        public String getBindInstanceName() {
            return this.bindInstanceName;
        }

        /**
         * @return createTimeStamp
         */
        public String getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        /**
         * @return internetAddress
         */
        public String getInternetAddress() {
            return this.internetAddress;
        }

        /**
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        /**
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return memberUid
         */
        public Long getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newResourceTag
         */
        public String getNewResourceTag() {
            return this.newResourceTag;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return protectStatus
         */
        public String getProtectStatus() {
            return this.protectStatus;
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        /**
         * @return regionStatus
         */
        public String getRegionStatus() {
            return this.regionStatus;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sgStatus
         */
        public String getSgStatus() {
            return this.sgStatus;
        }

        /**
         * @return sgStatusTime
         */
        public Long getSgStatusTime() {
            return this.sgStatusTime;
        }

        /**
         * @return syncStatus
         */
        public String getSyncStatus() {
            return this.syncStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long aliUid; 
            private String bindInstanceId; 
            private String bindInstanceName; 
            private String createTimeStamp; 
            private String internetAddress; 
            private String intranetAddress; 
            private Integer ipVersion; 
            private Long memberUid; 
            private String name; 
            private String newResourceTag; 
            private String note; 
            private String protectStatus; 
            private String regionID; 
            private String regionStatus; 
            private String resourceInstanceId; 
            private String resourceType; 
            private String riskLevel; 
            private String sgStatus; 
            private Long sgStatusTime; 
            private String syncStatus; 
            private String type; 

            /**
             * The UID of the Alibaba Cloud account.
             * <p>
             * 
             * >  The value of this parameter indicates the management account to which the member is added.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The ID of the cloud resource with which the asset is associated.
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * The instance name of the asset.
             */
            public Builder bindInstanceName(String bindInstanceName) {
                this.bindInstanceName = bindInstanceName;
                return this;
            }

            /**
             * The timestamp when the asset is added to Cloud Firewall.
             */
            public Builder createTimeStamp(String createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * The internal IP address of the server.
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * The IP version of the asset that is protected by Cloud Firewall.
             * <p>
             * 
             * Valid values:
             * 
             * *   **4**: IPv4
             * *   **6**: IPv6
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The UID of the member.
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The instance name of the asset that is protected by Cloud Firewall.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The time when the asset was added. Valid values:
             * <p>
             * 
             * *   **discovered in 1 hour**: within one hour.
             * *   **discovered in 1 day**: within one day.
             * *   **discovered in 7 days**: within seven days.
             */
            public Builder newResourceTag(String newResourceTag) {
                this.newResourceTag = newResourceTag;
                return this;
            }

            /**
             * The remarks of the asset. Valid values:
             * <p>
             * 
             * *   **REGION_NOT_SUPPORT**: The region is not supported.
             * *   **NETWORK_NOT_SUPPORT**: The network is not supported.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * The status of the firewall. Valid values:
             * <p>
             * 
             * *   **open**: enabled.
             * *   **opening**: being enabled.
             * *   **closed**: disabled.
             * *   **closing**: being disabled.
             */
            public Builder protectStatus(String protectStatus) {
                this.protectStatus = protectStatus;
                return this;
            }

            /**
             * The ID of the region in which the asset resides.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * Indicates whether the firewall is supported in the region in which the asset resides. Valid values:
             * <p>
             * 
             * *   **enable**: yes
             * *   **disable**: no
             */
            public Builder regionStatus(String regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            /**
             * The instance ID of the asset.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **BastionHostEgressIP**: the egress IP address of a bastion host
             * *   **BastionHostIngressIP**: the ingress IP address of a bastion host
             * *   **EcsEIP**: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance
             * *   **EcsPublicIP**: the public IP address of an ECS instance
             * *   **EIP**: the EIP
             * *   **EniEIP**: the EIP of an elastic network interface (ENI)
             * *   **NatEIP**: the EIP of a NAT gateway
             * *   **SlbEIP**: the EIP of a Server Load Balancer (SLB) instance
             * *   **SlbPublicIP**: the public IP address of an SLB instance
             * *   **NatPublicIP**: the public IP address of a NAT gateway
             * *   **HAVIP**: the high-availability virtual IP address (HAVIP)
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The risk level of the asset. Valid values:
             * <p>
             * 
             * *   **low**: low
             * *   **middle**: medium
             * *   **hight**: high
             * 
             * >  The value of this parameter is returned only when the UserType parameter is set to free.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The status of the security group policy. Valid values:
             * <p>
             * 
             * *   **pass**: applied
             * *   **block**: not applied
             * *   **unsupport**: unsupported
             */
            public Builder sgStatus(String sgStatus) {
                this.sgStatus = sgStatus;
                return this;
            }

            /**
             * The time when the status of the security group was last checked. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder sgStatusTime(Long sgStatusTime) {
                this.sgStatusTime = sgStatusTime;
                return this;
            }

            /**
             * Indicates whether traffic redirection is supported for the asset. Valid values:
             * <p>
             * 
             * *   **enable**: yes
             * *   **disable**: no
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
