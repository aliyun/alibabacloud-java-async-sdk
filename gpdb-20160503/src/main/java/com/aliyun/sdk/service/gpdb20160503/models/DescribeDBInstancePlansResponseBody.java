// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancePlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePlansResponseBody</p>
 */
public class DescribeDBInstancePlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBInstancePlansResponseBody(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancePlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String errorMessage; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String status; 
        private Integer totalRecordCount; 

        /**
         * The error message.
         * <p>
         * 
         * This parameter is returned only if the request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         * <p>
         * 
         * If the request was successful, **success** is returned. If the request failed, this parameter is not returned.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancePlansResponseBody build() {
            return new DescribeDBInstancePlansResponseBody(this);
        } 

    } 

    public static class PlanList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("PlanConfig")
        private String planConfig;

        @com.aliyun.core.annotation.NameInMap("PlanDesc")
        private String planDesc;

        @com.aliyun.core.annotation.NameInMap("PlanEndDate")
        private String planEndDate;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("PlanName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("PlanScheduleType")
        private String planScheduleType;

        @com.aliyun.core.annotation.NameInMap("PlanStartDate")
        private String planStartDate;

        @com.aliyun.core.annotation.NameInMap("PlanStatus")
        private String planStatus;

        @com.aliyun.core.annotation.NameInMap("PlanType")
        private String planType;

        private PlanList(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.planConfig = builder.planConfig;
            this.planDesc = builder.planDesc;
            this.planEndDate = builder.planEndDate;
            this.planId = builder.planId;
            this.planName = builder.planName;
            this.planScheduleType = builder.planScheduleType;
            this.planStartDate = builder.planStartDate;
            this.planStatus = builder.planStatus;
            this.planType = builder.planType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanList create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return planConfig
         */
        public String getPlanConfig() {
            return this.planConfig;
        }

        /**
         * @return planDesc
         */
        public String getPlanDesc() {
            return this.planDesc;
        }

        /**
         * @return planEndDate
         */
        public String getPlanEndDate() {
            return this.planEndDate;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return planScheduleType
         */
        public String getPlanScheduleType() {
            return this.planScheduleType;
        }

        /**
         * @return planStartDate
         */
        public String getPlanStartDate() {
            return this.planStartDate;
        }

        /**
         * @return planStatus
         */
        public String getPlanStatus() {
            return this.planStatus;
        }

        /**
         * @return planType
         */
        public String getPlanType() {
            return this.planType;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String planConfig; 
            private String planDesc; 
            private String planEndDate; 
            private String planId; 
            private String planName; 
            private String planScheduleType; 
            private String planStartDate; 
            private String planStatus; 
            private String planType; 

            /**
             * The ID of the instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The execution information of the plan.
             */
            public Builder planConfig(String planConfig) {
                this.planConfig = planConfig;
                return this;
            }

            /**
             * The description of the plan.
             */
            public Builder planDesc(String planDesc) {
                this.planDesc = planDesc;
                return this;
            }

            /**
             * The end time of the plan. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             * <p>
             * 
             * >  This parameter is returned only for periodically executed plans.
             */
            public Builder planEndDate(String planEndDate) {
                this.planEndDate = planEndDate;
                return this;
            }

            /**
             * The ID of the plan.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * The name of the plan.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * The execution mode of the plan. Valid values:
             * <p>
             * 
             * *   **Postpone**: The plan is executed later.
             * *   **Regular**: The plan is executed periodically.
             */
            public Builder planScheduleType(String planScheduleType) {
                this.planScheduleType = planScheduleType;
                return this;
            }

            /**
             * The start time of the plan. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.
             * <p>
             * 
             * >  This parameter is returned only for periodically executed plans.
             */
            public Builder planStartDate(String planStartDate) {
                this.planStartDate = planStartDate;
                return this;
            }

            /**
             * The state of the plan. Valid values:
             * <p>
             * 
             * *   **active**: The plan is running.
             * *   **cancel**: The plan is canceled.
             * *   **deleted**: The plan is deleted.
             * *   **finished**: The plan execution is complete.
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
                return this;
            }

            /**
             * The type of the plan. Valid values:
             * <p>
             * 
             * *   **PauseResume**: pauses and resumes an instance.
             * *   **Resize**: scales an instance.
             */
            public Builder planType(String planType) {
                this.planType = planType;
                return this;
            }

            public PlanList build() {
                return new PlanList(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PlanList")
        private java.util.List < PlanList> planList;

        private Items(Builder builder) {
            this.planList = builder.planList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return planList
         */
        public java.util.List < PlanList> getPlanList() {
            return this.planList;
        }

        public static final class Builder {
            private java.util.List < PlanList> planList; 

            /**
             * PlanList.
             */
            public Builder planList(java.util.List < PlanList> planList) {
                this.planList = planList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
