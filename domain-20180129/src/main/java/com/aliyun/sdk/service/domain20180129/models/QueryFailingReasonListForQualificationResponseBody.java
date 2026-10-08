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
 * {@link QueryFailingReasonListForQualificationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFailingReasonListForQualificationResponseBody</p>
 */
public class QueryFailingReasonListForQualificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFailingReasonListForQualificationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailingReasonListForQualificationResponseBody create() {
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

        private Builder(QueryFailingReasonListForQualificationResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of domain name qualification verification failures.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryFailingReasonListForQualificationResponseBody build() {
            return new QueryFailingReasonListForQualificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFailingReasonListForQualificationResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFailingReasonListForQualificationResponseBody</p>
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
             * <p>Review date.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-03-17 11:08:02</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Reason for domain name qualification verification failure.</p>
             * 
             * <strong>example:</strong>
             * <p>证件审核不通过</p>
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
