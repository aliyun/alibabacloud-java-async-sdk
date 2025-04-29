// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link DescribePhoneTwiceTelVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneTwiceTelVerifyResponseBody</p>
 */
public class DescribePhoneTwiceTelVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePhoneTwiceTelVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneTwiceTelVerifyResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePhoneTwiceTelVerifyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li><strong>PortabilityNumberNotSupported</strong>: The phone number that is involved in mobile number portability is not supported.</li>
         * <li><strong>RequestNumberNotSupported</strong>: You are not allowed to query phone numbers assigned by China Broadnet (that is, phone numbers start with 192) and phone numbers assigned by virtual network operators (VNOs).</li>
         * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
         * </ul>
         * <blockquote>
         * <p> You are charged for phone number verifications if the value of Code is OK and the value of VerifyResult is not 0. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html">Pricing</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID. It is a common parameter and can be used to troubleshoot and locate issues.</p>
         * 
         * <strong>example:</strong>
         * <p>68A40250-50CD-034C-B728-0BD135850177</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneTwiceTelVerifyResponseBody build() {
            return new DescribePhoneTwiceTelVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhoneTwiceTelVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhoneTwiceTelVerifyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        private Data(Builder builder) {
            this.carrier = builder.carrier;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String carrier; 
            private String verifyResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.carrier = model.carrier;
                this.verifyResult = model.verifyResult;
            } 

            /**
             * <p>The carrier. Valid values:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile</li>
             * <li><strong>CUCC</strong>: China Unicom</li>
             * <li><strong>CTCC</strong>: China Telecom</li>
             * </ul>
             * <blockquote>
             * <p> The returned result indicates the carrier who assigns the phone number. If the phone number involves mobile number portability, the carrier after mobile number portability is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * <p>The result of the request. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: It is unable to judge whether the phone number is a reassigned number.</li>
             * <li><strong>1</strong>: The phone number is a reassigned number.</li>
             * <li><strong>2</strong>: The phone number is not a reassigned number.</li>
             * <li><strong>3</strong>: The phone number has been canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder verifyResult(String verifyResult) {
                this.verifyResult = verifyResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
