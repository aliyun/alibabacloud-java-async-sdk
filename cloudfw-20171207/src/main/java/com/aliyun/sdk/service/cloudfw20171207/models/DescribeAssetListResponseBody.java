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
         * <p>The information about assets protected by Cloud Firewall.</p>
         */
        public Builder assets(java.util.List<Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of assets protected by Cloud Firewall.</p>
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
        @Deprecated
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
             * <p>The primary account of the Cloud Firewall member account.</p>
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
             * <p>The ID of the bound asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdrjrxzt78****</p>
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * <p>The name of the bound asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance01</p>
             */
            public Builder bindInstanceName(String bindInstanceName) {
                this.bindInstanceName = bindInstanceName;
                return this;
            }

            /**
             * <p>The time when Cloud Firewall discovered the asset. Time format: YYYY-MM-DD HH:mm:ss.</p>
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
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The IP address version of the asset protected by Cloud Firewall.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p><strong>4</strong>: Indicates an IPv4 address.</p>
             * </li>
             * <li><p><strong>6</strong>: Indicates an IPv6 address.</p>
             * </li>
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
             * <p>The outbound traffic in the last 7 days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder last7DayOutTrafficBytes(Long last7DayOutTrafficBytes) {
                this.last7DayOutTrafficBytes = last7DayOutTrafficBytes;
                return this;
            }

            /**
             * <p>The UID of the Cloud Firewall member account.</p>
             * 
             * <strong>example:</strong>
             * <p>258039427902****</p>
             */
            public Builder memberUid(Long memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The instance name of the asset protected by Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>instance01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the asset was discovered. Valid values:</p>
             * <ul>
             * <li><strong>discovered in 1 hour</strong>: The asset was discovered within 1 hour.</li>
             * <li><strong>discovered in 1 day</strong>: The asset was discovered within 1 day.</li>
             * <li><strong>discovered in 7 days</strong>: The asset was discovered within 7 days.</li>
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
             * <li><strong>REGION_NOT_SUPPORT</strong>: Region not supported.</li>
             * <li><strong>NETWORK_NOT_SUPPORT</strong>: Network not supported.</li>
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
             * <p>The firewall status. Valid values:</p>
             * <ul>
             * <li><strong>open</strong>: Protected.</li>
             * <li><strong>opening</strong>: Protection enabling.</li>
             * <li><strong>closed</strong>: Not protected.</li>
             * <li><strong>closing</strong>: Protection disabling.</li>
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
             * <p>The region ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            /**
             * <p>Indicates whether the region of the asset supports enabling Cloud Firewall protection. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: Supported.</li>
             * <li><strong>disable</strong>: Not supported.</li>
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
             * <p>The asset instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbdrjrxzt78****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The asset type. Valid values:</p>
             * <ul>
             * <li><strong>BastionHostEgressIP</strong>: Bastion host egress IP.</li>
             * <li><strong>BastionHostIngressIP</strong>: Bastion host ingress IP.</li>
             * <li><strong>EcsEIP</strong>: ECS EIP.</li>
             * <li><strong>EcsPublicIP</strong>: ECS public IP.</li>
             * <li><strong>EIP</strong>: Elastic IP address.</li>
             * <li><strong>EniEIP</strong>: Elastic network interface EIP.</li>
             * <li><strong>NatEIP</strong>: NAT EIP.</li>
             * <li><strong>SlbEIP</strong>: SLB EIP (CLB EIP).</li>
             * <li><strong>SlbPublicIP</strong>: SLB public IP (CLB public IP).</li>
             * <li><strong>NatPublicIP</strong>: NAT public IP.</li>
             * <li><strong>HAVIP</strong>: High-availability virtual IP.</li>
             * <li><strong>NlbEIP</strong>: NLB EIP.</li>
             * <li><strong>ApiGatewayEIP</strong>: API Gateway public IP.</li>
             * <li><strong>AlbEIP</strong>: ALB EIP.</li>
             * <li><strong>AiGatewayEIP</strong>: AI Gateway public IP.</li>
             * <li><strong>GaEIP</strong>: GA EIP.</li>
             * <li><strong>SwasEIP</strong>: Simple Application Server public IP.</li>
             * <li><strong>EcdEIP</strong>: Elastic Desktop Service public IP.</li>
             * <li><strong>BastionHostIP</strong>: Bastion host IP.</li>
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
             * <li><p><strong>low</strong>: Low risk.</p>
             * </li>
             * <li><p><strong>middle</strong>: Medium risk.</p>
             * </li>
             * <li><p><strong>hight</strong>: High risk.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only when the value of UserType is free.</p>
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
             * <p>The status of data leakage detection.</p>
             * 
             * <strong>example:</strong>
             * <p>open</p>
             */
            public Builder sensitiveDataStatus(String sensitiveDataStatus) {
                this.sensitiveDataStatus = sensitiveDataStatus;
                return this;
            }

            /**
             * <p>The security group policy. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: Delivered.</li>
             * <li><strong>block</strong>: Not delivered.</li>
             * <li><strong>unsupport</strong>: Not supported.</li>
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
             * <p>The last security group status detection time, in timestamp format. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1615082937</p>
             */
            public Builder sgStatusTime(Long sgStatusTime) {
                this.sgStatusTime = sgStatusTime;
                return this;
            }

            /**
             * <p>The traffic diversion support status of the asset. Valid values:</p>
             * <ul>
             * <li><strong>enable</strong>: Traffic diversion supported.</li>
             * <li><strong>disable</strong>: Traffic diversion not supported.</li>
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
