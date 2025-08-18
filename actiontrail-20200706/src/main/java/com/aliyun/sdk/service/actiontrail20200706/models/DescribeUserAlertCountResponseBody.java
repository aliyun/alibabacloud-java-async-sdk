// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeUserAlertCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAlertCountResponseBody</p>
 */
public class DescribeUserAlertCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserAlertCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAlertCountResponseBody create() {
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

        private Builder(DescribeUserAlertCountResponseBody model) {
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

        public DescribeUserAlertCountResponseBody build() {
            return new DescribeUserAlertCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserAlertCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAlertCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Counts")
        private java.util.List<Long> counts;

        @com.aliyun.core.annotation.NameInMap("Dates")
        private java.util.List<String> dates;

        private Data(Builder builder) {
            this.counts = builder.counts;
            this.dates = builder.dates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return counts
         */
        public java.util.List<Long> getCounts() {
            return this.counts;
        }

        /**
         * @return dates
         */
        public java.util.List<String> getDates() {
            return this.dates;
        }

        public static final class Builder {
            private java.util.List<Long> counts; 
            private java.util.List<String> dates; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.counts = model.counts;
                this.dates = model.dates;
            } 

            /**
             * Counts.
             */
            public Builder counts(java.util.List<Long> counts) {
                this.counts = counts;
                return this;
            }

            /**
             * Dates.
             */
            public Builder dates(java.util.List<String> dates) {
                this.dates = dates;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
