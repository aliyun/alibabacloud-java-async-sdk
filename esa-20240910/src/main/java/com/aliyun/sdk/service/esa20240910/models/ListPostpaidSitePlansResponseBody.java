// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListPostpaidSitePlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListPostpaidSitePlansResponseBody</p>
 */
public class ListPostpaidSitePlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PlanInfo")
    private java.util.List<PlanInfo> planInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListPostpaidSitePlansResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.planInfo = builder.planInfo;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPostpaidSitePlansResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return planInfo
     */
    public java.util.List<PlanInfo> getPlanInfo() {
        return this.planInfo;
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

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PlanInfo> planInfo; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListPostpaidSitePlansResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.planInfo = model.planInfo;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * PlanInfo.
         */
        public Builder planInfo(java.util.List<PlanInfo> planInfo) {
            this.planInfo = planInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
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

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListPostpaidSitePlansResponseBody build() {
            return new ListPostpaidSitePlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPostpaidSitePlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListPostpaidSitePlansResponseBody</p>
     */
    public static class PlanInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingMethod")
        private String billingMethod;

        @com.aliyun.core.annotation.NameInMap("BillingMode")
        private String billingMode;

        @com.aliyun.core.annotation.NameInMap("Coverages")
        private String coverages;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanNameCn")
        private String planNameCn;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        @com.aliyun.core.annotation.NameInMap("SaleStatus")
        private String saleStatus;

        @com.aliyun.core.annotation.NameInMap("SiteQuota")
        private String siteQuota;

        private PlanInfo(Builder builder) {
            this.billingMethod = builder.billingMethod;
            this.billingMode = builder.billingMode;
            this.coverages = builder.coverages;
            this.planName = builder.planName;
            this.planNameCn = builder.planNameCn;
            this.planType = builder.planType;
            this.saleStatus = builder.saleStatus;
            this.siteQuota = builder.siteQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanInfo create() {
            return builder().build();
        }

        /**
         * @return billingMethod
         */
        public String getBillingMethod() {
            return this.billingMethod;
        }

        /**
         * @return billingMode
         */
        public String getBillingMode() {
            return this.billingMode;
        }

        /**
         * @return coverages
         */
        public String getCoverages() {
            return this.coverages;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planNameCn
         */
        public String getPlanNameCn() {
            return this.planNameCn;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        /**
         * @return saleStatus
         */
        public String getSaleStatus() {
            return this.saleStatus;
        }

        /**
         * @return siteQuota
         */
        public String getSiteQuota() {
            return this.siteQuota;
        }

        public static final class Builder {
            private String billingMethod; 
            private String billingMode; 
            private String coverages; 
            private String planName; 
            private String planNameCn; 
            private String planType; 
            private String saleStatus; 
            private String siteQuota; 

            private Builder() {
            } 

            private Builder(PlanInfo model) {
                this.billingMethod = model.billingMethod;
                this.billingMode = model.billingMode;
                this.coverages = model.coverages;
                this.planName = model.planName;
                this.planNameCn = model.planNameCn;
                this.planType = model.planType;
                this.saleStatus = model.saleStatus;
                this.siteQuota = model.siteQuota;
            } 

            /**
             * BillingMethod.
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * BillingMode.
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * Coverages.
             */
            public Builder coverages(String coverages) {
                this.coverages = coverages;
                return this;
            }

            /**
             * PlanName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * PlanNameCn.
             */
            public Builder planNameCn(String planNameCn) {
                this.planNameCn = planNameCn;
                return this;
            }

            /**
             * PlanType.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * SaleStatus.
             */
            public Builder saleStatus(String saleStatus) {
                this.saleStatus = saleStatus;
                return this;
            }

            /**
             * SiteQuota.
             */
            public Builder siteQuota(String siteQuota) {
                this.siteQuota = siteQuota;
                return this;
            }

            public PlanInfo build() {
                return new PlanInfo(this);
            } 

        } 

    }
}
