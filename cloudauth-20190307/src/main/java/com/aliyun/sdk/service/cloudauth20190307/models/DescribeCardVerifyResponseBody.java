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

        @com.aliyun.core.annotation.NameInMap("OcrCardInfo")
        private String ocrCardInfo;

        @com.aliyun.core.annotation.NameInMap("PictureInfo")
        private String pictureInfo;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
            this.cardInfo = builder.cardInfo;
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
            private String ocrCardInfo; 
            private String pictureInfo; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizCode = model.bizCode;
                this.cardInfo = model.cardInfo;
                this.ocrCardInfo = model.ocrCardInfo;
                this.pictureInfo = model.pictureInfo;
            } 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * CardInfo.
             */
            public Builder cardInfo(String cardInfo) {
                this.cardInfo = cardInfo;
                return this;
            }

            /**
             * OcrCardInfo.
             */
            public Builder ocrCardInfo(String ocrCardInfo) {
                this.ocrCardInfo = ocrCardInfo;
                return this;
            }

            /**
             * PictureInfo.
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
