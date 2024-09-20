// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccountFlowListResponseBody} extends {@link TeaModel}
 *
 * <p>AccountFlowListResponseBody</p>
 */
public class AccountFlowListResponseBody extends TeaModel {
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

    private AccountFlowListResponseBody(Builder builder) {
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

    public static AccountFlowListResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AccountFlowListResponseBody build() {
            return new AccountFlowListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("after_available_amount")
        private Double afterAvailableAmount;

        @com.aliyun.core.annotation.NameInMap("before_available_amount")
        private Double beforeAvailableAmount;

        @com.aliyun.core.annotation.NameInMap("change_order_num")
        private Long changeOrderNum;

        @com.aliyun.core.annotation.NameInMap("flow_id")
        private Long flowId;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("op_amount")
        private Double opAmount;

        @com.aliyun.core.annotation.NameInMap("op_type")
        private Integer opType;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("order_type")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("out_order_num")
        private String outOrderNum;

        @com.aliyun.core.annotation.NameInMap("refund_order_num")
        private Long refundOrderNum;

        private List(Builder builder) {
            this.afterAvailableAmount = builder.afterAvailableAmount;
            this.beforeAvailableAmount = builder.beforeAvailableAmount;
            this.changeOrderNum = builder.changeOrderNum;
            this.flowId = builder.flowId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.opAmount = builder.opAmount;
            this.opType = builder.opType;
            this.orderNum = builder.orderNum;
            this.orderType = builder.orderType;
            this.outOrderNum = builder.outOrderNum;
            this.refundOrderNum = builder.refundOrderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return afterAvailableAmount
         */
        public Double getAfterAvailableAmount() {
            return this.afterAvailableAmount;
        }

        /**
         * @return beforeAvailableAmount
         */
        public Double getBeforeAvailableAmount() {
            return this.beforeAvailableAmount;
        }

        /**
         * @return changeOrderNum
         */
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        /**
         * @return flowId
         */
        public Long getFlowId() {
            return this.flowId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return opAmount
         */
        public Double getOpAmount() {
            return this.opAmount;
        }

        /**
         * @return opType
         */
        public Integer getOpType() {
            return this.opType;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return outOrderNum
         */
        public String getOutOrderNum() {
            return this.outOrderNum;
        }

        /**
         * @return refundOrderNum
         */
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        public static final class Builder {
            private Double afterAvailableAmount; 
            private Double beforeAvailableAmount; 
            private Long changeOrderNum; 
            private Long flowId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Double opAmount; 
            private Integer opType; 
            private Long orderNum; 
            private Integer orderType; 
            private String outOrderNum; 
            private Long refundOrderNum; 

            /**
             * after_available_amount.
             */
            public Builder afterAvailableAmount(Double afterAvailableAmount) {
                this.afterAvailableAmount = afterAvailableAmount;
                return this;
            }

            /**
             * before_available_amount.
             */
            public Builder beforeAvailableAmount(Double beforeAvailableAmount) {
                this.beforeAvailableAmount = beforeAvailableAmount;
                return this;
            }

            /**
             * change_order_num.
             */
            public Builder changeOrderNum(Long changeOrderNum) {
                this.changeOrderNum = changeOrderNum;
                return this;
            }

            /**
             * flow_id.
             */
            public Builder flowId(Long flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * op_amount.
             */
            public Builder opAmount(Double opAmount) {
                this.opAmount = opAmount;
                return this;
            }

            /**
             * op_type.
             */
            public Builder opType(Integer opType) {
                this.opType = opType;
                return this;
            }

            /**
             * order_num.
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * order_type.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * out_order_num.
             */
            public Builder outOrderNum(String outOrderNum) {
                this.outOrderNum = outOrderNum;
                return this;
            }

            /**
             * refund_order_num.
             */
            public Builder refundOrderNum(Long refundOrderNum) {
                this.refundOrderNum = refundOrderNum;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
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
             * current_page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_count.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * total_page.
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
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pagination.
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
