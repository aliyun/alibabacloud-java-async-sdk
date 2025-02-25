// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TLSConfig} extends {@link TeaModel}
 *
 * <p>TLSConfig</p>
 */
public class TLSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cipherSuites")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > cipherSuites;

    @com.aliyun.core.annotation.NameInMap("maxVersion")
    private String maxVersion;

    @com.aliyun.core.annotation.NameInMap("minVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minVersion;

    private TLSConfig(Builder builder) {
        this.cipherSuites = builder.cipherSuites;
        this.maxVersion = builder.maxVersion;
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
         * <p>This parameter is required.</p>
         */
        public Builder cipherSuites(java.util.List < String > cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        /**
         * maxVersion.
         */
        public Builder maxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.0</p>
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
