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
 * {@link DescribeAuthVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthVerifyResponseBody</p>
 */
public class DescribeAuthVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeAuthVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuthVerifyResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeAuthVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return message.</p>
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
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAuthVerifyResponseBody build() {
            return new DescribeAuthVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuthVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthVerifyResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaterialInfo")
        private String materialInfo;

        @com.aliyun.core.annotation.NameInMap("SpoofBackInfo")
        private String spoofBackInfo;

        @com.aliyun.core.annotation.NameInMap("SpoofInfo")
        private String spoofInfo;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private Result(Builder builder) {
            this.materialInfo = builder.materialInfo;
            this.spoofBackInfo = builder.spoofBackInfo;
            this.spoofInfo = builder.spoofInfo;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return materialInfo
         */
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        /**
         * @return spoofBackInfo
         */
        public String getSpoofBackInfo() {
            return this.spoofBackInfo;
        }

        /**
         * @return spoofInfo
         */
        public String getSpoofInfo() {
            return this.spoofInfo;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String materialInfo; 
            private String spoofBackInfo; 
            private String spoofInfo; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.materialInfo = model.materialInfo;
                this.spoofBackInfo = model.spoofBackInfo;
                this.spoofInfo = model.spoofInfo;
                this.subCode = model.subCode;
            } 

            /**
             * <ul>
             * <li>The card and certificate information read by OCR (ocrIdCardInfo)</li>
             * <li>The photo of the card and certificate information edited on the client (ocrIdEditInfo)</li>
             * <li>The OSS storage location and URL of the OCR photo (ocrPictureFront)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;ocrIdCardInfo&quot;: {
             *     &quot;certName&quot;: &quot;Mr. Zhang&quot;,
             *     &quot;sex&quot;: &quot;Male&quot;,
             *     &quot;nationality&quot;: &quot;Han&quot;,
             *     &quot;birth&quot;: &quot;20010213&quot;,
             *     &quot;address&quot;: &quot;No. X, XX Street, XXX District, XX City, XXX Province&quot;,
             *     &quot;certNo&quot;: &quot;4<strong><strong><strong><strong><strong><strong><strong><strong>X&quot;,
             *     &quot;authority&quot;: &quot;XXX Branch of XXX Public Security Bureau&quot;,
             *     &quot;startDate&quot;: &quot;20250523&quot;,
             *     &quot;endDate&quot;: &quot;20450523&quot;
             *   },
             * &quot;ocrIdEditInfo&quot;: {
             *     &quot;certName&quot;: &quot;Mr. Zhang&quot;,
             *     &quot;sex&quot;: &quot;Male&quot;,
             *     &quot;nationality&quot;: &quot;Han&quot;,
             *     &quot;birth&quot;: &quot;20010213&quot;,
             *     &quot;address&quot;: &quot;No. X, XX Street, XXX District, XX City, XXX Province&quot;,
             *     &quot;certNo&quot;: &quot;4</strong></strong></strong></strong></strong></strong></strong></strong>X&quot;,
             *     &quot;authority&quot;: &quot;XXX Branch of XXX Public Security Bureau&quot;,
             *     &quot;startDate&quot;: &quot;20250523&quot;,
             *     &quot;endDate&quot;: &quot;20450523&quot;
             *   },
             *   &quot;ocrPictureFront&quot;: {
             *     &quot;ossBucketName&quot;: &quot;cn-shanghai-aliyun-cloudauth-12********&quot;,
             *     &quot;ossIdFaceObjectName&quot;: &quot;verify/1234567890/f7ed1ef80ad1234fdsd95c<strong><strong><strong><strong>cd_ocridface_b749.jpeg&quot;,
             *     &quot;ossIdFaceUrl&quot;: &quot;<a href="http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridface_b749.jpeg?security-token=CAISjdfgeJ1q6F">http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridface_b749.jpeg?security-token=CAISjdfgeJ1q6F</a>...&quot;,
             *     &quot;ossIdNationalEmblemObjectName&quot;: &quot;verify/1234567890/f7ed1ef80ad1234fdsd95c</strong></strong></strong></strong>cd_ocridnationalemblem_a3hf.jpeg&quot;,
             *     &quot;ossIdNationalEmblemUrl&quot;: &quot;<a href="http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridnationalemblem_a3hf.jpeg?security-token=CAISjgJ1q6">http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridnationalemblem_a3hf.jpeg?security-token=CAISjgJ1q6</a>...&quot;
             *   }</p>
             */
            public Builder materialInfo(String materialInfo) {
                this.materialInfo = materialInfo;
                return this;
            }

            /**
             * <p>The anti-spoofing detection result for the back side of the ID card, including the risk determination result and risk type:</p>
             * <blockquote>
             * <p>- 
             * Anti-spoofing detection for the back side of the card is enabled only when IdSpoof is set to Y in the Initialize operation. Otherwise, spoofRiskResult defaults to N, and spoofType is empty.</p>
             * </blockquote>
             * <p>spoofRiskResult:</p>
             * <ul>
             * <li>Y: Risk detected</li>
             * <li>N: No risk detected</li>
             * </ul>
             * <p>spoofType:</p>
             * <ul>
             * <li>SCREEN_REMARK: Screen recapture</li>
             * <li>PHOTO_COPY: Photocopy</li>
             * <li>TAMPER: Image tampering</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This field contains algorithm prediction results and may not be returned. Avoid building critical business dependencies on this field.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>spoofRiskResult：Y
             * spoofType：SCREEN_REMARK</p>
             */
            public Builder spoofBackInfo(String spoofBackInfo) {
                this.spoofBackInfo = spoofBackInfo;
                return this;
            }

            /**
             * <p>The anti-spoofing detection result for the front side of the ID card, including the risk determination result and risk type:</p>
             * <blockquote>
             * <p>- 
             * Anti-spoofing detection for the front side of the card is enabled only when IdSpoof is set to Y in the Initialize operation. Otherwise, spoofRiskResult defaults to N, and spoofType is empty.</p>
             * </blockquote>
             * <p>spoofRiskResult:</p>
             * <ul>
             * <li>Y: Risk detected</li>
             * <li>N: No risk detected</li>
             * </ul>
             * <p>spoofType:</p>
             * <ul>
             * <li>SCREEN_REMARK: Screen recapture</li>
             * <li>PHOTO_COPY: Photocopy</li>
             * <li>TAMPER: Image tampering</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This field contains algorithm prediction results and may not be returned. Avoid building critical business dependencies on this field.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>spoofRiskResult：Y
             * spoofType：SCREEN_REMARK</p>
             */
            public Builder spoofInfo(String spoofInfo) {
                this.spoofInfo = spoofInfo;
                return this;
            }

            /**
             * <p>The result description.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
