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
 * {@link ListDoctorJobsStatsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorJobsStatsResponseBody</p>
 */
public class ListDoctorJobsStatsResponseBody extends TeaModel {
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

    private ListDoctorJobsStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorJobsStatsResponseBody create() {
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
         * <p>The summary of job information.</p>
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

        public ListDoctorJobsStatsResponseBody build() {
            return new ListDoctorJobsStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDoctorJobsStatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsStatsResponseBody</p>
     */
    public static class AppsCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private AppsCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppsCount create() {
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
             * <p>Total apps count</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>appsCount</p>
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
             * <p>123</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public AppsCount build() {
                return new AppsCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorJobsStatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsStatsResponseBody</p>
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
     * {@link ListDoctorJobsStatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsStatsResponseBody</p>
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
     * {@link ListDoctorJobsStatsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorJobsStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppsCount")
        private AppsCount appsCount;

        @com.aliyun.core.annotation.NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        private Data(Builder builder) {
            this.appsCount = builder.appsCount;
            this.memSeconds = builder.memSeconds;
            this.queue = builder.queue;
            this.type = builder.type;
            this.user = builder.user;
            this.vcoreSeconds = builder.vcoreSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appsCount
         */
        public AppsCount getAppsCount() {
            return this.appsCount;
        }

        /**
         * @return memSeconds
         */
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
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

        /**
         * @return vcoreSeconds
         */
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public static final class Builder {
            private AppsCount appsCount; 
            private MemSeconds memSeconds; 
            private String queue; 
            private String type; 
            private String user; 
            private VcoreSeconds vcoreSeconds; 

            /**
             * <p>The total number of jobs.</p>
             */
            public Builder appsCount(AppsCount appsCount) {
                this.appsCount = appsCount;
                return this;
            }

            /**
             * <p>The aggregated amount of memory that is allocated to the job multiplied by the number of seconds the job has been running.</p>
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
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
             * <p>The type of the compute engine.</p>
             * 
             * <strong>example:</strong>
             * <p>SPARK</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The username that is used to submit the job.</p>
             * 
             * <strong>example:</strong>
             * <p>DW</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The aggregated number of vCPUs that are allocated to the job multiplied by the number of seconds the job has been running.</p>
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
