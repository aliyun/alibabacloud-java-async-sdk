// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeNetworkPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkPackagesResponseBody</p>
 */
public class DescribeNetworkPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkPackages")
    private java.util.List<NetworkPackages> networkPackages;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPackages
     */
    public java.util.List<NetworkPackages> getNetworkPackages() {
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
        private java.util.List<NetworkPackages> networkPackages; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNetworkPackagesResponseBody model) {
            this.networkPackages = model.networkPackages;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The premium bandwidth plans.</p>
         */
        public Builder networkPackages(java.util.List<NetworkPackages> networkPackages) {
            this.networkPackages = networkPackages;
            return this;
        }

        /**
         * <p>The token that is used to start the next query. If the value of this parameter is empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkPackagesResponseBody build() {
            return new DescribeNetworkPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkPackagesResponseBody</p>
     */
    public static class NetworkPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EipAddresses")
        private java.util.List<String> eipAddresses;

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
        public java.util.List<String> getEipAddresses() {
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
            private java.util.List<String> eipAddresses; 
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

            private Builder() {
            } 

            private Builder(NetworkPackages model) {
                this.bandwidth = model.bandwidth;
                this.businessStatus = model.businessStatus;
                this.createTime = model.createTime;
                this.eipAddresses = model.eipAddresses;
                this.expiredTime = model.expiredTime;
                this.internetChargeType = model.internetChargeType;
                this.networkPackageId = model.networkPackageId;
                this.networkPackageStatus = model.networkPackageStatus;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteName = model.officeSiteName;
                this.officeSiteVpcType = model.officeSiteVpcType;
                this.payType = model.payType;
                this.reservationActiveTime = model.reservationActiveTime;
                this.reservationBandwidth = model.reservationBandwidth;
                this.reservationInternetChargeType = model.reservationInternetChargeType;
            } 

            /**
             * <p>The bandwidth provided by the premium bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The business status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Expired</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Normal</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The time when the premium bandwidth plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-10T02:35:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The public egress IP address of the premium bandwidth plan.</p>
             */
            public Builder eipAddresses(java.util.List<String> eipAddresses) {
                this.eipAddresses = eipAddresses;
                return this;
            }

            /**
             * <p>The time when the premium bandwidth plan expires.</p>
             * <ul>
             * <li>If the plan is a subscription one, the time when the plan expires is returned.</li>
             * <li>If the plan is a pay-as-you-go one, <code>2099-12-31T15:59:59Z</code> is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2099-12-31T15:59:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The charge type of the premium bandwidth plan.</p>
             * <ul>
             * <li><p>Valid value when the <code>PayType</code> parameter is set to <code>PrePaid</code>:</p>
             * <ul>
             * <li>PayByBandwidth: charges by fixed bandwidth.</li>
             * </ul>
             * </li>
             * <li><p>Valid values when the <code>PayType</code> parameter is set to <code>PostPaid</code>:</p>
             * <ul>
             * <li>PayByTraffic: charges by data transfer.</li>
             * <li>PayByBandwidth: charges by fixed bandwidth.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The ID of the premium bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>np-amtp8e8q1o9e4****</p>
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * <p>The status of the premium bandwidth plan.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Creating</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Released</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>InUse</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>Releasing</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
             */
            public Builder networkPackageStatus(String networkPackageStatus) {
                this.networkPackageStatus = networkPackageStatus;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The office network name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The type of the office network.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>standard: advanced office network</li>
             * <li>customized: custom office network</li>
             * <li>basic: basic office network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder officeSiteVpcType(String officeSiteVpcType) {
                this.officeSiteVpcType = officeSiteVpcType;
                return this;
            }

            /**
             * <p>The billing method of the premium bandwidth plan.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The time when the reserved network bandwidth took effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-10T00:00:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The peak bandwidth that is reserved for the premium bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder reservationBandwidth(Integer reservationBandwidth) {
                this.reservationBandwidth = reservationBandwidth;
                return this;
            }

            /**
             * <p>The billing method of the reserved network bandwidth.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>PayByTraffic: charges by data transfer.</p>
             * </li>
             * <li><p>PayByBandwidth: charges by fixed bandwidth.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
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
