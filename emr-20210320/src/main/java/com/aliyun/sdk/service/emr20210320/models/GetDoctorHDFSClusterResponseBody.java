// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHDFSClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHDFSClusterResponseBody</p>
 */
public class GetDoctorHDFSClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDoctorHDFSClusterResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHDFSClusterResponseBody create() {
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
         * The HDFS analysis results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDoctorHDFSClusterResponseBody build() {
            return new GetDoctorHDFSClusterResponseBody(this);
        } 

    } 

    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HdfsScore")
        private Integer hdfsScore;

        private Analysis(Builder builder) {
            this.hdfsScore = builder.hdfsScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return hdfsScore
         */
        public Integer getHdfsScore() {
            return this.hdfsScore;
        }

        public static final class Builder {
            private Integer hdfsScore; 

            /**
             * The overall score of HDFS storage resources.
             */
            public Builder hdfsScore(Integer hdfsScore) {
                this.hdfsScore = hdfsScore;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    public static class ColdDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataDayGrowthSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdDataDayGrowthSize build() {
                return new ColdDataDayGrowthSize(this);
            } 

        } 

    }
    public static class ColdDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private ColdDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public ColdDataRatio build() {
                return new ColdDataRatio(this);
            } 

        } 

    }
    public static class ColdDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private ColdDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public ColdDataSize build() {
                return new ColdDataSize(this);
            } 

        } 

    }
    public static class ColdDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private ColdDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdDataSizeDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public ColdDataSizeDayGrowthRatio build() {
                return new ColdDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    public static class EmptyFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private EmptyFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public EmptyFileCount build() {
                return new EmptyFileCount(this);
            } 

        } 

    }
    public static class EmptyFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private EmptyFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileCountDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public EmptyFileCountDayGrowthRatio build() {
                return new EmptyFileCountDayGrowthRatio(this);
            } 

        } 

    }
    public static class EmptyFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private EmptyFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileDayGrowthCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public EmptyFileDayGrowthCount build() {
                return new EmptyFileDayGrowthCount(this);
            } 

        } 

    }
    public static class EmptyFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private EmptyFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmptyFileRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public EmptyFileRatio build() {
                return new EmptyFileRatio(this);
            } 

        } 

    }
    public static class FreezeDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private FreezeDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataDayGrowthSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public FreezeDataDayGrowthSize build() {
                return new FreezeDataDayGrowthSize(this);
            } 

        } 

    }
    public static class FreezeDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private FreezeDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public FreezeDataRatio build() {
                return new FreezeDataRatio(this);
            } 

        } 

    }
    public static class FreezeDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private FreezeDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public FreezeDataSize build() {
                return new FreezeDataSize(this);
            } 

        } 

    }
    public static class FreezeDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private FreezeDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FreezeDataSizeDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public FreezeDataSizeDayGrowthRatio build() {
                return new FreezeDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    public static class HotDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private HotDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataDayGrowthSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public HotDataDayGrowthSize build() {
                return new HotDataDayGrowthSize(this);
            } 

        } 

    }
    public static class HotDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private HotDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public HotDataRatio build() {
                return new HotDataRatio(this);
            } 

        } 

    }
    public static class HotDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private HotDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public HotDataSize build() {
                return new HotDataSize(this);
            } 

        } 

    }
    public static class HotDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private HotDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotDataSizeDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public HotDataSizeDayGrowthRatio build() {
                return new HotDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    public static class LargeFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private LargeFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public LargeFileCount build() {
                return new LargeFileCount(this);
            } 

        } 

    }
    public static class LargeFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private LargeFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileCountDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public LargeFileCountDayGrowthRatio build() {
                return new LargeFileCountDayGrowthRatio(this);
            } 

        } 

    }
    public static class LargeFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private LargeFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileDayGrowthCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public LargeFileDayGrowthCount build() {
                return new LargeFileDayGrowthCount(this);
            } 

        } 

    }
    public static class LargeFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private LargeFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LargeFileRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public LargeFileRatio build() {
                return new LargeFileRatio(this);
            } 

        } 

    }
    public static class MediumFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MediumFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MediumFileCount build() {
                return new MediumFileCount(this);
            } 

        } 

    }
    public static class MediumFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private MediumFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileCountDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MediumFileCountDayGrowthRatio build() {
                return new MediumFileCountDayGrowthRatio(this);
            } 

        } 

    }
    public static class MediumFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private MediumFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileDayGrowthCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MediumFileDayGrowthCount build() {
                return new MediumFileDayGrowthCount(this);
            } 

        } 

    }
    public static class MediumFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private MediumFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediumFileRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MediumFileRatio build() {
                return new MediumFileRatio(this);
            } 

        } 

    }
    public static class SmallFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private SmallFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SmallFileCount build() {
                return new SmallFileCount(this);
            } 

        } 

    }
    public static class SmallFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private SmallFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileCountDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public SmallFileCountDayGrowthRatio build() {
                return new SmallFileCountDayGrowthRatio(this);
            } 

        } 

    }
    public static class SmallFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private SmallFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileDayGrowthCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SmallFileDayGrowthCount build() {
                return new SmallFileDayGrowthCount(this);
            } 

        } 

    }
    public static class SmallFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private SmallFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmallFileRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public SmallFileRatio build() {
                return new SmallFileRatio(this);
            } 

        } 

    }
    public static class TinyFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TinyFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TinyFileCount build() {
                return new TinyFileCount(this);
            } 

        } 

    }
    public static class TinyFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TinyFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileCountDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TinyFileCountDayGrowthRatio build() {
                return new TinyFileCountDayGrowthRatio(this);
            } 

        } 

    }
    public static class TinyFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TinyFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileDayGrowthCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TinyFileDayGrowthCount build() {
                return new TinyFileDayGrowthCount(this);
            } 

        } 

    }
    public static class TinyFileRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TinyFileRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TinyFileRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TinyFileRatio build() {
                return new TinyFileRatio(this);
            } 

        } 

    }
    public static class TotalDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataDayGrowthSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDataDayGrowthSize build() {
                return new TotalDataDayGrowthSize(this);
            } 

        } 

    }
    public static class TotalDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalDataSize build() {
                return new TotalDataSize(this);
            } 

        } 

    }
    public static class TotalDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TotalDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDataSizeDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TotalDataSizeDayGrowthRatio build() {
                return new TotalDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    public static class TotalFileCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalFileCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalFileCount build() {
                return new TotalFileCount(this);
            } 

        } 

    }
    public static class TotalFileCountDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TotalFileCountDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileCountDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TotalFileCountDayGrowthRatio build() {
                return new TotalFileCountDayGrowthRatio(this);
            } 

        } 

    }
    public static class TotalFileDayGrowthCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private TotalFileDayGrowthCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalFileDayGrowthCount create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public TotalFileDayGrowthCount build() {
                return new TotalFileDayGrowthCount(this);
            } 

        } 

    }
    public static class WarmDataDayGrowthSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WarmDataDayGrowthSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataDayGrowthSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WarmDataDayGrowthSize build() {
                return new WarmDataDayGrowthSize(this);
            } 

        } 

    }
    public static class WarmDataRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private WarmDataRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public WarmDataRatio build() {
                return new WarmDataRatio(this);
            } 

        } 

    }
    public static class WarmDataSize extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private WarmDataSize(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataSize create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public WarmDataSize build() {
                return new WarmDataSize(this);
            } 

        } 

    }
    public static class WarmDataSizeDayGrowthRatio extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private WarmDataSizeDayGrowthRatio(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmDataSizeDayGrowthRatio create() {
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
             * The description of the metric.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the metric.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The unit of the metric.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * The value of the metric.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public WarmDataSizeDayGrowthRatio build() {
                return new WarmDataSizeDayGrowthRatio(this);
            } 

        } 

    }
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdDataDayGrowthSize")
        private ColdDataDayGrowthSize coldDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("ColdDataRatio")
        private ColdDataRatio coldDataRatio;

        @com.aliyun.core.annotation.NameInMap("ColdDataSize")
        private ColdDataSize coldDataSize;

        @com.aliyun.core.annotation.NameInMap("ColdDataSizeDayGrowthRatio")
        private ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("EmptyFileCount")
        private EmptyFileCount emptyFileCount;

        @com.aliyun.core.annotation.NameInMap("EmptyFileCountDayGrowthRatio")
        private EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("EmptyFileDayGrowthCount")
        private EmptyFileDayGrowthCount emptyFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("EmptyFileRatio")
        private EmptyFileRatio emptyFileRatio;

        @com.aliyun.core.annotation.NameInMap("FreezeDataDayGrowthSize")
        private FreezeDataDayGrowthSize freezeDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("FreezeDataRatio")
        private FreezeDataRatio freezeDataRatio;

        @com.aliyun.core.annotation.NameInMap("FreezeDataSize")
        private FreezeDataSize freezeDataSize;

        @com.aliyun.core.annotation.NameInMap("FreezeDataSizeDayGrowthRatio")
        private FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("HotDataDayGrowthSize")
        private HotDataDayGrowthSize hotDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("HotDataRatio")
        private HotDataRatio hotDataRatio;

        @com.aliyun.core.annotation.NameInMap("HotDataSize")
        private HotDataSize hotDataSize;

        @com.aliyun.core.annotation.NameInMap("HotDataSizeDayGrowthRatio")
        private HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("LargeFileCount")
        private LargeFileCount largeFileCount;

        @com.aliyun.core.annotation.NameInMap("LargeFileCountDayGrowthRatio")
        private LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("LargeFileDayGrowthCount")
        private LargeFileDayGrowthCount largeFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("LargeFileRatio")
        private LargeFileRatio largeFileRatio;

        @com.aliyun.core.annotation.NameInMap("MediumFileCount")
        private MediumFileCount mediumFileCount;

        @com.aliyun.core.annotation.NameInMap("MediumFileCountDayGrowthRatio")
        private MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("MediumFileDayGrowthCount")
        private MediumFileDayGrowthCount mediumFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("MediumFileRatio")
        private MediumFileRatio mediumFileRatio;

        @com.aliyun.core.annotation.NameInMap("SmallFileCount")
        private SmallFileCount smallFileCount;

        @com.aliyun.core.annotation.NameInMap("SmallFileCountDayGrowthRatio")
        private SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("SmallFileDayGrowthCount")
        private SmallFileDayGrowthCount smallFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("SmallFileRatio")
        private SmallFileRatio smallFileRatio;

        @com.aliyun.core.annotation.NameInMap("TinyFileCount")
        private TinyFileCount tinyFileCount;

        @com.aliyun.core.annotation.NameInMap("TinyFileCountDayGrowthRatio")
        private TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TinyFileDayGrowthCount")
        private TinyFileDayGrowthCount tinyFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("TinyFileRatio")
        private TinyFileRatio tinyFileRatio;

        @com.aliyun.core.annotation.NameInMap("TotalDataDayGrowthSize")
        private TotalDataDayGrowthSize totalDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @com.aliyun.core.annotation.NameInMap("TotalDataSizeDayGrowthRatio")
        private TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TotalFileCount")
        private TotalFileCount totalFileCount;

        @com.aliyun.core.annotation.NameInMap("TotalFileCountDayGrowthRatio")
        private TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio;

        @com.aliyun.core.annotation.NameInMap("TotalFileDayGrowthCount")
        private TotalFileDayGrowthCount totalFileDayGrowthCount;

        @com.aliyun.core.annotation.NameInMap("WarmDataDayGrowthSize")
        private WarmDataDayGrowthSize warmDataDayGrowthSize;

        @com.aliyun.core.annotation.NameInMap("WarmDataRatio")
        private WarmDataRatio warmDataRatio;

        @com.aliyun.core.annotation.NameInMap("WarmDataSize")
        private WarmDataSize warmDataSize;

        @com.aliyun.core.annotation.NameInMap("WarmDataSizeDayGrowthRatio")
        private WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio;

        private Metrics(Builder builder) {
            this.coldDataDayGrowthSize = builder.coldDataDayGrowthSize;
            this.coldDataRatio = builder.coldDataRatio;
            this.coldDataSize = builder.coldDataSize;
            this.coldDataSizeDayGrowthRatio = builder.coldDataSizeDayGrowthRatio;
            this.emptyFileCount = builder.emptyFileCount;
            this.emptyFileCountDayGrowthRatio = builder.emptyFileCountDayGrowthRatio;
            this.emptyFileDayGrowthCount = builder.emptyFileDayGrowthCount;
            this.emptyFileRatio = builder.emptyFileRatio;
            this.freezeDataDayGrowthSize = builder.freezeDataDayGrowthSize;
            this.freezeDataRatio = builder.freezeDataRatio;
            this.freezeDataSize = builder.freezeDataSize;
            this.freezeDataSizeDayGrowthRatio = builder.freezeDataSizeDayGrowthRatio;
            this.hotDataDayGrowthSize = builder.hotDataDayGrowthSize;
            this.hotDataRatio = builder.hotDataRatio;
            this.hotDataSize = builder.hotDataSize;
            this.hotDataSizeDayGrowthRatio = builder.hotDataSizeDayGrowthRatio;
            this.largeFileCount = builder.largeFileCount;
            this.largeFileCountDayGrowthRatio = builder.largeFileCountDayGrowthRatio;
            this.largeFileDayGrowthCount = builder.largeFileDayGrowthCount;
            this.largeFileRatio = builder.largeFileRatio;
            this.mediumFileCount = builder.mediumFileCount;
            this.mediumFileCountDayGrowthRatio = builder.mediumFileCountDayGrowthRatio;
            this.mediumFileDayGrowthCount = builder.mediumFileDayGrowthCount;
            this.mediumFileRatio = builder.mediumFileRatio;
            this.smallFileCount = builder.smallFileCount;
            this.smallFileCountDayGrowthRatio = builder.smallFileCountDayGrowthRatio;
            this.smallFileDayGrowthCount = builder.smallFileDayGrowthCount;
            this.smallFileRatio = builder.smallFileRatio;
            this.tinyFileCount = builder.tinyFileCount;
            this.tinyFileCountDayGrowthRatio = builder.tinyFileCountDayGrowthRatio;
            this.tinyFileDayGrowthCount = builder.tinyFileDayGrowthCount;
            this.tinyFileRatio = builder.tinyFileRatio;
            this.totalDataDayGrowthSize = builder.totalDataDayGrowthSize;
            this.totalDataSize = builder.totalDataSize;
            this.totalDataSizeDayGrowthRatio = builder.totalDataSizeDayGrowthRatio;
            this.totalFileCount = builder.totalFileCount;
            this.totalFileCountDayGrowthRatio = builder.totalFileCountDayGrowthRatio;
            this.totalFileDayGrowthCount = builder.totalFileDayGrowthCount;
            this.warmDataDayGrowthSize = builder.warmDataDayGrowthSize;
            this.warmDataRatio = builder.warmDataRatio;
            this.warmDataSize = builder.warmDataSize;
            this.warmDataSizeDayGrowthRatio = builder.warmDataSizeDayGrowthRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return coldDataDayGrowthSize
         */
        public ColdDataDayGrowthSize getColdDataDayGrowthSize() {
            return this.coldDataDayGrowthSize;
        }

        /**
         * @return coldDataRatio
         */
        public ColdDataRatio getColdDataRatio() {
            return this.coldDataRatio;
        }

        /**
         * @return coldDataSize
         */
        public ColdDataSize getColdDataSize() {
            return this.coldDataSize;
        }

        /**
         * @return coldDataSizeDayGrowthRatio
         */
        public ColdDataSizeDayGrowthRatio getColdDataSizeDayGrowthRatio() {
            return this.coldDataSizeDayGrowthRatio;
        }

        /**
         * @return emptyFileCount
         */
        public EmptyFileCount getEmptyFileCount() {
            return this.emptyFileCount;
        }

        /**
         * @return emptyFileCountDayGrowthRatio
         */
        public EmptyFileCountDayGrowthRatio getEmptyFileCountDayGrowthRatio() {
            return this.emptyFileCountDayGrowthRatio;
        }

        /**
         * @return emptyFileDayGrowthCount
         */
        public EmptyFileDayGrowthCount getEmptyFileDayGrowthCount() {
            return this.emptyFileDayGrowthCount;
        }

        /**
         * @return emptyFileRatio
         */
        public EmptyFileRatio getEmptyFileRatio() {
            return this.emptyFileRatio;
        }

        /**
         * @return freezeDataDayGrowthSize
         */
        public FreezeDataDayGrowthSize getFreezeDataDayGrowthSize() {
            return this.freezeDataDayGrowthSize;
        }

        /**
         * @return freezeDataRatio
         */
        public FreezeDataRatio getFreezeDataRatio() {
            return this.freezeDataRatio;
        }

        /**
         * @return freezeDataSize
         */
        public FreezeDataSize getFreezeDataSize() {
            return this.freezeDataSize;
        }

        /**
         * @return freezeDataSizeDayGrowthRatio
         */
        public FreezeDataSizeDayGrowthRatio getFreezeDataSizeDayGrowthRatio() {
            return this.freezeDataSizeDayGrowthRatio;
        }

        /**
         * @return hotDataDayGrowthSize
         */
        public HotDataDayGrowthSize getHotDataDayGrowthSize() {
            return this.hotDataDayGrowthSize;
        }

        /**
         * @return hotDataRatio
         */
        public HotDataRatio getHotDataRatio() {
            return this.hotDataRatio;
        }

        /**
         * @return hotDataSize
         */
        public HotDataSize getHotDataSize() {
            return this.hotDataSize;
        }

        /**
         * @return hotDataSizeDayGrowthRatio
         */
        public HotDataSizeDayGrowthRatio getHotDataSizeDayGrowthRatio() {
            return this.hotDataSizeDayGrowthRatio;
        }

        /**
         * @return largeFileCount
         */
        public LargeFileCount getLargeFileCount() {
            return this.largeFileCount;
        }

        /**
         * @return largeFileCountDayGrowthRatio
         */
        public LargeFileCountDayGrowthRatio getLargeFileCountDayGrowthRatio() {
            return this.largeFileCountDayGrowthRatio;
        }

        /**
         * @return largeFileDayGrowthCount
         */
        public LargeFileDayGrowthCount getLargeFileDayGrowthCount() {
            return this.largeFileDayGrowthCount;
        }

        /**
         * @return largeFileRatio
         */
        public LargeFileRatio getLargeFileRatio() {
            return this.largeFileRatio;
        }

        /**
         * @return mediumFileCount
         */
        public MediumFileCount getMediumFileCount() {
            return this.mediumFileCount;
        }

        /**
         * @return mediumFileCountDayGrowthRatio
         */
        public MediumFileCountDayGrowthRatio getMediumFileCountDayGrowthRatio() {
            return this.mediumFileCountDayGrowthRatio;
        }

        /**
         * @return mediumFileDayGrowthCount
         */
        public MediumFileDayGrowthCount getMediumFileDayGrowthCount() {
            return this.mediumFileDayGrowthCount;
        }

        /**
         * @return mediumFileRatio
         */
        public MediumFileRatio getMediumFileRatio() {
            return this.mediumFileRatio;
        }

        /**
         * @return smallFileCount
         */
        public SmallFileCount getSmallFileCount() {
            return this.smallFileCount;
        }

        /**
         * @return smallFileCountDayGrowthRatio
         */
        public SmallFileCountDayGrowthRatio getSmallFileCountDayGrowthRatio() {
            return this.smallFileCountDayGrowthRatio;
        }

        /**
         * @return smallFileDayGrowthCount
         */
        public SmallFileDayGrowthCount getSmallFileDayGrowthCount() {
            return this.smallFileDayGrowthCount;
        }

        /**
         * @return smallFileRatio
         */
        public SmallFileRatio getSmallFileRatio() {
            return this.smallFileRatio;
        }

        /**
         * @return tinyFileCount
         */
        public TinyFileCount getTinyFileCount() {
            return this.tinyFileCount;
        }

        /**
         * @return tinyFileCountDayGrowthRatio
         */
        public TinyFileCountDayGrowthRatio getTinyFileCountDayGrowthRatio() {
            return this.tinyFileCountDayGrowthRatio;
        }

        /**
         * @return tinyFileDayGrowthCount
         */
        public TinyFileDayGrowthCount getTinyFileDayGrowthCount() {
            return this.tinyFileDayGrowthCount;
        }

        /**
         * @return tinyFileRatio
         */
        public TinyFileRatio getTinyFileRatio() {
            return this.tinyFileRatio;
        }

        /**
         * @return totalDataDayGrowthSize
         */
        public TotalDataDayGrowthSize getTotalDataDayGrowthSize() {
            return this.totalDataDayGrowthSize;
        }

        /**
         * @return totalDataSize
         */
        public TotalDataSize getTotalDataSize() {
            return this.totalDataSize;
        }

        /**
         * @return totalDataSizeDayGrowthRatio
         */
        public TotalDataSizeDayGrowthRatio getTotalDataSizeDayGrowthRatio() {
            return this.totalDataSizeDayGrowthRatio;
        }

        /**
         * @return totalFileCount
         */
        public TotalFileCount getTotalFileCount() {
            return this.totalFileCount;
        }

        /**
         * @return totalFileCountDayGrowthRatio
         */
        public TotalFileCountDayGrowthRatio getTotalFileCountDayGrowthRatio() {
            return this.totalFileCountDayGrowthRatio;
        }

        /**
         * @return totalFileDayGrowthCount
         */
        public TotalFileDayGrowthCount getTotalFileDayGrowthCount() {
            return this.totalFileDayGrowthCount;
        }

        /**
         * @return warmDataDayGrowthSize
         */
        public WarmDataDayGrowthSize getWarmDataDayGrowthSize() {
            return this.warmDataDayGrowthSize;
        }

        /**
         * @return warmDataRatio
         */
        public WarmDataRatio getWarmDataRatio() {
            return this.warmDataRatio;
        }

        /**
         * @return warmDataSize
         */
        public WarmDataSize getWarmDataSize() {
            return this.warmDataSize;
        }

        /**
         * @return warmDataSizeDayGrowthRatio
         */
        public WarmDataSizeDayGrowthRatio getWarmDataSizeDayGrowthRatio() {
            return this.warmDataSizeDayGrowthRatio;
        }

        public static final class Builder {
            private ColdDataDayGrowthSize coldDataDayGrowthSize; 
            private ColdDataRatio coldDataRatio; 
            private ColdDataSize coldDataSize; 
            private ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio; 
            private EmptyFileCount emptyFileCount; 
            private EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio; 
            private EmptyFileDayGrowthCount emptyFileDayGrowthCount; 
            private EmptyFileRatio emptyFileRatio; 
            private FreezeDataDayGrowthSize freezeDataDayGrowthSize; 
            private FreezeDataRatio freezeDataRatio; 
            private FreezeDataSize freezeDataSize; 
            private FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio; 
            private HotDataDayGrowthSize hotDataDayGrowthSize; 
            private HotDataRatio hotDataRatio; 
            private HotDataSize hotDataSize; 
            private HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio; 
            private LargeFileCount largeFileCount; 
            private LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio; 
            private LargeFileDayGrowthCount largeFileDayGrowthCount; 
            private LargeFileRatio largeFileRatio; 
            private MediumFileCount mediumFileCount; 
            private MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio; 
            private MediumFileDayGrowthCount mediumFileDayGrowthCount; 
            private MediumFileRatio mediumFileRatio; 
            private SmallFileCount smallFileCount; 
            private SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio; 
            private SmallFileDayGrowthCount smallFileDayGrowthCount; 
            private SmallFileRatio smallFileRatio; 
            private TinyFileCount tinyFileCount; 
            private TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio; 
            private TinyFileDayGrowthCount tinyFileDayGrowthCount; 
            private TinyFileRatio tinyFileRatio; 
            private TotalDataDayGrowthSize totalDataDayGrowthSize; 
            private TotalDataSize totalDataSize; 
            private TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio; 
            private TotalFileCount totalFileCount; 
            private TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio; 
            private TotalFileDayGrowthCount totalFileDayGrowthCount; 
            private WarmDataDayGrowthSize warmDataDayGrowthSize; 
            private WarmDataRatio warmDataRatio; 
            private WarmDataSize warmDataSize; 
            private WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio; 

            /**
             * The daily increment of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.
             */
            public Builder coldDataDayGrowthSize(ColdDataDayGrowthSize coldDataDayGrowthSize) {
                this.coldDataDayGrowthSize = coldDataDayGrowthSize;
                return this;
            }

            /**
             * The proportion of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.
             */
            public Builder coldDataRatio(ColdDataRatio coldDataRatio) {
                this.coldDataRatio = coldDataRatio;
                return this;
            }

            /**
             * The amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.
             */
            public Builder coldDataSize(ColdDataSize coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * The day-to-day growth rate of the amount of cold data. Cold data refers to data that is not accessed for more than 30 days but is accessed in 90 days.
             */
            public Builder coldDataSizeDayGrowthRatio(ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio) {
                this.coldDataSizeDayGrowthRatio = coldDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * The number of empty files. Empty files are those with a size of 0 MB.
             */
            public Builder emptyFileCount(EmptyFileCount emptyFileCount) {
                this.emptyFileCount = emptyFileCount;
                return this;
            }

            /**
             * The day-to-day growth rate of the number of empty files. Empty files are those with a size of 0 MB.
             */
            public Builder emptyFileCountDayGrowthRatio(EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio) {
                this.emptyFileCountDayGrowthRatio = emptyFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the number of empty files. Empty files are those with a size of 0 MB.
             */
            public Builder emptyFileDayGrowthCount(EmptyFileDayGrowthCount emptyFileDayGrowthCount) {
                this.emptyFileDayGrowthCount = emptyFileDayGrowthCount;
                return this;
            }

            /**
             * The proportion of empty files. Empty files are those with a size of 0 MB.
             */
            public Builder emptyFileRatio(EmptyFileRatio emptyFileRatio) {
                this.emptyFileRatio = emptyFileRatio;
                return this;
            }

            /**
             * The daily increment of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
             */
            public Builder freezeDataDayGrowthSize(FreezeDataDayGrowthSize freezeDataDayGrowthSize) {
                this.freezeDataDayGrowthSize = freezeDataDayGrowthSize;
                return this;
            }

            /**
             * The proportion of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
             */
            public Builder freezeDataRatio(FreezeDataRatio freezeDataRatio) {
                this.freezeDataRatio = freezeDataRatio;
                return this;
            }

            /**
             * The amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
             */
            public Builder freezeDataSize(FreezeDataSize freezeDataSize) {
                this.freezeDataSize = freezeDataSize;
                return this;
            }

            /**
             * The day-to-day growth rate of the amount of very cold data. Very cold data refers to data that is not accessed for more than 90 days.
             */
            public Builder freezeDataSizeDayGrowthRatio(FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio) {
                this.freezeDataSizeDayGrowthRatio = freezeDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the amount of hot data. Hot data refers to data that is accessed in recent seven days.
             */
            public Builder hotDataDayGrowthSize(HotDataDayGrowthSize hotDataDayGrowthSize) {
                this.hotDataDayGrowthSize = hotDataDayGrowthSize;
                return this;
            }

            /**
             * The proportion of hot data. Hot data refers to data that is accessed in recent seven days.
             */
            public Builder hotDataRatio(HotDataRatio hotDataRatio) {
                this.hotDataRatio = hotDataRatio;
                return this;
            }

            /**
             * The amount of hot data. Hot data refers to data that is accessed in recent seven days.
             */
            public Builder hotDataSize(HotDataSize hotDataSize) {
                this.hotDataSize = hotDataSize;
                return this;
            }

            /**
             * The day-to-day growth rate of the amount of hot data. Hot data refers to data that is accessed in recent seven days.
             */
            public Builder hotDataSizeDayGrowthRatio(HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio) {
                this.hotDataSizeDayGrowthRatio = hotDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * The number of large files. Large files are those with a size greater than 1 GB.
             */
            public Builder largeFileCount(LargeFileCount largeFileCount) {
                this.largeFileCount = largeFileCount;
                return this;
            }

            /**
             * The day-to-day growth rate of the number of large files. Large files are those with a size greater than 1 GB.
             */
            public Builder largeFileCountDayGrowthRatio(LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio) {
                this.largeFileCountDayGrowthRatio = largeFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the number of large files. Large files are those with a size greater than 1 GB.
             */
            public Builder largeFileDayGrowthCount(LargeFileDayGrowthCount largeFileDayGrowthCount) {
                this.largeFileDayGrowthCount = largeFileDayGrowthCount;
                return this;
            }

            /**
             * The proportion of large files. Large files are those with a size greater than 1 GB.
             */
            public Builder largeFileRatio(LargeFileRatio largeFileRatio) {
                this.largeFileRatio = largeFileRatio;
                return this;
            }

            /**
             * The number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
             */
            public Builder mediumFileCount(MediumFileCount mediumFileCount) {
                this.mediumFileCount = mediumFileCount;
                return this;
            }

            /**
             * The day-to-day growth rate of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
             */
            public Builder mediumFileCountDayGrowthRatio(MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio) {
                this.mediumFileCountDayGrowthRatio = mediumFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the number of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
             */
            public Builder mediumFileDayGrowthCount(MediumFileDayGrowthCount mediumFileDayGrowthCount) {
                this.mediumFileDayGrowthCount = mediumFileDayGrowthCount;
                return this;
            }

            /**
             * The proportion of medium files. Medium files are those with a size greater than or equal to 128 MB and less than or equal to 1 GB.
             */
            public Builder mediumFileRatio(MediumFileRatio mediumFileRatio) {
                this.mediumFileRatio = mediumFileRatio;
                return this;
            }

            /**
             * The number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
             */
            public Builder smallFileCount(SmallFileCount smallFileCount) {
                this.smallFileCount = smallFileCount;
                return this;
            }

            /**
             * The day-to-day growth rate of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
             */
            public Builder smallFileCountDayGrowthRatio(SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio) {
                this.smallFileCountDayGrowthRatio = smallFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the number of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
             */
            public Builder smallFileDayGrowthCount(SmallFileDayGrowthCount smallFileDayGrowthCount) {
                this.smallFileDayGrowthCount = smallFileDayGrowthCount;
                return this;
            }

            /**
             * The proportion of small files. Small files are those with a size greater than or equal to 10 MB and less than 128 MB.
             */
            public Builder smallFileRatio(SmallFileRatio smallFileRatio) {
                this.smallFileRatio = smallFileRatio;
                return this;
            }

            /**
             * The number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
             */
            public Builder tinyFileCount(TinyFileCount tinyFileCount) {
                this.tinyFileCount = tinyFileCount;
                return this;
            }

            /**
             * The day-to-day growth rate of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
             */
            public Builder tinyFileCountDayGrowthRatio(TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio) {
                this.tinyFileCountDayGrowthRatio = tinyFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the number of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
             */
            public Builder tinyFileDayGrowthCount(TinyFileDayGrowthCount tinyFileDayGrowthCount) {
                this.tinyFileDayGrowthCount = tinyFileDayGrowthCount;
                return this;
            }

            /**
             * The proportion of very small files. Very small files are those with a size greater than 0 MB and less than 10 MB.
             */
            public Builder tinyFileRatio(TinyFileRatio tinyFileRatio) {
                this.tinyFileRatio = tinyFileRatio;
                return this;
            }

            /**
             * The daily incremental of the total data volume.
             */
            public Builder totalDataDayGrowthSize(TotalDataDayGrowthSize totalDataDayGrowthSize) {
                this.totalDataDayGrowthSize = totalDataDayGrowthSize;
                return this;
            }

            /**
             * The total amount of data.
             */
            public Builder totalDataSize(TotalDataSize totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * The day-to-day growth rate of the total data volume.
             */
            public Builder totalDataSizeDayGrowthRatio(TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio) {
                this.totalDataSizeDayGrowthRatio = totalDataSizeDayGrowthRatio;
                return this;
            }

            /**
             * The total number of files.
             */
            public Builder totalFileCount(TotalFileCount totalFileCount) {
                this.totalFileCount = totalFileCount;
                return this;
            }

            /**
             * The day-to-day growth rate of the total number of files.
             */
            public Builder totalFileCountDayGrowthRatio(TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio) {
                this.totalFileCountDayGrowthRatio = totalFileCountDayGrowthRatio;
                return this;
            }

            /**
             * The daily increment of the total number of files.
             */
            public Builder totalFileDayGrowthCount(TotalFileDayGrowthCount totalFileDayGrowthCount) {
                this.totalFileDayGrowthCount = totalFileDayGrowthCount;
                return this;
            }

            /**
             * The daily increment of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.
             */
            public Builder warmDataDayGrowthSize(WarmDataDayGrowthSize warmDataDayGrowthSize) {
                this.warmDataDayGrowthSize = warmDataDayGrowthSize;
                return this;
            }

            /**
             * The proportion of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.
             */
            public Builder warmDataRatio(WarmDataRatio warmDataRatio) {
                this.warmDataRatio = warmDataRatio;
                return this;
            }

            /**
             * The amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.
             */
            public Builder warmDataSize(WarmDataSize warmDataSize) {
                this.warmDataSize = warmDataSize;
                return this;
            }

            /**
             * The day-to-day growth rate of the amount of warm data. Warm data refers to data that is not accessed for more than 7 days but is accessed in 30 days.
             */
            public Builder warmDataSizeDayGrowthRatio(WarmDataSizeDayGrowthRatio warmDataSizeDayGrowthRatio) {
                this.warmDataSizeDayGrowthRatio = warmDataSizeDayGrowthRatio;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
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
             * The analysis results.
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * The metric information.
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
