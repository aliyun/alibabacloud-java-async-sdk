// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private java.util.List < PlanInfo> planInfo;

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
    public java.util.List < PlanInfo> getPlanInfo() {
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
        private java.util.List < PlanInfo> planInfo; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

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
        public Builder planInfo(java.util.List < PlanInfo> planInfo) {
            this.planInfo = planInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
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
             * BillingMode.
             */
            public Builder billingMode(String billingMode) {
                this.billingMode = billingMode;
                return this;
            }

            /**
             * ErRoutineCodeVersionQuota.
             */
            public Builder erRoutineCodeVersionQuota(String erRoutineCodeVersionQuota) {
                this.erRoutineCodeVersionQuota = erRoutineCodeVersionQuota;
                return this;
            }

            /**
             * ErRoutineQuota.
             */
            public Builder erRoutineQuota(String erRoutineQuota) {
                this.erRoutineQuota = erRoutineQuota;
                return this;
            }

            /**
             * ErRoutineRouteSiteCountQuota.
             */
            public Builder erRoutineRouteSiteCountQuota(String erRoutineRouteSiteCountQuota) {
                this.erRoutineRouteSiteCountQuota = erRoutineRouteSiteCountQuota;
                return this;
            }

            /**
             * PaymentMethod.
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            /**
             * PlanName.
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
