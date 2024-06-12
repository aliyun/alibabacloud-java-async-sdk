// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhoneNumberStatusForVirtualResponseBody} extends {@link TeaModel}
 *
 * <p>PhoneNumberStatusForVirtualResponseBody</p>
 */
public class PhoneNumberStatusForVirtualResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PhoneNumberStatusForVirtualResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhoneNumberStatusForVirtualResponseBody create() {
        return builder().build();
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

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   **OK**: The request is successful.
         * *   **OperatorLimit**: The carrier prohibits the query of the phone number.
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PhoneNumberStatusForVirtualResponseBody build() {
            return new PhoneNumberStatusForVirtualResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsPrivacyNumber")
        private Boolean isPrivacyNumber;

        private Data(Builder builder) {
            this.isPrivacyNumber = builder.isPrivacyNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isPrivacyNumber
         */
        public Boolean getIsPrivacyNumber() {
            return this.isPrivacyNumber;
        }

        public static final class Builder {
            private Boolean isPrivacyNumber; 

            /**
             * Indicate whether the phone number is a virtual number assigned by the carrier. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isPrivacyNumber(Boolean isPrivacyNumber) {
                this.isPrivacyNumber = isPrivacyNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
