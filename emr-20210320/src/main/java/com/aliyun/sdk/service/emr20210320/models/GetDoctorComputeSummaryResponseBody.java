// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorComputeSummaryResponseBody</p>
 */
public class GetDoctorComputeSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorComputeSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorComputeSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The details of resource usage.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetDoctorComputeSummaryResponseBody build() {
            return new GetDoctorComputeSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
             * <p>234</p>
             */
            public Builder needAttentionJobCount(Long needAttentionJobCount) {
                this.needAttentionJobCount = needAttentionJobCount;
                return this;
            }

            /**
             * <p>The score for jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The day-to-day growth rate of the score for jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
             */
            public Builder scoreDayGrowthRatio(Float scoreDayGrowthRatio) {
                this.scoreDayGrowthRatio = scoreDayGrowthRatio;
                return this;
            }

            /**
             * <p>The total number of sub-healthy jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>1123</p>
             */
            public Builder subHealthyJobCount(Long subHealthyJobCount) {
                this.subHealthyJobCount = subHealthyJobCount;
                return this;
            }

            /**
             * <p>The total number of unhealthy jobs.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
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
     * {@link GetDoctorComputeSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Analysis")
        private Analysis analysis;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private Metrics metrics;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
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
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        public static final class Builder {
            private Analysis analysis; 
            private Metrics metrics; 

            /**
             * <p>The resource analysis information.</p>
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * <p>The metrics.</p>
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
