// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link GetAlipayUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlipayUrlResponseBody</p>
 */
public class GetAlipayUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetAlipayUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlipayUrlResponseBody create() {
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

        private Builder(GetAlipayUrlResponseBody model) {
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

        public GetAlipayUrlResponseBody build() {
            return new GetAlipayUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAlipayUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAlipayUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("qrUrl")
        private String qrUrl;

        private Data(Builder builder) {
            this.code = builder.code;
            this.qrUrl = builder.qrUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return qrUrl
         */
        public String getQrUrl() {
            return this.qrUrl;
        }

        public static final class Builder {
            private String code; 
            private String qrUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.qrUrl = model.qrUrl;
            } 

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * qrUrl.
             */
            public Builder qrUrl(String qrUrl) {
                this.qrUrl = qrUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
