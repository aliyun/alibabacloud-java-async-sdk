// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLogMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogMonitorListResponseBody</p>
 */
public class DescribeLogMonitorListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogMonitorList")
    private java.util.List < LogMonitorList> logMonitorList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call was successful.</p>
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
         * <p>The log monitoring metrics.</p>
         */
        public Builder logMonitorList(java.util.List < LogMonitorList> logMonitorList) {
            this.logMonitorList = logMonitorList;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01E90080-4300-4FAA-B9AE-161956BC350D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeLogMonitorListResponseBody build() {
            return new DescribeLogMonitorListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogMonitorListResponseBody</p>
     */
    public static class ValueFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The name of the log field used for matching in the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The method that is used to match the field value. Valid values:</p>
             * <ul>
             * <li>contain</li>
             * <li>notContain</li>
             * <li><code>&gt;</code>: greater than</li>
             * <li><code>&lt;</code>: less than</li>
             * <li><code>&gt;=</code>: greater than or equal to</li>
             * <li><code>&lt;=</code>: less than or equal to</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>contain</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The field value to be matched in the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>portal</p>
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
    /**
     * 
     * {@link DescribeLogMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogMonitorListResponseBody</p>
     */
    public static class LogMonitorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("LogId")
        private Long logId;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("SlsLogstore")
        private String slsLogstore;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        @com.aliyun.core.annotation.NameInMap("SlsRegionId")
        private String slsRegionId;

        @com.aliyun.core.annotation.NameInMap("ValueFilter")
        private java.util.List < ValueFilter> valueFilter;

        @com.aliyun.core.annotation.NameInMap("ValueFilterRelation")
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
             * <p>The time when the log monitoring metric was created.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1577766395000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID returned by Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder logId(Long logId) {
                this.logId = logId;
                return this;
            }

            /**
             * <p>The name of the log monitoring metric. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The name of the Log Service Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>testSlS****</p>
             */
            public Builder slsLogstore(String slsLogstore) {
                this.slsLogstore = slsLogstore;
                return this;
            }

            /**
             * <p>The name of the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>sls-project-test****</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * <p>The ID of the region where the Log Service Logstore resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder slsRegionId(String slsRegionId) {
                this.slsRegionId = slsRegionId;
                return this;
            }

            /**
             * <p>The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements.</p>
             * <p>If no filter condition is specified, all logs are processed. Assume that logs contain the Level field, which may be set to Error. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.</p>
             */
            public Builder valueFilter(java.util.List < ValueFilter> valueFilter) {
                this.valueFilter = valueFilter;
                return this;
            }

            /**
             * <p>The logical operator that is used between log filter conditions. The ValueFilter and ValueFilterRelation parameters are used in pair. Valid values:</p>
             * <ul>
             * <li>and</li>
             * <li>or</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>and</p>
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
