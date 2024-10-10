// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCycleTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCycleTaskListResponseBody</p>
 */
public class DescribeCycleTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CycleScheduleResponseList")
    private java.util.List < CycleScheduleResponseList> cycleScheduleResponseList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array that consists of periodic scan tasks.</p>
         */
        public Builder cycleScheduleResponseList(java.util.List < CycleScheduleResponseList> cycleScheduleResponseList) {
            this.cycleScheduleResponseList = cycleScheduleResponseList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCycleTaskListResponseBody build() {
            return new DescribeCycleTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCycleTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCycleTaskListResponseBody</p>
     */
    public static class CycleScheduleResponseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        @com.aliyun.core.annotation.NameInMap("FirstDateStr")
        private Long firstDateStr;

        @com.aliyun.core.annotation.NameInMap("IntervalPeriod")
        private Integer intervalPeriod;

        @com.aliyun.core.annotation.NameInMap("LastTaskId")
        private String lastTaskId;

        @com.aliyun.core.annotation.NameInMap("NextStartTimeStr")
        private Long nextStartTimeStr;

        @com.aliyun.core.annotation.NameInMap("Param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("TargetEndTime")
        private Integer targetEndTime;

        @com.aliyun.core.annotation.NameInMap("TargetStartTime")
        private Integer targetStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
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
             * <p>The configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2cdbdeba8dd70586d5814d4cbf21****</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>Indicates whether the configuration for the task interval was enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: enabled.</li>
             * <li><strong>0</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The time when the task first started.</p>
             * 
             * <strong>example:</strong>
             * <p>1667491200000</p>
             */
            public Builder firstDateStr(Long firstDateStr) {
                this.firstDateStr = firstDateStr;
                return this;
            }

            /**
             * <p>The interval between which two consecutive tasks are run.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder intervalPeriod(Integer intervalPeriod) {
                this.intervalPeriod = intervalPeriod;
                return this;
            }

            /**
             * <p>The ID of the last task.</p>
             * 
             * <strong>example:</strong>
             * <p>38730bb078f4a1461d4ed283994c****</p>
             */
            public Builder lastTaskId(String lastTaskId) {
                this.lastTaskId = lastTaskId;
                return this;
            }

            /**
             * <p>The time when the next task starts. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671184531000</p>
             */
            public Builder nextStartTimeStr(Long nextStartTimeStr) {
                this.nextStartTimeStr = nextStartTimeStr;
                return this;
            }

            /**
             * <p>The extended information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;userAgreement&quot;:&quot;yes&quot;,&quot;lang&quot;:&quot;zh&quot;}</p>
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * <p>The unit of the scan interval. Valid values:</p>
             * <ul>
             * <li><strong>day</strong></li>
             * <li><strong>hour</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The end time of the task. The time must be a time frame.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder targetEndTime(Integer targetEndTime) {
                this.targetEndTime = targetEndTime;
                return this;
            }

            /**
             * <p>The start time of the task. The start time must be a time frame.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder targetStartTime(Integer targetStartTime) {
                this.targetStartTime = targetStartTime;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
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
    /**
     * 
     * {@link DescribeCycleTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCycleTaskListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
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
