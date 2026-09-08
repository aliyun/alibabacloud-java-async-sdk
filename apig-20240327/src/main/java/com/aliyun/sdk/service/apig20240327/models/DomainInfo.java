// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DomainInfo} extends {@link TeaModel}
 *
 * <p>DomainInfo</p>
 */
public class DomainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.NameInMap("clientCACert")
    private String clientCACert;

    @com.aliyun.core.annotation.NameInMap("createFrom")
    private String createFrom;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("domainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("domainScope")
    private String domainScope;

    @com.aliyun.core.annotation.NameInMap("forceHttps")
    private Boolean forceHttps;

    @com.aliyun.core.annotation.NameInMap("mTLSEnabled")
    private Boolean mTLSEnabled;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("tlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.NameInMap("tlsMin")
    private String tlsMin;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private DomainInfo(Builder builder) {
        this.certIdentifier = builder.certIdentifier;
        this.clientCACert = builder.clientCACert;
        this.createFrom = builder.createFrom;
        this.createTimestamp = builder.createTimestamp;
        this.domainId = builder.domainId;
        this.domainScope = builder.domainScope;
        this.forceHttps = builder.forceHttps;
        this.mTLSEnabled = builder.mTLSEnabled;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tlsMax = builder.tlsMax;
        this.tlsMin = builder.tlsMin;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return clientCACert
     */
    public String getClientCACert() {
        return this.clientCACert;
    }

    /**
     * @return createFrom
     */
    public String getCreateFrom() {
        return this.createFrom;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainScope
     */
    public String getDomainScope() {
        return this.domainScope;
    }

    /**
     * @return forceHttps
     */
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    /**
     * @return mTLSEnabled
     */
    public Boolean getMTLSEnabled() {
        return this.mTLSEnabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tlsMax
     */
    public String getTlsMax() {
        return this.tlsMax;
    }

    /**
     * @return tlsMin
     */
    public String getTlsMin() {
        return this.tlsMin;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String certIdentifier; 
        private String clientCACert; 
        private String createFrom; 
        private Long createTimestamp; 
        private String domainId; 
        private String domainScope; 
        private Boolean forceHttps; 
        private Boolean mTLSEnabled; 
        private String name; 
        private String protocol; 
        private String resourceGroupId; 
        private String status; 
        private String tlsMax; 
        private String tlsMin; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(DomainInfo model) {
            this.certIdentifier = model.certIdentifier;
            this.clientCACert = model.clientCACert;
            this.createFrom = model.createFrom;
            this.createTimestamp = model.createTimestamp;
            this.domainId = model.domainId;
            this.domainScope = model.domainScope;
            this.forceHttps = model.forceHttps;
            this.mTLSEnabled = model.mTLSEnabled;
            this.name = model.name;
            this.protocol = model.protocol;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tlsMax = model.tlsMax;
            this.tlsMin = model.tlsMin;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The certificate identity from SSL Certificates Service.</p>
         * 
         * <strong>example:</strong>
         * <p>235556-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The client CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIFBTCCAu2gAwIBAgIUORLpYPGSFD1YOP6PMbE7Wd/mpTQwDQYJKoZIhvcNAQEL
         * BQAwE************************************************2VwVOJ2gqX3
         * YuGaxvIbDy0iQJ1GMerPRyzJTeVEtdIKT29u0PdFRr4KZWom35qX7G4=
         * -----END CERTIFICATE-----</p>
         */
        public Builder clientCACert(String clientCACert) {
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * <p>The source from which the domain name was created.</p>
         * 
         * <strong>example:</strong>
         * <p>Console</p>
         */
        public Builder createFrom(String createFrom) {
            this.createFrom = createFrom;
            return this;
        }

        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cq1lthllhtgja4dk54eg</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>domainScope</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        public Builder domainScope(String domainScope) {
            this.domainScope = domainScope;
            return this;
        }

        /**
         * <p>Specifies whether to enable forced HTTPS redirect when the HTTPS protocol type is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceHttps(Boolean forceHttps) {
            this.forceHttps = forceHttps;
            return this;
        }

        /**
         * <p>Specifies whether to enable mutual TLS (mTLS) authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder mTLSEnabled(Boolean mTLSEnabled) {
            this.mTLSEnabled = mTLSEnabled;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The protocol type supported by the domain name.</p>
         * <ul>
         * <li>HTTP: Only HTTP is supported.</li>
         * <li>HTTPS: Only HTTPS is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The domain name status.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The maximum TLS version. TLS 1.3 is the maximum supported version.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.3</p>
         */
        public Builder tlsMax(String tlsMax) {
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * <p>The minimum TLS version. TLS 1.0 is the minimum supported version.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.0</p>
         */
        public Builder tlsMin(String tlsMin) {
            this.tlsMin = tlsMin;
            return this;
        }

        /**
         * <p>The update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DomainInfo build() {
            return new DomainInfo(this);
        } 

    } 

}
