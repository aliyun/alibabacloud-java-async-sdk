// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link QueryFailReasonListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFailReasonListResponseBody</p>
 */
public class QueryFailReasonListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryFailReasonListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFailReasonListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryFailReasonListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public QueryFailReasonListResponseBody build() {
            return new QueryFailReasonListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFailReasonListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFailReasonListResponseBody</p>
     */
    public static class FailRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        private FailRecord(Builder builder) {
            this.date = builder.date;
            this.failReason = builder.failReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailRecord create() {
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

            private Builder(FailRecord model) {
                this.date = model.date;
                this.failReason = model.failReason;
            } 

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

            public FailRecord build() {
                return new FailRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryFailReasonListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFailReasonListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailRecord")
        private java.util.List<FailRecord> failRecord;

        private Data(Builder builder) {
            this.failRecord = builder.failRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failRecord
         */
        public java.util.List<FailRecord> getFailRecord() {
            return this.failRecord;
        }

        public static final class Builder {
            private java.util.List<FailRecord> failRecord; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failRecord = model.failRecord;
            } 

            /**
             * FailRecord.
             */
            public Builder failRecord(java.util.List<FailRecord> failRecord) {
                this.failRecord = failRecord;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
