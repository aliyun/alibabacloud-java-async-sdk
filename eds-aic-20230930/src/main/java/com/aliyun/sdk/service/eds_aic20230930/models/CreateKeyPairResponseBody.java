// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link CreateKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyPairResponseBody</p>
 */
public class CreateKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKeyPairResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>Returned result object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Interface request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKeyPairResponseBody build() {
            return new CreateKeyPairResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateKeyPairResponseBody} extends {@link TeaModel}
     *
     * <p>CreateKeyPairResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("KeyPairId")
        private String keyPairId;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("PrivateKeyBody")
        private String privateKeyBody;

        private Data(Builder builder) {
            this.gmtCreated = builder.gmtCreated;
            this.keyPairId = builder.keyPairId;
            this.keyPairName = builder.keyPairName;
            this.privateKeyBody = builder.privateKeyBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return keyPairId
         */
        public String getKeyPairId() {
            return this.keyPairId;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return privateKeyBody
         */
        public String getPrivateKeyBody() {
            return this.privateKeyBody;
        }

        public static final class Builder {
            private String gmtCreated; 
            private String keyPairId; 
            private String keyPairName; 
            private String privateKeyBody; 

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-30 08:45:09.0</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>ADB key pair ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kp-6v2q33ae4tw3*****</p>
             */
            public Builder keyPairId(String keyPairId) {
                this.keyPairId = keyPairId;
                return this;
            }

            /**
             * <p>Key pair name.</p>
             * 
             * <strong>example:</strong>
             * <p>testKeyPairName</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The private key of the key pair. This is the PEM-encoded PKCS#8 format private key that conforms to the ADB key pair specification.</p>
             * 
             * <strong>example:</strong>
             * <p>MIIEpAIBAAKCAQEAtReyMzLIcBH78EV2zj****</p>
             */
            public Builder privateKeyBody(String privateKeyBody) {
                this.privateKeyBody = privateKeyBody;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
