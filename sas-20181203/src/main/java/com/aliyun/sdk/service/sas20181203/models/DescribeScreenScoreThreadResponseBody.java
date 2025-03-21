// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeScreenScoreThreadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenScoreThreadResponseBody</p>
 */
public class DescribeScreenScoreThreadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScreenScoreThreadResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenScoreThreadResponseBody create() {
        return builder().build();
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

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScreenScoreThreadResponseBody build() {
            return new DescribeScreenScoreThreadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScreenScoreThreadResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenScoreThreadResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SocreThread")
        private java.util.List<String> socreThread;

        @com.aliyun.core.annotation.NameInMap("SocreThreadDate")
        private java.util.List<String> socreThreadDate;

        private Data(Builder builder) {
            this.socreThread = builder.socreThread;
            this.socreThreadDate = builder.socreThreadDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return socreThread
         */
        public java.util.List<String> getSocreThread() {
            return this.socreThread;
        }

        /**
         * @return socreThreadDate
         */
        public java.util.List<String> getSocreThreadDate() {
            return this.socreThreadDate;
        }

        public static final class Builder {
            private java.util.List<String> socreThread; 
            private java.util.List<String> socreThreadDate; 

            /**
             * <p>The trends of the scores on the security dashboard.</p>
             */
            public Builder socreThread(java.util.List<String> socreThread) {
                this.socreThread = socreThread;
                return this;
            }

            /**
             * <p>The dates of the scores on the security dashboard.</p>
             */
            public Builder socreThreadDate(java.util.List<String> socreThreadDate) {
                this.socreThreadDate = socreThreadDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
