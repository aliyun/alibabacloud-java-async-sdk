// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AccountFlowListResponseBody model) {
            this.requestId = model.requestId;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorData = model.errorData;
            this.errorMsg = model.errorMsg;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The data returned for a successful request.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The business error code.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The data returned with the error.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code. The value is always 200 for successful HTTP requests.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AccountFlowListResponseBody build() {
            return new AccountFlowListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AccountFlowListResponseBody} extends {@link TeaModel}
     *
     * <p>AccountFlowListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(List model) {
                this.afterAvailableAmount = model.afterAvailableAmount;
                this.beforeAvailableAmount = model.beforeAvailableAmount;
                this.changeOrderNum = model.changeOrderNum;
                this.flowId = model.flowId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.opAmount = model.opAmount;
                this.opType = model.opType;
                this.orderNum = model.orderNum;
                this.orderType = model.orderType;
                this.outOrderNum = model.outOrderNum;
                this.refundOrderNum = model.refundOrderNum;
            } 

            /**
             * <p>The available balance after the operation, in CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder afterAvailableAmount(Double afterAvailableAmount) {
                this.afterAvailableAmount = afterAvailableAmount;
                return this;
            }

            /**
             * <p>The available balance before the operation, in CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1950.5</p>
             */
            public Builder beforeAvailableAmount(Double beforeAvailableAmount) {
                this.beforeAvailableAmount = beforeAvailableAmount;
                return this;
            }

            /**
             * <p>The change order number. This value is not empty if the flow is related to a ticket change.</p>
             * 
             * <strong>example:</strong>
             * <p>49880***971</p>
             */
            public Builder changeOrderNum(Long changeOrderNum) {
                this.changeOrderNum = changeOrderNum;
                return this;
            }

            /**
             * <p>The flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1627239841225842666</p>
             */
            public Builder flowId(Long flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1676799185000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1676966530000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The operation amount, in CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>950.5</p>
             */
            public Builder opAmount(Double opAmount) {
                this.opAmount = opAmount;
                return this;
            }

            /**
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li>1: payment</li>
             * <li>2: refund</li>
             * <li>3: top-up.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder opType(Integer opType) {
                this.opType = opType;
                return this;
            }

            /**
             * <p>The original order number.</p>
             * 
             * <strong>example:</strong>
             * <p>4988430***971</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>The order type. Valid values:</p>
             * <ul>
             * <li>0: original transaction</li>
             * <li>1: change order payment</li>
             * <li>2: refund.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The external order number of the original order.</p>
             * 
             * <strong>example:</strong>
             * <p>4988430***971</p>
             */
            public Builder outOrderNum(String outOrderNum) {
                this.outOrderNum = outOrderNum;
                return this;
            }

            /**
             * <p>The refund order number. This value is not empty if the flow is related to a refund.</p>
             * 
             * <strong>example:</strong>
             * <p>48430***971</p>
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
    /**
     * 
     * {@link AccountFlowListResponseBody} extends {@link TeaModel}
     *
     * <p>AccountFlowListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Pagination model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.totalPage = model.totalPage;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
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
     * {@link AccountFlowListResponseBody} extends {@link TeaModel}
     *
     * <p>AccountFlowListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Pagination pagination; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pagination = model.pagination;
            } 

            /**
             * <p>The data list.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The pagination information.</p>
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
