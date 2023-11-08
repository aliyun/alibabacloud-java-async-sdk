// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPartnerIntentionListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPartnerIntentionListResponseBody</p>
 */
public class QueryPartnerIntentionListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Long currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Long totalItemNum;

    @NameInMap("TotalPageNum")
    private Long totalPageNum;

    private QueryPartnerIntentionListResponseBody(Builder builder) {
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

    public static QueryPartnerIntentionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Long getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Long getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Long currentPageNum; 
        private java.util.List < Data> data; 
        private Long pageSize; 
        private String requestId; 
        private Long totalItemNum; 
        private Long totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Long currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalItemNum(Long totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Long totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryPartnerIntentionListResponseBody build() {
            return new QueryPartnerIntentionListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Mobile")
        private String mobile;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.mobile = builder.mobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        public static final class Builder {
            private String bizId; 
            private String bizType; 
            private String mobile; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
