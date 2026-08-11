// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetEncryptionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetEncryptionConfigResponseBody</p>
 */
public class GetEncryptionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetEncryptionConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEncryptionConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetEncryptionConfigResponseBody model) {
            this.config = model.config;
            this.requestId = model.requestId;
        } 

        /**
         * config.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1A662F56-CA76-55F6-869D-7F26293B8E67</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEncryptionConfigResponseBody build() {
            return new GetEncryptionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEncryptionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetEncryptionConfigResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("keyArn")
        private String keyArn;

        @com.aliyun.core.annotation.NameInMap("keyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Config(Builder builder) {
            this.alias = builder.alias;
            this.creator = builder.creator;
            this.keyArn = builder.keyArn;
            this.keyId = builder.keyId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return keyArn
         */
        public String getKeyArn() {
            return this.keyArn;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String alias; 
            private String creator; 
            private String keyArn; 
            private String keyId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.alias = model.alias;
                this.creator = model.creator;
                this.keyArn = model.keyArn;
                this.keyId = model.keyId;
                this.status = model.status;
            } 

            /**
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * keyArn.
             */
            public Builder keyArn(String keyArn) {
                this.keyArn = keyArn;
                return this;
            }

            /**
             * keyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
