// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefundDetailListResponseBody} extends {@link TeaModel}
 *
 * <p>RefundDetailListResponseBody</p>
 */
public class RefundDetailListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private Object errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RefundDetailListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundDetailListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public Object getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 
        private String errorCode; 
        private Object errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        /**
         * <p>request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>error data</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>http reqeust has been processed successfully，status code is 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>true represents success, false represents failure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RefundDetailListResponseBody build() {
            return new RefundDetailListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefundDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("is_multi_refund")
        private Boolean isMultiRefund;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("refund_order_num")
        private Long refundOrderNum;

        @com.aliyun.core.annotation.NameInMap("refund_order_status")
        private Integer refundOrderStatus;

        @com.aliyun.core.annotation.NameInMap("related_refund_order_num")
        private String relatedRefundOrderNum;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
        private String transactionNo;

        @com.aliyun.core.annotation.NameInMap("utc_create_time")
        private Long utcCreateTime;

        private List(Builder builder) {
            this.isMultiRefund = builder.isMultiRefund;
            this.orderNum = builder.orderNum;
            this.refundOrderNum = builder.refundOrderNum;
            this.refundOrderStatus = builder.refundOrderStatus;
            this.relatedRefundOrderNum = builder.relatedRefundOrderNum;
            this.transactionNo = builder.transactionNo;
            this.utcCreateTime = builder.utcCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return isMultiRefund
         */
        public Boolean getIsMultiRefund() {
            return this.isMultiRefund;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return refundOrderNum
         */
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        /**
         * @return refundOrderStatus
         */
        public Integer getRefundOrderStatus() {
            return this.refundOrderStatus;
        }

        /**
         * @return relatedRefundOrderNum
         */
        public String getRelatedRefundOrderNum() {
            return this.relatedRefundOrderNum;
        }

        /**
         * @return transactionNo
         */
        public String getTransactionNo() {
            return this.transactionNo;
        }

        /**
         * @return utcCreateTime
         */
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public static final class Builder {
            private Boolean isMultiRefund; 
            private Long orderNum; 
            private Long refundOrderNum; 
            private Integer refundOrderStatus; 
            private String relatedRefundOrderNum; 
            private String transactionNo; 
            private Long utcCreateTime; 

            /**
             * <p>whether it is a supplementary refund order (if the refund amount is not enough, you can use RefundApply to create a supplementary refund order)</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMultiRefund(Boolean isMultiRefund) {
                this.isMultiRefund = isMultiRefund;
                return this;
            }

            /**
             * <p>order number that returned by Book</p>
             * 
             * <strong>example:</strong>
             * <p>49884*****2345</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>refund order number that returned by RefundApply</p>
             * 
             * <strong>example:</strong>
             * <p>49884*****950</p>
             */
            public Builder refundOrderNum(Long refundOrderNum) {
                this.refundOrderNum = refundOrderNum;
                return this;
            }

            /**
             * <p>refund order status </p>
             * <p>0: refund application</p>
             * <p>1: refund in progress</p>
             * <p>2: refund failed</p>
             * <p>3: refund succeeded</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder refundOrderStatus(Integer refundOrderStatus) {
                this.refundOrderStatus = refundOrderStatus;
                return this;
            }

            /**
             * <p>the original refund order number associated with this supplementary refund order, only avaliable when is_multi_refund=true</p>
             * 
             * <strong>example:</strong>
             * <p>49884*****2387</p>
             */
            public Builder relatedRefundOrderNum(String relatedRefundOrderNum) {
                this.relatedRefundOrderNum = relatedRefundOrderNum;
                return this;
            }

            /**
             * <p>transaction number</p>
             * 
             * <strong>example:</strong>
             * <p>49884**tde-95za</p>
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            /**
             * <p>refund time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677229002000</p>
             */
            public Builder utcCreateTime(Long utcCreateTime) {
                this.utcCreateTime = utcCreateTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailListResponseBody</p>
     */
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("current_page")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("total_page")
        private Integer totalPage;

        private Pagination(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * <p>current page index</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>the number of total refund orders</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>the number of total pages</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundDetailListResponseBody} extends {@link TeaModel}
     *
     * <p>RefundDetailListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("pagination")
        private Pagination pagination;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * <p>refund order list</p>
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>information of pagination</p>
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
