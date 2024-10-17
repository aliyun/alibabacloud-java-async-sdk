// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryBrokerDemandRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBrokerDemandRecordResponseBody</p>
 */
public class QueryBrokerDemandRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryBrokerDemandRecordResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBrokerDemandRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private Data data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryBrokerDemandRecordResponseBody build() {
            return new QueryBrokerDemandRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBrokerDemandRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBrokerDemandRecordResponseBody</p>
     */
    public static class BrokerDemandRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private BrokerDemandRecord(Builder builder) {
            this.bizId = builder.bizId;
            this.createTime = builder.createTime;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrokerDemandRecord create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String bizId; 
            private Long createTime; 
            private String description; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public BrokerDemandRecord build() {
                return new BrokerDemandRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryBrokerDemandRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBrokerDemandRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrokerDemandRecord")
        private java.util.List < BrokerDemandRecord> brokerDemandRecord;

        private Data(Builder builder) {
            this.brokerDemandRecord = builder.brokerDemandRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return brokerDemandRecord
         */
        public java.util.List < BrokerDemandRecord> getBrokerDemandRecord() {
            return this.brokerDemandRecord;
        }

        public static final class Builder {
            private java.util.List < BrokerDemandRecord> brokerDemandRecord; 

            /**
             * BrokerDemandRecord.
             */
            public Builder brokerDemandRecord(java.util.List < BrokerDemandRecord> brokerDemandRecord) {
                this.brokerDemandRecord = brokerDemandRecord;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
