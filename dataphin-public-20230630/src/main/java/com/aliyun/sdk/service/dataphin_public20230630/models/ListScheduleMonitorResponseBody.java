// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduleMonitorResponseBody</p>
 */
public class ListScheduleMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListScheduleMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduleMonitorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListScheduleMonitorResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code of the request. A value of OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The paginated result of the scheduling monitoring alert query.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListScheduleMonitorResponseBody build() {
            return new ListScheduleMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class BizUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BizUnit(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizUnit create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
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

        public static final class Builder {
            private String displayName; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(BizUnit model) {
                this.displayName = model.displayName;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The display name of the business segment.</p>
             * 
             * <strong>example:</strong>
             * <p>Test segment</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the business segment.</p>
             * 
             * <strong>example:</strong>
             * <p>6612345678901234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the business segment.</p>
             * 
             * <strong>example:</strong>
             * <p>bd_demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BizUnit build() {
                return new BizUnit(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class LogicTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeSubType")
        private String nodeSubType;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private java.util.List<String> ownerIdList;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriodType")
        private String schedulePeriodType;

        @com.aliyun.core.annotation.NameInMap("SupportDataDelay")
        private Boolean supportDataDelay;

        private LogicTable(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.id = builder.id;
            this.name = builder.name;
            this.nodeSubType = builder.nodeSubType;
            this.ownerIdList = builder.ownerIdList;
            this.projectName = builder.projectName;
            this.schedulePeriodType = builder.schedulePeriodType;
            this.supportDataDelay = builder.supportDataDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicTable create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeSubType
         */
        public String getNodeSubType() {
            return this.nodeSubType;
        }

        /**
         * @return ownerIdList
         */
        public java.util.List<String> getOwnerIdList() {
            return this.ownerIdList;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return schedulePeriodType
         */
        public String getSchedulePeriodType() {
            return this.schedulePeriodType;
        }

        /**
         * @return supportDataDelay
         */
        public Boolean getSupportDataDelay() {
            return this.supportDataDelay;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private String id; 
            private String name; 
            private String nodeSubType; 
            private java.util.List<String> ownerIdList; 
            private String projectName; 
            private String schedulePeriodType; 
            private Boolean supportDataDelay; 

            private Builder() {
            } 

            private Builder(LogicTable model) {
                this.bizUnitId = model.bizUnitId;
                this.id = model.id;
                this.name = model.name;
                this.nodeSubType = model.nodeSubType;
                this.ownerIdList = model.ownerIdList;
                this.projectName = model.projectName;
                this.schedulePeriodType = model.schedulePeriodType;
                this.supportDataDelay = model.supportDataDelay;
            } 

            /**
             * <p>The ID of the business segment.</p>
             * 
             * <strong>example:</strong>
             * <p>6612345678901234</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The ID of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>6812345678901234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>dim_user</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subtype of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE_SQL</p>
             */
            public Builder nodeSubType(String nodeSubType) {
                this.nodeSubType = nodeSubType;
                return this;
            }

            /**
             * <p>The list of O&amp;M owner IDs.</p>
             */
            public Builder ownerIdList(java.util.List<String> ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * <p>The name of the project to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The type of the scheduling period.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriodType(String schedulePeriodType) {
                this.schedulePeriodType = schedulePeriodType;
                return this;
            }

            /**
             * <p>Specifies whether data delay is supported.</p>
             */
            public Builder supportDataDelay(Boolean supportDataDelay) {
                this.supportDataDelay = supportDataDelay;
                return this;
            }

            public LogicTable build() {
                return new LogicTable(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class FilterRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterValueList")
        private java.util.List<String> filterValueList;

        @com.aliyun.core.annotation.NameInMap("IsExclude")
        private Boolean isExclude;

        private FilterRuleList(Builder builder) {
            this.filterKey = builder.filterKey;
            this.filterValueList = builder.filterValueList;
            this.isExclude = builder.isExclude;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterRuleList create() {
            return builder().build();
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterValueList
         */
        public java.util.List<String> getFilterValueList() {
            return this.filterValueList;
        }

        /**
         * @return isExclude
         */
        public Boolean getIsExclude() {
            return this.isExclude;
        }

        public static final class Builder {
            private String filterKey; 
            private java.util.List<String> filterValueList; 
            private Boolean isExclude; 

            private Builder() {
            } 

            private Builder(FilterRuleList model) {
                this.filterKey = model.filterKey;
                this.filterValueList = model.filterValueList;
                this.isExclude = model.isExclude;
            } 

            /**
             * <p>The filter key.</p>
             * 
             * <strong>example:</strong>
             * <p>NODE_NAME</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The list of filter values.</p>
             */
            public Builder filterValueList(java.util.List<String> filterValueList) {
                this.filterValueList = filterValueList;
                return this;
            }

            /**
             * <p>Specifies whether to invert the selection.</p>
             */
            public Builder isExclude(Boolean isExclude) {
                this.isExclude = isExclude;
                return this;
            }

            public FilterRuleList build() {
                return new FilterRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class MonitorNodeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterRuleList")
        private java.util.List<FilterRuleList> filterRuleList;

        private MonitorNodeRange(Builder builder) {
            this.filterRuleList = builder.filterRuleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorNodeRange create() {
            return builder().build();
        }

        /**
         * @return filterRuleList
         */
        public java.util.List<FilterRuleList> getFilterRuleList() {
            return this.filterRuleList;
        }

        public static final class Builder {
            private java.util.List<FilterRuleList> filterRuleList; 

            private Builder() {
            } 

            private Builder(MonitorNodeRange model) {
                this.filterRuleList = model.filterRuleList;
            } 

            /**
             * <p>The list of filter rules.</p>
             */
            public Builder filterRuleList(java.util.List<FilterRuleList> filterRuleList) {
                this.filterRuleList = filterRuleList;
                return this;
            }

            public MonitorNodeRange build() {
                return new MonitorNodeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class DailyUnfinishedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedUnfinishedTime")
        private String fixedUnfinishedTime;

        private DailyUnfinishedConfig(Builder builder) {
            this.fixedUnfinishedTime = builder.fixedUnfinishedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyUnfinishedConfig create() {
            return builder().build();
        }

        /**
         * @return fixedUnfinishedTime
         */
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        public static final class Builder {
            private String fixedUnfinishedTime; 

            private Builder() {
            } 

            private Builder(DailyUnfinishedConfig model) {
                this.fixedUnfinishedTime = model.fixedUnfinishedTime;
            } 

            /**
             * <p>The time of day for the unfinished check, in HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder fixedUnfinishedTime(String fixedUnfinishedTime) {
                this.fixedUnfinishedTime = fixedUnfinishedTime;
                return this;
            }

            public DailyUnfinishedConfig build() {
                return new DailyUnfinishedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class CustomPeriodList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedUnfinishedTime")
        private String fixedUnfinishedTime;

        @com.aliyun.core.annotation.NameInMap("PeriodNum")
        private Integer periodNum;

        private CustomPeriodList(Builder builder) {
            this.fixedUnfinishedTime = builder.fixedUnfinishedTime;
            this.periodNum = builder.periodNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPeriodList create() {
            return builder().build();
        }

        /**
         * @return fixedUnfinishedTime
         */
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        /**
         * @return periodNum
         */
        public Integer getPeriodNum() {
            return this.periodNum;
        }

        public static final class Builder {
            private String fixedUnfinishedTime; 
            private Integer periodNum; 

            private Builder() {
            } 

            private Builder(CustomPeriodList model) {
                this.fixedUnfinishedTime = model.fixedUnfinishedTime;
                this.periodNum = model.periodNum;
            } 

            /**
             * <p>The time for the unfinished check, in HH:mm format.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder fixedUnfinishedTime(String fixedUnfinishedTime) {
                this.fixedUnfinishedTime = fixedUnfinishedTime;
                return this;
            }

            /**
             * <p>The number of periods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodNum(Integer periodNum) {
                this.periodNum = periodNum;
                return this;
            }

            public CustomPeriodList build() {
                return new CustomPeriodList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class MultiPeriodUnfinishedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPeriodList")
        private java.util.List<CustomPeriodList> customPeriodList;

        @com.aliyun.core.annotation.NameInMap("IntervalAfterDueTime")
        private Integer intervalAfterDueTime;

        @com.aliyun.core.annotation.NameInMap("IntervalUnit")
        private String intervalUnit;

        @com.aliyun.core.annotation.NameInMap("MonitorPeriodType")
        private String monitorPeriodType;

        @com.aliyun.core.annotation.NameInMap("TriggerRuleType")
        private String triggerRuleType;

        private MultiPeriodUnfinishedConfig(Builder builder) {
            this.customPeriodList = builder.customPeriodList;
            this.intervalAfterDueTime = builder.intervalAfterDueTime;
            this.intervalUnit = builder.intervalUnit;
            this.monitorPeriodType = builder.monitorPeriodType;
            this.triggerRuleType = builder.triggerRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiPeriodUnfinishedConfig create() {
            return builder().build();
        }

        /**
         * @return customPeriodList
         */
        public java.util.List<CustomPeriodList> getCustomPeriodList() {
            return this.customPeriodList;
        }

        /**
         * @return intervalAfterDueTime
         */
        public Integer getIntervalAfterDueTime() {
            return this.intervalAfterDueTime;
        }

        /**
         * @return intervalUnit
         */
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        /**
         * @return monitorPeriodType
         */
        public String getMonitorPeriodType() {
            return this.monitorPeriodType;
        }

        /**
         * @return triggerRuleType
         */
        public String getTriggerRuleType() {
            return this.triggerRuleType;
        }

        public static final class Builder {
            private java.util.List<CustomPeriodList> customPeriodList; 
            private Integer intervalAfterDueTime; 
            private String intervalUnit; 
            private String monitorPeriodType; 
            private String triggerRuleType; 

            private Builder() {
            } 

            private Builder(MultiPeriodUnfinishedConfig model) {
                this.customPeriodList = model.customPeriodList;
                this.intervalAfterDueTime = model.intervalAfterDueTime;
                this.intervalUnit = model.intervalUnit;
                this.monitorPeriodType = model.monitorPeriodType;
                this.triggerRuleType = model.triggerRuleType;
            } 

            /**
             * <p>The list of custom monitoring periods.</p>
             */
            public Builder customPeriodList(java.util.List<CustomPeriodList> customPeriodList) {
                this.customPeriodList = customPeriodList;
                return this;
            }

            /**
             * <p>The interval value.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder intervalAfterDueTime(Integer intervalAfterDueTime) {
                this.intervalAfterDueTime = intervalAfterDueTime;
                return this;
            }

            /**
             * <p>The interval unit. Valid values: SECONDS, MINUTES, and HOURS.</p>
             * 
             * <strong>example:</strong>
             * <p>MINUTES</p>
             */
            public Builder intervalUnit(String intervalUnit) {
                this.intervalUnit = intervalUnit;
                return this;
            }

            /**
             * <p>The monitoring period type. Valid values: ALL, FIRST, LAST, and CUSTOM.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder monitorPeriodType(String monitorPeriodType) {
                this.monitorPeriodType = monitorPeriodType;
                return this;
            }

            /**
             * <p>The trigger rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERVAL_AFTER_DUE_TIME</p>
             */
            public Builder triggerRuleType(String triggerRuleType) {
                this.triggerRuleType = triggerRuleType;
                return this;
            }

            public MultiPeriodUnfinishedConfig build() {
                return new MultiPeriodUnfinishedConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class UnfinishedRuleDetailConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyUnfinishedConfig")
        private DailyUnfinishedConfig dailyUnfinishedConfig;

        @com.aliyun.core.annotation.NameInMap("MultiPeriodUnfinishedConfig")
        private MultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig;

        private UnfinishedRuleDetailConfig(Builder builder) {
            this.dailyUnfinishedConfig = builder.dailyUnfinishedConfig;
            this.multiPeriodUnfinishedConfig = builder.multiPeriodUnfinishedConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnfinishedRuleDetailConfig create() {
            return builder().build();
        }

        /**
         * @return dailyUnfinishedConfig
         */
        public DailyUnfinishedConfig getDailyUnfinishedConfig() {
            return this.dailyUnfinishedConfig;
        }

        /**
         * @return multiPeriodUnfinishedConfig
         */
        public MultiPeriodUnfinishedConfig getMultiPeriodUnfinishedConfig() {
            return this.multiPeriodUnfinishedConfig;
        }

        public static final class Builder {
            private DailyUnfinishedConfig dailyUnfinishedConfig; 
            private MultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig; 

            private Builder() {
            } 

            private Builder(UnfinishedRuleDetailConfig model) {
                this.dailyUnfinishedConfig = model.dailyUnfinishedConfig;
                this.multiPeriodUnfinishedConfig = model.multiPeriodUnfinishedConfig;
            } 

            /**
             * <p>The daily configuration for unfinished tasks.</p>
             */
            public Builder dailyUnfinishedConfig(DailyUnfinishedConfig dailyUnfinishedConfig) {
                this.dailyUnfinishedConfig = dailyUnfinishedConfig;
                return this;
            }

            /**
             * <p>The multi-period unfinished configuration.</p>
             */
            public Builder multiPeriodUnfinishedConfig(MultiPeriodUnfinishedConfig multiPeriodUnfinishedConfig) {
                this.multiPeriodUnfinishedConfig = multiPeriodUnfinishedConfig;
                return this;
            }

            public UnfinishedRuleDetailConfig build() {
                return new UnfinishedRuleDetailConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class AlertReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertReasonType")
        private String alertReasonType;

        @com.aliyun.core.annotation.NameInMap("FixedElapsedTime")
        private Long fixedElapsedTime;

        @com.aliyun.core.annotation.NameInMap("FixedUnfinishedTime")
        private String fixedUnfinishedTime;

        @com.aliyun.core.annotation.NameInMap("UnfinishedRuleDetailConfig")
        private UnfinishedRuleDetailConfig unfinishedRuleDetailConfig;

        private AlertReason(Builder builder) {
            this.alertReasonType = builder.alertReasonType;
            this.fixedElapsedTime = builder.fixedElapsedTime;
            this.fixedUnfinishedTime = builder.fixedUnfinishedTime;
            this.unfinishedRuleDetailConfig = builder.unfinishedRuleDetailConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertReason create() {
            return builder().build();
        }

        /**
         * @return alertReasonType
         */
        public String getAlertReasonType() {
            return this.alertReasonType;
        }

        /**
         * @return fixedElapsedTime
         */
        public Long getFixedElapsedTime() {
            return this.fixedElapsedTime;
        }

        /**
         * @return fixedUnfinishedTime
         */
        public String getFixedUnfinishedTime() {
            return this.fixedUnfinishedTime;
        }

        /**
         * @return unfinishedRuleDetailConfig
         */
        public UnfinishedRuleDetailConfig getUnfinishedRuleDetailConfig() {
            return this.unfinishedRuleDetailConfig;
        }

        public static final class Builder {
            private String alertReasonType; 
            private Long fixedElapsedTime; 
            private String fixedUnfinishedTime; 
            private UnfinishedRuleDetailConfig unfinishedRuleDetailConfig; 

            private Builder() {
            } 

            private Builder(AlertReason model) {
                this.alertReasonType = model.alertReasonType;
                this.fixedElapsedTime = model.fixedElapsedTime;
                this.fixedUnfinishedTime = model.fixedUnfinishedTime;
                this.unfinishedRuleDetailConfig = model.unfinishedRuleDetailConfig;
            } 

            /**
             * <p>The type of the alert reason. Valid values: FAILED, TIME_OUT, UNFINISHED, SUCCESS, and DATA_DELAY.</p>
             * 
             * <strong>example:</strong>
             * <p>TIME_OUT</p>
             */
            public Builder alertReasonType(String alertReasonType) {
                this.alertReasonType = alertReasonType;
                return this;
            }

            /**
             * <p>The timeout period in minutes. This parameter is returned only when the alert reason type is TIME_OUT.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder fixedElapsedTime(Long fixedElapsedTime) {
                this.fixedElapsedTime = fixedElapsedTime;
                return this;
            }

            /**
             * <p>The daily check time for unfinished tasks in HH:mm format. This parameter is returned only when the alert reason type is UNFINISHED.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder fixedUnfinishedTime(String fixedUnfinishedTime) {
                this.fixedUnfinishedTime = fixedUnfinishedTime;
                return this;
            }

            /**
             * <p>The detailed configuration of the unfinished rule. This parameter is returned only when the alert reason type is UNFINISHED.</p>
             */
            public Builder unfinishedRuleDetailConfig(UnfinishedRuleDetailConfig unfinishedRuleDetailConfig) {
                this.unfinishedRuleDetailConfig = unfinishedRuleDetailConfig;
                return this;
            }

            public AlertReason build() {
                return new AlertReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class MonitoredTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MonitoredTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(MonitoredTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time in HH:mm format. A value of 0 indicates no limit.</p>
             * 
             * <strong>example:</strong>
             * <p>11:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time in HH:mm format. A value of 0 indicates no limit.</p>
             * 
             * <strong>example:</strong>
             * <p>07:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MonitoredTimeRange build() {
                return new MonitoredTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class ReceiverConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAlertChannelIdList")
        private java.util.List<String> customAlertChannelIdList;

        @com.aliyun.core.annotation.NameInMap("OnDutyTableIdList")
        private java.util.List<String> onDutyTableIdList;

        @com.aliyun.core.annotation.NameInMap("ReceivedWayList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> receivedWayList;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverUserIdList")
        private java.util.List<String> receiverUserIdList;

        private ReceiverConfigList(Builder builder) {
            this.customAlertChannelIdList = builder.customAlertChannelIdList;
            this.onDutyTableIdList = builder.onDutyTableIdList;
            this.receivedWayList = builder.receivedWayList;
            this.receiverType = builder.receiverType;
            this.receiverUserIdList = builder.receiverUserIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiverConfigList create() {
            return builder().build();
        }

        /**
         * @return customAlertChannelIdList
         */
        public java.util.List<String> getCustomAlertChannelIdList() {
            return this.customAlertChannelIdList;
        }

        /**
         * @return onDutyTableIdList
         */
        public java.util.List<String> getOnDutyTableIdList() {
            return this.onDutyTableIdList;
        }

        /**
         * @return receivedWayList
         */
        public java.util.List<String> getReceivedWayList() {
            return this.receivedWayList;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverUserIdList
         */
        public java.util.List<String> getReceiverUserIdList() {
            return this.receiverUserIdList;
        }

        public static final class Builder {
            private java.util.List<String> customAlertChannelIdList; 
            private java.util.List<String> onDutyTableIdList; 
            private java.util.List<String> receivedWayList; 
            private String receiverType; 
            private java.util.List<String> receiverUserIdList; 

            private Builder() {
            } 

            private Builder(ReceiverConfigList model) {
                this.customAlertChannelIdList = model.customAlertChannelIdList;
                this.onDutyTableIdList = model.onDutyTableIdList;
                this.receivedWayList = model.receivedWayList;
                this.receiverType = model.receiverType;
                this.receiverUserIdList = model.receiverUserIdList;
            } 

            /**
             * <p>The list of custom alert channel IDs.</p>
             */
            public Builder customAlertChannelIdList(java.util.List<String> customAlertChannelIdList) {
                this.customAlertChannelIdList = customAlertChannelIdList;
                return this;
            }

            /**
             * <p>The list of on-duty table IDs. This parameter is required when ReceiverType is set to ON_DUTY_TABLE.</p>
             */
            public Builder onDutyTableIdList(java.util.List<String> onDutyTableIdList) {
                this.onDutyTableIdList = onDutyTableIdList;
                return this;
            }

            /**
             * <p>The list of notification methods. Valid values: PHONE, MESSAGE, EMAIL, DING_TALK, FEISHU, WECHAT, and CUSTOM.</p>
             * <p>This parameter is required.</p>
             */
            public Builder receivedWayList(java.util.List<String> receivedWayList) {
                this.receivedWayList = receivedWayList;
                return this;
            }

            /**
             * <p>The recipient type. Valid values: OWNER (owner), USER_CUSTOM (custom user), and ON_DUTY_TABLE (on-duty table).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_CUSTOM</p>
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * <p>The list of recipient user IDs. This parameter is required when ReceiverType is set to USER_CUSTOM.</p>
             */
            public Builder receiverUserIdList(java.util.List<String> receiverUserIdList) {
                this.receiverUserIdList = receiverUserIdList;
                return this;
            }

            public ReceiverConfigList build() {
                return new ReceiverConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class AlertStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertFrequency")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer alertFrequency;

        @com.aliyun.core.annotation.NameInMap("MonitoredTimeRange")
        private MonitoredTimeRange monitoredTimeRange;

        @com.aliyun.core.annotation.NameInMap("ReceiverConfigList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ReceiverConfigList> receiverConfigList;

        @com.aliyun.core.annotation.NameInMap("SendTimes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer sendTimes;

        private AlertStrategy(Builder builder) {
            this.alertFrequency = builder.alertFrequency;
            this.monitoredTimeRange = builder.monitoredTimeRange;
            this.receiverConfigList = builder.receiverConfigList;
            this.sendTimes = builder.sendTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertStrategy create() {
            return builder().build();
        }

        /**
         * @return alertFrequency
         */
        public Integer getAlertFrequency() {
            return this.alertFrequency;
        }

        /**
         * @return monitoredTimeRange
         */
        public MonitoredTimeRange getMonitoredTimeRange() {
            return this.monitoredTimeRange;
        }

        /**
         * @return receiverConfigList
         */
        public java.util.List<ReceiverConfigList> getReceiverConfigList() {
            return this.receiverConfigList;
        }

        /**
         * @return sendTimes
         */
        public Integer getSendTimes() {
            return this.sendTimes;
        }

        public static final class Builder {
            private Integer alertFrequency; 
            private MonitoredTimeRange monitoredTimeRange; 
            private java.util.List<ReceiverConfigList> receiverConfigList; 
            private Integer sendTimes; 

            private Builder() {
            } 

            private Builder(AlertStrategy model) {
                this.alertFrequency = model.alertFrequency;
                this.monitoredTimeRange = model.monitoredTimeRange;
                this.receiverConfigList = model.receiverConfigList;
                this.sendTimes = model.sendTimes;
            } 

            /**
             * <p>The alert trigger frequency.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder alertFrequency(Integer alertFrequency) {
                this.alertFrequency = alertFrequency;
                return this;
            }

            /**
             * <p>The monitored time range.</p>
             */
            public Builder monitoredTimeRange(MonitoredTimeRange monitoredTimeRange) {
                this.monitoredTimeRange = monitoredTimeRange;
                return this;
            }

            /**
             * <p>The list of recipient configurations.</p>
             * <p>This parameter is required.</p>
             */
            public Builder receiverConfigList(java.util.List<ReceiverConfigList> receiverConfigList) {
                this.receiverConfigList = receiverConfigList;
                return this;
            }

            /**
             * <p>The maximum number of alert notifications to send.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder sendTimes(Integer sendTimes) {
                this.sendTimes = sendTimes;
                return this;
            }

            public AlertStrategy build() {
                return new AlertStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Creator(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Creator model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>200012345</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class Modifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Modifier(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modifier create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Modifier model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>200012345</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>Li Si</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Modifier build() {
                return new Modifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class MonitoredRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertReason")
        private AlertReason alertReason;

        @com.aliyun.core.annotation.NameInMap("AlertStrategy")
        private AlertStrategy alertStrategy;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private Modifier modifier;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemId")
        private Long monitoredItemId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
        private Boolean switchStatus;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private MonitoredRuleList(Builder builder) {
            this.alertReason = builder.alertReason;
            this.alertStrategy = builder.alertStrategy;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.modifier = builder.modifier;
            this.monitoredItemId = builder.monitoredItemId;
            this.projectId = builder.projectId;
            this.switchStatus = builder.switchStatus;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredRuleList create() {
            return builder().build();
        }

        /**
         * @return alertReason
         */
        public AlertReason getAlertReason() {
            return this.alertReason;
        }

        /**
         * @return alertStrategy
         */
        public AlertStrategy getAlertStrategy() {
            return this.alertStrategy;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifier
         */
        public Modifier getModifier() {
            return this.modifier;
        }

        /**
         * @return monitoredItemId
         */
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return switchStatus
         */
        public Boolean getSwitchStatus() {
            return this.switchStatus;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private AlertReason alertReason; 
            private AlertStrategy alertStrategy; 
            private String createTime; 
            private Creator creator; 
            private Long id; 
            private String modifiedTime; 
            private Modifier modifier; 
            private Long monitoredItemId; 
            private Long projectId; 
            private Boolean switchStatus; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(MonitoredRuleList model) {
                this.alertReason = model.alertReason;
                this.alertStrategy = model.alertStrategy;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.id = model.id;
                this.modifiedTime = model.modifiedTime;
                this.modifier = model.modifier;
                this.monitoredItemId = model.monitoredItemId;
                this.projectId = model.projectId;
                this.switchStatus = model.switchStatus;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The reason for the alert.</p>
             */
            public Builder alertReason(AlertReason alertReason) {
                this.alertReason = alertReason;
                return this;
            }

            /**
             * <p>The alert strategy.</p>
             */
            public Builder alertStrategy(AlertStrategy alertStrategy) {
                this.alertStrategy = alertStrategy;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-10 15:30:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The monitoring rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6912345678909876</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-10 15:30:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The last modifier.</p>
             */
            public Builder modifier(Modifier modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The ID of the associated monitoring item.</p>
             * 
             * <strong>example:</strong>
             * <p>6912345678901234</p>
             */
            public Builder monitoredItemId(Long monitoredItemId) {
                this.monitoredItemId = monitoredItemId;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7086194564164288</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The enablement status of the rule.</p>
             */
            public Builder switchStatus(Boolean switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public MonitoredRuleList build() {
                return new MonitoredRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class MonitoredTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SchedulePeriodType")
        private String schedulePeriodType;

        private MonitoredTask(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.projectName = builder.projectName;
            this.schedulePeriodType = builder.schedulePeriodType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitoredTask create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return schedulePeriodType
         */
        public String getSchedulePeriodType() {
            return this.schedulePeriodType;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String projectName; 
            private String schedulePeriodType; 

            private Builder() {
            } 

            private Builder(MonitoredTask model) {
                this.id = model.id;
                this.name = model.name;
                this.projectName = model.projectName;
                this.schedulePeriodType = model.schedulePeriodType;
            } 

            /**
             * <p>The ID of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>6712345678901234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_order_detail</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the project to which the task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The schedule period type. Valid values: MINUTELY, HOURLY, DAILY, WEEKLY, MONTHLY, and YEARLY.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder schedulePeriodType(String schedulePeriodType) {
                this.schedulePeriodType = schedulePeriodType;
                return this;
            }

            public MonitoredTask build() {
                return new MonitoredTask(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class ProjectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ProjectInfo(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectInfo create() {
            return builder().build();
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

        public static final class Builder {
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(ProjectInfo model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7086194564164288</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ProjectInfo build() {
                return new ProjectInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class MonitorItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnit")
        private BizUnit bizUnit;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LogicTable")
        private LogicTable logicTable;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("MonitorNodeRange")
        private MonitorNodeRange monitorNodeRange;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemId")
        private Long monitoredItemId;

        @com.aliyun.core.annotation.NameInMap("MonitoredRuleList")
        private java.util.List<MonitoredRuleList> monitoredRuleList;

        @com.aliyun.core.annotation.NameInMap("MonitoredTask")
        private MonitoredTask monitoredTask;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectInfo")
        private ProjectInfo projectInfo;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MonitorItemList(Builder builder) {
            this.bizUnit = builder.bizUnit;
            this.createTime = builder.createTime;
            this.logicTable = builder.logicTable;
            this.modifiedTime = builder.modifiedTime;
            this.monitorNodeRange = builder.monitorNodeRange;
            this.monitoredItemId = builder.monitoredItemId;
            this.monitoredRuleList = builder.monitoredRuleList;
            this.monitoredTask = builder.monitoredTask;
            this.projectId = builder.projectId;
            this.projectInfo = builder.projectInfo;
            this.subType = builder.subType;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItemList create() {
            return builder().build();
        }

        /**
         * @return bizUnit
         */
        public BizUnit getBizUnit() {
            return this.bizUnit;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return logicTable
         */
        public LogicTable getLogicTable() {
            return this.logicTable;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return monitorNodeRange
         */
        public MonitorNodeRange getMonitorNodeRange() {
            return this.monitorNodeRange;
        }

        /**
         * @return monitoredItemId
         */
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        /**
         * @return monitoredRuleList
         */
        public java.util.List<MonitoredRuleList> getMonitoredRuleList() {
            return this.monitoredRuleList;
        }

        /**
         * @return monitoredTask
         */
        public MonitoredTask getMonitoredTask() {
            return this.monitoredTask;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectInfo
         */
        public ProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private BizUnit bizUnit; 
            private String createTime; 
            private LogicTable logicTable; 
            private String modifiedTime; 
            private MonitorNodeRange monitorNodeRange; 
            private Long monitoredItemId; 
            private java.util.List<MonitoredRuleList> monitoredRuleList; 
            private MonitoredTask monitoredTask; 
            private Long projectId; 
            private ProjectInfo projectInfo; 
            private String subType; 
            private String tenantId; 
            private String type; 

            private Builder() {
            } 

            private Builder(MonitorItemList model) {
                this.bizUnit = model.bizUnit;
                this.createTime = model.createTime;
                this.logicTable = model.logicTable;
                this.modifiedTime = model.modifiedTime;
                this.monitorNodeRange = model.monitorNodeRange;
                this.monitoredItemId = model.monitoredItemId;
                this.monitoredRuleList = model.monitoredRuleList;
                this.monitoredTask = model.monitoredTask;
                this.projectId = model.projectId;
                this.projectInfo = model.projectInfo;
                this.subType = model.subType;
                this.tenantId = model.tenantId;
                this.type = model.type;
            } 

            /**
             * <p>The business segment information.</p>
             */
            public Builder bizUnit(BizUnit bizUnit) {
                this.bizUnit = bizUnit;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-10 15:30:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The logical table information.</p>
             */
            public Builder logicTable(LogicTable logicTable) {
                this.logicTable = logicTable;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-10 15:30:00</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The scope of the monitoring task.</p>
             */
            public Builder monitorNodeRange(MonitorNodeRange monitorNodeRange) {
                this.monitorNodeRange = monitorNodeRange;
                return this;
            }

            /**
             * <p>The ID of the monitored object.</p>
             * 
             * <strong>example:</strong>
             * <p>6912345678901234</p>
             */
            public Builder monitoredItemId(Long monitoredItemId) {
                this.monitoredItemId = monitoredItemId;
                return this;
            }

            /**
             * <p>The list of monitoring rules.</p>
             */
            public Builder monitoredRuleList(java.util.List<MonitoredRuleList> monitoredRuleList) {
                this.monitoredRuleList = monitoredRuleList;
                return this;
            }

            /**
             * <p>The monitored task information.</p>
             */
            public Builder monitoredTask(MonitoredTask monitoredTask) {
                this.monitoredTask = monitoredTask;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7086194564164288</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project information.</p>
             */
            public Builder projectInfo(ProjectInfo projectInfo) {
                this.projectInfo = projectInfo;
                return this;
            }

            /**
             * <p>The business subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE_SQL</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The monitored object type.</p>
             * 
             * <strong>example:</strong>
             * <p>SCHEDULE_PHYSICAL_NODE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MonitorItemList build() {
                return new MonitorItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScheduleMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduleMonitorResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItemList")
        private java.util.List<MonitorItemList> monitorItemList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.monitorItemList = builder.monitorItemList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return monitorItemList
         */
        public java.util.List<MonitorItemList> getMonitorItemList() {
            return this.monitorItemList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<MonitorItemList> monitorItemList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.monitorItemList = model.monitorItemList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of monitored objects on the current page.</p>
             */
            public Builder monitorItemList(java.util.List<MonitorItemList> monitorItemList) {
                this.monitorItemList = monitorItemList;
                return this;
            }

            /**
             * <p>The total number of monitored objects that meet the conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
