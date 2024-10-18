// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckSmsVerifyCodeResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSmsVerifyCodeResponseBody</p>
 */
public class CheckSmsVerifyCodeResponseBody extends TeaModel {
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

    private CheckSmsVerifyCodeResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSmsVerifyCodeResponseBody create() {
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
         * <p>The response code.</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/zh/pnvs/developer-reference/api-return-code?spm=a2c4g.11174283.0.0.70c5616bkj38Wa">Response codes</a>.</li>
         * </ul>
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
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CheckSmsVerifyCodeResponseBody build() {
            return new CheckSmsVerifyCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckSmsVerifyCodeResponseBody} extends {@link TeaModel}
     *
     * <p>CheckSmsVerifyCodeResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        private Model(Builder builder) {
            this.outId = builder.outId;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String outId; 
            private String verifyResult; 

            /**
             * <p>The external ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1212312</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The verification results. Valid values:</p>
             * <ul>
             * <li>PASS: The verification is successful.</li>
             * <li>UNKNOWN: The verification failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASS</p>
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
