// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryMonthlyBillInfoLeafNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonthlyBillInfoLeafNewResponseBody</p>
 */
public class QueryMonthlyBillInfoLeafNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CouponPayment")
    private String couponPayment;

    @com.aliyun.core.annotation.NameInMap("IsSeparatedPrice")
    private Boolean isSeparatedPrice;

    @com.aliyun.core.annotation.NameInMap("LayeredBillDOList")
    private java.util.List<LayeredBillDOList> layeredBillDOList;

    @com.aliyun.core.annotation.NameInMap("PackageAmount")
    private String packageAmount;

    @com.aliyun.core.annotation.NameInMap("RealPayment")
    private String realPayment;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPayment")
    private String totalPayment;

    private QueryMonthlyBillInfoLeafNewResponseBody(Builder builder) {
        this.couponPayment = builder.couponPayment;
        this.isSeparatedPrice = builder.isSeparatedPrice;
        this.layeredBillDOList = builder.layeredBillDOList;
        this.packageAmount = builder.packageAmount;
        this.realPayment = builder.realPayment;
        this.requestId = builder.requestId;
        this.totalPayment = builder.totalPayment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthlyBillInfoLeafNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return couponPayment
     */
    public String getCouponPayment() {
        return this.couponPayment;
    }

    /**
     * @return isSeparatedPrice
     */
    public Boolean getIsSeparatedPrice() {
        return this.isSeparatedPrice;
    }

    /**
     * @return layeredBillDOList
     */
    public java.util.List<LayeredBillDOList> getLayeredBillDOList() {
        return this.layeredBillDOList;
    }

    /**
     * @return packageAmount
     */
    public String getPackageAmount() {
        return this.packageAmount;
    }

    /**
     * @return realPayment
     */
    public String getRealPayment() {
        return this.realPayment;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPayment
     */
    public String getTotalPayment() {
        return this.totalPayment;
    }

    public static final class Builder {
        private String couponPayment; 
        private Boolean isSeparatedPrice; 
        private java.util.List<LayeredBillDOList> layeredBillDOList; 
        private String packageAmount; 
        private String realPayment; 
        private String requestId; 
        private String totalPayment; 

        private Builder() {
        } 

        private Builder(QueryMonthlyBillInfoLeafNewResponseBody model) {
            this.couponPayment = model.couponPayment;
            this.isSeparatedPrice = model.isSeparatedPrice;
            this.layeredBillDOList = model.layeredBillDOList;
            this.packageAmount = model.packageAmount;
            this.realPayment = model.realPayment;
            this.requestId = model.requestId;
            this.totalPayment = model.totalPayment;
        } 

        /**
         * CouponPayment.
         */
        public Builder couponPayment(String couponPayment) {
            this.couponPayment = couponPayment;
            return this;
        }

        /**
         * IsSeparatedPrice.
         */
        public Builder isSeparatedPrice(Boolean isSeparatedPrice) {
            this.isSeparatedPrice = isSeparatedPrice;
            return this;
        }

        /**
         * LayeredBillDOList.
         */
        public Builder layeredBillDOList(java.util.List<LayeredBillDOList> layeredBillDOList) {
            this.layeredBillDOList = layeredBillDOList;
            return this;
        }

        /**
         * PackageAmount.
         */
        public Builder packageAmount(String packageAmount) {
            this.packageAmount = packageAmount;
            return this;
        }

        /**
         * RealPayment.
         */
        public Builder realPayment(String realPayment) {
            this.realPayment = realPayment;
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
         * TotalPayment.
         */
        public Builder totalPayment(String totalPayment) {
            this.totalPayment = totalPayment;
            return this;
        }

        public QueryMonthlyBillInfoLeafNewResponseBody build() {
            return new QueryMonthlyBillInfoLeafNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMonthlyBillInfoLeafNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonthlyBillInfoLeafNewResponseBody</p>
     */
    public static class SubjectDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddCount")
        private Long addCount;

        @com.aliyun.core.annotation.NameInMap("AddUnit")
        private String addUnit;

        @com.aliyun.core.annotation.NameInMap("BillAmount")
        private String billAmount;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PackageBill")
        private String packageBill;

        @com.aliyun.core.annotation.NameInMap("SinglePrice")
        private String singlePrice;

        @com.aliyun.core.annotation.NameInMap("SubjectItemId")
        private String subjectItemId;

        @com.aliyun.core.annotation.NameInMap("SubjectName")
        private String subjectName;

        private SubjectDetailList(Builder builder) {
            this.addCount = builder.addCount;
            this.addUnit = builder.addUnit;
            this.billAmount = builder.billAmount;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.operator = builder.operator;
            this.packageBill = builder.packageBill;
            this.singlePrice = builder.singlePrice;
            this.subjectItemId = builder.subjectItemId;
            this.subjectName = builder.subjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectDetailList create() {
            return builder().build();
        }

        /**
         * @return addCount
         */
        public Long getAddCount() {
            return this.addCount;
        }

        /**
         * @return addUnit
         */
        public String getAddUnit() {
            return this.addUnit;
        }

        /**
         * @return billAmount
         */
        public String getBillAmount() {
            return this.billAmount;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return packageBill
         */
        public String getPackageBill() {
            return this.packageBill;
        }

        /**
         * @return singlePrice
         */
        public String getSinglePrice() {
            return this.singlePrice;
        }

        /**
         * @return subjectItemId
         */
        public String getSubjectItemId() {
            return this.subjectItemId;
        }

        /**
         * @return subjectName
         */
        public String getSubjectName() {
            return this.subjectName;
        }

        public static final class Builder {
            private Long addCount; 
            private String addUnit; 
            private String billAmount; 
            private String itemId; 
            private String itemName; 
            private String operator; 
            private String packageBill; 
            private String singlePrice; 
            private String subjectItemId; 
            private String subjectName; 

            private Builder() {
            } 

            private Builder(SubjectDetailList model) {
                this.addCount = model.addCount;
                this.addUnit = model.addUnit;
                this.billAmount = model.billAmount;
                this.itemId = model.itemId;
                this.itemName = model.itemName;
                this.operator = model.operator;
                this.packageBill = model.packageBill;
                this.singlePrice = model.singlePrice;
                this.subjectItemId = model.subjectItemId;
                this.subjectName = model.subjectName;
            } 

            /**
             * AddCount.
             */
            public Builder addCount(Long addCount) {
                this.addCount = addCount;
                return this;
            }

            /**
             * AddUnit.
             */
            public Builder addUnit(String addUnit) {
                this.addUnit = addUnit;
                return this;
            }

            /**
             * BillAmount.
             */
            public Builder billAmount(String billAmount) {
                this.billAmount = billAmount;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * PackageBill.
             */
            public Builder packageBill(String packageBill) {
                this.packageBill = packageBill;
                return this;
            }

            /**
             * SinglePrice.
             */
            public Builder singlePrice(String singlePrice) {
                this.singlePrice = singlePrice;
                return this;
            }

            /**
             * SubjectItemId.
             */
            public Builder subjectItemId(String subjectItemId) {
                this.subjectItemId = subjectItemId;
                return this;
            }

            /**
             * SubjectName.
             */
            public Builder subjectName(String subjectName) {
                this.subjectName = subjectName;
                return this;
            }

            public SubjectDetailList build() {
                return new SubjectDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMonthlyBillInfoLeafNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonthlyBillInfoLeafNewResponseBody</p>
     */
    public static class LayeredBillDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddCount")
        private Long addCount;

        @com.aliyun.core.annotation.NameInMap("AddUnit")
        private String addUnit;

        @com.aliyun.core.annotation.NameInMap("BillAmount")
        private String billAmount;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PackageBill")
        private String packageBill;

        @com.aliyun.core.annotation.NameInMap("SinglePrice")
        private String singlePrice;

        @com.aliyun.core.annotation.NameInMap("SubjectDetailList")
        private java.util.List<SubjectDetailList> subjectDetailList;

        @com.aliyun.core.annotation.NameInMap("SubjectItemId")
        private String subjectItemId;

        @com.aliyun.core.annotation.NameInMap("SubjectName")
        private String subjectName;

        private LayeredBillDOList(Builder builder) {
            this.addCount = builder.addCount;
            this.addUnit = builder.addUnit;
            this.billAmount = builder.billAmount;
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.operator = builder.operator;
            this.packageBill = builder.packageBill;
            this.singlePrice = builder.singlePrice;
            this.subjectDetailList = builder.subjectDetailList;
            this.subjectItemId = builder.subjectItemId;
            this.subjectName = builder.subjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LayeredBillDOList create() {
            return builder().build();
        }

        /**
         * @return addCount
         */
        public Long getAddCount() {
            return this.addCount;
        }

        /**
         * @return addUnit
         */
        public String getAddUnit() {
            return this.addUnit;
        }

        /**
         * @return billAmount
         */
        public String getBillAmount() {
            return this.billAmount;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return packageBill
         */
        public String getPackageBill() {
            return this.packageBill;
        }

        /**
         * @return singlePrice
         */
        public String getSinglePrice() {
            return this.singlePrice;
        }

        /**
         * @return subjectDetailList
         */
        public java.util.List<SubjectDetailList> getSubjectDetailList() {
            return this.subjectDetailList;
        }

        /**
         * @return subjectItemId
         */
        public String getSubjectItemId() {
            return this.subjectItemId;
        }

        /**
         * @return subjectName
         */
        public String getSubjectName() {
            return this.subjectName;
        }

        public static final class Builder {
            private Long addCount; 
            private String addUnit; 
            private String billAmount; 
            private String itemId; 
            private String itemName; 
            private String operator; 
            private String packageBill; 
            private String singlePrice; 
            private java.util.List<SubjectDetailList> subjectDetailList; 
            private String subjectItemId; 
            private String subjectName; 

            private Builder() {
            } 

            private Builder(LayeredBillDOList model) {
                this.addCount = model.addCount;
                this.addUnit = model.addUnit;
                this.billAmount = model.billAmount;
                this.itemId = model.itemId;
                this.itemName = model.itemName;
                this.operator = model.operator;
                this.packageBill = model.packageBill;
                this.singlePrice = model.singlePrice;
                this.subjectDetailList = model.subjectDetailList;
                this.subjectItemId = model.subjectItemId;
                this.subjectName = model.subjectName;
            } 

            /**
             * AddCount.
             */
            public Builder addCount(Long addCount) {
                this.addCount = addCount;
                return this;
            }

            /**
             * AddUnit.
             */
            public Builder addUnit(String addUnit) {
                this.addUnit = addUnit;
                return this;
            }

            /**
             * BillAmount.
             */
            public Builder billAmount(String billAmount) {
                this.billAmount = billAmount;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * PackageBill.
             */
            public Builder packageBill(String packageBill) {
                this.packageBill = packageBill;
                return this;
            }

            /**
             * SinglePrice.
             */
            public Builder singlePrice(String singlePrice) {
                this.singlePrice = singlePrice;
                return this;
            }

            /**
             * SubjectDetailList.
             */
            public Builder subjectDetailList(java.util.List<SubjectDetailList> subjectDetailList) {
                this.subjectDetailList = subjectDetailList;
                return this;
            }

            /**
             * SubjectItemId.
             */
            public Builder subjectItemId(String subjectItemId) {
                this.subjectItemId = subjectItemId;
                return this;
            }

            /**
             * SubjectName.
             */
            public Builder subjectName(String subjectName) {
                this.subjectName = subjectName;
                return this;
            }

            public LayeredBillDOList build() {
                return new LayeredBillDOList(this);
            } 

        } 

    }
}
