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
 * {@link QueryPhoneTwiceTelVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPhoneTwiceTelVerifyResponseBody</p>
 */
public class QueryPhoneTwiceTelVerifyResponseBody extends TeaModel {
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

    private QueryPhoneTwiceTelVerifyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPhoneTwiceTelVerifyResponseBody create() {
        return builder().build();
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

        public QueryPhoneTwiceTelVerifyResponseBody build() {
            return new QueryPhoneTwiceTelVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPhoneTwiceTelVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPhoneTwiceTelVerifyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CarrierCode")
        private String carrierCode;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private Long verifyResult;

        private Data(Builder builder) {
            this.carrierCode = builder.carrierCode;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carrierCode
         */
        public String getCarrierCode() {
            return this.carrierCode;
        }

        /**
         * @return verifyResult
         */
        public Long getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String carrierCode; 
            private Long verifyResult; 

            /**
             * CarrierCode.
             */
            public Builder carrierCode(String carrierCode) {
                this.carrierCode = carrierCode;
                return this;
            }

            /**
             * VerifyResult.
             */
            public Builder verifyResult(Long verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
