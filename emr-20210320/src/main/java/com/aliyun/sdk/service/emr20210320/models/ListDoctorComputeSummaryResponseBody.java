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
 * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorComputeSummaryResponseBody</p>
 */
public class ListDoctorComputeSummaryResponseBody extends TeaModel {
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

    private ListDoctorComputeSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorComputeSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDoctorComputeSummaryResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of resource usage.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries that are returned.</p>
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

        public ListDoctorComputeSummaryResponseBody build() {
            return new ListDoctorComputeSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthyJobCount")
        private Long healthyJobCount;

        @com.aliyun.core.annotation.NameInMap("NeedAttentionJobCount")
        private Long needAttentionJobCount;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("ScoreDayGrowthRatio")
        private Float scoreDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("SubHealthyJobCount")
        private Long subHealthyJobCount;

        @com.aliyun.core.annotation.NameInMap("UnhealthyJobCount")
        private Long unhealthyJobCount;

        private Analysis(Builder builder) {
            this.healthyJobCount = builder.healthyJobCount;
            this.needAttentionJobCount = builder.needAttentionJobCount;
            this.score = builder.score;
            this.scoreDayGrowthRatio = builder.scoreDayGrowthRatio;
            this.subHealthyJobCount = builder.subHealthyJobCount;
            this.unhealthyJobCount = builder.unhealthyJobCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return healthyJobCount
         */
        public Long getHealthyJobCount() {
            return this.healthyJobCount;
        }

        /**
         * @return needAttentionJobCount
         */
        public Long getNeedAttentionJobCount() {
            return this.needAttentionJobCount;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return scoreDayGrowthRatio
         */
        public Float getScoreDayGrowthRatio() {
            return this.scoreDayGrowthRatio;
        }

        /**
         * @return subHealthyJobCount
         */
        public Long getSubHealthyJobCount() {
            return this.subHealthyJobCount;
        }

        /**
         * @return unhealthyJobCount
         */
        public Long getUnhealthyJobCount() {
            return this.unhealthyJobCount;
        }

        public static final class Builder {
            private Long healthyJobCount; 
            private Long needAttentionJobCount; 
            private Integer score; 
            private Float scoreDayGrowthRatio; 
            private Long subHealthyJobCount; 
            private Long unhealthyJobCount; 

            private Builder() {
            } 

            private Builder(Analysis model) {
                this.healthyJobCount = model.healthyJobCount;
                this.needAttentionJobCount = model.needAttentionJobCount;
                this.score = model.score;
                this.scoreDayGrowthRatio = model.scoreDayGrowthRatio;
                this.subHealthyJobCount = model.subHealthyJobCount;
                this.unhealthyJobCount = model.unhealthyJobCount;
            } 

            /**
             * <p>The total number of healthy jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder healthyJobCount(Long healthyJobCount) {
                this.healthyJobCount = healthyJobCount;
                return this;
            }

            /**
             * <p>The total number of jobs that require attention.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder needAttentionJobCount(Long needAttentionJobCount) {
                this.needAttentionJobCount = needAttentionJobCount;
                return this;
            }

            /**
             * <p>The score for jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the score for jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.03</p>
             */
            public Builder scoreDayGrowthRatio(Float scoreDayGrowthRatio) {
                this.scoreDayGrowthRatio = scoreDayGrowthRatio;
                return this;
            }

            /**
             * <p>The total number of sub-healthy jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder subHealthyJobCount(Long subHealthyJobCount) {
                this.subHealthyJobCount = subHealthyJobCount;
                return this;
            }

            /**
             * <p>The total number of unhealthy jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder unhealthyJobCount(Long unhealthyJobCount) {
                this.unhealthyJobCount = unhealthyJobCount;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MemSeconds model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

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
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class MemSecondsDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private MemSecondsDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemSecondsDayGrowthRatio create() {
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

            private Builder() {
            } 

            private Builder(MemSecondsDayGrowthRatio model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Growth ratio of memory usage in seconds per day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>memSecondsDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.36</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MemSecondsDayGrowthRatio build() {
                return new MemSecondsDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MemUtilization model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

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
             * <p>“”</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.82</p>
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
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class ReadSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ReadSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReadSize create() {
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

            private Builder() {
            } 

            private Builder(ReadSize model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total cumulative size of data read in megabytes (MB)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>readSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>504888659968</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ReadSize build() {
                return new ReadSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VcoreSeconds model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

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
             * <p>1231412</p>
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
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class VcoreSecondsDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private VcoreSecondsDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreSecondsDayGrowthRatio create() {
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

            private Builder() {
            } 

            private Builder(VcoreSecondsDayGrowthRatio model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Growth ratio of virtual core usage in seconds per day</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>vcoreSecondsDayGrowthRatio</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0.22</p>
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public VcoreSecondsDayGrowthRatio build() {
                return new VcoreSecondsDayGrowthRatio(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(VcoreUtilization model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

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
             * <p>“”</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>32.1</p>
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
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class WriteSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WriteSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WriteSize create() {
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

            private Builder() {
            } 

            private Builder(WriteSize model) {
                this.description = model.description;
                this.name = model.name;
                this.unit = model.unit;
                this.value = model.value;
            } 

            /**
             * <p>The description of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>Total cumulative size of data written in megabytes (MB)</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>writeSize</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The unit of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>MB</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>6294093393920</p>
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WriteSize build() {
                return new WriteSize(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @com.aliyun.core.annotation.NameInMap("MemSecondsDayGrowthRatio")
        private MemSecondsDayGrowthRatio memSecondsDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("MemUtilization")
        private MemUtilization memUtilization;

        @com.aliyun.core.annotation.NameInMap("ReadSize")
        private ReadSize readSize;

        @com.aliyun.core.annotation.NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        @com.aliyun.core.annotation.NameInMap("VcoreSecondsDayGrowthRatio")
        private VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("VcoreUtilization")
        private VcoreUtilization vcoreUtilization;

        @com.aliyun.core.annotation.NameInMap("WriteSize")
        private WriteSize writeSize;

        private Metrics(Builder builder) {
            this.memSeconds = builder.memSeconds;
            this.memSecondsDayGrowthRatio = builder.memSecondsDayGrowthRatio;
            this.memUtilization = builder.memUtilization;
            this.readSize = builder.readSize;
            this.vcoreSeconds = builder.vcoreSeconds;
            this.vcoreSecondsDayGrowthRatio = builder.vcoreSecondsDayGrowthRatio;
            this.vcoreUtilization = builder.vcoreUtilization;
            this.writeSize = builder.writeSize;
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
         * @return memSecondsDayGrowthRatio
         */
        public MemSecondsDayGrowthRatio getMemSecondsDayGrowthRatio() {
            return this.memSecondsDayGrowthRatio;
        }

        /**
         * @return memUtilization
         */
        public MemUtilization getMemUtilization() {
            return this.memUtilization;
        }

        /**
         * @return readSize
         */
        public ReadSize getReadSize() {
            return this.readSize;
        }

        /**
         * @return vcoreSeconds
         */
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        /**
         * @return vcoreSecondsDayGrowthRatio
         */
        public VcoreSecondsDayGrowthRatio getVcoreSecondsDayGrowthRatio() {
            return this.vcoreSecondsDayGrowthRatio;
        }

        /**
         * @return vcoreUtilization
         */
        public VcoreUtilization getVcoreUtilization() {
            return this.vcoreUtilization;
        }

        /**
         * @return writeSize
         */
        public WriteSize getWriteSize() {
            return this.writeSize;
        }

        public static final class Builder {
            private MemSeconds memSeconds; 
            private MemSecondsDayGrowthRatio memSecondsDayGrowthRatio; 
            private MemUtilization memUtilization; 
            private ReadSize readSize; 
            private VcoreSeconds vcoreSeconds; 
            private VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio; 
            private VcoreUtilization vcoreUtilization; 
            private WriteSize writeSize; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.memSeconds = model.memSeconds;
                this.memSecondsDayGrowthRatio = model.memSecondsDayGrowthRatio;
                this.memUtilization = model.memUtilization;
                this.readSize = model.readSize;
                this.vcoreSeconds = model.vcoreSeconds;
                this.vcoreSecondsDayGrowthRatio = model.vcoreSecondsDayGrowthRatio;
                this.vcoreUtilization = model.vcoreUtilization;
                this.writeSize = model.writeSize;
            } 

            /**
             * <p>The total memory consumption over time in seconds.</p>
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the total memory consumption over time in seconds.</p>
             */
            public Builder memSecondsDayGrowthRatio(MemSecondsDayGrowthRatio memSecondsDayGrowthRatio) {
                this.memSecondsDayGrowthRatio = memSecondsDayGrowthRatio;
                return this;
            }

            /**
             * <p>The average memory usage.</p>
             */
            public Builder memUtilization(MemUtilization memUtilization) {
                this.memUtilization = memUtilization;
                return this;
            }

            /**
             * <p>The total amount of data read from the file system.</p>
             */
            public Builder readSize(ReadSize readSize) {
                this.readSize = readSize;
                return this;
            }

            /**
             * <p>The total CPU consumption over time in seconds.</p>
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the total CPU consumption over time in seconds.</p>
             */
            public Builder vcoreSecondsDayGrowthRatio(VcoreSecondsDayGrowthRatio vcoreSecondsDayGrowthRatio) {
                this.vcoreSecondsDayGrowthRatio = vcoreSecondsDayGrowthRatio;
                return this;
            }

            /**
             * <p>The average CPU utilization. The meaning is the same as the %CPU parameter in the output of the top command in Linux.</p>
             */
            public Builder vcoreUtilization(VcoreUtilization vcoreUtilization) {
                this.vcoreUtilization = vcoreUtilization;
                return this;
            }

            /**
             * <p>The total amount of data written to the file system.</p>
             */
            public Builder writeSize(WriteSize writeSize) {
                this.writeSize = writeSize;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDoctorComputeSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Analysis")
        private Analysis analysis;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.componentName = builder.componentName;
            this.metrics = builder.metrics;
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
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private Analysis analysis; 
            private String componentName; 
            private Metrics metrics; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysis = model.analysis;
                this.componentName = model.componentName;
                this.metrics = model.metrics;
            } 

            /**
             * <p>The resource analysis results.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The name of the resource whose details are obtained based on the value of ComponentTypes. For example, if the value of ComponentTypes is Queue, the value of this parameter is a queue, such as DW.</p>
             * 
             * <strong>example:</strong>
             * <p>DW</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>The metric information.</p>
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
