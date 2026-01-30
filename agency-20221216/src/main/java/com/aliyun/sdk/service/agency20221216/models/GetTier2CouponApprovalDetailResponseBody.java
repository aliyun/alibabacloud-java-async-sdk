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
 * {@link GetTier2CouponApprovalDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetTier2CouponApprovalDetailResponseBody</p>
 */
public class GetTier2CouponApprovalDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTier2CouponApprovalDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTier2CouponApprovalDetailResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTier2CouponApprovalDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public GetTier2CouponApprovalDetailResponseBody build() {
            return new GetTier2CouponApprovalDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTier2CouponApprovalDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTier2CouponApprovalDetailResponseBody</p>
     */
    public static class ApplicantInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
        private String applicableProducts;

        @com.aliyun.core.annotation.NameInMap("ApplicationTime")
        private String applicationTime;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("T2PartnerName")
        private String t2PartnerName;

        @com.aliyun.core.annotation.NameInMap("T2PartnerUid")
        private Long t2PartnerUid;

        @com.aliyun.core.annotation.NameInMap("ValidUntil")
        private String validUntil;

        private ApplicantInfo(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.applicationTime = builder.applicationTime;
            this.orderType = builder.orderType;
            this.t2PartnerName = builder.t2PartnerName;
            this.t2PartnerUid = builder.t2PartnerUid;
            this.validUntil = builder.validUntil;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicantInfo create() {
            return builder().build();
        }

        /**
         * @return applicableProducts
         */
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        /**
         * @return applicationTime
         */
        public String getApplicationTime() {
            return this.applicationTime;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return t2PartnerName
         */
        public String getT2PartnerName() {
            return this.t2PartnerName;
        }

        /**
         * @return t2PartnerUid
         */
        public Long getT2PartnerUid() {
            return this.t2PartnerUid;
        }

        /**
         * @return validUntil
         */
        public String getValidUntil() {
            return this.validUntil;
        }

        public static final class Builder {
            private String applicableProducts; 
            private String applicationTime; 
            private String orderType; 
            private String t2PartnerName; 
            private Long t2PartnerUid; 
            private String validUntil; 

            private Builder() {
            } 

            private Builder(ApplicantInfo model) {
                this.applicableProducts = model.applicableProducts;
                this.applicationTime = model.applicationTime;
                this.orderType = model.orderType;
                this.t2PartnerName = model.t2PartnerName;
                this.t2PartnerUid = model.t2PartnerUid;
                this.validUntil = model.validUntil;
            } 

            /**
             * ApplicableProducts.
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * ApplicationTime.
             */
            public Builder applicationTime(String applicationTime) {
                this.applicationTime = applicationTime;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * T2PartnerName.
             */
            public Builder t2PartnerName(String t2PartnerName) {
                this.t2PartnerName = t2PartnerName;
                return this;
            }

            /**
             * T2PartnerUid.
             */
            public Builder t2PartnerUid(Long t2PartnerUid) {
                this.t2PartnerUid = t2PartnerUid;
                return this;
            }

            /**
             * ValidUntil.
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            public ApplicantInfo build() {
                return new ApplicantInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTier2CouponApprovalDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTier2CouponApprovalDetailResponseBody</p>
     */
    public static class CouponReceiptUidList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NominalValue")
        private String nominalValue;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private Long uid;

        private CouponReceiptUidList(Builder builder) {
            this.nominalValue = builder.nominalValue;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CouponReceiptUidList create() {
            return builder().build();
        }

        /**
         * @return nominalValue
         */
        public String getNominalValue() {
            return this.nominalValue;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String nominalValue; 
            private Long uid; 

            private Builder() {
            } 

            private Builder(CouponReceiptUidList model) {
                this.nominalValue = model.nominalValue;
                this.uid = model.uid;
            } 

            /**
             * NominalValue.
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public CouponReceiptUidList build() {
                return new CouponReceiptUidList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTier2CouponApprovalDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetTier2CouponApprovalDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicantInfo")
        private ApplicantInfo applicantInfo;

        @com.aliyun.core.annotation.NameInMap("ApplicationReason")
        private String applicationReason;

        @com.aliyun.core.annotation.NameInMap("ApplicationSheetId")
        private String applicationSheetId;

        @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
        private String approvalStatus;

        @com.aliyun.core.annotation.NameInMap("CouponReceiptUidList")
        private java.util.List<CouponReceiptUidList> couponReceiptUidList;

        @com.aliyun.core.annotation.NameInMap("RemainingQuota")
        private String remainingQuota;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private String totalAmount;

        private Data(Builder builder) {
            this.applicantInfo = builder.applicantInfo;
            this.applicationReason = builder.applicationReason;
            this.applicationSheetId = builder.applicationSheetId;
            this.approvalStatus = builder.approvalStatus;
            this.couponReceiptUidList = builder.couponReceiptUidList;
            this.remainingQuota = builder.remainingQuota;
            this.totalAmount = builder.totalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicantInfo
         */
        public ApplicantInfo getApplicantInfo() {
            return this.applicantInfo;
        }

        /**
         * @return applicationReason
         */
        public String getApplicationReason() {
            return this.applicationReason;
        }

        /**
         * @return applicationSheetId
         */
        public String getApplicationSheetId() {
            return this.applicationSheetId;
        }

        /**
         * @return approvalStatus
         */
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        /**
         * @return couponReceiptUidList
         */
        public java.util.List<CouponReceiptUidList> getCouponReceiptUidList() {
            return this.couponReceiptUidList;
        }

        /**
         * @return remainingQuota
         */
        public String getRemainingQuota() {
            return this.remainingQuota;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public static final class Builder {
            private ApplicantInfo applicantInfo; 
            private String applicationReason; 
            private String applicationSheetId; 
            private String approvalStatus; 
            private java.util.List<CouponReceiptUidList> couponReceiptUidList; 
            private String remainingQuota; 
            private String totalAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicantInfo = model.applicantInfo;
                this.applicationReason = model.applicationReason;
                this.applicationSheetId = model.applicationSheetId;
                this.approvalStatus = model.approvalStatus;
                this.couponReceiptUidList = model.couponReceiptUidList;
                this.remainingQuota = model.remainingQuota;
                this.totalAmount = model.totalAmount;
            } 

            /**
             * ApplicantInfo.
             */
            public Builder applicantInfo(ApplicantInfo applicantInfo) {
                this.applicantInfo = applicantInfo;
                return this;
            }

            /**
             * ApplicationReason.
             */
            public Builder applicationReason(String applicationReason) {
                this.applicationReason = applicationReason;
                return this;
            }

            /**
             * ApplicationSheetId.
             */
            public Builder applicationSheetId(String applicationSheetId) {
                this.applicationSheetId = applicationSheetId;
                return this;
            }

            /**
             * ApprovalStatus.
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * CouponReceiptUidList.
             */
            public Builder couponReceiptUidList(java.util.List<CouponReceiptUidList> couponReceiptUidList) {
                this.couponReceiptUidList = couponReceiptUidList;
                return this;
            }

            /**
             * RemainingQuota.
             */
            public Builder remainingQuota(String remainingQuota) {
                this.remainingQuota = remainingQuota;
                return this;
            }

            /**
             * TotalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
