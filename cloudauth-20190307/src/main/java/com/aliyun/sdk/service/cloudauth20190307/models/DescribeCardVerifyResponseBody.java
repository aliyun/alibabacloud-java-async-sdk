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
 * {@link DescribeCardVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCardVerifyResponseBody</p>
 */
public class DescribeCardVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeCardVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCardVerifyResponseBody create() {
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

        private Builder(DescribeCardVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code: 200 indicates success, all others indicate failure.
         * Important</p>
         * <ul>
         * <li>This parameter indicates whether the interface was called correctly. For detailed return code explanations, please refer to the error codes.</li>
         * <li>Please check the business verification results through the fields in ResultObject.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Interface call return message.
         * Important</p>
         * <ul>
         * <li>This parameter only indicates whether there was an exception with the interface.</li>
         * </ul>
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
         * <p>130A2C10-B9EE-4D84-88E3-5384FF03****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeCardVerifyResponseBody build() {
            return new DescribeCardVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCardVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCardVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("CardInfo")
        private String cardInfo;

        @com.aliyun.core.annotation.NameInMap("FaceDetail")
        private String faceDetail;

        @com.aliyun.core.annotation.NameInMap("OcrCardInfo")
        private String ocrCardInfo;

        @com.aliyun.core.annotation.NameInMap("PictureInfo")
        private String pictureInfo;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
            this.cardInfo = builder.cardInfo;
            this.faceDetail = builder.faceDetail;
            this.ocrCardInfo = builder.ocrCardInfo;
            this.pictureInfo = builder.pictureInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return cardInfo
         */
        public String getCardInfo() {
            return this.cardInfo;
        }

        /**
         * @return faceDetail
         */
        public String getFaceDetail() {
            return this.faceDetail;
        }

        /**
         * @return ocrCardInfo
         */
        public String getOcrCardInfo() {
            return this.ocrCardInfo;
        }

        /**
         * @return pictureInfo
         */
        public String getPictureInfo() {
            return this.pictureInfo;
        }

        public static final class Builder {
            private String bizCode; 
            private String cardInfo; 
            private String faceDetail; 
            private String ocrCardInfo; 
            private String pictureInfo; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizCode = model.bizCode;
                this.cardInfo = model.cardInfo;
                this.faceDetail = model.faceDetail;
                this.ocrCardInfo = model.ocrCardInfo;
                this.pictureInfo = model.pictureInfo;
            } 

            /**
             * <p>Identity verification result:</p>
             * <ul>
             * <li>1: Consistent</li>
             * <li>2: Inconsistent</li>
             * <li>3: No Record Found</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>Submitted ID card information for verification.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;address&quot;:&quot;浙江省杭州市余杭区文一西路969号&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;张三&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;汉&quot;,&quot;authority&quot;:&quot;xxx公安局&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}</p>
             */
            public Builder cardInfo(String cardInfo) {
                this.cardInfo = cardInfo;
                return this;
            }

            /**
             * <p>Image comparison score.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *  &quot;verifyScore&quot;: 50.28594166529785
             * }</p>
             */
            public Builder faceDetail(String faceDetail) {
                this.faceDetail = faceDetail;
                return this;
            }

            /**
             * <p>ID card information read by OCR.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;address&quot;:&quot;浙江省杭州市余杭区文一西路969号&quot;,&quot;birthDate&quot;:&quot;19901226&quot;,&quot;certName&quot;:&quot;张三&quot;,&quot;certNo&quot;:&quot;1234561990122*****&quot;,&quot;nationality&quot;:&quot;汉&quot;,&quot;authority&quot;:&quot;xxx公安局&quot;,&quot;startDate&quot;:&quot;20201130&quot;,&quot;endDate&quot;:&quot;20301130&quot;}</p>
             */
            public Builder ocrCardInfo(String ocrCardInfo) {
                this.ocrCardInfo = ocrCardInfo;
                return this;
            }

            /**
             * <p>Returned photo URLs.</p>
             * <ul>
             * <li>certUrl  Front side</li>
             * <li>certNationalUrl  National emblem side</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;certUrl&quot;: &quot;<a href="https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxx/xxxxxxxxxx_ocridface_dbf2_normal.jpeg">https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxx/xxxxxxxxxx_ocridface_dbf2_normal.jpeg</a>&quot;,
             *     &quot;certNationalUrl&quot;: &quot;<a href="https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxxxxx/xxxxxxxxxxx_ocridback_e8a3_normal.jpeg">https://cn-shanghai-aliyun-nmeta.cn-shanghai.oss.aliyuncs.com/verify/xxxxxxxxxx/xxxxxxxxxxx_ocridback_e8a3_normal.jpeg</a>&quot;
             * }</p>
             */
            public Builder pictureInfo(String pictureInfo) {
                this.pictureInfo = pictureInfo;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
