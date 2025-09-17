// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link VerifyLogisticsSmsMailNoResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyLogisticsSmsMailNoResponseBody</p>
 */
public class VerifyLogisticsSmsMailNoResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private VerifyLogisticsSmsMailNoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyLogisticsSmsMailNoResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyLogisticsSmsMailNoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyLogisticsSmsMailNoResponseBody build() {
            return new VerifyLogisticsSmsMailNoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyLogisticsSmsMailNoResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyLogisticsSmsMailNoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressCompanyCode")
        private String expressCompanyCode;

        @com.aliyun.core.annotation.NameInMap("MobileSuffix")
        private String mobileSuffix;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private Boolean verifyResult;

        private Data(Builder builder) {
            this.expressCompanyCode = builder.expressCompanyCode;
            this.mobileSuffix = builder.mobileSuffix;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expressCompanyCode
         */
        public String getExpressCompanyCode() {
            return this.expressCompanyCode;
        }

        /**
         * @return mobileSuffix
         */
        public String getMobileSuffix() {
            return this.mobileSuffix;
        }

        /**
         * @return verifyResult
         */
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String expressCompanyCode; 
            private String mobileSuffix; 
            private Boolean verifyResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.expressCompanyCode = model.expressCompanyCode;
                this.mobileSuffix = model.mobileSuffix;
                this.verifyResult = model.verifyResult;
            } 

            /**
             * ExpressCompanyCode.
             */
            public Builder expressCompanyCode(String expressCompanyCode) {
                this.expressCompanyCode = expressCompanyCode;
                return this;
            }

            /**
             * MobileSuffix.
             */
            public Builder mobileSuffix(String mobileSuffix) {
                this.mobileSuffix = mobileSuffix;
                return this;
            }

            /**
             * VerifyResult.
             */
            public Builder verifyResult(Boolean verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
