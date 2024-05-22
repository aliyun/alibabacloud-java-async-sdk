// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmRecoveryPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmRecoveryPlansResponseBody</p>
 */
public class DescribeGtmRecoveryPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RecoveryPlans")
    private RecoveryPlans recoveryPlans;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The details about the queried disaster recovery plans.
         */
        public Builder recoveryPlans(RecoveryPlans recoveryPlans) {
            this.recoveryPlans = recoveryPlans;
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
         * The total number of entries returned.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
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
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("FaultAddrPoolNum")
        private Integer faultAddrPoolNum;

        @com.aliyun.core.annotation.NameInMap("LastExecuteTime")
        private String lastExecuteTime;

        @com.aliyun.core.annotation.NameInMap("LastExecuteTimestamp")
        private Long lastExecuteTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastRollbackTime")
        private String lastRollbackTime;

        @com.aliyun.core.annotation.NameInMap("LastRollbackTimestamp")
        private Long lastRollbackTimestamp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecoveryPlanId")
        private Long recoveryPlanId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
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
             * The time when the disaster recovery plan was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The UNIX timestamp that indicates when the disaster recovery plan was created.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The number of faulty address pools.
             */
            public Builder faultAddrPoolNum(Integer faultAddrPoolNum) {
                this.faultAddrPoolNum = faultAddrPoolNum;
                return this;
            }

            /**
             * The last time when the disaster recovery plan was executed.
             */
            public Builder lastExecuteTime(String lastExecuteTime) {
                this.lastExecuteTime = lastExecuteTime;
                return this;
            }

            /**
             * The UNIX timestamp that indicates the last time when the disaster recovery plan was executed.
             */
            public Builder lastExecuteTimestamp(Long lastExecuteTimestamp) {
                this.lastExecuteTimestamp = lastExecuteTimestamp;
                return this;
            }

            /**
             * The last time when the disaster recovery plan was rolled back.
             */
            public Builder lastRollbackTime(String lastRollbackTime) {
                this.lastRollbackTime = lastRollbackTime;
                return this;
            }

            /**
             * The UNIX timestamp that indicates the last time when the disaster recovery plan was rolled back.
             */
            public Builder lastRollbackTimestamp(Long lastRollbackTimestamp) {
                this.lastRollbackTimestamp = lastRollbackTimestamp;
                return this;
            }

            /**
             * The name of the disaster recovery plan.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the disaster recovery plan.
             */
            public Builder recoveryPlanId(Long recoveryPlanId) {
                this.recoveryPlanId = recoveryPlanId;
                return this;
            }

            /**
             * The remarks about the disaster recovery plan.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the disaster recovery plan. Valid values:
             * <p>
             * 
             * *   **UNEXECUTED**: The plan is not executed.
             * *   **EXECUTED**: The plan is executed.
             * *   **ROLLED_BACK**: The plan is rolled back.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The last time when the disaster recovery plan was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The UNIX timestamp that indicates the last time when the disaster recovery plan was updated.
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
        @com.aliyun.core.annotation.NameInMap("RecoveryPlan")
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
