// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateWebCertRequest} extends {@link RequestModel}
 *
 * <p>AssociateWebCertRequest</p>
 */
public class AssociateWebCertRequest extends Request {
    @Query
    @NameInMap("Cert")
    private String cert;

    @Query
    @NameInMap("CertId")
    private Integer certId;

    @Query
    @NameInMap("CertName")
    private String certName;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Key")
    private String key;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AssociateWebCertRequest(Builder builder) {
        super(builder);
        this.cert = builder.cert;
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.domain = builder.domain;
        this.key = builder.key;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateWebCertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return certId
     */
    public Integer getCertId() {
        return this.certId;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<AssociateWebCertRequest, Builder> {
        private String cert; 
        private Integer certId; 
        private String certName; 
        private String domain; 
        private String key; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateWebCertRequest response) {
            super(response);
            this.cert = response.cert;
            this.certId = response.certId;
            this.certName = response.certName;
            this.domain = response.domain;
            this.key = response.key;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * Cert.
         */
        public Builder cert(String cert) {
            this.putQueryParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * CertId.
         */
        public Builder certId(Integer certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public AssociateWebCertRequest build() {
            return new AssociateWebCertRequest(this);
        } 

    } 

}
