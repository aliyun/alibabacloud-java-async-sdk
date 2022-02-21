// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeClusterV2Request} extends {@link RequestModel}
 *
 * <p>ResizeClusterV2Request</p>
 */
public class ResizeClusterV2Request extends Request {
    @Query
    @NameInMap("AutoPayOrder")
    private Boolean autoPayOrder;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("HostComponentInfo")
    private java.util.List < HostComponentInfo> hostComponentInfo;

    @Query
    @NameInMap("HostGroup")
    @Validation(required = true)
    private java.util.List < HostGroup> hostGroup;

    @Query
    @NameInMap("IsOpenPublicIp")
    private Boolean isOpenPublicIp;

    @Query
    @NameInMap("PromotionInfo")
    private java.util.List < PromotionInfo> promotionInfo;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VswitchId")
    private String vswitchId;

    private ResizeClusterV2Request(Builder builder) {
        super(builder);
        this.autoPayOrder = builder.autoPayOrder;
        this.clusterId = builder.clusterId;
        this.hostComponentInfo = builder.hostComponentInfo;
        this.hostGroup = builder.hostGroup;
        this.isOpenPublicIp = builder.isOpenPublicIp;
        this.promotionInfo = builder.promotionInfo;
        this.regionId = builder.regionId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeClusterV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPayOrder
     */
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return hostComponentInfo
     */
    public java.util.List < HostComponentInfo> getHostComponentInfo() {
        return this.hostComponentInfo;
    }

    /**
     * @return hostGroup
     */
    public java.util.List < HostGroup> getHostGroup() {
        return this.hostGroup;
    }

    /**
     * @return isOpenPublicIp
     */
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    /**
     * @return promotionInfo
     */
    public java.util.List < PromotionInfo> getPromotionInfo() {
        return this.promotionInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<ResizeClusterV2Request, Builder> {
        private Boolean autoPayOrder; 
        private String clusterId; 
        private java.util.List < HostComponentInfo> hostComponentInfo; 
        private java.util.List < HostGroup> hostGroup; 
        private Boolean isOpenPublicIp; 
        private java.util.List < PromotionInfo> promotionInfo; 
        private String regionId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(ResizeClusterV2Request response) {
            super(response);
            this.autoPayOrder = response.autoPayOrder;
            this.clusterId = response.clusterId;
            this.hostComponentInfo = response.hostComponentInfo;
            this.hostGroup = response.hostGroup;
            this.isOpenPublicIp = response.isOpenPublicIp;
            this.promotionInfo = response.promotionInfo;
            this.regionId = response.regionId;
            this.vswitchId = response.vswitchId;
        } 

        /**
         * AutoPayOrder.
         */
        public Builder autoPayOrder(Boolean autoPayOrder) {
            this.putQueryParameter("AutoPayOrder", autoPayOrder);
            this.autoPayOrder = autoPayOrder;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * HostComponentInfo.
         */
        public Builder hostComponentInfo(java.util.List < HostComponentInfo> hostComponentInfo) {
            this.putQueryParameter("HostComponentInfo", hostComponentInfo);
            this.hostComponentInfo = hostComponentInfo;
            return this;
        }

        /**
         * HostGroup.
         */
        public Builder hostGroup(java.util.List < HostGroup> hostGroup) {
            this.putQueryParameter("HostGroup", hostGroup);
            this.hostGroup = hostGroup;
            return this;
        }

        /**
         * IsOpenPublicIp.
         */
        public Builder isOpenPublicIp(Boolean isOpenPublicIp) {
            this.putQueryParameter("IsOpenPublicIp", isOpenPublicIp);
            this.isOpenPublicIp = isOpenPublicIp;
            return this;
        }

        /**
         * PromotionInfo.
         */
        public Builder promotionInfo(java.util.List < PromotionInfo> promotionInfo) {
            this.putQueryParameter("PromotionInfo", promotionInfo);
            this.promotionInfo = promotionInfo;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public ResizeClusterV2Request build() {
            return new ResizeClusterV2Request(this);
        } 

    } 

    public static class HostComponentInfo extends TeaModel {
        @NameInMap("ComponentNameList")
        private java.util.List < String > componentNameList;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("ServiceName")
        private String serviceName;

        private HostComponentInfo(Builder builder) {
            this.componentNameList = builder.componentNameList;
            this.hostName = builder.hostName;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostComponentInfo create() {
            return builder().build();
        }

        /**
         * @return componentNameList
         */
        public java.util.List < String > getComponentNameList() {
            return this.componentNameList;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List < String > componentNameList; 
            private String hostName; 
            private String serviceName; 

            /**
             * ComponentNameList.
             */
            public Builder componentNameList(java.util.List < String > componentNameList) {
                this.componentNameList = componentNameList;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public HostComponentInfo build() {
                return new HostComponentInfo(this);
            } 

        } 

    }
    public static class HostGroup extends TeaModel {
        @NameInMap("AutoRenew")
        private Boolean autoRenew;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateType")
        private String createType;

        @NameInMap("DiskCapacity")
        @Validation(maximum = 20000, minimum = 40)
        private Integer diskCapacity;

        @NameInMap("DiskCount")
        @Validation(maximum = 4, minimum = 1)
        private Integer diskCount;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("HostGroupType")
        @Validation(required = true)
        private String hostGroupType;

        @NameInMap("HostKeyPairName")
        private String hostKeyPairName;

        @NameInMap("HostPassword")
        private String hostPassword;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("NodeCount")
        @Validation(required = true, maximum = 1000, minimum = 2)
        private Integer nodeCount;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @NameInMap("SysDiskCapacity")
        @Validation(maximum = 500, minimum = 40)
        private Integer sysDiskCapacity;

        @NameInMap("SysDiskType")
        private String sysDiskType;

        @NameInMap("VswitchId")
        private Integer vswitchId;

        private HostGroup(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.clusterId = builder.clusterId;
            this.comment = builder.comment;
            this.createType = builder.createType;
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
            this.hostGroupType = builder.hostGroupType;
            this.hostKeyPairName = builder.hostKeyPairName;
            this.hostPassword = builder.hostPassword;
            this.instanceType = builder.instanceType;
            this.nodeCount = builder.nodeCount;
            this.period = builder.period;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.sysDiskCapacity = builder.sysDiskCapacity;
            this.sysDiskType = builder.sysDiskType;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroup create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
        }

        /**
         * @return diskCapacity
         */
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return diskCount
         */
        public Integer getDiskCount() {
            return this.diskCount;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return hostGroupType
         */
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        /**
         * @return hostKeyPairName
         */
        public String getHostKeyPairName() {
            return this.hostKeyPairName;
        }

        /**
         * @return hostPassword
         */
        public String getHostPassword() {
            return this.hostPassword;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        /**
         * @return privatePoolOptionsMatchCriteria
         */
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        /**
         * @return sysDiskCapacity
         */
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        /**
         * @return sysDiskType
         */
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        /**
         * @return vswitchId
         */
        public Integer getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private String chargeType; 
            private String clusterId; 
            private String comment; 
            private String createType; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private String hostGroupId; 
            private String hostGroupName; 
            private String hostGroupType; 
            private String hostKeyPairName; 
            private String hostPassword; 
            private String instanceType; 
            private Integer nodeCount; 
            private Integer period; 
            private String privatePoolOptionsId; 
            private String privatePoolOptionsMatchCriteria; 
            private Integer sysDiskCapacity; 
            private String sysDiskType; 
            private Integer vswitchId; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
                return this;
            }

            /**
             * DiskCapacity.
             */
            public Builder diskCapacity(Integer diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * DiskCount.
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * HostGroupId.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * HostGroupType.
             */
            public Builder hostGroupType(String hostGroupType) {
                this.hostGroupType = hostGroupType;
                return this;
            }

            /**
             * HostKeyPairName.
             */
            public Builder hostKeyPairName(String hostKeyPairName) {
                this.hostKeyPairName = hostKeyPairName;
                return this;
            }

            /**
             * HostPassword.
             */
            public Builder hostPassword(String hostPassword) {
                this.hostPassword = hostPassword;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * PrivatePoolOptionsMatchCriteria.
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * SysDiskCapacity.
             */
            public Builder sysDiskCapacity(Integer sysDiskCapacity) {
                this.sysDiskCapacity = sysDiskCapacity;
                return this;
            }

            /**
             * SysDiskType.
             */
            public Builder sysDiskType(String sysDiskType) {
                this.sysDiskType = sysDiskType;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(Integer vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public HostGroup build() {
                return new HostGroup(this);
            } 

        } 

    }
    public static class PromotionInfo extends TeaModel {
        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("PromotionOptionCode")
        private String promotionOptionCode;

        @NameInMap("PromotionOptionNo")
        private String promotionOptionNo;

        private PromotionInfo(Builder builder) {
            this.productCode = builder.productCode;
            this.promotionOptionCode = builder.promotionOptionCode;
            this.promotionOptionNo = builder.promotionOptionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionInfo create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return promotionOptionCode
         */
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        /**
         * @return promotionOptionNo
         */
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public static final class Builder {
            private String productCode; 
            private String promotionOptionCode; 
            private String promotionOptionNo; 

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * PromotionOptionCode.
             */
            public Builder promotionOptionCode(String promotionOptionCode) {
                this.promotionOptionCode = promotionOptionCode;
                return this;
            }

            /**
             * PromotionOptionNo.
             */
            public Builder promotionOptionNo(String promotionOptionNo) {
                this.promotionOptionNo = promotionOptionNo;
                return this;
            }

            public PromotionInfo build() {
                return new PromotionInfo(this);
            } 

        } 

    }
}
