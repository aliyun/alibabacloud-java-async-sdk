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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CredentialVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The return code. A value of 200 indicates success, and other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
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

            private Builder() {
            } 

            private Builder(VlResult model) {
                this.success = model.success;
                this.vlContent = model.vlContent;
            } 

            /**
             * <p>Indicates whether the Qwen explanation is successful. Valid values:</p>
             * <ul>
             * <li>true: Successful.</li>
             * <li>false: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The content of the Qwen explanation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Does this image have obvious Photoshop features&quot;:0,&quot;Is the image a normal business photo&quot;:1,&quot;Does the image contain the words 58, Meituan, or Dianping&quot;:0,&quot;Does this image contain website information&quot;:0,&quot;Is the business scene in the image a hotel&quot;:0}</p>
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.materialInfo = model.materialInfo;
                this.ocrInfo = model.ocrInfo;
                this.result = model.result;
                this.riskScore = model.riskScore;
                this.riskTag = model.riskTag;
                this.verifyDetail = model.verifyDetail;
                this.verifyResult = model.verifyResult;
                this.vlResult = model.vlResult;
            } 

            /**
             * <p>The other information in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{</p>
             * <p>&quot;sameBackgroundDetail&quot;: {</p>
             * <p>// The request ID of the original image for the similar background</p>
             * <p>&quot;originalRequestId&quot;: &quot;130A2C10-B9EE-4D84-88E3-5384FF03****&quot;;</p>
             * <p>// The merchant ID of the original image request for the similar background</p>
             * <p>&quot;originalMerchantId&quot;: &quot;xxxxxxxx&quot;</p>
             * <p>}</p>
             * <p>}</p>
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * <p>The OCR result.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *    &quot;certNo&quot;:&quot;20216*********&quot;,
             *   &quot;certType&quot;:&quot;Primary School Teacher Qualification&quot;,
             *    &quot;gender&quot;:&quot;Male&quot;,
             *    &quot;subject&quot;:&quot;Fine Arts&quot;,
             *     &quot;name&quot;:&quot;Li**&quot;,
             *     &quot;ext_info&quot;:&quot;{}&quot;,
             *     &quot;birthDate&quot;:&quot;1998-07-28&quot;,
             *     &quot;idNo&quot;:&quot;620************&quot;,
             *     &quot;certOrg&quot;:&quot;&quot;
             * }</p>
             */
            public Builder ocrInfo(String ocrInfo) {
                this.ocrInfo = ocrInfo;
                return this;
            }

            /**
             * <p>The risk result. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Low risk.</li>
             * <li><strong>1</strong>: High risk.</li>
             * <li><strong><strong>2</strong></strong>: Suspicious.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The map of risk scores.</p>
             */
            public Builder riskScore(java.util.Map<String, String> riskScore) {
                this.riskScore = riskScore;
                return this;
            }

            /**
             * <p>The risk tags. Multiple tags are separated by commas (,). Valid values:</p>
             * <ul>
             * <li>PS: The image is photoshopped.</li>
             * <li>SCREEN_PHOTO: The image is a photo of a screen.</li>
             * <li>SCREENSHOT: The image is a screenshot.</li>
             * <li>WATERMARK: The image contains a watermark.</li>
             * <li>COLOR_PRINT: The image is a color print or copy.</li>
             * <li>WEB_IMAGE: The image is a web image.</li>
             * <li>SAME_FACE: The face is similar to another face.</li>
             * <li>SAME_BACKGROUND: The background is similar to another background.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PS,SCREEN_PHOTO</p>
             */
            public Builder riskTag(String riskTag) {
                this.riskTag = riskTag;
                return this;
            }

            /**
             * <p>The authoritative verification details.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder verifyDetail(String verifyDetail) {
                this.verifyDetail = verifyDetail;
                return this;
            }

            /**
             * <p>The authoritative verification result.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            /**
             * <p>The Qwen explanation.</p>
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
