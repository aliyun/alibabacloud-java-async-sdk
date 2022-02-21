// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmRecoveryPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlansResponseBody</p>
 */
public class DescribeGtmRecoveryPlansResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RecoveryPlans")
    private RecoveryPlans recoveryPlans;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeGtmRecoveryPlansResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.recoveryPlans = builder.recoveryPlans;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmRecoveryPlansResponseBody create() {
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
     * @return recoveryPlans
     */
    public RecoveryPlans getRecoveryPlans() {
        return this.recoveryPlans;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private RecoveryPlans recoveryPlans; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

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
         * RecoveryPlans.
         */
        public Builder recoveryPlans(RecoveryPlans recoveryPlans) {
            this.recoveryPlans = recoveryPlans;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmRecoveryPlansResponseBody build() {
            return new DescribeGtmRecoveryPlansResponseBody(this);
        } 

    } 

    public static class RecoveryPlan extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("FaultAddrPoolNum")
        private Integer faultAddrPoolNum;

        @NameInMap("LastExecuteTime")
        private String lastExecuteTime;

        @NameInMap("LastExecuteTimestamp")
        private Long lastExecuteTimestamp;

        @NameInMap("LastRollbackTime")
        private String lastRollbackTime;

        @NameInMap("LastRollbackTimestamp")
        private Long lastRollbackTimestamp;

        @NameInMap("Name")
        private String name;

        @NameInMap("RecoveryPlanId")
        private Long recoveryPlanId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private RecoveryPlan(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.faultAddrPoolNum = builder.faultAddrPoolNum;
            this.lastExecuteTime = builder.lastExecuteTime;
            this.lastExecuteTimestamp = builder.lastExecuteTimestamp;
            this.lastRollbackTime = builder.lastRollbackTime;
            this.lastRollbackTimestamp = builder.lastRollbackTimestamp;
            this.name = builder.name;
            this.recoveryPlanId = builder.recoveryPlanId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecoveryPlan create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return faultAddrPoolNum
         */
        public Integer getFaultAddrPoolNum() {
            return this.faultAddrPoolNum;
        }

        /**
         * @return lastExecuteTime
         */
        public String getLastExecuteTime() {
            return this.lastExecuteTime;
        }

        /**
         * @return lastExecuteTimestamp
         */
        public Long getLastExecuteTimestamp() {
            return this.lastExecuteTimestamp;
        }

        /**
         * @return lastRollbackTime
         */
        public String getLastRollbackTime() {
            return this.lastRollbackTime;
        }

        /**
         * @return lastRollbackTimestamp
         */
        public Long getLastRollbackTimestamp() {
            return this.lastRollbackTimestamp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recoveryPlanId
         */
        public Long getRecoveryPlanId() {
            return this.recoveryPlanId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private Integer faultAddrPoolNum; 
            private String lastExecuteTime; 
            private Long lastExecuteTimestamp; 
            private String lastRollbackTime; 
            private Long lastRollbackTimestamp; 
            private String name; 
            private Long recoveryPlanId; 
            private String remark; 
            private String status; 
            private String updateTime; 
            private Long updateTimestamp; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * FaultAddrPoolNum.
             */
            public Builder faultAddrPoolNum(Integer faultAddrPoolNum) {
                this.faultAddrPoolNum = faultAddrPoolNum;
                return this;
            }

            /**
             * LastExecuteTime.
             */
            public Builder lastExecuteTime(String lastExecuteTime) {
                this.lastExecuteTime = lastExecuteTime;
                return this;
            }

            /**
             * LastExecuteTimestamp.
             */
            public Builder lastExecuteTimestamp(Long lastExecuteTimestamp) {
                this.lastExecuteTimestamp = lastExecuteTimestamp;
                return this;
            }

            /**
             * LastRollbackTime.
             */
            public Builder lastRollbackTime(String lastRollbackTime) {
                this.lastRollbackTime = lastRollbackTime;
                return this;
            }

            /**
             * LastRollbackTimestamp.
             */
            public Builder lastRollbackTimestamp(Long lastRollbackTimestamp) {
                this.lastRollbackTimestamp = lastRollbackTimestamp;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RecoveryPlanId.
             */
            public Builder recoveryPlanId(Long recoveryPlanId) {
                this.recoveryPlanId = recoveryPlanId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public RecoveryPlan build() {
                return new RecoveryPlan(this);
            } 

        } 

    }
    public static class RecoveryPlans extends TeaModel {
        @NameInMap("RecoveryPlan")
        private java.util.List < RecoveryPlan> recoveryPlan;

        private RecoveryPlans(Builder builder) {
            this.recoveryPlan = builder.recoveryPlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecoveryPlans create() {
            return builder().build();
        }

        /**
         * @return recoveryPlan
         */
        public java.util.List < RecoveryPlan> getRecoveryPlan() {
            return this.recoveryPlan;
        }

        public static final class Builder {
            private java.util.List < RecoveryPlan> recoveryPlan; 

            /**
             * RecoveryPlan.
             */
            public Builder recoveryPlan(java.util.List < RecoveryPlan> recoveryPlan) {
                this.recoveryPlan = recoveryPlan;
                return this;
            }

            public RecoveryPlans build() {
                return new RecoveryPlans(this);
            } 

        } 

    }
}
