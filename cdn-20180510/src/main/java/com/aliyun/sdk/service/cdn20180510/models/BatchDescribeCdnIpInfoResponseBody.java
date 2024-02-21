// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDescribeCdnIpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDescribeCdnIpInfoResponseBody</p>
 */
public class BatchDescribeCdnIpInfoResponseBody extends TeaModel {
    @NameInMap("IpInfoList")
    private java.util.List < IpInfoList> ipInfoList;

    @NameInMap("RequestId")
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
         * The results about IP addresses returned.
         */
        public Builder ipInfoList(java.util.List < IpInfoList> ipInfoList) {
            this.ipInfoList = ipInfoList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchDescribeCdnIpInfoResponseBody build() {
            return new BatchDescribeCdnIpInfoResponseBody(this);
        } 

    } 

    public static class IpInfoList extends TeaModel {
        @NameInMap("CdnIp")
        private String cdnIp;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("IspName")
        private String ispName;

        @NameInMap("Province")
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
             * Indicates whether the IP address belongs to an Alibaba Cloud CDN point of presence (POP).
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder cdnIp(String cdnIp) {
                this.cdnIp = cdnIp;
                return this;
            }

            /**
             * The city to which the IP address belongs.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The country to which the IP address belongs.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The ISP to which the IP address belongs.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * The province to which the IP address belongs.
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
