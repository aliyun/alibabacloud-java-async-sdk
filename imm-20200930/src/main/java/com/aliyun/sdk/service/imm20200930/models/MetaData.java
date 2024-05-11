// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MetaData} extends {@link TeaModel}
 *
 * <p>MetaData</p>
 */
public class MetaData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private MetaData(Builder builder) {
        this.identifier = builder.identifier;
        this.provider = builder.provider;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaData create() {
        return builder().build();
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String identifier; 
        private String provider; 
        private String version; 

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public MetaData build() {
            return new MetaData(this);
        } 

    } 

}
