// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryFailReasonForDomainRealNameVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFailReasonForDomainRealNameVerificationResponseBody</p>
 */
public class QueryFailReasonForDomainRealNameVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryFailReasonForDomainRealNameVerificationResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of reasons for identity verification failure.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>1F1BA893-AD33-4248-8CB8-1657E3733052</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.domainNameVerificationStatus = model.domainNameVerificationStatus;
                this.failReason = model.failReason;
            } 

            /**
             * <p>Date.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-03-17 11:08:02</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Review Status. Valid values:  </p>
             * <ul>
             * <li><strong>NONAUDIT</strong>: Not authenticated.  </li>
             * <li><strong>SUCCEED</strong>: Succeeded.  </li>
             * <li><strong>FAILED</strong>: Review failed.  </li>
             * <li><strong>AUDITING</strong>: Under review.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder domainNameVerificationStatus(String domainNameVerificationStatus) {
                this.domainNameVerificationStatus = domainNameVerificationStatus;
                return this;
            }

            /**
             * <p>Reason for real-name verification failure.</p>
             * 
             * <strong>example:</strong>
             * <p>审核失败，所有者（中文）字段必须包含中文字符。</p>
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
