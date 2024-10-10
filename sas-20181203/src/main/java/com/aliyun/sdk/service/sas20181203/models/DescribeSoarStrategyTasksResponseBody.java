// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number. Pages start from page 1.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The policy tasks.</p>
         */
        public Builder soarStrategyTasks(java.util.List < SoarStrategyTasks> soarStrategyTasks) {
            this.soarStrategyTasks = soarStrategyTasks;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSoarStrategyTasksResponseBody build() {
            return new DescribeSoarStrategyTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSoarStrategyTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarStrategyTasksResponseBody</p>
     */
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
             * <p>The number of execution failures.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder failedNum(Integer failedNum) {
                this.failedNum = failedNum;
                return this;
            }

            /**
             * <p>The timestamp when the policy task was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1708481235000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the policy task was complete. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1586739841000</p>
             */
            public Builder gmtFinish(Long gmtFinish) {
                this.gmtFinish = gmtFinish;
                return this;
            }

            /**
             * <p>The timestamp when the policy task was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1669869436000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the policy task.</p>
             * 
             * <strong>example:</strong>
             * <p>5374</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the policy task.</p>
             * 
             * <strong>example:</strong>
             * <p>strategy_name01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The execution mode. Valid values:</p>
             * <ul>
             * <li>runmode_TRIGGER_BY_USER: manually executed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>runmode_TRIGGER_BY_USER</p>
             */
            public Builder runMode(String runMode) {
                this.runMode = runMode;
                return this;
            }

            /**
             * <p>The status of the policy task. Valid values:</p>
             * <ul>
             * <li>-1: waiting</li>
             * <li>0: starting</li>
             * <li>1: running</li>
             * <li>2: finished</li>
             * <li>3: schedule</li>
             * <li>4: pause</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The number of successful executions.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder successNum(Integer successNum) {
                this.successNum = successNum;
                return this;
            }

            /**
             * <p>The total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
