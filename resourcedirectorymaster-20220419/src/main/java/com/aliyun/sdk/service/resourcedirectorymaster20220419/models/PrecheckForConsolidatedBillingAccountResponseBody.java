// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link PrecheckForConsolidatedBillingAccountResponseBody} extends {@link TeaModel}
 *
 * <p>PrecheckForConsolidatedBillingAccountResponseBody</p>
 */
public class PrecheckForConsolidatedBillingAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Reasons")
    private java.util.List<Reasons> reasons;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private PrecheckForConsolidatedBillingAccountResponseBody(Builder builder) {
        this.reasons = builder.reasons;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrecheckForConsolidatedBillingAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return reasons
     */
    public java.util.List<Reasons> getReasons() {
        return this.reasons;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private java.util.List<Reasons> reasons; 
        private String requestId; 
        private Boolean result; 

        /**
         * <p>The cause of the check failure.</p>
         */
        public Builder reasons(java.util.List<Reasons> reasons) {
            this.reasons = reasons;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E6B6CA8-9E7A-521F-A743-AA582714727E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the check was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public PrecheckForConsolidatedBillingAccountResponseBody build() {
            return new PrecheckForConsolidatedBillingAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PrecheckForConsolidatedBillingAccountResponseBody} extends {@link TeaModel}
     *
     * <p>PrecheckForConsolidatedBillingAccountResponseBody</p>
     */
    public static class Reasons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Reasons(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reasons create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>PaymentAccountEnterpriseInvoiceError</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>No enterprise invoice header information is set for the payment account.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Reasons build() {
                return new Reasons(this);
            } 

        } 

    }
}
