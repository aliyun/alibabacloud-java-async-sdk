// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogMonitorListResponseBody</p>
 */
public class DescribeLogMonitorListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogMonitorList")
    private java.util.List < LogMonitorList> logMonitorList;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Long total;

    private DescribeLogMonitorListResponseBody(Builder builder) {
        this.code = builder.code;
        this.logMonitorList = builder.logMonitorList;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogMonitorListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logMonitorList
     */
    public java.util.List < LogMonitorList> getLogMonitorList() {
        return this.logMonitorList;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < LogMonitorList> logMonitorList; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        /**
         * The returned message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The logical operator that is used between log filter conditions. The ValueFilter and ValueFilterRelation parameters are used in pair. Valid values:
         * <p>
         * 
         * *   and
         * *   or
         */
        public Builder logMonitorList(java.util.List < LogMonitorList> logMonitorList) {
            this.logMonitorList = logMonitorList;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The total number of the returned entries.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The log monitoring metrics.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeLogMonitorListResponseBody build() {
            return new DescribeLogMonitorListResponseBody(this);
        } 

    } 

    public static class ValueFilter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private ValueFilter(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueFilter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * The field value to be matched in the filter condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The method that is used to match the field value. Valid values:
             * <p>
             * 
             * *   contain
             * *   notContain
             * *   `>`: greater than
             * *   `<`: less than
             * *   `>=`: greater than or equal to
             * *   `<=`: less than or equal to
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ValueFilter build() {
                return new ValueFilter(this);
            } 

        } 

    }
    public static class LogMonitorList extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("LogId")
        private Long logId;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("SlsLogstore")
        private String slsLogstore;

        @NameInMap("SlsProject")
        private String slsProject;

        @NameInMap("SlsRegionId")
        private String slsRegionId;

        @NameInMap("ValueFilter")
        private java.util.List < ValueFilter> valueFilter;

        @NameInMap("ValueFilterRelation")
        private String valueFilterRelation;

        private LogMonitorList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.groupId = builder.groupId;
            this.logId = builder.logId;
            this.metricName = builder.metricName;
            this.slsLogstore = builder.slsLogstore;
            this.slsProject = builder.slsProject;
            this.slsRegionId = builder.slsRegionId;
            this.valueFilter = builder.valueFilter;
            this.valueFilterRelation = builder.valueFilterRelation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogMonitorList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return logId
         */
        public Long getLogId() {
            return this.logId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return slsLogstore
         */
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        /**
         * @return slsProject
         */
        public String getSlsProject() {
            return this.slsProject;
        }

        /**
         * @return slsRegionId
         */
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        /**
         * @return valueFilter
         */
        public java.util.List < ValueFilter> getValueFilter() {
            return this.valueFilter;
        }

        /**
         * @return valueFilterRelation
         */
        public String getValueFilterRelation() {
            return this.valueFilterRelation;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long groupId; 
            private Long logId; 
            private String metricName; 
            private String slsLogstore; 
            private String slsProject; 
            private String slsRegionId; 
            private java.util.List < ValueFilter> valueFilter; 
            private String valueFilterRelation; 

            /**
             * The name of the Log Service project.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID returned by Log Service.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the region where the Log Service Logstore resides.
             */
            public Builder logId(Long logId) {
                this.logId = logId;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The name of the log monitoring metric. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements.
             * <p>
             * 
             * If no filter condition is specified, all logs are processed. Assume that logs contain the Level field, which may be set to Error. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * The time when the log monitoring metric was created.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * The name of the log field used for matching in the filter condition.
             */
            public Builder valueFilter(java.util.List < ValueFilter> valueFilter) {
                this.valueFilter = valueFilter;
                return this;
            }

            /**
             * The name of the Log Service Logstore.
             */
            public Builder valueFilterRelation(String valueFilterRelation) {
                this.valueFilterRelation = valueFilterRelation;
                return this;
            }

            public LogMonitorList build() {
                return new LogMonitorList(this);
            } 

        } 

    }
}
