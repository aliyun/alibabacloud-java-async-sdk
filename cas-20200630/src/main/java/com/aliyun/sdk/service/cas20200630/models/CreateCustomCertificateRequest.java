// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link CreateCustomCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomCertificateRequest</p>
 */
public class CreateCustomCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiPassthrough")
    private ApiPassthrough apiPassthrough;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCrl")
    private Long enableCrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Immediately")
    private Integer immediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Validity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("customIdentifier")
    private String customIdentifier;

    private CreateCustomCertificateRequest(Builder builder) {
        super(builder);
        this.apiPassthrough = builder.apiPassthrough;
        this.csr = builder.csr;
        this.enableCrl = builder.enableCrl;
        this.immediately = builder.immediately;
        this.parentIdentifier = builder.parentIdentifier;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.validity = builder.validity;
        this.customIdentifier = builder.customIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiPassthrough
     */
    public ApiPassthrough getApiPassthrough() {
        return this.apiPassthrough;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return enableCrl
     */
    public Long getEnableCrl() {
        return this.enableCrl;
    }

    /**
     * @return immediately
     */
    public Integer getImmediately() {
        return this.immediately;
    }

    /**
     * @return parentIdentifier
     */
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return validity
     */
    public String getValidity() {
        return this.validity;
    }

    /**
     * @return customIdentifier
     */
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    public static final class Builder extends Request.Builder<CreateCustomCertificateRequest, Builder> {
        private ApiPassthrough apiPassthrough; 
        private String csr; 
        private Long enableCrl; 
        private Integer immediately; 
        private String parentIdentifier; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String validity; 
        private String customIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomCertificateRequest request) {
            super(request);
            this.apiPassthrough = request.apiPassthrough;
            this.csr = request.csr;
            this.enableCrl = request.enableCrl;
            this.immediately = request.immediately;
            this.parentIdentifier = request.parentIdentifier;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.validity = request.validity;
            this.customIdentifier = request.customIdentifier;
        } 

        /**
         * <p>Pass-through parameters.</p>
         */
        public Builder apiPassthrough(ApiPassthrough apiPassthrough) {
            this.putQueryParameter("ApiPassthrough", apiPassthrough);
            this.apiPassthrough = apiPassthrough;
            return this;
        }

        /**
         * <p>The content of the CSR. You can generate a CSR using tools such as OpenSSL or Keytool. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">Create a CSR file</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----
         * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
         * ...
         * ...
         * ...
         * vbIgMQIhAKHDWD6/WAMbtezAt4bysJ/BZIDz1jPWuUR5GV4TJ/mS
         * -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * <p>Specifies whether to include a CRL address.</p>
         * <ul>
         * <li><p>0 - No</p>
         * </li>
         * <li><p>1 - Yes</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableCrl(Long enableCrl) {
            this.putQueryParameter("EnableCrl", enableCrl);
            this.enableCrl = enableCrl;
            return this;
        }

        /**
         * <p>Obtain the certificate immediately.</p>
         * <ul>
         * <li><p>0 - Issue the certificate asynchronously.</p>
         * </li>
         * <li><p>1 - Issue the certificate immediately.</p>
         * </li>
         * <li><p>2 - Issue the certificate immediately and return the CA certificate chain.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder immediately(Integer immediately) {
            this.putQueryParameter("Immediately", immediately);
            this.immediately = immediately;
            return this;
        }

        /**
         * <p>The identifier of the CA certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ed4068c-6f1b-6deb-8e32-3f8439a851cb</p>
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * <p>The ID of the resource group. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2716559.html">ListResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek****wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The validity period of the certificate. This period cannot exceed the validity period of the instance. You can use relative time or absolute time.</p>
         * <p>Relative time: Supports years, months, and days.</p>
         * <ul>
         * <li><p>Year - y</p>
         * </li>
         * <li><p>Month - m</p>
         * </li>
         * <li><p>Day - d</p>
         * </li>
         * </ul>
         * <p>Absolute time: Uses GMT. Format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code></p>
         * <ul>
         * <li><p>Specify the end time - $NotAfter</p>
         * </li>
         * <li><p>Specify the start and end times - $NotBefore/$NotAfter</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>相对时间：
         * ● 1y
         * ● 3m
         * ● 7d</p>
         * <p>绝对时间：
         * ● 2006-01-02T15:04:05Z
         * ● 2006-01-02T15:04:05Z/2023-03-09T17:48:13Z</p>
         */
        public Builder validity(String validity) {
            this.putQueryParameter("Validity", validity);
            this.validity = validity;
            return this;
        }

        /**
         * <p>A custom identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>XXX068c-6f1b-6deb-8e32-3f8439a8XXX</p>
         */
        public Builder customIdentifier(String customIdentifier) {
            this.putQueryParameter("customIdentifier", customIdentifier);
            this.customIdentifier = customIdentifier;
            return this;
        }

        @Override
        public CreateCustomCertificateRequest build() {
            return new CreateCustomCertificateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
     */
    public static class KeyUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentCommitment")
        private Boolean contentCommitment;

        @com.aliyun.core.annotation.NameInMap("DataEncipherment")
        private Boolean dataEncipherment;

        @com.aliyun.core.annotation.NameInMap("DecipherOnly")
        private Boolean decipherOnly;

        @com.aliyun.core.annotation.NameInMap("DigitalSignature")
        private Boolean digitalSignature;

        @com.aliyun.core.annotation.NameInMap("EncipherOnly")
        private Boolean encipherOnly;

        @com.aliyun.core.annotation.NameInMap("KeyAgreement")
        private Boolean keyAgreement;

        @com.aliyun.core.annotation.NameInMap("KeyEncipherment")
        private Boolean keyEncipherment;

        @com.aliyun.core.annotation.NameInMap("NonRepudiation")
        private Boolean nonRepudiation;

        private KeyUsage(Builder builder) {
            this.contentCommitment = builder.contentCommitment;
            this.dataEncipherment = builder.dataEncipherment;
            this.decipherOnly = builder.decipherOnly;
            this.digitalSignature = builder.digitalSignature;
            this.encipherOnly = builder.encipherOnly;
            this.keyAgreement = builder.keyAgreement;
            this.keyEncipherment = builder.keyEncipherment;
            this.nonRepudiation = builder.nonRepudiation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyUsage create() {
            return builder().build();
        }

        /**
         * @return contentCommitment
         */
        public Boolean getContentCommitment() {
            return this.contentCommitment;
        }

        /**
         * @return dataEncipherment
         */
        public Boolean getDataEncipherment() {
            return this.dataEncipherment;
        }

        /**
         * @return decipherOnly
         */
        public Boolean getDecipherOnly() {
            return this.decipherOnly;
        }

        /**
         * @return digitalSignature
         */
        public Boolean getDigitalSignature() {
            return this.digitalSignature;
        }

        /**
         * @return encipherOnly
         */
        public Boolean getEncipherOnly() {
            return this.encipherOnly;
        }

        /**
         * @return keyAgreement
         */
        public Boolean getKeyAgreement() {
            return this.keyAgreement;
        }

        /**
         * @return keyEncipherment
         */
        public Boolean getKeyEncipherment() {
            return this.keyEncipherment;
        }

        /**
         * @return nonRepudiation
         */
        public Boolean getNonRepudiation() {
            return this.nonRepudiation;
        }

        public static final class Builder {
            private Boolean contentCommitment; 
            private Boolean dataEncipherment; 
            private Boolean decipherOnly; 
            private Boolean digitalSignature; 
            private Boolean encipherOnly; 
            private Boolean keyAgreement; 
            private Boolean keyEncipherment; 
            private Boolean nonRepudiation; 

            private Builder() {
            } 

            private Builder(KeyUsage model) {
                this.contentCommitment = model.contentCommitment;
                this.dataEncipherment = model.dataEncipherment;
                this.decipherOnly = model.decipherOnly;
                this.digitalSignature = model.digitalSignature;
                this.encipherOnly = model.encipherOnly;
                this.keyAgreement = model.keyAgreement;
                this.keyEncipherment = model.keyEncipherment;
                this.nonRepudiation = model.nonRepudiation;
            } 

            /**
             * <p>Content commitment. Formerly known as NonRepudiation. Allows the certificate key to be used for content commitment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder contentCommitment(Boolean contentCommitment) {
                this.contentCommitment = contentCommitment;
                return this;
            }

            /**
             * <p>Data encipherment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataEncipherment(Boolean dataEncipherment) {
                this.dataEncipherment = dataEncipherment;
                return this;
            }

            /**
             * <p>When KeyAgreement is true, this marks that the certificate key can only be used for decryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder decipherOnly(Boolean decipherOnly) {
                this.decipherOnly = decipherOnly;
                return this;
            }

            /**
             * <p>Digital signature. Allows the private key of the certificate to be used for digital signatures and the public key to be used to verify digital signatures.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder digitalSignature(Boolean digitalSignature) {
                this.digitalSignature = digitalSignature;
                return this;
            }

            /**
             * <p>When KeyAgreement is true, this marks that the certificate key can only be used for encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encipherOnly(Boolean encipherOnly) {
                this.encipherOnly = encipherOnly;
                return this;
            }

            /**
             * <p>Key agreement.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder keyAgreement(Boolean keyAgreement) {
                this.keyAgreement = keyAgreement;
                return this;
            }

            /**
             * <p>Key encipherment. Allows the certificate key to be used to encrypt other keys.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder keyEncipherment(Boolean keyEncipherment) {
                this.keyEncipherment = keyEncipherment;
                return this;
            }

            /**
             * <p>Non-repudiation. This has been renamed to ContentCommitment in the X.509 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder nonRepudiation(Boolean nonRepudiation) {
                this.nonRepudiation = nonRepudiation;
                return this;
            }

            public KeyUsage build() {
                return new KeyUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
     */
    public static class SubjectAlternativeNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SubjectAlternativeNames(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectAlternativeNames create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(SubjectAlternativeNames model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The following values are allowed:</p>
             * <ul>
             * <li><p>rfc822Name - Email address</p>
             * </li>
             * <li><p>dNSName - Domain name</p>
             * </li>
             * <li><p>uniformResourceIdentifier - Uniform Resource Identifier (URI)</p>
             * </li>
             * <li><p>iPAddress - IP address</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dNSName</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>A value that matches the specified Type.</p>
             * 
             * <strong>example:</strong>
             * <p>rfc822Name:
             * example.aliyundoc.com</p>
             * <p>dNSName:
             * learn.aliyundoc.com</p>
             * <p>uniformResourceIdentifier:
             * acs:ecs:regionid:15619224785*****:instance/i-bp1bzvz55uz27hf*****</p>
             * <p>iPAddress:
             * 127.0.0.1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SubjectAlternativeNames build() {
                return new SubjectAlternativeNames(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
     */
    public static class Extensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Criticals")
        private java.util.List<String> criticals;

        @com.aliyun.core.annotation.NameInMap("ExtendedKeyUsages")
        private java.util.List<String> extendedKeyUsages;

        @com.aliyun.core.annotation.NameInMap("KeyUsage")
        private KeyUsage keyUsage;

        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
        private java.util.List<SubjectAlternativeNames> subjectAlternativeNames;

        private Extensions(Builder builder) {
            this.criticals = builder.criticals;
            this.extendedKeyUsages = builder.extendedKeyUsages;
            this.keyUsage = builder.keyUsage;
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extensions create() {
            return builder().build();
        }

        /**
         * @return criticals
         */
        public java.util.List<String> getCriticals() {
            return this.criticals;
        }

        /**
         * @return extendedKeyUsages
         */
        public java.util.List<String> getExtendedKeyUsages() {
            return this.extendedKeyUsages;
        }

        /**
         * @return keyUsage
         */
        public KeyUsage getKeyUsage() {
            return this.keyUsage;
        }

        /**
         * @return subjectAlternativeNames
         */
        public java.util.List<SubjectAlternativeNames> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public static final class Builder {
            private java.util.List<String> criticals; 
            private java.util.List<String> extendedKeyUsages; 
            private KeyUsage keyUsage; 
            private java.util.List<SubjectAlternativeNames> subjectAlternativeNames; 

            private Builder() {
            } 

            private Builder(Extensions model) {
                this.criticals = model.criticals;
                this.extendedKeyUsages = model.extendedKeyUsages;
                this.keyUsage = model.keyUsage;
                this.subjectAlternativeNames = model.subjectAlternativeNames;
            } 

            /**
             * <p>If an extension is critical, its name is included in the criticals list.</p>
             */
            public Builder criticals(java.util.List<String> criticals) {
                this.criticals = criticals;
                return this;
            }

            /**
             * <p>The extended key usages.</p>
             */
            public Builder extendedKeyUsages(java.util.List<String> extendedKeyUsages) {
                this.extendedKeyUsages = extendedKeyUsages;
                return this;
            }

            /**
             * <p>The key usage.</p>
             */
            public Builder keyUsage(KeyUsage keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * <p>The subject alternative names (SANs) of the certificate.</p>
             */
            public Builder subjectAlternativeNames(java.util.List<SubjectAlternativeNames> subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
     */
    public static class CustomAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectIdentifier")
        private String objectIdentifier;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomAttributes(Builder builder) {
            this.objectIdentifier = builder.objectIdentifier;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomAttributes create() {
            return builder().build();
        }

        /**
         * @return objectIdentifier
         */
        public String getObjectIdentifier() {
            return this.objectIdentifier;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String objectIdentifier; 
            private String value; 

            private Builder() {
            } 

            private Builder(CustomAttributes model) {
                this.objectIdentifier = model.objectIdentifier;
                this.value = model.value;
            } 

            /**
             * <p>The key of the custom property. It must comply with industry standards. Examples:</p>
             * <ul>
             * <li><p>2.5.4.6: Country code</p>
             * </li>
             * <li><p>2.5.4.10: Organization</p>
             * </li>
             * <li><p>2.5.4.11: Organizational unit name</p>
             * </li>
             * <li><p>2.5.4.12: Title</p>
             * </li>
             * <li><p>2.5.4.3: Common name</p>
             * </li>
             * <li><p>2.5.4.9: Street</p>
             * </li>
             * <li><p>2.5.4.5: Serial number</p>
             * </li>
             * <li><p>2.5.4.7: Locality</p>
             * </li>
             * <li><p>2.5.4.8: State or province</p>
             * </li>
             * <li><p>1.3.6.1.4.1.37244.1.1: Matter certificate - Node ID</p>
             * </li>
             * <li><p>1.3.6.1.4.1.37244.1.5: Matter certificate - Fabric ID</p>
             * </li>
             * <li><p>1.3.6.1.4.1.37244.2.1: Matter certificate Vendor ID (VID)</p>
             * </li>
             * <li><p>1.3.6.1.4.1.37244.2.2: Matter certificate Product ID (PID)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2.5.4.3</p>
             */
            public Builder objectIdentifier(String objectIdentifier) {
                this.objectIdentifier = objectIdentifier;
                return this;
            }

            /**
             * <p>The value of the custom property.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomAttributes build() {
                return new CustomAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
     */
    public static class Subject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("CustomAttributes")
        private java.util.List<CustomAttributes> customAttributes;

        @com.aliyun.core.annotation.NameInMap("Locality")
        private String locality;

        @com.aliyun.core.annotation.NameInMap("Organization")
        private String organization;

        @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
        private String organizationUnit;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Subject(Builder builder) {
            this.commonName = builder.commonName;
            this.country = builder.country;
            this.customAttributes = builder.customAttributes;
            this.locality = builder.locality;
            this.organization = builder.organization;
            this.organizationUnit = builder.organizationUnit;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subject create() {
            return builder().build();
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
         * @return customAttributes
         */
        public java.util.List<CustomAttributes> getCustomAttributes() {
            return this.customAttributes;
        }

        /**
         * @return locality
         */
        public String getLocality() {
            return this.locality;
        }

        /**
         * @return organization
         */
        public String getOrganization() {
            return this.organization;
        }

        /**
         * @return organizationUnit
         */
        public String getOrganizationUnit() {
            return this.organizationUnit;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String commonName; 
            private String country; 
            private java.util.List<CustomAttributes> customAttributes; 
            private String locality; 
            private String organization; 
            private String organizationUnit; 
            private String state; 

            private Builder() {
            } 

            private Builder(Subject model) {
                this.commonName = model.commonName;
                this.country = model.country;
                this.customAttributes = model.customAttributes;
                this.locality = model.locality;
                this.organization = model.organization;
                this.organizationUnit = model.organizationUnit;
                this.state = model.state;
            } 

            /**
             * <p>The common name of the certificate user.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The country code. Use the two-letter country code from ISO 3166-1. For more information, see <a href="https://www.iso.org/obp/ui/#search/code/">ISO</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The custom subject properties of the certificate.</p>
             */
            public Builder customAttributes(java.util.List<CustomAttributes> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * <p>The name of the city where the organization is located. Chinese characters and letters are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>杭州市</p>
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>The name of the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX公司</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The name of the department or branch within the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX部门</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>The province or state where the organization is located.</p>
             * 
             * <strong>example:</strong>
             * <p>浙江省</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Subject build() {
                return new Subject(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
     */
    public static class ApiPassthrough extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extensions")
        private Extensions extensions;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private Subject subject;

        private ApiPassthrough(Builder builder) {
            this.extensions = builder.extensions;
            this.serialNumber = builder.serialNumber;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiPassthrough create() {
            return builder().build();
        }

        /**
         * @return extensions
         */
        public Extensions getExtensions() {
            return this.extensions;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return subject
         */
        public Subject getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private Extensions extensions; 
            private String serialNumber; 
            private Subject subject; 

            private Builder() {
            } 

            private Builder(ApiPassthrough model) {
                this.extensions = model.extensions;
                this.serialNumber = model.serialNumber;
                this.subject = model.subject;
            } 

            /**
             * <p>The certificate extensions.</p>
             */
            public Builder extensions(Extensions extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * <p>The custom serial number of the certificate. Must be a long integer.</p>
             * 
             * <strong>example:</strong>
             * <p>16889526086333</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The certificate subject.</p>
             */
            public Builder subject(Subject subject) {
                this.subject = subject;
                return this;
            }

            public ApiPassthrough build() {
                return new ApiPassthrough(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCustomCertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomCertificateRequest</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
}
