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
 * {@link DescribePhoneNumberOnlineTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberOnlineTimeResponseBody</p>
 */
public class DescribePhoneNumberOnlineTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberOnlineTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOnlineTimeResponseBody create() {
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

        private Builder(DescribePhoneNumberOnlineTimeResponseBody model) {
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
         * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
         * </ul>
         * <blockquote>
         * <p> You are charged if the value of Code is OK and the value of VerifyResult is not -1. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html">Pricing</a>.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberOnlineTimeResponseBody build() {
            return new DescribePhoneNumberOnlineTimeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhoneNumberOnlineTimeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhoneNumberOnlineTimeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CarrierCode")
        private String carrierCode;

        @com.aliyun.core.annotation.NameInMap("VerifyResult")
        private String verifyResult;

        private Data(Builder builder) {
            this.carrierCode = builder.carrierCode;
            this.verifyResult = builder.verifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return carrierCode
         */
        public String getCarrierCode() {
            return this.carrierCode;
        }

        /**
         * @return verifyResult
         */
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public static final class Builder {
            private String carrierCode; 
            private String verifyResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.carrierCode = model.carrierCode;
                this.verifyResult = model.verifyResult;
            } 

            /**
             * <p>The carrier code. Valid values:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile</li>
             * <li><strong>CUCC</strong>: China Unicom</li>
             * <li><strong>CTCC</strong>: China Telecom</li>
             * <li><strong>CBN</strong>: China Broadnet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder carrierCode(String carrierCode) {
                this.carrierCode = carrierCode;
                return this;
            }

            /**
             * <p>The enumerated value of the usage period of a phone number. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: No usage period information is available for the phone number.</li>
             * <li><strong>0</strong>: The phone number status is abnormal. For example, the phone number is a nonexistent number.</li>
             * <li><strong>1</strong> :[0-3) months.</li>
             * <li><strong>2</strong> :[3-6] months.</li>
             * <li><strong>3</strong> :(6-12] months.</li>
             * <li><strong>4</strong> :(12-24] months.</li>
             * <li><strong>5</strong> :(24,+) months.</li>
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
