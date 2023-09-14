// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorApplicationResponseBody</p>
 */
public class GetDoctorApplicationResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetDoctorApplicationResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorApplicationResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorApplicationResponseBody build() {
            return new GetDoctorApplicationResponseBody(this);
        } 

    } 

    public static class Analysis extends TeaModel {
        @NameInMap("Score")
        private Integer score;

        @NameInMap("Suggestion")
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
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * Suggestion.
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
    public static class MemSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class MemUtilization extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class VcoreSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class VcoreUtilization extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
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
    public static class Metrics extends TeaModel {
        @NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @NameInMap("MemUtilization")
        private MemUtilization memUtilization;

        @NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        @NameInMap("VcoreUtilization")
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
             * MemSeconds.
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
                return this;
            }

            /**
             * MemUtilization.
             */
            public Builder memUtilization(MemUtilization memUtilization) {
                this.memUtilization = memUtilization;
                return this;
            }

            /**
             * VcoreSeconds.
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            /**
             * VcoreUtilization.
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
    public static class Data extends TeaModel {
        @NameInMap("Analysis")
        private Analysis analysis;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Ids")
        private java.util.List < String > ids;

        @NameInMap("Metrics")
        private Metrics metrics;

        @NameInMap("QuerySql")
        private String querySql;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Type")
        private String type;

        @NameInMap("User")
        private String user;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
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
        public java.util.List < String > getIds() {
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
            private String appName; 
            private Long endTime; 
            private java.util.List < String > ids; 
            private Metrics metrics; 
            private String querySql; 
            private String queue; 
            private Long startTime; 
            private String type; 
            private String user; 

            /**
             * Analysis.
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Ids.
             */
            public Builder ids(java.util.List < String > ids) {
                this.ids = ids;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * QuerySql.
             */
            public Builder querySql(String querySql) {
                this.querySql = querySql;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * User.
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
