// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkPackagesResponseBody</p>
 */
public class DescribeNetworkPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkPackages")
    private java.util.List < NetworkPackages> networkPackages;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The premium bandwidth plans.
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
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EipAddresses")
        private java.util.List < String > eipAddresses;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
        private String networkPackageId;

        @com.aliyun.core.annotation.NameInMap("NetworkPackageStatus")
        private String networkPackageStatus;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
        private String officeSiteName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteVpcType")
        private String officeSiteVpcType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ReservationActiveTime")
        private String reservationActiveTime;

        @com.aliyun.core.annotation.NameInMap("ReservationBandwidth")
        private Integer reservationBandwidth;

        @com.aliyun.core.annotation.NameInMap("ReservationInternetChargeType")
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
             * The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The business status.
             * <p>
             * 
             * Valid values:
             * 
             * *   Expired
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Normal
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The time when the premium bandwidth plan was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The public egress IP address of the premium bandwidth plan.
             */
            public Builder eipAddresses(java.util.List < String > eipAddresses) {
                this.eipAddresses = eipAddresses;
                return this;
            }

            /**
             * The time when the premium bandwidth plan expires.
             * <p>
             * 
             * *   If the plan is a subscription one, the time when the plan expires is returned.
             * *   If the plan is a pay-as-you-go one, `2099-12-31T15:59:59Z` is returned.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The charge type of the premium bandwidth plan.
             * <p>
             * 
             * *   Valid value when the `PayType` parameter is set to `PrePaid`:
             * 
             *     *   PayByBandwidth: charges by fixed bandwidth.
             * 
             * *   Valid values when the `PayType` parameter is set to `PostPaid`:
             * 
             *     *   PayByTraffic: charges by data transfer.
             *     *   PayByBandwidth: charges by fixed bandwidth.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The ID of the premium bandwidth plan.
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * The status of the premium bandwidth plan.
             * <p>
             * 
             * Valid values:
             * 
             * *   Creating
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Released
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   InUse
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Releasing
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder networkPackageStatus(String networkPackageStatus) {
                this.networkPackageStatus = networkPackageStatus;
                return this;
            }

            /**
             * The office network ID.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The office network name.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * The type of the office network.
             * <p>
             * 
             * Valid values:
             * 
             * *   standard: advanced office network
             * *   customized: custom office network
             * *   basic: basic office network
             */
            public Builder officeSiteVpcType(String officeSiteVpcType) {
                this.officeSiteVpcType = officeSiteVpcType;
                return this;
            }

            /**
             * The billing method of the premium bandwidth plan.
             * <p>
             * 
             * Valid values:
             * 
             * *   PostPaid: pay-as-you-go
             * *   PrePaid: subscription
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The time when the reserved network bandwidth took effect.
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * The peak bandwidth that is reserved for the premium bandwidth plan. Unit: Mbit/s.
             */
            public Builder reservationBandwidth(Integer reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * The billing method of the reserved network bandwidth.
             * <p>
             * 
             * Valid values:
             * 
             * *   PayByTraffic: charges by data transfer.
             * 
             * *   PayByBandwidth: charges by fixed bandwidth.
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
