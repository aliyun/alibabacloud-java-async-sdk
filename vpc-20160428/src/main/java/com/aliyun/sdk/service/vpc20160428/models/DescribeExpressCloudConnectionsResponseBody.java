// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressCloudConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressCloudConnectionsResponseBody</p>
 */
public class DescribeExpressCloudConnectionsResponseBody extends TeaModel {
    @NameInMap("ExpressCloudConnectionSet")
    private ExpressCloudConnectionSet expressCloudConnectionSet;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeExpressCloudConnectionsResponseBody(Builder builder) {
        this.expressCloudConnectionSet = builder.expressCloudConnectionSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressCloudConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return expressCloudConnectionSet
     */
    public ExpressCloudConnectionSet getExpressCloudConnectionSet() {
        return this.expressCloudConnectionSet;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private ExpressCloudConnectionSet expressCloudConnectionSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ExpressCloudConnectionSet.
         */
        public Builder expressCloudConnectionSet(ExpressCloudConnectionSet expressCloudConnectionSet) {
            this.expressCloudConnectionSet = expressCloudConnectionSet;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExpressCloudConnectionsResponseBody build() {
            return new DescribeExpressCloudConnectionsResponseBody(this);
        } 

    } 

    public static class VirtualBorderRouterModel extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PhysicalConnectionId")
        private String physicalConnectionId;

        private VirtualBorderRouterModel(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.instanceId = builder.instanceId;
            this.physicalConnectionId = builder.physicalConnectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterModel create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return physicalConnectionId
         */
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public static final class Builder {
            private String accessPointId; 
            private String instanceId; 
            private String physicalConnectionId; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
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
             * PhysicalConnectionId.
             */
            public Builder physicalConnectionId(String physicalConnectionId) {
                this.physicalConnectionId = physicalConnectionId;
                return this;
            }

            public VirtualBorderRouterModel build() {
                return new VirtualBorderRouterModel(this);
            } 

        } 

    }
    public static class VirtualBorderRouterModels extends TeaModel {
        @NameInMap("VirtualBorderRouterModel")
        private java.util.List < VirtualBorderRouterModel> virtualBorderRouterModel;

        private VirtualBorderRouterModels(Builder builder) {
            this.virtualBorderRouterModel = builder.virtualBorderRouterModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterModels create() {
            return builder().build();
        }

        /**
         * @return virtualBorderRouterModel
         */
        public java.util.List < VirtualBorderRouterModel> getVirtualBorderRouterModel() {
            return this.virtualBorderRouterModel;
        }

        public static final class Builder {
            private java.util.List < VirtualBorderRouterModel> virtualBorderRouterModel; 

            /**
             * VirtualBorderRouterModel.
             */
            public Builder virtualBorderRouterModel(java.util.List < VirtualBorderRouterModel> virtualBorderRouterModel) {
                this.virtualBorderRouterModel = virtualBorderRouterModel;
                return this;
            }

            public VirtualBorderRouterModels build() {
                return new VirtualBorderRouterModels(this);
            } 

        } 

    }
    public static class ExpressCloudConnectionType extends TeaModel {
        @NameInMap("ApplicationBandwidth")
        private String applicationBandwidth;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplicationStatus")
        private String applicationStatus;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BgpAs")
        private String bgpAs;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CeIp")
        private String ceIp;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CircuitCode")
        private String circuitCode;

        @NameInMap("ConstructionPeriod")
        private String constructionPeriod;

        @NameInMap("ContactMail")
        private String contactMail;

        @NameInMap("ContactTel")
        private String contactTel;

        @NameInMap("Description")
        private String description;

        @NameInMap("Distance")
        private Integer distance;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EstimatedTime")
        private String estimatedTime;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("HasReservationData")
        private String hasReservationData;

        @NameInMap("IDCardNo")
        private String IDCardNo;

        @NameInMap("IdcSP")
        private String idcSP;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("Name")
        private String name;

        @NameInMap("PeIp")
        private String peIp;

        @NameInMap("PeerCity")
        private String peerCity;

        @NameInMap("PeerLocation")
        private String peerLocation;

        @NameInMap("PortType")
        private String portType;

        @NameInMap("RedundantEccId")
        private String redundantEccId;

        @NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        private String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        private String reservationOrderType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("VirtualBorderRouterModels")
        private VirtualBorderRouterModels virtualBorderRouterModels;

        private ExpressCloudConnectionType(Builder builder) {
            this.applicationBandwidth = builder.applicationBandwidth;
            this.applicationId = builder.applicationId;
            this.applicationStatus = builder.applicationStatus;
            this.applicationType = builder.applicationType;
            this.bandwidth = builder.bandwidth;
            this.bgpAs = builder.bgpAs;
            this.businessStatus = builder.businessStatus;
            this.ceIp = builder.ceIp;
            this.chargeType = builder.chargeType;
            this.circuitCode = builder.circuitCode;
            this.constructionPeriod = builder.constructionPeriod;
            this.contactMail = builder.contactMail;
            this.contactTel = builder.contactTel;
            this.description = builder.description;
            this.distance = builder.distance;
            this.endTime = builder.endTime;
            this.estimatedTime = builder.estimatedTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.hasReservationData = builder.hasReservationData;
            this.IDCardNo = builder.IDCardNo;
            this.idcSP = builder.idcSP;
            this.instanceId = builder.instanceId;
            this.isp = builder.isp;
            this.name = builder.name;
            this.peIp = builder.peIp;
            this.peerCity = builder.peerCity;
            this.peerLocation = builder.peerLocation;
            this.portType = builder.portType;
            this.redundantEccId = builder.redundantEccId;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
            this.reservationOrderType = builder.reservationOrderType;
            this.status = builder.status;
            this.type = builder.type;
            this.virtualBorderRouterModels = builder.virtualBorderRouterModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressCloudConnectionType create() {
            return builder().build();
        }

        /**
         * @return applicationBandwidth
         */
        public String getApplicationBandwidth() {
            return this.applicationBandwidth;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationStatus
         */
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bgpAs
         */
        public String getBgpAs() {
            return this.bgpAs;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return ceIp
         */
        public String getCeIp() {
            return this.ceIp;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return constructionPeriod
         */
        public String getConstructionPeriod() {
            return this.constructionPeriod;
        }

        /**
         * @return contactMail
         */
        public String getContactMail() {
            return this.contactMail;
        }

        /**
         * @return contactTel
         */
        public String getContactTel() {
            return this.contactTel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return distance
         */
        public Integer getDistance() {
            return this.distance;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return estimatedTime
         */
        public String getEstimatedTime() {
            return this.estimatedTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return hasReservationData
         */
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        /**
         * @return IDCardNo
         */
        public String getIDCardNo() {
            return this.IDCardNo;
        }

        /**
         * @return idcSP
         */
        public String getIdcSP() {
            return this.idcSP;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return peIp
         */
        public String getPeIp() {
            return this.peIp;
        }

        /**
         * @return peerCity
         */
        public String getPeerCity() {
            return this.peerCity;
        }

        /**
         * @return peerLocation
         */
        public String getPeerLocation() {
            return this.peerLocation;
        }

        /**
         * @return portType
         */
        public String getPortType() {
            return this.portType;
        }

        /**
         * @return redundantEccId
         */
        public String getRedundantEccId() {
            return this.redundantEccId;
        }

        /**
         * @return reservationActiveTime
         */
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        /**
         * @return reservationBandwidth
         */
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        /**
         * @return reservationInternetChargeType
         */
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        /**
         * @return reservationOrderType
         */
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return virtualBorderRouterModels
         */
        public VirtualBorderRouterModels getVirtualBorderRouterModels() {
            return this.virtualBorderRouterModels;
        }

        public static final class Builder {
            private String applicationBandwidth; 
            private String applicationId; 
            private String applicationStatus; 
            private String applicationType; 
            private Integer bandwidth; 
            private String bgpAs; 
            private String businessStatus; 
            private String ceIp; 
            private String chargeType; 
            private String circuitCode; 
            private String constructionPeriod; 
            private String contactMail; 
            private String contactTel; 
            private String description; 
            private Integer distance; 
            private String endTime; 
            private String estimatedTime; 
            private String gmtCreate; 
            private String gmtModify; 
            private String hasReservationData; 
            private String IDCardNo; 
            private String idcSP; 
            private String instanceId; 
            private String isp; 
            private String name; 
            private String peIp; 
            private String peerCity; 
            private String peerLocation; 
            private String portType; 
            private String redundantEccId; 
            private String reservationActiveTime; 
            private String reservationBandwidth; 
            private String reservationInternetChargeType; 
            private String reservationOrderType; 
            private String status; 
            private String type; 
            private VirtualBorderRouterModels virtualBorderRouterModels; 

            /**
             * ApplicationBandwidth.
             */
            public Builder applicationBandwidth(String applicationBandwidth) {
                this.applicationBandwidth = applicationBandwidth;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplicationStatus.
             */
            public Builder applicationStatus(String applicationStatus) {
                this.applicationStatus = applicationStatus;
                return this;
            }

            /**
             * ApplicationType.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * BgpAs.
             */
            public Builder bgpAs(String bgpAs) {
                this.bgpAs = bgpAs;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * CeIp.
             */
            public Builder ceIp(String ceIp) {
                this.ceIp = ceIp;
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
             * CircuitCode.
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * ConstructionPeriod.
             */
            public Builder constructionPeriod(String constructionPeriod) {
                this.constructionPeriod = constructionPeriod;
                return this;
            }

            /**
             * ContactMail.
             */
            public Builder contactMail(String contactMail) {
                this.contactMail = contactMail;
                return this;
            }

            /**
             * ContactTel.
             */
            public Builder contactTel(String contactTel) {
                this.contactTel = contactTel;
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
             * Distance.
             */
            public Builder distance(Integer distance) {
                this.distance = distance;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EstimatedTime.
             */
            public Builder estimatedTime(String estimatedTime) {
                this.estimatedTime = estimatedTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * HasReservationData.
             */
            public Builder hasReservationData(String hasReservationData) {
                this.hasReservationData = hasReservationData;
                return this;
            }

            /**
             * IDCardNo.
             */
            public Builder IDCardNo(String IDCardNo) {
                this.IDCardNo = IDCardNo;
                return this;
            }

            /**
             * IdcSP.
             */
            public Builder idcSP(String idcSP) {
                this.idcSP = idcSP;
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
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
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
             * PeIp.
             */
            public Builder peIp(String peIp) {
                this.peIp = peIp;
                return this;
            }

            /**
             * PeerCity.
             */
            public Builder peerCity(String peerCity) {
                this.peerCity = peerCity;
                return this;
            }

            /**
             * PeerLocation.
             */
            public Builder peerLocation(String peerLocation) {
                this.peerLocation = peerLocation;
                return this;
            }

            /**
             * PortType.
             */
            public Builder portType(String portType) {
                this.portType = portType;
                return this;
            }

            /**
             * RedundantEccId.
             */
            public Builder redundantEccId(String redundantEccId) {
                this.redundantEccId = redundantEccId;
                return this;
            }

            /**
             * ReservationActiveTime.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * ReservationBandwidth.
             */
            public Builder reservationBandwidth(String reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * ReservationInternetChargeType.
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * ReservationOrderType.
             */
            public Builder reservationOrderType(String reservationOrderType) {
                this.reservationOrderType = reservationOrderType;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VirtualBorderRouterModels.
             */
            public Builder virtualBorderRouterModels(VirtualBorderRouterModels virtualBorderRouterModels) {
                this.virtualBorderRouterModels = virtualBorderRouterModels;
                return this;
            }

            public ExpressCloudConnectionType build() {
                return new ExpressCloudConnectionType(this);
            } 

        } 

    }
    public static class ExpressCloudConnectionSet extends TeaModel {
        @NameInMap("ExpressCloudConnectionType")
        private java.util.List < ExpressCloudConnectionType> expressCloudConnectionType;

        private ExpressCloudConnectionSet(Builder builder) {
            this.expressCloudConnectionType = builder.expressCloudConnectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressCloudConnectionSet create() {
            return builder().build();
        }

        /**
         * @return expressCloudConnectionType
         */
        public java.util.List < ExpressCloudConnectionType> getExpressCloudConnectionType() {
            return this.expressCloudConnectionType;
        }

        public static final class Builder {
            private java.util.List < ExpressCloudConnectionType> expressCloudConnectionType; 

            /**
             * ExpressCloudConnectionType.
             */
            public Builder expressCloudConnectionType(java.util.List < ExpressCloudConnectionType> expressCloudConnectionType) {
                this.expressCloudConnectionType = expressCloudConnectionType;
                return this;
            }

            public ExpressCloudConnectionSet build() {
                return new ExpressCloudConnectionSet(this);
            } 

        } 

    }
}
