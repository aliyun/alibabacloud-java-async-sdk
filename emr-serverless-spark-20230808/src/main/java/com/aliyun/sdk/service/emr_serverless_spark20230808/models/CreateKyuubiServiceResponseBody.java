// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateKyuubiServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKyuubiServiceResponseBody</p>
 */
public class CreateKyuubiServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateKyuubiServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKyuubiServiceResponseBody create() {
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

        private Builder(CreateKyuubiServiceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKyuubiServiceResponseBody build() {
            return new CreateKyuubiServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateKyuubiServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateKyuubiServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("kyuubiServiceId")
        private String kyuubiServiceId;

        private Data(Builder builder) {
            this.kyuubiServiceId = builder.kyuubiServiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return kyuubiServiceId
         */
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

        public static final class Builder {
            private String kyuubiServiceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.kyuubiServiceId = model.kyuubiServiceId;
            } 

            /**
             * <p>Kyuubi Service ID。</p>
             * 
             * <strong>example:</strong>
             * <p>kb-f99935b350fb4****7ef700b8b4197a3</p>
             */
            public Builder kyuubiServiceId(String kyuubiServiceId) {
                this.kyuubiServiceId = kyuubiServiceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
