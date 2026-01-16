// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link QueryInvalidAddressResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInvalidAddressResponseBody</p>
 */
public class QueryInvalidAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextStart")
    private String nextStart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private QueryInvalidAddressResponseBody(Builder builder) {
        this.nextStart = builder.nextStart;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInvalidAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextStart
     */
    public String getNextStart() {
        return this.nextStart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String nextStart; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        private Builder() {
        } 

        private Builder(QueryInvalidAddressResponseBody model) {
            this.nextStart = model.nextStart;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.data = model.data;
        } 

        /**
         * <p>Next request starting position.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nextStart(String nextStart) {
            this.nextStart = nextStart;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95A7D497-F8DD-4834-B81E-C1783236E55F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Records.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryInvalidAddressResponseBody build() {
            return new QueryInvalidAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInvalidAddressResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInvalidAddressResponseBody</p>
     */
    public static class MailDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private String lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("ToAddress")
        private String toAddress;

        @com.aliyun.core.annotation.NameInMap("UtcLastUpdateTime")
        private Long utcLastUpdateTime;

        private MailDetail(Builder builder) {
            this.lastUpdateTime = builder.lastUpdateTime;
            this.toAddress = builder.toAddress;
            this.utcLastUpdateTime = builder.utcLastUpdateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MailDetail create() {
            return builder().build();
        }

        /**
         * @return lastUpdateTime
         */
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return toAddress
         */
        public String getToAddress() {
            return this.toAddress;
        }

        /**
         * @return utcLastUpdateTime
         */
        public Long getUtcLastUpdateTime() {
            return this.utcLastUpdateTime;
        }

        public static final class Builder {
            private String lastUpdateTime; 
            private String toAddress; 
            private Long utcLastUpdateTime; 

            private Builder() {
            } 

            private Builder(MailDetail model) {
                this.lastUpdateTime = model.lastUpdateTime;
                this.toAddress = model.toAddress;
                this.utcLastUpdateTime = model.utcLastUpdateTime;
            } 

            /**
             * <p>Update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-28T17:11Z</p>
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * <p>Recipient address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:toaddress@example.com">toaddress@example.com</a></p>
             */
            public Builder toAddress(String toAddress) {
                this.toAddress = toAddress;
                return this;
            }

            /**
             * <p>Update time (in timestamp format).</p>
             * 
             * <strong>example:</strong>
             * <p>1619601108</p>
             */
            public Builder utcLastUpdateTime(Long utcLastUpdateTime) {
                this.utcLastUpdateTime = utcLastUpdateTime;
                return this;
            }

            public MailDetail build() {
                return new MailDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInvalidAddressResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInvalidAddressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mailDetail")
        private java.util.List<MailDetail> mailDetail;

        private Data(Builder builder) {
            this.mailDetail = builder.mailDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return mailDetail
         */
        public java.util.List<MailDetail> getMailDetail() {
            return this.mailDetail;
        }

        public static final class Builder {
            private java.util.List<MailDetail> mailDetail; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.mailDetail = model.mailDetail;
            } 

            /**
             * mailDetail.
             */
            public Builder mailDetail(java.util.List<MailDetail> mailDetail) {
                this.mailDetail = mailDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
