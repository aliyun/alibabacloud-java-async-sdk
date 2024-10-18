// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendSmsVerifyCodeResponseBody} extends {@link TeaModel}
 *
 * <p>SendSmsVerifyCodeResponseBody</p>
 */
public class SendSmsVerifyCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SendSmsVerifyCodeResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsVerifyCodeResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
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
        private String message; 
        private Model model; 
        private Boolean success; 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code. If OK is returned, the request is successful. For more information, see <a href="https://help.aliyun.com/zh/pnvs/developer-reference/api-return-code?spm=a2c4g.11174283.0.0.70c5616bkj38Wa">Response codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendSmsVerifyCodeResponseBody build() {
            return new SendSmsVerifyCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendSmsVerifyCodeResponseBody} extends {@link TeaModel}
     *
     * <p>SendSmsVerifyCodeResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("VerifyCode")
        private String verifyCode;

        private Model(Builder builder) {
            this.bizId = builder.bizId;
            this.outId = builder.outId;
            this.requestId = builder.requestId;
            this.verifyCode = builder.verifyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return verifyCode
         */
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public static final class Builder {
            private String bizId; 
            private String outId; 
            private String requestId; 
            private String verifyCode; 

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>112231421412414124123^4</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The external ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1231231313</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>API-reqelekrqkllkkewrlwrjlsdfsdf</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The verification code.</p>
             * 
             * <strong>example:</strong>
             * <p>42324</p>
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
