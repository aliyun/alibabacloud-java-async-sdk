// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetDetailByUuidsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAssetDetailByUuidsResponseBody</p>
 */
public class DescribeAssetDetailByUuidsResponseBody extends TeaModel {
    @NameInMap("AssetList")
    private java.util.List < AssetList> assetList;

    @NameInMap("RequestId")
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
         * AssetList.
         */
        public Builder assetList(java.util.List < AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAssetDetailByUuidsResponseBody build() {
            return new DescribeAssetDetailByUuidsResponseBody(this);
        } 

    } 

    public static class AssetList extends TeaModel {
        @NameInMap("AssetType")
        private String assetType;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("Flag")
        private Integer flag;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Os")
        private String os;

        @NameInMap("OsName")
        private String osName;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcInstanceId")
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
             * AssetType.
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * ClientStatus.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsName.
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * VpcInstanceId.
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
