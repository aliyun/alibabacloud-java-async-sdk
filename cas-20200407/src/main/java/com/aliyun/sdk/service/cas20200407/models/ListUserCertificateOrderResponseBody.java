// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserCertificateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserCertificateOrderResponseBody</p>
 */
public class ListUserCertificateOrderResponseBody extends TeaModel {
    @NameInMap("CertificateOrderList")
    private java.util.List < CertificateOrderList> certificateOrderList;

    @NameInMap("CurrentPage")
    private Long currentPage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowSize")
    private Long showSize;

    @NameInMap("TotalCount")
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
    public java.util.List < CertificateOrderList> getCertificateOrderList() {
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
        private java.util.List < CertificateOrderList> certificateOrderList; 
        private Long currentPage; 
        private String requestId; 
        private Long showSize; 
        private Long totalCount; 

        /**
         * An array that consists of the information about the certificates and orders.
         */
        public Builder certificateOrderList(java.util.List < CertificateOrderList> certificateOrderList) {
            this.certificateOrderList = certificateOrderList;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder showSize(Long showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserCertificateOrderResponseBody build() {
            return new ListUserCertificateOrderResponseBody(this);
        } 

    } 

    public static class CertificateOrderList extends TeaModel {
        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("AliyunOrderId")
        private Long aliyunOrderId;

        @NameInMap("BuyDate")
        private Long buyDate;

        @NameInMap("CertEndTime")
        private Long certEndTime;

        @NameInMap("CertStartTime")
        private Long certStartTime;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("CertificateId")
        private Long certificateId;

        @NameInMap("City")
        private String city;

        @NameInMap("CommonName")
        private String commonName;

        @NameInMap("Country")
        private String country;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("DomainCount")
        private Long domainCount;

        @NameInMap("DomainType")
        private String domainType;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("Fingerprint")
        private String fingerprint;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Issuer")
        private String issuer;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("OrgName")
        private String orgName;

        @NameInMap("PartnerOrderId")
        private String partnerOrderId;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Province")
        private String province;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RootBrand")
        private String rootBrand;

        @NameInMap("Sans")
        private String sans;

        @NameInMap("SerialNo")
        private String serialNo;

        @NameInMap("Sha2")
        private String sha2;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("TrusteeStatus")
        private String trusteeStatus;

        @NameInMap("Upload")
        private Boolean upload;

        @NameInMap("WildDomainCount")
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
             * The algorithm. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud order. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder aliyunOrderId(Long aliyunOrderId) {
                this.aliyunOrderId = aliyunOrderId;
                return this;
            }

            /**
             * The time at which the order was placed. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder buyDate(Long buyDate) {
                this.buyDate = buyDate;
                return this;
            }

            /**
             * The time at which the certificate expires. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder certEndTime(Long certEndTime) {
                this.certEndTime = certEndTime;
                return this;
            }

            /**
             * The time at which the certificate starts to take effect. Unit: milliseconds. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder certStartTime(Long certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * The type of the certificate. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:
             * <p>
             * 
             * *   **DV**: domain validated (DV) certificate
             * *   **EV**: extended validation (EV) certificate
             * *   **OV**: organization validated (OV) certificate
             * *   **FREE**: free certificate
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The ID of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder certificateId(Long certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * The city in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * The parent domain name of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The code of the country in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * The domain name. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The total number of domain names that can be bound to the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * The type of the domain name. This parameter is returned only if OrderType is set to CPACK or BUY. Valid values:
             * <p>
             * 
             * *   **ONE**: single domain name
             * *   **MULTIPLE**: multiple domain names
             * *   **WILDCARD**: single wildcard domain name
             * *   **M_WILDCARD**: multiple wildcard domain names
             * *   **MIX**: hybrid domain name
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * The time at which the certificate expires. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * Indicates whether the certificate expires. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The fingerprint of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The issuer of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * The name of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The order ID. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The name of the organization that is associated with the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * The ID of the certificate authority (CA) order. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder partnerOrderId(String partnerOrderId) {
                this.partnerOrderId = partnerOrderId;
                return this;
            }

            /**
             * The specification ID of the order. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The specification name of the order. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * The name of the province or autonomous region in which the organization is located. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * The ID of the resource group. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The brand of the certificate. Valid values: WoSign, CFCA, DigiCert, and vTrus. This parameter is returned only if OrderType is set to CPACK or BUY.
             */
            public Builder rootBrand(String rootBrand) {
                this.rootBrand = rootBrand;
                return this;
            }

            /**
             * All domain names that are bound to the certificate. Multiple domain names are separated by commas (,). This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder sans(String sans) {
                this.sans = sans;
                return this;
            }

            /**
             * The serial number of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder serialNo(String serialNo) {
                this.serialNo = serialNo;
                return this;
            }

            /**
             * The SHA-2 value of the certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder sha2(String sha2) {
                this.sha2 = sha2;
                return this;
            }

            /**
             * The type of the order. This parameter is returned only if OrderType is set to CPACK or BUY.
             * <p>
             * 
             * *   **cpack**: virtual resource order
             * *   **buy**: purchase order
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The time at which the certificate starts to take effect. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * The certificate status of the order. This parameter is returned only if OrderType is set to CPACK or BUY.
             * <p>
             * 
             * *   **PAYED**: pending application
             * *   **CHECKING**: reviewing
             * *   **CHECKED_FAIL**: review failed
             * *   **ISSUED**: issued
             * *   **WILLEXPIRED**: about to expire
             * *   **EXPIRED**: expired
             * *   **NOTACTIVATED**: not activated
             * *   **REVOKED**: revoked
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The hosting status of the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.
             * <p>
             * 
             * *   **unTrustee**: not hosted
             * *   **trustee**: hosted
             */
            public Builder trusteeStatus(String trusteeStatus) {
                this.trusteeStatus = trusteeStatus;
                return this;
            }

            /**
             * Indicates whether the certificate is an uploaded certificate. This parameter is returned only if OrderType is set to CERT or UPLOAD.
             */
            public Builder upload(Boolean upload) {
                this.upload = upload;
                return this;
            }

            /**
             * The number of wildcard domain names that can be bound to the certificate. This parameter is returned only if OrderType is set to CPACK or BUY.
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
