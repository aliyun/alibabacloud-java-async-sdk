// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CredentialVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>CredentialVerifyResponseBody</p>
 */
public class CredentialVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
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

    /**
     * 
     * {@link CredentialVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>CredentialVerifyResponseBody</p>
     */
    public static class VlResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("VlContent")
        private String vlContent;

        private VlResult(Builder builder) {
            this.success = builder.success;
            this.vlContent = builder.vlContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VlResult create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return vlContent
         */
        public String getVlContent() {
            return this.vlContent;
        }

        public static final class Builder {
            private Boolean success; 
            private String vlContent; 

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * VlContent.
             */
            public Builder vlContent(String vlContent) {
                this.vlContent = vlContent;
                return this;
            }

            public VlResult build() {
                return new VlResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link CredentialVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>CredentialVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaterialInfo")
        private String materialInfo;

        @com.aliyun.core.annotation.NameInMap("OcrInfo")
        private String ocrInfo;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("RiskScore")
        private java.util.Map<String, String> riskScore;

        @com.aliyun.core.annotation.NameInMap("RiskTag")
        private String riskTag;

        @com.aliyun.core.annotation.NameInMap("VerifyDetail")
        private String verifyDetail;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        @com.aliyun.core.annotation.NameInMap("VlResult")
        private VlResult vlResult;

        private ResultObject(Builder builder) {
            this.materialInfo = builder.materialInfo;
            this.ocrInfo = builder.ocrInfo;
            this.result = builder.result;
            this.riskScore = builder.riskScore;
            this.riskTag = builder.riskTag;
            this.verifyDetail = builder.verifyDetail;
            this.verifyResult = builder.verifyResult;
            this.vlResult = builder.vlResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return materialInfo
         */
        public String getMaterialInfo() {
            return this.materialInfo;
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
        public java.util.Map<String, String> getRiskScore() {
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

        /**
         * @return vlResult
         */
        public VlResult getVlResult() {
            return this.vlResult;
        }

        public static final class Builder {
            private String materialInfo; 
            private String ocrInfo; 
            private String result; 
            private java.util.Map<String, String> riskScore; 
            private String riskTag; 
            private String verifyDetail; 
            private String verifyResult; 
            private VlResult vlResult; 

            /**
             * MaterialInfo.
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

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
            public Builder riskScore(java.util.Map<String, String> riskScore) {
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

            /**
             * VlResult.
             */
            public Builder vlResult(VlResult vlResult) {
                this.vlResult = vlResult;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
