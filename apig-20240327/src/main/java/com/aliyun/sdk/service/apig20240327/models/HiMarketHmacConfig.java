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
 * {@link HiMarketHmacConfig} extends {@link TeaModel}
 *
 * <p>HiMarketHmacConfig</p>
 */
public class HiMarketHmacConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentials")
    private java.util.List<Credentials> credentials;

    private HiMarketHmacConfig(Builder builder) {
        this.credentials = builder.credentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketHmacConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentials
     */
    public java.util.List<Credentials> getCredentials() {
        return this.credentials;
    }

    public static final class Builder {
        private java.util.List<Credentials> credentials; 

        private Builder() {
        } 

        private Builder(HiMarketHmacConfig model) {
            this.credentials = model.credentials;
        } 

        /**
         * credentials.
         */
        public Builder credentials(java.util.List<Credentials> credentials) {
            this.credentials = credentials;
            return this;
        }

        public HiMarketHmacConfig build() {
            return new HiMarketHmacConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketHmacConfig} extends {@link TeaModel}
     *
     * <p>HiMarketHmacConfig</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ak")
        private String ak;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("sk")
        private String sk;

        private Credentials(Builder builder) {
            this.ak = builder.ak;
            this.mode = builder.mode;
            this.sk = builder.sk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return ak
         */
        public String getAk() {
            return this.ak;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return sk
         */
        public String getSk() {
            return this.sk;
        }

        public static final class Builder {
            private String ak; 
            private String mode; 
            private String sk; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.ak = model.ak;
                this.mode = model.mode;
                this.sk = model.sk;
            } 

            /**
             * ak.
             */
            public Builder ak(String ak) {
                this.ak = ak;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * sk.
             */
            public Builder sk(String sk) {
                this.sk = sk;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
