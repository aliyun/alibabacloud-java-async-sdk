// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer7CertRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer7CertRequest</p>
 */
public class ConfigLayer7CertRequest extends Request {
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

    private ConfigLayer7CertRequest(Builder builder) {
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

    public static ConfigLayer7CertRequest create() {
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

    public static final class Builder extends Request.Builder<ConfigLayer7CertRequest, Builder> {
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

        private Builder(ConfigLayer7CertRequest request) {
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ConfigLayer7CertRequest build() {
            return new ConfigLayer7CertRequest(this);
        } 

    } 

}
