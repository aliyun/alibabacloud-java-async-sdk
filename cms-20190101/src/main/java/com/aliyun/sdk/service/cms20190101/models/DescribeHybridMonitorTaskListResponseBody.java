// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorTaskListResponseBody</p>
 */
public class DescribeHybridMonitorTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List < TaskList> taskList;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li>If the request was successful, the value <code>successful</code> is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11145B76-566A-5D80-A8A3-FAD98D310079</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The metric import tasks.</p>
         */
        public Builder taskList(java.util.List < TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeHybridMonitorTaskListResponseBody build() {
            return new DescribeHybridMonitorTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class AttachLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class MatchExpress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The method that is used to match the instance name. Valid values:</p>
             * <ul>
             * <li>startWith: starts with a prefix</li>
             * <li>endWith: ends with a suffix</li>
             * <li>all: matches all</li>
             * <li>equals: equals</li>
             * <li>contains: contains</li>
             * <li>notContains: does not contain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The keyword that corresponds to the instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_instance1</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class Express extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Express")
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
             * <p>The alias of the extended field that indicates the result of basic operations that are performed on aggregation results.</p>
             * 
             * <strong>example:</strong>
             * <p>SuccRate</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The extended field that indicates the result of basic operations that are performed on aggregation results.</p>
             * 
             * <strong>example:</strong>
             * <p>success_count</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("SLSKeyName")
        private String SLSKeyName;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The method that is used to filter logs imported from Log Service. Valid values:</p>
             * <ul>
             * <li><code>contain</code>: contains</li>
             * <li><code>notContain</code>: does not contain</li>
             * <li><code>&gt;</code>: greater than</li>
             * <li><code>&lt;</code>: less than</li>
             * <li><code>=</code>: equal to</li>
             * <li><code>! =</code>: not equal to</li>
             * <li><code>&gt;=</code>: greater than or equal to</li>
             * <li><code>&lt;=</code>: less than or equal to</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>=</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The name of the key that is used to filter logs imported from Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder SLSKeyName(String SLSKeyName) {
                this.SLSKeyName = SLSKeyName;
                return this;
            }

            /**
             * <p>The value of the key that is used to filter logs imported from Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List < Filters> filters;

        @com.aliyun.core.annotation.NameInMap("Relation")
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
             * <p>The conditions that are used to filter logs imported from Log Service.</p>
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The relationship between multiple filter conditions. Valid values:</p>
             * <ul>
             * <li>and (default): Logs are processed only if all filter conditions are met.</li>
             * <li>or: Logs are processed if one of the filter conditions is met.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class GroupBy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("SLSKeyName")
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
             * <p>The alias of the aggregation result.</p>
             * 
             * <strong>example:</strong>
             * <p>ApiResult</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>code</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("Parameter1")
        private String parameter1;

        @com.aliyun.core.annotation.NameInMap("Parameter2")
        private String parameter2;

        @com.aliyun.core.annotation.NameInMap("SLSKeyName")
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
             * <p>The alias of the aggregation result.</p>
             * 
             * <strong>example:</strong>
             * <p>level_count</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The function that is used to aggregate log data within a statistical period. Valid values:</p>
             * <ul>
             * <li>count: counts the number.</li>
             * <li>sum: calculates the total value.</li>
             * <li>avg: calculates the average value.</li>
             * <li>max: calculates the maximum value.</li>
             * <li>min: calculates the minimum value.</li>
             * <li>value: collects samples within the statistical period.</li>
             * <li>countps: calculates the average number of the specified field per second by using the following formula: Counted number of the specified field/Total number of seconds within the statistical period.</li>
             * <li>sumps: calculates the average number of the specified field per second by using the following formula: Total value of the specified field/Total number of seconds within the statistical period.</li>
             * <li>distinct: counts the number of logs where the specified field appears within the statistical period.</li>
             * <li>distribution: counts the number of logs that meet a specified condition within the statistical period.</li>
             * <li>percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>count</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
             * <ul>
             * <li>If the <code>Function</code> parameter is set to <code>distribution</code>, this parameter indicates the lower limit of the statistical interval. For example, 200 indicates that the number of HTTP requests whose status code is 2XX is calculated.</li>
             * <li>If the <code>Function</code> parameter is set to <code>percentile</code>, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder parameter1(String parameter1) {
                this.parameter1 = parameter1;
                return this;
            }

            /**
             * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
             * <blockquote>
             * <p>This parameter is returned only if the <code>Function</code> parameter is set to <code>distribution</code>. This parameter indicates the upper limit of the statistical interval. For example, 299 indicates that the number of HTTP requests whose status code is 2XX is calculated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>299</p>
             */
            public Builder parameter2(String parameter2) {
                this.parameter2 = parameter2;
                return this;
            }

            /**
             * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class SLSProcessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Express")
        private java.util.List < Express> express;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private Filter filter;

        @com.aliyun.core.annotation.NameInMap("GroupBy")
        private java.util.List < GroupBy> groupBy;

        @com.aliyun.core.annotation.NameInMap("Statistics")
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
             * <p>The extended fields that indicate the results of basic operations that are performed on aggregation results.</p>
             */
            public Builder express(java.util.List < Express> express) {
                this.express = express;
                return this;
            }

            /**
             * <p>The conditions that are used to filter logs imported from Log Service.</p>
             */
            public Builder filter(Filter filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The dimensions based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
             */
            public Builder groupBy(java.util.List < GroupBy> groupBy) {
                this.groupBy = groupBy;
                return this;
            }

            /**
             * <p>The methods that are used to aggregate logs imported from Log Service.</p>
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
    /**
     * 
     * {@link DescribeHybridMonitorTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridMonitorTaskListResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachLabels")
        private java.util.List < AttachLabels> attachLabels;

        @com.aliyun.core.annotation.NameInMap("CollectInterval")
        private Integer collectInterval;

        @com.aliyun.core.annotation.NameInMap("CollectTargetEndpoint")
        private String collectTargetEndpoint;

        @com.aliyun.core.annotation.NameInMap("CollectTargetPath")
        private String collectTargetPath;

        @com.aliyun.core.annotation.NameInMap("CollectTargetType")
        private String collectTargetType;

        @com.aliyun.core.annotation.NameInMap("CollectTimout")
        private Integer collectTimout;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < String > instances;

        @com.aliyun.core.annotation.NameInMap("LogFilePath")
        private String logFilePath;

        @com.aliyun.core.annotation.NameInMap("LogProcess")
        private String logProcess;

        @com.aliyun.core.annotation.NameInMap("LogSample")
        private String logSample;

        @com.aliyun.core.annotation.NameInMap("LogSplit")
        private String logSplit;

        @com.aliyun.core.annotation.NameInMap("MatchExpress")
        private java.util.List < MatchExpress> matchExpress;

        @com.aliyun.core.annotation.NameInMap("MatchExpressRelation")
        private String matchExpressRelation;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("SLSProcess")
        private String SLSProcess;

        @com.aliyun.core.annotation.NameInMap("SLSProcessConfig")
        private SLSProcessConfig SLSProcessConfig;

        @com.aliyun.core.annotation.NameInMap("TargetUserId")
        private String targetUserId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UploadRegion")
        private String uploadRegion;

        @com.aliyun.core.annotation.NameInMap("YARMConfig")
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
             * <p>The tags of the metric import task.</p>
             */
            public Builder attachLabels(java.util.List < AttachLabels> attachLabels) {
                this.attachLabels = attachLabels;
                return this;
            }

            /**
             * <p>The interval at which the CloudMonitor agent collects host monitoring data. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>30</li>
             * <li>60</li>
             * </ul>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder collectInterval(Integer collectInterval) {
                this.collectInterval = collectInterval;
                return this;
            }

            /**
             * <p>The URL of the destination from which the CloudMonitor agent collects host monitoring data.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://localhost">http://localhost</a></p>
             */
            public Builder collectTargetEndpoint(String collectTargetEndpoint) {
                this.collectTargetEndpoint = collectTargetEndpoint;
                return this;
            }

            /**
             * <p>The relative path from which the CloudMonitor agent collects monitoring data.</p>
             * 
             * <strong>example:</strong>
             * <p>/metrics</p>
             */
            public Builder collectTargetPath(String collectTargetPath) {
                this.collectTargetPath = collectTargetPath;
                return this;
            }

            /**
             * <p>The type of the monitoring data. Valid values: Spring, Tomcat, Nginx, Tengine, JVM, Redis, and MySQL.</p>
             * 
             * <strong>example:</strong>
             * <p>nginx</p>
             */
            public Builder collectTargetType(String collectTargetType) {
                this.collectTargetType = collectTargetType;
                return this;
            }

            /**
             * <p>The timeout period during which the CloudMonitor agent collects host monitoring data. Valid values:</p>
             * <ul>
             * <li>0</li>
             * <li>15</li>
             * <li>30</li>
             * <li>60</li>
             * </ul>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder collectTimout(Integer collectTimout) {
                this.collectTimout = collectTimout;
                return this;
            }

            /**
             * <p>The timestamp when the metric import task was created.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1639382496000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the metric import task.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The additional information of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>3607****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The instances where monitoring data is collected in batches.</p>
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
             * <p>The method that is used to aggregate on-premises log data.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;metric&quot;: &quot;metric1&quot;,&quot;filters&quot;: [{&quot;column&quot;: &quot;filed2&quot;,&quot;type&quot;: &quot;include&quot;,&quot;values&quot;: [&quot;222222&quot;]}],&quot;groupBys&quot;: [{&quot;column&quot;: &quot;filed3&quot;,&quot;name&quot;: &quot;filed3&quot;}],&quot;calculates&quot;: [{&quot;column&quot;: &quot;field1&quot;,&quot;name&quot;: &quot;avg&quot;,&quot;type&quot;: &quot;avg&quot;}]},{&quot;metric&quot;: &quot;metric2&quot;,&quot;filters&quot;: [{&quot;column&quot;: &quot;field1&quot;,&quot;type&quot;: &quot;include&quot;,&quot;values&quot;: [&quot;11111&quot;]}],&quot;groupBys&quot;: [{&quot;column&quot;: &quot;filed2&quot;,&quot;name&quot;: &quot;filed2&quot;}],&quot;calculates&quot;: [{&quot;column&quot;: &quot;field1&quot;,&quot;name&quot;: &quot;avg&quot;,&quot;type&quot;: &quot;avg&quot;}]}]</p>
             */
            public Builder logProcess(String logProcess) {
                this.logProcess = logProcess;
                return this;
            }

            /**
             * <p>The sample on-premises log.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;logContent&quot;:&quot;100.116.134.26 1119 - [13/Aug/2019:16:55:46 +0800] POST metrichub-cn-hongkong.aliyun.com /agent/metrics/putLines 200 0 &quot;-&quot; &quot;127.0.0.1:7001&quot; &quot;Go-http-client/1.1&quot; &quot;-&quot; &quot;-&quot; &quot;0a98a21a15656865460656276e&quot;&quot;,&quot;addData&quot;:{&quot;field1&quot;:[&quot;1119&quot;,&quot;1119&quot;],&quot;filed2&quot;:[&quot;POSTx&quot;,&quot;POST&quot;],&quot;filed3&quot;:[&quot;true&quot;,&quot;200&quot;]}}</p>
             */
            public Builder logSample(String logSample) {
                this.logSample = logSample;
                return this;
            }

            /**
             * <p>The result that is returned after on-premises log data is split based on the specified matching mode.</p>
             * <blockquote>
             * <p>The matching modes of on-premises log data include full regex mode, delimiter mode, and JSON mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;: &quot;regex&quot;,&quot;regex&quot;: &quot;\d+\.\d+\.\d+\.\d+\s+(\d+)\s+\S+\s+[\d+/\S+/\d+:\d+:\d+:\d+\s+\+\d+\]\s+(\S+)\s+\S+\s+/\S+/\S+/\S+\s+(\d+)&quot;,&quot;columns&quot;: [{&quot;name&quot;: &quot;field1&quot;},{&quot;name&quot;: &quot;filed2&quot;,&quot;translate&quot;: {&quot;default&quot;: &quot;-&quot;,&quot;mappings&quot;: [{&quot;from&quot;: &quot;(\w+)&quot;,&quot;to&quot;: &quot;$1x&quot;,&quot;type&quot;: &quot;regex&quot;}]}},{&quot;name&quot;: &quot;filed3&quot;,&quot;translate&quot;: {&quot;default&quot;: &quot;-&quot;,&quot;mappings&quot;: [{&quot;from&quot;: &quot;NumberRange(100,300)&quot;,&quot;to&quot;: &quot;true&quot;,&quot;type&quot;: &quot;function&quot;}]}}]}</p>
             */
            public Builder logSplit(String logSplit) {
                this.logSplit = logSplit;
                return this;
            }

            /**
             * <p>The conditions that are used to match the instances in the application group.</p>
             */
            public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
                this.matchExpress = matchExpress;
                return this;
            }

            /**
             * <p>The relationship between the conditions that are used to filter metric import tasks. Valid values:</p>
             * <ul>
             * <li>or</li>
             * <li>and</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>or</p>
             */
            public Builder matchExpressRelation(String matchExpressRelation) {
                this.matchExpressRelation = matchExpressRelation;
                return this;
            }

            /**
             * <p>The namespace to which the host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The network type of the host. Valid values:</p>
             * <ul>
             * <li><code>vpc</code></li>
             * <li><code>Internet</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The configurations of the logs that are imported from Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;express&quot;: [],&quot;filter&quot;: {&quot;filters&quot;: [{&quot;key&quot;: &quot;task_type&quot;,&quot;operator&quot;: &quot;=&quot;,&quot;value&quot;: &quot;1&quot;}]},&quot;groupby&quot;: [{&quot;alias&quot;: &quot;isp&quot;,&quot;key&quot;: &quot;isp&quot;,&quot;sqlKey&quot;: &quot;t.<code>isp</code>&quot;,&quot;valueKey&quot;: &quot;isp&quot;}],&quot;interval&quot;: 60,&quot;labels&quot;: [{&quot;name&quot;: &quot;<strong>cms_app</strong>&quot;,&quot;type&quot;: 0,&quot;value&quot;: &quot;sitemonitor&quot;}],&quot;statistics&quot;: [{&quot;alias&quot;: &quot;http_dns_time_avg&quot;,&quot;function&quot;: &quot;avg&quot;,&quot;key&quot;: &quot;http_dns_time&quot;}]}</p>
             */
            public Builder SLSProcess(String SLSProcess) {
                this.SLSProcess = SLSProcess;
                return this;
            }

            /**
             * <p>The configurations of the logs that are imported from Log Service.</p>
             * <blockquote>
             * <p>This parameter is returned only if the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
             * </blockquote>
             */
            public Builder SLSProcessConfig(SLSProcessConfig SLSProcessConfig) {
                this.SLSProcessConfig = SLSProcessConfig;
                return this;
            }

            /**
             * <p>The ID of the member account.</p>
             * <blockquote>
             * <p>This parameter is displayed only when you call this operation by using a management account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder targetUserId(String targetUserId) {
                this.targetUserId = targetUserId;
                return this;
            }

            /**
             * <p>The ID of the metric import task.</p>
             * 
             * <strong>example:</strong>
             * <p>36****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the metric import task.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_task</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the metric import task. Valid values:</p>
             * <ul>
             * <li>aliyun_fc: metric import tasks for Alibaba Cloud services</li>
             * <li>aliyun_sls: metrics for logs imported from Log Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun_sls</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The region where the host resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder uploadRegion(String uploadRegion) {
                this.uploadRegion = uploadRegion;
                return this;
            }

            /**
             * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
             * <ul>
             * <li>namespace: the namespace of the Alibaba Cloud service.</li>
             * <li>metric_list: the metrics of the Alibaba Cloud service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>products:- namespace: acs_ecs_dashboard metric_info: - metric_list: - cpu_total</p>
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
