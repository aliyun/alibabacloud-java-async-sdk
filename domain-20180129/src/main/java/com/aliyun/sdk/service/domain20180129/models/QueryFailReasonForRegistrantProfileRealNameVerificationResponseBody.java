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
 * {@link QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody</p>
 */
public class QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody create() {
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

        private Builder(QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The List of reasons why identity verification failed the Review.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>548C407F-AEA2-4B5D-90DF-EC11EBB1D76F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody build() {
            return new QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFailReasonForRegistrantProfileRealNameVerificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("FailReason")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.failReason = model.failReason;
            } 

            /**
             * <p>The Review Date.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-03-17 11:08:02</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The reason why identity verification failed the Review.</p>
             * <p>For Solutions after identity verification fails the Review, see <a href="https://help.aliyun.com/document_detail/35885.html">Reasons for identity verification failure and Solutions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>证件电子信息核验不合格</p>
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
