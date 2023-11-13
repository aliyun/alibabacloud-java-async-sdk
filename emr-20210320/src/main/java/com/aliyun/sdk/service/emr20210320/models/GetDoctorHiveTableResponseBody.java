// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDoctorHiveTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorHiveTableResponseBody</p>
 */
public class GetDoctorHiveTableResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetDoctorHiveTableResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorHiveTableResponseBody create() {
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
         * The analysis results of the Hive table.
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

        public GetDoctorHiveTableResponseBody build() {
            return new GetDoctorHiveTableResponseBody(this);
        } 

    } 

    public static class Analysis extends TeaModel {
        @NameInMap("HiveDistributionScore")
        private Integer hiveDistributionScore;

        @NameInMap("HiveFormatScore")
        private Integer hiveFormatScore;

        @NameInMap("HiveFrequencyScore")
        private Integer hiveFrequencyScore;

        @NameInMap("HiveScore")
        private Integer hiveScore;

        private Analysis(Builder builder) {
            this.hiveDistributionScore = builder.hiveDistributionScore;
            this.hiveFormatScore = builder.hiveFormatScore;
            this.hiveFrequencyScore = builder.hiveFrequencyScore;
            this.hiveScore = builder.hiveScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return hiveDistributionScore
         */
        public Integer getHiveDistributionScore() {
            return this.hiveDistributionScore;
        }

        /**
         * @return hiveFormatScore
         */
        public Integer getHiveFormatScore() {
            return this.hiveFormatScore;
        }

        /**
         * @return hiveFrequencyScore
         */
        public Integer getHiveFrequencyScore() {
            return this.hiveFrequencyScore;
        }

        /**
         * @return hiveScore
         */
        public Integer getHiveScore() {
            return this.hiveScore;
        }

        public static final class Builder {
            private Integer hiveDistributionScore; 
            private Integer hiveFormatScore; 
            private Integer hiveFrequencyScore; 
            private Integer hiveScore; 

            /**
             * The score for the distribution of files of different sizes stored in the Hive table.
             */
            public Builder hiveDistributionScore(Integer hiveDistributionScore) {
                this.hiveDistributionScore = hiveDistributionScore;
                return this;
            }

            /**
             * The score for the distribution of files stored in different formats in the Hive table.
             */
            public Builder hiveFormatScore(Integer hiveFormatScore) {
                this.hiveFormatScore = hiveFormatScore;
                return this;
            }

            /**
             * The score for the access frequency of the Hive table.
             */
            public Builder hiveFrequencyScore(Integer hiveFrequencyScore) {
                this.hiveFrequencyScore = hiveFrequencyScore;
                return this;
            }

            /**
             * The overall score of the Hive table.
             */
            public Builder hiveScore(Integer hiveScore) {
                this.hiveScore = hiveScore;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    public static class Formats extends TeaModel {
        @NameInMap("FormatDayGrowthSize")
        private Long formatDayGrowthSize;

        @NameInMap("FormatName")
        private String formatName;

        @NameInMap("FormatRatio")
        private Float formatRatio;

        @NameInMap("FormatSize")
        private Long formatSize;

        @NameInMap("FormatSizeDayGrowthRatio")
        private Float formatSizeDayGrowthRatio;

        @NameInMap("FormatSizeUnit")
        private String formatSizeUnit;

        private Formats(Builder builder) {
            this.formatDayGrowthSize = builder.formatDayGrowthSize;
            this.formatName = builder.formatName;
            this.formatRatio = builder.formatRatio;
            this.formatSize = builder.formatSize;
            this.formatSizeDayGrowthRatio = builder.formatSizeDayGrowthRatio;
            this.formatSizeUnit = builder.formatSizeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Formats create() {
            return builder().build();
        }

        /**
         * @return formatDayGrowthSize
         */
        public Long getFormatDayGrowthSize() {
            return this.formatDayGrowthSize;
        }

        /**
         * @return formatName
         */
        public String getFormatName() {
            return this.formatName;
        }

        /**
         * @return formatRatio
         */
        public Float getFormatRatio() {
            return this.formatRatio;
        }

        /**
         * @return formatSize
         */
        public Long getFormatSize() {
            return this.formatSize;
        }

        /**
         * @return formatSizeDayGrowthRatio
         */
        public Float getFormatSizeDayGrowthRatio() {
            return this.formatSizeDayGrowthRatio;
        }

        /**
         * @return formatSizeUnit
         */
        public String getFormatSizeUnit() {
            return this.formatSizeUnit;
        }

        public static final class Builder {
            private Long formatDayGrowthSize; 
            private String formatName; 
            private Float formatRatio; 
            private Long formatSize; 
            private Float formatSizeDayGrowthRatio; 
            private String formatSizeUnit; 

            /**
             * The daily amount increment of the data in a specific storage format.
             */
            public Builder formatDayGrowthSize(Long formatDayGrowthSize) {
                this.formatDayGrowthSize = formatDayGrowthSize;
                return this;
            }

            /**
             * The name of the storage format.
             */
            public Builder formatName(String formatName) {
                this.formatName = formatName;
                return this;
            }

            /**
             * The ratio of the data in a specific storage format.
             */
            public Builder formatRatio(Float formatRatio) {
                this.formatRatio = formatRatio;
                return this;
            }

            /**
             * The size of storage format-specific data.
             */
            public Builder formatSize(Long formatSize) {
                this.formatSize = formatSize;
                return this;
            }

            /**
             * The day-to-day growth rate of the amount of the data in a specific storage format.
             */
            public Builder formatSizeDayGrowthRatio(Float formatSizeDayGrowthRatio) {
                this.formatSizeDayGrowthRatio = formatSizeDayGrowthRatio;
                return this;
            }

            /**
             * The unit of the data size.
             */
            public Builder formatSizeUnit(String formatSizeUnit) {
                this.formatSizeUnit = formatSizeUnit;
                return this;
            }

            public Formats build() {
                return new Formats(this);
            } 

        } 

    }
    public static class ColdDataDayGrowthSize extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
    public static class PartitionNum extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private PartitionNum(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionNum create() {
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

            public PartitionNum build() {
                return new PartitionNum(this);
            } 

        } 

    }
    public static class SmallFileCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
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
        @NameInMap("ColdDataDayGrowthSize")
        private ColdDataDayGrowthSize coldDataDayGrowthSize;

        @NameInMap("ColdDataRatio")
        private ColdDataRatio coldDataRatio;

        @NameInMap("ColdDataSize")
        private ColdDataSize coldDataSize;

        @NameInMap("ColdDataSizeDayGrowthRatio")
        private ColdDataSizeDayGrowthRatio coldDataSizeDayGrowthRatio;

        @NameInMap("EmptyFileCount")
        private EmptyFileCount emptyFileCount;

        @NameInMap("EmptyFileCountDayGrowthRatio")
        private EmptyFileCountDayGrowthRatio emptyFileCountDayGrowthRatio;

        @NameInMap("EmptyFileDayGrowthCount")
        private EmptyFileDayGrowthCount emptyFileDayGrowthCount;

        @NameInMap("EmptyFileRatio")
        private EmptyFileRatio emptyFileRatio;

        @NameInMap("FreezeDataDayGrowthSize")
        private FreezeDataDayGrowthSize freezeDataDayGrowthSize;

        @NameInMap("FreezeDataRatio")
        private FreezeDataRatio freezeDataRatio;

        @NameInMap("FreezeDataSize")
        private FreezeDataSize freezeDataSize;

        @NameInMap("FreezeDataSizeDayGrowthRatio")
        private FreezeDataSizeDayGrowthRatio freezeDataSizeDayGrowthRatio;

        @NameInMap("HotDataDayGrowthSize")
        private HotDataDayGrowthSize hotDataDayGrowthSize;

        @NameInMap("HotDataRatio")
        private HotDataRatio hotDataRatio;

        @NameInMap("HotDataSize")
        private HotDataSize hotDataSize;

        @NameInMap("HotDataSizeDayGrowthRatio")
        private HotDataSizeDayGrowthRatio hotDataSizeDayGrowthRatio;

        @NameInMap("LargeFileCount")
        private LargeFileCount largeFileCount;

        @NameInMap("LargeFileCountDayGrowthRatio")
        private LargeFileCountDayGrowthRatio largeFileCountDayGrowthRatio;

        @NameInMap("LargeFileDayGrowthCount")
        private LargeFileDayGrowthCount largeFileDayGrowthCount;

        @NameInMap("LargeFileRatio")
        private LargeFileRatio largeFileRatio;

        @NameInMap("MediumFileCount")
        private MediumFileCount mediumFileCount;

        @NameInMap("MediumFileCountDayGrowthRatio")
        private MediumFileCountDayGrowthRatio mediumFileCountDayGrowthRatio;

        @NameInMap("MediumFileDayGrowthCount")
        private MediumFileDayGrowthCount mediumFileDayGrowthCount;

        @NameInMap("MediumFileRatio")
        private MediumFileRatio mediumFileRatio;

        @NameInMap("PartitionNum")
        private PartitionNum partitionNum;

        @NameInMap("SmallFileCount")
        private SmallFileCount smallFileCount;

        @NameInMap("SmallFileCountDayGrowthRatio")
        private SmallFileCountDayGrowthRatio smallFileCountDayGrowthRatio;

        @NameInMap("SmallFileDayGrowthCount")
        private SmallFileDayGrowthCount smallFileDayGrowthCount;

        @NameInMap("SmallFileRatio")
        private SmallFileRatio smallFileRatio;

        @NameInMap("TinyFileCount")
        private TinyFileCount tinyFileCount;

        @NameInMap("TinyFileCountDayGrowthRatio")
        private TinyFileCountDayGrowthRatio tinyFileCountDayGrowthRatio;

        @NameInMap("TinyFileDayGrowthCount")
        private TinyFileDayGrowthCount tinyFileDayGrowthCount;

        @NameInMap("TinyFileRatio")
        private TinyFileRatio tinyFileRatio;

        @NameInMap("TotalDataDayGrowthSize")
        private TotalDataDayGrowthSize totalDataDayGrowthSize;

        @NameInMap("TotalDataSize")
        private TotalDataSize totalDataSize;

        @NameInMap("TotalDataSizeDayGrowthRatio")
        private TotalDataSizeDayGrowthRatio totalDataSizeDayGrowthRatio;

        @NameInMap("TotalFileCount")
        private TotalFileCount totalFileCount;

        @NameInMap("TotalFileCountDayGrowthRatio")
        private TotalFileCountDayGrowthRatio totalFileCountDayGrowthRatio;

        @NameInMap("TotalFileDayGrowthCount")
        private TotalFileDayGrowthCount totalFileDayGrowthCount;

        @NameInMap("WarmDataDayGrowthSize")
        private WarmDataDayGrowthSize warmDataDayGrowthSize;

        @NameInMap("WarmDataRatio")
        private WarmDataRatio warmDataRatio;

        @NameInMap("WarmDataSize")
        private WarmDataSize warmDataSize;

        @NameInMap("WarmDataSizeDayGrowthRatio")
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
            this.partitionNum = builder.partitionNum;
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
         * @return partitionNum
         */
        public PartitionNum getPartitionNum() {
            return this.partitionNum;
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
            private PartitionNum partitionNum; 
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
             * The number of partitions.
             */
            public Builder partitionNum(PartitionNum partitionNum) {
                this.partitionNum = partitionNum;
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
        @NameInMap("Analysis")
        private Analysis analysis;

        @NameInMap("Formats")
        private java.util.List < Formats> formats;

        @NameInMap("Metrics")
        private Metrics metrics;

        @NameInMap("Owner")
        private String owner;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.formats = builder.formats;
            this.metrics = builder.metrics;
            this.owner = builder.owner;
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
         * @return formats
         */
        public java.util.List < Formats> getFormats() {
            return this.formats;
        }

        /**
         * @return metrics
         */
        public Metrics getMetrics() {
            return this.metrics;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        public static final class Builder {
            private Analysis analysis; 
            private java.util.List < Formats> formats; 
            private Metrics metrics; 
            private String owner; 

            /**
             * The analysis results.
             */
            public Builder analysis(Analysis analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * The information from the perspective of formats.
             */
            public Builder formats(java.util.List < Formats> formats) {
                this.formats = formats;
                return this;
            }

            /**
             * The metric information.
             */
            public Builder metrics(Metrics metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * The owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
