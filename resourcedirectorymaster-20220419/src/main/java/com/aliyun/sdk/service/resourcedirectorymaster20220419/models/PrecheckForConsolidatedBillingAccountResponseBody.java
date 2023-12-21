// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrecheckForConsolidatedBillingAccountResponseBody} extends {@link TeaModel}
 *
 * <p>PrecheckForConsolidatedBillingAccountResponseBody</p>
 */
public class PrecheckForConsolidatedBillingAccountResponseBody extends TeaModel {
    @NameInMap("Reasons")
    private java.util.List < Reasons> reasons;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
    public java.util.List < Reasons> getReasons() {
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
        private java.util.List < Reasons> reasons; 
        private String requestId; 
        private Boolean result; 

        /**
         * The cause of the check failure.
         */
        public Builder reasons(java.util.List < Reasons> reasons) {
            this.reasons = reasons;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the check was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public PrecheckForConsolidatedBillingAccountResponseBody build() {
            return new PrecheckForConsolidatedBillingAccountResponseBody(this);
        } 

    } 

    public static class Reasons extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
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
             * The error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error message.
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
