// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody</p>
 */
public class DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
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

    private DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody create() {
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
         * The status code returned.
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
         * The message returned.
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody build() {
            return new DescribeInstanceAmortizedCostByAmortizationPeriodResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("CostUnit")
        private String costUnit;

        @com.aliyun.core.annotation.NameInMap("CostUnitCode")
        private String costUnitCode;

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

        @com.aliyun.core.annotation.NameInMap("InstanceID")
        private String instanceID;

        @com.aliyun.core.annotation.NameInMap("InternetIP")
        private String internetIP;

        @com.aliyun.core.annotation.NameInMap("IntranetIP")
        private String intranetIP;

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

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("RoundDownDiscount")
        private Double roundDownDiscount;

        @com.aliyun.core.annotation.NameInMap("SplitAccountName")
        private String splitAccountName;

        @com.aliyun.core.annotation.NameInMap("SplitItemID")
        private String splitItemID;

        @com.aliyun.core.annotation.NameInMap("SplitItemName")
        private String splitItemName;

        @com.aliyun.core.annotation.NameInMap("SplitProductDetail")
        private String splitProductDetail;

        @com.aliyun.core.annotation.NameInMap("SubscriptionType")
        private String subscriptionType;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        private Items(Builder builder) {
            this.amortizationPeriod = builder.amortizationPeriod;
            this.amortizationStatus = builder.amortizationStatus;
            this.billAccountID = builder.billAccountID;
            this.billAccountName = builder.billAccountName;
            this.billOwnerID = builder.billOwnerID;
            this.billOwnerName = builder.billOwnerName;
            this.bizType = builder.bizType;
            this.consumePeriod = builder.consumePeriod;
            this.costUnit = builder.costUnit;
            this.costUnitCode = builder.costUnitCode;
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
            this.instanceID = builder.instanceID;
            this.internetIP = builder.internetIP;
            this.intranetIP = builder.intranetIP;
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
            this.region = builder.region;
            this.remainingAmortizationDeductedByCashCoupons = builder.remainingAmortizationDeductedByCashCoupons;
            this.remainingAmortizationDeductedByCoupons = builder.remainingAmortizationDeductedByCoupons;
            this.remainingAmortizationDeductedByPrepaidCard = builder.remainingAmortizationDeductedByPrepaidCard;
            this.remainingAmortizationExpenditureAmount = builder.remainingAmortizationExpenditureAmount;
            this.remainingAmortizationInvoiceDiscount = builder.remainingAmortizationInvoiceDiscount;
            this.remainingAmortizationPretaxAmount = builder.remainingAmortizationPretaxAmount;
            this.remainingAmortizationPretaxGrossAmount = builder.remainingAmortizationPretaxGrossAmount;
            this.remainingAmortizationRoundDownDiscount = builder.remainingAmortizationRoundDownDiscount;
            this.resourceGroup = builder.resourceGroup;
            this.roundDownDiscount = builder.roundDownDiscount;
            this.splitAccountName = builder.splitAccountName;
            this.splitItemID = builder.splitItemID;
            this.splitItemName = builder.splitItemName;
            this.splitProductDetail = builder.splitProductDetail;
            this.subscriptionType = builder.subscriptionType;
            this.tag = builder.tag;
            this.zone = builder.zone;
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
         * @return costUnit
         */
        public String getCostUnit() {
            return this.costUnit;
        }

        /**
         * @return costUnitCode
         */
        public String getCostUnitCode() {
            return this.costUnitCode;
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
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return internetIP
         */
        public String getInternetIP() {
            return this.internetIP;
        }

        /**
         * @return intranetIP
         */
        public String getIntranetIP() {
            return this.intranetIP;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
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
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return roundDownDiscount
         */
        public Double getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        /**
         * @return splitAccountName
         */
        public String getSplitAccountName() {
            return this.splitAccountName;
        }

        /**
         * @return splitItemID
         */
        public String getSplitItemID() {
            return this.splitItemID;
        }

        /**
         * @return splitItemName
         */
        public String getSplitItemName() {
            return this.splitItemName;
        }

        /**
         * @return splitProductDetail
         */
        public String getSplitProductDetail() {
            return this.splitProductDetail;
        }

        /**
         * @return subscriptionType
         */
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
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
            private String costUnit; 
            private String costUnitCode; 
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
            private String instanceID; 
            private String internetIP; 
            private String intranetIP; 
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
            private String region; 
            private Double remainingAmortizationDeductedByCashCoupons; 
            private Double remainingAmortizationDeductedByCoupons; 
            private Double remainingAmortizationDeductedByPrepaidCard; 
            private Double remainingAmortizationExpenditureAmount; 
            private Double remainingAmortizationInvoiceDiscount; 
            private Double remainingAmortizationPretaxAmount; 
            private Double remainingAmortizationPretaxGrossAmount; 
            private Double remainingAmortizationRoundDownDiscount; 
            private String resourceGroup; 
            private Double roundDownDiscount; 
            private String splitAccountName; 
            private String splitItemID; 
            private String splitItemName; 
            private String splitProductDetail; 
            private String subscriptionType; 
            private String tag; 
            private String zone; 

            /**
             * The allocation month. Format: YYYYMM.
             */
            public Builder amortizationPeriod(String amortizationPeriod) {
                this.amortizationPeriod = amortizationPeriod;
                return this;
            }

            /**
             * The allocation status. Valid values:
             * <p>
             * 
             * *   amortized: allocated
             * *   unAmortized: not allocated
             */
            public Builder amortizationStatus(String amortizationStatus) {
                this.amortizationStatus = amortizationStatus;
                return this;
            }

            /**
             * The ID of the account to which the bill belongs.
             */
            public Builder billAccountID(Long billAccountID) {
                this.billAccountID = billAccountID;
                return this;
            }

            /**
             * The name of the account to which the bill belongs.
             */
            public Builder billAccountName(String billAccountName) {
                this.billAccountName = billAccountName;
                return this;
            }

            /**
             * The ID of the account to which the resource belongs.
             */
            public Builder billOwnerID(Long billOwnerID) {
                this.billOwnerID = billOwnerID;
                return this;
            }

            /**
             * The name of the account to which the resource belongs.
             */
            public Builder billOwnerName(String billOwnerName) {
                this.billOwnerName = billOwnerName;
                return this;
            }

            /**
             * The business type.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The billing cycle. Format: YYYYMM.
             */
            public Builder consumePeriod(String consumePeriod) {
                this.consumePeriod = consumePeriod;
                return this;
            }

            /**
             * The cost center.
             */
            public Builder costUnit(String costUnit) {
                this.costUnit = costUnit;
                return this;
            }

            /**
             * The code of the cost center.
             */
            public Builder costUnitCode(String costUnitCode) {
                this.costUnitCode = costUnitCode;
                return this;
            }

            /**
             * The amount deducted by using vouchers and allocated to the current allocation month.
             */
            public Builder currentAmortizationDeductedByCashCoupons(Double currentAmortizationDeductedByCashCoupons) {
                this.currentAmortizationDeductedByCashCoupons = currentAmortizationDeductedByCashCoupons;
                return this;
            }

            /**
             * The amount deducted by using coupons and allocated to the current allocation month.
             */
            public Builder currentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
                this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
                return this;
            }

            /**
             * The amount deducted by using prepaid cards and allocated to the current allocation month.
             */
            public Builder currentAmortizationDeductedByPrepaidCard(Double currentAmortizationDeductedByPrepaidCard) {
                this.currentAmortizationDeductedByPrepaidCard = currentAmortizationDeductedByPrepaidCard;
                return this;
            }

            /**
             * The expenditure amount allocated to the current allocation month. Invoicing is supported.
             */
            public Builder currentAmortizationExpenditureAmount(Double currentAmortizationExpenditureAmount) {
                this.currentAmortizationExpenditureAmount = currentAmortizationExpenditureAmount;
                return this;
            }

            /**
             * The discount amount allocated to the current allocation month.
             */
            public Builder currentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
                this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
                return this;
            }

            /**
             * The pretax amount allocated to the current allocation month.
             */
            public Builder currentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
                this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
                return this;
            }

            /**
             * The pretax gross amount allocated to the current allocation month.
             */
            public Builder currentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
                this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
                return this;
            }

            /**
             * The round-off amount allocated to the current allocation month.
             */
            public Builder currentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
                this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
                return this;
            }

            /**
             * The amount deducted by using vouchers.
             */
            public Builder deductedByCashCoupons(Double deductedByCashCoupons) {
                this.deductedByCashCoupons = deductedByCashCoupons;
                return this;
            }

            /**
             * The amount deducted by using coupons.
             */
            public Builder deductedByCoupons(Double deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * The amount deducted by using prepaid cards.
             */
            public Builder deductedByPrepaidCard(Double deductedByPrepaidCard) {
                this.deductedByPrepaidCard = deductedByPrepaidCard;
                return this;
            }

            /**
             * The expenditure amount. Invoicing is supported.
             */
            public Builder expenditureAmount(Double expenditureAmount) {
                this.expenditureAmount = expenditureAmount;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * The public IP address of the instance.
             */
            public Builder internetIP(String internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            /**
             * The private IP address of the instance.
             */
            public Builder intranetIP(String intranetIP) {
                this.intranetIP = intranetIP;
                return this;
            }

            /**
             * The discount amount.
             */
            public Builder invoiceDiscount(Double invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * The pretax amount.
             */
            public Builder pretaxAmount(Double pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * The pretax gross amount.
             */
            public Builder pretaxGrossAmount(Double pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * The amount deducted by using vouchers and allocated before the current allocation month.
             */
            public Builder previouslyAmortizedDeductedByCashCoupons(Double previouslyAmortizedDeductedByCashCoupons) {
                this.previouslyAmortizedDeductedByCashCoupons = previouslyAmortizedDeductedByCashCoupons;
                return this;
            }

            /**
             * The amount deducted by using coupons and allocated before the current allocation month.
             */
            public Builder previouslyAmortizedDeductedByCoupons(Double previouslyAmortizedDeductedByCoupons) {
                this.previouslyAmortizedDeductedByCoupons = previouslyAmortizedDeductedByCoupons;
                return this;
            }

            /**
             * The amount deducted by using prepaid cards and allocated before the current allocation month.
             */
            public Builder previouslyAmortizedDeductedByPrepaidCard(Double previouslyAmortizedDeductedByPrepaidCard) {
                this.previouslyAmortizedDeductedByPrepaidCard = previouslyAmortizedDeductedByPrepaidCard;
                return this;
            }

            /**
             * The expenditure amount allocated before the allocation month. Invoicing is supported.
             */
            public Builder previouslyAmortizedExpenditureAmount(Double previouslyAmortizedExpenditureAmount) {
                this.previouslyAmortizedExpenditureAmount = previouslyAmortizedExpenditureAmount;
                return this;
            }

            /**
             * The discount amount allocated before the current allocation month.
             */
            public Builder previouslyAmortizedInvoiceDiscount(Double previouslyAmortizedInvoiceDiscount) {
                this.previouslyAmortizedInvoiceDiscount = previouslyAmortizedInvoiceDiscount;
                return this;
            }

            /**
             * The pretax amount allocated before the current allocation month.
             */
            public Builder previouslyAmortizedPretaxAmount(Double previouslyAmortizedPretaxAmount) {
                this.previouslyAmortizedPretaxAmount = previouslyAmortizedPretaxAmount;
                return this;
            }

            /**
             * The pretax gross amount allocated before the current allocation month.
             */
            public Builder previouslyAmortizedPretaxGrossAmount(Double previouslyAmortizedPretaxGrossAmount) {
                this.previouslyAmortizedPretaxGrossAmount = previouslyAmortizedPretaxGrossAmount;
                return this;
            }

            /**
             * The round-off amount allocated before the current allocation month.
             */
            public Builder previouslyAmortizedRoundDownDiscount(Double previouslyAmortizedRoundDownDiscount) {
                this.previouslyAmortizedRoundDownDiscount = previouslyAmortizedRoundDownDiscount;
                return this;
            }

            /**
             * The code of the service.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The specific service resource.
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * The code of the specific service resource.
             */
            public Builder productDetailCode(String productDetailCode) {
                this.productDetailCode = productDetailCode;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * The region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The amount deducted by using vouchers and to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationDeductedByCashCoupons(Double remainingAmortizationDeductedByCashCoupons) {
                this.remainingAmortizationDeductedByCashCoupons = remainingAmortizationDeductedByCashCoupons;
                return this;
            }

            /**
             * The amount deducted by using coupons and to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationDeductedByCoupons(Double remainingAmortizationDeductedByCoupons) {
                this.remainingAmortizationDeductedByCoupons = remainingAmortizationDeductedByCoupons;
                return this;
            }

            /**
             * The amount deducted by using prepaid cards and to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationDeductedByPrepaidCard(Double remainingAmortizationDeductedByPrepaidCard) {
                this.remainingAmortizationDeductedByPrepaidCard = remainingAmortizationDeductedByPrepaidCard;
                return this;
            }

            /**
             * The expenditure amount to be allocated to one or more future allocation months. Invoicing is supported.
             */
            public Builder remainingAmortizationExpenditureAmount(Double remainingAmortizationExpenditureAmount) {
                this.remainingAmortizationExpenditureAmount = remainingAmortizationExpenditureAmount;
                return this;
            }

            /**
             * The discount amount to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationInvoiceDiscount(Double remainingAmortizationInvoiceDiscount) {
                this.remainingAmortizationInvoiceDiscount = remainingAmortizationInvoiceDiscount;
                return this;
            }

            /**
             * The pretax amount to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationPretaxAmount(Double remainingAmortizationPretaxAmount) {
                this.remainingAmortizationPretaxAmount = remainingAmortizationPretaxAmount;
                return this;
            }

            /**
             * The pretax gross amount to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationPretaxGrossAmount(Double remainingAmortizationPretaxGrossAmount) {
                this.remainingAmortizationPretaxGrossAmount = remainingAmortizationPretaxGrossAmount;
                return this;
            }

            /**
             * The round-off amount to be allocated to one or more future allocation months.
             */
            public Builder remainingAmortizationRoundDownDiscount(Double remainingAmortizationRoundDownDiscount) {
                this.remainingAmortizationRoundDownDiscount = remainingAmortizationRoundDownDiscount;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * The round-off amount.
             */
            public Builder roundDownDiscount(Double roundDownDiscount) {
                this.roundDownDiscount = roundDownDiscount;
                return this;
            }

            /**
             * The name of the account to which the split item belongs.
             */
            public Builder splitAccountName(String splitAccountName) {
                this.splitAccountName = splitAccountName;
                return this;
            }

            /**
             * The ID of the split item.
             */
            public Builder splitItemID(String splitItemID) {
                this.splitItemID = splitItemID;
                return this;
            }

            /**
             * The name of the split item.
             */
            public Builder splitItemName(String splitItemName) {
                this.splitItemName = splitItemName;
                return this;
            }

            /**
             * The name of the specific service resource to which the split item belongs.
             */
            public Builder splitProductDetail(String splitProductDetail) {
                this.splitProductDetail = splitProductDetail;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   Subscription: the subscription billing method
             * *   PayAsYouGo: the pay-as-you-go billing method
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * The tag of the instance.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountID")
        private String accountID;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

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
        public java.util.List < Items> getItems() {
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
            private java.util.List < Items> items; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * The ID of the account.
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * The name of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The data entries returned.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The maximum number of entries returned.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The position from which the results started to return. The parameter must be left empty or set to the value of the NextToken parameter returned from the last call. Otherwise, an error is returned. If this parameter is left empty, data is queried from the beginning.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of returned entries.
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
