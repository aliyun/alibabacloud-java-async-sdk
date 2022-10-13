// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWirelessCloudConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetWirelessCloudConnectorResponseBody</p>
 */
public class GetWirelessCloudConnectorResponseBody extends TeaModel {
    @NameInMap("BusinessType")
    private String businessType;

    @NameInMap("CardCount")
    private String cardCount;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DataPackageId")
    private String dataPackageId;

    @NameInMap("DataPackageType")
    private String dataPackageType;

    @NameInMap("Description")
    private String description;

    @NameInMap("Features")
    private java.util.List < String > features;

    @NameInMap("Name")
    private String name;

    @NameInMap("NetLinks")
    private java.util.List < NetLinks> netLinks;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("Status")
    private String status;

    @NameInMap("UseCase")
    private String useCase;

    @NameInMap("WirelessCloudConnectorId")
    private String wirelessCloudConnectorId;

    private GetWirelessCloudConnectorResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.cardCount = builder.cardCount;
        this.createTime = builder.createTime;
        this.dataPackageId = builder.dataPackageId;
        this.dataPackageType = builder.dataPackageType;
        this.description = builder.description;
        this.features = builder.features;
        this.name = builder.name;
        this.netLinks = builder.netLinks;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.serviceType = builder.serviceType;
        this.status = builder.status;
        this.useCase = builder.useCase;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWirelessCloudConnectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cardCount
     */
    public String getCardCount() {
        return this.cardCount;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataPackageId
     */
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    /**
     * @return dataPackageType
     */
    public String getDataPackageType() {
        return this.dataPackageType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return features
     */
    public java.util.List < String > getFeatures() {
        return this.features;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return netLinks
     */
    public java.util.List < NetLinks> getNetLinks() {
        return this.netLinks;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return useCase
     */
    public String getUseCase() {
        return this.useCase;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder {
        private String businessType; 
        private String cardCount; 
        private String createTime; 
        private String dataPackageId; 
        private String dataPackageType; 
        private String description; 
        private java.util.List < String > features; 
        private String name; 
        private java.util.List < NetLinks> netLinks; 
        private String regionId; 
        private String requestId; 
        private String serviceType; 
        private String status; 
        private String useCase; 
        private String wirelessCloudConnectorId; 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * CardCount.
         */
        public Builder cardCount(String cardCount) {
            this.cardCount = cardCount;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DataPackageId.
         */
        public Builder dataPackageId(String dataPackageId) {
            this.dataPackageId = dataPackageId;
            return this;
        }

        /**
         * DataPackageType.
         */
        public Builder dataPackageType(String dataPackageType) {
            this.dataPackageType = dataPackageType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Features.
         */
        public Builder features(java.util.List < String > features) {
            this.features = features;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 数组，返回示例目录。
         */
        public Builder netLinks(java.util.List < NetLinks> netLinks) {
            this.netLinks = netLinks;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UseCase.
         */
        public Builder useCase(String useCase) {
            this.useCase = useCase;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        public GetWirelessCloudConnectorResponseBody build() {
            return new GetWirelessCloudConnectorResponseBody(this);
        } 

    } 

    public static class NetLinks extends TeaModel {
        @NameInMap("APN")
        private String APN;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GrantAliUid")
        private String grantAliUid;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetLinkId")
        private String netLinkId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchs")
        private java.util.List < String > vSwitchs;

        @NameInMap("VpcId")
        private String vpcId;

        private NetLinks(Builder builder) {
            this.APN = builder.APN;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.grantAliUid = builder.grantAliUid;
            this.ISP = builder.ISP;
            this.name = builder.name;
            this.netLinkId = builder.netLinkId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vSwitchs = builder.vSwitchs;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetLinks create() {
            return builder().build();
        }

        /**
         * @return APN
         */
        public String getAPN() {
            return this.APN;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return grantAliUid
         */
        public String getGrantAliUid() {
            return this.grantAliUid;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return netLinkId
         */
        public String getNetLinkId() {
            return this.netLinkId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchs
         */
        public java.util.List < String > getVSwitchs() {
            return this.vSwitchs;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String APN; 
            private String createTime; 
            private String description; 
            private String grantAliUid; 
            private String ISP; 
            private String name; 
            private String netLinkId; 
            private String regionId; 
            private String status; 
            private java.util.List < String > vSwitchs; 
            private String vpcId; 

            /**
             * APN.
             */
            public Builder APN(String APN) {
                this.APN = APN;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GrantAliUid.
             */
            public Builder grantAliUid(String grantAliUid) {
                this.grantAliUid = grantAliUid;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 代表资源名称的资源属性字段
             */
            public Builder netLinkId(String netLinkId) {
                this.netLinkId = netLinkId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchs.
             */
            public Builder vSwitchs(java.util.List < String > vSwitchs) {
                this.vSwitchs = vSwitchs;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public NetLinks build() {
                return new NetLinks(this);
            } 

        } 

    }
}
