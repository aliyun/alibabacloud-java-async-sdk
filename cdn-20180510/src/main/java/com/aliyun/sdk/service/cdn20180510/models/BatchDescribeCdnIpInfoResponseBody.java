// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDescribeCdnIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDescribeCdnIpInfoResponseBody</p>
 */
public class BatchDescribeCdnIpInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpInfoList")
    private java.util.List < IpInfoList> ipInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchDescribeCdnIpInfoResponseBody(Builder builder) {
        this.ipInfoList = builder.ipInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDescribeCdnIpInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipInfoList
     */
    public java.util.List < IpInfoList> getIpInfoList() {
        return this.ipInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < IpInfoList> ipInfoList; 
        private String requestId; 

        /**
         * <p>The results about IP addresses returned.</p>
         */
        public Builder ipInfoList(java.util.List < IpInfoList> ipInfoList) {
            this.ipInfoList = ipInfoList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>55ADD936-763F-5E1A-BF54-2EA3F6E94A52</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchDescribeCdnIpInfoResponseBody build() {
            return new BatchDescribeCdnIpInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchDescribeCdnIpInfoResponseBody} extends {@link TeaModel}
     *
     * <p>BatchDescribeCdnIpInfoResponseBody</p>
     */
    public static class IpInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnIp")
        private String cdnIp;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private IpInfoList(Builder builder) {
            this.cdnIp = builder.cdnIp;
            this.city = builder.city;
            this.country = builder.country;
            this.ipAddress = builder.ipAddress;
            this.ispName = builder.ispName;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpInfoList create() {
            return builder().build();
        }

        /**
         * @return cdnIp
         */
        public String getCdnIp() {
            return this.cdnIp;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String cdnIp; 
            private String city; 
            private String country; 
            private String ipAddress; 
            private String ispName; 
            private String province; 

            /**
             * <p>Indicates whether the IP address belongs to an Alibaba Cloud CDN point of presence (POP).</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cdnIp(String cdnIp) {
                this.cdnIp = cdnIp;
                return this;
            }

            /**
             * <p>The city to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The country to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>111.XXX.XXX.230</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The ISP to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Move</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>The province to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public IpInfoList build() {
                return new IpInfoList(this);
            } 

        } 

    }
}
