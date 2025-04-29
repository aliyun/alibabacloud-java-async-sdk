// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link GetUAIDApplyTokenSignResponseBody} extends {@link TeaModel}
 *
 * <p>GetUAIDApplyTokenSignResponseBody</p>
 */
public class GetUAIDApplyTokenSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUAIDApplyTokenSignResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUAIDApplyTokenSignResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUAIDApplyTokenSignResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUAIDApplyTokenSignResponseBody build() {
            return new GetUAIDApplyTokenSignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUAIDApplyTokenSignResponseBody} extends {@link TeaModel}
     *
     * <p>GetUAIDApplyTokenSignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("Sign")
        private String sign;

        private Data(Builder builder) {
            this.carrier = builder.carrier;
            this.outId = builder.outId;
            this.sign = builder.sign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        public static final class Builder {
            private String carrier; 
            private String outId; 
            private String sign; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.carrier = model.carrier;
                this.outId = model.outId;
                this.sign = model.sign;
            } 

            /**
             * Carrier.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
