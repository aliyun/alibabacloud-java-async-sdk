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
 * {@link ImportKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>ImportKeyPairResponseBody</p>
 */
public class ImportKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImportKeyPairResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeyPairResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ImportKeyPairResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The object that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69BCBBE4-FCF2-59B8-AD9D-531EB422****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportKeyPairResponseBody build() {
            return new ImportKeyPairResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImportKeyPairResponseBody} extends {@link TeaModel}
     *
     * <p>ImportKeyPairResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("KeyPairId")
        private String keyPairId;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        private Data(Builder builder) {
            this.gmtCreated = builder.gmtCreated;
            this.keyPairId = builder.keyPairId;
            this.keyPairName = builder.keyPairName;
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

        public static final class Builder {
            private String gmtCreated; 
            private String keyPairId; 
            private String keyPairName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtCreated = model.gmtCreated;
                this.keyPairId = model.keyPairId;
                this.keyPairName = model.keyPairName;
            } 

            /**
             * <p>The time when the ADB key pair was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-05T10:29:22Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The ID of the ADB key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>kp-6v2q33ae4tw3*****</p>
             */
            public Builder keyPairId(String keyPairId) {
                this.keyPairId = keyPairId;
                return this;
            }

            /**
             * <p>The name of the ADB key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKeyPairName</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
