// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomCertificateRequest</p>
 */
public class CreateCustomCertificateRequest extends Request {
    @Query
    @NameInMap("ApiPassthrough")
    private ApiPassthrough apiPassthrough;

    @Query
    @NameInMap("Csr")
    @Validation(required = true)
    private String csr;

    @Query
    @NameInMap("Immediately")
    private Integer immediately;

    @Query
    @NameInMap("ParentIdentifier")
    @Validation(required = true)
    private String parentIdentifier;

    @Query
    @NameInMap("Validity")
    @Validation(required = true)
    private String validity;

    private CreateCustomCertificateRequest(Builder builder) {
        super(builder);
        this.apiPassthrough = builder.apiPassthrough;
        this.csr = builder.csr;
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
            this.immediately = request.immediately;
            this.parentIdentifier = request.parentIdentifier;
            this.validity = request.validity;
        } 

        /**
         * The passthrough parameters.
         */
        public Builder apiPassthrough(ApiPassthrough apiPassthrough) {
            this.putQueryParameter("ApiPassthrough", apiPassthrough);
            this.apiPassthrough = apiPassthrough;
            return this;
        }

        /**
         * The content of the CSR. You can generate a CSR by using the OpenSSL tool or the Keytool tool. For more information, see [How do I create a CSR file?](~~42218~~)
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * Specifies whether to immediately issue the certificate. Valid values:
         * <p>
         * 
         * *   0: asynchronously issues the certificate.
         * *   1: immediately issues the certificate.
         * *   2: immediately issues the certificate and returns the certificate chain.
         */
        public Builder immediately(Integer immediately) {
            this.putQueryParameter("Immediately", immediately);
            this.immediately = immediately;
            return this;
        }

        /**
         * The identifier of the certificate.
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * The validity period of the certificate. The value cannot exceed the validity period of the certificate instance. Relative time and absolute time are supported.
         * <p>
         * 
         * Units of relative time: year, month, and day.
         * 
         * *   Use y to specify years.
         * *   Use m to specify months.
         * *   Use d to specify days.
         * 
         * Absolute time: Use Greenwich Mean Time (GMT). Format: `yyyy-MM-dd\"T\"HH:mm:ss\"Z\"`
         * 
         * *   Format of the end time: $NotAfter
         * *   Format of the start time and end time: $NotBefore/$NotAfter
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

    public static class KeyUsage extends TeaModel {
        @NameInMap("ContentCommitment")
        private Boolean contentCommitment;

        @NameInMap("DataEncipherment")
        private Boolean dataEncipherment;

        @NameInMap("DecipherOnly")
        private Boolean decipherOnly;

        @NameInMap("DigitalSignature")
        private Boolean digitalSignature;

        @NameInMap("EncipherOnly")
        private Boolean encipherOnly;

        @NameInMap("KeyAgreement")
        private Boolean keyAgreement;

        @NameInMap("KeyEncipherment")
        private Boolean keyEncipherment;

        @NameInMap("NonRepudiation")
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

            /**
             * The original name of the parameter is NonRepudiation.
             */
            public Builder contentCommitment(Boolean contentCommitment) {
                this.contentCommitment = contentCommitment;
                return this;
            }

            /**
             * Specifies whether the key can be used for data encryption.
             */
            public Builder dataEncipherment(Boolean dataEncipherment) {
                this.dataEncipherment = dataEncipherment;
                return this;
            }

            /**
             * Specifies whether the key can be used only for data decryption.
             */
            public Builder decipherOnly(Boolean decipherOnly) {
                this.decipherOnly = decipherOnly;
                return this;
            }

            /**
             * Specifies whether the key can be used for digital signing. If you set this parameter to true, the private key of the certificate can be used to generate digital signatures, and the public key of the certificate can be used to verify digital signatures.
             */
            public Builder digitalSignature(Boolean digitalSignature) {
                this.digitalSignature = digitalSignature;
                return this;
            }

            /**
             * Specifies whether the key can be used only for data encryption.
             */
            public Builder encipherOnly(Boolean encipherOnly) {
                this.encipherOnly = encipherOnly;
                return this;
            }

            /**
             * Specifies whether the key can be used for key agreement.
             */
            public Builder keyAgreement(Boolean keyAgreement) {
                this.keyAgreement = keyAgreement;
                return this;
            }

            /**
             * Specifies whether the key can be used for data encipherment.
             */
            public Builder keyEncipherment(Boolean keyEncipherment) {
                this.keyEncipherment = keyEncipherment;
                return this;
            }

            /**
             * Specifies whether the key can be used for non-repudiation. This parameter is renamed ContentCommitment in the X.509 standard.
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
    public static class SubjectAlternativeNames extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Value")
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

            /**
             * The type of the alias. Valid values:
             * <p>
             * 
             * *   rfc822Name: email address
             * *   dNSName: domain name
             * *   uniformResourceIdentifier: URI
             * *   iPAddress: IP address
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The alias that meets the requirement of a specified type.
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
    public static class Extensions extends TeaModel {
        @NameInMap("ExtendedKeyUsages")
        private java.util.List < String > extendedKeyUsages;

        @NameInMap("KeyUsage")
        private KeyUsage keyUsage;

        @NameInMap("SubjectAlternativeNames")
        private java.util.List < SubjectAlternativeNames> subjectAlternativeNames;

        private Extensions(Builder builder) {
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
         * @return extendedKeyUsages
         */
        public java.util.List < String > getExtendedKeyUsages() {
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
        public java.util.List < SubjectAlternativeNames> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public static final class Builder {
            private java.util.List < String > extendedKeyUsages; 
            private KeyUsage keyUsage; 
            private java.util.List < SubjectAlternativeNames> subjectAlternativeNames; 

            /**
             * The extended key usage.
             */
            public Builder extendedKeyUsages(java.util.List < String > extendedKeyUsages) {
                this.extendedKeyUsages = extendedKeyUsages;
                return this;
            }

            /**
             * The key usage.
             */
            public Builder keyUsage(KeyUsage keyUsage) {
                this.keyUsage = keyUsage;
                return this;
            }

            /**
             * The aliases of the entities.
             */
            public Builder subjectAlternativeNames(java.util.List < SubjectAlternativeNames> subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
    public static class Subject extends TeaModel {
        @NameInMap("CommonName")
        @Validation(required = true)
        private String commonName;

        @NameInMap("Country")
        private String country;

        @NameInMap("Locality")
        private String locality;

        @NameInMap("Organization")
        private String organization;

        @NameInMap("OrganizationUnit")
        private String organizationUnit;

        @NameInMap("State")
        private String state;

        private Subject(Builder builder) {
            this.commonName = builder.commonName;
            this.country = builder.country;
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
            private String locality; 
            private String organization; 
            private String organizationUnit; 
            private String state; 

            /**
             * The common name of the certificate user.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * The code of the country. The value is an alpha-2 country code that complies with the ISO 3166-1 standard. For more information about country codes, visit <https://www.iso.org/obp/ui/#search/code/>.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * The name of the city in which the organization is located. The value can contain letters.
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * The name of the organization.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * The name of the department or branch in the organization.
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * The name of the province or state in which the organization associated with the certificate is located.
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
    public static class ApiPassthrough extends TeaModel {
        @NameInMap("Extensions")
        private Extensions extensions;

        @NameInMap("Subject")
        private Subject subject;

        private ApiPassthrough(Builder builder) {
            this.extensions = builder.extensions;
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
         * @return subject
         */
        public Subject getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private Extensions extensions; 
            private Subject subject; 

            /**
             * The extensions of the certificate.
             */
            public Builder extensions(Extensions extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * The name of the entity that uses the certificate.
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
