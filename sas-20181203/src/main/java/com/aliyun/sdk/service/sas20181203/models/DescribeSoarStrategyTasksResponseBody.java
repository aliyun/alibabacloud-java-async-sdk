// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarStrategyTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarStrategyTasksResponseBody</p>
 */
public class DescribeSoarStrategyTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SoarStrategyTasks")
    private java.util.List < SoarStrategyTasks> soarStrategyTasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSoarStrategyTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.soarStrategyTasks = builder.soarStrategyTasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyTasksResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return soarStrategyTasks
     */
    public java.util.List < SoarStrategyTasks> getSoarStrategyTasks() {
        return this.soarStrategyTasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < SoarStrategyTasks> soarStrategyTasks; 
        private Integer totalCount; 

        /**
         * The page number. Pages start from page 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The policy tasks.
         */
        public Builder soarStrategyTasks(java.util.List < SoarStrategyTasks> soarStrategyTasks) {
            this.soarStrategyTasks = soarStrategyTasks;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSoarStrategyTasksResponseBody build() {
            return new DescribeSoarStrategyTasksResponseBody(this);
        } 

    } 

    public static class SoarStrategyTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedNum")
        private Integer failedNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtFinish")
        private Long gmtFinish;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RunMode")
        private String runMode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("SuccessNum")
        private Integer successNum;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        private SoarStrategyTasks(Builder builder) {
            this.failedNum = builder.failedNum;
            this.gmtCreate = builder.gmtCreate;
            this.gmtFinish = builder.gmtFinish;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.runMode = builder.runMode;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.successNum = builder.successNum;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoarStrategyTasks create() {
            return builder().build();
        }

        /**
         * @return failedNum
         */
        public Integer getFailedNum() {
            return this.failedNum;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtFinish
         */
        public Long getGmtFinish() {
            return this.gmtFinish;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runMode
         */
        public String getRunMode() {
            return this.runMode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return successNum
         */
        public Integer getSuccessNum() {
            return this.successNum;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer failedNum; 
            private Long gmtCreate; 
            private Long gmtFinish; 
            private Long gmtModified; 
            private Long id; 
            private String name; 
            private String runMode; 
            private String status; 
            private Long strategyId; 
            private Integer successNum; 
            private Integer totalNum; 

            /**
             * The number of execution failures.
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * The timestamp when the policy task was created. Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The timestamp when the policy task was complete. Unit: milliseconds.
             */
            public Builder gmtFinish(Long gmtFinish) {
                this.gmtFinish = gmtFinish;
                return this;
            }

            /**
             * The timestamp when the policy task was modified. Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the policy task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the policy task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The execution mode. Valid values:
             * <p>
             * 
             * *   runmode_TRIGGER_BY_USER: manually executed
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * The status of the policy task. Valid values:
             * <p>
             * 
             * *   \-1: waiting
             * *   0: starting
             * *   1: running
             * *   2: finished
             * *   3: schedule
             * *   4: pause
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The number of successful executions.
             */
            public Builder successNum(Integer successNum) {
                this.successNum = successNum;
                return this;
            }

            /**
             * The total number of executions.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public SoarStrategyTasks build() {
                return new SoarStrategyTasks(this);
            } 

        } 

    }
}
