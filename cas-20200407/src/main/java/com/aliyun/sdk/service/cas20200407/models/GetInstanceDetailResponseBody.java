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
 * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceDetailResponseBody</p>
 */
public class GetInstanceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoReissue")
    private String autoReissue;

    @com.aliyun.core.annotation.NameInMap("AutoReissueFlag")
    private Integer autoReissueFlag;

    @com.aliyun.core.annotation.NameInMap("AverageWaitingTime")
    private String averageWaitingTime;

    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private Integer certificateId;

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

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("ContactIdList")
    private java.util.List<Long> contactIdList;

    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.NameInMap("DeploymentResourceCount")
    private Integer deploymentResourceCount;

    @com.aliyun.core.annotation.NameInMap("DeploymentUseCount")
    private Integer deploymentUseCount;

    @com.aliyun.core.annotation.NameInMap("DingGroupList")
    private java.util.List<DingGroupList> dingGroupList;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("DomainValidationList")
    private java.util.List<DomainValidationList> domainValidationList;

    @com.aliyun.core.annotation.NameInMap("FullDomainCount")
    private Integer fullDomainCount;

    @com.aliyun.core.annotation.NameInMap("GenerateCsrMethod")
    private String generateCsrMethod;

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

    @com.aliyun.core.annotation.NameInMap("MonitorExpandFlag")
    private Integer monitorExpandFlag;

    @com.aliyun.core.annotation.NameInMap("MonitorUseCount")
    private Integer monitorUseCount;

    @com.aliyun.core.annotation.NameInMap("OrderEndTime")
    private Long orderEndTime;

    @com.aliyun.core.annotation.NameInMap("OrderStartTime")
    private Long orderStartTime;

    @com.aliyun.core.annotation.NameInMap("PendingResult")
    private String pendingResult;

    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TotalDeploymentCount")
    private Integer totalDeploymentCount;

    @com.aliyun.core.annotation.NameInMap("TotalMonitorCount")
    private Integer totalMonitorCount;

    @com.aliyun.core.annotation.NameInMap("UpgradeStatus")
    private String upgradeStatus;

    @com.aliyun.core.annotation.NameInMap("ValidationMethod")
    private String validationMethod;

    @com.aliyun.core.annotation.NameInMap("VersionType")
    private String versionType;

    @com.aliyun.core.annotation.NameInMap("WildcardDomainCount")
    private Integer wildcardDomainCount;

    private GetInstanceDetailResponseBody(Builder builder) {
        this.autoReissue = builder.autoReissue;
        this.autoReissueFlag = builder.autoReissueFlag;
        this.averageWaitingTime = builder.averageWaitingTime;
        this.brand = builder.brand;
        this.certIdentifier = builder.certIdentifier;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.certificateNotAfter = builder.certificateNotAfter;
        this.certificateNotBefore = builder.certificateNotBefore;
        this.certificateRevokeTime = builder.certificateRevokeTime;
        this.certificateStatus = builder.certificateStatus;
        this.certificateType = builder.certificateType;
        this.city = builder.city;
        this.companyId = builder.companyId;
        this.contactIdList = builder.contactIdList;
        this.countryCode = builder.countryCode;
        this.csr = builder.csr;
        this.deploymentResourceCount = builder.deploymentResourceCount;
        this.deploymentUseCount = builder.deploymentUseCount;
        this.dingGroupList = builder.dingGroupList;
        this.domain = builder.domain;
        this.domainValidationList = builder.domainValidationList;
        this.fullDomainCount = builder.fullDomainCount;
        this.generateCsrMethod = builder.generateCsrMethod;
        this.instanceEndTime = builder.instanceEndTime;
        this.instanceId = builder.instanceId;
        this.instanceStartTime = builder.instanceStartTime;
        this.instanceType = builder.instanceType;
        this.keyAlgorithm = builder.keyAlgorithm;
        this.monitorExpandFlag = builder.monitorExpandFlag;
        this.monitorUseCount = builder.monitorUseCount;
        this.orderEndTime = builder.orderEndTime;
        this.orderStartTime = builder.orderStartTime;
        this.pendingResult = builder.pendingResult;
        this.province = builder.province;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.status = builder.status;
        this.tags = builder.tags;
        this.totalDeploymentCount = builder.totalDeploymentCount;
        this.totalMonitorCount = builder.totalMonitorCount;
        this.upgradeStatus = builder.upgradeStatus;
        this.validationMethod = builder.validationMethod;
        this.versionType = builder.versionType;
        this.wildcardDomainCount = builder.wildcardDomainCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoReissue
     */
    public String getAutoReissue() {
        return this.autoReissue;
    }

    /**
     * @return autoReissueFlag
     */
    public Integer getAutoReissueFlag() {
        return this.autoReissueFlag;
    }

    /**
     * @return averageWaitingTime
     */
    public String getAverageWaitingTime() {
        return this.averageWaitingTime;
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
     * @return certificateId
     */
    public Integer getCertificateId() {
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
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return contactIdList
     */
    public java.util.List<Long> getContactIdList() {
        return this.contactIdList;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return deploymentResourceCount
     */
    public Integer getDeploymentResourceCount() {
        return this.deploymentResourceCount;
    }

    /**
     * @return deploymentUseCount
     */
    public Integer getDeploymentUseCount() {
        return this.deploymentUseCount;
    }

    /**
     * @return dingGroupList
     */
    public java.util.List<DingGroupList> getDingGroupList() {
        return this.dingGroupList;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainValidationList
     */
    public java.util.List<DomainValidationList> getDomainValidationList() {
        return this.domainValidationList;
    }

    /**
     * @return fullDomainCount
     */
    public Integer getFullDomainCount() {
        return this.fullDomainCount;
    }

    /**
     * @return generateCsrMethod
     */
    public String getGenerateCsrMethod() {
        return this.generateCsrMethod;
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
     * @return monitorExpandFlag
     */
    public Integer getMonitorExpandFlag() {
        return this.monitorExpandFlag;
    }

    /**
     * @return monitorUseCount
     */
    public Integer getMonitorUseCount() {
        return this.monitorUseCount;
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
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return totalDeploymentCount
     */
    public Integer getTotalDeploymentCount() {
        return this.totalDeploymentCount;
    }

    /**
     * @return totalMonitorCount
     */
    public Integer getTotalMonitorCount() {
        return this.totalMonitorCount;
    }

    /**
     * @return upgradeStatus
     */
    public String getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /**
     * @return validationMethod
     */
    public String getValidationMethod() {
        return this.validationMethod;
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
        private Integer autoReissueFlag; 
        private String averageWaitingTime; 
        private String brand; 
        private String certIdentifier; 
        private Integer certificateId; 
        private String certificateName; 
        private Long certificateNotAfter; 
        private Long certificateNotBefore; 
        private Long certificateRevokeTime; 
        private String certificateStatus; 
        private String certificateType; 
        private String city; 
        private Long companyId; 
        private java.util.List<Long> contactIdList; 
        private String countryCode; 
        private String csr; 
        private Integer deploymentResourceCount; 
        private Integer deploymentUseCount; 
        private java.util.List<DingGroupList> dingGroupList; 
        private String domain; 
        private java.util.List<DomainValidationList> domainValidationList; 
        private Integer fullDomainCount; 
        private String generateCsrMethod; 
        private Long instanceEndTime; 
        private String instanceId; 
        private Long instanceStartTime; 
        private String instanceType; 
        private String keyAlgorithm; 
        private Integer monitorExpandFlag; 
        private Integer monitorUseCount; 
        private Long orderEndTime; 
        private Long orderStartTime; 
        private String pendingResult; 
        private String province; 
        private String requestId; 
        private String resourceGroupId; 
        private String spec; 
        private String status; 
        private java.util.List<Tags> tags; 
        private Integer totalDeploymentCount; 
        private Integer totalMonitorCount; 
        private String upgradeStatus; 
        private String validationMethod; 
        private String versionType; 
        private Integer wildcardDomainCount; 

        private Builder() {
        } 

        private Builder(GetInstanceDetailResponseBody model) {
            this.autoReissue = model.autoReissue;
            this.autoReissueFlag = model.autoReissueFlag;
            this.averageWaitingTime = model.averageWaitingTime;
            this.brand = model.brand;
            this.certIdentifier = model.certIdentifier;
            this.certificateId = model.certificateId;
            this.certificateName = model.certificateName;
            this.certificateNotAfter = model.certificateNotAfter;
            this.certificateNotBefore = model.certificateNotBefore;
            this.certificateRevokeTime = model.certificateRevokeTime;
            this.certificateStatus = model.certificateStatus;
            this.certificateType = model.certificateType;
            this.city = model.city;
            this.companyId = model.companyId;
            this.contactIdList = model.contactIdList;
            this.countryCode = model.countryCode;
            this.csr = model.csr;
            this.deploymentResourceCount = model.deploymentResourceCount;
            this.deploymentUseCount = model.deploymentUseCount;
            this.dingGroupList = model.dingGroupList;
            this.domain = model.domain;
            this.domainValidationList = model.domainValidationList;
            this.fullDomainCount = model.fullDomainCount;
            this.generateCsrMethod = model.generateCsrMethod;
            this.instanceEndTime = model.instanceEndTime;
            this.instanceId = model.instanceId;
            this.instanceStartTime = model.instanceStartTime;
            this.instanceType = model.instanceType;
            this.keyAlgorithm = model.keyAlgorithm;
            this.monitorExpandFlag = model.monitorExpandFlag;
            this.monitorUseCount = model.monitorUseCount;
            this.orderEndTime = model.orderEndTime;
            this.orderStartTime = model.orderStartTime;
            this.pendingResult = model.pendingResult;
            this.province = model.province;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.spec = model.spec;
            this.status = model.status;
            this.tags = model.tags;
            this.totalDeploymentCount = model.totalDeploymentCount;
            this.totalMonitorCount = model.totalMonitorCount;
            this.upgradeStatus = model.upgradeStatus;
            this.validationMethod = model.validationMethod;
            this.versionType = model.versionType;
            this.wildcardDomainCount = model.wildcardDomainCount;
        } 

        /**
         * <p>Indicates whether automatic hosting is enabled. Valid values:</p>
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
         * <p>Indicates whether the current version includes automatic hosting. Valid values:</p>
         * <ul>
         * <li>1: Included.</li>
         * <li>0: Not included.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoReissueFlag(Integer autoReissueFlag) {
            this.autoReissueFlag = autoReissueFlag;
            return this;
        }

        /**
         * <p>The average waiting time for issuing a certificate of this specification. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder averageWaitingTime(String averageWaitingTime) {
            this.averageWaitingTime = averageWaitingTime;
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
         * <p>For example, if the certificate ID is 123, the CertIdentifier on the China site is &quot;123-cn-hangzhou&quot;, and the CertIdentifier on the International site is &quot;123-ap-southeast-1&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>22783111-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder certificateId(Integer certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The name of the instance. When a certificate is issued, this name is used as the default name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * <p>The end time of the latest certificate, in UNIX timestamp format. This value is empty if no certificate has been issued. The value is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        public Builder certificateNotAfter(Long certificateNotAfter) {
            this.certificateNotAfter = certificateNotAfter;
            return this;
        }

        /**
         * <p>The start time of the latest certificate, in UNIX timestamp format. This value is empty if no certificate has been issued. The value is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1781568000000</p>
         */
        public Builder certificateNotBefore(Long certificateNotBefore) {
            this.certificateNotBefore = certificateNotBefore;
            return this;
        }

        /**
         * <p>The revocation time of the latest certificate, in UNIX timestamp format. The value is accurate to the second.</p>
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
         * <p>The city where the company or organization of the certificate purchaser is located. This field is required when generating a certificate signing request. Default value: Beijing.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>The company information ID.</p>
         * 
         * <strong>example:</strong>
         * <p>47305</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>The list of contact IDs.</p>
         */
        public Builder contactIdList(java.util.List<Long> contactIdList) {
            this.contactIdList = contactIdList;
            return this;
        }

        /**
         * <p>The country or region code of the certificate organization. For example, CN indicates China, and US indicates the United States. This field is required when generating a certificate signing request. Default value: CN.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>The certificate signing request in PEM format.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * <p>The number of cloud resources to which the certificate has been deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder deploymentResourceCount(Integer deploymentResourceCount) {
            this.deploymentResourceCount = deploymentResourceCount;
            return this;
        }

        /**
         * <p>The used quota for cloud server deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder deploymentUseCount(Integer deploymentUseCount) {
            this.deploymentUseCount = deploymentUseCount;
            return this;
        }

        /**
         * <p>The list of associated expert service DingTalk groups.</p>
         */
        public Builder dingGroupList(java.util.List<DingGroupList> dingGroupList) {
            this.dingGroupList = dingGroupList;
            return this;
        }

        /**
         * <p>The domain name bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The list of domain names to be validated.</p>
         */
        public Builder domainValidationList(java.util.List<DomainValidationList> domainValidationList) {
            this.domainValidationList = domainValidationList;
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
         * <p>The method used to generate the certificate signing request. Valid values:</p>
         * <ul>
         * <li>online: System-generated. The Csr field is ignored.</li>
         * <li>upload: User-uploaded. The Csr field is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder generateCsrMethod(String generateCsrMethod) {
            this.generateCsrMethod = generateCsrMethod;
            return this;
        }

        /**
         * <p>The expiration time of the instance, in UNIX timestamp format. This value is empty if no certificate has been issued. The value is accurate to the second.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        public Builder instanceEndTime(Long instanceEndTime) {
            this.instanceEndTime = instanceEndTime;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cas_dv-cn-123</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The start time of the instance, in UNIX timestamp format. This value is empty if no certificate has been issued. The value is accurate to the second.</p>
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
         * <li>BUY: official certificate</li>
         * <li>TEST: test certificate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The certificate algorithm. Valid values:</p>
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
         * <p>Indicates whether the domain name monitoring quota can be expanded. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder monitorExpandFlag(Integer monitorExpandFlag) {
            this.monitorExpandFlag = monitorExpandFlag;
            return this;
        }

        /**
         * <p>The used quota for domain name monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder monitorUseCount(Integer monitorUseCount) {
            this.monitorUseCount = monitorUseCount;
            return this;
        }

        /**
         * <p>The end time of the instance at the time of purchase, in UNIX timestamp format. This value is used to determine the purchase duration of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1801324800000</p>
         */
        public Builder orderEndTime(Long orderEndTime) {
            this.orderEndTime = orderEndTime;
            return this;
        }

        /**
         * <p>The start time of the instance at the time of purchase, in UNIX timestamp format. This value is used to determine the refund time limit. The value is accurate to the second.</p>
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
         * <p>The province or region where the company is located. This field is required when generating a certificate signing request. Default value: Beijing.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B2CE1D02-6D5E-56E5-A9BD-EE288255C7F9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek****wia</p>
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
         * <li><strong>closed</strong>: Closed. The instance cannot be used.</li>
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
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The total quota for cloud server deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder totalDeploymentCount(Integer totalDeploymentCount) {
            this.totalDeploymentCount = totalDeploymentCount;
            return this;
        }

        /**
         * <p>The total quota for domain name monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder totalMonitorCount(Integer totalMonitorCount) {
            this.totalMonitorCount = totalMonitorCount;
            return this;
        }

        /**
         * <p>The upgrade status of the instance. Valid values:</p>
         * <ul>
         * <li><p>none: The instance has not been upgraded.</p>
         * </li>
         * <li><p>payed: The instance upgrade has been paid.</p>
         * </li>
         * <li><p>issued: The latest certificate has been issued for the instance upgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder upgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }

        /**
         * <p>The validation method for the certificate application. Valid values:</p>
         * <ul>
         * <li>DNS: DNS validation, using TXT or CNAME records.</li>
         * <li>HTTP: File-based validation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DNS</p>
         */
        public Builder validationMethod(String validationMethod) {
            this.validationMethod = validationMethod;
            return this;
        }

        /**
         * <p>The version type. Valid values: FOTA: system upgrade. APP: application upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public GetInstanceDetailResponseBody build() {
            return new GetInstanceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
     */
    public static class DingGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingGroupInstanceId")
        private String dingGroupInstanceId;

        @com.aliyun.core.annotation.NameInMap("DingGroupName")
        private String dingGroupName;

        @com.aliyun.core.annotation.NameInMap("DingGroupType")
        private String dingGroupType;

        @com.aliyun.core.annotation.NameInMap("DingGroupUrl")
        private String dingGroupUrl;

        private DingGroupList(Builder builder) {
            this.dingGroupInstanceId = builder.dingGroupInstanceId;
            this.dingGroupName = builder.dingGroupName;
            this.dingGroupType = builder.dingGroupType;
            this.dingGroupUrl = builder.dingGroupUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingGroupList create() {
            return builder().build();
        }

        /**
         * @return dingGroupInstanceId
         */
        public String getDingGroupInstanceId() {
            return this.dingGroupInstanceId;
        }

        /**
         * @return dingGroupName
         */
        public String getDingGroupName() {
            return this.dingGroupName;
        }

        /**
         * @return dingGroupType
         */
        public String getDingGroupType() {
            return this.dingGroupType;
        }

        /**
         * @return dingGroupUrl
         */
        public String getDingGroupUrl() {
            return this.dingGroupUrl;
        }

        public static final class Builder {
            private String dingGroupInstanceId; 
            private String dingGroupName; 
            private String dingGroupType; 
            private String dingGroupUrl; 

            private Builder() {
            } 

            private Builder(DingGroupList model) {
                this.dingGroupInstanceId = model.dingGroupInstanceId;
                this.dingGroupName = model.dingGroupName;
                this.dingGroupType = model.dingGroupType;
                this.dingGroupUrl = model.dingGroupUrl;
            } 

            /**
             * <p>The instance ID of the expert service DingTalk group.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder dingGroupInstanceId(String dingGroupInstanceId) {
                this.dingGroupInstanceId = dingGroupInstanceId;
                return this;
            }

            /**
             * <p>The name of the expert service DingTalk group.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder dingGroupName(String dingGroupName) {
                this.dingGroupName = dingGroupName;
                return this;
            }

            /**
             * <p>The type of the expert service DingTalk group. Valid values:</p>
             * <ul>
             * <li>expedite: application assistance</li>
             * <li>remote: offline deployment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remote</p>
             */
            public Builder dingGroupType(String dingGroupType) {
                this.dingGroupType = dingGroupType;
                return this;
            }

            /**
             * <p>The URL for joining the expert service DingTalk group.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://123.com">https://123.com</a></p>
             */
            public Builder dingGroupUrl(String dingGroupUrl) {
                this.dingGroupUrl = dingGroupUrl;
                return this;
            }

            public DingGroupList build() {
                return new DingGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
     */
    public static class DomainValidationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("CnameKey")
        private String cnameKey;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RootDomain")
        private String rootDomain;

        @com.aliyun.core.annotation.NameInMap("ValidationKey")
        private String validationKey;

        @com.aliyun.core.annotation.NameInMap("ValidationType")
        private String validationType;

        @com.aliyun.core.annotation.NameInMap("ValidationValue")
        private String validationValue;

        private DomainValidationList(Builder builder) {
            this.cname = builder.cname;
            this.cnameKey = builder.cnameKey;
            this.domain = builder.domain;
            this.rootDomain = builder.rootDomain;
            this.validationKey = builder.validationKey;
            this.validationType = builder.validationType;
            this.validationValue = builder.validationValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainValidationList create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return cnameKey
         */
        public String getCnameKey() {
            return this.cnameKey;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return rootDomain
         */
        public String getRootDomain() {
            return this.rootDomain;
        }

        /**
         * @return validationKey
         */
        public String getValidationKey() {
            return this.validationKey;
        }

        /**
         * @return validationType
         */
        public String getValidationType() {
            return this.validationType;
        }

        /**
         * @return validationValue
         */
        public String getValidationValue() {
            return this.validationValue;
        }

        public static final class Builder {
            private String cname; 
            private String cnameKey; 
            private String domain; 
            private String rootDomain; 
            private String validationKey; 
            private String validationType; 
            private String validationValue; 

            private Builder() {
            } 

            private Builder(DomainValidationList model) {
                this.cname = model.cname;
                this.cnameKey = model.cnameKey;
                this.domain = model.domain;
                this.rootDomain = model.rootDomain;
                this.validationKey = model.validationKey;
                this.validationType = model.validationType;
                this.validationValue = model.validationValue;
            } 

            /**
             * <p>The CNAME record value for verification-free authorization. This value may be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>123.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The prefix for CNAME validation.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder cnameKey(String cnameKey) {
                this.cnameKey = cnameKey;
                return this;
            }

            /**
             * <p>The domain name to be validated.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The root domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder rootDomain(String rootDomain) {
                this.rootDomain = rootDomain;
                return this;
            }

            /**
             * <p>The host record.</p>
             * 
             * <strong>example:</strong>
             * <p>@</p>
             */
            public Builder validationKey(String validationKey) {
                this.validationKey = validationKey;
                return this;
            }

            /**
             * <p>The validation type. Valid values: TXT, HTTP, and CNAME.</p>
             * 
             * <strong>example:</strong>
             * <p>TXT</p>
             */
            public Builder validationType(String validationType) {
                this.validationType = validationType;
                return this;
            }

            /**
             * <p>The host record value for validation.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder validationValue(String validationValue) {
                this.validationValue = validationValue;
                return this;
            }

            public DomainValidationList build() {
                return new DomainValidationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceDetailResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
