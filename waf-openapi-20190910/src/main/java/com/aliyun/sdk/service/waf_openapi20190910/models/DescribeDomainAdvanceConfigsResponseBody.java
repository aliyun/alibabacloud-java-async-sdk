// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAdvanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainAdvanceConfigsResponseBody</p>
 */
public class DescribeDomainAdvanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private java.util.List < DomainConfigs> domainConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainAdvanceConfigsResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAdvanceConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigs
     */
    public java.util.List < DomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainConfigs> domainConfigs; 
        private String requestId; 

        /**
         * DomainConfigs.
         */
        public Builder domainConfigs(java.util.List < DomainConfigs> domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainAdvanceConfigsResponseBody build() {
            return new DescribeDomainAdvanceConfigsResponseBody(this);
        } 

    } 

    public static class Profile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertStatus")
        private Integer certStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("ExclusiveVipStatus")
        private Integer exclusiveVipStatus;

        @com.aliyun.core.annotation.NameInMap("GSLBStatus")
        private String GSLBStatus;

        @com.aliyun.core.annotation.NameInMap("Http2Port")
        private java.util.List < Integer > http2Port;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private java.util.List < Integer > httpPort;

        @com.aliyun.core.annotation.NameInMap("HttpsPort")
        private java.util.List < Integer > httpsPort;

        @com.aliyun.core.annotation.NameInMap("Ipv6Status")
        private Integer ipv6Status;

        @com.aliyun.core.annotation.NameInMap("ResolvedType")
        private Integer resolvedType;

        @com.aliyun.core.annotation.NameInMap("Rs")
        private java.util.List < String > rs;

        @com.aliyun.core.annotation.NameInMap("VipServiceStatus")
        private Integer vipServiceStatus;

        private Profile(Builder builder) {
            this.certStatus = builder.certStatus;
            this.clusterType = builder.clusterType;
            this.cname = builder.cname;
            this.exclusiveVipStatus = builder.exclusiveVipStatus;
            this.GSLBStatus = builder.GSLBStatus;
            this.http2Port = builder.http2Port;
            this.httpPort = builder.httpPort;
            this.httpsPort = builder.httpsPort;
            this.ipv6Status = builder.ipv6Status;
            this.resolvedType = builder.resolvedType;
            this.rs = builder.rs;
            this.vipServiceStatus = builder.vipServiceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profile create() {
            return builder().build();
        }

        /**
         * @return certStatus
         */
        public Integer getCertStatus() {
            return this.certStatus;
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return exclusiveVipStatus
         */
        public Integer getExclusiveVipStatus() {
            return this.exclusiveVipStatus;
        }

        /**
         * @return GSLBStatus
         */
        public String getGSLBStatus() {
            return this.GSLBStatus;
        }

        /**
         * @return http2Port
         */
        public java.util.List < Integer > getHttp2Port() {
            return this.http2Port;
        }

        /**
         * @return httpPort
         */
        public java.util.List < Integer > getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return httpsPort
         */
        public java.util.List < Integer > getHttpsPort() {
            return this.httpsPort;
        }

        /**
         * @return ipv6Status
         */
        public Integer getIpv6Status() {
            return this.ipv6Status;
        }

        /**
         * @return resolvedType
         */
        public Integer getResolvedType() {
            return this.resolvedType;
        }

        /**
         * @return rs
         */
        public java.util.List < String > getRs() {
            return this.rs;
        }

        /**
         * @return vipServiceStatus
         */
        public Integer getVipServiceStatus() {
            return this.vipServiceStatus;
        }

        public static final class Builder {
            private Integer certStatus; 
            private Integer clusterType; 
            private String cname; 
            private Integer exclusiveVipStatus; 
            private String GSLBStatus; 
            private java.util.List < Integer > http2Port; 
            private java.util.List < Integer > httpPort; 
            private java.util.List < Integer > httpsPort; 
            private Integer ipv6Status; 
            private Integer resolvedType; 
            private java.util.List < String > rs; 
            private Integer vipServiceStatus; 

            /**
             * CertStatus.
             */
            public Builder certStatus(Integer certStatus) {
                this.certStatus = certStatus;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * ExclusiveVipStatus.
             */
            public Builder exclusiveVipStatus(Integer exclusiveVipStatus) {
                this.exclusiveVipStatus = exclusiveVipStatus;
                return this;
            }

            /**
             * GSLBStatus.
             */
            public Builder GSLBStatus(String GSLBStatus) {
                this.GSLBStatus = GSLBStatus;
                return this;
            }

            /**
             * Http2Port.
             */
            public Builder http2Port(java.util.List < Integer > http2Port) {
                this.http2Port = http2Port;
                return this;
            }

            /**
             * HttpPort.
             */
            public Builder httpPort(java.util.List < Integer > httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * HttpsPort.
             */
            public Builder httpsPort(java.util.List < Integer > httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * Ipv6Status.
             */
            public Builder ipv6Status(Integer ipv6Status) {
                this.ipv6Status = ipv6Status;
                return this;
            }

            /**
             * ResolvedType.
             */
            public Builder resolvedType(Integer resolvedType) {
                this.resolvedType = resolvedType;
                return this;
            }

            /**
             * Rs.
             */
            public Builder rs(java.util.List < String > rs) {
                this.rs = rs;
                return this;
            }

            /**
             * VipServiceStatus.
             */
            public Builder vipServiceStatus(Integer vipServiceStatus) {
                this.vipServiceStatus = vipServiceStatus;
                return this;
            }

            public Profile build() {
                return new Profile(this);
            } 

        } 

    }
    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private Profile profile;

        private DomainConfigs(Builder builder) {
            this.domain = builder.domain;
            this.profile = builder.profile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigs create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return profile
         */
        public Profile getProfile() {
            return this.profile;
        }

        public static final class Builder {
            private String domain; 
            private Profile profile; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(Profile profile) {
                this.profile = profile;
                return this;
            }

            public DomainConfigs build() {
                return new DomainConfigs(this);
            } 

        } 

    }
}
