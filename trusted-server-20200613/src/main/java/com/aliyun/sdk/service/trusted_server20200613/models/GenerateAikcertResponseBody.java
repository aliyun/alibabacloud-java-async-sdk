// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAikcertResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAikcertResponseBody</p>
 */
public class GenerateAikcertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    private GenerateAikcertResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAikcertResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GenerateAikcertResponseBody build() {
            return new GenerateAikcertResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("dataCredentialBlob")
        private String dataCredentialBlob;

        @NameInMap("keyCredentialBlob")
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
             * dataCredentialBlob.
             */
            public Builder dataCredentialBlob(String dataCredentialBlob) {
                this.dataCredentialBlob = dataCredentialBlob;
                return this;
            }

            /**
             * keyCredentialBlob.
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
