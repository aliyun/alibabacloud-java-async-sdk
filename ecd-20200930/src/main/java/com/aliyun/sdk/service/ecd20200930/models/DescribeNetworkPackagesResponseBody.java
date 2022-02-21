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
         * NetworkPackages.
         */
        public Builder networkPackages(java.util.List < NetworkPackages> networkPackages) {
            this.networkPackages = networkPackages;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
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

        private NetworkPackages(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.createTime = builder.createTime;
            this.eipAddresses = builder.eipAddresses;
            this.expiredTime = builder.expiredTime;
            this.internetChargeType = builder.internetChargeType;
            this.networkPackageId = builder.networkPackageId;
            this.networkPackageStatus = builder.networkPackageStatus;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteName = builder.officeSiteName;
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

        public static final class Builder {
            private Integer bandwidth; 
            private String createTime; 
            private java.util.List < String > eipAddresses; 
            private String expiredTime; 
            private String internetChargeType; 
            private String networkPackageId; 
            private String networkPackageStatus; 
            private String officeSiteId; 
            private String officeSiteName; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
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
             * EipAddresses.
             */
            public Builder eipAddresses(java.util.List < String > eipAddresses) {
                this.eipAddresses = eipAddresses;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * NetworkPackageId.
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * NetworkPackageStatus.
             */
            public Builder networkPackageStatus(String networkPackageStatus) {
                this.networkPackageStatus = networkPackageStatus;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OfficeSiteName.
             */
            public Builder officeSiteName(String officeSiteName) {
                this.officeSiteName = officeSiteName;
                return this;
            }

            public NetworkPackages build() {
                return new NetworkPackages(this);
            } 

        } 

    }
}
