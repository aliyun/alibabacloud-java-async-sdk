// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptKMSDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DecryptKMSDataKeyResponseBody</p>
 */
public class DecryptKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("DataKey")
    private DataKey dataKey;

    @NameInMap("RequestId")
    private String requestId;

    private DecryptKMSDataKeyResponseBody(Builder builder) {
        this.dataKey = builder.dataKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptKMSDataKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataKey
     */
    public DataKey getDataKey() {
        return this.dataKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataKey dataKey; 
        private String requestId; 

        /**
         * DataKey.
         */
        public Builder dataKey(DataKey dataKey) {
            this.dataKey = dataKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DecryptKMSDataKeyResponseBody build() {
            return new DecryptKMSDataKeyResponseBody(this);
        } 

    } 

    public static class DataKey extends TeaModel {
        @NameInMap("KeyId")
        private String keyId;

        @NameInMap("Plaintext")
        private String plaintext;

        private DataKey(Builder builder) {
            this.keyId = builder.keyId;
            this.plaintext = builder.plaintext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataKey create() {
            return builder().build();
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return plaintext
         */
        public String getPlaintext() {
            return this.plaintext;
        }

        public static final class Builder {
            private String keyId; 
            private String plaintext; 

            /**
             * KeyId.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * Plaintext.
             */
            public Builder plaintext(String plaintext) {
                this.plaintext = plaintext;
                return this;
            }

            public DataKey build() {
                return new DataKey(this);
            } 

        } 

    }
}
