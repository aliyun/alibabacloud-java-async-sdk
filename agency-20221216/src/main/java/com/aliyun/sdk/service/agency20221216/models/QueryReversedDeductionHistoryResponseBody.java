// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link QueryReversedDeductionHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryReversedDeductionHistoryResponseBody</p>
 */
public class QueryReversedDeductionHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private QueryReversedDeductionHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReversedDeductionHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(QueryReversedDeductionHistoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public QueryReversedDeductionHistoryResponseBody build() {
            return new QueryReversedDeductionHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryReversedDeductionHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryReversedDeductionHistoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OffsetAmount")
        private String offsetAmount;

        @com.aliyun.core.annotation.NameInMap("OperationSubmitType")
        private String operationSubmitType;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("OperationUid")
        private String operationUid;

        private Data(Builder builder) {
            this.offsetAmount = builder.offsetAmount;
            this.operationSubmitType = builder.operationSubmitType;
            this.operationTime = builder.operationTime;
            this.operationUid = builder.operationUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return offsetAmount
         */
        public String getOffsetAmount() {
            return this.offsetAmount;
        }

        /**
         * @return operationSubmitType
         */
        public String getOperationSubmitType() {
            return this.operationSubmitType;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return operationUid
         */
        public String getOperationUid() {
            return this.operationUid;
        }

        public static final class Builder {
            private String offsetAmount; 
            private String operationSubmitType; 
            private String operationTime; 
            private String operationUid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.offsetAmount = model.offsetAmount;
                this.operationSubmitType = model.operationSubmitType;
                this.operationTime = model.operationTime;
                this.operationUid = model.operationUid;
            } 

            /**
             * OffsetAmount.
             */
            public Builder offsetAmount(String offsetAmount) {
                this.offsetAmount = offsetAmount;
                return this;
            }

            /**
             * OperationSubmitType.
             */
            public Builder operationSubmitType(String operationSubmitType) {
                this.operationSubmitType = operationSubmitType;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * OperationUid.
             */
            public Builder operationUid(String operationUid) {
                this.operationUid = operationUid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
