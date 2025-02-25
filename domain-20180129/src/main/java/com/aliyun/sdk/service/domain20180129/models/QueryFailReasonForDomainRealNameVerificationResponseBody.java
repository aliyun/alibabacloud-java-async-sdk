// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryFailReasonForDomainRealNameVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFailReasonForDomainRealNameVerificationResponseBody</p>
 */
public class QueryFailReasonForDomainRealNameVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    /**
     * 
     * {@link QueryFailReasonForDomainRealNameVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFailReasonForDomainRealNameVerificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DomainNameVerificationStatus")
        private String domainNameVerificationStatus;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        private Data(Builder builder) {
            this.date = builder.date;
            this.domainNameVerificationStatus = builder.domainNameVerificationStatus;
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
         * @return domainNameVerificationStatus
         */
        public String getDomainNameVerificationStatus() {
            return this.domainNameVerificationStatus;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        public static final class Builder {
            private String date; 
            private String domainNameVerificationStatus; 
            private String failReason; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * DomainNameVerificationStatus.
             */
            public Builder domainNameVerificationStatus(String domainNameVerificationStatus) {
                this.domainNameVerificationStatus = domainNameVerificationStatus;
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
