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
 * {@link DescribeOutgoingAssetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingAssetListResponseBody</p>
 */
public class DescribeOutgoingAssetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List<AssetList> assetList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOutgoingAssetListResponseBody(Builder builder) {
        this.assetList = builder.assetList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutgoingAssetListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetList
     */
    public java.util.List<AssetList> getAssetList() {
        return this.assetList;
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
        private java.util.List<AssetList> assetList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOutgoingAssetListResponseBody model) {
            this.assetList = model.assetList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of assets.</p>
         */
        public Builder assetList(java.util.List<AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A515672-FAAE-584F-B51C-B2586E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOutgoingAssetListResponseBody build() {
            return new DescribeOutgoingAssetListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutgoingAssetListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutgoingAssetListResponseBody</p>
     */
    public static class AssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetInstanceId")
        private String assetInstanceId;

        @com.aliyun.core.annotation.NameInMap("AssetInstanceName")
        private String assetInstanceName;

        @com.aliyun.core.annotation.NameInMap("AssetsRegion")
        private String assetsRegion;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("IpsHitCnt")
        private Long ipsHitCnt;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("OutgoingDomainCnt")
        private Long outgoingDomainCnt;

        @com.aliyun.core.annotation.NameInMap("OutgoingDstIPCnt")
        private Long outgoingDstIPCnt;

        @com.aliyun.core.annotation.NameInMap("PrivateIP")
        private String privateIP;

        @com.aliyun.core.annotation.NameInMap("PrivateIPList")
        private java.util.List<String> privateIPList;

        @com.aliyun.core.annotation.NameInMap("PublicIP")
        private String publicIP;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SecurityRisk")
        private String securityRisk;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        private AssetList(Builder builder) {
            this.assetInstanceId = builder.assetInstanceId;
            this.assetInstanceName = builder.assetInstanceName;
            this.assetsRegion = builder.assetsRegion;
            this.groupName = builder.groupName;
            this.inBytes = builder.inBytes;
            this.ipsHitCnt = builder.ipsHitCnt;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.outBytes = builder.outBytes;
            this.outgoingDomainCnt = builder.outgoingDomainCnt;
            this.outgoingDstIPCnt = builder.outgoingDstIPCnt;
            this.privateIP = builder.privateIP;
            this.privateIPList = builder.privateIPList;
            this.publicIP = builder.publicIP;
            this.resourceType = builder.resourceType;
            this.securityRisk = builder.securityRisk;
            this.sessionCount = builder.sessionCount;
            this.totalBytes = builder.totalBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetList create() {
            return builder().build();
        }

        /**
         * @return assetInstanceId
         */
        public String getAssetInstanceId() {
            return this.assetInstanceId;
        }

        /**
         * @return assetInstanceName
         */
        public String getAssetInstanceName() {
            return this.assetInstanceName;
        }

        /**
         * @return assetsRegion
         */
        public String getAssetsRegion() {
            return this.assetsRegion;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return ipsHitCnt
         */
        public Long getIpsHitCnt() {
            return this.ipsHitCnt;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return outgoingDomainCnt
         */
        public Long getOutgoingDomainCnt() {
            return this.outgoingDomainCnt;
        }

        /**
         * @return outgoingDstIPCnt
         */
        public Long getOutgoingDstIPCnt() {
            return this.outgoingDstIPCnt;
        }

        /**
         * @return privateIP
         */
        public String getPrivateIP() {
            return this.privateIP;
        }

        /**
         * @return privateIPList
         */
        public java.util.List<String> getPrivateIPList() {
            return this.privateIPList;
        }

        /**
         * @return publicIP
         */
        public String getPublicIP() {
            return this.publicIP;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return securityRisk
         */
        public String getSecurityRisk() {
            return this.securityRisk;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        public static final class Builder {
            private String assetInstanceId; 
            private String assetInstanceName; 
            private String assetsRegion; 
            private String groupName; 
            private Long inBytes; 
            private Long ipsHitCnt; 
            private String natGatewayId; 
            private String natGatewayName; 
            private Long outBytes; 
            private Long outgoingDomainCnt; 
            private Long outgoingDstIPCnt; 
            private String privateIP; 
            private java.util.List<String> privateIPList; 
            private String publicIP; 
            private String resourceType; 
            private String securityRisk; 
            private Long sessionCount; 
            private Long totalBytes; 

            private Builder() {
            } 

            private Builder(AssetList model) {
                this.assetInstanceId = model.assetInstanceId;
                this.assetInstanceName = model.assetInstanceName;
                this.assetsRegion = model.assetsRegion;
                this.groupName = model.groupName;
                this.inBytes = model.inBytes;
                this.ipsHitCnt = model.ipsHitCnt;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.outBytes = model.outBytes;
                this.outgoingDomainCnt = model.outgoingDomainCnt;
                this.outgoingDstIPCnt = model.outgoingDstIPCnt;
                this.privateIP = model.privateIP;
                this.privateIPList = model.privateIPList;
                this.publicIP = model.publicIP;
                this.resourceType = model.resourceType;
                this.securityRisk = model.securityRisk;
                this.sessionCount = model.sessionCount;
                this.totalBytes = model.totalBytes;
            } 

            /**
             * <p>The ID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vbcmllue4d94nto****</p>
             */
            public Builder assetInstanceId(String assetInstanceId) {
                this.assetInstanceId = assetInstanceId;
                return this;
            }

            /**
             * <p>The name of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder assetInstanceName(String assetInstanceName) {
                this.assetInstanceName = assetInstanceName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder assetsRegion(String assetsRegion) {
                this.assetsRegion = assetsRegion;
                return this;
            }

            /**
             * <p>The follow status.</p>
             * 
             * <strong>example:</strong>
             * <p>subscribe</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The inbound traffic, which is the response traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>244438</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The number of IPS hits.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ipsHitCnt(Long ipsHitCnt) {
                this.ipsHitCnt = ipsHitCnt;
                return this;
            }

            /**
             * <p>The ID of the NAT Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-bp1utx6wj4x9qu9tl****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The name of the NAT Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-test</p>
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * <p>The outbound traffic, which is the request traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The number of outbound domains.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder outgoingDomainCnt(Long outgoingDomainCnt) {
                this.outgoingDomainCnt = outgoingDomainCnt;
                return this;
            }

            /**
             * <p>The number of outbound destination IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder outgoingDstIPCnt(Long outgoingDstIPCnt) {
                this.outgoingDstIPCnt = outgoingDstIPCnt;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.21.242XXX</p>
             */
            public Builder privateIP(String privateIP) {
                this.privateIP = privateIP;
                return this;
            }

            /**
             * <p>The list of private IP addresses.</p>
             */
            public Builder privateIPList(java.util.List<String> privateIPList) {
                this.privateIPList = privateIPList;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.96.181.XXX</p>
             */
            public Builder publicIP(String publicIP) {
                this.publicIP = publicIP;
                return this;
            }

            /**
             * <p>The type of the public IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The security risk.</p>
             * 
             * <strong>example:</strong>
             * <p>risk</p>
             */
            public Builder securityRisk(String securityRisk) {
                this.securityRisk = securityRisk;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>12498767</p>
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            public AssetList build() {
                return new AssetList(this);
            } 

        } 

    }
}
