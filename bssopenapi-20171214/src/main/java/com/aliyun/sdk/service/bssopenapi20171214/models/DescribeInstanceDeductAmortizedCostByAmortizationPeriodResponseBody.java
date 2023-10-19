// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody</p>
 */
public class DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody build() {
            return new DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AmortizationPeriod")
        private String amortizationPeriod;

        @NameInMap("AmortizationPeriodDay")
        private String amortizationPeriodDay;

        @NameInMap("AmortizationStatus")
        private String amortizationStatus;

        @NameInMap("BillAccountID")
        private Long billAccountID;

        @NameInMap("BillAccountName")
        private String billAccountName;

        @NameInMap("BillOwnerID")
        private Long billOwnerID;

        @NameInMap("BillOwnerName")
        private String billOwnerName;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("ConsumePeriod")
        private String consumePeriod;

        @NameInMap("CostUnit")
        private String costUnit;

        @NameInMap("CostUnitCode")
        private String costUnitCode;

        @NameInMap("CurrentAmortizationDeductedByCoupons")
        private Double currentAmortizationDeductedByCoupons;

        @NameInMap("CurrentAmortizationInvoiceDiscount")
        private Double currentAmortizationInvoiceDiscount;

        @NameInMap("CurrentAmortizationPretaxAmount")
        private Double currentAmortizationPretaxAmount;

        @NameInMap("CurrentAmortizationPretaxGrossAmount")
        private Double currentAmortizationPretaxGrossAmount;

        @NameInMap("CurrentAmortizationRoundDownDiscount")
        private Double currentAmortizationRoundDownDiscount;

        @NameInMap("DeductedByCoupons")
        private Double deductedByCoupons;

        @NameInMap("InstanceConfig")
        private String instanceConfig;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InternetIP")
        private String internetIP;

        @NameInMap("IntranetIP")
        private String intranetIP;

        @NameInMap("InvoiceDiscount")
        private Double invoiceDiscount;

        @NameInMap("PretaxAmount")
        private Double pretaxAmount;

        @NameInMap("PretaxGrossAmount")
        private Double pretaxGrossAmount;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductDetail")
        private String productDetail;

        @NameInMap("ProductDetailCode")
        private String productDetailCode;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ReferFrInstanceID")
        private String referFrInstanceID;

        @NameInMap("ReferFrOwnerID")
        private String referFrOwnerID;

        @NameInMap("ReferFrProductDetailCode")
        private String referFrProductDetailCode;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceGroup")
        private String resourceGroup;

        @NameInMap("RoundDownDiscount")
        private Double roundDownDiscount;

        @NameInMap("SplitAccountName")
        private String splitAccountName;

        @NameInMap("SplitItemID")
        private String splitItemID;

        @NameInMap("SplitItemName")
        private String splitItemName;

        @NameInMap("SplitProductDetail")
        private String splitProductDetail;

        @NameInMap("SubscriptionType")
        private String subscriptionType;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("UnusedAmortizationDeductedByCoupons")
        private Double unusedAmortizationDeductedByCoupons;

        @NameInMap("UnusedAmortizationInvoiceDiscount")
        private Double unusedAmortizationInvoiceDiscount;

        @NameInMap("UnusedAmortizationPretaxAmount")
        private Double unusedAmortizationPretaxAmount;

        @NameInMap("UnusedAmortizationPretaxGrossAmount")
        private Double unusedAmortizationPretaxGrossAmount;

        @NameInMap("UnusedAmortizationRoundDownDiscount")
        private Double unusedAmortizationRoundDownDiscount;

        @NameInMap("Zone")
        private String zone;

        private Items(Builder builder) {
            this.amortizationPeriod = builder.amortizationPeriod;
            this.amortizationPeriodDay = builder.amortizationPeriodDay;
            this.amortizationStatus = builder.amortizationStatus;
            this.billAccountID = builder.billAccountID;
            this.billAccountName = builder.billAccountName;
            this.billOwnerID = builder.billOwnerID;
            this.billOwnerName = builder.billOwnerName;
            this.bizType = builder.bizType;
            this.consumePeriod = builder.consumePeriod;
            this.costUnit = builder.costUnit;
            this.costUnitCode = builder.costUnitCode;
            this.currentAmortizationDeductedByCoupons = builder.currentAmortizationDeductedByCoupons;
            this.currentAmortizationInvoiceDiscount = builder.currentAmortizationInvoiceDiscount;
            this.currentAmortizationPretaxAmount = builder.currentAmortizationPretaxAmount;
            this.currentAmortizationPretaxGrossAmount = builder.currentAmortizationPretaxGrossAmount;
            this.currentAmortizationRoundDownDiscount = builder.currentAmortizationRoundDownDiscount;
            this.deductedByCoupons = builder.deductedByCoupons;
            this.instanceConfig = builder.instanceConfig;
            this.instanceID = builder.instanceID;
            this.internetIP = builder.internetIP;
            this.intranetIP = builder.intranetIP;
            this.invoiceDiscount = builder.invoiceDiscount;
            this.pretaxAmount = builder.pretaxAmount;
            this.pretaxGrossAmount = builder.pretaxGrossAmount;
            this.productCode = builder.productCode;
            this.productDetail = builder.productDetail;
            this.productDetailCode = builder.productDetailCode;
            this.productName = builder.productName;
            this.referFrInstanceID = builder.referFrInstanceID;
            this.referFrOwnerID = builder.referFrOwnerID;
            this.referFrProductDetailCode = builder.referFrProductDetailCode;
            this.region = builder.region;
            this.resourceGroup = builder.resourceGroup;
            this.roundDownDiscount = builder.roundDownDiscount;
            this.splitAccountName = builder.splitAccountName;
            this.splitItemID = builder.splitItemID;
            this.splitItemName = builder.splitItemName;
            this.splitProductDetail = builder.splitProductDetail;
            this.subscriptionType = builder.subscriptionType;
            this.tag = builder.tag;
            this.unusedAmortizationDeductedByCoupons = builder.unusedAmortizationDeductedByCoupons;
            this.unusedAmortizationInvoiceDiscount = builder.unusedAmortizationInvoiceDiscount;
            this.unusedAmortizationPretaxAmount = builder.unusedAmortizationPretaxAmount;
            this.unusedAmortizationPretaxGrossAmount = builder.unusedAmortizationPretaxGrossAmount;
            this.unusedAmortizationRoundDownDiscount = builder.unusedAmortizationRoundDownDiscount;
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
         * @return amortizationPeriodDay
         */
        public String getAmortizationPeriodDay() {
            return this.amortizationPeriodDay;
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
         * @return currentAmortizationDeductedByCoupons
         */
        public Double getCurrentAmortizationDeductedByCoupons() {
            return this.currentAmortizationDeductedByCoupons;
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
         * @return deductedByCoupons
         */
        public Double getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        /**
         * @return instanceConfig
         */
        public String getInstanceConfig() {
            return this.instanceConfig;
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
         * @return referFrInstanceID
         */
        public String getReferFrInstanceID() {
            return this.referFrInstanceID;
        }

        /**
         * @return referFrOwnerID
         */
        public String getReferFrOwnerID() {
            return this.referFrOwnerID;
        }

        /**
         * @return referFrProductDetailCode
         */
        public String getReferFrProductDetailCode() {
            return this.referFrProductDetailCode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
         * @return unusedAmortizationDeductedByCoupons
         */
        public Double getUnusedAmortizationDeductedByCoupons() {
            return this.unusedAmortizationDeductedByCoupons;
        }

        /**
         * @return unusedAmortizationInvoiceDiscount
         */
        public Double getUnusedAmortizationInvoiceDiscount() {
            return this.unusedAmortizationInvoiceDiscount;
        }

        /**
         * @return unusedAmortizationPretaxAmount
         */
        public Double getUnusedAmortizationPretaxAmount() {
            return this.unusedAmortizationPretaxAmount;
        }

        /**
         * @return unusedAmortizationPretaxGrossAmount
         */
        public Double getUnusedAmortizationPretaxGrossAmount() {
            return this.unusedAmortizationPretaxGrossAmount;
        }

        /**
         * @return unusedAmortizationRoundDownDiscount
         */
        public Double getUnusedAmortizationRoundDownDiscount() {
            return this.unusedAmortizationRoundDownDiscount;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String amortizationPeriod; 
            private String amortizationPeriodDay; 
            private String amortizationStatus; 
            private Long billAccountID; 
            private String billAccountName; 
            private Long billOwnerID; 
            private String billOwnerName; 
            private String bizType; 
            private String consumePeriod; 
            private String costUnit; 
            private String costUnitCode; 
            private Double currentAmortizationDeductedByCoupons; 
            private Double currentAmortizationInvoiceDiscount; 
            private Double currentAmortizationPretaxAmount; 
            private Double currentAmortizationPretaxGrossAmount; 
            private Double currentAmortizationRoundDownDiscount; 
            private Double deductedByCoupons; 
            private String instanceConfig; 
            private String instanceID; 
            private String internetIP; 
            private String intranetIP; 
            private Double invoiceDiscount; 
            private Double pretaxAmount; 
            private Double pretaxGrossAmount; 
            private String productCode; 
            private String productDetail; 
            private String productDetailCode; 
            private String productName; 
            private String referFrInstanceID; 
            private String referFrOwnerID; 
            private String referFrProductDetailCode; 
            private String region; 
            private String resourceGroup; 
            private Double roundDownDiscount; 
            private String splitAccountName; 
            private String splitItemID; 
            private String splitItemName; 
            private String splitProductDetail; 
            private String subscriptionType; 
            private String tag; 
            private Double unusedAmortizationDeductedByCoupons; 
            private Double unusedAmortizationInvoiceDiscount; 
            private Double unusedAmortizationPretaxAmount; 
            private Double unusedAmortizationPretaxGrossAmount; 
            private Double unusedAmortizationRoundDownDiscount; 
            private String zone; 

            /**
             * AmortizationPeriod.
             */
            public Builder amortizationPeriod(String amortizationPeriod) {
                this.amortizationPeriod = amortizationPeriod;
                return this;
            }

            /**
             * AmortizationPeriodDay.
             */
            public Builder amortizationPeriodDay(String amortizationPeriodDay) {
                this.amortizationPeriodDay = amortizationPeriodDay;
                return this;
            }

            /**
             * AmortizationStatus.
             */
            public Builder amortizationStatus(String amortizationStatus) {
                this.amortizationStatus = amortizationStatus;
                return this;
            }

            /**
             * BillAccountID.
             */
            public Builder billAccountID(Long billAccountID) {
                this.billAccountID = billAccountID;
                return this;
            }

            /**
             * BillAccountName.
             */
            public Builder billAccountName(String billAccountName) {
                this.billAccountName = billAccountName;
                return this;
            }

            /**
             * BillOwnerID.
             */
            public Builder billOwnerID(Long billOwnerID) {
                this.billOwnerID = billOwnerID;
                return this;
            }

            /**
             * BillOwnerName.
             */
            public Builder billOwnerName(String billOwnerName) {
                this.billOwnerName = billOwnerName;
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
             * ConsumePeriod.
             */
            public Builder consumePeriod(String consumePeriod) {
                this.consumePeriod = consumePeriod;
                return this;
            }

            /**
             * CostUnit.
             */
            public Builder costUnit(String costUnit) {
                this.costUnit = costUnit;
                return this;
            }

            /**
             * CostUnitCode.
             */
            public Builder costUnitCode(String costUnitCode) {
                this.costUnitCode = costUnitCode;
                return this;
            }

            /**
             * CurrentAmortizationDeductedByCoupons.
             */
            public Builder currentAmortizationDeductedByCoupons(Double currentAmortizationDeductedByCoupons) {
                this.currentAmortizationDeductedByCoupons = currentAmortizationDeductedByCoupons;
                return this;
            }

            /**
             * CurrentAmortizationInvoiceDiscount.
             */
            public Builder currentAmortizationInvoiceDiscount(Double currentAmortizationInvoiceDiscount) {
                this.currentAmortizationInvoiceDiscount = currentAmortizationInvoiceDiscount;
                return this;
            }

            /**
             * CurrentAmortizationPretaxAmount.
             */
            public Builder currentAmortizationPretaxAmount(Double currentAmortizationPretaxAmount) {
                this.currentAmortizationPretaxAmount = currentAmortizationPretaxAmount;
                return this;
            }

            /**
             * CurrentAmortizationPretaxGrossAmount.
             */
            public Builder currentAmortizationPretaxGrossAmount(Double currentAmortizationPretaxGrossAmount) {
                this.currentAmortizationPretaxGrossAmount = currentAmortizationPretaxGrossAmount;
                return this;
            }

            /**
             * CurrentAmortizationRoundDownDiscount.
             */
            public Builder currentAmortizationRoundDownDiscount(Double currentAmortizationRoundDownDiscount) {
                this.currentAmortizationRoundDownDiscount = currentAmortizationRoundDownDiscount;
                return this;
            }

            /**
             * DeductedByCoupons.
             */
            public Builder deductedByCoupons(Double deductedByCoupons) {
                this.deductedByCoupons = deductedByCoupons;
                return this;
            }

            /**
             * InstanceConfig.
             */
            public Builder instanceConfig(String instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InternetIP.
             */
            public Builder internetIP(String internetIP) {
                this.internetIP = internetIP;
                return this;
            }

            /**
             * IntranetIP.
             */
            public Builder intranetIP(String intranetIP) {
                this.intranetIP = intranetIP;
                return this;
            }

            /**
             * InvoiceDiscount.
             */
            public Builder invoiceDiscount(Double invoiceDiscount) {
                this.invoiceDiscount = invoiceDiscount;
                return this;
            }

            /**
             * PretaxAmount.
             */
            public Builder pretaxAmount(Double pretaxAmount) {
                this.pretaxAmount = pretaxAmount;
                return this;
            }

            /**
             * PretaxGrossAmount.
             */
            public Builder pretaxGrossAmount(Double pretaxGrossAmount) {
                this.pretaxGrossAmount = pretaxGrossAmount;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductDetail.
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * ProductDetailCode.
             */
            public Builder productDetailCode(String productDetailCode) {
                this.productDetailCode = productDetailCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * ReferFrInstanceID.
             */
            public Builder referFrInstanceID(String referFrInstanceID) {
                this.referFrInstanceID = referFrInstanceID;
                return this;
            }

            /**
             * ReferFrOwnerID.
             */
            public Builder referFrOwnerID(String referFrOwnerID) {
                this.referFrOwnerID = referFrOwnerID;
                return this;
            }

            /**
             * ReferFrProductDetailCode.
             */
            public Builder referFrProductDetailCode(String referFrProductDetailCode) {
                this.referFrProductDetailCode = referFrProductDetailCode;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * RoundDownDiscount.
             */
            public Builder roundDownDiscount(Double roundDownDiscount) {
                this.roundDownDiscount = roundDownDiscount;
                return this;
            }

            /**
             * SplitAccountName.
             */
            public Builder splitAccountName(String splitAccountName) {
                this.splitAccountName = splitAccountName;
                return this;
            }

            /**
             * SplitItemID.
             */
            public Builder splitItemID(String splitItemID) {
                this.splitItemID = splitItemID;
                return this;
            }

            /**
             * SplitItemName.
             */
            public Builder splitItemName(String splitItemName) {
                this.splitItemName = splitItemName;
                return this;
            }

            /**
             * SplitProductDetail.
             */
            public Builder splitProductDetail(String splitProductDetail) {
                this.splitProductDetail = splitProductDetail;
                return this;
            }

            /**
             * SubscriptionType.
             */
            public Builder subscriptionType(String subscriptionType) {
                this.subscriptionType = subscriptionType;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * UnusedAmortizationDeductedByCoupons.
             */
            public Builder unusedAmortizationDeductedByCoupons(Double unusedAmortizationDeductedByCoupons) {
                this.unusedAmortizationDeductedByCoupons = unusedAmortizationDeductedByCoupons;
                return this;
            }

            /**
             * UnusedAmortizationInvoiceDiscount.
             */
            public Builder unusedAmortizationInvoiceDiscount(Double unusedAmortizationInvoiceDiscount) {
                this.unusedAmortizationInvoiceDiscount = unusedAmortizationInvoiceDiscount;
                return this;
            }

            /**
             * UnusedAmortizationPretaxAmount.
             */
            public Builder unusedAmortizationPretaxAmount(Double unusedAmortizationPretaxAmount) {
                this.unusedAmortizationPretaxAmount = unusedAmortizationPretaxAmount;
                return this;
            }

            /**
             * UnusedAmortizationPretaxGrossAmount.
             */
            public Builder unusedAmortizationPretaxGrossAmount(Double unusedAmortizationPretaxGrossAmount) {
                this.unusedAmortizationPretaxGrossAmount = unusedAmortizationPretaxGrossAmount;
                return this;
            }

            /**
             * UnusedAmortizationRoundDownDiscount.
             */
            public Builder unusedAmortizationRoundDownDiscount(Double unusedAmortizationRoundDownDiscount) {
                this.unusedAmortizationRoundDownDiscount = unusedAmortizationRoundDownDiscount;
                return this;
            }

            /**
             * Zone.
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
        @NameInMap("AccountID")
        private String accountID;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
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
             * AccountID.
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
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
