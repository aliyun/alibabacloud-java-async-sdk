// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

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
 * {@link GetPhoneNumberIdentificationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneNumberIdentificationResultResponseBody</p>
 */
public class GetPhoneNumberIdentificationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPhoneNumberIdentificationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneNumberIdentificationResultResponseBody create() {
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
         * <p>The return code. Valid values:</p>
         * <ul>
         * <li>OK: The request is successful.</li>
         * <li>NoIdentificationResult: No verification result is available or the verification failed.</li>
         * <li>SessionNotValid: The session is invalid or expired.</li>
         * <li>MobileNumberIllegal: The format of the phone number is invalid.</li>
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the return code.</p>
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
         * <p>68A40250-50CD-034C-B728-0BD******177</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPhoneNumberIdentificationResultResponseBody build() {
            return new GetPhoneNumberIdentificationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhoneNumberIdentificationResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhoneNumberIdentificationResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsIdentified")
        private String isIdentified;

        private Data(Builder builder) {
            this.isIdentified = builder.isIdentified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isIdentified
         */
        public String getIsIdentified() {
            return this.isIdentified;
        }

        public static final class Builder {
            private String isIdentified; 

            /**
             * <p>Indicates whether the phone number passed the verification.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isIdentified(String isIdentified) {
                this.isIdentified = isIdentified;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
