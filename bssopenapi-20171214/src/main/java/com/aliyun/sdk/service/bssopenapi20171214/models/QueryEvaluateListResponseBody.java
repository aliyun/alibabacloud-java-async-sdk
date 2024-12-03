// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D35FF10E-1B2E-4ABA-8401-0AE17725F50B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEvaluateListResponseBody build() {
            return new QueryEvaluateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEvaluateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEvaluateListResponseBody</p>
     */
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
             * <p>The billing cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>202002</p>
             */
            public Builder billCycle(String billCycle) {
                this.billCycle = billCycle;
                return this;
            }

            /**
             * <p>The ID of the bill.</p>
             * 
             * <strong>example:</strong>
             * <p>234543254325</p>
             */
            public Builder billId(Long billId) {
                this.billId = billId;
                return this;
            }

            /**
             * <p>The time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-10 18:05:44</p>
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * <p>The market type in the invoice. Valid values:</p>
             * <ul>
             * <li>ALIYUN: Alibaba Cloud</li>
             * <li>MARKETPLACE: Alibaba Cloud Marketplace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The invoiceable amount.</p>
             * 
             * <strong>example:</strong>
             * <p>123213</p>
             */
            public Builder canInvoiceAmount(Long canInvoiceAmount) {
                this.canInvoiceAmount = canInvoiceAmount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-10 18:05:44</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-10 18:05:44</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the invoice.</p>
             * 
             * <strong>example:</strong>
             * <p>1325321532</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The invoiced amount.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder invoicedAmount(Long invoicedAmount) {
                this.invoicedAmount = invoicedAmount;
                return this;
            }

            /**
             * <p>The ID of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>23453245</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The name of the object to be invoiced.</p>
             * 
             * <strong>example:</strong>
             * <p>Refund of a voucher with denomination marked</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>If a refund is issued due to an order such as an unsubscription order or a configuration downgrade order, the refund amount is used to offset the amount of the invoice. The value is consistent with the value of the <strong>OffsetCostAmount</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder offsetAcceptAmount(Long offsetAcceptAmount) {
                this.offsetAcceptAmount = offsetAcceptAmount;
                return this;
            }

            /**
             * <p>The refund amount used to offset the amount of the invoice. If a refund is issued due to an order such as an unsubscription order or a configuration downgrade order, the refund amount is used to offset the amount of the invoice. The value is consistent with the value of the <strong>OffsetAcceptAmount</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder offsetCostAmount(Long offsetCostAmount) {
                this.offsetCostAmount = offsetCostAmount;
                return this;
            }

            /**
             * <p>The ID of the external object.</p>
             * 
             * <strong>example:</strong>
             * <p>12341</p>
             */
            public Builder opId(String opId) {
                this.opId = opId;
                return this;
            }

            /**
             * <p>The original amount.</p>
             * 
             * <strong>example:</strong>
             * <p>-10000</p>
             */
            public Builder originalAmount(Long originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * <p>The ID of the external order.</p>
             * 
             * <strong>example:</strong>
             * <p>124324213421</p>
             */
            public Builder outBizId(String outBizId) {
                this.outBizId = outBizId;
                return this;
            }

            /**
             * <p>The balance.</p>
             * 
             * <strong>example:</strong>
             * <p>-10000</p>
             */
            public Builder presentAmount(Long presentAmount) {
                this.presentAmount = presentAmount;
                return this;
            }

            /**
             * <p>The status of the invoiceable amount.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of orders that are queried. Valid values:</p>
             * <ul>
             * <li>1: the orders in which the invoiceable amount is negative.</li>
             * <li>2: the orders in which the invoiceable amount is positive.</li>
             * <li>3: the orders in which the invoiceable amount is not 0.</li>
             * <li>4: the orders in which the amount that has been invoiced is greater than 0.</li>
             * </ul>
             * <blockquote>
             * <p> By default, this parameter is left empty. If this parameter is left empty, all orders are queried.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>2738543</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link QueryEvaluateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEvaluateListResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryEvaluateListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEvaluateListResponseBody</p>
     */
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
             * <p>The data returned.</p>
             */
            public Builder evaluateList(EvaluateList evaluateList) {
                this.evaluateList = evaluateList;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The number of the page returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The invoiced amount that meets the query conditions. Unit: Cent.</p>
             * 
             * <strong>example:</strong>
             * <p>12344</p>
             */
            public Builder totalInvoiceAmount(Long totalInvoiceAmount) {
                this.totalInvoiceAmount = totalInvoiceAmount;
                return this;
            }

            /**
             * <p>The invoiceable amount that meets the query conditions. Unit: Cent.</p>
             * 
             * <strong>example:</strong>
             * <p>12344</p>
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
