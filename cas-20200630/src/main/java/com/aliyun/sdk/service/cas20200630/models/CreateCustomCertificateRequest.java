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
    @com.aliyun.core.annotation.NameInMap("Validity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validity;

    private CreateCustomCertificateRequest(Builder builder) {
        super(builder);
        this.apiPassthrough = builder.apiPassthrough;
        this.csr = builder.csr;
        this.enableCrl = builder.enableCrl;
        this.immediately = builder.immediately;
        this.parentIdentifier = builder.parentIdentifier;
        this.validity = builder.validity;
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
     * @return validity
     */
    public String getValidity() {
        return this.validity;
    }

    public static final class Builder extends Request.Builder<CreateCustomCertificateRequest, Builder> {
        private ApiPassthrough apiPassthrough; 
        private String csr; 
        private Long enableCrl; 
        private Integer immediately; 
        private String parentIdentifier; 
        private String validity; 

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
            this.validity = request.validity;
        } 

        /**
         * <p>The passthrough parameters.</p>
         */
        public Builder apiPassthrough(ApiPassthrough apiPassthrough) {
            this.putQueryParameter("ApiPassthrough", apiPassthrough);
            this.apiPassthrough = apiPassthrough;
            return this;
        }

        /**
         * <p>The content of the CSR. You can generate a CSR by using the OpenSSL tool or the Keytool tool. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a></p>
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
         * <p>include the CRL address.</p>
         * <ul>
         * <li>0- No</li>
         * <li>1- Yes</li>
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
         * <p>Specifies whether to immediately issue the certificate. Valid values:</p>
         * <ul>
         * <li>0: asynchronously issues the certificate.</li>
         * <li>1: immediately issues the certificate.</li>
         * <li>2: immediately issues the certificate and returns the certificate chain.</li>
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
         * <p>The identifier of the certificate.</p>
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
         * <p>The validity period of the certificate. The value cannot exceed the validity period of the certificate instance. Relative time and absolute time are supported.</p>
         * <p>Units of relative time: year, month, and day.</p>
         * <ul>
         * <li>Use y to specify years.</li>
         * <li>Use m to specify months.</li>
         * <li>Use d to specify days.</li>
         * </ul>
         * <p>Absolute time: Use Greenwich Mean Time (GMT). Format: <code>yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot;</code></p>
         * <ul>
         * <li>Format of the end time: $NotAfter</li>
         * <li>Format of the start time and end time: $NotBefore/$NotAfter</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Relative time:
         *  ● 1y
         *  ● 3m
         *  ● 7d
         * Absolute time: 
         * ● 2006-01-02T15:04:05Z 
         * ● 2006-01-02T15:04:05Z/2023-03-09T17:48:13Z</p>
         */
        public Builder validity(String validity) {
            this.putQueryParameter("Validity", validity);
            this.validity = validity;
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
             * <p>The original name of the parameter is NonRepudiation.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder contentCommitment(Boolean contentCommitment) {
                this.contentCommitment = contentCommitment;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used for data encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dataEncipherment(Boolean dataEncipherment) {
                this.dataEncipherment = dataEncipherment;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used only for data decryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder decipherOnly(Boolean decipherOnly) {
                this.decipherOnly = decipherOnly;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used for digital signing. If you set this parameter to true, the private key of the certificate can be used to generate digital signatures, and the public key of the certificate can be used to verify digital signatures.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder digitalSignature(Boolean digitalSignature) {
                this.digitalSignature = digitalSignature;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used only for data encryption.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encipherOnly(Boolean encipherOnly) {
                this.encipherOnly = encipherOnly;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used for key agreement.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder keyAgreement(Boolean keyAgreement) {
                this.keyAgreement = keyAgreement;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used for data encipherment.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder keyEncipherment(Boolean keyEncipherment) {
                this.keyEncipherment = keyEncipherment;
                return this;
            }

            /**
             * <p>Specifies whether the key can be used for non-repudiation. This parameter is renamed ContentCommitment in the X.509 standard.</p>
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
             * <p>The type of the alias. Valid values:</p>
             * <ul>
             * <li>rfc822Name: email address</li>
             * <li>dNSName: domain name</li>
             * <li>uniformResourceIdentifier: URI</li>
             * <li>iPAddress: IP address</li>
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
             * <p>The alias that meets the requirement of a specified type.</p>
             * 
             * <strong>example:</strong>
             * <p>rfc822Name:
             * <a href="mailto:exmaple@certqa.cn">exmaple@certqa.cn</a></p>
             * <p>dNSName:
             * <a href="http://www.certqa.cn">www.certqa.cn</a></p>
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
             * <p>If it is a necessary parameter, the critical list contains the parameter name.</p>
             */
            public Builder criticals(java.util.List<String> criticals) {
                this.criticals = criticals;
                return this;
            }

            /**
             * <p>The extended key usage.</p>
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
             * <p>The aliases of the entities.</p>
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
             * <p>Custom attribute type as:</p>
             * <ul>
             * <li>2.5.4.6 : country</li>
             * <li>2.5.4.10 : organization</li>
             * <li>2.5.4.11 : organizational unit</li>
             * <li>2.5.4.12 : title</li>
             * <li>2.5.4.3 : common name</li>
             * <li>2.5.4.9 : street</li>
             * <li>2.5.4.5 : serial number</li>
             * <li>2.5.4.7 : locality</li>
             * <li>2.5.4.8 : state</li>
             * <li>1.3.6.1.4.1.37244.1.1 : Matter Operational Certificate - Node ID</li>
             * <li>1.3.6.1.4.1.37244.1.5 : Matter Operational Certificate - Fabric ID</li>
             * <li>1.3.6.1.4.1.37244.2.1 : Matter Device Attestation Certificate Vender ID (VID)</li>
             * <li>1.3.6.1.4.1.37244.2.2 : Matter Device Attestation Certificate Product ID (PID).</li>
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
             * <p>Custom attribute value.</p>
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
             * <p>Bob</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The code of the country. The value is an alpha-2 country code that complies with the ISO 3166-1 standard. For more information about country codes, visit <a href="https://www.iso.org/obp/ui/#search/code/">https://www.iso.org/obp/ui/#search/code/</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>Customize the Subject attributes of the certificate.</p>
             */
            public Builder customAttributes(java.util.List<CustomAttributes> customAttributes) {
                this.customAttributes = customAttributes;
                return this;
            }

            /**
             * <p>The name of the city in which the organization is located. The value can contain letters.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>The name of the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX company</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The name of the department or branch in the organization.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX department</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>The name of the province or state in which the organization associated with the certificate is located.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang</p>
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
             * <p>The extensions of the certificate.</p>
             */
            public Builder extensions(Extensions extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * <p>The serial number MUST be a positive integer assigned by the CA to each certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>16889526086333</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The name of the entity that uses the certificate.</p>
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
}
