// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSecondaryPublicIpAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecondaryPublicIpAddressesResponseBody</p>
 */
public class DescribeSecondaryPublicIpAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecondaryPublicIpAddresses")
    private java.util.List < SecondaryPublicIpAddresses> secondaryPublicIpAddresses;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecondaryPublicIpAddressesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.secondaryPublicIpAddresses = builder.secondaryPublicIpAddresses;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecondaryPublicIpAddressesResponseBody create() {
        return builder().build();
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
     * @return secondaryPublicIpAddresses
     */
    public java.util.List < SecondaryPublicIpAddresses> getSecondaryPublicIpAddresses() {
        return this.secondaryPublicIpAddresses;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SecondaryPublicIpAddresses> secondaryPublicIpAddresses; 
        private Integer totalCount; 

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * <p>The array of returned secondary IP addresses.</p>
         */
        public Builder secondaryPublicIpAddresses(java.util.List < SecondaryPublicIpAddresses> secondaryPublicIpAddresses) {
            this.secondaryPublicIpAddresses = secondaryPublicIpAddresses;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecondaryPublicIpAddressesResponseBody build() {
            return new DescribeSecondaryPublicIpAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecondaryPublicIpAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecondaryPublicIpAddressesResponseBody</p>
     */
    public static class SecondaryPublicIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrMask")
        private Integer cidrMask;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("Gateway")
        private String gateway;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("SecondaryPublicIpAddress")
        private String secondaryPublicIpAddress;

        @com.aliyun.core.annotation.NameInMap("SecondaryPublicIpId")
        private String secondaryPublicIpId;

        private SecondaryPublicIpAddresses(Builder builder) {
            this.cidrMask = builder.cidrMask;
            this.creationTime = builder.creationTime;
            this.ensRegionId = builder.ensRegionId;
            this.gateway = builder.gateway;
            this.ipVersion = builder.ipVersion;
            this.isp = builder.isp;
            this.secondaryPublicIpAddress = builder.secondaryPublicIpAddress;
            this.secondaryPublicIpId = builder.secondaryPublicIpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecondaryPublicIpAddresses create() {
            return builder().build();
        }

        /**
         * @return cidrMask
         */
        public Integer getCidrMask() {
            return this.cidrMask;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return secondaryPublicIpAddress
         */
        public String getSecondaryPublicIpAddress() {
            return this.secondaryPublicIpAddress;
        }

        /**
         * @return secondaryPublicIpId
         */
        public String getSecondaryPublicIpId() {
            return this.secondaryPublicIpId;
        }

        public static final class Builder {
            private Integer cidrMask; 
            private String creationTime; 
            private String ensRegionId; 
            private String gateway; 
            private String ipVersion; 
            private String isp; 
            private String secondaryPublicIpAddress; 
            private String secondaryPublicIpId; 

            /**
             * <p>The subnet mask of the CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder cidrMask(Integer cidrMask) {
                this.cidrMask = cidrMask;
                return this;
            }

            /**
             * <p>The time when the secondary public IP address was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-25T09:43:49Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-15</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>12.XXX.XXX.1</p>
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * <p>The version of the IP address. Valid values:</p>
             * <ul>
             * <li><strong>ipv4</strong></li>
             * <li><strong>ipv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The Internet service provider. Valid values:</p>
             * <ul>
             * <li>cmcc: China Mobile.</li>
             * <li>unicom: China Unicom.</li>
             * <li>telecom: China Telecom.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>telecom</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The secondary public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>12.XXX.XXX.4</p>
             */
            public Builder secondaryPublicIpAddress(String secondaryPublicIpAddress) {
                this.secondaryPublicIpAddress = secondaryPublicIpAddress;
                return this;
            }

            /**
             * <p>The ID of the secondary public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>spi-5wys0pio93c9f9ukzj2f2fwyr</p>
             */
            public Builder secondaryPublicIpId(String secondaryPublicIpId) {
                this.secondaryPublicIpId = secondaryPublicIpId;
                return this;
            }

            public SecondaryPublicIpAddresses build() {
                return new SecondaryPublicIpAddresses(this);
            } 

        } 

    }
}
