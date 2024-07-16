// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvalidAddressResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInvalidAddressResponseBody</p>
 */
public class QueryInvalidAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextStart")
    private Integer nextStart;

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

    /**
     * @return nextStart
     */
    public Integer getNextStart() {
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
        private Integer nextStart; 
        private String requestId; 
        private Integer totalCount; 
        private Data data; 

        /**
         * NextStart.
         */
        public Builder nextStart(Integer nextStart) {
            this.nextStart = nextStart;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public QueryInvalidAddressResponseBody build() {
            return new QueryInvalidAddressResponseBody(this);
        } 

    } 

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

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * ToAddress.
             */
            public Builder toAddress(String toAddress) {
                this.toAddress = toAddress;
                return this;
            }

            /**
             * UtcLastUpdateTime.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mailDetail")
        private java.util.List < MailDetail> mailDetail;

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
        public java.util.List < MailDetail> getMailDetail() {
            return this.mailDetail;
        }

        public static final class Builder {
            private java.util.List < MailDetail> mailDetail; 

            /**
             * mailDetail.
             */
            public Builder mailDetail(java.util.List < MailDetail> mailDetail) {
                this.mailDetail = mailDetail;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
