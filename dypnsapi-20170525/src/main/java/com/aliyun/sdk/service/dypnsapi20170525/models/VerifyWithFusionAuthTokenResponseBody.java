// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyWithFusionAuthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyWithFusionAuthTokenResponseBody</p>
 */
public class VerifyWithFusionAuthTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private VerifyWithFusionAuthTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWithFusionAuthTokenResponseBody create() {
        return builder().build();
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
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. If OK is returned, the request is successful. Other values indicate that the request failed. For more information, see Error codes.</p>
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
         * <p>The request ID, which is used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values: true false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyWithFusionAuthTokenResponseBody build() {
            return new VerifyWithFusionAuthTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyWithFusionAuthTokenResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyWithFusionAuthTokenResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("PhoneScore")
        private Long phoneScore;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        private Model(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
            this.phoneScore = builder.phoneScore;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return phoneScore
         */
        public Long getPhoneScore() {
            return this.phoneScore;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String phoneNumber; 
            private Long phoneScore; 
            private String verifyResult; 

            /**
             * <p>The phone number, which is returned when the verification is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>180********</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The phone number score, which is generated only after the phone number scoring node is enabled and the verification is successful. The higher the score, the more risky the phone number. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder phoneScore(Long phoneScore) {
                this.phoneScore = phoneScore;
                return this;
            }

            /**
             * <p>The verification result. Valid values: PASS and UNKNOWN.</p>
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
