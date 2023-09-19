// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorTaskListResponseBody</p>
 */
public class DescribeHybridMonitorTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TaskList")
    private java.util.List < TaskList> taskList;

    @NameInMap("Total")
    private Integer total;

    private DescribeHybridMonitorTaskListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskList = builder.taskList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridMonitorTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return taskList
     */
    public java.util.List < TaskList> getTaskList() {
        return this.taskList;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String success; 
        private java.util.List < TaskList> taskList; 
        private Integer total; 

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request was successful, the value `successful` is returned.
         * *   If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The metric import tasks.
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeHybridMonitorTaskListResponseBody build() {
            return new DescribeHybridMonitorTaskListResponseBody(this);
        } 

    } 

    public static class AttachLabels extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private AttachLabels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachLabels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttachLabels build() {
                return new AttachLabels(this);
            } 

        } 

    }
    public static class MatchExpress extends TeaModel {
        @NameInMap("Function")
        private String function;

        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private MatchExpress(Builder builder) {
            this.function = builder.function;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchExpress create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String function; 
            private String name; 
            private String value; 

            /**
             * The method that is used to match the instance name. Valid values:
             * <p>
             * 
             * *   startWith: starts with a prefix
             * *   endWith: ends with a suffix
             * *   all: matches all
             * *   equals: equals
             * *   contains: contains
             * *   notContains: does not contain
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The keyword that corresponds to the instance name.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchExpress build() {
                return new MatchExpress(this);
            } 

        } 

    }
    public static class Express extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Express")
        private String express;

        private Express(Builder builder) {
            this.alias = builder.alias;
            this.express = builder.express;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Express create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return express
         */
        public String getExpress() {
            return this.express;
        }

        public static final class Builder {
            private String alias; 
            private String express; 

            /**
             * The alias of the extended field that indicates the result of basic operations that are performed on aggregation results.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The extended field that indicates the result of basic operations that are performed on aggregation results.
             */
            public Builder express(String express) {
                this.express = express;
                return this;
            }

            public Express build() {
                return new Express(this);
            } 

        } 

    }
    public static class Filters extends TeaModel {
        @NameInMap("Operator")
        private String operator;

        @NameInMap("SLSKeyName")
        private String SLSKeyName;

        @NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.operator = builder.operator;
            this.SLSKeyName = builder.SLSKeyName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return SLSKeyName
         */
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operator; 
            private String SLSKeyName; 
            private String value; 

            /**
             * The method that is used to filter logs imported from Log Service. Valid values:
             * <p>
             * 
             * *   `contain`: contains
             * *   `notContain`: does not contain
             * *   `>`: greater than
             * *   `<`: less than
             * *   `=`: equal to
             * *   `! =`: not equal to
             * *   `>=`: greater than or equal to
             * *   `<=`: less than or equal to
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The name of the key that is used to filter logs imported from Log Service.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            /**
             * The value of the key that is used to filter logs imported from Log Service.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class Filter extends TeaModel {
        @NameInMap("Filters")
        private java.util.List < Filters> filters;

        @NameInMap("Relation")
        private String relation;

        private Filter(Builder builder) {
            this.filters = builder.filters;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return filters
         */
        public java.util.List < Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        public static final class Builder {
            private java.util.List < Filters> filters; 
            private String relation; 

            /**
             * The conditions that are used to filter logs imported from Log Service.
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * The relationship between multiple filter conditions. Valid values:
             * <p>
             * 
             * *   and (default): Logs are processed only if all filter conditions are met.
             * *   or: Logs are processed if one of the filter conditions is met.
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class GroupBy extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("SLSKeyName")
        private String SLSKeyName;

        private GroupBy(Builder builder) {
            this.alias = builder.alias;
            this.SLSKeyName = builder.SLSKeyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupBy create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return SLSKeyName
         */
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public static final class Builder {
            private String alias; 
            private String SLSKeyName; 

            /**
             * The alias of the aggregation result.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The name of the key that is used to aggregate logs imported from Log Service.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            public GroupBy build() {
                return new GroupBy(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Function")
        private String function;

        @NameInMap("Parameter1")
        private String parameter1;

        @NameInMap("Parameter2")
        private String parameter2;

        @NameInMap("SLSKeyName")
        private String SLSKeyName;

        private Statistics(Builder builder) {
            this.alias = builder.alias;
            this.function = builder.function;
            this.parameter1 = builder.parameter1;
            this.parameter2 = builder.parameter2;
            this.SLSKeyName = builder.SLSKeyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return parameter1
         */
        public String getParameter1() {
            return this.parameter1;
        }

        /**
         * @return parameter2
         */
        public String getParameter2() {
            return this.parameter2;
        }

        /**
         * @return SLSKeyName
         */
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public static final class Builder {
            private String alias; 
            private String function; 
            private String parameter1; 
            private String parameter2; 
            private String SLSKeyName; 

            /**
             * The alias of the aggregation result.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The function that is used to aggregate log data within a statistical period. Valid values:
             * <p>
             * 
             * *   count: counts the number.
             * *   sum: calculates the total value.
             * *   avg: calculates the average value.
             * *   max: calculates the maximum value.
             * *   min: calculates the minimum value.
             * *   value: collects samples within the statistical period.
             * *   countps: calculates the average number of the specified field per second by using the following formula: Counted number of the specified field/Total number of seconds within the statistical period.
             * *   sumps: calculates the average number of the specified field per second by using the following formula: Total value of the specified field/Total number of seconds within the statistical period.
             * *   distinct: counts the number of logs where the specified field appears within the statistical period.
             * *   distribution: counts the number of logs that meet a specified condition within the statistical period.
             * *   percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The value of the function that is used to aggregate logs imported from Log Service.
             * <p>
             * 
             * *   If the `Function` parameter is set to `distribution`, this parameter indicates the lower limit of the statistical interval. For example, 200 indicates that the number of HTTP requests whose status code is 2XX is calculated.
             * *   If the `Function` parameter is set to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.
             */
            public Builder parameter1(String parameter1) {
                this.parameter1 = parameter1;
                return this;
            }

            /**
             * The value of the function that is used to aggregate logs imported from Log Service.
             * <p>
             * 
             * > This parameter is returned only if the `Function` parameter is set to `distribution`. This parameter indicates the upper limit of the statistical interval. For example, 299 indicates that the number of HTTP requests whose status code is 2XX is calculated.
             */
            public Builder parameter2(String parameter2) {
                this.parameter2 = parameter2;
                return this;
            }

            /**
             * The name of the key that is used to aggregate logs imported from Log Service.
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    public static class SLSProcessConfig extends TeaModel {
        @NameInMap("Express")
        private java.util.List < Express> express;

        @NameInMap("Filter")
        private Filter filter;

        @NameInMap("GroupBy")
        private java.util.List < GroupBy> groupBy;

        @NameInMap("Statistics")
        private java.util.List < Statistics> statistics;

        private SLSProcessConfig(Builder builder) {
            this.express = builder.express;
            this.filter = builder.filter;
            this.groupBy = builder.groupBy;
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLSProcessConfig create() {
            return builder().build();
        }

        /**
         * @return express
         */
        public java.util.List < Express> getExpress() {
            return this.express;
        }

        /**
         * @return filter
         */
        public Filter getFilter() {
            return this.filter;
        }

        /**
         * @return groupBy
         */
        public java.util.List < GroupBy> getGroupBy() {
            return this.groupBy;
        }

        /**
         * @return statistics
         */
        public java.util.List < Statistics> getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private java.util.List < Express> express; 
            private Filter filter; 
            private java.util.List < GroupBy> groupBy; 
            private java.util.List < Statistics> statistics; 

            /**
             * The extended fields that indicate the results of basic operations that are performed on aggregation results.
             */
            public Builder express(java.util.List < Express> express) {
                this.express = express;
                return this;
            }

            /**
             * The conditions that are used to filter logs imported from Log Service.
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * The dimensions based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.
             */
            public Builder groupBy(java.util.List < GroupBy> groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * The methods that are used to aggregate logs imported from Log Service.
             */
            public Builder statistics(java.util.List < Statistics> statistics) {
                this.statistics = statistics;
                return this;
            }

            public SLSProcessConfig build() {
                return new SLSProcessConfig(this);
            } 

        } 

    }
    public static class TaskList extends TeaModel {
        @NameInMap("AttachLabels")
        private java.util.List < AttachLabels> attachLabels;

        @NameInMap("CollectInterval")
        private Integer collectInterval;

        @NameInMap("CollectTargetEndpoint")
        private String collectTargetEndpoint;

        @NameInMap("CollectTargetPath")
        private String collectTargetPath;

        @NameInMap("CollectTargetType")
        private String collectTargetType;

        @NameInMap("CollectTimout")
        private Integer collectTimout;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExtraInfo")
        private String extraInfo;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Instances")
        private java.util.List < String > instances;

        @NameInMap("LogFilePath")
        private String logFilePath;

        @NameInMap("LogProcess")
        private String logProcess;

        @NameInMap("LogSample")
        private String logSample;

        @NameInMap("LogSplit")
        private String logSplit;

        @NameInMap("MatchExpress")
        private java.util.List < MatchExpress> matchExpress;

        @NameInMap("MatchExpressRelation")
        private String matchExpressRelation;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("SLSProcess")
        private String SLSProcess;

        @NameInMap("SLSProcessConfig")
        private SLSProcessConfig SLSProcessConfig;

        @NameInMap("TargetUserId")
        private String targetUserId;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("UploadRegion")
        private String uploadRegion;

        @NameInMap("YARMConfig")
        private String YARMConfig;

        private TaskList(Builder builder) {
            this.attachLabels = builder.attachLabels;
            this.collectInterval = builder.collectInterval;
            this.collectTargetEndpoint = builder.collectTargetEndpoint;
            this.collectTargetPath = builder.collectTargetPath;
            this.collectTargetType = builder.collectTargetType;
            this.collectTimout = builder.collectTimout;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.extraInfo = builder.extraInfo;
            this.groupId = builder.groupId;
            this.instances = builder.instances;
            this.logFilePath = builder.logFilePath;
            this.logProcess = builder.logProcess;
            this.logSample = builder.logSample;
            this.logSplit = builder.logSplit;
            this.matchExpress = builder.matchExpress;
            this.matchExpressRelation = builder.matchExpressRelation;
            this.namespace = builder.namespace;
            this.networkType = builder.networkType;
            this.SLSProcess = builder.SLSProcess;
            this.SLSProcessConfig = builder.SLSProcessConfig;
            this.targetUserId = builder.targetUserId;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.uploadRegion = builder.uploadRegion;
            this.YARMConfig = builder.YARMConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return attachLabels
         */
        public java.util.List < AttachLabels> getAttachLabels() {
            return this.attachLabels;
        }

        /**
         * @return collectInterval
         */
        public Integer getCollectInterval() {
            return this.collectInterval;
        }

        /**
         * @return collectTargetEndpoint
         */
        public String getCollectTargetEndpoint() {
            return this.collectTargetEndpoint;
        }

        /**
         * @return collectTargetPath
         */
        public String getCollectTargetPath() {
            return this.collectTargetPath;
        }

        /**
         * @return collectTargetType
         */
        public String getCollectTargetType() {
            return this.collectTargetType;
        }

        /**
         * @return collectTimout
         */
        public Integer getCollectTimout() {
            return this.collectTimout;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return instances
         */
        public java.util.List < String > getInstances() {
            return this.instances;
        }

        /**
         * @return logFilePath
         */
        public String getLogFilePath() {
            return this.logFilePath;
        }

        /**
         * @return logProcess
         */
        public String getLogProcess() {
            return this.logProcess;
        }

        /**
         * @return logSample
         */
        public String getLogSample() {
            return this.logSample;
        }

        /**
         * @return logSplit
         */
        public String getLogSplit() {
            return this.logSplit;
        }

        /**
         * @return matchExpress
         */
        public java.util.List < MatchExpress> getMatchExpress() {
            return this.matchExpress;
        }

        /**
         * @return matchExpressRelation
         */
        public String getMatchExpressRelation() {
            return this.matchExpressRelation;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return SLSProcess
         */
        public String getSLSProcess() {
            return this.SLSProcess;
        }

        /**
         * @return SLSProcessConfig
         */
        public SLSProcessConfig getSLSProcessConfig() {
            return this.SLSProcessConfig;
        }

        /**
         * @return targetUserId
         */
        public String getTargetUserId() {
            return this.targetUserId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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

        /**
         * @return uploadRegion
         */
        public String getUploadRegion() {
            return this.uploadRegion;
        }

        /**
         * @return YARMConfig
         */
        public String getYARMConfig() {
            return this.YARMConfig;
        }

        public static final class Builder {
            private java.util.List < AttachLabels> attachLabels; 
            private Integer collectInterval; 
            private String collectTargetEndpoint; 
            private String collectTargetPath; 
            private String collectTargetType; 
            private Integer collectTimout; 
            private String createTime; 
            private String description; 
            private String extraInfo; 
            private String groupId; 
            private java.util.List < String > instances; 
            private String logFilePath; 
            private String logProcess; 
            private String logSample; 
            private String logSplit; 
            private java.util.List < MatchExpress> matchExpress; 
            private String matchExpressRelation; 
            private String namespace; 
            private String networkType; 
            private String SLSProcess; 
            private SLSProcessConfig SLSProcessConfig; 
            private String targetUserId; 
            private String taskId; 
            private String taskName; 
            private String taskType; 
            private String uploadRegion; 
            private String YARMConfig; 

            /**
             * The tags of the metric import task.
             */
            public Builder attachLabels(java.util.List < AttachLabels> attachLabels) {
                this.attachLabels = attachLabels;
                return this;
            }

            /**
             * The interval at which the CloudMonitor agent collects host monitoring data. Valid values:
             * <p>
             * 
             * *   15
             * *   30
             * *   60
             * 
             * Unit: seconds.
             */
            public Builder collectInterval(Integer collectInterval) {
                this.collectInterval = collectInterval;
                return this;
            }

            /**
             * The URL of the destination from which the CloudMonitor agent collects host monitoring data.
             */
            public Builder collectTargetEndpoint(String collectTargetEndpoint) {
                this.collectTargetEndpoint = collectTargetEndpoint;
                return this;
            }

            /**
             * The relative path from which the CloudMonitor agent collects monitoring data.
             */
            public Builder collectTargetPath(String collectTargetPath) {
                this.collectTargetPath = collectTargetPath;
                return this;
            }

            /**
             * The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, and MySQL.
             */
            public Builder collectTargetType(String collectTargetType) {
                this.collectTargetType = collectTargetType;
                return this;
            }

            /**
             * The timeout period during which the CloudMonitor agent collects host monitoring data. Valid values:
             * <p>
             * 
             * *   0
             * *   15
             * *   30
             * *   60
             * 
             * Unit: seconds.
             */
            public Builder collectTimout(Integer collectTimout) {
                this.collectTimout = collectTimout;
                return this;
            }

            /**
             * The timestamp when the metric import task was created.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the metric import task.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The additional information of the instance.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The instances where monitoring data is collected in batches.
             */
            public Builder instances(java.util.List < String > instances) {
                this.instances = instances;
                return this;
            }

            /**
             * LogFilePath.
             */
            public Builder logFilePath(String logFilePath) {
                this.logFilePath = logFilePath;
                return this;
            }

            /**
             * The method that is used to aggregate on-premises log data.
             */
            public Builder logProcess(String logProcess) {
                this.logProcess = logProcess;
                return this;
            }

            /**
             * The sample on-premises log.
             */
            public Builder logSample(String logSample) {
                this.logSample = logSample;
                return this;
            }

            /**
             * The result that is returned after on-premises log data is split based on the specified matching mode.
             * <p>
             * 
             * > The matching modes of on-premises log data include full regex mode, delimiter mode, and JSON mode.
             */
            public Builder logSplit(String logSplit) {
                this.logSplit = logSplit;
                return this;
            }

            /**
             * The conditions that are used to match the instances in the application group.
             */
            public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            /**
             * The relationship between the conditions that are used to filter metric import tasks. Valid values:
             * <p>
             * 
             * *   or
             * *   and
             */
            public Builder matchExpressRelation(String matchExpressRelation) {
                this.matchExpressRelation = matchExpressRelation;
                return this;
            }

            /**
             * The namespace to which the host belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The network type of the host. Valid values:
             * <p>
             * 
             * *   `vpc`
             * *   `Internet`
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The configurations of the logs that are imported from Log Service.
             */
            public Builder SLSProcess(String SLSProcess) {
                this.SLSProcess = SLSProcess;
                return this;
            }

            /**
             * The configurations of the logs that are imported from Log Service.
             * <p>
             * 
             * > This parameter is returned only if the `TaskType` parameter is set to `aliyun_sls`.
             */
            public Builder SLSProcessConfig(SLSProcessConfig SLSProcessConfig) {
                this.SLSProcessConfig = SLSProcessConfig;
                return this;
            }

            /**
             * The ID of the member account.
             * <p>
             * 
             * > This parameter is displayed only when you call this operation by using a management account.
             */
            public Builder targetUserId(String targetUserId) {
                this.targetUserId = targetUserId;
                return this;
            }

            /**
             * The ID of the metric import task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the metric import task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The type of the metric import task. Valid values:
             * <p>
             * 
             * *   aliyun_fc: metric import tasks for Alibaba Cloud services
             * *   aliyun_sls: metrics for logs imported from Log Service
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The region where the host resides.
             */
            public Builder uploadRegion(String uploadRegion) {
                this.uploadRegion = uploadRegion;
                return this;
            }

            /**
             * The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.
             * <p>
             * 
             * *   namespace: the namespace of the Alibaba Cloud service.
             * *   metric_list: the metrics of the Alibaba Cloud service.
             */
            public Builder YARMConfig(String YARMConfig) {
                this.YARMConfig = YARMConfig;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
