// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAssetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetListResponseBody</p>
 */
public class DescribeAssetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List<Assets> assets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assets
     */
    public java.util.List<Assets> getAssets() {
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
        private java.util.List<Assets> assets; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAssetListResponseBody model) {
            this.assets = model.assets;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The assets that are protected by Cloud Firewall.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the assets that are protected by Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAssetListResponseBody build() {
            return new DescribeAssetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetListResponseBody</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BindInstanceId")
        private String bindInstanceId;

        @com.aliyun.core.annotation.NameInMap("BindInstanceName")
        private String bindInstanceName;

        @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
        private String createTimeStamp;

        @com.aliyun.core.annotation.NameInMap("InternetAddress")
        private String internetAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        @com.aliyun.core.annotation.NameInMap("Last7DayOutTrafficBytes")
        private Long last7DayOutTrafficBytes;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private Long memberUid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewResourceTag")
        private String newResourceTag;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("ProtectStatus")
        private String protectStatus;

        @com.aliyun.core.annotation.NameInMap("RegionID")
        private String regionID;

        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private String regionStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveDataStatus")
        private String sensitiveDataStatus;

        @com.aliyun.core.annotation.NameInMap("SgStatus")
        private String sgStatus;

        @com.aliyun.core.annotation.NameInMap("SgStatusTime")
        private Long sgStatusTime;

        @com.aliyun.core.annotation.NameInMap("SyncStatus")
        private String syncStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Assets(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bindInstanceId = builder.bindInstanceId;
            this.bindInstanceName = builder.bindInstanceName;
            this.createTimeStamp = builder.createTimeStamp;
            this.internetAddress = builder.internetAddress;
            this.intranetAddress = builder.intranetAddress;
            this.ipVersion = builder.ipVersion;
            this.last7DayOutTrafficBytes = builder.last7DayOutTrafficBytes;
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
            this.sensitiveDataStatus = builder.sensitiveDataStatus;
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
         * @return last7DayOutTrafficBytes
         */
        public Long getLast7DayOutTrafficBytes() {
            return this.last7DayOutTrafficBytes;
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
         * @return sensitiveDataStatus
         */
        public String getSensitiveDataStatus() {
            return this.sensitiveDataStatus;
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
            private Long last7DayOutTrafficBytes; 
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
            private String sensitiveDataStatus; 
            private String sgStatus; 
            private Long sgStatusTime; 
            private String syncStatus; 
            private String type; 

            private Builder() {
            } 

            private Builder(Assets model) {
                this.aliUid = model.aliUid;
                this.bindInstanceId = model.bindInstanceId;
                this.bindInstanceName = model.bindInstanceName;
                this.createTimeStamp = model.createTimeStamp;
                this.internetAddress = model.internetAddress;
                this.intranetAddress = model.intranetAddress;
                this.ipVersion = model.ipVersion;
                this.last7DayOutTrafficBytes = model.last7DayOutTrafficBytes;
                this.memberUid = model.memberUid;
                this.name = model.name;
                this.newResourceTag = model.newResourceTag;
                this.note = model.note;
                this.protectStatus = model.protectStatus;
                this.regionID = model.regionID;
                this.regionStatus = model.regionStatus;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceType = model.resourceType;
                this.riskLevel = model.riskLevel;
                this.sensitiveDataStatus = model.sensitiveDataStatus;
                this.sgStatus = model.sgStatus;
                this.sgStatusTime = model.sgStatusTime;
                this.syncStatus = model.syncStatus;
                this.type = model.type;
            } 

            /**
             * <p>The UID of the Alibaba Cloud account.</p>
             * <blockquote>
             * <p> The value of this parameter indicates the management account to which the member is added.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>158039427902****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the cloud resource with which the asset is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdrjrxzt78****</p>
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * <p>The instance name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>instance01</p>
             */
            public Builder bindInstanceName(String bindInstanceName) {
                this.bindInstanceName = bindInstanceName;
                return this;
            }

            /**
             * <p>The timestamp when the asset is added to Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-28 10:29:58</p>
             */
            public Builder createTimeStamp(String createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * <p>The internal IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The IP version of the asset that is protected by Cloud Firewall.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>4</strong>: IPv4</li>
             * <li><strong>6</strong>: IPv6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>Outbound traffic in the last 7 days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder last7DayOutTrafficBytes(Long last7DayOutTrafficBytes) {
                this.last7DayOutTrafficBytes = last7DayOutTrafficBytes;
                return this;
            }

            /**
             * <p>The UID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The instance name of the asset that is protected by Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>instance01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the asset was added. Valid values:</p>
             * <ul>
             * <li><strong>discovered in 1 hour</strong>: within one hour.</li>
             * <li><strong>discovered in 1 day</strong>: within one day.</li>
             * <li><strong>discovered in 7 days</strong>: within seven days.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>discovered in 1 hour</p>
             */
            public Builder newResourceTag(String newResourceTag) {
                this.newResourceTag = newResourceTag;
                return this;
            }

            /**
             * <p>The remarks of the asset. Valid values:</p>
             * <ul>
             * <li><strong>REGION_NOT_SUPPORT</strong>: The region is not supported.</li>
             * <li><strong>NETWORK_NOT_SUPPORT</strong>: The network is not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGION_NOT_SUPPORT</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The status of the firewall. Valid values:</p>
             * <ul>
             * <li><strong>open</strong>: enabled.</li>
             * <li><strong>opening</strong>: being enabled.</li>
             * <li><strong>closed</strong>: disabled.</li>
             * <li><strong>closing</strong>: being disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder protectStatus(String protectStatus) {
                this.protectStatus = protectStatus;
                return this;
            }

            /**
             * <p>The ID of the region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * <p>Indicates whether the firewall is supported in the region in which the asset resides. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: yes</li>
             * <li><strong>disable</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder regionStatus(String regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdrjrxzt78****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>BastionHostEgressIP</strong>: the egress IP address of a bastion host</li>
             * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
             * <li><strong>EcsEIP</strong>: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
             * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
             * <li><strong>EIP</strong>: the EIP</li>
             * <li><strong>EniEIP</strong>: the EIP of an elastic network interface (ENI)</li>
             * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
             * <li><strong>SlbEIP</strong>: the EIP of a Server Load Balancer (SLB) instance</li>
             * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance</li>
             * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
             * <li><strong>HAVIP</strong>: the high-availability virtual IP address (HAVIP)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EIP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The risk level of the asset. Valid values:</p>
             * <ul>
             * <li><strong>low</strong>: low</li>
             * <li><strong>middle</strong>: medium</li>
             * <li><strong>hight</strong>: high</li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter is returned only when the UserType parameter is set to free.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Data leakage detection enabled status.</p>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder sensitiveDataStatus(String sensitiveDataStatus) {
                this.sensitiveDataStatus = sensitiveDataStatus;
                return this;
            }

            /**
             * <p>The status of the security group policy. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: applied</li>
             * <li><strong>block</strong>: not applied</li>
             * <li><strong>unsupport</strong>: unsupported</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder sgStatus(String sgStatus) {
                this.sgStatus = sgStatus;
                return this;
            }

            /**
             * <p>The time when the status of the security group was last checked. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615082937</p>
             */
            public Builder sgStatusTime(Long sgStatusTime) {
                this.sgStatusTime = sgStatusTime;
                return this;
            }

            /**
             * <p>Indicates whether traffic redirection is supported for the asset. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: yes</li>
             * <li><strong>disable</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder syncStatus(String syncStatus) {
                this.syncStatus = syncStatus;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>eip</p>
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
