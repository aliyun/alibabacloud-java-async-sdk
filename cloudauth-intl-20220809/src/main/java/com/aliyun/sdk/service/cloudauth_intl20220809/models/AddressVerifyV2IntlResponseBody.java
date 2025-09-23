// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link AddressVerifyV2IntlResponseBody} extends {@link TeaModel}
 *
 * <p>AddressVerifyV2IntlResponseBody</p>
 */
public class AddressVerifyV2IntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private AddressVerifyV2IntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressVerifyV2IntlResponseBody create() {
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

        private Builder(AddressVerifyV2IntlResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p><a href="https://www.alibabacloud.com/help/zh/ekyc/latest/add-verify-pro-api?spm=a2c63.p38356.0.i4#ae60001a3804w">Return Code</a></p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Detailed description of the return code</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7F971622-38C0-5F56-B2EC-315367979B4F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public AddressVerifyV2IntlResponseBody build() {
            return new AddressVerifyV2IntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddressVerifyV2IntlResponseBody} extends {@link TeaModel}
     *
     * <p>AddressVerifyV2IntlResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("TransactionId")
        private String transactionId;

        private Result(Builder builder) {
            this.bizCode = builder.bizCode;
            this.detail = builder.detail;
            this.transactionId = builder.transactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return transactionId
         */
        public String getTransactionId() {
            return this.transactionId;
        }

        public static final class Builder {
            private String bizCode; 
            private String detail; 
            private String transactionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.bizCode = model.bizCode;
                this.detail = model.detail;
                this.transactionId = model.transactionId;
            } 

            /**
             * <p>The verification result. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Passed (billed)</li>
             * <li><strong>2</strong>: Failed (The device is in a prohibited region) (billed)</li>
             * <li><strong>3</strong>: Unknown (billed)</li>
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
             * <p>Verification details, including：</p>
             * <ul>
             * <li><p><strong>DistanceRange</strong>：Position rang：<a href="https://www.alibabacloud.com/help/zh/ekyc/latest/add-verify-pro-api?spm=a2c63.p38356.0.i27#ee274c08976er">DistanceRange description</a>。</p>
             * <blockquote>
             * <p>If the input phone number or address is empty, or if no carrier information is found, this field will not be returned.</p>
             * </blockquote>
             * </li>
             * <li><p><strong>IspName</strong>: The carrier name:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile</li>
             * <li><strong>CTCC</strong>: China Telecom</li>
             * <li><strong>CUCC</strong>: China Unicom<blockquote>
             * <p>This parameter is not returned if the mobile phone number or address is empty in the request, or if carrier information is not found.</p>
             * </blockquote>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>PhoneStatus</strong>: The status of the mobile phone:</p>
             * <ul>
             * <li><strong>0</strong>: Abnormal</li>
             * <li><strong>1</strong>: Normal</li>
             * </ul>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is not returned if the mobile phone number is empty in the request.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;distanceRange&quot;: &quot;0-3000&quot;,
             *   &quot;ispName&quot;: &quot;CTCC&quot;,
             *   &quot;phoneStatus&quot;: &quot;1&quot;
             * }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The transaction ID</p>
             * 
             * <strong>example:</strong>
             * <p>hksb7ba1b28130d24e015d69********</p>
             */
            public Builder transactionId(String transactionId) {
                this.transactionId = transactionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
