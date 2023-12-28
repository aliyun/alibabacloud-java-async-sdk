// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TwoElementsVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>TwoElementsVerificationResponseBody</p>
 */
public class TwoElementsVerificationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private TwoElementsVerificationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TwoElementsVerificationResponseBody create() {
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
         * *   For more information, see Error codes in this documentation.
         * *   **RequestFrequencyLimit**: Repeated queries for the same phone number or name at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.
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

        public TwoElementsVerificationResponseBody build() {
            return new TwoElementsVerificationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BasicCarrier")
        private String basicCarrier;

        @NameInMap("IsConsistent")
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
             * The basic carriers. Valid values:
             * <p>
             * 
             * *   **China Mobile**
             * *   **China Unicom**
             * *   **China Telecom**
             * 
             * >  You are not allowed to verify numbers assigned by China Broadnet.
             */
            public Builder basicCarrier(String basicCarrier) {
                this.basicCarrier = basicCarrier;
                return this;
            }

            /**
             * Indicates whether the specified name and phone number belong to the same user. Valid values:
             * <p>
             * 
             * * **1**: The specified name and phone number belong to the same user.
             * 
             * * **0**: The specified name and phone number do not belong to the same user.
             * 
             * * **2**: The specified name and phone number cannot be found.
             * 
             * The phone number registration data of a user is usually updated one or three days after registration. The registration data can be queried only after the update. The following table shows the verification results under different phone number states.
             * 
             * |Carrier/Phone number state|Out-of-service|Nonexistent|Canceled|
             * |---|---|---|---|
             * |China Mobile|Verifications can be carried out normally.|The specified name and phone number cannot be found.|The specified name and phone number cannot be found.|
             * |China Unicom|Verifications can be carried out normally.|The specified name and phone number do not belong to the same user.|The specified name and phone number do not belong to the same user.|
             * |China Telecom|Verifications can be carried out normally.|The specified name and phone number cannot be found.|The specified name and phone number cannot be found.|
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
