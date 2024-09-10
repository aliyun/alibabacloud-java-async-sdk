// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScreenScoreThreadResponseBody build() {
            return new DescribeScreenScoreThreadResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SocreThread")
        private java.util.List < String > socreThread;

        @com.aliyun.core.annotation.NameInMap("SocreThreadDate")
        private java.util.List < String > socreThreadDate;

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
        public java.util.List < String > getSocreThread() {
            return this.socreThread;
        }

        /**
         * @return socreThreadDate
         */
        public java.util.List < String > getSocreThreadDate() {
            return this.socreThreadDate;
        }

        public static final class Builder {
            private java.util.List < String > socreThread; 
            private java.util.List < String > socreThreadDate; 

            /**
             * The trends of the scores on the security dashboard.
             */
            public Builder socreThread(java.util.List < String > socreThread) {
                this.socreThread = socreThread;
                return this;
            }

            /**
             * The dates of the scores on the security dashboard.
             */
            public Builder socreThreadDate(java.util.List < String > socreThreadDate) {
                this.socreThreadDate = socreThreadDate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
