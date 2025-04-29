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
 * {@link InvalidPhoneNumberFilterResponseBody} extends {@link TeaModel}
 *
 * <p>InvalidPhoneNumberFilterResponseBody</p>
 */
public class InvalidPhoneNumberFilterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InvalidPhoneNumberFilterResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvalidPhoneNumberFilterResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InvalidPhoneNumberFilterResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li><strong>MobileNumberIllegal</strong>: The phone number is invalid.</li>
         * <li><strong>EncyrptTypeIllegal</strong>: The encryption type is invalid.</li>
         * <li><strong>MobileNumberTypeNotMatch</strong>: The phone number does not match the encryption type.</li>
         * <li><strong>CarrierIllegal</strong>: The carrier type is invalid.</li>
         * <li><strong>AuthCodeNotExist</strong>: The authorization code does not exist.</li>
         * <li><strong>PortabilityNumberNotSupported</strong>: Mobile number portability is not supported.</li>
         * <li><strong>Unknown</strong>: An unknown exception occurred.</li>
         * <li><strong>AuthCodeAndApiNotMatch</strong>: A system exception occurred.</li>
         * <li><strong>AuthCodeAndApiNotMatch</strong>: The authorization code does not match the API operation.</li>
         * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Details about the returned entries.</p>
         */
        public Builder data(java.util.List<Data> data) {
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

        public InvalidPhoneNumberFilterResponseBody build() {
            return new InvalidPhoneNumberFilterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InvalidPhoneNumberFilterResponseBody} extends {@link TeaModel}
     *
     * <p>InvalidPhoneNumberFilterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EncryptedNumber")
        private String encryptedNumber;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("OriginalNumber")
        private String originalNumber;

        private Data(Builder builder) {
            this.code = builder.code;
            this.encryptedNumber = builder.encryptedNumber;
            this.expireTime = builder.expireTime;
            this.originalNumber = builder.originalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return encryptedNumber
         */
        public String getEncryptedNumber() {
            return this.encryptedNumber;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return originalNumber
         */
        public String getOriginalNumber() {
            return this.originalNumber;
        }

        public static final class Builder {
            private String code; 
            private String encryptedNumber; 
            private String expireTime; 
            private String originalNumber; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.encryptedNumber = model.encryptedNumber;
                this.expireTime = model.expireTime;
                this.originalNumber = model.originalNumber;
            } 

            /**
             * <p>The returned filter results.</p>
             * <ul>
             * <li><strong>YES</strong>: the valid phone number. The mappings are returned.</li>
             * <li><strong>NO</strong>: the invalid phone number. No mappings are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The encrypted phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1400513****</p>
             */
            public Builder encryptedNumber(String encryptedNumber) {
                this.encryptedNumber = encryptedNumber;
                return this;
            }

            /**
             * <p>The time when the phone number expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-27 16:05:23</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The original phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder originalNumber(String originalNumber) {
                this.originalNumber = originalNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
