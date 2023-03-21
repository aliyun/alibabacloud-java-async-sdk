// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCycleTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCycleTaskListResponseBody</p>
 */
public class DescribeCycleTaskListResponseBody extends TeaModel {
    @NameInMap("CycleScheduleResponseList")
    private java.util.List < CycleScheduleResponseList> cycleScheduleResponseList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCycleTaskListResponseBody(Builder builder) {
        this.cycleScheduleResponseList = builder.cycleScheduleResponseList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCycleTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return cycleScheduleResponseList
     */
    public java.util.List < CycleScheduleResponseList> getCycleScheduleResponseList() {
        return this.cycleScheduleResponseList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CycleScheduleResponseList> cycleScheduleResponseList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of periodic scan tasks.
         */
        public Builder cycleScheduleResponseList(java.util.List < CycleScheduleResponseList> cycleScheduleResponseList) {
            this.cycleScheduleResponseList = cycleScheduleResponseList;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCycleTaskListResponseBody build() {
            return new DescribeCycleTaskListResponseBody(this);
        } 

    } 

    public static class CycleScheduleResponseList extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("Enable")
        private Integer enable;

        @NameInMap("FirstDateStr")
        private Long firstDateStr;

        @NameInMap("IntervalPeriod")
        private Integer intervalPeriod;

        @NameInMap("LastTaskId")
        private String lastTaskId;

        @NameInMap("NextStartTimeStr")
        private Long nextStartTimeStr;

        @NameInMap("Param")
        private String param;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("TargetEndTime")
        private Integer targetEndTime;

        @NameInMap("TargetStartTime")
        private Integer targetStartTime;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskType")
        private String taskType;

        private CycleScheduleResponseList(Builder builder) {
            this.configId = builder.configId;
            this.enable = builder.enable;
            this.firstDateStr = builder.firstDateStr;
            this.intervalPeriod = builder.intervalPeriod;
            this.lastTaskId = builder.lastTaskId;
            this.nextStartTimeStr = builder.nextStartTimeStr;
            this.param = builder.param;
            this.periodUnit = builder.periodUnit;
            this.targetEndTime = builder.targetEndTime;
            this.targetStartTime = builder.targetStartTime;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleScheduleResponseList create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        /**
         * @return firstDateStr
         */
        public Long getFirstDateStr() {
            return this.firstDateStr;
        }

        /**
         * @return intervalPeriod
         */
        public Integer getIntervalPeriod() {
            return this.intervalPeriod;
        }

        /**
         * @return lastTaskId
         */
        public String getLastTaskId() {
            return this.lastTaskId;
        }

        /**
         * @return nextStartTimeStr
         */
        public Long getNextStartTimeStr() {
            return this.nextStartTimeStr;
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return targetEndTime
         */
        public Integer getTargetEndTime() {
            return this.targetEndTime;
        }

        /**
         * @return targetStartTime
         */
        public Integer getTargetStartTime() {
            return this.targetStartTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String configId; 
            private Integer enable; 
            private Long firstDateStr; 
            private Integer intervalPeriod; 
            private String lastTaskId; 
            private Long nextStartTimeStr; 
            private String param; 
            private String periodUnit; 
            private Integer targetEndTime; 
            private Integer targetStartTime; 
            private String taskName; 
            private String taskType; 

            /**
             * The ID of the task configuration.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Indicates whether the task is enabled. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The first time when the task starts.
             */
            public Builder firstDateStr(Long firstDateStr) {
                this.firstDateStr = firstDateStr;
                return this;
            }

            /**
             * The interval of the task.
             */
            public Builder intervalPeriod(Integer intervalPeriod) {
                this.intervalPeriod = intervalPeriod;
                return this;
            }

            /**
             * The ID of the task when the task last runs.
             */
            public Builder lastTaskId(String lastTaskId) {
                this.lastTaskId = lastTaskId;
                return this;
            }

            /**
             * The next time when the task starts. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder nextStartTimeStr(Long nextStartTimeStr) {
                this.nextStartTimeStr = nextStartTimeStr;
                return this;
            }

            /**
             * The additional information.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * The unit of the scan interval. Valid values:
             * <p>
             * 
             * *   **day**: days
             * *   **hour**: hours
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The period of time before the task ends. Unit: hours.
             */
            public Builder targetEndTime(Integer targetEndTime) {
                this.targetEndTime = targetEndTime;
                return this;
            }

            /**
             * The period of time before the task starts for the next time. Unit: hours.
             */
            public Builder targetStartTime(Integer targetStartTime) {
                this.targetStartTime = targetStartTime;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The type of the task.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public CycleScheduleResponseList build() {
                return new CycleScheduleResponseList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
