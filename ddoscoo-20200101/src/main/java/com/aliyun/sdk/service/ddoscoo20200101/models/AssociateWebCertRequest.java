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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private AssociateWebCertRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cert = builder.cert;
        this.certId = builder.certId;
        this.certName = builder.certName;
        this.domain = builder.domain;
        this.key = builder.key;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<AssociateWebCertRequest, Builder> {
        private String regionId; 
        private String cert; 
        private Integer certId; 
        private String certName; 
        private String domain; 
        private String key; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateWebCertRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cert = request.cert;
            this.certId = request.certId;
            this.certName = request.certName;
            this.domain = request.domain;
            this.key = request.key;
            this.resourceGroupId = request.resourceGroupId;
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
         * The public key of the certificate that you want to associate. This parameter must be used together with **CertName** and **Key**.
         * <p>
         * 
         * > If you specify **CertName**, **Cert**, and **Key**, you do not need to specify **CertId**.
         */
        public Builder cert(String cert) {
            this.putQueryParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * The ID of the certificate that you want to associate. If the certificate that you want to associate has been issued in Certificate Management Service, you can specify the certificate ID to associate the certificate.
         * <p>
         * 
         * > If you specify the certificate ID, you do not need to specify a value for the **CertName**, **Cert**, and **Key** parameters.
         */
        public Builder certId(Integer certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * The name of the certificate that you want to associate. This parameter must be used together with the **Cert** and **Key** parameters.
         * <p>
         * 
         * > If you specify a value for the **CertName**, **Cert**, and **Key** parameters, you do not need to specify a value for the **CertId** parameter.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The private key of the certificate that you want to associate. This parameter must be used together with **CertName** and **Cert**.
         * <p>
         * 
         * > If you specify **CertName**, **Cert**, and **Key**, you do not need to specify **CertId**.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
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
