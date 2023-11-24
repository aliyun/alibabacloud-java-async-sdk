// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomDomainInput} extends {@link TeaModel}
 *
 * <p>UpdateCustomDomainInput</p>
 */
public class UpdateCustomDomainInput extends TeaModel {
    @NameInMap("applicationID")
    private String applicationID;

    @NameInMap("applicationName")
    private String applicationName;

    @NameInMap("certConfig")
    private CertConfig certConfig;

    @NameInMap("keepFullPath")
    private Boolean keepFullPath;

    @NameInMap("namespaceID")
    private String namespaceID;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @NameInMap("wafConfig")
    private WAFConfig wafConfig;

    private UpdateCustomDomainInput(Builder builder) {
        this.applicationID = builder.applicationID;
        this.applicationName = builder.applicationName;
        this.certConfig = builder.certConfig;
        this.keepFullPath = builder.keepFullPath;
        this.namespaceID = builder.namespaceID;
        this.protocol = builder.protocol;
        this.tlsConfig = builder.tlsConfig;
        this.wafConfig = builder.wafConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomDomainInput create() {
        return builder().build();
    }

    /**
     * @return applicationID
     */
    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return keepFullPath
     */
    public Boolean getKeepFullPath() {
        return this.keepFullPath;
    }

    /**
     * @return namespaceID
     */
    public String getNamespaceID() {
        return this.namespaceID;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return tlsConfig
     */
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    /**
     * @return wafConfig
     */
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

    public static final class Builder {
        private String applicationID; 
        private String applicationName; 
        private CertConfig certConfig; 
        private Boolean keepFullPath; 
        private String namespaceID; 
        private String protocol; 
        private TLSConfig tlsConfig; 
        private WAFConfig wafConfig; 

        /**
         * applicationID.
         */
        public Builder applicationID(String applicationID) {
            this.applicationID = applicationID;
            return this;
        }

        /**
         * applicationName.
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * certConfig.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.certConfig = certConfig;
            return this;
        }

        /**
         * keepFullPath.
         */
        public Builder keepFullPath(Boolean keepFullPath) {
            this.keepFullPath = keepFullPath;
            return this;
        }

        /**
         * namespaceID.
         */
        public Builder namespaceID(String namespaceID) {
            this.namespaceID = namespaceID;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * tlsConfig.
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * wafConfig.
         */
        public Builder wafConfig(WAFConfig wafConfig) {
            this.wafConfig = wafConfig;
            return this;
        }

        public UpdateCustomDomainInput build() {
            return new UpdateCustomDomainInput(this);
        } 

    } 

}
