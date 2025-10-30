// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyDomainCertRequest} extends {@link RequestModel}
 *
 * <p>ModifyDomainCertRequest</p>
 */
public class ModifyDomainCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CipherSuite")
    private String cipherSuite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomCiphers")
    private java.util.List<String> customCiphers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTLSv3")
    private Boolean enableTLSv3;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSVersion")
    private String TLSVersion;

    private ModifyDomainCertRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.cipherSuite = builder.cipherSuite;
        this.customCiphers = builder.customCiphers;
        this.domain = builder.domain;
        this.enableTLSv3 = builder.enableTLSv3;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.TLSVersion = builder.TLSVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainCertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return cipherSuite
     */
    public String getCipherSuite() {
        return this.cipherSuite;
    }

    /**
     * @return customCiphers
     */
    public java.util.List<String> getCustomCiphers() {
        return this.customCiphers;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return enableTLSv3
     */
    public Boolean getEnableTLSv3() {
        return this.enableTLSv3;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return TLSVersion
     */
    public String getTLSVersion() {
        return this.TLSVersion;
    }

    public static final class Builder extends Request.Builder<ModifyDomainCertRequest, Builder> {
        private String certId; 
        private String cipherSuite; 
        private java.util.List<String> customCiphers; 
        private String domain; 
        private Boolean enableTLSv3; 
        private String instanceId; 
        private String regionId; 
        private String TLSVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDomainCertRequest request) {
            super(request);
            this.certId = request.certId;
            this.cipherSuite = request.cipherSuite;
            this.customCiphers = request.customCiphers;
            this.domain = request.domain;
            this.enableTLSv3 = request.enableTLSv3;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.TLSVersion = request.TLSVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * CipherSuite.
         */
        public Builder cipherSuite(String cipherSuite) {
            this.putQueryParameter("CipherSuite", cipherSuite);
            this.cipherSuite = cipherSuite;
            return this;
        }

        /**
         * CustomCiphers.
         */
        public Builder customCiphers(java.util.List<String> customCiphers) {
            this.putQueryParameter("CustomCiphers", customCiphers);
            this.customCiphers = customCiphers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EnableTLSv3.
         */
        public Builder enableTLSv3(Boolean enableTLSv3) {
            this.putQueryParameter("EnableTLSv3", enableTLSv3);
            this.enableTLSv3 = enableTLSv3;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-ww**b06</p>
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
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TLSVersion.
         */
        public Builder TLSVersion(String TLSVersion) {
            this.putQueryParameter("TLSVersion", TLSVersion);
            this.TLSVersion = TLSVersion;
            return this;
        }

        @Override
        public ModifyDomainCertRequest build() {
            return new ModifyDomainCertRequest(this);
        } 

    } 

}
