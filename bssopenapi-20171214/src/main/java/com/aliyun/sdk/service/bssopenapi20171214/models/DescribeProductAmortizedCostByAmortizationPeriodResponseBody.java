// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link DescribeProductAmortizedCostByAmortizationPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductAmortizedCostByAmortizationPeriodResponseBody</p>
 */
public class DescribeProductAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
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

    private DescribeProductAmortizedCostByAmortizationPeriodResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductAmortizedCostByAmortizationPeriodResponseBody create() {
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>The message returned.</p>
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
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeProductAmortizedCostByAmortizationPeriodResponseBody build() {
            return new DescribeProductAmortizedCostByAmortizationPeriodResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProductAmortizedCostByAmortizationPeriodResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductAmortizedCostByAmortizationPeriodResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AmortizationPeriod")
        private String amortizationPeriod;

        @com.aliyun.core.annotation.NameInMap("AmortizationStatus")
        private String amortizationStatus;

        @com.aliyun.core.annotation.NameInMap("BillAccountID")
        private Long billAccountID;

        @com.aliyun.core.annotation.NameInMap("BillAccountName")
        private String billAccountName;

        @com.aliyun.core.annotation.NameInMap("BillOwnerID")
        private Long billOwnerID;

        @com.aliyun.core.annotation.NameInMap("BillOwnerName")
        private String billOwnerName;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("ConsumePeriod")
        private String consumePeriod;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationDeductedByCashCoupons")
        private Double currentAmortizationDeductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationDeductedByCoupons")
        private Double currentAmortizationDeductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationDeductedByPrepaidCard")
        private Double currentAmortizationDeductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationExpenditureAmount")
        private Double currentAmortizationExpenditureAmount;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationInvoiceDiscount")
        private Double currentAmortizationInvoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationPretaxAmount")
        private Double currentAmortizationPretaxAmount;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationPretaxGrossAmount")
        private Double currentAmortizationPretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("CurrentAmortizationRoundDownDiscount")
        private Double currentAmortizationRoundDownDiscount;

        @com.aliyun.core.annotation.NameInMap("DeductedByCashCoupons")
        private Double deductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByCoupons")
        private Double deductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("DeductedByPrepaidCard")
        private Double deductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("ExpenditureAmount")
        private Double expenditureAmount;

        @com.aliyun.core.annotation.NameInMap("InvoiceDiscount")
        private Double invoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("PretaxAmount")
        private Double pretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PretaxGrossAmount")
        private Double pretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedDeductedByCashCoupons")
        private Double previouslyAmortizedDeductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedDeductedByCoupons")
        private Double previouslyAmortizedDeductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedDeductedByPrepaidCard")
        private Double previouslyAmortizedDeductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedExpenditureAmount")
        private Double previouslyAmortizedExpenditureAmount;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedInvoiceDiscount")
        private Double previouslyAmortizedInvoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedPretaxAmount")
        private Double previouslyAmortizedPretaxAmount;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedPretaxGrossAmount")
        private Double previouslyAmortizedPretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("PreviouslyAmortizedRoundDownDiscount")
        private Double previouslyAmortizedRoundDownDiscount;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductDetail")
        private String productDetail;

        @com.aliyun.core.annotation.NameInMap("ProductDetailCode")
        private String productDetailCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationDeductedByCashCoupons")
        private Double remainingAmortizationDeductedByCashCoupons;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationDeductedByCoupons")
        private Double remainingAmortizationDeductedByCoupons;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationDeductedByPrepaidCard")
        private Double remainingAmortizationDeductedByPrepaidCard;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationExpenditureAmount")
        private Double remainingAmortizationExpenditureAmount;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationInvoiceDiscount")
        private Double remainingAmortizationInvoiceDiscount;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationPretaxAmount")
        private Double remainingAmortizationPretaxAmount;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationPretaxGrossAmount")
        private Double remainingAmortizationPretaxGrossAmount;

        @com.aliyun.core.annotation.NameInMap("RemainingAmortizationRoundDownDiscount")
        private Double remainingAmortizationRoundDownDiscount;

        @com.aliyun.core.annotation.NameInMap("RoundDownDiscount")
        private Double roundDownDiscount;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        private Items(Builder builder) {
            this.amortizationPeriod = builder.amortizationPeriod;
            this.amortizationStatus = builder.amortizationStatus;
            this.billAccountID = builder.billAccountID;
            this.billAccountName = builder.billAccountName;
            this.billOwnerID = builder.billOwnerID;
            this.billOwnerName = builder.billOwnerName;
            this.bizType = builder.bizType;
            this.consumePeriod = builder.consumePeriod;
            this.currentAmortizationDeductedByCashCoupons = builder.currentAmortizationDeductedByCashCoupons;
            this.currentAmortizationDeductedByCoupons = builder.currentAmortizationDeductedByCoupons;
            this.currentAmortizationDeductedByPrepaidCard = builder.currentAmortizationDeductedByPrepaidCard;
            this.currentAmortizationExpenditureAmount = builder.currentAmortizationExpenditureAmount;
            this.currentAmortizationInvoiceDiscount = builder.currentAmortizationInvoiceDiscount;
            this.currentAmortizationPretaxAmount = builder.currentAmortizationPretaxAmount;
            this.currentAmortizationPretaxGrossAmount = builder.currentAmortizationPretaxGrossAmount;
            this.currentAmortizationRoundDownDiscount = builder.currentAmortizationRoundDownDiscount;
            this.deductedByCashCoupons = builder.deductedByCashCoupons;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.deductedByPrepaidCard = builder.deductedByPrepaidCard;
            this.expenditureAmount = builder.expenditureAmount;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.previouslyAmortizedDeductedByCashCoupons = builder.previouslyAmortizedDeductedByCashCoupons;
            this.previouslyAmortizedDeductedByCoupons = builder.previouslyAmortizedDeductedByCoupons;
            this.previouslyAmortizedDeductedByPrepaidCard = builder.previouslyAmortizedDeductedByPrepaidCard;
            this.previouslyAmortizedExpenditureAmount = builder.previouslyAmortizedExpenditureAmount;
            this.previouslyAmortizedInvoiceDiscount = builder.previouslyAmortizedInvoiceDiscount;
            this.previouslyAmortizedPretaxAmount = builder.previouslyAmortizedPretaxAmount;
            this.previouslyAmortizedPretaxGrossAmount = builder.previouslyAmortizedPretaxGrossAmount;
            this.previouslyAmortizedRoundDownDiscount = builder.previouslyAmortizedRoundDownDiscount;
            this.productCode = builder.productCode;
            this.productDetail = builder.productDetail;
            this.productDetailCode = builder.productDetailCode;
            this.productName = builder.productName;
            this.remainingAmortizationDeductedByCashCoupons = builder.remainingAmortizationDeductedByCashCoupons;
            this.remainingAmortizationDeductedByCoupons = builder.remainingAmortizationDeductedByCoupons;
            this.remainingAmortizationDeductedByPrepaidCard = builder.remainingAmortizationDeductedByPrepaidCard;
            this.remainingAmortizationExpenditureAmount = builder.remainingAmortizationExpenditureAmount;
            this.remainingAmortizationInvoiceDiscount = builder.remainingAmortizationInvoiceDiscount;
            this.remainingAmortizationPretaxAmount = builder.remainingAmortizationPretaxAmount;
            this.remainingAmortizationPretaxGrossAmount = builder.remainingAmortizationPretaxGrossAmount;
            this.remainingAmortizationRoundDownDiscount = builder.remainingAmortizationRoundDownDiscount;
            this.roundDownDiscount = builder.roundDownDiscount;
            this.subscriptionType = builder.subscriptionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return amortizationPeriod
         */
        public String getAmortizationPeriod() {
            return this.amortizationPeriod;
        }

        /**
         * @return amortizationStatus
         */
        public String getAmortizationStatus() {
            return this.amortizationStatus;
        }

        /**
         * @return billAccountID
         */
        public Long getBillAccountID() {
            return this.billAccountID;
        }

        /**
         * @return billAccountName
         */
        public String getBillAccountName() {
            return this.billAccountName;
        }

        /**
         * @return billOwnerID
         */
        public Long getBillOwnerID() {
            return this.billOwnerID;
        }

        /**
         * @return billOwnerName
         */
        public String getBillOwnerName() {
            return this.billOwnerName;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return consumePeriod
         */
        public String getConsumePeriod() {
            return this.consumePeriod;
        }

        /**
         * @return currentAmortizationDeductedByCashCoupons
         */
        public Double getCurrentAmortizationDeductedByCashCoupons() {
            return this.currentAmortizationDeductedByCashCoupons;
        }

        /**
         * @return currentAmortizationDeductedByCoupons
         */
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
        }

        /**
         * @return currentAmortizationDeductedByPrepaidCard
         */
        public Double getCurrentAmortizationDeductedByPrepaidCard() {
            return this.currentAmortizationDeductedByPrepaidCard;
        }

        /**
         * @return currentAmortizationExpenditureAmount
         */
        public Double getCurrentAmortizationExpenditureAmount() {
            return this.currentAmortizationExpenditureAmount;
        }

        /**
         * @return currentAmortizationInvoiceDiscount
         */
        public Double getCurrentAmortizationInvoiceDiscount() {
            return this.currentAmortizationInvoiceDiscount;
        }

        /**
         * @return currentAmortizationPretaxAmount
         */
        public Double getCurrentAmortizationPretaxAmount() {
            return this.currentAmortizationPretaxAmount;
        }

        /**
         * @return currentAmortizationPretaxGrossAmount
         */
        public Double getCurrentAmortizationPretaxGrossAmount() {
            return this.currentAmortizationPretaxGrossAmount;
        }

        /**
         * @return currentAmortizationRoundDownDiscount
         */
        public Double getCurrentAmortizationRoundDownDiscount() {
            return this.currentAmortizationRoundDownDiscount;
        }

        /**
         * @return deductedByCashCoupons
         */
        public Double getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        /**
         * @return deductedByCoupons
         */
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        /**
         * @return deductedByPrepaidCard
         */
        public Double getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        /**
         * @return expenditureAmount
         */
        public Double getExpenditureAmount() {
            return this.expenditureAmount;
        }

        /**
         * @return invoiceDiscount
         */
        public Double getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        /**
         * @return pretaxAmount
         */
        public Double getPretaxAmount() {
            return this.pretaxAmount;
        }

        /**
         * @return pretaxGrossAmount
         */
        public Double getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        /**
         * @return previouslyAmortizedDeductedByCashCoupons
         */
        public Double getPreviouslyAmortizedDeductedByCashCoupons() {
            return this.previouslyAmortizedDeductedByCashCoupons;
        }

        /**
         * @return previouslyAmortizedDeductedByCoupons
         */
        public Double getPreviouslyAmortizedDeductedByCoupons() {
            return this.previouslyAmortizedDeductedByCoupons;
        }

        /**
         * @return previouslyAmortizedDeductedByPrepaidCard
         */
        public Double getPreviouslyAmortizedDeductedByPrepaidCard() {
            return this.previouslyAmortizedDeductedByPrepaidCard;
        }

        /**
         * @return previouslyAmortizedExpenditureAmount
         */
        public Double getPreviouslyAmortizedExpenditureAmount() {
            return this.previouslyAmortizedExpenditureAmount;
        }

        /**
         * @return previouslyAmortizedInvoiceDiscount
         */
        public Double getPreviouslyAmortizedInvoiceDiscount() {
            return this.previouslyAmortizedInvoiceDiscount;
        }

        /**
         * @return previouslyAmortizedPretaxAmount
         */
        public Double getPreviouslyAmortizedPretaxAmount() {
            return this.previouslyAmortizedPretaxAmount;
        }

        /**
         * @return previouslyAmortizedPretaxGrossAmount
         */
        public Double getPreviouslyAmortizedPretaxGrossAmount() {
            return this.previouslyAmortizedPretaxGrossAmount;
        }

        /**
         * @return previouslyAmortizedRoundDownDiscount
         */
        public Double getPreviouslyAmortizedRoundDownDiscount() {
            return this.previouslyAmortizedRoundDownDiscount;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productDetail
         */
        public String getProductDetail() {
            return this.productDetail;
        }

        /**
         * @return productDetailCode
         */
        public String getProductDetailCode() {
            return this.productDetailCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return remainingAmortizationDeductedByCashCoupons
         */
        public Double getRemainingAmortizationDeductedByCashCoupons() {
            return this.remainingAmortizationDeductedByCashCoupons;
        }

        /**
         * @return remainingAmortizationDeductedByCoupons
         */
        public Double getRemainingAmortizationDeductedByCoupons() {
            return this.remainingAmortizationDeductedByCoupons;
        }

        /**
         * @return remainingAmortizationDeductedByPrepaidCard
         */
        public Double getRemainingAmortizationDeductedByPrepaidCard() {
            return this.remainingAmortizationDeductedByPrepaidCard;
        }

        /**
         * @return remainingAmortizationExpenditureAmount
         */
        public Double getRemainingAmortizationExpenditureAmount() {
            return this.remainingAmortizationExpenditureAmount;
        }

        /**
         * @return remainingAmortizationInvoiceDiscount
         */
        public Double getRemainingAmortizationInvoiceDiscount() {
            return this.remainingAmortizationInvoiceDiscount;
        }

        /**
         * @return remainingAmortizationPretaxAmount
         */
        public Double getRemainingAmortizationPretaxAmount() {
            return this.remainingAmortizationPretaxAmount;
        }

        /**
         * @return remainingAmortizationPretaxGrossAmount
         */
        public Double getRemainingAmortizationPretaxGrossAmount() {
            return this.remainingAmortizationPretaxGrossAmount;
        }

        /**
         * @return remainingAmortizationRoundDownDiscount
         */
        public Double getRemainingAmortizationRoundDownDiscount() {
            return this.remainingAmortizationRoundDownDiscount;
        }

        /**
         * @return roundDownDiscount
         */
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public static final class Builder {
            private String amortizationPeriod; 
            private String amortizationStatus; 
            private Long billAccountID; 
            private String billAccountName; 
            private Long billOwnerID; 
            private String billOwnerName; 
            private String bizType; 
            private String consumePeriod; 
            private Double currentAmortizationDeductedByCashCoupons; 
            private Double currentAmortizationDeductedByCoupons; 
            private Double currentAmortizationDeductedByPrepaidCard; 
            private Double currentAmortizationExpenditureAmount; 
            private Double currentAmortizationInvoiceDiscount; 
            private Double currentAmortizationPretaxAmount; 
            private Double currentAmortizationPretaxGrossAmount; 
            private Double currentAmortizationRoundDownDiscount; 
            private Double deductedByCashCoupons; 
            private Double deductedByCoupons; 
            private Double deductedByPrepaidCard; 
            private Double expenditureAmount; 
            private Double invoiceDiscount; 
            private Double pretaxAmount; 
            private Double pretaxGrossAmount; 
            private Double previouslyAmortizedDeductedByCashCoupons; 
            private Double previouslyAmortizedDeductedByCoupons; 
            private Double previouslyAmortizedDeductedByPrepaidCard; 
            private Double previouslyAmortizedExpenditureAmount; 
            private Double previouslyAmortizedInvoiceDiscount; 
            private Double previouslyAmortizedPretaxAmount; 
            private Double previouslyAmortizedPretaxGrossAmount; 
            private Double previouslyAmortizedRoundDownDiscount; 
            private String productCode; 
            private String productDetail; 
            private String productDetailCode; 
            private String productName; 
            private Double remainingAmortizationDeductedByCashCoupons; 
            private Double remainingAmortizationDeductedByCoupons; 
            private Double remainingAmortizationDeductedByPrepaidCard; 
            private Double remainingAmortizationExpenditureAmount; 
            private Double remainingAmortizationInvoiceDiscount; 
            private Double remainingAmortizationPretaxAmount; 
            private Double remainingAmortizationPretaxGrossAmount; 
            private Double remainingAmortizationRoundDownDiscount; 
            private Double roundDownDiscount; 
            private String subscriptionType; 

            /**
             * <p>The allocation month. Format: YYYYMM.</p>
             * 
             * <strong>example:</strong>
             * <p>202210</p>
             */
            public Builder amortizationPeriod(String amortizationPeriod) {
                this.amortizationPeriod = amortizationPeriod;
                return this;
            }

            /**
             * <p>The allocation status. Valid values:</p>
             * <ul>
             * <li>amortized: allocated</li>
             * <li>unAmortized: not allocated</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>amortized</p>
             */
            public Builder amortizationStatus(String amortizationStatus) {
                this.amortizationStatus = amortizationStatus;
                return this;
            }

            /**
             * <p>The ID of the account to which the bill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>185xxxxx489</p>
             */
            public Builder billAccountID(Long billAccountID) {
                this.billAccountID = billAccountID;
                return this;
            }

            /**
             * <p>The name of the account to which the bill belongs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder billAccountName(String billAccountName) {
                this.billAccountName = billAccountName;
                return this;
            }

            /**
             * <p>The ID of the account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>185xxxxx489</p>
             */
            public Builder billOwnerID(Long billOwnerID) {
                this.billOwnerID = billOwnerID;
                return this;
            }

            /**
             * <p>The name of the account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder billOwnerName(String billOwnerName) {
                this.billOwnerName = billOwnerName;
                return this;
            }

            /**
             * <p>The business type.</p>
             * 
             * <strong>example:</strong>
             * <p>trusteeship</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The billing cycle. Format: YYYYMM.</p>
             * 
             * <strong>example:</strong>
             * <p>202210</p>
             */
            public Builder consumePeriod(String consumePeriod) {
                this.consumePeriod = consumePeriod;
                return this;
            }

            /**
             * <p>The amount deducted by using vouchers and allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
                this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using coupons and allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
                this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using prepaid cards and allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
                this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
                return this;
            }

            /**
             * <p>The expenditure amount allocated to the current allocation month. Invoicing is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
                this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
                return this;
            }

            /**
             * <p>The discount amount allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
                this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
                return this;
            }

            /**
             * <p>The pretax amount allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
                this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
                return this;
            }

            /**
             * <p>The pretax gross amount allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
                this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
                return this;
            }

            /**
             * <p>The round-off amount allocated to the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
                this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
                return this;
            }

            /**
             * <p>The amount deducted by using vouchers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByCashCoupons(Double deductedByCashCoupons) {
                this.deductedByCashCoupons = deductedByCashCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using coupons.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByCoupons(Double deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using prepaid cards.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder deductedByPrepaidCard(Double deductedByPrepaidCard) {
                this.deductedByPrepaidCard = deductedByPrepaidCard;
                return this;
            }

            /**
             * <p>The expenditure amount. Invoicing is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder expenditureAmount(Double expenditureAmount) {
                this.expenditureAmount = expenditureAmount;
                return this;
            }

            /**
             * <p>The discount amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder invoiceDiscount(Double invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * <p>The pretax amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxAmount(Double pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * <p>The pretax gross amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pretaxGrossAmount(Double pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * <p>The amount deducted by using vouchers and allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
                this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using coupons and allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
                this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using prepaid cards and allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
                this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
                return this;
            }

            /**
             * <p>The expenditure amount allocated before the current allocation month. Invoicing is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
                this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
                return this;
            }

            /**
             * <p>The discount amount allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
                this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
                return this;
            }

            /**
             * <p>The pretax amount allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
                this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
                return this;
            }

            /**
             * <p>The pretax gross amount allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
                this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
                return this;
            }

            /**
             * <p>The round-off amount allocated before the current allocation month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder previouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
                this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
                return this;
            }

            /**
             * <p>The code of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The specific service resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * <p>The code of the specific service resource.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder productDetailCode(String productDetailCode) {
                this.productDetailCode = productDetailCode;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB RDS</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The amount deducted by using vouchers and to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
                this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using coupons and to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
                this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
                return this;
            }

            /**
             * <p>The amount deducted by using prepaid cards and to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
                this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
                return this;
            }

            /**
             * <p>The expenditure amount to be allocated to one or more future allocation months. Invoicing is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
                this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
                return this;
            }

            /**
             * <p>The discount amount to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
                this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
                return this;
            }

            /**
             * <p>The pretax amount to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
                this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
                return this;
            }

            /**
             * <p>The pretax gross amount to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
                this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
                return this;
            }

            /**
             * <p>The round-off amount to be allocated to one or more future allocation months.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
                this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
                return this;
            }

            /**
             * <p>The round-off amount.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder roundDownDiscount(Double roundDownDiscount) {
                this.roundDownDiscount = roundDownDiscount;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>Subscription: the subscription billing method</li>
             * <li>PayAsYouGo: the pay-as-you-go billing method</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayAsYouGo</p>
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductAmortizedCostByAmortizationPeriodResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductAmortizedCostByAmortizationPeriodResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountID")
        private String accountID;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.accountID = builder.accountID;
            this.accountName = builder.accountName;
            this.items = builder.items;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountID
         */
        public String getAccountID() {
            return this.accountID;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String accountID; 
            private String accountName; 
            private java.util.List<Items> items; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * <p>The ID of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>185766xxxx</p>
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * <p>The name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The data entries returned.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The position from which the results started to return. The parameter must be left empty or set to the value of the NextToken parameter returned from the last call. Otherwise, an error is returned. If this parameter is left empty, data is queried from the beginning.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
