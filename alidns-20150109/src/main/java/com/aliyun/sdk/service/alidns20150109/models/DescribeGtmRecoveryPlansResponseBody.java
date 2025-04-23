// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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

        private Builder() {
        } 

        private Builder(DescribeGtmRecoveryPlansResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.recoveryPlans = model.recoveryPlans;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The details about the queried disaster recovery plans.</p>
         */
        public Builder recoveryPlans(RecoveryPlans recoveryPlans) {
            this.recoveryPlans = recoveryPlans;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2BA072CF-CA21-4A34-B6C2-227BE2C58079</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmRecoveryPlansResponseBody build() {
            return new DescribeGtmRecoveryPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmRecoveryPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlansResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RecoveryPlan model) {
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.faultAddrPoolNum = model.faultAddrPoolNum;
                this.lastExecuteTime = model.lastExecuteTime;
                this.lastExecuteTimestamp = model.lastExecuteTimestamp;
                this.lastRollbackTime = model.lastRollbackTime;
                this.lastRollbackTimestamp = model.lastRollbackTimestamp;
                this.name = model.name;
                this.recoveryPlanId = model.recoveryPlanId;
                this.remark = model.remark;
                this.status = model.status;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>The time when the disaster recovery plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-11T06:45Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates when the disaster recovery plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1565499867000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The number of faulty address pools.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder faultAddrPoolNum(Integer faultAddrPoolNum) {
                this.faultAddrPoolNum = faultAddrPoolNum;
                return this;
            }

            /**
             * <p>The last time when the disaster recovery plan was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-11T06:44Z</p>
             */
            public Builder lastExecuteTime(String lastExecuteTime) {
                this.lastExecuteTime = lastExecuteTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates the last time when the disaster recovery plan was executed.</p>
             * 
             * <strong>example:</strong>
             * <p>1565505898000</p>
             */
            public Builder lastExecuteTimestamp(Long lastExecuteTimestamp) {
                this.lastExecuteTimestamp = lastExecuteTimestamp;
                return this;
            }

            /**
             * <p>The last time when the disaster recovery plan was rolled back.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-11T06:45Z</p>
             */
            public Builder lastRollbackTime(String lastRollbackTime) {
                this.lastRollbackTime = lastRollbackTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates the last time when the disaster recovery plan was rolled back.</p>
             * 
             * <strong>example:</strong>
             * <p>1565505919000</p>
             */
            public Builder lastRollbackTimestamp(Long lastRollbackTimestamp) {
                this.lastRollbackTimestamp = lastRollbackTimestamp;
                return this;
            }

            /**
             * <p>The name of the disaster recovery plan.</p>
             * 
             * <strong>example:</strong>
             * <p>name-example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the disaster recovery plan.</p>
             * 
             * <strong>example:</strong>
             * <p>55</p>
             */
            public Builder recoveryPlanId(Long recoveryPlanId) {
                this.recoveryPlanId = recoveryPlanId;
                return this;
            }

            /**
             * <p>The remarks about the disaster recovery plan.</p>
             * 
             * <strong>example:</strong>
             * <p>remark-example</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the disaster recovery plan. Valid values:</p>
             * <ul>
             * <li><strong>UNEXECUTED</strong>: The plan is not executed.</li>
             * <li><strong>EXECUTED</strong>: The plan is executed.</li>
             * <li><strong>ROLLED_BACK</strong>: The plan is rolled back.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UNEXECUTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last time when the disaster recovery plan was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-11T06:45Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates the last time when the disaster recovery plan was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1565505919000</p>
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
    /**
     * 
     * {@link DescribeGtmRecoveryPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmRecoveryPlansResponseBody</p>
     */
    public static class RecoveryPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecoveryPlan")
        private java.util.List<RecoveryPlan> recoveryPlan;

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
        public java.util.List<RecoveryPlan> getRecoveryPlan() {
            return this.recoveryPlan;
        }

        public static final class Builder {
            private java.util.List<RecoveryPlan> recoveryPlan; 

            private Builder() {
            } 

            private Builder(RecoveryPlans model) {
                this.recoveryPlan = model.recoveryPlan;
            } 

            /**
             * RecoveryPlan.
             */
            public Builder recoveryPlan(java.util.List<RecoveryPlan> recoveryPlan) {
                this.recoveryPlan = recoveryPlan;
                return this;
            }

            public RecoveryPlans build() {
                return new RecoveryPlans(this);
            } 

        } 

    }
}
