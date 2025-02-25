// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListUserCertificateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserCertificateOrderResponseBody</p>
 */
public class ListUserCertificateOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateOrderList")
    private java.util.List<CertificateOrderList> certificateOrderList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Long showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListUserCertificateOrderResponseBody(Builder builder) {
        this.certificateOrderList = builder.certificateOrderList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserCertificateOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificateOrderList
     */
    public java.util.List<CertificateOrderList> getCertificateOrderList() {
        return this.certificateOrderList;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CertificateOrderList> certificateOrderList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * <p>The certificates and orders.</p>
         */
        public Builder certificateOrderList(java.util.List<CertificateOrderList> certificateOrderList) {
            this.certificateOrderList = certificateOrderList;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserCertificateOrderResponseBody build() {
            return new ListUserCertificateOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserCertificateOrderResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserCertificateOrderResponseBody</p>
     */
    public static class CertificateOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private String algorithm;

        @com.aliyun.core.annotation.NameInMap("AliyunOrderId")
        private Long aliyunOrderId;

        @com.aliyun.core.annotation.NameInMap("BuyDate")
        private Long buyDate;

        @com.aliyun.core.annotation.NameInMap("CertEndTime")
        private Long certEndTime;

        @com.aliyun.core.annotation.NameInMap("CertStartTime")
        private Long certStartTime;

        @com.aliyun.core.annotation.NameInMap("CertType")
        private String certType;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private Long certificateId;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainCount")
        private Long domainCount;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        @com.aliyun.core.annotation.NameInMap("PartnerOrderId")
        private String partnerOrderId;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RootBrand")
        private String rootBrand;

        @com.aliyun.core.annotation.NameInMap("Sans")
        private String sans;

        @com.aliyun.core.annotation.NameInMap("SerialNo")
        private String serialNo;

        @com.aliyun.core.annotation.NameInMap("Sha2")
        private String sha2;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrusteeStatus")
        private String trusteeStatus;

        @com.aliyun.core.annotation.NameInMap("Upload")
        private Boolean upload;

        @com.aliyun.core.annotation.NameInMap("WildDomainCount")
        private Long wildDomainCount;

        private CertificateOrderList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.aliyunOrderId = builder.aliyunOrderId;
            this.buyDate = builder.buyDate;
            this.certEndTime = builder.certEndTime;
            this.certStartTime = builder.certStartTime;
            this.certType = builder.certType;
            this.certificateId = builder.certificateId;
            this.city = builder.city;
            this.commonName = builder.commonName;
            this.country = builder.country;
            this.domain = builder.domain;
            this.domainCount = builder.domainCount;
            this.domainType = builder.domainType;
            this.endDate = builder.endDate;
            this.expired = builder.expired;
            this.fingerprint = builder.fingerprint;
            this.instanceId = builder.instanceId;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.orderId = builder.orderId;
            this.orgName = builder.orgName;
            this.partnerOrderId = builder.partnerOrderId;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.province = builder.province;
            this.resourceGroupId = builder.resourceGroupId;
            this.rootBrand = builder.rootBrand;
            this.sans = builder.sans;
            this.serialNo = builder.serialNo;
            this.sha2 = builder.sha2;
            this.sourceType = builder.sourceType;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.trusteeStatus = builder.trusteeStatus;
            this.upload = builder.upload;
            this.wildDomainCount = builder.wildDomainCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertificateOrderList create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return aliyunOrderId
         */
        public Long getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        /**
         * @return buyDate
         */
        public Long getBuyDate() {
            return this.buyDate;
        }

        /**
         * @return certEndTime
         */
        public Long getCertEndTime() {
            return this.certEndTime;
        }

        /**
         * @return certStartTime
         */
        public Long getCertStartTime() {
            return this.certStartTime;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return certificateId
         */
        public Long getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainCount
         */
        public Long getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        /**
         * @return partnerOrderId
         */
        public String getPartnerOrderId() {
            return this.partnerOrderId;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return rootBrand
         */
        public String getRootBrand() {
            return this.rootBrand;
        }

        /**
         * @return sans
         */
        public String getSans() {
            return this.sans;
        }

        /**
         * @return serialNo
         */
        public String getSerialNo() {
            return this.serialNo;
        }

        /**
         * @return sha2
         */
        public String getSha2() {
            return this.sha2;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trusteeStatus
         */
        public String getTrusteeStatus() {
            return this.trusteeStatus;
        }

        /**
         * @return upload
         */
        public Boolean getUpload() {
            return this.upload;
        }

        /**
         * @return wildDomainCount
         */
        public Long getWildDomainCount() {
            return this.wildDomainCount;
        }

        public static final class Builder {
            private String algorithm; 
            private Long aliyunOrderId; 
            private Long buyDate; 
            private Long certEndTime; 
            private Long certStartTime; 
            private String certType; 
            private Long certificateId; 
            private String city; 
            private String commonName; 
            private String country; 
            private String domain; 
            private Long domainCount; 
            private String domainType; 
            private String endDate; 
            private Boolean expired; 
            private String fingerprint; 
            private String instanceId; 
            private String issuer; 
            private String name; 
            private Long orderId; 
            private String orgName; 
            private String partnerOrderId; 
            private String productCode; 
            private String productName; 
            private String province; 
            private String resourceGroupId; 
            private String rootBrand; 
            private String sans; 
            private String serialNo; 
            private String sha2; 
            private String sourceType; 
            private String startDate; 
            private String status; 
            private String trusteeStatus; 
            private Boolean upload; 
            private Long wildDomainCount; 

            /**
             * <p>The algorithm. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>234567</p>
             */
            public Builder aliyunOrderId(Long aliyunOrderId) {
                this.aliyunOrderId = aliyunOrderId;
                return this;
            }

            /**
             * <p>The time at which the order was placed. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>1634283958000</p>
             */
            public Builder buyDate(Long buyDate) {
                this.buyDate = buyDate;
                return this;
            }

            /**
             * <p>The time at which the certificate expires. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder certEndTime(Long certEndTime) {
                this.certEndTime = certEndTime;
                return this;
            }

            /**
             * <p>The time at which the certificate starts to take effect. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>1665819958000</p>
             */
            public Builder certStartTime(Long certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * <p>The type of the certificate. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
             * <ul>
             * <li><strong>DV</strong>: domain validated (DV) certificate</li>
             * <li><strong>EV</strong>: extended validation (EV) certificate</li>
             * <li><strong>OV</strong>: organization validated (OV) certificate <strong>FREE</strong>: free certificate, available only on the China site (aliyun.com)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FREE</p>
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * <p>The ID of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>896521</p>
             */
            public Builder certificateId(Long certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The city in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The parent domain name of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The code of the country in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The domain name. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The total number of domain names that can be bound to the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * <p>The type of the domain name. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
             * <ul>
             * <li><strong>ONE</strong>: single domain name</li>
             * <li><strong>MULTIPLE</strong>: multiple domain names</li>
             * <li><strong>WILDCARD</strong>: single wildcard domain name</li>
             * <li><strong>M_WILDCARD</strong>: multiple wildcard domain names</li>
             * <li><strong>MIX</strong>: hybrid domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONE</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The time at which the certificate expires. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-17</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>Indicates whether the certificate expires. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The fingerprint of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>CC6B3696E7C7CA715BD26E28E45FF3E3DF435C03</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cas-instanceId</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The issuer of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>MyIssuer</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The name of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The order ID. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>2345687</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The name of the organization that is associated with the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud</p>
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * <p>The ID of the third-party certificate authority (CA) order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-123456</p>
             */
            public Builder partnerOrderId(String partnerOrderId) {
                this.partnerOrderId = partnerOrderId;
                return this;
            }

            /**
             * <p>The specification ID of the order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>bykj123456</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The specification name of the order. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>CFCA</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The province or autonomous region in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The ID of the resource group. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-ae******4wia</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The brand of the certificate. Valid values: WoSign, CFCA, DigiCert, and vTrus. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>CFCA</p>
             */
            public Builder rootBrand(String rootBrand) {
                this.rootBrand = rootBrand;
                return this;
            }

            /**
             * <p>All domain names that are bound to the certificate. Multiple domain names are separated by commas (,). This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.com</p>
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * <p>The serial number of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>040a6e493cffdda6d744acf99b6576cf</p>
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            /**
             * <p>The SHA-2 value of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>56B4DED2243A81DD909D7C39824FFE4DDBD87F91BFA46CD333FF212FE0E7CB11</p>
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * <p>The type of the order. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
             * <ul>
             * <li><strong>cpack</strong>: virtual resource order</li>
             * <li><strong>buy</strong>: purchase order</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>buy</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The time at which the certificate starts to take effect. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-16</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The certificate status of the order. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
             * <ul>
             * <li><strong>PAYED</strong>: pending application</li>
             * <li><strong>CHECKING</strong>: reviewing</li>
             * <li><strong>CHECKED_FAIL</strong>: review failed</li>
             * <li><strong>ISSUED</strong>: issued</li>
             * <li><strong>WILLEXPIRED</strong>: about to expire</li>
             * <li><strong>EXPIRED</strong>: expired</li>
             * <li><strong>NOTACTIVATED</strong>: not activated</li>
             * <li><strong>REVOKED</strong>: revoked</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PAYED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The hosting status of the certificate. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:</p>
             * <ul>
             * <li><strong>unTrustee</strong>: not hosted</li>
             * <li><strong>trustee</strong>: hosted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unTrustee</p>
             */
            public Builder trusteeStatus(String trusteeStatus) {
                this.trusteeStatus = trusteeStatus;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is an uploaded certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder upload(Boolean upload) {
                this.upload = upload;
                return this;
            }

            /**
             * <p>The number of wildcard domain names that can be bound to the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder wildDomainCount(Long wildDomainCount) {
                this.wildDomainCount = wildDomainCount;
                return this;
            }

            public CertificateOrderList build() {
                return new CertificateOrderList(this);
            } 

        } 

    }
}
