// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorApplicationsResponseBody</p>
 */
public class ListDoctorApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDoctorApplicationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details of jobs.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorApplicationsResponseBody build() {
            return new ListDoctorApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Analysis(Builder builder) {
            this.score = builder.score;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private Integer score; 
            private String suggestion; 

            /**
             * <p>The score of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The suggestion on executing the job.</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class MemSeconds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MemSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemSeconds create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total memory usage over time in seconds</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>memSeconds</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB * Sec</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>12312312</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MemSeconds build() {
                return new MemSeconds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class MemUtilization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private MemUtilization(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemUtilization create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of used memory to total available memory</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>memUtilization</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.23</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MemUtilization build() {
                return new MemUtilization(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class VcoreSeconds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private VcoreSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreSeconds create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total vcore usage over time in seconds</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>vcoreSeconds</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>VCores * Sec</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>11123</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public VcoreSeconds build() {
                return new VcoreSeconds(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class VcoreUtilization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private VcoreUtilization(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreUtilization create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Float value; 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Ratio of used vcore to total available cores</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>vcoreUtilization</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>23.1</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public VcoreUtilization build() {
                return new VcoreUtilization(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @com.aliyun.core.annotation.NameInMap("MemUtilization")
        private MemUtilization memUtilization;

        @com.aliyun.core.annotation.NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        @com.aliyun.core.annotation.NameInMap("VcoreUtilization")
        private VcoreUtilization vcoreUtilization;

        private Metrics(Builder builder) {
            this.memSeconds = builder.memSeconds;
            this.memUtilization = builder.memUtilization;
            this.vcoreSeconds = builder.vcoreSeconds;
            this.vcoreUtilization = builder.vcoreUtilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return memSeconds
         */
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        /**
         * @return memUtilization
         */
        public MemUtilization getMemUtilization() {
            return this.memUtilization;
        }

        /**
         * @return vcoreSeconds
         */
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        /**
         * @return vcoreUtilization
         */
        public VcoreUtilization getVcoreUtilization() {
            return this.vcoreUtilization;
        }

        public static final class Builder {
            private MemSeconds memSeconds; 
            private MemUtilization memUtilization; 
            private VcoreSeconds vcoreSeconds; 
            private VcoreUtilization vcoreUtilization; 

            /**
             * <p>The amount of memory consumed.</p>
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
                return this;
            }

            /**
             * <p>The memory usage</p>
             */
            public Builder memUtilization(MemUtilization memUtilization) {
                this.memUtilization = memUtilization;
                return this;
            }

            /**
             * <p>The CPU usage.</p>
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * <p>The CPU utilization. This parameter has the same meaning as %CPU in the Linux top command.</p>
             */
            public Builder vcoreUtilization(VcoreUtilization vcoreUtilization) {
                this.vcoreUtilization = vcoreUtilization;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorApplicationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Analysis")
        private Analysis analysis;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List<String> ids;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        @com.aliyun.core.annotation.NameInMap("QuerySql")
        private String querySql;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.endTime = builder.endTime;
            this.ids = builder.ids;
            this.metrics = builder.metrics;
            this.querySql = builder.querySql;
            this.queue = builder.queue;
            this.startTime = builder.startTime;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public Analysis getAnalysis() {
            return this.analysis;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ids
         */
        public java.util.List<String> getIds() {
            return this.ids;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        /**
         * @return querySql
         */
        public String getQuerySql() {
            return this.querySql;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Analysis analysis; 
            private String appId; 
            private String appName; 
            private Long endTime; 
            private java.util.List<String> ids; 
            private Metrics metrics; 
            private String querySql; 
            private String queue; 
            private Long startTime; 
            private String type; 
            private String user; 

            /**
             * <p>The analysis results of the jobs.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The job ID in YARN. The value of QueryID or SessionID is returned for a Hive job.</p>
             * 
             * <strong>example:</strong>
             * <p>application_1665056147236_*****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>data-upload</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The time when the job ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1682049088086</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The job IDs. Multiple job IDs are separated with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder ids(java.util.List<String> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * <p>The data about metrics.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The query statement. This parameter is left empty for non-SQL jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT id, count(1) FROM test group by id;</p>
             */
            public Builder querySql(String querySql) {
                this.querySql = querySql;
                return this;
            }

            /**
             * <p>The YARN queue to which the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>DW</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The time when the job was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1677465658275</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The type of the compute engine.</p>
             * 
             * <strong>example:</strong>
             * <p>TEZ</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The username that was used to submit the job.</p>
             * 
             * <strong>example:</strong>
             * <p>DW</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
