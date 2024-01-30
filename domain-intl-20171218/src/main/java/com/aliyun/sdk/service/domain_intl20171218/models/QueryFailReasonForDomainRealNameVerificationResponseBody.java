// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFailReasonForDomainRealNameVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFailReasonForDomainRealNameVerificationResponseBody</p>
 */
public class QueryFailReasonForDomainRealNameVerificationResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryFailReasonForDomainRealNameVerificationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailReasonForDomainRealNameVerificationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFailReasonForDomainRealNameVerificationResponseBody build() {
            return new QueryFailReasonForDomainRealNameVerificationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("FailReason")
        private String failReason;

        private Data(Builder builder) {
            this.date = builder.date;
            this.failReason = builder.failReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        public static final class Builder {
            private String date; 
            private String failReason; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
