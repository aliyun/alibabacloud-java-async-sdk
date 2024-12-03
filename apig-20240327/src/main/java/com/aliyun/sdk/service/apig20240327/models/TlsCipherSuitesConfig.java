// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TlsCipherSuitesConfig} extends {@link TeaModel}
 *
 * <p>TlsCipherSuitesConfig</p>
 */
public class TlsCipherSuitesConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cipherSuites")
    private java.util.List < CipherSuites> cipherSuites;

    @com.aliyun.core.annotation.NameInMap("configType")
    private String configType;

    private TlsCipherSuitesConfig(Builder builder) {
        this.cipherSuites = builder.cipherSuites;
        this.configType = builder.configType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TlsCipherSuitesConfig create() {
        return builder().build();
    }

    /**
     * @return cipherSuites
     */
    public java.util.List < CipherSuites> getCipherSuites() {
        return this.cipherSuites;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    public static final class Builder {
        private java.util.List < CipherSuites> cipherSuites; 
        private String configType; 

        /**
         * cipherSuites.
         */
        public Builder cipherSuites(java.util.List < CipherSuites> cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        public TlsCipherSuitesConfig build() {
            return new TlsCipherSuitesConfig(this);
        } 

    } 

    /**
     * 
     * {@link TlsCipherSuitesConfig} extends {@link TeaModel}
     *
     * <p>TlsCipherSuitesConfig</p>
     */
    public static class CipherSuites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("supportVersions")
        private java.util.List < String > supportVersions;

        private CipherSuites(Builder builder) {
            this.name = builder.name;
            this.supportVersions = builder.supportVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CipherSuites create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return supportVersions
         */
        public java.util.List < String > getSupportVersions() {
            return this.supportVersions;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > supportVersions; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * supportVersions.
             */
            public Builder supportVersions(java.util.List < String > supportVersions) {
                this.supportVersions = supportVersions;
                return this;
            }

            public CipherSuites build() {
                return new CipherSuites(this);
            } 

        } 

    }
}
