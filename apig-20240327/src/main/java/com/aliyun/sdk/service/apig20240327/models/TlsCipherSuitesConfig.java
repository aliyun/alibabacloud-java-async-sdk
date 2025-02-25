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
 * {@link TlsCipherSuitesConfig} extends {@link TeaModel}
 *
 * <p>TlsCipherSuitesConfig</p>
 */
public class TlsCipherSuitesConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("tlsCipherSuite")
    private java.util.List<TlsCipherSuite> tlsCipherSuite;

    private TlsCipherSuitesConfig(Builder builder) {
        this.configType = builder.configType;
        this.tlsCipherSuite = builder.tlsCipherSuite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TlsCipherSuitesConfig create() {
        return builder().build();
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return tlsCipherSuite
     */
    public java.util.List<TlsCipherSuite> getTlsCipherSuite() {
        return this.tlsCipherSuite;
    }

    public static final class Builder {
        private String configType; 
        private java.util.List<TlsCipherSuite> tlsCipherSuite; 

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * tlsCipherSuite.
         */
        public Builder tlsCipherSuite(java.util.List<TlsCipherSuite> tlsCipherSuite) {
            this.tlsCipherSuite = tlsCipherSuite;
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
    public static class TlsCipherSuite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("supportVersions")
        private java.util.List<String> supportVersions;

        private TlsCipherSuite(Builder builder) {
            this.name = builder.name;
            this.supportVersions = builder.supportVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TlsCipherSuite create() {
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
        public java.util.List<String> getSupportVersions() {
            return this.supportVersions;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> supportVersions; 

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
            public Builder supportVersions(java.util.List<String> supportVersions) {
                this.supportVersions = supportVersions;
                return this;
            }

            public TlsCipherSuite build() {
                return new TlsCipherSuite(this);
            } 

        } 

    }
}
