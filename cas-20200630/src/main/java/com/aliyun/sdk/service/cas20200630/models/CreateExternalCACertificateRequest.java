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
    @com.aliyun.core.annotation.NameInMap("Csr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Validity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validity;

    private CreateExternalCACertificateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiPassthrough = builder.apiPassthrough;
        this.csr = builder.csr;
        this.instanceId = builder.instanceId;
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
     * @return validity
     */
    public String getValidity() {
        return this.validity;
    }

    public static final class Builder extends Request.Builder<CreateExternalCACertificateRequest, Builder> {
        private String regionId; 
        private ApiPassthrough apiPassthrough; 
        private String csr; 
        private String instanceId; 
        private String validity; 

        private Builder() {
            super();
        } 

        private Builder(CreateExternalCACertificateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiPassthrough = request.apiPassthrough;
            this.csr = request.csr;
            this.instanceId = request.instanceId;
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
         * ApiPassthrough.
         */
        public Builder apiPassthrough(ApiPassthrough apiPassthrough) {
            String apiPassthroughShrink = shrink(apiPassthrough, "ApiPassthrough", "json");
            this.putQueryParameter("ApiPassthrough", apiPassthroughShrink);
            this.apiPassthrough = apiPassthrough;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
             * ExtendedKeyUsages.
             */
            public Builder extendedKeyUsages(java.util.List<String> extendedKeyUsages) {
                this.extendedKeyUsages = extendedKeyUsages;
                return this;
            }

            /**
             * PathLenConstraint.
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
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Locality.
             */
            public Builder locality(String locality) {
                this.locality = locality;
                return this;
            }

            /**
             * Organization.
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            /**
             * OrganizationUnit.
             */
            public Builder organizationUnit(String organizationUnit) {
                this.organizationUnit = organizationUnit;
                return this;
            }

            /**
             * State.
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
             * Extensions.
             */
            public Builder extensions(Extensions extensions) {
                this.extensions = extensions;
                return this;
            }

            /**
             * Subject.
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
