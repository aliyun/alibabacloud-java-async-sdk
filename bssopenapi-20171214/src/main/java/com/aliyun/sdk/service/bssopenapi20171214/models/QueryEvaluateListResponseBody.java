// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEvaluateListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEvaluateListResponseBody</p>
 */
public class QueryEvaluateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEvaluateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEvaluateListResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEvaluateListResponseBody build() {
            return new QueryEvaluateListResponseBody(this);
        } 

    } 

    public static class Evaluate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillCycle")
        private String billCycle;

        @com.aliyun.core.annotation.NameInMap("BillId")
        private Long billId;

        @com.aliyun.core.annotation.NameInMap("BizTime")
        private String bizTime;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CanInvoiceAmount")
        private Long canInvoiceAmount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InvoicedAmount")
        private Long invoicedAmount;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OffsetAcceptAmount")
        private Long offsetAcceptAmount;

        @com.aliyun.core.annotation.NameInMap("OffsetCostAmount")
        private Long offsetCostAmount;

        @com.aliyun.core.annotation.NameInMap("OpId")
        private String opId;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Long originalAmount;

        @com.aliyun.core.annotation.NameInMap("OutBizId")
        private String outBizId;

        @com.aliyun.core.annotation.NameInMap("PresentAmount")
        private Long presentAmount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
        private String userNick;

        private Evaluate(Builder builder) {
            this.billCycle = builder.billCycle;
            this.billId = builder.billId;
            this.bizTime = builder.bizTime;
            this.bizType = builder.bizType;
            this.canInvoiceAmount = builder.canInvoiceAmount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.invoicedAmount = builder.invoicedAmount;
            this.itemId = builder.itemId;
            this.name = builder.name;
            this.offsetAcceptAmount = builder.offsetAcceptAmount;
            this.offsetCostAmount = builder.offsetCostAmount;
            this.opId = builder.opId;
            this.originalAmount = builder.originalAmount;
            this.outBizId = builder.outBizId;
            this.presentAmount = builder.presentAmount;
            this.status = builder.status;
            this.type = builder.type;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Evaluate create() {
            return builder().build();
        }

        /**
         * @return billCycle
         */
        public String getBillCycle() {
            return this.billCycle;
        }

        /**
         * @return billId
         */
        public Long getBillId() {
            return this.billId;
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return canInvoiceAmount
         */
        public Long getCanInvoiceAmount() {
            return this.canInvoiceAmount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invoicedAmount
         */
        public Long getInvoicedAmount() {
            return this.invoicedAmount;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return offsetAcceptAmount
         */
        public Long getOffsetAcceptAmount() {
            return this.offsetAcceptAmount;
        }

        /**
         * @return offsetCostAmount
         */
        public Long getOffsetCostAmount() {
            return this.offsetCostAmount;
        }

        /**
         * @return opId
         */
        public String getOpId() {
            return this.opId;
        }

        /**
         * @return originalAmount
         */
        public Long getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return outBizId
         */
        public String getOutBizId() {
            return this.outBizId;
        }

        /**
         * @return presentAmount
         */
        public Long getPresentAmount() {
            return this.presentAmount;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String billCycle; 
            private Long billId; 
            private String bizTime; 
            private String bizType; 
            private Long canInvoiceAmount; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long invoicedAmount; 
            private Long itemId; 
            private String name; 
            private Long offsetAcceptAmount; 
            private Long offsetCostAmount; 
            private String opId; 
            private Long originalAmount; 
            private String outBizId; 
            private Long presentAmount; 
            private Integer status; 
            private Integer type; 
            private Long userId; 
            private String userNick; 

            /**
             * The billing cycle.
             */
            public Builder billCycle(String billCycle) {
                this.billCycle = billCycle;
                return this;
            }

            /**
             * The ID of the bill.
             */
            public Builder billId(Long billId) {
                this.billId = billId;
                return this;
            }

            /**
             * The time.
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * The market type in the invoice. Valid values:
             * <p>
             * 
             * *   ALIYUN: Alibaba Cloud
             * *   MARKETPLACE: Alibaba Cloud Marketplace
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The invoiceable amount.
             */
            public Builder canInvoiceAmount(Long canInvoiceAmount) {
                this.canInvoiceAmount = canInvoiceAmount;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the invoice.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The invoiced amount.
             */
            public Builder invoicedAmount(Long invoicedAmount) {
                this.invoicedAmount = invoicedAmount;
                return this;
            }

            /**
             * The ID of the item.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * The name of the object to be invoiced.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * If a refund is issued due to an order such as an unsubscription order or a configuration downgrade order, the refund amount is used to offset the amount of the invoice. The value is consistent with the value of the **OffsetCostAmount** parameter.
             */
            public Builder offsetAcceptAmount(Long offsetAcceptAmount) {
                this.offsetAcceptAmount = offsetAcceptAmount;
                return this;
            }

            /**
             * The refund amount used to offset the amount of the invoice. If a refund is issued due to an order such as an unsubscription order or a configuration downgrade order, the refund amount is used to offset the amount of the invoice. The value is consistent with the value of the **OffsetAcceptAmount** parameter.
             */
            public Builder offsetCostAmount(Long offsetCostAmount) {
                this.offsetCostAmount = offsetCostAmount;
                return this;
            }

            /**
             * The ID of the external object.
             */
            public Builder opId(String opId) {
                this.opId = opId;
                return this;
            }

            /**
             * The original amount.
             */
            public Builder originalAmount(Long originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * The ID of the external order.
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * The balance.
             */
            public Builder presentAmount(Long presentAmount) {
                this.presentAmount = presentAmount;
                return this;
            }

            /**
             * The status of the invoiceable amount.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of orders that are queried. Valid values:
             * <p>
             * 
             * *   1: the orders in which the invoiceable amount is negative.
             * *   2: the orders in which the invoiceable amount is positive.
             * *   3: the orders in which the invoiceable amount is not 0.
             * *   4: the orders in which the amount that has been invoiced is greater than 0.
             * 
             * >  By default, this parameter is left empty. If this parameter is left empty, all orders are queried.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public Evaluate build() {
                return new Evaluate(this);
            } 

        } 

    }
    public static class EvaluateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Evaluate")
        private java.util.List < Evaluate> evaluate;

        private EvaluateList(Builder builder) {
            this.evaluate = builder.evaluate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluateList create() {
            return builder().build();
        }

        /**
         * @return evaluate
         */
        public java.util.List < Evaluate> getEvaluate() {
            return this.evaluate;
        }

        public static final class Builder {
            private java.util.List < Evaluate> evaluate; 

            /**
             * Evaluate.
             */
            public Builder evaluate(java.util.List < Evaluate> evaluate) {
                this.evaluate = evaluate;
                return this;
            }

            public EvaluateList build() {
                return new EvaluateList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EvaluateList")
        private EvaluateList evaluateList;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalInvoiceAmount")
        private Long totalInvoiceAmount;

        @com.aliyun.core.annotation.NameInMap("TotalUnAppliedInvoiceAmount")
        private Long totalUnAppliedInvoiceAmount;

        private Data(Builder builder) {
            this.evaluateList = builder.evaluateList;
            this.hostId = builder.hostId;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalInvoiceAmount = builder.totalInvoiceAmount;
            this.totalUnAppliedInvoiceAmount = builder.totalUnAppliedInvoiceAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return evaluateList
         */
        public EvaluateList getEvaluateList() {
            return this.evaluateList;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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
         * @return totalInvoiceAmount
         */
        public Long getTotalInvoiceAmount() {
            return this.totalInvoiceAmount;
        }

        /**
         * @return totalUnAppliedInvoiceAmount
         */
        public Long getTotalUnAppliedInvoiceAmount() {
            return this.totalUnAppliedInvoiceAmount;
        }

        public static final class Builder {
            private EvaluateList evaluateList; 
            private String hostId; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Long totalInvoiceAmount; 
            private Long totalUnAppliedInvoiceAmount; 

            /**
             * The data returned.
             */
            public Builder evaluateList(EvaluateList evaluateList) {
                this.evaluateList = evaluateList;
                return this;
            }

            /**
             * The ID of the host.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * The number of the page returned.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The invoiced amount that meets the query conditions. Unit: Cent.
             */
            public Builder totalInvoiceAmount(Long totalInvoiceAmount) {
                this.totalInvoiceAmount = totalInvoiceAmount;
                return this;
            }

            /**
             * The invoiceable amount that meets the query conditions. Unit: Cent.
             */
            public Builder totalUnAppliedInvoiceAmount(Long totalUnAppliedInvoiceAmount) {
                this.totalUnAppliedInvoiceAmount = totalUnAppliedInvoiceAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
