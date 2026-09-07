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
         * <p>The list of premium Internet bandwidth plans.</p>
         */
        public Builder networkPackages(java.util.List<NetworkPackages> networkPackages) {
            this.networkPackages = networkPackages;
            return this;
        }

        /**
         * <p>The pagination token for the next query. If NextToken is empty, no more pages exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. If you specify this parameter, the value cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.tags = builder.tags;
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

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 

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
                this.tags = model.tags;
            } 

            /**
             * <p>The bandwidth of the premium Internet bandwidth plan. Unit: Mbit/s.</p>
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
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The time when the plan was created. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-10T02:35:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The public egress IP address of the premium Internet bandwidth plan.</p>
             */
            public Builder eipAddresses(java.util.List<String> eipAddresses) {
                this.eipAddresses = eipAddresses;
                return this;
            }

            /**
             * <p>The expiration time of the premium Internet bandwidth plan.</p>
             * <ul>
             * <li>If the plan uses the subscription billing method, the actual expiration time is returned.</li>
             * <li>If the plan uses the pay-as-you-go billing method, <code>2099-12-31T15:59:59Z</code> is returned.</li>
             * </ul>
             * <p>The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2099-12-31T15:59:59Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The billing method of the premium Internet bandwidth plan.</p>
             * <ul>
             * <li>If the parameter <code>PayType</code> is set to <code>PrePaid</code>, the valid value is:<ul>
             * <li>PayByBandwidth: billing by fixed bandwidth.</li>
             * </ul>
             * </li>
             * <li>If the parameter <code>PayType</code> is set to <code>PostPaid</code>, valid values are:<ul>
             * <li>PayByTraffic: billing by data transfer.</li>
             * <li>PayByBandwidth: billing by fixed bandwidth.</li>
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
             * <p>The ID of the premium Internet bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>np-amtp8e8q1o9e4****</p>
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * <p>The status of the premium Internet bandwidth plan.</p>
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
             * <p>default</p>
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            /**
             * <p>The office network type.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder officeSiteVpcType(String officeSiteVpcType) {
                this.officeSiteVpcType = officeSiteVpcType;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The effective period of the reserved network bandwidth. The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-10T00:00:00Z</p>
             */
            public Builder reservationActiveTime(String reservationActiveTime) {
                this.reservationActiveTime = reservationActiveTime;
                return this;
            }

            /**
             * <p>The peak reserved network bandwidth. Unit: Mbit/s.</p>
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
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder reservationInternetChargeType(String reservationInternetChargeType) {
                this.reservationInternetChargeType = reservationInternetChargeType;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public NetworkPackages build() {
                return new NetworkPackages(this);
            } 

        } 

    }
}
