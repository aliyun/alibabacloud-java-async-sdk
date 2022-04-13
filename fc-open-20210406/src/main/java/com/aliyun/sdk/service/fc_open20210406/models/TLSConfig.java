// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TLSConfig} extends {@link TeaModel}
 *
 * <p>TLSConfig</p>
 */
public class TLSConfig extends TeaModel {
    @NameInMap("cipherSuites")
    @Validation(required = true)
    private java.util.List < String > cipherSuites;

    @NameInMap("minVersion")
    @Validation(required = true)
    private String minVersion;

    private TLSConfig(Builder builder) {
        this.cipherSuites = builder.cipherSuites;
        this.minVersion = builder.minVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TLSConfig create() {
        return builder().build();
    }

    /**
     * @return cipherSuites
     */
    public java.util.List < String > getCipherSuites() {
        return this.cipherSuites;
    }

    /**
     * @return minVersion
     */
    public String getMinVersion() {
        return this.minVersion;
    }

    public static final class Builder {
        private java.util.List < String > cipherSuites; 
        private String minVersion; 

        /**
         * TLS加密套件列表
         */
        public Builder cipherSuites(java.util.List < String > cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        /**
         * TLS最小版本号
         */
        public Builder minVersion(String minVersion) {
            this.minVersion = minVersion;
            return this;
        }

        public TLSConfig build() {
            return new TLSConfig(this);
        } 

    } 

}
