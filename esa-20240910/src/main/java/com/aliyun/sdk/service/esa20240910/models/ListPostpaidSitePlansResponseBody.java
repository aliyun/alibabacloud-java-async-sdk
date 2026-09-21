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
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size. Default value: 20. Maximum value: 500. Valid values: any integer from 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pay-as-you-go plan details.</p>
         */
        public Builder planInfo(java.util.List<PlanInfo> planInfo) {
            this.planInfo = planInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8CD541DB-CD83-5D0C-BE94-21B794074249</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
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
             * <p>The billable methods of the plan. Valid values:</p>
             * <ul>
             * <li>dps_month95: monthly 95th percentile billing method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dps_month95</p>
             */
            public Builder billingMethod(String billingMethod) {
                this.billingMethod = billingMethod;
                return this;
            }

            /**
             * <p>The payment type. Valid values:</p>
             * <ul>
             * <li>PREPAY: subscription.</li>
             * <li>POSTPAY: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * <p>The acceleration regions to which sites can be added under the plan. Multiple values are separated by commas (,). Valid values:</p>
             * <ul>
             * <li>domestic: the Chinese mainland.</li>
             * <li>overseas: global (excluding the Chinese mainland).</li>
             * <li>global: global (including the Chinese mainland).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder coverages(String coverages) {
                this.coverages = coverages;
                return this;
            }

            /**
             * <p>The name of the plan, which serves as a unique identifier in English.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * <p>The plan description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试版套餐</p>
             */
            public Builder planNameCn(String planNameCn) {
                this.planNameCn = planNameCn;
                return this;
            }

            /**
             * <p>The plan type of the plan instance. Valid values:</p>
             * <ul>
             * <li>normal: fixed edition plan.</li>
             * <li>enterprise: enterprise edition plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            /**
             * <p>The sale status of the plan. Valid values for enterprise edition plans:</p>
             * <ul>
             * <li>saled: sold.</li>
             * <li>upgrading: specification change in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>saled</p>
             */
            public Builder saleStatus(String saleStatus) {
                this.saleStatus = saleStatus;
                return this;
            }

            /**
             * <p>The site quantity quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
