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
 * {@link PhoneNumberEncryptResponseBody} extends {@link TeaModel}
 *
 * <p>PhoneNumberEncryptResponseBody</p>
 */
public class PhoneNumberEncryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PhoneNumberEncryptResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhoneNumberEncryptResponseBody create() {
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

        private Builder(PhoneNumberEncryptResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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

        public PhoneNumberEncryptResponseBody build() {
            return new PhoneNumberEncryptResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PhoneNumberEncryptResponseBody} extends {@link TeaModel}
     *
     * <p>PhoneNumberEncryptResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptedNumber")
        private String encryptedNumber;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("OriginalNumber")
        private String originalNumber;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        private Data(Builder builder) {
            this.encryptedNumber = builder.encryptedNumber;
            this.expireTime = builder.expireTime;
            this.originalNumber = builder.originalNumber;
            this.outId = builder.outId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        public static final class Builder {
            private String encryptedNumber; 
            private String expireTime; 
            private String originalNumber; 
            private String outId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.encryptedNumber = model.encryptedNumber;
                this.expireTime = model.expireTime;
                this.originalNumber = model.originalNumber;
                this.outId = model.outId;
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

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
