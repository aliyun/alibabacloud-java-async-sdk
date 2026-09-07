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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("DisableReissueCount")
    private Long disableReissueCount;

    @com.aliyun.core.annotation.NameInMap("EnableReissueCount")
    private Long enableReissueCount;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.disableReissueCount = builder.disableReissueCount;
        this.enableReissueCount = builder.enableReissueCount;
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return disableReissueCount
     */
    public Long getDisableReissueCount() {
        return this.disableReissueCount;
    }

    /**
     * @return enableReissueCount
     */
    public Long getEnableReissueCount() {
        return this.enableReissueCount;
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
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
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Long disableReissueCount; 
        private Long enableReissueCount; 
        private java.util.List<InstanceList> instanceList; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListInstancesResponseBody model) {
            this.currentPage = model.currentPage;
            this.disableReissueCount = model.disableReissueCount;
            this.enableReissueCount = model.enableReissueCount;
            this.instanceList = model.instanceList;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of instances for which managed renewal is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder disableReissueCount(Long disableReissueCount) {
            this.disableReissueCount = disableReissueCount;
            return this;
        }

        /**
         * <p>The number of instances for which managed renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder enableReissueCount(Long enableReissueCount) {
            this.enableReissueCount = enableReissueCount;
            return this;
        }

        /**
         * <p>The list of instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789ABC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of records displayed per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReissue")
        private String autoReissue;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertificateDomain")
        private String certificateDomain;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private Long certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateNotAfter")
        private Long certificateNotAfter;

        @com.aliyun.core.annotation.NameInMap("CertificateNotBefore")
        private Long certificateNotBefore;

        @com.aliyun.core.annotation.NameInMap("CertificateRevokeTime")
        private Long certificateRevokeTime;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("FullDomainCount")
        private Integer fullDomainCount;

        @com.aliyun.core.annotation.NameInMap("InstanceEndTime")
        private Long instanceEndTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStartTime")
        private Long instanceStartTime;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("KeyAlgorithm")
        private String keyAlgorithm;

        @com.aliyun.core.annotation.NameInMap("OrderEndTime")
        private Long orderEndTime;

        @com.aliyun.core.annotation.NameInMap("OrderStartTime")
        private Long orderStartTime;

        @com.aliyun.core.annotation.NameInMap("PendingResult")
        private String pendingResult;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UsingProductList")
        private java.util.List<String> usingProductList;

        @com.aliyun.core.annotation.NameInMap("VersionType")
        private String versionType;

        @com.aliyun.core.annotation.NameInMap("WildcardDomainCount")
        private Integer wildcardDomainCount;

        private InstanceList(Builder builder) {
            this.autoReissue = builder.autoReissue;
            this.brand = builder.brand;
            this.certIdentifier = builder.certIdentifier;
            this.certificateDomain = builder.certificateDomain;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.certificateNotAfter = builder.certificateNotAfter;
            this.certificateNotBefore = builder.certificateNotBefore;
            this.certificateRevokeTime = builder.certificateRevokeTime;
            this.certificateStatus = builder.certificateStatus;
            this.certificateType = builder.certificateType;
            this.domain = builder.domain;
            this.fullDomainCount = builder.fullDomainCount;
            this.instanceEndTime = builder.instanceEndTime;
            this.instanceId = builder.instanceId;
            this.instanceStartTime = builder.instanceStartTime;
            this.instanceType = builder.instanceType;
            this.keyAlgorithm = builder.keyAlgorithm;
            this.orderEndTime = builder.orderEndTime;
            this.orderStartTime = builder.orderStartTime;
            this.pendingResult = builder.pendingResult;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.usingProductList = builder.usingProductList;
            this.versionType = builder.versionType;
            this.wildcardDomainCount = builder.wildcardDomainCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return autoReissue
         */
        public String getAutoReissue() {
            return this.autoReissue;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certificateDomain
         */
        public String getCertificateDomain() {
            return this.certificateDomain;
        }

        /**
         * @return certificateId
         */
        public Long getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateNotAfter
         */
        public Long getCertificateNotAfter() {
            return this.certificateNotAfter;
        }

        /**
         * @return certificateNotBefore
         */
        public Long getCertificateNotBefore() {
            return this.certificateNotBefore;
        }

        /**
         * @return certificateRevokeTime
         */
        public Long getCertificateRevokeTime() {
            return this.certificateRevokeTime;
        }

        /**
         * @return certificateStatus
         */
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return fullDomainCount
         */
        public Integer getFullDomainCount() {
            return this.fullDomainCount;
        }

        /**
         * @return instanceEndTime
         */
        public Long getInstanceEndTime() {
            return this.instanceEndTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStartTime
         */
        public Long getInstanceStartTime() {
            return this.instanceStartTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return keyAlgorithm
         */
        public String getKeyAlgorithm() {
            return this.keyAlgorithm;
        }

        /**
         * @return orderEndTime
         */
        public Long getOrderEndTime() {
            return this.orderEndTime;
        }

        /**
         * @return orderStartTime
         */
        public Long getOrderStartTime() {
            return this.orderStartTime;
        }

        /**
         * @return pendingResult
         */
        public String getPendingResult() {
            return this.pendingResult;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usingProductList
         */
        public java.util.List<String> getUsingProductList() {
            return this.usingProductList;
        }

        /**
         * @return versionType
         */
        public String getVersionType() {
            return this.versionType;
        }

        /**
         * @return wildcardDomainCount
         */
        public Integer getWildcardDomainCount() {
            return this.wildcardDomainCount;
        }

        public static final class Builder {
            private String autoReissue; 
            private String brand; 
            private String certIdentifier; 
            private String certificateDomain; 
            private Long certificateId; 
            private String certificateName; 
            private Long certificateNotAfter; 
            private Long certificateNotBefore; 
            private Long certificateRevokeTime; 
            private String certificateStatus; 
            private String certificateType; 
            private String domain; 
            private Integer fullDomainCount; 
            private Long instanceEndTime; 
            private String instanceId; 
            private Long instanceStartTime; 
            private String instanceType; 
            private String keyAlgorithm; 
            private Long orderEndTime; 
            private Long orderStartTime; 
            private String pendingResult; 
            private String resourceGroupId; 
            private String spec; 
            private String status; 
            private java.util.List<String> usingProductList; 
            private String versionType; 
            private Integer wildcardDomainCount; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.autoReissue = model.autoReissue;
                this.brand = model.brand;
                this.certIdentifier = model.certIdentifier;
                this.certificateDomain = model.certificateDomain;
                this.certificateId = model.certificateId;
                this.certificateName = model.certificateName;
                this.certificateNotAfter = model.certificateNotAfter;
                this.certificateNotBefore = model.certificateNotBefore;
                this.certificateRevokeTime = model.certificateRevokeTime;
                this.certificateStatus = model.certificateStatus;
                this.certificateType = model.certificateType;
                this.domain = model.domain;
                this.fullDomainCount = model.fullDomainCount;
                this.instanceEndTime = model.instanceEndTime;
                this.instanceId = model.instanceId;
                this.instanceStartTime = model.instanceStartTime;
                this.instanceType = model.instanceType;
                this.keyAlgorithm = model.keyAlgorithm;
                this.orderEndTime = model.orderEndTime;
                this.orderStartTime = model.orderStartTime;
                this.pendingResult = model.pendingResult;
                this.resourceGroupId = model.resourceGroupId;
                this.spec = model.spec;
                this.status = model.status;
                this.usingProductList = model.usingProductList;
                this.versionType = model.versionType;
                this.wildcardDomainCount = model.wildcardDomainCount;
            } 

            /**
             * <p>Indicates whether automatic managed renewal is enabled. Valid values:</p>
             * <ul>
             * <li>enable: Enabled.</li>
             * <li>disable: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder autoReissue(String autoReissue) {
                this.autoReissue = autoReissue;
                return this;
            }

            /**
             * <p>The CA brand. Valid values: WoSign, CFCA, DigiCert, GeoTrust, GlobalSign, vTrus, and Alibaba.</p>
             * 
             * <strong>example:</strong>
             * <p>DigiCert</p>
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * <p>The global certificate ID, in the format of certificate ID + &quot;-&quot; + site region ID. This ID is commonly used across Alibaba Cloud services.</p>
             * <ul>
             * <li>China site: certificate ID + &quot;-cn-hangzhou&quot;</li>
             * <li>International site: certificate ID + &quot;-ap-southeast-1&quot;</li>
             * </ul>
             * <p>For example, if the certificate ID is 123, the CertIdentifier on the China site is &quot;123-cn-hangzhou&quot;, and the CertIdentifier on the international site is &quot;123-ap-southeast-1&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>21795675-cn-hangzhou</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The domain name of the latest issued certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>abc.com,<a href="http://www.abc.com">www.abc.com</a></p>
             */
            public Builder certificateDomain(String certificateDomain) {
                this.certificateDomain = certificateDomain;
                return this;
            }

            /**
             * <p>The certificate ID.</p>
             * 
             * <strong>example:</strong>
             * <p>18541349</p>
             */
            public Builder certificateId(Long certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The certificate name.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-13216408</p>
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * <p>The end time of the latest certificate. The value is a UNIX timestamp in seconds. This field is empty if no certificate has been issued.</p>
             * 
             * <strong>example:</strong>
             * <p>1801324800000</p>
             */
            public Builder certificateNotAfter(Long certificateNotAfter) {
                this.certificateNotAfter = certificateNotAfter;
                return this;
            }

            /**
             * <p>The start time of the latest certificate. The value is a UNIX timestamp in seconds. This field is empty if no certificate has been issued.</p>
             * 
             * <strong>example:</strong>
             * <p>1776988800000</p>
             */
            public Builder certificateNotBefore(Long certificateNotBefore) {
                this.certificateNotBefore = certificateNotBefore;
                return this;
            }

            /**
             * <p>The revocation time of the latest certificate. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1801324800000</p>
             */
            public Builder certificateRevokeTime(Long certificateRevokeTime) {
                this.certificateRevokeTime = certificateRevokeTime;
                return this;
            }

            /**
             * <p>The status of the certificate. Valid values:</p>
             * <ul>
             * <li><strong>issued</strong>: Issued.</li>
             * <li><strong>revoked</strong>: Revoked.</li>
             * <li><strong>willExpire</strong>: About to expire.</li>
             * <li><strong>expired</strong>: Expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>issued</p>
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
                return this;
            }

            /**
             * <p>The type of the certificate. Valid values: DV, OV, and EV.</p>
             * 
             * <strong>example:</strong>
             * <p>DV</p>
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * <p>The domain name bound to the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of exact-match domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fullDomainCount(Integer fullDomainCount) {
                this.fullDomainCount = fullDomainCount;
                return this;
            }

            /**
             * <p>The expiration time of the instance. The value is a UNIX timestamp in seconds. This field is empty if no certificate has been issued.</p>
             * 
             * <strong>example:</strong>
             * <p>1801324800000</p>
             */
            public Builder instanceEndTime(Long instanceEndTime) {
                this.instanceEndTime = instanceEndTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cas_dv-cn-123</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The start time of the instance. The value is a UNIX timestamp in seconds. This field is empty if no certificate has been issued.</p>
             * 
             * <strong>example:</strong>
             * <p>1801324800000</p>
             */
            public Builder instanceStartTime(Long instanceStartTime) {
                this.instanceStartTime = instanceStartTime;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>BUY: formal certificate.</li>
             * <li>TEST: test certificate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The certificate algorithm. Default value: RSA_2048. Valid values:</p>
             * <ul>
             * <li><strong>RSA_2048</strong></li>
             * <li><strong>RSA_3072</strong></li>
             * <li><strong>RSA_4096</strong></li>
             * <li><strong>ECC_256</strong></li>
             * <li><strong>SM2</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RSA_2048</p>
             */
            public Builder keyAlgorithm(String keyAlgorithm) {
                this.keyAlgorithm = keyAlgorithm;
                return this;
            }

            /**
             * <p>The end time when the instance was purchased. The value is a UNIX timestamp in seconds. This value is used to determine the purchase duration of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1801324800000</p>
             */
            public Builder orderEndTime(Long orderEndTime) {
                this.orderEndTime = orderEndTime;
                return this;
            }

            /**
             * <p>The start time when the instance was purchased. The value is a UNIX timestamp in seconds. This value is used to determine the refund time limit.</p>
             * 
             * <strong>example:</strong>
             * <p>1801324800000</p>
             */
            public Builder orderStartTime(Long orderStartTime) {
                this.orderStartTime = orderStartTime;
                return this;
            }

            /**
             * <p>The result returned by the CA during the last certificate operation.</p>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder pendingResult(String pendingResult) {
                this.pendingResult = pendingResult;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The purchased instance specification.</p>
             * 
             * <strong>example:</strong>
             * <p>ss.dv.t</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li><strong>inactive</strong>: Pending use.</li>
             * <li><strong>pending</strong>: Under review. The latest certificate is being reviewed.</li>
             * <li><strong>willExpire</strong>: The instance is about to expire.</li>
             * <li><strong>expired</strong>: The instance has expired.</li>
             * <li><strong>refund</strong>: Refunded.</li>
             * <li><strong>normal</strong>: Normal.</li>
             * <li><strong>closed</strong>: Closed. The instance is unavailable.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>inactive</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of cloud services to which the latest certificate is deployed.</p>
             */
            public Builder usingProductList(java.util.List<String> usingProductList) {
                this.usingProductList = usingProductList;
                return this;
            }

            /**
             * <p>The version type. Valid values:</p>
             * <ul>
             * <li>basic: Basic Edition.</li>
             * <li>standard: Standard Edition.</li>
             * <li>professional: Professional Edition.</li>
             * <li>ultimate: Ultimate Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>professional</p>
             */
            public Builder versionType(String versionType) {
                this.versionType = versionType;
                return this;
            }

            /**
             * <p>The number of wildcard domain names.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder wildcardDomainCount(Integer wildcardDomainCount) {
                this.wildcardDomainCount = wildcardDomainCount;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
