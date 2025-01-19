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
 * {@link ThreeElementsVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>ThreeElementsVerificationResponseBody</p>
 */
public class ThreeElementsVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ThreeElementsVerificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ThreeElementsVerificationResponseBody create() {
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
         * <p>The response code.</p>
         * <ul>
         * <li><strong>OK</strong>: The request is successful.</li>
         * <li>For more information, see Error codes in this documentation.</li>
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

        public ThreeElementsVerificationResponseBody build() {
            return new ThreeElementsVerificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ThreeElementsVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>ThreeElementsVerificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasicCarrier")
        private String basicCarrier;

        @com.aliyun.core.annotation.NameInMap("IsConsistent")
        private Integer isConsistent;

        private Data(Builder builder) {
            this.basicCarrier = builder.basicCarrier;
            this.isConsistent = builder.isConsistent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return basicCarrier
         */
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        /**
         * @return isConsistent
         */
        public Integer getIsConsistent() {
            return this.isConsistent;
        }

        public static final class Builder {
            private String basicCarrier; 
            private Integer isConsistent; 

            /**
             * <p>The basic carrier. Valid values:</p>
             * <ul>
             * <li><strong>China Mobile</strong></li>
             * <li><strong>China Unicom</strong></li>
             * <li><strong>China Telecom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>China Mobile</p>
             */
            public Builder basicCarrier(String basicCarrier) {
                this.basicCarrier = basicCarrier;
                return this;
            }

            /**
             * <p>Indicates whether the specified name, phone number, and ID card number belong to the same user. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The specified name, phone number, and ID card number belong to the same user.</li>
             * <li><strong>0</strong>: The specified name, phone number, and ID card number do not belong to the same user.</li>
             * <li><strong>2</strong>: The specified name, phone number, and ID card number cannot be found.</li>
             * </ul>
             * <p><strong>Note</strong> The phone number registration data of a user is usually updated one or three days after registration. The registration data can be queried only after the update. The following table shows the verification results under different phone number states.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Carrier/Phone number state</th>
             * <th>Out-of-service</th>
             * <th>Nonexistent</th>
             * <th>Canceled</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>China Mobile</td>
             * <td>Verifications can be carried out normally.</td>
             * <td>The specified name, phone number, and ID card number cannot be found.</td>
             * <td>The specified name, phone number, and ID card number cannot be found.</td>
             * </tr>
             * <tr>
             * <td>China Unicom</td>
             * <td>Verifications can be carried out normally.</td>
             * <td>The specified name, phone number, and ID card number do not belong to the same user.</td>
             * <td>The specified name, phone number, and ID card number do not belong to the same user.</td>
             * </tr>
             * <tr>
             * <td>China Telecom</td>
             * <td>Verifications can be carried out normally.</td>
             * <td>The specified name, phone number, and ID card number cannot be found.</td>
             * <td>The specified name, phone number, and ID card number cannot be found.</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isConsistent(Integer isConsistent) {
                this.isConsistent = isConsistent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
