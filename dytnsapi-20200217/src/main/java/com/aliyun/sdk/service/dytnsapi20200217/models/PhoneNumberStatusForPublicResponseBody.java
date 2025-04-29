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
 * {@link PhoneNumberStatusForPublicResponseBody} extends {@link TeaModel}
 *
 * <p>PhoneNumberStatusForPublicResponseBody</p>
 */
public class PhoneNumberStatusForPublicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PhoneNumberStatusForPublicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhoneNumberStatusForPublicResponseBody create() {
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

        private Builder(PhoneNumberStatusForPublicResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li><strong>OperatorLimit</strong>: The carrier prohibits the query of the phone number.</li>
         * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
         * </ul>
         * <blockquote>
         * <p> For a list of error codes, see <a href="https://next.api.aliyun.com/document/Dytnsapi/2020-02-17/errorCode">Service error codes</a>.</p>
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
         * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CC3BB6D2-<strong><strong>-</strong></strong>-9DCE-B38165CE4C47</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PhoneNumberStatusForPublicResponseBody build() {
            return new PhoneNumberStatusForPublicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PhoneNumberStatusForPublicResponseBody} extends {@link TeaModel}
     *
     * <p>PhoneNumberStatusForPublicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.carrier = builder.carrier;
            this.status = builder.status;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String carrier; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.carrier = model.carrier;
                this.status = model.status;
            } 

            /**
             * <p>The basic carrier who assigns the phone number. If the queried phone number involves mobile number portability, the carrier after mobile number portability is returned.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile</li>
             * <li><strong>CUCC</strong>: China Unicom</li>
             * <li><strong>CTCC</strong>: China Telecom</li>
             * </ul>
             * <blockquote>
             * <p> You are not allowed to query the phone numbers assigned by China Broadnet.</p>
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
             * <p>The returned status for the queried phone number. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The queried phone number can be reached.</li>
             * <li><strong>SHUTDOWN</strong>: The queried phone number is suspended.</li>
             * <li><strong>POWER_OFF</strong>: The phone is powered off.</li>
             * <li><strong>NOT_EXIST</strong>: The queried phone number is a nonexistent number.</li>
             * <li><strong>SUSPECTED_POWER_OFF</strong>: The phone is suspected to be powered off.</li>
             * <li><strong>BUSY</strong>: The queried phone number is busy.</li>
             * <li><strong>UNKNOWN</strong>: The queried phone number is unknown.</li>
             * </ul>
             * <blockquote>
             * <p> Due to system adjustment of the carrier, the BUSY and POWER_OFF states cannot be returned for the numbers assigned by China Telecom. <a href="https://help.aliyun.com/document_detail/2489709.html">For more information, see the official announcements</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
