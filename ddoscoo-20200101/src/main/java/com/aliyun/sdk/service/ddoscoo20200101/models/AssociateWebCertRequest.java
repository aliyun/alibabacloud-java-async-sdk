// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link AssociateWebCertRequest} extends {@link RequestModel}
 *
 * <p>AssociateWebCertRequest</p>
 */
public class AssociateWebCertRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertId")
    private Integer certId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertRegion")
    private String certRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    private AssociateWebCertRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cert = builder.cert;
        this.certId = builder.certId;
        this.certIdentifier = builder.certIdentifier;
        this.certName = builder.certName;
        this.certRegion = builder.certRegion;
        this.domain = builder.domain;
        this.key = builder.key;
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
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certRegion
     */
    public String getCertRegion() {
        return this.certRegion;
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

    public static final class Builder extends Request.Builder<AssociateWebCertRequest, Builder> {
        private String regionId; 
        private String cert; 
        private Integer certId; 
        private String certIdentifier; 
        private String certName; 
        private String certRegion; 
        private String domain; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(AssociateWebCertRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cert = request.cert;
            this.certId = request.certId;
            this.certIdentifier = request.certIdentifier;
            this.certName = request.certName;
            this.certRegion = request.certRegion;
            this.domain = request.domain;
            this.key = request.key;
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
            this.putBodyParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * CertId.
         */
        public Builder certId(Integer certId) {
            this.putBodyParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The globally unique ID of the certificate. The value is in the &quot;Certificate ID-cn-hangzhou&quot; format. For example, if the ID of the certificate is 123, the value of the CertIdentifier parameter is 123-cn-hangzhou.</p>
         * <blockquote>
         * <p> You can specify only one of this parameter and the CertId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9430680-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putBodyParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putBodyParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>The region of the certificate. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>. Default value: <strong>cn-hangzhou</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder certRegion(String certRegion) {
            this.putBodyParameter("CertRegion", certRegion);
            this.certRegion = certRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public AssociateWebCertRequest build() {
            return new AssociateWebCertRequest(this);
        } 

    } 

}
