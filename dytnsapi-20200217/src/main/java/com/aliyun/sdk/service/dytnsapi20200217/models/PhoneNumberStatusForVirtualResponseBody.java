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
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li><strong>OperatorLimit</strong>: The carrier prohibits the query of the phone number.</li>
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

        public PhoneNumberStatusForVirtualResponseBody build() {
            return new PhoneNumberStatusForVirtualResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PhoneNumberStatusForVirtualResponseBody} extends {@link TeaModel}
     *
     * <p>PhoneNumberStatusForVirtualResponseBody</p>
     */
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
             * <p>Indicate whether the phone number is a virtual number assigned by the carrier. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
