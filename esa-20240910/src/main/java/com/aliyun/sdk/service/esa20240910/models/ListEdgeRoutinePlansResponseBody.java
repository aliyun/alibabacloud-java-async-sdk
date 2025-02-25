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
 * {@link ListEdgeRoutinePlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListEdgeRoutinePlansResponseBody</p>
 */
public class ListEdgeRoutinePlansResponseBody extends TeaModel {
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

    private ListEdgeRoutinePlansResponseBody(Builder builder) {
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

    public static ListEdgeRoutinePlansResponseBody create() {
        return builder().build();
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
         * <p>The number of entries per page. Valid values: 1 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The plans.</p>
         */
        public Builder planInfo(java.util.List<PlanInfo> planInfo) {
            this.planInfo = planInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListEdgeRoutinePlansResponseBody build() {
            return new ListEdgeRoutinePlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEdgeRoutinePlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListEdgeRoutinePlansResponseBody</p>
     */
    public static class PlanInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingMode")
        private String billingMode;

        @com.aliyun.core.annotation.NameInMap("ErRoutineCodeVersionQuota")
        private String erRoutineCodeVersionQuota;

        @com.aliyun.core.annotation.NameInMap("ErRoutineQuota")
        private String erRoutineQuota;

        @com.aliyun.core.annotation.NameInMap("ErRoutineRouteSiteCountQuota")
        private String erRoutineRouteSiteCountQuota;

        @com.aliyun.core.annotation.NameInMap("PaymentMethod")
        private String paymentMethod;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        private PlanInfo(Builder builder) {
            this.billingMode = builder.billingMode;
            this.erRoutineCodeVersionQuota = builder.erRoutineCodeVersionQuota;
            this.erRoutineQuota = builder.erRoutineQuota;
            this.erRoutineRouteSiteCountQuota = builder.erRoutineRouteSiteCountQuota;
            this.paymentMethod = builder.paymentMethod;
            this.planName = builder.planName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanInfo create() {
            return builder().build();
        }

        /**
         * @return billingMode
         */
        public String getBillingMode() {
            return this.billingMode;
        }

        /**
         * @return erRoutineCodeVersionQuota
         */
        public String getErRoutineCodeVersionQuota() {
            return this.erRoutineCodeVersionQuota;
        }

        /**
         * @return erRoutineQuota
         */
        public String getErRoutineQuota() {
            return this.erRoutineQuota;
        }

        /**
         * @return erRoutineRouteSiteCountQuota
         */
        public String getErRoutineRouteSiteCountQuota() {
            return this.erRoutineRouteSiteCountQuota;
        }

        /**
         * @return paymentMethod
         */
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        public static final class Builder {
            private String billingMode; 
            private String erRoutineCodeVersionQuota; 
            private String erRoutineQuota; 
            private String erRoutineRouteSiteCountQuota; 
            private String paymentMethod; 
            private String planName; 

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li>PREPAY: subscription.</li>
             * <li>POSTPAY: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * <p>The maximum number of versions that each routine supports.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder erRoutineCodeVersionQuota(String erRoutineCodeVersionQuota) {
                this.erRoutineCodeVersionQuota = erRoutineCodeVersionQuota;
                return this;
            }

            /**
             * <p>The maximum of routines that can be created.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder erRoutineQuota(String erRoutineQuota) {
                this.erRoutineQuota = erRoutineQuota;
                return this;
            }

            /**
             * <p>The maximum number of websites with which each routine can be associated.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder erRoutineRouteSiteCountQuota(String erRoutineRouteSiteCountQuota) {
                this.erRoutineRouteSiteCountQuota = erRoutineRouteSiteCountQuota;
                return this;
            }

            /**
             * <p>The payment method. Valid values:</p>
             * <ul>
             * <li>er_free</li>
             * <li>er_pay</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>er_free</p>
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            /**
             * <p>The plan name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_plan</p>
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            public PlanInfo build() {
                return new PlanInfo(this);
            } 

        } 

    }
}
