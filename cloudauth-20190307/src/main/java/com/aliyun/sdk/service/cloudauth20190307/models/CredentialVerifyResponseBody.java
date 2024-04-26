// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CredentialVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>CredentialVerifyResponseBody</p>
 */
public class CredentialVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultObject")
    private ResultObject resultObject;

    private CredentialVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialVerifyResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CredentialVerifyResponseBody build() {
            return new CredentialVerifyResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @NameInMap("OcrInfo")
        private String ocrInfo;

        @NameInMap("Result")
        private String result;

        @NameInMap("RiskScore")
        private java.util.Map < String, String > riskScore;

        @NameInMap("RiskTag")
        private String riskTag;

        @NameInMap("VerifyDetail")
        private String verifyDetail;

        @NameInMap("VerifyResult")
        private String verifyResult;

        private ResultObject(Builder builder) {
            this.ocrInfo = builder.ocrInfo;
            this.result = builder.result;
            this.riskScore = builder.riskScore;
            this.riskTag = builder.riskTag;
            this.verifyDetail = builder.verifyDetail;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return ocrInfo
         */
        public String getOcrInfo() {
            return this.ocrInfo;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return riskScore
         */
        public java.util.Map < String, String > getRiskScore() {
            return this.riskScore;
        }

        /**
         * @return riskTag
         */
        public String getRiskTag() {
            return this.riskTag;
        }

        /**
         * @return verifyDetail
         */
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String ocrInfo; 
            private String result; 
            private java.util.Map < String, String > riskScore; 
            private String riskTag; 
            private String verifyDetail; 
            private String verifyResult; 

            /**
             * OcrInfo.
             */
            public Builder ocrInfo(String ocrInfo) {
                this.ocrInfo = ocrInfo;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * RiskScore.
             */
            public Builder riskScore(java.util.Map < String, String > riskScore) {
                this.riskScore = riskScore;
                return this;
            }

            /**
             * RiskTag.
             */
            public Builder riskTag(String riskTag) {
                this.riskTag = riskTag;
                return this;
            }

            /**
             * VerifyDetail.
             */
            public Builder verifyDetail(String verifyDetail) {
                this.verifyDetail = verifyDetail;
                return this;
            }

            /**
             * VerifyResult.
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
