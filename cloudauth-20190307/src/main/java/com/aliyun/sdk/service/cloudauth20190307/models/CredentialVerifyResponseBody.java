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
         * <p>Return code: 200 for success, others for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result</p>
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
             * <p>Indicates whether the call was successful. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The call was successful.</li>
             * <li><strong>false</strong>: The call failed.</li>
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
             * <p>Image understanding result:</p>
             * <ul>
             * <li><p>When PromptModel is DEFAULT, the output format refers to the example on the right.</p>
             * </li>
             * <li><p>When PromptModel is CUSTOM, the output format follows the agreed format of the Prompt.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;这张图有没有明显的PS特征&quot;:0,&quot;图片是否为正常经营照片&quot;:1,&quot;图片中有没有58、美团、大众点评字样&quot;:0,&quot;这张图有没有网站信息&quot;:0,&quot;图片经营的场景是否为酒店&quot;:0}</p>
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
             * <p>Additional information in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{</p>
             * <p>&quot;sameBackgroundDetail&quot;: {</p>
             * <p>// 相似背景对于的原始图请求RequestId</p>
             * <p>&quot;originalRequestId&quot;: &quot;130A2C10-B9EE-4D84-88E3-5384FF03****&quot;;</p>
             * <p>// 相似背景对于的原始图请求商户ID</p>
             * <p>&quot;originalMerchantId&quot;: &quot;xxxxxxxx&quot;</p>
             * <p>}</p>
             * <p>}</p>
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * <p>OCR recognition result.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *    &quot;certNo&quot;:&quot;20216*********&quot;,
             *   &quot;certType&quot;:&quot;小学教师资格&quot;,
             *    &quot;gender&quot;:&quot;男&quot;,
             *    &quot;subject&quot;:&quot;美术&quot;,
             *     &quot;name&quot;:&quot;李**&quot;,
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
             * <p>Risk result</p>
             * <ul>
             * <li><strong>0</strong>: Low risk</li>
             * <li><strong>1</strong>: High risk</li>
             * <li><strong>2</strong>: Suspicious</li>
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
             * <p>Risk score map.</p>
             */
            public Builder riskScore(java.util.Map<String, String> riskScore) {
                this.riskScore = riskScore;
                return this;
            }

            /**
             * <p>Risk tags, separated by commas (,), including:</p>
             * <ul>
             * <li><strong>PS</strong>: Image manipulation.</li>
             * <li><strong>SCREEN_PHOTO</strong>: Screen recapture.</li>
             * <li><strong>SCREENSHOT</strong>: Screenshot.</li>
             * <li><strong>WATERMARK</strong>: Watermark.</li>
             * <li><strong>SAME_BACKGROUND</strong>: Similar background.</li>
             * <li><strong>ORIGINAL_PHOTO</strong>: Not the original image</li>
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
             * <p>Authority verification details.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder verifyDetail(String verifyDetail) {
                this.verifyDetail = verifyDetail;
                return this;
            }

            /**
             * <p>The verification result.</p>
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
             * <p>Qwen interpretation.</p>
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
