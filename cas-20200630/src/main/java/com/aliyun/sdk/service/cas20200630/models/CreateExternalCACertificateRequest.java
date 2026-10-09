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
 * {@link CreateExternalCACertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateExternalCACertificateRequest</p>
 */
public class CreateExternalCACertificateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiPassthrough")
    private ApiPassthrough apiPassthrough;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertMaxTime")
    private Integer certMaxTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Validity")
    private String validity;

    private CreateExternalCACertificateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiPassthrough = builder.apiPassthrough;
        this.certMaxTime = builder.certMaxTime;
        this.csr = builder.csr;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.validity = builder.validity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExternalCACertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiPassthrough
     */
    public ApiPassthrough getApiPassthrough() {
        return this.apiPassthrough;
    }

    /**
     * @return certMaxTime
     */
    public Integer getCertMaxTime() {
        return this.certMaxTime;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<CreateExternalCACertificateRequest, Builder> {
        private String regionId; 
        private ApiPassthrough apiPassthrough; 
        private Integer certMaxTime; 
        private String csr; 
        private String instanceId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String validity; 

        private Builder() {
            super();
        } 

        private Builder(CreateExternalCACertificateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiPassthrough = request.apiPassthrough;
            this.certMaxTime = request.certMaxTime;
            this.csr = request.csr;
            this.instanceId = request.instanceId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.validity = request.validity;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Overrides CSR content or adds content to the CA certificate through API parameters.</p>
         */
        public Builder apiPassthrough(ApiPassthrough apiPassthrough) {
            String apiPassthroughShrink = shrink(apiPassthrough, "ApiPassthrough", "json");
            this.putQueryParameter("ApiPassthrough", apiPassthroughShrink);
            this.apiPassthrough = apiPassthrough;
            return this;
        }

        /**
         * <p>The maximum validity period for issued certificates, as specified by the certMaxTime of the CA. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder certMaxTime(Integer certMaxTime) {
            this.putQueryParameter("CertMaxTime", certMaxTime);
            this.certMaxTime = certMaxTime;
            return this;
        }

        /**
         * <p>The certificate signing request. The CSR can contain the SubjectDN and custom extensions of the CA certificate. The SubjectKeyIdentifier, AuthorityKeyIdentifier, and CRLDistributionPoints certificate extensions are generated by the CA, and the values in the CSR are ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST-----
         * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
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
         * <p>The instance ID of the external subordinate CA instance to activate.</p>
         * 
         * <strong>example:</strong>
         * <p>cas_deposit-cn-1234abcd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The certificate validity period. Both relative time and absolute time are supported.</p>
         * <blockquote>
         * <p>Relative time: Supports the units of year, month, and day.</p>
         * </blockquote>
         * <ul>
         * <li>Year - y</li>
         * <li>Month - m</li>
         * <li>Day - d</li>
         * </ul>
         * <blockquote>
         * <p>Absolute time: Uses GMT time. Format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code></p>
         * </blockquote>
         * <ul>
         * <li>Specify the end time - <code>$NotAfter</code></li>
         * <li>Specify the start time and end time - <code>$NotBefore/$NotAfter</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10y</p>
         */
        public Builder validity(String validity) {
            this.putQueryParameter("Validity", validity);
            this.validity = validity;
            return this;
        }

        @Override
        public CreateExternalCACertificateRequest build() {
            return new CreateExternalCACertificateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateExternalCACertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalCACertificateRequest</p>
     */
    public static class Extensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendedKeyUsages")
        private java.util.List<String> extendedKeyUsages;

        @com.aliyun.core.annotation.NameInMap("PathLenConstraint")
        private Integer pathLenConstraint;

        private Extensions(Builder builder) {
            this.extendedKeyUsages = builder.extendedKeyUsages;
            this.pathLenConstraint = builder.pathLenConstraint;
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
        public java.util.List<String> getExtendedKeyUsages() {
            return this.extendedKeyUsages;
        }

        /**
         * @return pathLenConstraint
         */
        public Integer getPathLenConstraint() {
            return this.pathLenConstraint;
        }

        public static final class Builder {
            private java.util.List<String> extendedKeyUsages; 
            private Integer pathLenConstraint; 

            private Builder() {
            } 

            private Builder(Extensions model) {
                this.extendedKeyUsages = model.extendedKeyUsages;
                this.pathLenConstraint = model.pathLenConstraint;
            } 

            /**
             * <p>The extended key usages.</p>
             */
            public Builder extendedKeyUsages(java.util.List<String> extendedKeyUsages) {
                this.extendedKeyUsages = extendedKeyUsages;
                return this;
            }

            /**
             * <p>The certificate path length constraint. For an EndEntity CA, this value must be set to 0, which means the current CA certificate is used to issue end entity certificates.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pathLenConstraint(Integer pathLenConstraint) {
                this.pathLenConstraint = pathLenConstraint;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateExternalCACertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalCACertificateRequest</p>
     */
    public static class Subject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

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

            private Builder() {
            } 

            private Builder(Subject model) {
                this.commonName = model.commonName;
                this.country = model.country;
                this.locality = model.locality;
                this.organization = model.organization;
                this.organizationUnit = model.organizationUnit;
                this.state = model.state;
            } 

            /**
             * <p>The name of the current CA certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Testing CA</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The country. Uses the ISO 3166-1 two-letter country code.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The city or locality.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * <p>The organization or company.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * <p>The organizational unit within the organization, such as a department, team, project group, or branch.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud Security</p>
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * <p>The state or province.</p>
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
     * {@link CreateExternalCACertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalCACertificateRequest</p>
     */
    public static class ApiPassthrough extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extensions")
        private Extensions extensions;

        @com.aliyun.core.annotation.NameInMap("Subject")
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

            private Builder() {
            } 

            private Builder(ApiPassthrough model) {
                this.extensions = model.extensions;
                this.subject = model.subject;
            } 

            /**
             * <p>The CA certificate extensions. If this value is specified, it overrides the extension values in the CSR or adds them to the CA certificate extensions.</p>
             */
            public Builder extensions(Extensions extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * <p>The subject information of the CA certificate. If this value is specified, it overrides the SubjectDN in the CSR.</p>
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
     * {@link CreateExternalCACertificateRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalCACertificateRequest</p>
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
             * <p>database</p>
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
