// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstancePlansResponseBody model) {
            this.errorMessage = model.errorMessage;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.status = model.status;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The error message.</p>
         * <p>This parameter is returned only if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34b32a0a-08ef-4a87-b6be-cdd988888888</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <p>If the request was successful, <strong>success</strong> is returned. If the request failed, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancePlansResponseBody build() {
            return new DescribeDBInstancePlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancePlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancePlansResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PlanList model) {
                this.DBInstanceId = model.DBInstanceId;
                this.planConfig = model.planConfig;
                this.planDesc = model.planDesc;
                this.planEndDate = model.planEndDate;
                this.planId = model.planId;
                this.planName = model.planName;
                this.planScheduleType = model.planScheduleType;
                this.planStartDate = model.planStartDate;
                this.planStatus = model.planStatus;
                this.planType = model.planType;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * PlanConfig.
             */
            public Builder planConfig(String planConfig) {
                this.planConfig = planConfig;
                return this;
            }

            /**
             * PlanDesc.
             */
            public Builder planDesc(String planDesc) {
                this.planDesc = planDesc;
                return this;
            }

            /**
             * PlanEndDate.
             */
            public Builder planEndDate(String planEndDate) {
                this.planEndDate = planEndDate;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
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
             * PlanScheduleType.
             */
            public Builder planScheduleType(String planScheduleType) {
                this.planScheduleType = planScheduleType;
                return this;
            }

            /**
             * PlanStartDate.
             */
            public Builder planStartDate(String planStartDate) {
                this.planStartDate = planStartDate;
                return this;
            }

            /**
             * PlanStatus.
             */
            public Builder planStatus(String planStatus) {
                this.planStatus = planStatus;
                return this;
            }

            /**
             * PlanType.
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
    /**
     * 
     * {@link DescribeDBInstancePlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancePlansResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PlanList")
        private java.util.List<PlanList> planList;

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
        public java.util.List<PlanList> getPlanList() {
            return this.planList;
        }

        public static final class Builder {
            private java.util.List<PlanList> planList; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.planList = model.planList;
            } 

            /**
             * PlanList.
             */
            public Builder planList(java.util.List<PlanList> planList) {
                this.planList = planList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
