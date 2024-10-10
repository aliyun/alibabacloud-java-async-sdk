// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WebTLSConfig} extends {@link TeaModel}
 *
 * <p>WebTLSConfig</p>
 */
public class WebTLSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CipherSuites")
    private java.util.List < String > cipherSuites;

    @com.aliyun.core.annotation.NameInMap("MaxVersion")
    private String maxVersion;

    @com.aliyun.core.annotation.NameInMap("MinVersion")
    private String minVersion;

    private WebTLSConfig(Builder builder) {
        this.cipherSuites = builder.cipherSuites;
        this.maxVersion = builder.maxVersion;
        this.minVersion = builder.minVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebTLSConfig create() {
        return builder().build();
    }

    /**
     * @return cipherSuites
     */
    public java.util.List < String > getCipherSuites() {
        return this.cipherSuites;
    }

    /**
     * @return maxVersion
     */
    public String getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * @return minVersion
     */
    public String getMinVersion() {
        return this.minVersion;
    }

    public static final class Builder {
        private java.util.List < String > cipherSuites; 
        private String maxVersion; 
        private String minVersion; 

        /**
         * CipherSuites.
         */
        public Builder cipherSuites(java.util.List < String > cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        /**
         * MaxVersion.
         */
        public Builder maxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * MinVersion.
         */
        public Builder minVersion(String minVersion) {
            this.minVersion = minVersion;
            return this;
        }

        public WebTLSConfig build() {
            return new WebTLSConfig(this);
        } 

    } 

}
