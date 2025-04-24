// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DescribeCouponResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCouponResponseBody</p>
 */
public class DescribeCouponResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCouponResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCouponResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCouponResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCouponResponseBody build() {
            return new DescribeCouponResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCouponResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCouponResponseBody</p>
     */
    public static class ShareUidList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("UserNick")
        private String userNick;

        private ShareUidList(Builder builder) {
            this.uid = builder.uid;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShareUidList create() {
            return builder().build();
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String uid; 
            private String userNick; 

            private Builder() {
            } 

            private Builder(ShareUidList model) {
                this.uid = model.uid;
                this.userNick = model.userNick;
            } 

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * UserNick.
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public ShareUidList build() {
                return new ShareUidList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCouponResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCouponResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("CertainAmount")
        private String certainAmount;

        @com.aliyun.core.annotation.NameInMap("CouponId")
        private Long couponId;

        @com.aliyun.core.annotation.NameInMap("CouponNo")
        private String couponNo;

        @com.aliyun.core.annotation.NameInMap("CouponType")
        private String couponType;

        @com.aliyun.core.annotation.NameInMap("CouponTypeName")
        private String couponTypeName;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ItemNames")
        private java.util.List<String> itemNames;

        @com.aliyun.core.annotation.NameInMap("MoneyLimit")
        private String moneyLimit;

        @com.aliyun.core.annotation.NameInMap("OrderTimeRule")
        private String orderTimeRule;

        @com.aliyun.core.annotation.NameInMap("RemainAmount")
        private String remainAmount;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ShareUidList")
        private java.util.List<ShareUidList> shareUidList;

        @com.aliyun.core.annotation.NameInMap("ShowSetDeductTagButton")
        private Boolean showSetDeductTagButton;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SuitAccount")
        private String suitAccount;

        @com.aliyun.core.annotation.NameInMap("SuitItemType")
        private String suitItemType;

        @com.aliyun.core.annotation.NameInMap("UniversalType")
        private String universalType;

        @com.aliyun.core.annotation.NameInMap("YhOrderTypes")
        private java.util.List<String> yhOrderTypes;

        private Data(Builder builder) {
            this.amount = builder.amount;
            this.certainAmount = builder.certainAmount;
            this.couponId = builder.couponId;
            this.couponNo = builder.couponNo;
            this.couponType = builder.couponType;
            this.couponTypeName = builder.couponTypeName;
            this.currency = builder.currency;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.itemNames = builder.itemNames;
            this.moneyLimit = builder.moneyLimit;
            this.orderTimeRule = builder.orderTimeRule;
            this.remainAmount = builder.remainAmount;
            this.remark = builder.remark;
            this.shareUidList = builder.shareUidList;
            this.showSetDeductTagButton = builder.showSetDeductTagButton;
            this.site = builder.site;
            this.siteName = builder.siteName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.suitAccount = builder.suitAccount;
            this.suitItemType = builder.suitItemType;
            this.universalType = builder.universalType;
            this.yhOrderTypes = builder.yhOrderTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return certainAmount
         */
        public String getCertainAmount() {
            return this.certainAmount;
        }

        /**
         * @return couponId
         */
        public Long getCouponId() {
            return this.couponId;
        }

        /**
         * @return couponNo
         */
        public String getCouponNo() {
            return this.couponNo;
        }

        /**
         * @return couponType
         */
        public String getCouponType() {
            return this.couponType;
        }

        /**
         * @return couponTypeName
         */
        public String getCouponTypeName() {
            return this.couponTypeName;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return itemNames
         */
        public java.util.List<String> getItemNames() {
            return this.itemNames;
        }

        /**
         * @return moneyLimit
         */
        public String getMoneyLimit() {
            return this.moneyLimit;
        }

        /**
         * @return orderTimeRule
         */
        public String getOrderTimeRule() {
            return this.orderTimeRule;
        }

        /**
         * @return remainAmount
         */
        public String getRemainAmount() {
            return this.remainAmount;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return shareUidList
         */
        public java.util.List<ShareUidList> getShareUidList() {
            return this.shareUidList;
        }

        /**
         * @return showSetDeductTagButton
         */
        public Boolean getShowSetDeductTagButton() {
            return this.showSetDeductTagButton;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return suitAccount
         */
        public String getSuitAccount() {
            return this.suitAccount;
        }

        /**
         * @return suitItemType
         */
        public String getSuitItemType() {
            return this.suitItemType;
        }

        /**
         * @return universalType
         */
        public String getUniversalType() {
            return this.universalType;
        }

        /**
         * @return yhOrderTypes
         */
        public java.util.List<String> getYhOrderTypes() {
            return this.yhOrderTypes;
        }

        public static final class Builder {
            private String amount; 
            private String certainAmount; 
            private Long couponId; 
            private String couponNo; 
            private String couponType; 
            private String couponTypeName; 
            private String currency; 
            private String endTime; 
            private String gmtCreate; 
            private java.util.List<String> itemNames; 
            private String moneyLimit; 
            private String orderTimeRule; 
            private String remainAmount; 
            private String remark; 
            private java.util.List<ShareUidList> shareUidList; 
            private Boolean showSetDeductTagButton; 
            private String site; 
            private String siteName; 
            private String startTime; 
            private String status; 
            private String suitAccount; 
            private String suitItemType; 
            private String universalType; 
            private java.util.List<String> yhOrderTypes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.amount = model.amount;
                this.certainAmount = model.certainAmount;
                this.couponId = model.couponId;
                this.couponNo = model.couponNo;
                this.couponType = model.couponType;
                this.couponTypeName = model.couponTypeName;
                this.currency = model.currency;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.itemNames = model.itemNames;
                this.moneyLimit = model.moneyLimit;
                this.orderTimeRule = model.orderTimeRule;
                this.remainAmount = model.remainAmount;
                this.remark = model.remark;
                this.shareUidList = model.shareUidList;
                this.showSetDeductTagButton = model.showSetDeductTagButton;
                this.site = model.site;
                this.siteName = model.siteName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.suitAccount = model.suitAccount;
                this.suitItemType = model.suitItemType;
                this.universalType = model.universalType;
                this.yhOrderTypes = model.yhOrderTypes;
            } 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CertainAmount.
             */
            public Builder certainAmount(String certainAmount) {
                this.certainAmount = certainAmount;
                return this;
            }

            /**
             * CouponId.
             */
            public Builder couponId(Long couponId) {
                this.couponId = couponId;
                return this;
            }

            /**
             * CouponNo.
             */
            public Builder couponNo(String couponNo) {
                this.couponNo = couponNo;
                return this;
            }

            /**
             * CouponType.
             */
            public Builder couponType(String couponType) {
                this.couponType = couponType;
                return this;
            }

            /**
             * CouponTypeName.
             */
            public Builder couponTypeName(String couponTypeName) {
                this.couponTypeName = couponTypeName;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ItemNames.
             */
            public Builder itemNames(java.util.List<String> itemNames) {
                this.itemNames = itemNames;
                return this;
            }

            /**
             * MoneyLimit.
             */
            public Builder moneyLimit(String moneyLimit) {
                this.moneyLimit = moneyLimit;
                return this;
            }

            /**
             * OrderTimeRule.
             */
            public Builder orderTimeRule(String orderTimeRule) {
                this.orderTimeRule = orderTimeRule;
                return this;
            }

            /**
             * RemainAmount.
             */
            public Builder remainAmount(String remainAmount) {
                this.remainAmount = remainAmount;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ShareUidList.
             */
            public Builder shareUidList(java.util.List<ShareUidList> shareUidList) {
                this.shareUidList = shareUidList;
                return this;
            }

            /**
             * ShowSetDeductTagButton.
             */
            public Builder showSetDeductTagButton(Boolean showSetDeductTagButton) {
                this.showSetDeductTagButton = showSetDeductTagButton;
                return this;
            }

            /**
             * Site.
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * SiteName.
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SuitAccount.
             */
            public Builder suitAccount(String suitAccount) {
                this.suitAccount = suitAccount;
                return this;
            }

            /**
             * SuitItemType.
             */
            public Builder suitItemType(String suitItemType) {
                this.suitItemType = suitItemType;
                return this;
            }

            /**
             * UniversalType.
             */
            public Builder universalType(String universalType) {
                this.universalType = universalType;
                return this;
            }

            /**
             * YhOrderTypes.
             */
            public Builder yhOrderTypes(java.util.List<String> yhOrderTypes) {
                this.yhOrderTypes = yhOrderTypes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
