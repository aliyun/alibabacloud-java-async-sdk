// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProduceAikcertResponseBody} extends {@link TeaModel}
 *
 * <p>ProduceAikcertResponseBody</p>
 */
public class ProduceAikcertResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ProduceAikcertResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProduceAikcertResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ProduceAikcertResponseBody build() {
            return new ProduceAikcertResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DataCredentialBlob")
        private String dataCredentialBlob;

        @NameInMap("KeyCredentialBlob")
        private String keyCredentialBlob;

        private Data(Builder builder) {
            this.dataCredentialBlob = builder.dataCredentialBlob;
            this.keyCredentialBlob = builder.keyCredentialBlob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataCredentialBlob
         */
        public String getDataCredentialBlob() {
            return this.dataCredentialBlob;
        }

        /**
         * @return keyCredentialBlob
         */
        public String getKeyCredentialBlob() {
            return this.keyCredentialBlob;
        }

        public static final class Builder {
            private String dataCredentialBlob; 
            private String keyCredentialBlob; 

            /**
             * DataCredentialBlob.
             */
            public Builder dataCredentialBlob(String dataCredentialBlob) {
                this.dataCredentialBlob = dataCredentialBlob;
                return this;
            }

            /**
             * KeyCredentialBlob.
             */
            public Builder keyCredentialBlob(String keyCredentialBlob) {
                this.keyCredentialBlob = keyCredentialBlob;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
