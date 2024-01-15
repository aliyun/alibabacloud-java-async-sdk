// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkPackagesResponseBody</p>
 */
public class DescribeNetworkPackagesResponseBody extends TeaModel {
    @NameInMap("NetworkPackages")
    private java.util.List < NetworkPackages> networkPackages;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkPackagesResponseBody(Builder builder) {
        this.networkPackages = builder.networkPackages;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkPackages
     */
    public java.util.List < NetworkPackages> getNetworkPackages() {
        return this.networkPackages;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < NetworkPackages> networkPackages; 
        private String nextToken; 
        private String requestId; 

        /**
         * Details of the Internet access packages.
         */
        public Builder networkPackages(java.util.List < NetworkPackages> networkPackages) {
            this.networkPackages = networkPackages;
            return this;
        }

        /**
         * The token that is used to start the next query. If the value of this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkPackagesResponseBody build() {
            return new DescribeNetworkPackagesResponseBody(this);
        } 

    } 

    public static class NetworkPackages extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EipAddresses")
        private java.util.List < String > eipAddresses;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("NetworkPackageId")
        private String networkPackageId;

        @NameInMap("NetworkPackageStatus")
        private String networkPackageStatus;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteName")
        private String officeSiteName;

        @NameInMap("OfficeSiteVpcType")
        private String officeSiteVpcType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        private Integer reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        private String reservationInternetChargeType;

        private NetworkPackages(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.createTime = builder.createTime;
            this.eipAddresses = builder.eipAddresses;
            this.expiredTime = builder.expiredTime;
            this.internetChargeType = builder.internetChargeType;
            this.networkPackageId = builder.networkPackageId;
            this.networkPackageStatus = builder.networkPackageStatus;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
            this.officeSiteVpcType = builder.officeSiteVpcType;
            this.payType = builder.payType;
            this.reservationActiveTime = builder.reservationActiveTime;
            this.reservationBandwidth = builder.reservationBandwidth;
            this.reservationInternetChargeType = builder.reservationInternetChargeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkPackages create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eipAddresses
         */
        public java.util.List < String > getEipAddresses() {
            return this.eipAddresses;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return networkPackageId
         */
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        /**
         * @return networkPackageStatus
         */
        public String getNetworkPackageStatus() {
            return this.networkPackageStatus;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteName
         */
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        /**
         * @return officeSiteVpcType
         */
        public String getOfficeSiteVpcType() {
            return this.officeSiteVpcType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
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
        public Integer getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        /**
         * @return reservationInternetChargeType
         */
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String businessStatus; 
            private String createTime; 
            private java.util.List < String > eipAddresses; 
            private String expiredTime; 
            private String internetChargeType; 
            private String networkPackageId; 
            private String networkPackageStatus; 
            private String officeSiteId; 
            private String officeSiteName; 
            private String officeSiteVpcType; 
            private String payType; 
            private String reservationActiveTime; 
            private Integer reservationBandwidth; 
            private String reservationInternetChargeType; 

            /**
             * The maximum public bandwidth of the Internet access package. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
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
             * The time when the Internet access package was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The elastic IP addresses (EIPs) of the Internet access package for outbound traffic.
             */
            public Builder eipAddresses(java.util.List < String > eipAddresses) {
                this.eipAddresses = eipAddresses;
                return this;
            }

            /**
             * The time when the Internet access package expires.
             * <p>
             * 
             * *   If the Internet access package is metered on a pay-by-bandwidth basis, the actual expiration time is returned.
             * *   If the Internet access package is metered on a pay-by-data-transfer basis, 2099-12-31T15:59:59Z is returned.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The billing method of the network bandwidth.
             * <p>
             * 
             * *   PayByTraffic: pay-by-data-transfer
             * *   PayByBandwidth: pay-by-bandwidth
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The ID of the Internet access package.
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * The state of the Internet access package. Valid values:
             * <p>
             * 
             * *   Creating
             * *   InUse
             * *   Releasing
             * *   Released
             */
            public Builder networkPackageStatus(String networkPackageStatus) {
                this.networkPackageStatus = networkPackageStatus;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The name of the workspace.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The type of the workspace. Valid values:
             * <p>
             * 
             * *   basic
             * *   standard
             * *   customized
             */
            public Builder officeSiteVpcType(String officeSiteVpcType) {
                this.officeSiteVpcType = officeSiteVpcType;
                return this;
            }

            /**
             * The billing method for the network.
             * <p>
             * 
             * *   PrePaid: subscription
             * *   PostPaid: pay-as-you-go
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The time when the reserved network bandwidth takes effect.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The peak bandwidth of the reserved network bandwidth. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(Integer reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The billing method of the reserved network bandwidth.
             * <p>
             * 
             * *   PayByTraffic: pay-by-data-transfer
             * *   PayByBandwidth: pay-by-bandwidth
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            public NetworkPackages build() {
                return new NetworkPackages(this);
            } 

        } 

    }
}
