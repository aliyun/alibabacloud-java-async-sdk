// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link TLSConfig} extends {@link TeaModel}
 *
 * <p>TLSConfig</p>
 */
public class TLSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cipherSuites")
    private java.util.List<String> cipherSuites;

    @com.aliyun.core.annotation.NameInMap("maxVersion")
    private String maxVersion;

    @com.aliyun.core.annotation.NameInMap("minVersion")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cipherSuites
     */
    public java.util.List<String> getCipherSuites() {
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
        private java.util.List<String> cipherSuites; 
        private String maxVersion; 
        private String minVersion; 

        private Builder() {
        } 

        private Builder(TLSConfig model) {
            this.cipherSuites = model.cipherSuites;
            this.maxVersion = model.maxVersion;
            this.minVersion = model.minVersion;
        } 

        /**
         * <p>The list of allowed TLS cipher suites. If this parameter is not specified, the server default cipher suites are used.</p>
         */
        public Builder cipherSuites(java.util.List<String> cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        /**
         * <p>The maximum TLS protocol version allowed. Example values: TLSv1.2 and TLSv1.3. If this parameter is not specified, the server default value is used. Do not pass an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.3</p>
         */
        public Builder maxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * <p>The minimum TLS protocol version allowed. Example values: TLSv1.2 and TLSv1.3. If this parameter is not specified, the server default value is used. Do not pass an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.2</p>
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
