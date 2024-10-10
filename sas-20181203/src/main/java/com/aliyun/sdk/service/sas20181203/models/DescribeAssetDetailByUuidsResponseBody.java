// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAssetDetailByUuidsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetDetailByUuidsResponseBody</p>
 */
public class DescribeAssetDetailByUuidsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List < AssetList> assetList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAssetDetailByUuidsResponseBody(Builder builder) {
        this.assetList = builder.assetList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetDetailByUuidsResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetList
     */
    public java.util.List < AssetList> getAssetList() {
        return this.assetList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AssetList> assetList; 
        private String requestId; 

        /**
         * <p>An array that consists of the details of the ECS instances.</p>
         */
        public Builder assetList(java.util.List < AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>92016EC8-D52D-49D8-9FF7-9EA340A950B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetDetailByUuidsResponseBody build() {
            return new DescribeAssetDetailByUuidsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAssetDetailByUuidsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAssetDetailByUuidsResponseBody</p>
     */
    public static class AssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private Integer flag;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private AssetList(Builder builder) {
            this.assetType = builder.assetType;
            this.clientStatus = builder.clientStatus;
            this.flag = builder.flag;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.os = builder.os;
            this.osName = builder.osName;
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.uuid = builder.uuid;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetList create() {
            return builder().build();
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return flag
         */
        public Integer getFlag() {
            return this.flag;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String assetType; 
            private String clientStatus; 
            private Integer flag; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String os; 
            private String osName; 
            private String region; 
            private String regionId; 
            private String regionName; 
            private String uuid; 
            private String vpcInstanceId; 

            /**
             * <p>The type of the asset.</p>
             * <p>The value is fixed as <strong>0</strong>, which indicates ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The status of the Security Center agent. Valid values:</p>
             * <ul>
             * <li><strong>online</strong></li>
             * <li><strong>offline</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The type of the asset by source. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The asset is provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: The asset is not provided by Alibaba Cloud.</li>
             * <li><strong>2</strong>: The asset resides in a data center.</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset.</li>
             * <li><strong>8</strong>: light-weight assets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-rj9gda4wolo0zixi****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TestInstanceName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The IP address of the ECS instance.</p>
             * <blockquote>
             * <p> If the ECS instance has a public IP address, the value of this parameter is the public IP address of the ECS instance. If the ECS instance does not have a public IP address, the value of this parameter is the private IP address of the ECS instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10.10.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The operating system of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The name of the operating system run by the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS 7.6 64-bit</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The region in which the ECS instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The region in which the ECS instance resides.</p>
             * <blockquote>
             * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region in which the ECS instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The UUID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2a98f149-0256-414c-a29a-a69f8a75****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>13231-331331</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public AssetList build() {
                return new AssetList(this);
            } 

        } 

    }
}
